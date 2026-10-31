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
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.u30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ns0;
import org.telegram.ui.ra1;
public final class w3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Path D;
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.j H;
    public final t9 I;
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
    public final org.telegram.ui.Components.g9 T;
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int f35342a;
    public boolean f35343a0;
    public final org.telegram.ui.ActionBar.p6 f35344b;
    public boolean f35345b0;
    public final org.telegram.ui.Components.r8 f35346c;
    public boolean f35347c0;
    public final ImageView d;
    public boolean f35348d0;
    public final org.telegram.ui.Components.g9 e;
    public ShapeDrawable f35349e0;
    public final TextView f35350f;
    public final TextView h;
    public final TextView f35351n;
    public final TextView f35352r;
    public final Drawable f35353s;
    public final Drawable f35354w;
    public final na f35355x;
    public final Paint f35356y;

    public w3(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f35346c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f35356y = new Paint(1);
        this.D = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new t9();
        this.f35342a = i10;
        this.f35344b = p6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        addView(g9Var, w7.b6.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, w7.b6.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f35350f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.i0.L(120.0f));
        TextView f7 = z20.f(linearLayout2, textView, w7.b6.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f7;
        f7.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f7.setEllipsize(truncateAt);
        f7.setIncludeFontPadding(false);
        f7.setGravity(16);
        f7.setTextSize(1, 13.0f);
        TextView f10 = z20.f(linearLayout2, f7, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f35351n = f10;
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        linearLayout2.addView(f10, w7.b6.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.b6.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
        this.T = g9Var2;
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(8.0f));
        linearLayout3.addView(g9Var2, w7.b6.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, w7.b6.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        z20.n(textView2, 1, 14.0f);
        TextView f11 = z20.f(linearLayout4, textView2, w7.b6.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = f11;
        f11.setTextSize(1, 14.0f);
        linearLayout4.addView(f11, w7.b6.t(-1, -2, 55, 0, 0, 0, 0));
        na naVar = new na(context);
        this.f35355x = naVar;
        this.f35352r = naVar.f34959a;
        Drawable f12 = i0.a.f(context, 2131232816);
        this.f35353s = f12;
        f12.setBounds(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        Drawable f13 = i0.a.f(context, 2131232832);
        this.f35354w = f13;
        f13.setBounds(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        linearLayout.addView(naVar, w7.b6.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    public static void a(w3 w3Var, ValueAnimator valueAnimator) {
        w3Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(u30 u30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new s3(u30Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.t6.r1(this.F, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f35344b)));
        c();
        setElevation(org.telegram.messenger.i0.L(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        na naVar = this.f35355x;
        naVar.d = f7;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0 && naVar.f34961c == null) {
            a7 a7Var = new a7(40, naVar.getContext(), true);
            naVar.f34961c = a7Var;
            a7Var.setContinuousRotation(300.0f);
            naVar.addView(naVar.f34961c, w7.b6.c(40.0f, 40));
        }
        a7 a7Var2 = naVar.f34961c;
        if (a7Var2 != null && i10 == 0) {
            a7Var2.setPaused(true);
            naVar.removeView(naVar.f34961c);
            naVar.f34961c = null;
        }
        naVar.a();
        naVar.requestLayout();
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20872a7));
    }

    public final void b(boolean z10, float f7) {
        TL_wallet.walletTransaction wallettransaction;
        a7 pendingDiamond;
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
                        RectF a2 = fa.a(pendingDiamond, this);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        t9 t9Var = this.I;
                        t9Var.getClass();
                        float f11 = org.telegram.messenger.i0.f16025p;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e = t9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e7 = t9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                if (t9Var.f35254b.nextBoolean()) {
                                    i10 = 1;
                                } else {
                                    i10 = -1;
                                }
                                e = (t9Var.e(0.5f, 1.4f) * i10) + 3.1415927f;
                                e7 = t9Var.e(60.0f, 240.0f);
                            } else {
                                e = t9Var.e(0.0f, 6.2831855f);
                                e7 = t9Var.e(40.0f, 160.0f);
                            }
                            t9Var.a(centerX, centerY, e, e7 * f11, t9Var.e(2.2f, 6.5f) * f11, t9Var.e(0.8f, 1.4f), 2.4f);
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
                    this.K.addUpdateListener(new r3(this, 0));
                    this.K.addListener(new ns0(this, 15));
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
        setTranslationY(org.telegram.messenger.i0.L(4.0f) * this.G);
        float f10 = this.G;
        na naVar = this.f35355x;
        naVar.e = f10;
        naVar.a();
    }

    public final void d() {
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.d();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a7 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = fa.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a2.centerX(), a2.centerY(), 1.5f);
        }
        t9 t9Var = this.I;
        t9Var.c(canvas);
        if (t9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.J;
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.ActionBar.p6 p6Var = this.f35344b;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            Paint paint = this.f35356y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var));
            float f10 = 255.0f * f7;
            paint.setAlpha(Math.round(f10));
            canvas.drawCircle(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), org.telegram.messenger.i0.L(8.0f) * f7, paint);
            paint.setColor(w02);
            paint.setAlpha(Math.round(f10));
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), org.telegram.messenger.i0.L(7.0f) * f7, paint);
            e(canvas, ((float) (uptimeMillis % 1000)) * 0.36f, org.telegram.messenger.i0.L(4.6f) * f7);
            e(canvas, (((float) (uptimeMillis % 6000)) * 0.06f) + 120.0f, org.telegram.messenger.i0.L(3.2f) * f7);
            float f11 = ((float) (uptimeMillis % 1600)) / 1600.0f;
            float width = getWidth() * 0.5f;
            float width2 = (((width * 2.0f) + getWidth()) * f11) + (-width);
            float f12 = width / 2.0f;
            float f13 = width2 - f12;
            float f14 = width2 + f12;
            int i11 = 16777215 & w02;
            paint.setShader(new LinearGradient(f13, 0.0f, f14, 0.0f, new int[]{i11, w02, -7346433, i11}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f7 * 150.0f * ((float) Math.sin(f11 * 3.141592653589793d))));
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
            canvas.drawRoundRect(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), getWidth() - org.telegram.messenger.i0.L(1.0f), getHeight() - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
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
            Path path = this.D;
            path.rewind();
            path.addCircle(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), org.telegram.messenger.i0.L(10.0f) * this.F, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), (((float) Math.cos(radians)) * f10) + org.telegram.messenger.i0.L(52.0f), (((float) Math.sin(radians)) * f10) + org.telegram.messenger.i0.L(51.0f), this.f35356y);
    }

    public final void f(boolean z10) {
        float f7;
        this.O = z10;
        na naVar = this.f35355x;
        naVar.f34962f = z10;
        naVar.a();
        if (!this.N && !z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(!z10, f7);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, v3 v3Var, boolean z10) {
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
        int L;
        int L2;
        int i14;
        int i15;
        int i16;
        String Q;
        float f7;
        int i17;
        TLRPC.WebDocument webDocument;
        String a11;
        int i18 = u3.f35269b;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction)) {
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
            this.I.f35253a.clear();
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
        this.f35345b0 = z14;
        this.f35347c0 = z18;
        boolean z19 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.g9 g9Var = this.e;
        TextView textView2 = this.f35350f;
        if (z19) {
            g9Var.setVisibility(8);
            setIconColor(u30.f30800x);
            imageView.setImageResource(2131232840);
            textView2.setText(cd.L0(2131743107, null));
            if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                a11 = cd.L0(2131742999, null);
            } else {
                a11 = v3Var.a(wallettransaction.peer.address);
            }
            textView.setText(a11);
            z15 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i19 = this.f35342a;
            u30 u30Var = u30.f30796n;
            z15 = true;
            org.telegram.ui.Components.r8 r8Var = this.f35346c;
            u30 u30Var2 = u30.f30794c;
            if (z20) {
                TLRPC.User Z1 = vp.r1(i19).Z1(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (Z1 != null) {
                    g9Var.setVisibility(0);
                    r8Var.r(Z1);
                    g9Var.e(Z1, r8Var);
                    textView2.setText(h20.p(Z1));
                } else {
                    g9Var.setVisibility(8);
                    if (!this.f35347c0) {
                        u30Var2 = u30Var;
                    }
                    setIconColor(u30Var2);
                    if (this.f35347c0) {
                        i13 = 2131232839;
                    } else {
                        i13 = 2131232841;
                    }
                    imageView.setImageResource(i13);
                    textView2.setText(v3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat L0 = vp.r1(i19).L0(Long.valueOf(wallettransaction.peer.channel_id));
                if (L0 != null) {
                    g9Var.setVisibility(0);
                    r8Var.q(L0);
                    g9Var.e(L0, r8Var);
                    textView2.setText(L0.title);
                } else {
                    g9Var.setVisibility(8);
                    if (!this.f35347c0) {
                        u30Var2 = u30Var;
                    }
                    setIconColor(u30Var2);
                    if (this.f35347c0) {
                        i12 = 2131232839;
                    } else {
                        i12 = 2131232841;
                    }
                    imageView.setImageResource(i12);
                    if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                        a10 = wallettransaction.peer.domain;
                    } else {
                        a10 = v3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a10);
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                g9Var.setVisibility(8);
                if (this.f35347c0) {
                    u30Var2 = u30Var;
                }
                setIconColor(u30Var2);
                if (this.f35347c0) {
                    i11 = 2131232839;
                } else {
                    i11 = 2131232841;
                }
                imageView.setImageResource(i11);
                textView2.setText(cd.L0(2131743011, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                g9Var.setVisibility(8);
                setIconColor(u30Var2);
                if (!"walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) && !"wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(2131232842);
                    textView2.setText(cd.L0(2131743010, null));
                } else {
                    imageView.setImageResource(2131232843);
                    textView2.setText(cd.L0(2131743009, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                g9Var.setVisibility(8);
                if (!this.f35347c0) {
                    u30Var2 = u30Var;
                }
                setIconColor(u30Var2);
                if (this.f35347c0) {
                    i10 = 2131232839;
                } else {
                    i10 = 2131232841;
                }
                imageView.setImageResource(i10);
                if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(wallettransaction.peer.domain);
                } else {
                    if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                        a2 = cd.L0(2131742999, null);
                    } else {
                        a2 = v3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a2);
                }
            }
        }
        String str = wallettransaction.peer.address;
        if (str != null && TextUtils.equals(textView2.getText(), v3Var.a(str)) && textView2.length() > 9) {
            z16 = z15;
        } else {
            z16 = false;
        }
        this.f35348d0 = z16;
        textView2.setSingleLine(!z16);
        if (this.f35348d0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f35348d0) {
            L = Integer.MAX_VALUE;
        } else {
            L = org.telegram.messenger.i0.L(120.0f);
        }
        textView2.setMaxWidth(L);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f35348d0) {
            L2 = -2;
        } else {
            L2 = org.telegram.messenger.i0.L(18.0f);
        }
        layoutParams.height = L2;
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(cd.L0(2131743148, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    if (this.f35347c0) {
                        i16 = 2131743101;
                    } else {
                        i16 = 2131743100;
                    }
                    textView.setText(cd.L0(i16, null));
                } else if (wallettransaction.nft != null) {
                    if (this.f35347c0) {
                        i15 = 2131743111;
                    } else {
                        i15 = 2131743082;
                    }
                    textView.setText(cd.L0(i15, null));
                } else {
                    if (this.f35347c0) {
                        i14 = 2131743112;
                    } else {
                        i14 = 2131743083;
                    }
                    textView.setText(cd.L0(i14, null));
                }
            }
        }
        boolean z21 = wallettransaction.pending;
        TextView textView3 = this.f35351n;
        if (z21) {
            textView3.setText(th.u7.a(textView3, cd.L0(2131743040, null)));
        } else {
            int i20 = wallettransaction.date;
            if (i20 == 0) {
                Q = "";
            } else {
                Q = cd.Q(i20);
            }
            textView3.setText(Q);
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.g9 g9Var2 = this.T;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35344b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i21 = org.telegram.ui.ActionBar.t6.f21311y6;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i21, p6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(2131232833).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.a7.y(this, drawable, i21, p6Var, PorterDuff.Mode.SRC_IN);
            this.f35349e0 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(8.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.1f, i21);
            ra1 ra1Var = new ra1(z15 ? 1 : 0);
            ra1 ra1Var2 = new ra1(2);
            int i22 = L3.f21452a;
            float f10 = L3.d;
            org.telegram.ui.ActionBar.p6 p6Var2 = this.f35344b;
            int Q2 = org.telegram.ui.ActionBar.a7.Q(i22, -1, 2, f10, p6Var2);
            ra1Var2.d(Q2, this);
            org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(100, this);
            x10.c(i22, -1, 2, f10, p6Var2);
            x10.f21396n = ra1Var;
            x10.f21397o = ra1Var2;
            x10.f21395m = false;
            x10.f21390g = Q2;
            eq eqVar = new eq(this.f35349e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                g9Var2.j(ic.p(b30.c(webDocument2)), "46_46", eqVar, wallettransaction.nft);
            } else {
                g9Var2.setImageDrawable(eqVar);
            }
            this.V.setText(wallettransaction.nft.name);
            if (wallettransaction.nft.isPhoneNumber()) {
                i17 = 2131743199;
            } else if (wallettransaction.nft.isUsername()) {
                i17 = 2131743197;
            } else if (wallettransaction.nft.isGift()) {
                i17 = 2131743201;
            } else {
                i17 = 2131743202;
            }
            this.W.setText(cd.L0(i17, null));
        } else {
            linearLayout.setVisibility(8);
            g9Var2.b();
        }
        int i23 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable2 = this.f35353s;
        Drawable drawable3 = this.f35354w;
        TextView textView4 = this.f35352r;
        if (i23 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.f35347c0) {
                org.telegram.ui.ActionBar.a7.y(this, drawable3, org.telegram.ui.ActionBar.t6.ik, p6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(cd.L0(2131743113, null));
            } else {
                org.telegram.ui.ActionBar.a7.y(this, drawable3, org.telegram.ui.ActionBar.t6.f21330z6, p6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(cd.L0(2131743084, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z22 = this.f35347c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q6 = k0.q(k0.o(abs, false), 0.78571427f);
            int i24 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i24 != 0 && z22) {
                q6.insert(0, (CharSequence) "+");
            } else if (i24 != 0 && !z22) {
                q6.insert(0, (CharSequence) "–");
            }
            textView4.setText(q6);
        }
        int visibility = textView4.getVisibility();
        na naVar = this.f35355x;
        naVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = naVar.f34959a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        naVar.f34960b.setImageDrawable(drawable2);
        naVar.f34962f = this.O;
        naVar.a();
        if (!this.N && !this.O) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(z11, f7);
        this.f35343a0 = z10;
        updateColors();
        invalidate();
    }

    public a7 getPendingDiamond() {
        return this.f35355x.f34961c;
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
        b(true, f7);
    }

    @Override
    public final void onDetachedFromWindow() {
        d();
        this.I.f35253a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        na naVar = this.f35355x;
        naVar.f34962f = false;
        naVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.f35343a0 && this.F < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f35356y;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.t6.f21052k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.t6.f21052k0.getAlpha()));
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(71.0f);
            }
            float f7 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(71.0f);
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

    @Override
    public final void updateColors() {
        int w02;
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35344b;
        this.E.setColor(org.telegram.ui.ActionBar.t6.r1(this.F, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        this.f35350f.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        int i12 = org.telegram.ui.ActionBar.t6.f21330z6;
        this.f35351n.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        if (this.f35345b0 && !this.N) {
            w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        } else if (this.f35347c0) {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, p6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        }
        this.f35355x.f34959a.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, p6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(10.0f), w03));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
    }
}
