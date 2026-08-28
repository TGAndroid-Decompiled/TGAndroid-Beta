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
public final class rh implements org.telegram.ui.web.e0 {
    public ValueAnimator f32172a;
    public final mh.g4 f32173b;
    public final String f32174c;
    public final long d;
    public final ki f32175e;

    public rh(ki kiVar, mh.g4 g4Var, String str, long j10) {
        this.f32175e = kiVar;
        this.f32173b = g4Var;
        this.f32174c = str;
        this.d = j10;
    }

    @Override
    public final void b() {
        y();
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        ki kiVar = this.f32175e;
        MediaDataController mediaDataController = MediaDataController.getInstance(kiVar.F1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(kiVar.F1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i9;
        ImageView backButton = this.f32175e.T0.getBackButton();
        if (z10) {
            i9 = R.drawable.ic_ab_back;
        } else {
            i9 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i9);
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z10) {
        this.f32173b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i9) {
        this.f32173b.setCustomBackground(i9);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.b6 b6Var;
        ki kiVar = this.f32175e;
        int i9 = kiVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        mh.g4 g4Var = this.f32173b;
        org.telegram.ui.co0 co0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(kiVar.getContext(), 3, null);
            c2Var.q(150L);
            gh.v7.y(i9, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(c2Var, 1), new org.telegram.ui.df(14, g4Var, str));
            AndroidUtilities.hideKeyboard(g4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i9).putUsers(paymentForm.users, false);
            co0Var = new org.telegram.ui.co0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            co0Var = new org.telegram.ui.co0((TLRPC.PaymentReceipt) tLObject);
        }
        if (co0Var != null) {
            g4Var.F();
            AndroidUtilities.hideKeyboard(g4Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i10 = ki.K2;
            gc0 gc0Var = new gc0(parentActivity);
            gc0Var.show();
            co0Var.V0 = new androidx.car.app.utils.a(gc0Var, g4Var, str, 23);
            b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
            co0Var.U0 = b6Var;
            gc0Var.c(co0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13) {
        int i11;
        float f10;
        float f11;
        float f12;
        ki kiVar = this.f32175e;
        RadialProgressView radialProgressView = kiVar.f30176y1;
        j6 j6Var = kiVar.A1;
        ci ciVar = kiVar.f30160u0;
        mh.g4 g4Var = this.f32173b;
        if (ciVar == g4Var) {
            if (g4Var.L || this.f32174c != null) {
                j6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new t5(j10, 1.4f, j6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    j6Var.setText(spannableStringBuilder);
                } else {
                    j6Var.setText(str);
                }
                j6Var.setTextColor(i10);
                j6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.y0.I0;
                if (i0.a.f(i9) >= 0.30000001192092896d) {
                    i11 = 301989888;
                } else {
                    i11 = 385875967;
                }
                j6Var.setBackground(org.telegram.ui.ActionBar.f6.g0(i9, i11));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (kiVar.f30179z1 != z10) {
                    kiVar.f30179z1 = z10;
                    ValueAnimator valueAnimator = this.f32172a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f11, f12).setDuration(250L);
                    this.f32172a = duration;
                    duration.addUpdateListener(new e6(this, 9));
                    this.f32172a.addListener(new ih(this, z10, 0));
                    this.f32172a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (kiVar.f30172x1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z12) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f13);
                    if (z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z12) {
                        f14 = 0.1f;
                    }
                    scaleX.scaleY(f14).setDuration(250L).setListener(new ih(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        ci ciVar = this.f32175e.f30160u0;
        mh.g4 g4Var = this.f32173b;
        if (ciVar == g4Var && !g4Var.F.f17839c) {
            g4Var.F();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i9;
        org.telegram.ui.ActionBar.g1 g1Var = this.f32173b.H;
        if (g1Var != null) {
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            g1Var.setVisibility(i9);
        }
    }

    @Override
    public final void u(int i9, final int i10, boolean z10) {
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        ki kiVar = this.f32175e;
        final int color = kiVar.B2.f18600a.getColor();
        final mh.w1 w1Var = new mh.w1();
        int i12 = 0;
        if (kiVar.W) {
            i11 = color;
        } else {
            i11 = 0;
        }
        b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        w1Var.c(w1Var.f18184a, i11, b6Var);
        kiVar.W = z10;
        if (z10) {
            i12 = i10;
        }
        b6Var2 = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        w1Var.c(w1Var.f18185b, i12, b6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(gr.f28844f);
        final mh.g4 g4Var = this.f32173b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i10);
                ki kiVar2 = rh.this.f32175e;
                kiVar2.f30128j2 = d;
                kiVar2.f30125i2 = true;
                r7 r7Var = kiVar2.T0;
                if (r7Var != null) {
                    r7Var.d();
                    r7Var.invalidate();
                }
                kiVar2.B2.a(d);
                rg.f fVar = kiVar2.f30151r1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                g4Var.setCustomActionBarBackground(d);
                kiVar2.f30160u0.invalidate();
                kiVar2.f30138n1.invalidate();
                w1Var.b(r7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ki kiVar = this.f32175e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
            if (o2Var instanceof org.telegram.ui.qn) {
                org.telegram.ui.ak akVar = ((org.telegram.ui.qn) o2Var).U;
                akVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            kiVar.dismiss(true);
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
        org.telegram.ui.dy dyVar = new org.telegram.ui.dy(bundle);
        Context context = kiVar.getContext();
        int i9 = ki.K2;
        gc0 gc0Var = new gc0(context);
        dyVar.f37752y2 = new a1.d(this, user, str, gc0Var, 9);
        gc0Var.show();
        gc0Var.c(dyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f32173b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        ki kiVar = this.f32175e;
        if (kiVar.f30160u0 != this.f32173b) {
            return;
        }
        kiVar.setFocusable(false);
        kiVar.getWindow().setSoftInputMode(48);
        kiVar.dismiss();
        AndroidUtilities.runOnUIThread(new hc(5), 150L);
    }

    @Override
    public final mh.y0 z() {
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
    public final void p(boolean z10) {
    }

    @Override
    public final void r(int i9) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void o(int i9, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13, String str2) {
    }
}
