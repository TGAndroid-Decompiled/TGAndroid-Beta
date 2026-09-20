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
    public ValueAnimator f23004a;
    public final ei.q4 f23005b;
    public final String f23006c;
    public final long d;
    public final vi e;

    public bi(vi viVar, ei.q4 q4Var, String str, long j3) {
        this.e = viVar;
        this.f23005b = q4Var;
        this.f23006c = str;
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
        this.f23005b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f23005b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.f6 f6Var;
        vi viVar = this.e;
        int i10 = viVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ei.q4 q4Var = this.f23005b;
        org.telegram.ui.xo0 xo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(viVar.getContext(), 3, null);
            b2Var.q(150L);
            yh.u5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new b2(b2Var, 1), new org.telegram.ui.of(12, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            xo0Var = new org.telegram.ui.xo0(paymentForm, null, str, n2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            xo0Var = new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (xo0Var != null) {
            q4Var.G();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = n2Var.getParentActivity();
            int i11 = vi.O2;
            id0 id0Var = new id0(parentActivity);
            id0Var.show();
            xo0Var.Z0 = new ai.r5(id0Var, q4Var, str, 24);
            f6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
            xo0Var.Y0 = f6Var;
            id0Var.c(xo0Var);
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
        o6 o6Var = viVar.E1;
        ni niVar = viVar.f29159y0;
        ei.q4 q4Var = this.f23005b;
        if (niVar == q4Var) {
            if (q4Var.P || this.f23006c != null) {
                o6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new y5(j3, 1.4f, o6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    o6Var.setText(spannableStringBuilder);
                } else {
                    o6Var.setText(str);
                }
                o6Var.setTextColor(i11);
                o6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.d1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                o6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (viVar.D1 != z10) {
                    viVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f23004a;
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
                    this.f23004a = duration;
                    duration.addUpdateListener(new j6(this, 9));
                    this.f23004a.addListener(new th(this, z10, 0));
                    this.f23004a.start();
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
        ni niVar = this.e.f29159y0;
        ei.q4 q4Var = this.f23005b;
        if (niVar == q4Var && !q4Var.J.f8550c) {
            q4Var.G();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var = this.f23005b.L;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        vi viVar = this.e;
        final int color = viVar.F2.f9073a.getColor();
        final ei.c2 c2Var = new ei.c2();
        int i13 = 0;
        if (viVar.f29081a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        f6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.f8282a, i12, f6Var);
        viVar.f29081a0 = z10;
        if (z10) {
            i13 = i11;
        }
        f6Var2 = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        c2Var.c(c2Var.f8283b, i13, f6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(qr.f27642f);
        final ei.q4 q4Var = this.f23005b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                vi viVar2 = bi.this.e;
                viVar2.f29123n2 = d;
                viVar2.f29119m2 = true;
                x7 x7Var = viVar2.X0;
                if (x7Var != null) {
                    x7Var.e();
                    x7Var.invalidate();
                }
                viVar2.F2.a(d);
                jh.f fVar = viVar2.f29148v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                viVar2.f29159y0.invalidate();
                viVar2.f29135r1.invalidate();
                c2Var.b(x7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        vi viVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
            if (n2Var instanceof org.telegram.ui.zn) {
                org.telegram.ui.lk lkVar = ((org.telegram.ui.zn) n2Var).Y;
                lkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        id0 id0Var = new id0(context);
        uyVar.C2 = new a1.d(this, user, str, id0Var, 7);
        id0Var.show();
        id0Var.c(uyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f23005b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        vi viVar = this.e;
        if (viVar.f29159y0 != this.f23005b) {
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
