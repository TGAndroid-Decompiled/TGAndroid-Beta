package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh implements org.telegram.ui.web.f0 {
    public ValueAnimator f30696a;
    public final sh.n3 f30697b;
    public final String f30698c;
    public final long d;
    public final mi f30699e;

    public rh(mi miVar, sh.n3 n3Var, String str, long j10) {
        this.f30699e = miVar;
        this.f30697b = n3Var;
        this.f30698c = str;
        this.d = j10;
    }

    @Override
    public final void b() {
        y();
    }

    @Override
    public final String g(boolean z4, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        mi miVar = this.f30699e;
        MediaDataController mediaDataController = MediaDataController.getInstance(miVar.G1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(miVar.G1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z4) {
        int i10;
        ImageView backButton = this.f30699e.U0.getBackButton();
        if (z4) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z4) {
        this.f30697b.setNeedCloseConfirmation(z4);
    }

    @Override
    public final void m(int i10) {
        this.f30697b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.g6 g6Var;
        mi miVar = this.f30699e;
        int i10 = miVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
        boolean z4 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        sh.n3 n3Var = this.f30697b;
        org.telegram.ui.lo0 lo0Var = null;
        if (z4) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(miVar.getContext(), 3, null);
            d2Var.q(150L);
            mh.t7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(d2Var, 1), new lh.a1(29, n3Var, str));
            AndroidUtilities.hideKeyboard(n3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            lo0Var = new org.telegram.ui.lo0(paymentForm, null, str, p2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            lo0Var = new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (lo0Var != null) {
            n3Var.F();
            AndroidUtilities.hideKeyboard(n3Var);
            Activity parentActivity = p2Var.getParentActivity();
            int i11 = mi.L2;
            dd0 dd0Var = new dd0(parentActivity);
            dd0Var.show();
            lo0Var.W0 = new androidx.car.app.utils.a(dd0Var, n3Var, str, 19);
            g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
            lo0Var.V0 = g6Var;
            dd0Var.c(lo0Var);
        }
    }

    @Override
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        int i12;
        float f10;
        float f11;
        float f12;
        mi miVar = this.f30699e;
        RadialProgressView radialProgressView = miVar.f29116z1;
        k6 k6Var = miVar.B1;
        ei eiVar = miVar.f29100v0;
        sh.n3 n3Var = this.f30697b;
        if (eiVar == n3Var) {
            if (n3Var.M || this.f30698c != null) {
                k6Var.setClickable(z10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new u5(j10, 1.4f, k6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    k6Var.setText(spannableStringBuilder);
                } else {
                    k6Var.setText(str);
                }
                k6Var.setTextColor(i11);
                k6Var.setEmojiColor(i11);
                boolean z13 = org.telegram.ui.web.a1.J0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                k6Var.setBackground(org.telegram.ui.ActionBar.k6.g0(i10, i12));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (miVar.A1 != z4) {
                    miVar.A1 = z4;
                    ValueAnimator valueAnimator = this.f30696a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z4) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    if (z4) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f11, f12).setDuration(250L);
                    this.f30696a = duration;
                    duration.addUpdateListener(new f6(this, 9));
                    this.f30696a.addListener(new ih(this, z4, 0));
                    this.f30696a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (miVar.f29113y1 != z11) {
                    radialProgressView.animate().cancel();
                    if (z11) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z11) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f13);
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z11) {
                        f14 = 0.1f;
                    }
                    scaleX.scaleY(f14).setDuration(250L).setListener(new ih(this, z11, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        ei eiVar = this.f30699e.f29100v0;
        sh.n3 n3Var = this.f30697b;
        if (eiVar == n3Var && !n3Var.G.f47529c) {
            n3Var.F();
        }
    }

    @Override
    public final void t(boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f30697b.I;
        if (g1Var != null) {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            g1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z4) {
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        mi miVar = this.f30699e;
        final int color = miVar.C2.f48086a.getColor();
        final sh.o1 o1Var = new sh.o1();
        int i13 = 0;
        if (miVar.X) {
            i12 = color;
        } else {
            i12 = 0;
        }
        g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        o1Var.c(o1Var.f47553a, i12, g6Var);
        miVar.X = z4;
        if (z4) {
            i13 = i11;
        }
        g6Var2 = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        o1Var.c(o1Var.f47554b, i13, g6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(pr.f30183f);
        final sh.n3 n3Var = this.f30697b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                mi miVar2 = rh.this.f30699e;
                miVar2.f29068k2 = d;
                miVar2.f29065j2 = true;
                fg.k1 k1Var = miVar2.U0;
                if (k1Var != null) {
                    k1Var.e();
                    k1Var.invalidate();
                }
                miVar2.C2.a(d);
                xg.f fVar = miVar2.f29092s1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                n3Var.setCustomActionBarBackground(d);
                miVar2.f29100v0.invalidate();
                miVar2.f29078o1.invalidate();
                o1Var.b(k1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        mi miVar = this.f30699e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
            if (p2Var instanceof org.telegram.ui.xn) {
                org.telegram.ui.jk jkVar = ((org.telegram.ui.xn) p2Var).V;
                jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            miVar.dismiss(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        org.telegram.ui.py pyVar = new org.telegram.ui.py(bundle);
        Context context = miVar.getContext();
        int i10 = mi.L2;
        dd0 dd0Var = new dd0(context);
        pyVar.f40308z2 = new a1.d(this, user, str, dd0Var, 8);
        dd0Var.show();
        dd0Var.c(pyVar);
    }

    @Override
    public final void x(boolean z4) {
        this.f30697b.setAllowSwipes(z4);
    }

    @Override
    public final void y() {
        mi miVar = this.f30699e;
        if (miVar.f29100v0 != this.f30697b) {
            return;
        }
        miVar.setFocusable(false);
        miVar.getWindow().setSoftInputMode(48);
        miVar.dismiss();
        AndroidUtilities.runOnUIThread(new jc(5), 150L);
    }

    @Override
    public final sh.u0 z() {
        return null;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(String str) {
    }

    @Override
    public final void f(ArrayList arrayList) {
    }

    @Override
    public final void p(boolean z4) {
    }

    @Override
    public final void r(int i10) {
    }

    @Override
    public final void w(boolean z4) {
    }

    @Override
    public final void o(int i10, boolean z4) {
    }

    @Override
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
    }
}
