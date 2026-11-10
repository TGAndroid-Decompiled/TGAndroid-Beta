package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.vq0;
public final class p3 extends Dialog {
    public static final int W = 0;
    public final RectF D;
    public final ri.b E;
    public final dh.c F;
    public Bitmap G;
    public i0.b H;
    public float I;
    public float J;
    public boolean K;
    public final h6.m L;
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
    public final org.telegram.ui.ActionBar.f2 f42965a;
    public final ff0 f42966b;
    public final boolean f42967c;
    public final boolean d;
    public final boolean f42968e;
    public final RectF f42969f;
    public final n3 h;
    public final o3 f42970n;
    public final i6 f42971r;
    public final d8 f42972s;
    public final vq0 f42973w;
    public final TextView f42974x;
    public final Paint f42975y;

    public p3(final org.telegram.ui.ActionBar.f2 f2Var, ff0 ff0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(f2Var.getParentActivity(), 2131755352);
        String a02;
        RectF rectF = new RectF();
        this.f42969f = rectF;
        this.f42975y = new Paint(3);
        this.D = new RectF();
        ri.b bVar = new ri.b();
        this.E = bVar;
        this.H = i0.b.f15121e;
        this.L = new h6.m(28);
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.f42965a = f2Var;
        this.f42966b = ff0Var;
        boolean z9 = user != null && user.f27109id == p10.i(f2Var.getCurrentAccount()).e();
        this.f42968e = z9;
        boolean z10 = (user == null || z9 || !((org.telegram.messenger.h0) qp.s1(f2Var.getCurrentAccount()).f24946x7.f24450j0.f13891b).f22784c) ? false : true;
        this.f42967c = z10;
        this.d = (user == null || z9 || z10) ? false : true;
        int[] iArr = new int[2];
        ff0Var.getLocationOnScreen(iArr);
        rectF.set(ff0Var.f40953w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.g0.S(getWindow());
        n3 n3Var = new n3(this, getContext());
        this.h = n3Var;
        o3 o3Var = new o3(this, getContext());
        this.f42970n = o3Var;
        o3Var.setAlpha(0.0f);
        n3Var.addView(o3Var, c8.ha.c(-1.0f, -1));
        n3Var.setClipChildren(false);
        n3Var.setClipToPadding(false);
        n3Var.setOnClickListener(new h3(this, 0));
        c3 c3Var = new c3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(n3Var, c3Var);
        i6 i6Var = new i6(getContext());
        this.f42971r = i6Var;
        i6Var.setDiamondOnCard(true);
        int currentAccount = f2Var.getCurrentAccount();
        String p10 = t10.p(user);
        Locale locale = Locale.ROOT;
        i6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            i6Var.setCardNumber(i6.d(cardVar.address.toUpperCase(locale)));
        }
        i6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = l0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            i6Var.O.c(m10, false, true);
        }
        i6Var.setCardOnClickListener(new View.OnClickListener(this) {
            public final p3 f42788b;

            {
                this.f42788b = this;
            }

            @Override
            public final void onClick(View view) {
                g gVar;
                switch (r4) {
                    case 0:
                        p3 p3Var = this.f42788b;
                        if (!p3Var.R) {
                            boolean z11 = p3Var.f42968e;
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            if (z11) {
                                z5.J0(f2Var2.getCurrentAccount(), p3Var.getContext(), f2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = p3Var.getContext();
                                int currentAccount2 = f2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!p3Var.f42967c) {
                                    gVar = null;
                                } else {
                                    gVar = new g(p3Var, f2Var2, cardVar2, 10);
                                }
                                z5.K0(context, currentAccount2, str, false, gVar, f2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p3 p3Var2 = this.f42788b;
                        if (!p3Var2.R) {
                            boolean z12 = p3Var2.f42968e;
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            if (z12) {
                                p3Var2.U = new m3(0, f2Var3);
                            } else if (p3Var2.d) {
                                p3Var2.U = new m3(1, f2Var3);
                            } else if (p3Var2.f42967c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    p3Var2.U = new k3(f2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            p3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        i6Var.setOnClickListener(new bi.l1(21));
        i6Var.setAlpha(0.0f);
        n3Var.addView(i6Var, c8.ha.c(-2.0f, -2));
        d8 d8Var = new d8(f2Var, i6Var, null, cardVar);
        this.f42972s = d8Var;
        n3Var.addView(d8Var, c8.ha.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(n3Var);
        cVar.f8711i = n3Var;
        vq0 vq0Var = new vq0(getContext());
        this.f42973w = vq0Var;
        fh.g c10 = cVar.c(vq0Var, new gh.b(org.telegram.ui.ActionBar.m6.f27890d6, f2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        vq0Var.setBackground(c10);
        c8.ka.b(vq0Var, 0.02f, 1.2f);
        fi.d dVar = new fi.d(getContext(), f2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = id.M0(z9 ? 2131743061 : z10 ? 2131743017 : 2131749276, null);
        if (!z10) {
            dVar.i(M0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            wp wpVar = new wp(2131231956, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            wpVar.f40042y = -1;
            append.setSpan(wpVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        vq0Var.addView(dVar, c8.ha.e(-2, -1, 17));
        vq0Var.setContentDescription(M0);
        vq0Var.setOnClickListener(new View.OnClickListener(this) {
            public final p3 f42788b;

            {
                this.f42788b = this;
            }

            @Override
            public final void onClick(View view) {
                g gVar;
                switch (r4) {
                    case 0:
                        p3 p3Var = this.f42788b;
                        if (!p3Var.R) {
                            boolean z11 = p3Var.f42968e;
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            if (z11) {
                                z5.J0(f2Var2.getCurrentAccount(), p3Var.getContext(), f2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = p3Var.getContext();
                                int currentAccount2 = f2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!p3Var.f42967c) {
                                    gVar = null;
                                } else {
                                    gVar = new g(p3Var, f2Var2, cardVar2, 10);
                                }
                                z5.K0(context, currentAccount2, str, false, gVar, f2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p3 p3Var2 = this.f42788b;
                        if (!p3Var2.R) {
                            boolean z12 = p3Var2.f42968e;
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            if (z12) {
                                p3Var2.U = new m3(0, f2Var3);
                            } else if (p3Var2.d) {
                                p3Var2.U = new m3(1, f2Var3);
                            } else if (p3Var2.f42967c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    p3Var2.U = new k3(f2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            p3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        vq0Var.setAlpha(0.0f);
        vq0Var.setVisibility(c() ? 0 : 8);
        n3Var.addView(vq0Var, c8.ha.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f42974x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z9) {
            textView.setText(id.M0(2131743043, null));
        } else if (user != null) {
            String j3 = t10.j(user, true);
            if (new BigDecimal(l0.p(cardVar.balance, false)).signum() == 0) {
                a02 = id.a0(null, null, 2131743045, j3);
            } else {
                a02 = id.a0(null, null, 2131743046, j3, l0.l("Grams", i6.e(cardVar.balance).toString(), 2131749507).toString().replace(' ', (char) 160));
            }
            textView.setText(fi.m3.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        n3Var.addView(textView, c8.ha.e(-2, -2, 49));
    }

    public final void a(float f10) {
        boolean z9;
        long j3;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i7 == 0 && this.T) {
            return;
        }
        if (i7 == 0) {
            this.T = true;
        }
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.K = z9;
        i6 i6Var = this.f42971r;
        i6Var.getClass();
        i6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.O = ofFloat;
        if (i7 == 0) {
            j3 = 650;
        } else {
            j3 = 380;
        }
        ofFloat.setDuration(j3);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new i3(this, 1));
        this.O.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 6));
        this.O.start();
    }

    public final void b() {
        if (!this.S) {
            this.S = true;
            this.f42971r.setLayerType(0, null);
            this.f42966b.setEjectProgress(0.0f);
            super.dismiss();
            this.f42972s.p();
            this.E.a(null);
            this.G = null;
            if (this.U != null && this.f42965a.getParentActivity() != null) {
                Runnable runnable = this.U;
                this.U = null;
                org.telegram.messenger.g0.h3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f42967c && !this.d && !this.f42968e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.f42974x;
        if (bitmap != null && !bitmap.isRecycled()) {
            n3 n3Var = this.h;
            if (n3Var.getWidth() > 0 && n3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) n3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) n3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q10) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.41f, i7));
    }

    @Override
    public final void dismiss() {
        if (!this.S && !this.R) {
            this.R = true;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42973w.setEnabled(false);
            if (this.h.isAttachedToWindow() && this.I != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    public final void e() {
        float f10;
        float f11;
        float interpolation = wq.f40047g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = wq.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        i6 i6Var = this.f42971r;
        float width = i6Var.getWidth();
        float height = i6Var.getHeight();
        RectF rectF = this.f42969f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f12 = centerY - iArr[1];
        float f13 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f14 = width / 2.0f;
        float f15 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, i6Var.getLeft() + f14, f10);
        float T13 = org.telegram.messenger.g0.T1((f13 * interpolation) + (f12 - (f13 / 2.0f)), i6Var.getTop() + f15, f10);
        float f16 = 1.0f - f10;
        float f17 = (-90.0f) * f16;
        double d2 = f17;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f18 = centerX - T12;
        float f19 = f12 - T13;
        float f20 = sin * f19;
        float f21 = f19 * cos;
        float T14 = org.telegram.messenger.g0.T1(((f20 + (cos * f18)) / T1) + f14, f14, interpolation2);
        float T15 = org.telegram.messenger.g0.T1(((f21 + ((-sin) * f18)) / T1) + f15, f15, interpolation2);
        float f22 = T14 - f14;
        float f23 = T15 - f15;
        i6Var.setPivotX(T14);
        i6Var.setPivotY(T15);
        i6Var.setScaleX(T1);
        i6Var.setScaleY(T1);
        i6Var.setRotation(f17);
        i6Var.setRotationX(35.0f * f16);
        i6Var.setTranslationX((((cos * f22) - (sin * f23)) * T1) + ((T12 - i6Var.getLeft()) - T14));
        i6Var.setTranslationY((((cos * f23) + (sin * f22)) * T1) + ((T13 - i6Var.getTop()) - T15));
        if (this.I > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        i6Var.setAlpha(f11);
        i6Var.setUseGyroscope(this.Q * interpolation2);
        float f24 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f12 * f24);
        this.f42966b.setEjectProgress(interpolation);
        this.f42970n.setAlpha(this.I);
        this.f42972s.setAlpha(interpolation2);
        vq0 vq0Var = this.f42973w;
        vq0Var.setAlpha(interpolation2);
        TextView textView = this.f42974x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f24);
        vq0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f24);
        vq0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        vq0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        n3 n3Var = this.h;
        setContentView(n3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        n3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(n3Var, !org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.m6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        jk0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.y.c(this.h);
    }
}
