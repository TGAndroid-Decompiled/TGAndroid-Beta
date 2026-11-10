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
public final class oi0 implements org.telegram.messenger.a20, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.w10, org.telegram.ui.Cells.z4, org.telegram.messenger.oc, RequestTimeDelegate, org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.dj0, lg.e, jg.y1 {
    public final int f48532a;
    public final Object f48533b;

    public oi0(Object obj, int i7) {
        this.f48532a = i7;
        this.f48533b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7;
        int i10;
        View fragmentView;
        switch (this.f48532a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f48533b;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.f41622o0 = I0;
                premiumPreviewFragment.f41603a.setPadding(0, I0.f15123b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f41622o0.d);
                org.telegram.ui.Components.pj0 pj0Var = premiumPreviewFragment.f41603a;
                i0.b bVar = premiumPreviewFragment.f41622o0;
                org.telegram.messenger.g0.B3(pj0Var, bVar.f15122a, 0, bVar.f15124c, 0);
                xs0 xs0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f41622o0;
                xs0Var.setPadding(bVar2.f15122a, 0, bVar2.f15124c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f41622o0.f15122a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f41622o0;
                    frameLayout.setPadding(i11, L, bVar3.f15124c, bVar3.d);
                }
                return r0.k1.f54212b;
            default:
                me0 me0Var = (me0) ((rb1) this.f48533b);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i12 = I02.f15122a;
                me0Var.M = i12;
                int i13 = I02.f15124c;
                me0Var.N = i13;
                me0Var.L = I02.d;
                boolean a10 = me0Var.D.a();
                if (a10) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                } else {
                    i7 = 0;
                }
                me0Var.D.setPadding(0, 0, 0, me0Var.L);
                int L2 = org.telegram.messenger.g0.L(72.0f) + me0Var.L + i7;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) me0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    me0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (a10) {
                    i10 = me0Var.L + i7;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) me0Var.f49345c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    me0Var.f49345c.setLayoutParams(marginLayoutParams2);
                }
                me0Var.E.setPadding(i12, 0, i13, me0Var.L);
                if (a10) {
                    k1Var = k1Var.f54213a.m(0, 0, 0, me0Var.L);
                }
                me0Var.o0();
                me0Var.n0();
                SparseArray sparseArray = me0Var.f49343a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    pb1 pb1Var = (pb1) sparseArray.valueAt(i14);
                    if (pb1Var != null && (fragmentView = pb1Var.f48735a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f54212b;
        }
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f48532a) {
            case 5:
                ((cs0) this.f48533b).e();
                return;
            default:
                ((i81) this.f48533b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        ut0 ut0Var = (ut0) this.f48533b;
        if (z9) {
            ut0Var.d.Z((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f48532a) {
            case 16:
                return ((f21) this.f48533b).e1(i7, view);
            default:
                ((p81) this.f48533b).J.c(i7, view);
                return true;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((mt0) this.f48533b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.A0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232243, 0);
                    wpVar.f40038r = org.telegram.messenger.g0.L(2.0f);
                    wpVar.f40039s = org.telegram.messenger.g0.L(1.0f);
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
        switch (this.f48532a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.f48533b).f6019c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.S4, photoViewer.D, photoViewer.f41532v2, true);
                    photoViewer.z0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((sr0) this.f48533b).finishFragment();
                return;
            case 4:
                ((mr0) this.f48533b).f48045a.R.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f48533b;
                int i13 = PopupNotificationActivity.f41590b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.V6;
                ((xt0) this.f48533b).a(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((ki0) this.f48533b).f47313c;
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
                l4 l4Var = proxyListActivity.f41874a;
                if (l4Var != null) {
                    if (org.telegram.messenger.iz.B1 == null) {
                        l4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f41874a.F();
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity = ((x51) this.f48533b).f51537a;
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
                    h61 h61Var = themeActivity.f42009a;
                    i11 = themeActivity.textSizeRow;
                    h61Var.h(i11, new Object());
                    h61 h61Var2 = themeActivity.f42009a;
                    i12 = themeActivity.bubbleRadiusRow;
                    h61Var2.h(i12, new Object());
                }
                if (themeActivity.f42013c != null) {
                    org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0("Blue");
                    org.telegram.ui.ActionBar.l6 D0 = org.telegram.ui.ActionBar.m6.D0();
                    SparseArray sparseArray = Q0.f27766a0;
                    int i15 = org.telegram.ui.ActionBar.m6.f28066n;
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) sparseArray.get(i15);
                    if (j6Var != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = new org.telegram.ui.ActionBar.e6();
                        e6Var.f27450c = "d";
                        e6Var.f27448a = "Blue_99_wp.jpg";
                        e6Var.f27449b = "Blue_99_wp.jpg";
                        j6Var.f27630y = e6Var;
                        Q0.v(e6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.m6.z1(Q0, true, false, true, false, false);
                        themeActivity.f42013c.B1(Q0, null);
                        themeActivity.f42013c.y0(0);
                        return;
                    } else if (Q0.Y != i15) {
                        if (themeActivity.f42018f == 1) {
                            z9 = true;
                        }
                        org.telegram.ui.ActionBar.m6.K1(D0, z9, i15, null);
                        themeActivity.f42009a.g(themeActivity.f42030q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.m6.u1(true);
                        return;
                    }
                }
                return;
            case 19:
                x71 x71Var = ((b71) this.f48533b).f43976a;
                org.telegram.ui.ActionBar.l6 l6Var = x71Var.f51580f0;
                org.telegram.ui.ActionBar.m6.l0(l6Var, x71Var.f51620w, true);
                org.telegram.ui.ActionBar.m6.p();
                org.telegram.ui.ActionBar.m6.t1(false, false);
                org.telegram.messenger.qs.e().k(270, l6Var, Boolean.valueOf(x71Var.f51583g0), null, -1);
                x71Var.finishFragment();
                return;
            default:
                ((ab1) this.f48533b).f43630a.J0(true);
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f48532a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f48533b, (org.telegram.ui.Components.x31) obj, (View) obj2);
                return;
            default:
                ry0 ry0Var = (ry0) this.f48533b;
                org.telegram.ui.Components.x31 x31Var = (org.telegram.ui.Components.x31) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                sy0 sy0Var = ry0Var.f49603w;
                if (x31Var.f54543a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ry0Var.f49596b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(x31Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            sy0.I0(sy0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ry0Var.f49597c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(x31Var.d);
                        if (tL_messageReportOption != null) {
                            sy0.I0(sy0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = ry0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            sy0.I0(sy0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    sy0.I0(sy0Var, x31Var.f40156l, null, null);
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
        nb1 nb1Var = (nb1) this.f48533b;
        if (nb1Var.h == null && !nb1Var.f48178f.e()) {
            nb1Var.f48182w.f42076f.e(false, true);
        }
        nb1Var.f();
    }

    @Override
    public void r(Exception exc) {
        RectF rectF = ProfileActivity.V6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((jg.c1) this.f48533b).run();
    }

    @Override
    public void run(long j3) {
        org.telegram.messenger.g0.h3(new bi.r3((org.telegram.messenger.hz) this.f48533b, j3, 29));
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public void m1(ArrayList arrayList) {
    }
}
