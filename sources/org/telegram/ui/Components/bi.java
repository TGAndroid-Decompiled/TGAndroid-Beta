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
public final class bi implements org.telegram.ui.web.h0 {
    public ValueAnimator f22792a;
    public final ei.q4 f22793b;
    public final String f22794c;
    public final long d;
    public final vi e;

    public bi(vi viVar, ei.q4 q4Var, String str, long j3) {
        this.e = viVar;
        this.f22793b = q4Var;
        this.f22794c = str;
        this.d = j3;
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
        vi viVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(viVar.J1);
        long j3 = this.d;
        if (!mediaDataController.botInAttachMenu(j3) && !MessagesController.getInstance(viVar.J1).whitelistedBots.contains(Long.valueOf(j3))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.e.X0.getBackButton();
        if (z10) {
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
    public final void k(boolean z10) {
        this.f22793b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f22793b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.e6 e6Var;
        vi viVar = this.e;
        int i10 = viVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f28750f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.f22793b;
        org.telegram.ui.wo0 wo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(viVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.v5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new b2(b2Var, 1), new org.telegram.ui.nf(12, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            wo0Var = new org.telegram.ui.wo0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            wo0Var = new org.telegram.ui.wo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (wo0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = vi.O2;
            zc0 zc0Var = new zc0(parentActivity);
            zc0Var.show();
            wo0Var.Z0 = new ai.r5(zc0Var, q4Var, str, 24);
            e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
            wo0Var.Y0 = e6Var;
            zc0Var.c(wo0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        vi viVar = this.e;
        RadialProgressView radialProgressView = viVar.C1;
        n6 n6Var = viVar.E1;
        ni niVar = viVar.f28811y0;
        ei.q4 q4Var = this.f22793b;
        if (niVar == q4Var) {
            if (q4Var.P || this.f22794c != null) {
                n6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new x5(j3, 1.4f, n6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    n6Var.setText(spannableStringBuilder);
                } else {
                    n6Var.setText(str);
                }
                n6Var.setTextColor(i11);
                n6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.d1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                n6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (viVar.D1 != z10) {
                    viVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f22792a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(250L);
                    this.f22792a = duration;
                    duration.addUpdateListener(new i6(this, 9));
                    this.f22792a.addListener(new th(this, z10, 0));
                    this.f22792a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (viVar.B1 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z12) {
                        f12 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f12);
                    if (z12) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f7);
                    if (!z12) {
                        f13 = 0.1f;
                    }
                    scaleX.scaleY(f13).setDuration(250L).setListener(new th(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        ni niVar = this.e.f28811y0;
        ei.q4 q4Var = this.f22793b;
        if (niVar == q4Var && !q4Var.J.f8545c) {
            q4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var = this.f22793b.L;
        if (f1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            f1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        vi viVar = this.e;
        final int color = viVar.F2.f9068a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (viVar.f28733a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.f8277a, i12, e6Var);
        viVar.f28733a0 = z10;
        if (z10) {
            i13 = i11;
        }
        e6Var2 = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.f8278b, i13, e6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(qr.f27423f);
        final ei.q4 q4Var = this.f22793b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                vi viVar2 = bi.this.e;
                viVar2.f28775n2 = d;
                viVar2.f28771m2 = true;
                w7 w7Var = viVar2.X0;
                if (w7Var != null) {
                    w7Var.e();
                    w7Var.invalidate();
                }
                viVar2.F2.a(d);
                jh.f fVar = viVar2.f28800v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                viVar2.f28811y0.invalidate();
                viVar2.f28787r1.invalidate();
                c2Var.b(w7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        vi viVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f28750f0;
            if (n2Var instanceof org.telegram.ui.bo) {
                org.telegram.ui.mk mkVar = ((org.telegram.ui.bo) n2Var).Y;
                mkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            viVar.dismiss(true);
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
        org.telegram.ui.uy uyVar = new org.telegram.ui.uy(bundle);
        Context context = viVar.getContext();
        int i10 = vi.O2;
        zc0 zc0Var = new zc0(context);
        uyVar.C2 = new a1.d(this, user, str, zc0Var, 7);
        zc0Var.show();
        zc0Var.c(uyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f22793b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        vi viVar = this.e;
        if (viVar.f28811y0 != this.f22793b) {
            return;
        }
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
        viVar.dismiss();
        AndroidUtilities.runOnUIThread(new sh(0), 150L);
    }

    @Override
    public final ei.a1 z() {
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
    public final void r(int i10) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void o(int i10, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
