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
public final class yh implements org.telegram.ui.web.h0 {
    public ValueAnimator f32913a;
    public final gi.f4 f32914b;
    public final String f32915c;
    public final long d;
    public final ri e;

    public yh(ri riVar, gi.f4 f4Var, String str, long j10) {
        this.e = riVar;
        this.f32914b = f4Var;
        this.f32915c = str;
        this.d = j10;
    }

    @Override
    public final gi.y0 A() {
        return null;
    }

    @Override
    public final void b() {
        z();
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        ri riVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(riVar.M1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(riVar.M1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        ImageView backButton = this.e.f30130a1.getBackButton();
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z10) {
        this.f32914b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f32914b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.g6 g6Var;
        ri riVar = this.e;
        int i10 = riVar.M1;
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        gi.f4 f4Var = this.f32914b;
        org.telegram.ui.ho0 ho0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(riVar.getContext(), 3, null);
            c2Var.r(150L);
            ai.ha.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(c2Var, 1), new org.telegram.ui.ActionBar.m3(24, f4Var, str));
            AndroidUtilities.hideKeyboard(f4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            ho0Var = new org.telegram.ui.ho0(paymentForm, null, str, o2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ho0Var = new org.telegram.ui.ho0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ho0Var != null) {
            f4Var.J();
            AndroidUtilities.hideKeyboard(f4Var);
            Activity parentActivity = o2Var.getParentActivity();
            int i11 = ri.U2;
            ud0 ud0Var = new ud0(parentActivity);
            ud0Var.show();
            ho0Var.Z0 = new ai.u2(ud0Var, f4Var, str, 25);
            g6Var = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
            ho0Var.Y0 = g6Var;
            ud0Var.c(ho0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        ri riVar = this.e;
        RadialProgressView radialProgressView = riVar.F1;
        o6 o6Var = riVar.H1;
        ji jiVar = riVar.B0;
        gi.f4 f4Var = this.f32914b;
        if (jiVar == f4Var) {
            if (f4Var.P || this.f32915c != null) {
                o6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new y5(j10, 1.4f, o6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    o6Var.setText(spannableStringBuilder);
                } else {
                    o6Var.setText(str);
                }
                o6Var.setTextColor(i11);
                o6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.b1.Q0;
                if (i0.a.h(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                o6Var.setBackground(org.telegram.ui.ActionBar.k6.h0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (riVar.G1 != z10) {
                    riVar.G1 = z10;
                    ValueAnimator valueAnimator = this.f32913a;
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
                    this.f32913a = duration;
                    duration.addUpdateListener(new j6(this, 9));
                    this.f32913a.addListener(new qh(this, z10, 0));
                    this.f32913a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (riVar.E1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new qh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        ji jiVar = this.e.B0;
        gi.f4 f4Var = this.f32914b;
        if (jiVar == f4Var && !f4Var.J.f11206c) {
            f4Var.J();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e1 e1Var = this.f32914b.L;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ri riVar = this.e;
        final int color = riVar.L2.f11074a.getColor();
        final gi.w1 w1Var = new gi.w1();
        int i13 = 0;
        if (riVar.f30129a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        g6Var = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
        w1Var.c(w1Var.f11552a, i12, g6Var);
        riVar.f30129a0 = z10;
        if (z10) {
            i13 = i11;
        }
        g6Var2 = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
        w1Var.c(w1Var.f11553b, i13, g6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(zr.f33337f);
        final gi.f4 f4Var = this.f32914b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.a.f(floatValue, color, i11);
                ri riVar2 = yh.this.e;
                riVar2.f30180q2 = f7;
                riVar2.f30177p2 = true;
                x7 x7Var = riVar2.f30130a1;
                if (x7Var != null) {
                    x7Var.updateColors();
                    x7Var.invalidate();
                }
                riVar2.L2.a(f7);
                kh.f fVar = riVar2.f30208y1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                f4Var.setCustomActionBarBackground(f7);
                riVar2.B0.invalidate();
                riVar2.f30193u1.invalidate();
                w1Var.b(x7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ri riVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
            if (o2Var instanceof org.telegram.ui.sn) {
                org.telegram.ui.gk gkVar = ((org.telegram.ui.sn) o2Var).Y;
                gkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            riVar.dismiss(true);
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
        org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
        Context context = riVar.getContext();
        int i10 = ri.U2;
        ud0 ud0Var = new ud0(context);
        eyVar.C2 = new a1.d(this, user, str, ud0Var, 9);
        ud0Var.show();
        ud0Var.c(eyVar);
    }

    @Override
    public final void y(boolean z10) {
        this.f32914b.setAllowSwipes(z10);
    }

    @Override
    public final void z() {
        ri riVar = this.e;
        if (riVar.B0 != this.f32914b) {
            return;
        }
        riVar.setFocusable(false);
        riVar.getWindow().setSoftInputMode(48);
        riVar.dismiss();
        AndroidUtilities.runOnUIThread(new pc(5), 150L);
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
    public final void x(int i10) {
    }

    @Override
    public final void o(int i10, boolean z10) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
