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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ve1;
import org.telegram.ui.wv;
public final class f3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.k H;
    public final l9 I;
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
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int f34482a;
    public boolean f34483a0;
    public final org.telegram.ui.ActionBar.g6 f34484b;
    public boolean f34485b0;
    public final org.telegram.ui.Components.h9 f34486c;
    public boolean f34487c0;
    public final ImageView d;
    public boolean f34488d0;
    public final org.telegram.ui.Components.w9 e;
    public ShapeDrawable f34489e0;
    public final TextView f34490f;
    public final TextView h;
    public final TextView f34491n;
    public final TextView f34492r;
    public final Drawable f34493s;
    public final Drawable v;
    public final ea f34494w;
    public final Paint f34495x;
    public final Path f34496y;

    public f3(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f34486c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.f34495x = new Paint(1);
        this.f34496y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new l9();
        this.f34482a = i10;
        this.f34484b = g6Var;
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
        this.f34490f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView f7 = sl.f(linearLayout2, textView, w7.z5.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f7;
        f7.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f7.setEllipsize(truncateAt);
        f7.setIncludeFontPadding(false);
        f7.setGravity(16);
        f7.setTextSize(1, 13.0f);
        TextView f10 = sl.f(linearLayout2, f7, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f34491n = f10;
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        linearLayout2.addView(f10, w7.z5.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
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
        this.V = textView2;
        sl.k(14.0f, 1, textView2);
        TextView f11 = sl.f(linearLayout4, textView2, w7.z5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = f11;
        f11.setTextSize(1, 14.0f);
        linearLayout4.addView(f11, w7.z5.t(-1, -2, 55, 0, 0, 0, 0));
        ea eaVar = new ea(context);
        this.f34494w = eaVar;
        this.f34492r = eaVar.f34466a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.f34493s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(eaVar, w7.z5.p(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    public static void a(f3 f3Var, ValueAnimator valueAnimator) {
        f3Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(v40 v40Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new b3(v40Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.k6.o1(this.F, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.f34484b)));
        c();
        setElevation(AndroidUtilities.dp(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        ea eaVar = this.f34494w;
        eaVar.d = f7;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0 && eaVar.f34468c == null) {
            m6 m6Var = new m6(40, eaVar.getContext(), true);
            eaVar.f34468c = m6Var;
            m6Var.setContinuousRotation(300.0f);
            eaVar.addView(eaVar.f34468c, w7.z5.c(40.0f, 40));
        }
        m6 m6Var2 = eaVar.f34468c;
        if (m6Var2 != null && i10 == 0) {
            m6Var2.setPaused(true);
            eaVar.removeView(eaVar.f34468c);
            eaVar.f34468c = null;
        }
        eaVar.a();
        eaVar.requestLayout();
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21125a7));
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
                        RectF a2 = w9.a(this, pendingDiamond);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        l9 l9Var = this.I;
                        l9Var.getClass();
                        float f11 = AndroidUtilities.density;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e = l9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e7 = l9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                if (l9Var.f34789b.nextBoolean()) {
                                    i10 = 1;
                                } else {
                                    i10 = -1;
                                }
                                e = (l9Var.e(0.5f, 1.4f) * i10) + 3.1415927f;
                                e7 = l9Var.e(60.0f, 240.0f);
                            } else {
                                e = l9Var.e(0.0f, 6.2831855f);
                                e7 = l9Var.e(40.0f, 160.0f);
                            }
                            l9Var.a(centerX, centerY, e, e7 * f11, l9Var.e(2.2f, 6.5f) * f11, l9Var.e(0.8f, 1.4f), 2.4f);
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
                    this.K.addListener(new ve1(this, 3));
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
        ea eaVar = this.f34494w;
        eaVar.e = f10;
        eaVar.a();
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
        m6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = w9.a((ViewGroup) getRootView(), pendingDiamond);
            LaunchActivity.c0(a2.centerX(), a2.centerY(), 1.5f);
        }
        l9 l9Var = this.I;
        l9Var.c(canvas);
        if (l9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.J;
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.ActionBar.g6 g6Var = this.f34484b;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            Paint paint = this.f34495x;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var));
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
            Path path = this.f34496y;
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
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.f34495x);
    }

    public final void f(boolean z10) {
        float f7;
        this.O = z10;
        ea eaVar = this.f34494w;
        eaVar.f34469f = z10;
        eaVar.a();
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
        int i18 = d3.f34401a;
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
            this.I.f34788a.clear();
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
        this.f34485b0 = z14;
        this.f34487c0 = z18;
        boolean z19 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.w9 w9Var = this.e;
        TextView textView2 = this.f34490f;
        if (z19) {
            w9Var.setVisibility(8);
            setIconColor(v40.f31351w);
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
            int i19 = this.f34482a;
            v40 v40Var = v40.f31348n;
            org.telegram.ui.Components.h9 h9Var = this.f34486c;
            z15 = true;
            v40 v40Var2 = v40.f31346c;
            if (z20) {
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    w9Var.setVisibility(0);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    w9Var.setVisibility(8);
                    if (this.f34487c0) {
                        v40Var = v40Var2;
                    }
                    setIconColor(v40Var);
                    if (this.f34487c0) {
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
                    w9Var.setVisibility(0);
                    h9Var.k(i19, chat);
                    w9Var.e(chat, h9Var);
                    textView2.setText(chat.title);
                } else {
                    w9Var.setVisibility(8);
                    if (this.f34487c0) {
                        v40Var = v40Var2;
                    }
                    setIconColor(v40Var);
                    if (this.f34487c0) {
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
                w9Var.setVisibility(8);
                if (!this.f34487c0) {
                    v40Var = v40Var2;
                }
                setIconColor(v40Var);
                if (this.f34487c0) {
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
                if (this.f34487c0) {
                    v40Var = v40Var2;
                }
                setIconColor(v40Var);
                if (this.f34487c0) {
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
        this.f34488d0 = z16;
        textView2.setSingleLine(!z16);
        if (this.f34488d0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f34488d0) {
            dp = Integer.MAX_VALUE;
        } else {
            dp = AndroidUtilities.dp(120.0f);
        }
        textView2.setMaxWidth(dp);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f34488d0) {
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
                    if (this.f34487c0) {
                        i16 = R.string.WalletMovedFromProfile;
                    } else {
                        i16 = R.string.WalletMovedToProfile;
                    }
                    textView.setText(LocaleController.getString(i16));
                } else if (wallettransaction.nft != null) {
                    if (this.f34487c0) {
                        i15 = R.string.WalletIncomingTransferNft;
                    } else {
                        i15 = R.string.WalletOutgoingTransferNft;
                    }
                    textView.setText(LocaleController.getString(i15));
                } else {
                    if (this.f34487c0) {
                        i14 = R.string.WalletIncomingTransfer;
                    } else {
                        i14 = R.string.WalletOutgoingTransfer;
                    }
                    textView.setText(LocaleController.getString(i14));
                }
            }
        }
        boolean z21 = wallettransaction.pending;
        TextView textView3 = this.f34491n;
        if (z21) {
            textView3.setText(ci.fa.a(textView3, LocaleController.getString(R.string.WalletSending)));
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f34484b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i21 = org.telegram.ui.ActionBar.k6.f21571y6;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i21, g6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.r6.z(this, drawable, i21, g6Var, PorterDuff.Mode.SRC_IN);
            this.f34489e0 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.k6.o1(0.1f, w02));
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i21);
            wv wvVar = new wv(24);
            wv wvVar2 = new wv(25);
            int i22 = M.f21710a;
            float f10 = M.d;
            org.telegram.ui.ActionBar.g6 g6Var2 = this.f34484b;
            int R = org.telegram.ui.ActionBar.r6.R(i22, -1, 2, f10, g6Var2);
            wvVar2.d(R, this);
            org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(100, this);
            y3.c(i22, -1, 2, f10, g6Var2);
            y3.f21619n = wvVar;
            y3.f21620o = wvVar2;
            y3.f21618m = false;
            y3.f21613g = R;
            yq yqVar = new yq(this.f34489e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                w9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", yqVar, wallettransaction.nft);
            } else {
                w9Var2.setImageDrawable(yqVar);
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
            w9Var2.b();
        }
        int i23 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable2 = this.f34493s;
        Drawable drawable3 = this.v;
        TextView textView4 = this.f34492r;
        if (i23 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.f34487c0) {
                org.telegram.ui.ActionBar.r6.z(this, drawable3, org.telegram.ui.ActionBar.k6.uj, g6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                org.telegram.ui.ActionBar.r6.z(this, drawable3, org.telegram.ui.ActionBar.k6.f21588z6, g6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z22 = this.f34487c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder p5 = l0.p(l0.n(abs, false), 0.78571427f);
            int i24 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i24 != 0 && z22) {
                p5.insert(0, (CharSequence) "+");
            } else if (i24 != 0 && !z22) {
                p5.insert(0, (CharSequence) "–");
            }
            textView4.setText(p5);
        }
        int visibility = textView4.getVisibility();
        ea eaVar = this.f34494w;
        eaVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = eaVar.f34466a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        eaVar.f34467b.setImageDrawable(drawable2);
        eaVar.f34469f = this.O;
        eaVar.a();
        if (!this.N && !this.O) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, z11);
        this.f34483a0 = z10;
        updateColors();
        invalidate();
    }

    public m6 getPendingDiamond() {
        return this.f34494w.f34468c;
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
        this.I.f34788a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        ea eaVar = this.f34494w;
        eaVar.f34469f = false;
        eaVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f34483a0 && this.F < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f34495x;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.k6.f21304k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.k6.f21304k0.getAlpha()));
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
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f34484b;
        this.E.setColor(org.telegram.ui.ActionBar.k6.o1(this.F, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        this.f34490f.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        int i12 = org.telegram.ui.ActionBar.k6.f21588z6;
        this.f34491n.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        if (this.f34485b0 && !this.N) {
            w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        } else if (this.f34487c0) {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, g6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        }
        this.f34494w.f34466a.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, g6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(10.0f), w03));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
    }
}
