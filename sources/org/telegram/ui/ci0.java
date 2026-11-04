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
public final class ci0 implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.s10, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.e1, r0.m, org.telegram.messenger.o10, org.telegram.ui.Cells.z4, org.telegram.messenger.ic, RequestTimeDelegate, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.hj0, mg.e, kg.u1 {
    public final int f44361a;
    public final Object f44362b;

    public ci0(Object obj, int i3) {
        this.f44361a = i3;
        this.f44362b = obj;
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        int i3;
        int i10;
        View fragmentView;
        switch (this.f44361a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f44362b;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.f41652p0 = I0;
                premiumPreviewFragment.f41632a.setPadding(0, I0.f14496b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f41652p0.d);
                org.telegram.ui.Components.tj0 tj0Var = premiumPreviewFragment.f41632a;
                i0.b bVar = premiumPreviewFragment.f41652p0;
                org.telegram.messenger.g0.B3(tj0Var, bVar.f14495a, 0, bVar.f14497c, 0);
                ks0 ks0Var = premiumPreviewFragment.V;
                i0.b bVar2 = premiumPreviewFragment.f41652p0;
                ks0Var.setPadding(bVar2.f14495a, 0, bVar2.f14497c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f41652p0.f14495a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f41652p0;
                    frameLayout.setPadding(i11, L, bVar3.f14497c, bVar3.d);
                }
                return r0.k1.f54025b;
            default:
                ee0 ee0Var = (ee0) ((gb1) this.f44362b);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i12 = I02.f14495a;
                ee0Var.N = i12;
                int i13 = I02.f14497c;
                ee0Var.O = i13;
                ee0Var.M = I02.d;
                boolean a10 = ee0Var.E.a();
                if (a10) {
                    i3 = org.telegram.messenger.g0.L(44.0f);
                } else {
                    i3 = 0;
                }
                ee0Var.E.setPadding(0, 0, 0, ee0Var.M);
                int L2 = org.telegram.messenger.g0.L(72.0f) + ee0Var.M + i3;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ee0Var.I.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    ee0Var.I.setLayoutParams(marginLayoutParams);
                }
                if (a10) {
                    i10 = ee0Var.M + i3;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ee0Var.f45622c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    ee0Var.f45622c.setLayoutParams(marginLayoutParams2);
                }
                ee0Var.F.setPadding(i12, 0, i13, ee0Var.M);
                if (a10) {
                    k1Var = k1Var.f54026a.m(0, 0, 0, ee0Var.M);
                }
                ee0Var.o0();
                ee0Var.n0();
                SparseArray sparseArray = ee0Var.f45620a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    eb1 eb1Var = (eb1) sparseArray.valueAt(i14);
                    if (eb1Var != null && (fragmentView = eb1Var.f44954a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f54025b;
        }
    }

    @Override
    public void a() {
        switch (this.f44361a) {
            case 6:
                ((pr0) this.f44362b).e();
                return;
            default:
                ((w71) this.f44362b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ht0 ht0Var = (ht0) this.f44362b;
        if (z10) {
            ht0Var.d.Z((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((at0) this.f44362b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.B0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232243, 0);
                    wpVar.f40045r = org.telegram.messenger.g0.L(2.0f);
                    wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
                    spannableString.setSpan(wpVar, 0, 1, 33);
                    privacyControlActivity.B0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.bd.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.bd.E(num.intValue(), ',');
    }

    @Override
    public boolean f(int i3, View view) {
        switch (this.f44361a) {
            case 17:
                return ((s11) this.f44362b).e1(i3, view);
            default:
                ((d81) this.f44362b).K.f(i3, view);
                return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        switch (this.f44361a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f44362b;
                org.telegram.messenger.az.f21661s = "";
                org.telegram.messenger.az.f21675x = false;
                org.telegram.messenger.az.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f41356c.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 < childCount) {
                        View childAt = passcodeActivity.f41356c.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.v9) {
                            org.telegram.ui.ActionBar.r6.V(((org.telegram.ui.Cells.v9) childAt).getTextView(), org.telegram.ui.ActionBar.k6.E6, null);
                        } else {
                            i13++;
                        }
                    }
                }
                org.telegram.messenger.hs.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((ba.i) this.f44362b).f3187c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.U4, photoViewer.E, photoViewer.f41570w2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                ((fr0) this.f44362b).finishFragment();
                return;
            case 5:
                ((zq0) this.f44362b).f52741a.S.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f44362b;
                int i14 = PopupNotificationActivity.f41618c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 11:
                RectF rectF = ProfileActivity.T6;
                ((kt0) this.f44362b).a(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((fi0) this.f44362b).f45290c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    org.telegram.messenger.az.i((org.telegram.messenger.zy) obj);
                }
                if (org.telegram.messenger.az.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.hs.e().n(proxyListActivity, 277);
                org.telegram.messenger.hs.e().k(277, new Object[0]);
                org.telegram.messenger.hs.e().c(proxyListActivity, 277);
                proxyListActivity.h0(true);
                n4 n4Var = proxyListActivity.f41904a;
                if (n4Var != null) {
                    if (org.telegram.messenger.az.B1 == null) {
                        n4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f41904a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((l51) this.f44362b).f47110a;
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
                    v51 v51Var = themeActivity.f42041a;
                    i11 = themeActivity.textSizeRow;
                    v51Var.h(i11, new Object());
                    v51 v51Var2 = themeActivity.f42041a;
                    i12 = themeActivity.bubbleRadiusRow;
                    v51Var2.h(i12, new Object());
                }
                if (themeActivity.f42045c != null) {
                    org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0("Blue");
                    org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
                    SparseArray sparseArray = Q0.f27678b0;
                    int i16 = org.telegram.ui.ActionBar.k6.f28056n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i16);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f27424c = "d";
                        b6Var.f27422a = "Blue_99_wp.jpg";
                        b6Var.f27423b = "Blue_99_wp.jpg";
                        g6Var.f27546y = b6Var;
                        Q0.v(b6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i16);
                        org.telegram.ui.ActionBar.k6.z1(Q0, true, false, true, false, false);
                        themeActivity.f42045c.B1(Q0, null);
                        themeActivity.f42045c.y0(0);
                        return;
                    } else if (Q0.Z != i16) {
                        if (themeActivity.f42050f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.k6.K1(D0, z10, i16, null);
                        themeActivity.f42041a.g(themeActivity.f42064r0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.k6.u1(true);
                        return;
                    }
                }
                return;
            case 20:
                l71 l71Var = ((p61) this.f44362b).f48479a;
                org.telegram.ui.ActionBar.j6 j6Var = l71Var.f47163g0;
                org.telegram.ui.ActionBar.k6.l0(j6Var, l71Var.f47201w, true);
                org.telegram.ui.ActionBar.k6.p();
                org.telegram.ui.ActionBar.k6.t1(false, false);
                org.telegram.messenger.hs.e().k(270, j6Var, Boolean.valueOf(l71Var.f47166h0), null, -1);
                l71Var.finishFragment();
                return;
            default:
                ((pa1) this.f44362b).f48503a.J0(true);
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f44361a) {
            case 1:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f44362b, (org.telegram.ui.Components.r31) obj, (View) obj2);
                return;
            default:
                dy0 dy0Var = (dy0) this.f44362b;
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                ey0 ey0Var = dy0Var.f44836w;
                if (r31Var.f54715a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = dy0Var.f44829b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(r31Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            ey0.I0(ey0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = dy0Var.f44830c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(r31Var.d);
                        if (tL_messageReportOption != null) {
                            ey0.I0(ey0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = dy0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            ey0.I0(ey0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    ey0.I0(ey0Var, r31Var.f37627l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public void r(int i3) {
        cb1 cb1Var = (cb1) this.f44362b;
        if (cb1Var.h == null && !cb1Var.f44289f.e()) {
            cb1Var.f44293w.f42109f.e(false, true);
        }
        cb1Var.f();
    }

    @Override
    public void run(long j10) {
        org.telegram.messenger.g0.h3(new ci.e3((org.telegram.messenger.zy) this.f44362b, j10, 29));
    }

    @Override
    public void s(Exception exc) {
        RectF rectF = ProfileActivity.T6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((ai.d3) this.f44362b).run();
    }

    @Override
    public void b2(ArrayList arrayList) {
    }
}
