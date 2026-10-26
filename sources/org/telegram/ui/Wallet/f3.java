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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.x40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
public final class f3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.j H;
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
    public final org.telegram.ui.Components.y9 T;
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int f36552a;
    public boolean f36553a0;
    public final org.telegram.ui.ActionBar.u6 f36554b;
    public boolean f36555b0;
    public final org.telegram.ui.Components.j9 f36556c;
    public boolean f36557c0;
    public final ImageView d;
    public boolean f36558d0;
    public final org.telegram.ui.Components.y9 e;
    public ShapeDrawable f36559e0;
    public final TextView f36560f;
    public final TextView h;
    public final TextView f36561n;
    public final TextView f36562r;
    public final Drawable f36563s;
    public final Drawable v;
    public final da f36564w;
    public final Paint f36565x;
    public final Path f36566y;

    public f3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f36556c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f36565x = new Paint(1);
        this.f36566y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new k9();
        this.f36552a = i10;
        this.f36554b = u6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, gb1.h(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, gb1.h(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, gb1.h(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, gb1.p(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f36560f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView e = vh.e(linearLayout2, textView, gb1.o(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = e;
        e.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        e.setEllipsize(truncateAt);
        e.setIncludeFontPadding(false);
        e.setGravity(16);
        e.setTextSize(1, 13.0f);
        TextView e10 = vh.e(linearLayout2, e, gb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f36561n = e10;
        e10.setSingleLine(true);
        e10.setEllipsize(truncateAt);
        e10.setIncludeFontPadding(false);
        e10.setGravity(16);
        e10.setTextSize(1, 13.0f);
        linearLayout2.addView(e10, gb1.o(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, gb1.o(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        this.T = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout3.addView(y9Var2, gb1.x(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, gb1.t(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        vh.j(14.0f, 1, textView2);
        TextView e11 = vh.e(linearLayout4, textView2, gb1.x(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = e11;
        e11.setTextSize(1, 14.0f);
        linearLayout4.addView(e11, gb1.x(-1, -2, 55, 0, 0, 0, 0));
        da daVar = new da(context);
        this.f36564w = daVar;
        this.f36562r = daVar.f36493a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.f36563s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(daVar, gb1.t(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    public static void a(f3 f3Var, ValueAnimator valueAnimator) {
        f3Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(x40 x40Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new b3(x40Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.y6.o1(this.F, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, this.f36554b)));
        c();
        setElevation(AndroidUtilities.dp(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        da daVar = this.f36564w;
        daVar.d = f7;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0 && daVar.f36495c == null) {
            l6 l6Var = new l6(40, daVar.getContext(), true);
            daVar.f36495c = l6Var;
            l6Var.setContinuousRotation(300.0f);
            daVar.addView(daVar.f36495c, gb1.g(40.0f, 40));
        }
        l6 l6Var2 = daVar.f36495c;
        if (l6Var2 != null && i10 == 0) {
            l6Var2.setPaused(true);
            daVar.removeView(daVar.f36495c);
            daVar.f36495c = null;
        }
        daVar.a();
        daVar.requestLayout();
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23299a7));
    }

    public final void b(float f7, boolean z10) {
        TL_wallet.walletTransaction wallettransaction;
        l6 pendingDiamond;
        boolean z11;
        float e;
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
                                e10 = k9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                if (k9Var.f36802b.nextBoolean()) {
                                    i10 = 1;
                                } else {
                                    i10 = -1;
                                }
                                e = (k9Var.e(0.5f, 1.4f) * i10) + 3.1415927f;
                                e10 = k9Var.e(60.0f, 240.0f);
                            } else {
                                e = k9Var.e(0.0f, 6.2831855f);
                                e10 = k9Var.e(40.0f, 160.0f);
                            }
                            k9Var.a(centerX, centerY, e, e10 * f11, k9Var.e(2.2f, 6.5f) * f11, k9Var.e(0.8f, 1.4f), 2.4f);
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
                    this.K.addUpdateListener(new a3(this, 0));
                    this.K.addListener(new fc1(this, 5));
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
        da daVar = this.f36564w;
        daVar.e = f10;
        daVar.a();
    }

    public final void d() {
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.c();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l6 pendingDiamond;
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
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            org.telegram.ui.ActionBar.u6 u6Var = this.f36554b;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            Paint paint = this.f36565x;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, u6Var));
            float f10 = 255.0f * f7;
            paint.setAlpha(Math.round(f10));
            canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(8.0f) * f7, paint);
            paint.setColor(w02);
            paint.setAlpha(Math.round(f10));
            paint.setStrokeWidth(AndroidUtilities.dp(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(7.0f) * f7, paint);
            e(canvas, ((float) (uptimeMillis % 1000)) * 0.36f, AndroidUtilities.dp(4.6f) * f7);
            e(canvas, (((float) (uptimeMillis % 6000)) * 0.06f) + 120.0f, AndroidUtilities.dp(3.2f) * f7);
            float f11 = ((float) (uptimeMillis % 1600)) / 1600.0f;
            float width = getWidth() * 0.5f;
            float e = org.telegram.ui.d3.e(width, 2.0f, getWidth(), f11, -width);
            float f12 = width / 2.0f;
            float f13 = e - f12;
            float f14 = e + f12;
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
            Path path = this.f36566y;
            path.rewind();
            path.addCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(10.0f) * this.F, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.f36565x);
    }

    public final void f(boolean z10) {
        float f7;
        this.O = z10;
        da daVar = this.f36564w;
        daVar.f36496f = z10;
        daVar.a();
        if (!this.N && !z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, !z10);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, e3 e3Var, boolean z10) {
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
        int i18 = d3.f36458a;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        if (wallettransaction2 != null && d3.a(wallettransaction2, wallettransaction)) {
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
            this.I.f36801a.clear();
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
        this.f36555b0 = z14;
        this.f36557c0 = z18;
        boolean z19 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.y9 y9Var = this.e;
        TextView textView2 = this.f36560f;
        if (z19) {
            y9Var.setVisibility(8);
            setIconColor(x40.f34619w);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                a11 = LocaleController.getString(R.string.WalletUnknown);
            } else {
                a11 = e3Var.a(wallettransaction.peer.address);
            }
            textView.setText(a11);
            z15 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i19 = this.f36552a;
            x40 x40Var = x40.f34616n;
            org.telegram.ui.Components.j9 j9Var = this.f36556c;
            z15 = true;
            x40 x40Var2 = x40.f34614c;
            if (z20) {
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    y9Var.setVisibility(0);
                    j9Var.r(user);
                    y9Var.f(user, j9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    y9Var.setVisibility(8);
                    if (this.f36557c0) {
                        x40Var = x40Var2;
                    }
                    setIconColor(x40Var);
                    if (this.f36557c0) {
                        i13 = R.drawable.wallet_transaction_in;
                    } else {
                        i13 = R.drawable.wallet_transaction_out;
                    }
                    imageView.setImageResource(i13);
                    textView2.setText(e3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(wallettransaction.peer.channel_id));
                if (chat != null) {
                    y9Var.setVisibility(0);
                    j9Var.k(i19, chat);
                    y9Var.f(chat, j9Var);
                    textView2.setText(chat.title);
                } else {
                    y9Var.setVisibility(8);
                    if (this.f36557c0) {
                        x40Var = x40Var2;
                    }
                    setIconColor(x40Var);
                    if (this.f36557c0) {
                        i12 = R.drawable.wallet_transaction_in;
                    } else {
                        i12 = R.drawable.wallet_transaction_out;
                    }
                    imageView.setImageResource(i12);
                    if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                        a10 = wallettransaction.peer.domain;
                    } else {
                        a10 = e3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a10);
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                y9Var.setVisibility(8);
                if (!this.f36557c0) {
                    x40Var = x40Var2;
                }
                setIconColor(x40Var);
                if (this.f36557c0) {
                    i11 = R.drawable.wallet_transaction_in;
                } else {
                    i11 = R.drawable.wallet_transaction_out;
                }
                imageView.setImageResource(i11);
                textView2.setText(LocaleController.getString(R.string.WalletTransactionTelegram));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                y9Var.setVisibility(8);
                setIconColor(x40Var2);
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
                if (this.f36557c0) {
                    x40Var = x40Var2;
                }
                setIconColor(x40Var);
                if (this.f36557c0) {
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
                        a2 = e3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a2);
                }
            }
        }
        String str = wallettransaction.peer.address;
        if (str != null && TextUtils.equals(textView2.getText(), e3Var.a(str)) && textView2.length() > 9) {
            z16 = z15;
        } else {
            z16 = false;
        }
        this.f36558d0 = z16;
        textView2.setSingleLine(!z16);
        if (this.f36558d0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f36558d0) {
            dp = Integer.MAX_VALUE;
        } else {
            dp = AndroidUtilities.dp(120.0f);
        }
        textView2.setMaxWidth(dp);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f36558d0) {
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
                    if (this.f36557c0) {
                        i16 = R.string.WalletMovedFromProfile;
                    } else {
                        i16 = R.string.WalletMovedToProfile;
                    }
                    textView.setText(LocaleController.getString(i16));
                } else if (wallettransaction.nft != null) {
                    if (this.f36557c0) {
                        i15 = R.string.WalletIncomingTransferNft;
                    } else {
                        i15 = R.string.WalletOutgoingTransferNft;
                    }
                    textView.setText(LocaleController.getString(i15));
                } else {
                    if (this.f36557c0) {
                        i14 = R.string.WalletIncomingTransfer;
                    } else {
                        i14 = R.string.WalletOutgoingTransfer;
                    }
                    textView.setText(LocaleController.getString(i14));
                }
            }
        }
        boolean z21 = wallettransaction.pending;
        TextView textView3 = this.f36561n;
        if (z21) {
            textView3.setText(di.ea.a(textView3, LocaleController.getString(R.string.WalletSending)));
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
        org.telegram.ui.Components.y9 y9Var2 = this.T;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36554b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i21 = org.telegram.ui.ActionBar.y6.f23748y6;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i21, u6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.f7.y(this, drawable, i21, u6Var, PorterDuff.Mode.SRC_IN);
            this.f36559e0 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i21);
            org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(27);
            org.telegram.ui.Components.voip.c1 c1Var2 = new org.telegram.ui.Components.voip.c1(28);
            int i22 = L.f22485a;
            float f10 = L.d;
            org.telegram.ui.ActionBar.u6 u6Var2 = this.f36554b;
            int Q = org.telegram.ui.ActionBar.f7.Q(i22, -1, 2, f10, u6Var2);
            c1Var2.d(Q, this);
            org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(100, this);
            x9.c(i22, -1, 2, f10, u6Var2);
            x9.f23809n = c1Var;
            x9.f23810o = c1Var2;
            x9.f23808m = false;
            x9.f23803g = Q;
            ar arVar = new ar(this.f36559e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                y9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", arVar, wallettransaction.nft);
            } else {
                y9Var2.setImageDrawable(arVar);
            }
            this.V.setText(wallettransaction.nft.name);
            if (wallettransaction.nft.isPhoneNumber()) {
                i17 = R.string.WalletCollectibleNumber;
            } else if (wallettransaction.nft.isUsername()) {
                i17 = R.string.WalletCollectibleUsername;
            } else if (wallettransaction.nft.isGift()) {
                i17 = R.string.WalletCollectibleGift;
            } else {
                i17 = R.string.WalletCollectible;
            }
            this.W.setText(LocaleController.getString(i17));
        } else {
            linearLayout.setVisibility(8);
            y9Var2.b();
        }
        int i23 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable2 = this.f36563s;
        Drawable drawable3 = this.v;
        TextView textView4 = this.f36562r;
        if (i23 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.f36557c0) {
                org.telegram.ui.ActionBar.f7.y(this, drawable3, org.telegram.ui.ActionBar.y6.uj, u6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                org.telegram.ui.ActionBar.f7.y(this, drawable3, org.telegram.ui.ActionBar.y6.f23767z6, u6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z22 = this.f36557c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder p10 = l0.p(l0.n(abs, false), 0.78571427f);
            int i24 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i24 != 0 && z22) {
                p10.insert(0, (CharSequence) "+");
            } else if (i24 != 0 && !z22) {
                p10.insert(0, (CharSequence) "–");
            }
            textView4.setText(p10);
        }
        int visibility = textView4.getVisibility();
        da daVar = this.f36564w;
        daVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = daVar.f36493a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        daVar.f36494b.setImageDrawable(drawable2);
        daVar.f36496f = this.O;
        daVar.a();
        if (!this.N && !this.O) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, z11);
        this.f36553a0 = z10;
        updateColors();
        invalidate();
    }

    public l6 getPendingDiamond() {
        return this.f36564w.f36495c;
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
        this.I.f36801a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        da daVar = this.f36564w;
        daVar.f36496f = false;
        daVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f36553a0 && this.F < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f36565x;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.y6.f23478k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.y6.f23478k0.getAlpha()));
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

    @Override
    public final void updateColors() {
        int w02;
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36554b;
        this.E.setColor(org.telegram.ui.ActionBar.y6.o1(this.F, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        this.f36560f.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        int i12 = org.telegram.ui.ActionBar.y6.f23767z6;
        this.f36561n.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        if (this.f36555b0 && !this.N) {
            w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        } else if (this.f36557c0) {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, u6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        }
        this.f36564w.f36493a.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23299a7, u6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(10.0f), w03));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
    }
}
