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
    public ValueAnimator f28464a;
    public final rh.o3 f28465b;
    public final String f28466c;
    public final long d;
    public final li e;

    public rh(li liVar, rh.o3 o3Var, String str, long j10) {
        this.e = liVar;
        this.f28465b = o3Var;
        this.f28466c = str;
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
        this.f28465b.setNeedCloseConfirmation(z4);
    }

    @Override
    public final void m(int i10) {
        this.f28465b.setCustomBackground(i10);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        org.telegram.ui.ActionBar.f6 f6Var;
        li liVar = this.e;
        int i10 = liVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        boolean z4 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        rh.o3 o3Var = this.f28465b;
        org.telegram.ui.jo0 jo0Var = null;
        if (z4) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(liVar.getContext(), 3, null);
            d2Var.q(150L);
            lh.t7.y(i10, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new c2(d2Var, 1), new kh.a1(29, o3Var, str));
            AndroidUtilities.hideKeyboard(o3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i10).putUsers(paymentForm.users, false);
            jo0Var = new org.telegram.ui.jo0(paymentForm, null, str, p2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            jo0Var = new org.telegram.ui.jo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (jo0Var != null) {
            o3Var.F();
            AndroidUtilities.hideKeyboard(o3Var);
            Activity parentActivity = p2Var.getParentActivity();
            int i11 = li.L2;
            bd0 bd0Var = new bd0(parentActivity);
            bd0Var.show();
            jo0Var.W0 = new androidx.car.app.utils.a(bd0Var, o3Var, str, 19);
            f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
            jo0Var.V0 = f6Var;
            bd0Var.c(jo0Var);
        }
    }

    @Override
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        int i12;
        float f10;
        float f11;
        float f12;
        li liVar = this.e;
        RadialProgressView radialProgressView = liVar.f26764z1;
        k6 k6Var = liVar.B1;
        di diVar = liVar.f26748v0;
        rh.o3 o3Var = this.f28465b;
        if (diVar == o3Var) {
            if (o3Var.M || this.f28466c != null) {
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
                k6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(i10, i12));
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (liVar.A1 != z4) {
                    liVar.A1 = z4;
                    ValueAnimator valueAnimator = this.f28464a;
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
                    this.f28464a = duration;
                    duration.addUpdateListener(new f6(this, 9));
                    this.f28464a.addListener(new ih(this, z4, 0));
                    this.f28464a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (liVar.f26761y1 != z11) {
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
        di diVar = this.e.f26748v0;
        rh.o3 o3Var = this.f28465b;
        if (diVar == o3Var && !o3Var.G.f43629c) {
            o3Var.F();
        }
    }

    @Override
    public final void t(boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.g1 g1Var = this.f28465b.I;
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
        final int color = liVar.C2.f44309a.getColor();
        final rh.p1 p1Var = new rh.p1();
        int i13 = 0;
        if (liVar.X) {
            i12 = color;
        } else {
            i12 = 0;
        }
        f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        p1Var.c(p1Var.f43652a, i12, f6Var);
        liVar.X = z4;
        if (z4) {
            i13 = i11;
        }
        f6Var2 = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        p1Var.c(p1Var.f43653b, i13, f6Var2);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(nr.f27346f);
        final rh.o3 o3Var = this.f28465b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int d = i0.a.d(floatValue, color, i11);
                li liVar2 = rh.this.e;
                liVar2.f26716k2 = d;
                liVar2.f26713j2 = true;
                eg.l1 l1Var = liVar2.U0;
                if (l1Var != null) {
                    l1Var.e();
                    l1Var.invalidate();
                }
                liVar2.C2.a(d);
                wg.f fVar = liVar2.f26740s1;
                if (fVar != null) {
                    fVar.invalidate();
                }
                o3Var.setCustomActionBarBackground(d);
                liVar2.f26748v0.invalidate();
                liVar2.f26726o1.invalidate();
                p1Var.b(l1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        li liVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
            if (p2Var instanceof org.telegram.ui.xn) {
                org.telegram.ui.jk jkVar = ((org.telegram.ui.xn) p2Var).V;
                jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        org.telegram.ui.oy oyVar = new org.telegram.ui.oy(bundle);
        Context context = liVar.getContext();
        int i10 = li.L2;
        bd0 bd0Var = new bd0(context);
        oyVar.f37131z2 = new a1.d(this, user, str, bd0Var, 8);
        bd0Var.show();
        bd0Var.c(oyVar);
    }

    @Override
    public final void x(boolean z4) {
        this.f28465b.setAllowSwipes(z4);
    }

    @Override
    public final void y() {
        li liVar = this.e;
        if (liVar.f26748v0 != this.f28465b) {
            return;
        }
        liVar.setFocusable(false);
        liVar.getWindow().setSoftInputMode(48);
        liVar.dismiss();
        AndroidUtilities.runOnUIThread(new mc(3), 150L);
    }

    @Override
    public final rh.v0 z() {
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
