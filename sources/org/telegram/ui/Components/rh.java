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
public final class rh implements org.telegram.ui.web.g0 {
    public ValueAnimator f28471a;
    public final rh.n3 f28472b;
    public final String f28473c;
    public final long d;
    public final li e;

    public rh(li liVar, rh.n3 n3Var, String str, long j10) {
        this.e = liVar;
        this.f28472b = n3Var;
        this.f28473c = str;
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
        li liVar = this.e;
        MediaDataController mediaDataController = MediaDataController.getInstance(liVar.G1);
        long j10 = this.d;
        if (!mediaDataController.botInAttachMenu(j10) && !MessagesController.getInstance(liVar.G1).whitelistedBots.contains(Long.valueOf(j10))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z4) {
        int i10;
        ImageView backButton = this.e.U0.getBackButton();
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
        this.f28472b.setNeedCloseConfirmation(z4);
    }

    @Override
    public final void m(int i10) {
        this.f28472b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.f6 f6Var;
        li liVar = this.e;
        int i10 = liVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
        boolean z4 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        rh.n3 n3Var = this.f28472b;
        org.telegram.ui.lo0 lo0Var = null;
        if (z4) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(liVar.getContext(), 3, null);
            d2Var.q(150L);
            lh.t7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(d2Var, 1), new kh.a1(29, n3Var, str));
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
            int i11 = li.L2;
            cd0 cd0Var = new cd0(parentActivity);
            cd0Var.show();
            lo0Var.W0 = new androidx.car.app.utils.a(cd0Var, n3Var, str, 19);
            f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
            lo0Var.V0 = f6Var;
            cd0Var.c(lo0Var);
        }
    }

    @Override
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        int i12;
        float f10;
        float f11;
        float f12;
        li liVar = this.e;
        RadialProgressView radialProgressView = liVar.f26760z1;
        k6 k6Var = liVar.B1;
        di diVar = liVar.f26744v0;
        rh.n3 n3Var = this.f28472b;
        if (diVar == n3Var) {
            if (n3Var.M || this.f28473c != null) {
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
                boolean z13 = org.telegram.ui.web.c1.M0;
                if (i0.a.f(i10) >= 0.30000001192092896d) {
                    i12 = 301989888;
                } else {
                    i12 = 385875967;
                }
                k6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(i10, i12));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (liVar.A1 != z4) {
                    liVar.A1 = z4;
                    ValueAnimator valueAnimator = this.f28471a;
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
                    this.f28471a = duration;
                    duration.addUpdateListener(new f6(this, 9));
                    this.f28471a.addListener(new ih(this, z4, 0));
                    this.f28471a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (liVar.f26757y1 != z11) {
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
        di diVar = this.e.f26744v0;
        rh.n3 n3Var = this.f28472b;
        if (diVar == n3Var && !n3Var.G.f43681c) {
            n3Var.F();
        }
    }

    @Override
    public final void t(boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f28472b.I;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        li liVar = this.e;
        final int color = liVar.C2.f44374a.getColor();
        final rh.o1 o1Var = new rh.o1();
        int i13 = 0;
        if (liVar.X) {
            i12 = color;
        } else {
            i12 = 0;
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        o1Var.c(o1Var.f43704a, i12, f6Var);
        liVar.X = z4;
        if (z4) {
            i13 = i11;
        }
        f6Var2 = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        o1Var.c(o1Var.f43705b, i13, f6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(mr.f27122f);
        final rh.n3 n3Var = this.f28472b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                li liVar2 = rh.this.e;
                liVar2.f26712k2 = d;
                liVar2.f26709j2 = true;
                eg.l1 l1Var = liVar2.U0;
                if (l1Var != null) {
                    l1Var.e();
                    l1Var.invalidate();
                }
                liVar2.C2.a(d);
                wg.f fVar = liVar2.f26736s1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                n3Var.setCustomActionBarBackground(d);
                liVar2.f26744v0.invalidate();
                liVar2.f26722o1.invalidate();
                o1Var.b(l1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        li liVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
            if (p2Var instanceof org.telegram.ui.zn) {
                org.telegram.ui.lk lkVar = ((org.telegram.ui.zn) p2Var).V;
                lkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
            }
            liVar.dismiss(true);
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
        org.telegram.ui.qy qyVar = new org.telegram.ui.qy(bundle);
        Context context = liVar.getContext();
        int i10 = li.L2;
        cd0 cd0Var = new cd0(context);
        qyVar.f37649z2 = new a1.d(this, user, str, cd0Var, 8);
        cd0Var.show();
        cd0Var.c(qyVar);
    }

    @Override
    public final void x(boolean z4) {
        this.f28472b.setAllowSwipes(z4);
    }

    @Override
    public final void y() {
        li liVar = this.e;
        if (liVar.f26744v0 != this.f28472b) {
            return;
        }
        liVar.setFocusable(false);
        liVar.getWindow().setSoftInputMode(48);
        liVar.dismiss();
        AndroidUtilities.runOnUIThread(new mc(3), 150L);
    }

    @Override
    public final rh.u0 z() {
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
