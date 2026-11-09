package org.telegram.ui;

import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
public final class ni0 implements org.telegram.messenger.a20, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.w10, org.telegram.ui.Cells.z4, org.telegram.messenger.oc, RequestTimeDelegate, org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.ej0, lg.e, jg.y1 {
    public final int f48196a;
    public final Object f48197b;

    public ni0(Object obj, int i7) {
        this.f48196a = i7;
        this.f48197b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7;
        int i10;
        View fragmentView;
        switch (this.f48196a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f48197b;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.f41631o0 = I0;
                premiumPreviewFragment.f41612a.setPadding(0, I0.f15121b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f41631o0.d);
                org.telegram.ui.Components.qj0 qj0Var = premiumPreviewFragment.f41612a;
                i0.b bVar = premiumPreviewFragment.f41631o0;
                org.telegram.messenger.g0.B3(qj0Var, bVar.f15120a, 0, bVar.f15122c, 0);
                ws0 ws0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f41631o0;
                ws0Var.setPadding(bVar2.f15120a, 0, bVar2.f15122c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f41631o0.f15120a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f41631o0;
                    frameLayout.setPadding(i11, L, bVar3.f15122c, bVar3.d);
                }
                return r0.k1.f54213b;
            default:
                le0 le0Var = (le0) ((qb1) this.f48197b);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i12 = I02.f15120a;
                le0Var.M = i12;
                int i13 = I02.f15122c;
                le0Var.N = i13;
                le0Var.L = I02.d;
                boolean a10 = le0Var.D.a();
                if (a10) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                } else {
                    i7 = 0;
                }
                le0Var.D.setPadding(0, 0, 0, le0Var.L);
                int L2 = org.telegram.messenger.g0.L(72.0f) + le0Var.L + i7;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) le0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    le0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (a10) {
                    i10 = le0Var.L + i7;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) le0Var.f49014c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    le0Var.f49014c.setLayoutParams(marginLayoutParams2);
                }
                le0Var.E.setPadding(i12, 0, i13, le0Var.L);
                if (a10) {
                    k1Var = k1Var.f54214a.m(0, 0, 0, le0Var.L);
                }
                le0Var.o0();
                le0Var.n0();
                SparseArray sparseArray = le0Var.f49012a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ob1 ob1Var = (ob1) sparseArray.valueAt(i14);
                    if (ob1Var != null && (fragmentView = ob1Var.f48422a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f54213b;
        }
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f48196a) {
            case 5:
                ((bs0) this.f48197b).e();
                return;
            default:
                ((h81) this.f48197b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        tt0 tt0Var = (tt0) this.f48197b;
        if (z9) {
            tt0Var.d.Z((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f48196a) {
            case 16:
                return ((e21) this.f48197b).e1(i7, view);
            default:
                ((o81) this.f48197b).J.c(i7, view);
                return true;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((lt0) this.f48197b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.A0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232243, 0);
                    wpVar.f40120r = org.telegram.messenger.g0.L(2.0f);
                    wpVar.f40121s = org.telegram.messenger.g0.L(1.0f);
                    spannableString.setSpan(wpVar, 0, 1, 33);
                    privacyControlActivity.A0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.A0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.id.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.id.E(num.intValue(), ',');
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        boolean z9 = false;
        switch (this.f48196a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.f48197b).f6014c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.S4, photoViewer.D, photoViewer.f41541v2, true);
                    photoViewer.z0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((rr0) this.f48197b).finishFragment();
                return;
            case 4:
                ((lr0) this.f48197b).f47670a.R.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f48197b;
                int i13 = PopupNotificationActivity.f41599b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.V6;
                ((wt0) this.f48197b).a(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((ji0) this.f48197b).f46977c;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.iz.i((org.telegram.messenger.hz) obj);
                }
                if (org.telegram.messenger.iz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.qs.e().n(proxyListActivity, 277);
                org.telegram.messenger.qs.e().k(277, new Object[0]);
                org.telegram.messenger.qs.e().c(proxyListActivity, 277);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.f41883a;
                if (l4Var != null) {
                    if (org.telegram.messenger.iz.B1 == null) {
                        l4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f41883a.F();
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity = ((w51) this.f48197b).f50880a;
                if (org.telegram.messenger.g0.Q1()) {
                    i10 = 18;
                } else {
                    i10 = 16;
                }
                boolean p02 = ThemeActivity.p0(themeActivity, i10);
                if (ThemeActivity.d0(themeActivity, 17, true)) {
                    p02 = true;
                }
                if (p02) {
                    g61 g61Var = themeActivity.f42018a;
                    i11 = themeActivity.textSizeRow;
                    g61Var.h(i11, new Object());
                    g61 g61Var2 = themeActivity.f42018a;
                    i12 = themeActivity.bubbleRadiusRow;
                    g61Var2.h(i12, new Object());
                }
                if (themeActivity.f42022c != null) {
                    org.telegram.ui.ActionBar.k6 Q0 = org.telegram.ui.ActionBar.l6.Q0("Blue");
                    org.telegram.ui.ActionBar.k6 D0 = org.telegram.ui.ActionBar.l6.D0();
                    SparseArray sparseArray = Q0.f27737a0;
                    int i15 = org.telegram.ui.ActionBar.l6.f28041n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i15);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.f27430c = "d";
                        d6Var.f27428a = "Blue_99_wp.jpg";
                        d6Var.f27429b = "Blue_99_wp.jpg";
                        i6Var.f27592y = d6Var;
                        Q0.v(d6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.l6.z1(Q0, true, false, true, false, false);
                        themeActivity.f42022c.B1(Q0, null);
                        themeActivity.f42022c.y0(0);
                        return;
                    } else if (Q0.Y != i15) {
                        if (themeActivity.f42027f == 1) {
                            z9 = true;
                        }
                        org.telegram.ui.ActionBar.l6.K1(D0, z9, i15, null);
                        themeActivity.f42018a.g(themeActivity.f42039q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.l6.u1(true);
                        return;
                    }
                }
                return;
            case 19:
                w71 w71Var = ((a71) this.f48197b).f43635a;
                org.telegram.ui.ActionBar.k6 k6Var = w71Var.f50921f0;
                org.telegram.ui.ActionBar.l6.l0(k6Var, w71Var.f50961w, true);
                org.telegram.ui.ActionBar.l6.p();
                org.telegram.ui.ActionBar.l6.t1(false, false);
                org.telegram.messenger.qs.e().k(270, k6Var, Boolean.valueOf(w71Var.f50924g0), null, -1);
                w71Var.finishFragment();
                return;
            default:
                ((za1) this.f48197b).f52483a.J0(true);
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f48196a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f48197b, (org.telegram.ui.Components.y31) obj, (View) obj2);
                return;
            default:
                qy0 qy0Var = (qy0) this.f48197b;
                org.telegram.ui.Components.y31 y31Var = (org.telegram.ui.Components.y31) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                ry0 ry0Var = qy0Var.f49224w;
                if (y31Var.f54544a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = qy0Var.f49217b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(y31Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            ry0.I0(ry0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = qy0Var.f49218c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(y31Var.d);
                        if (tL_messageReportOption != null) {
                            ry0.I0(ry0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = qy0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            ry0.I0(ry0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    ry0.I0(ry0Var, y31Var.f40568l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void q(int i7) {
        mb1 mb1Var = (mb1) this.f48197b;
        if (mb1Var.h == null && !mb1Var.f47845f.e()) {
            mb1Var.f47849w.f42085f.e(false, true);
        }
        mb1Var.f();
    }

    @Override
    public void r(Exception exc) {
        RectF rectF = ProfileActivity.V6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((jg.c1) this.f48197b).run();
    }

    @Override
    public void run(long j3) {
        org.telegram.messenger.g0.h3(new bi.r3((org.telegram.messenger.hz) this.f48197b, j3, 29));
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public void m1(ArrayList arrayList) {
    }
}
