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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g71;
import org.telegram.ui.t70;
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public r1.g I;
    public final r9 J;
    public long K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public TL_wallet.walletTransaction S;
    public final LinearLayout T;
    public final org.telegram.ui.Components.i9 U;
    public Drawable V;
    public final TextView W;
    public final int f44586a;
    public final TextView f44587a0;
    public final org.telegram.ui.ActionBar.e6 f44588b;
    public boolean f44589b0;
    public final org.telegram.ui.Components.t8 f44590c;
    public boolean f44591c0;
    public final ImageView d;
    public boolean f44592d0;
    public final org.telegram.ui.Components.i9 f44593e;
    public boolean f44594e0;
    public final TextView f44595f;
    public ShapeDrawable f44596f0;
    public final TextView h;
    public final TextView f44597n;
    public final TextView f44598r;
    public final Drawable f44599s;
    public final Drawable f44600w;
    public final la f44601x;
    public final Paint f44602y;

    public v3(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f44590c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f44602y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new r9();
        this.f44586a = i7;
        this.f44588b = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f44593e = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(i9Var, c8.ja.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, c8.ja.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f44595f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = i20.f(linearLayout2, textView, c8.ja.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = i20.f(linearLayout2, f10, c8.ja.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f44597n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, c8.ja.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, c8.ja.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
        this.U = i9Var2;
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(i9Var2, c8.ja.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, c8.ja.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        i20.o(textView2, 1, 14.0f);
        TextView f12 = i20.f(linearLayout4, textView2, c8.ja.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f44587a0 = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, c8.ja.t(-1, -2, 55, 0, 0, 0, 0));
        la laVar = new la(context);
        this.f44601x = laVar;
        this.f44598r = laVar.f44134a;
        Drawable g10 = i5.c.g(context, 2131232819);
        this.f44599s = g10;
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable g11 = i5.c.g(context, 2131232835);
        this.f44600w = g11;
        g11.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(laVar, c8.ja.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    public static void a(v3 v3Var, ValueAnimator valueAnimator) {
        v3Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(f30 f30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new r3(f30Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f10) {
        this.G = f10;
        this.F.setColor(org.telegram.ui.ActionBar.j6.r1(this.G, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f44588b)));
        c();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f10 = 0.0f;
        }
        la laVar = this.f44601x;
        laVar.d = f10;
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 > 0 && laVar.f44136c == null) {
            w6 w6Var = new w6(40, laVar.getContext(), true);
            laVar.f44136c = w6Var;
            w6Var.setContinuousRotation(300.0f);
            laVar.addView(laVar.f44136c, c8.ja.c(40.0f, 40));
        }
        w6 w6Var2 = laVar.f44136c;
        if (w6Var2 != null && i7 == 0) {
            w6Var2.setPaused(true);
            laVar.removeView(laVar.f44136c);
            laVar.f44136c = null;
        }
        laVar.a();
        laVar.requestLayout();
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
    }

    public final void b(boolean z10, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        w6 pendingDiamond;
        boolean z11;
        float e10;
        float e11;
        int i7;
        if (!z10 || this.L == null || this.M != f10) {
            this.M = f10;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            if (z10 && f10 == 0.0f && this.G > 0.0f && !isAttachedToWindow()) {
                return;
            }
            if (z10) {
                float f11 = this.G;
                if (f11 != f10) {
                    if (f10 == 0.0f && f11 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a10 = da.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        r9 r9Var = this.J;
                        r9Var.getClass();
                        float f12 = org.telegram.messenger.g0.f23610p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = r9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = r9Var.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                if (r9Var.f44459b.nextBoolean()) {
                                    i7 = 1;
                                } else {
                                    i7 = -1;
                                }
                                e10 = (r9Var.e(0.5f, 1.4f) * i7) + 3.1415927f;
                                e11 = r9Var.e(60.0f, 240.0f);
                            } else {
                                e10 = r9Var.e(0.0f, 6.2831855f);
                                e11 = r9Var.e(40.0f, 160.0f);
                            }
                            r9Var.a(centerX, centerY, e10, e11 * f12, r9Var.e(2.2f, 6.5f) * f12, r9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        if (!this.Q && this.N) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.R = z11;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new q3(this, 0));
                    this.L.addListener(new g71(this, 5));
                    this.L.start();
                    return;
                }
            }
            setPendingProgress(f10);
        }
    }

    public final void c() {
        float f10 = (this.G * 0.035f) + 1.0f;
        setScaleX(((this.H * 0.012f) + 1.0f) * f10);
        setScaleY((1.0f - (this.H * 0.04f)) * f10);
        setTranslationY(org.telegram.messenger.g0.L(4.0f) * this.H);
        float f11 = this.H;
        la laVar = this.f44601x;
        laVar.f44137e = f11;
        laVar.a();
    }

    public final void d() {
        r1.g gVar = this.I;
        if (gVar != null) {
            gVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        c();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a10 = da.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        r9 r9Var = this.J;
        r9Var.c(canvas);
        if (r9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.G;
        if (f10 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.K;
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.ActionBar.e6 e6Var = this.f44588b;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            Paint paint = this.f44602y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
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
            float f13 = org.telegram.ui.Cells.y0.f(width, 2.0f, getWidth(), f12, -width);
            float f14 = width / 2.0f;
            float f15 = f13 - f14;
            float f16 = f13 + f14;
            int i10 = 16777215 & w02;
            paint.setShader(new LinearGradient(f15, 0.0f, f16, 0.0f, new int[]{i10, w02, -7346433, i10}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
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
        if (this.G > 0.0f && (view == this.f44593e || view == this.d)) {
            int save = canvas.save();
            Path path = this.E;
            path.rewind();
            path.addCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(10.0f) * this.G, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.f44602y);
    }

    public final void f(boolean z10) {
        float f10;
        this.P = z10;
        la laVar = this.f44601x;
        laVar.f44138f = z10;
        laVar.a();
        if (!this.O && !z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        b(!z10, f10);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, u3 u3Var, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i7;
        String a10;
        int i10;
        int i11;
        String a11;
        int i12;
        boolean z16;
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
        int i17 = t3.f44512b;
        TL_wallet.walletTransaction wallettransaction2 = this.S;
        if (wallettransaction2 != null && t3.i(wallettransaction2, wallettransaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.P = false;
            this.Q = false;
            this.R = false;
            this.K = SystemClock.uptimeMillis();
            d();
            this.J.f44458a.clear();
        }
        this.S = wallettransaction;
        boolean z17 = wallettransaction.pending;
        if (z17 && !wallettransaction.failed) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.O = z12;
        boolean z18 = wallettransaction.incoming;
        if (!z18 && !wallettransaction.key_change && wallettransaction.nft == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.N = z13;
        if (!z17 && !wallettransaction.failed) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.f44591c0 = z14;
        this.f44592d0 = z18;
        boolean z19 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.i9 i9Var = this.f44593e;
        TextView textView2 = this.f44595f;
        if (z19) {
            i9Var.setVisibility(8);
            setIconColor(f30.f34498x);
            imageView.setImageResource(2131232843);
            textView2.setText(hd.M0(2131743081, null));
            if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                a12 = hd.M0(2131742973, null);
            } else {
                a12 = u3Var.a(wallettransaction.peer.address);
            }
            textView.setText(a12);
            z15 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i18 = this.f44586a;
            f30 f30Var = f30.f34494n;
            z15 = true;
            org.telegram.ui.Components.t8 t8Var = this.f44590c;
            f30 f30Var2 = f30.f34491c;
            if (z20) {
                TLRPC.User a22 = np.s1(i18).a2(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (a22 != null) {
                    i9Var.setVisibility(0);
                    t8Var.r(a22);
                    i9Var.f(a22, t8Var);
                    textView2.setText(q10.p(a22));
                } else {
                    i9Var.setVisibility(8);
                    if (!this.f44592d0) {
                        f30Var2 = f30Var;
                    }
                    setIconColor(f30Var2);
                    if (this.f44592d0) {
                        i12 = 2131232842;
                    } else {
                        i12 = 2131232844;
                    }
                    imageView.setImageResource(i12);
                    textView2.setText(u3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat M0 = np.s1(i18).M0(Long.valueOf(wallettransaction.peer.channel_id));
                if (M0 != null) {
                    i9Var.setVisibility(0);
                    t8Var.q(M0);
                    i9Var.f(M0, t8Var);
                    textView2.setText(M0.title);
                } else {
                    i9Var.setVisibility(8);
                    if (!this.f44592d0) {
                        f30Var2 = f30Var;
                    }
                    setIconColor(f30Var2);
                    if (this.f44592d0) {
                        i11 = 2131232842;
                    } else {
                        i11 = 2131232844;
                    }
                    imageView.setImageResource(i11);
                    if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                        a11 = wallettransaction.peer.domain;
                    } else {
                        a11 = u3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a11);
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                i9Var.setVisibility(8);
                if (this.f44592d0) {
                    f30Var2 = f30Var;
                }
                setIconColor(f30Var2);
                if (this.f44592d0) {
                    i10 = 2131232842;
                } else {
                    i10 = 2131232844;
                }
                imageView.setImageResource(i10);
                textView2.setText(hd.M0(2131742985, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                i9Var.setVisibility(8);
                setIconColor(f30Var2);
                if (!"walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) && !"wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(2131232845);
                    textView2.setText(hd.M0(2131742984, null));
                } else {
                    imageView.setImageResource(2131232846);
                    textView2.setText(hd.M0(2131742983, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                i9Var.setVisibility(8);
                if (!this.f44592d0) {
                    f30Var2 = f30Var;
                }
                setIconColor(f30Var2);
                if (this.f44592d0) {
                    i7 = 2131232842;
                } else {
                    i7 = 2131232844;
                }
                imageView.setImageResource(i7);
                if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(wallettransaction.peer.domain);
                } else {
                    if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                        a10 = hd.M0(2131742973, null);
                    } else {
                        a10 = u3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a10);
                }
            }
        }
        String str = wallettransaction.peer.address;
        if (str != null && TextUtils.equals(textView2.getText(), u3Var.a(str)) && textView2.length() > 9) {
            z16 = z15;
        } else {
            z16 = false;
        }
        this.f44594e0 = z16;
        textView2.setSingleLine(!z16);
        if (this.f44594e0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f44594e0) {
            L = Integer.MAX_VALUE;
        } else {
            L = org.telegram.messenger.g0.L(120.0f);
        }
        textView2.setMaxWidth(L);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f44594e0) {
            L2 = -2;
        } else {
            L2 = org.telegram.messenger.g0.L(18.0f);
        }
        layoutParams.height = L2;
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(hd.M0(2131743122, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    if (this.f44592d0) {
                        i15 = 2131743075;
                    } else {
                        i15 = 2131743074;
                    }
                    textView.setText(hd.M0(i15, null));
                } else if (wallettransaction.nft != null) {
                    if (this.f44592d0) {
                        i14 = 2131743085;
                    } else {
                        i14 = 2131743056;
                    }
                    textView.setText(hd.M0(i14, null));
                } else {
                    if (this.f44592d0) {
                        i13 = 2131743086;
                    } else {
                        i13 = 2131743057;
                    }
                    textView.setText(hd.M0(i13, null));
                }
            }
        }
        boolean z21 = wallettransaction.pending;
        TextView textView3 = this.f44597n;
        if (z21) {
            textView3.setText(fi.o9.a(textView3, hd.M0(2131743014, null)));
        } else {
            int i19 = wallettransaction.date;
            if (i19 == 0) {
                Q = "";
            } else {
                Q = hd.Q(i19);
            }
            textView3.setText(Q);
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.T;
        org.telegram.ui.Components.i9 i9Var2 = this.U;
        org.telegram.ui.ActionBar.e6 e6Var = this.f44588b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i20 = org.telegram.ui.ActionBar.j6.f29241y6;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i20, e6Var);
            if (this.V == null) {
                this.V = getContext().getResources().getDrawable(2131232836).mutate();
            }
            Drawable drawable = this.V;
            org.telegram.ui.ActionBar.q6.x(this, drawable, i20, e6Var, PorterDuff.Mode.SRC_IN);
            this.f44596f0 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i20);
            t70 t70Var = new t70(17);
            t70 t70Var2 = new t70(18);
            int i21 = K.f29392a;
            float f11 = K.d;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.f44588b;
            int P = org.telegram.ui.ActionBar.q6.P(i21, -1, 2, f11, e6Var2);
            t70Var2.f(P, this);
            org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(100, this);
            w10.c(i21, -1, 2, f11, e6Var2);
            w10.f29354n = t70Var;
            w10.f29355o = t70Var2;
            w10.f29353m = false;
            w10.f29348g = P;
            fq fqVar = new fq(this.f44596f0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                i9Var2.j(gc.p(k20.c(webDocument2)), "46_46", fqVar, wallettransaction.nft);
            } else {
                i9Var2.setImageDrawable(fqVar);
            }
            this.W.setText(wallettransaction.nft.name);
            if (wallettransaction.nft.isPhoneNumber()) {
                i16 = 2131743173;
            } else if (wallettransaction.nft.isUsername()) {
                i16 = 2131743171;
            } else if (wallettransaction.nft.isGift()) {
                i16 = 2131743175;
            } else {
                i16 = 2131743176;
            }
            this.f44587a0.setText(hd.M0(i16, null));
        } else {
            linearLayout.setVisibility(8);
            i9Var2.b();
        }
        int i22 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable2 = this.f44599s;
        Drawable drawable3 = this.f44600w;
        TextView textView4 = this.f44598r;
        if (i22 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.f44592d0) {
                org.telegram.ui.ActionBar.q6.x(this, drawable3, org.telegram.ui.ActionBar.j6.lk, e6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(hd.M0(2131743087, null));
            } else {
                org.telegram.ui.ActionBar.q6.x(this, drawable3, org.telegram.ui.ActionBar.j6.f29260z6, e6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(hd.M0(2131743058, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z22 = this.f44592d0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q10 = l0.q(l0.o(abs, false), 0.78571427f);
            int i23 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i23 != 0 && z22) {
                q10.insert(0, (CharSequence) "+");
            } else if (i23 != 0 && !z22) {
                q10.insert(0, (CharSequence) "–");
            }
            textView4.setText(q10);
        }
        int visibility = textView4.getVisibility();
        la laVar = this.f44601x;
        laVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = laVar.f44134a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        laVar.f44135b.setImageDrawable(drawable2);
        laVar.f44138f = this.P;
        laVar.a();
        if (!this.O && !this.P) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        b(z11, f10);
        this.f44589b0 = z10;
        updateColors();
        invalidate();
    }

    public w6 getPendingDiamond() {
        return this.f44601x.f44136c;
    }

    @Override
    public final void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        if (!this.O && !this.P) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        b(true, f10);
    }

    @Override
    public final void onDetachedFromWindow() {
        d();
        this.J.f44458a.clear();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        this.P = false;
        la laVar = this.f44601x;
        laVar.f44138f = false;
        laVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f44589b0 && this.G < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f44602y;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.j6.f28972k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.G) * org.telegram.ui.ActionBar.j6.f28972k0.getAlpha()));
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (hd.f24104a0) {
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
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f44588b;
        this.F.setColor(org.telegram.ui.ActionBar.j6.r1(this.G, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f44595f.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.j6.f29260z6;
        this.f44597n.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        if (this.f44591c0 && !this.O) {
            w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        } else if (this.f44592d0) {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, e6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        }
        this.f44601x.f44134a.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), w03));
        }
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.f44587a0.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
    }
}
