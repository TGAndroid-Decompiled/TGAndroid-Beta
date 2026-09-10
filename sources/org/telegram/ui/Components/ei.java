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
public final class ei implements org.telegram.ui.web.h0 {
    public ValueAnimator f22712a;
    public final di.u4 f22713b;
    public final String f22714c;
    public final long d;
    public final yi e;

    public ei(yi yiVar, di.u4 u4Var, String str, long j3) {
        this.e = yiVar;
        this.f22713b = u4Var;
        this.f22714c = str;
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
        yi yiVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(yiVar.J1);
        long j3 = this.d;
        if (!mediaDataController.botInAttachMenu(j3) && !MessagesController.getInstance(yiVar.J1).whitelistedBots.contains(Long.valueOf(j3))) {
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
        this.f22713b.setNeedCloseConfirmation(z10);
    }

    @Override
    public final void m(int i10) {
        this.f22713b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.f6 f6Var;
        yi yiVar = this.e;
        int i10 = yiVar.J1;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        di.u4 u4Var = this.f22713b;
        org.telegram.ui.wo0 wo0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(yiVar.getContext(), 3, null);
            d2Var.q(150L);
            xh.v5.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new d2(d2Var, 1), new org.telegram.ui.pf(12, u4Var, str));
            AndroidUtilities.hideKeyboard(u4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            wo0Var = new org.telegram.ui.wo0(paymentForm, null, str, p2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            wo0Var = new org.telegram.ui.wo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (wo0Var != null) {
            u4Var.F();
            AndroidUtilities.hideKeyboard(u4Var);
            Activity parentActivity = p2Var.getParentActivity();
            int i11 = yi.O2;
            id0 id0Var = new id0(parentActivity);
            id0Var.show();
            wo0Var.Z0 = new androidx.car.app.utils.a(id0Var, u4Var, str, 22);
            f6Var = ((org.telegram.ui.ActionBar.h3) yiVar).resourcesProvider;
            wo0Var.Y0 = f6Var;
            id0Var.c(wo0Var);
        }
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        int i12;
        float f7;
        float f10;
        float f11;
        yi yiVar = this.e;
        RadialProgressView radialProgressView = yiVar.C1;
        o6 o6Var = yiVar.E1;
        qi qiVar = yiVar.f29427y0;
        di.u4 u4Var = this.f22713b;
        if (qiVar == u4Var) {
            if (u4Var.P || this.f22714c != null) {
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
                boolean z14 = org.telegram.ui.web.c1.P0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                o6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(i10, i12));
                float f12 = 0.0f;
                float f13 = 1.0f;
                if (yiVar.D1 != z10) {
                    yiVar.D1 = z10;
                    ValueAnimator valueAnimator = this.f22712a;
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
                    this.f22712a = duration;
                    duration.addUpdateListener(new j6(this, 9));
                    this.f22712a.addListener(new wh(this, z10, 0));
                    this.f22712a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (yiVar.B1 != z12) {
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
                    scaleX.scaleY(f13).setDuration(250L).setListener(new wh(this, z12, 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        qi qiVar = this.e.f29427y0;
        di.u4 u4Var = this.f22713b;
        if (qiVar == u4Var && !u4Var.J.f6918c) {
            u4Var.F();
        }
    }

    @Override
    public final void t(boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f22713b.L;
        if (g1Var != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            g1Var.setVisibility(i10);
        }
    }

    @Override
    public final void u(int i10, final int i11, boolean z10) {
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        yi yiVar = this.e;
        final int color = yiVar.F2.f7517a.getColor();
        final di.f2 f2Var = new di.f2();
        int i13 = 0;
        if (yiVar.f29349a0) {
            i12 = color;
        } else {
            i12 = 0;
        }
        f6Var = ((org.telegram.ui.ActionBar.h3) yiVar).resourcesProvider;
        f2Var.c(f2Var.f6625a, i12, f6Var);
        yiVar.f29349a0 = z10;
        if (z10) {
            i13 = i11;
        }
        f6Var2 = ((org.telegram.ui.ActionBar.h3) yiVar).resourcesProvider;
        f2Var.c(f2Var.f6626b, i13, f6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(wr.f28819f);
        final di.u4 u4Var = this.f22713b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                yi yiVar2 = ei.this.e;
                yiVar2.f29391n2 = d;
                yiVar2.f29387m2 = true;
                y7 y7Var = yiVar2.X0;
                if (y7Var != null) {
                    y7Var.e();
                    y7Var.invalidate();
                }
                yiVar2.F2.a(d);
                ih.f fVar = yiVar2.f29416v1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                u4Var.setCustomActionBarBackground(d);
                yiVar2.f29427y0.invalidate();
                yiVar2.f29403r1.invalidate();
                f2Var.b(y7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        yi yiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
            if (p2Var instanceof org.telegram.ui.eo) {
                org.telegram.ui.ok okVar = ((org.telegram.ui.eo) p2Var).Y;
                okVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            yiVar.dismiss(true);
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
        org.telegram.ui.wy wyVar = new org.telegram.ui.wy(bundle);
        Context context = yiVar.getContext();
        int i10 = yi.O2;
        id0 id0Var = new id0(context);
        wyVar.C2 = new a1.d(this, user, str, id0Var, 7);
        id0Var.show();
        id0Var.c(wyVar);
    }

    @Override
    public final void x(boolean z10) {
        this.f22713b.setAllowSwipes(z10);
    }

    @Override
    public final void y() {
        yi yiVar = this.e;
        if (yiVar.f29427y0 != this.f22713b) {
            return;
        }
        yiVar.setFocusable(false);
        yiVar.getWindow().setSoftInputMode(48);
        yiVar.dismiss();
        AndroidUtilities.runOnUIThread(new bi.f0(25), 150L);
    }

    @Override
    public final di.d1 z() {
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
