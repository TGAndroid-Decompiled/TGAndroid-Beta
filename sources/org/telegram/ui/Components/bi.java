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
    public ValueAnimator f23764a;
    public final fi.q4 f23765b;
    public final String f23766c;
    public final long d;
    public final vi e;

    public bi(vi viVar, fi.q4 q4Var, String str, long j10) {
        this.e = viVar;
        this.f23765b = q4Var;
        this.f23766c = str;
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
        vi viVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(viVar.M1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(viVar.M1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.e.f29985a1.getBackButton();
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
        this.f23765b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f23765b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.c6 c6Var;
        vi viVar = this.e;
        int i10 = viVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        fi.q4 q4Var = this.f23765b;
        org.telegram.ui.cp0 cp0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(viVar.getContext(), 3, null);
            a2Var.q(150L);
            zh.n5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(a2Var, 1), new org.telegram.ui.vc(18, q4Var, str));
            AndroidUtilities.hideKeyboard(q4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            cp0Var = new org.telegram.ui.cp0(paymentForm, null, str, m2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            cp0Var = new org.telegram.ui.cp0((TLRPC.PaymentReceipt) tLObject);
        }
        if (cp0Var != null) {
            q4Var.J();
            AndroidUtilities.hideKeyboard(q4Var);
            Activity parentActivity = m2Var.getParentActivity();
            int i11 = vi.R2;
            zd0 zd0Var = new zd0(parentActivity);
            zd0Var.show();
            cp0Var.Z0 = new androidx.car.app.utils.a(zd0Var, q4Var, str, 24);
            c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
            cp0Var.Y0 = c6Var;
            zd0Var.c(cp0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        vi viVar = this.e;
        RadialProgressView radialProgressView = viVar.F1;
        s6 s6Var = viVar.H1;
        ni niVar = viVar.B0;
        fi.q4 q4Var = this.f23765b;
        if (niVar == q4Var) {
            if (q4Var.P || this.f23766c != null) {
                s6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new b6(j10, 1.4f, s6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    s6Var.setText(spannableStringBuilder);
                } else {
                    s6Var.setText(str);
                }
                s6Var.setTextColor(i11);
                s6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.b1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                s6Var.setBackground(org.telegram.ui.ActionBar.g6.h0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (viVar.G1 != z10) {
                    viVar.G1 = z10;
                    ValueAnimator valueAnimator = this.f23764a;
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
                    this.f23764a = duration;
                    duration.addUpdateListener(new n6(this, 9));
                    this.f23764a.addListener(new th(this, z10, 0));
                    this.f23764a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (viVar.E1 != z12) {
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
        ni niVar = this.e.B0;
        fi.q4 q4Var = this.f23765b;
        if (niVar == q4Var && !q4Var.J.f9474c) {
            q4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f23765b.L;
        if (e1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            e1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        vi viVar = this.e;
        final int color = viVar.I2.f10148a.getColor();
        final fi.b2 b2Var = new fi.b2();
        int i13 = 0;
        if (viVar.f29984a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        b2Var.c(b2Var.f9185a, i12, c6Var);
        viVar.f29984a0 = z10;
        if (z10) {
            i13 = i11;
        }
        c6Var2 = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        b2Var.c(b2Var.f9186b, i13, c6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(es.f24771f);
        final fi.q4 q4Var = this.f23765b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                vi viVar2 = bi.this.e;
                viVar2.f30035q2 = d;
                viVar2.f30032p2 = true;
                b8 b8Var = viVar2.f29985a1;
                if (b8Var != null) {
                    b8Var.d();
                    b8Var.invalidate();
                }
                viVar2.I2.a(d);
                kh.f fVar = viVar2.f30063y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                q4Var.setCustomActionBarBackground(d);
                viVar2.B0.invalidate();
                viVar2.f30048u1.invalidate();
                b2Var.b(b8Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        vi viVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
            if (m2Var instanceof org.telegram.ui.fo) {
                org.telegram.ui.sk skVar = ((org.telegram.ui.fo) m2Var).Y;
                skVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        org.telegram.ui.yy yyVar = new org.telegram.ui.yy(bundle);
        Context context = viVar.getContext();
        int i10 = vi.R2;
        zd0 zd0Var = new zd0(context);
        yyVar.C2 = new a1.d(this, user, str, zd0Var, 7);
        zd0Var.show();
        zd0Var.c(yyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f23765b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        vi viVar = this.e;
        if (viVar.B0 != this.f23765b) {
            return;
        }
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
        viVar.dismiss();
        AndroidUtilities.runOnUIThread(new ve(1), 150L);
    }

    @Override
    public final fi.z0 z() {
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
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
