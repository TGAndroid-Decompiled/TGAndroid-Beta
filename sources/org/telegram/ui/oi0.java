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
public final class oi0 implements org.telegram.messenger.u10, org.telegram.ui.Cells.v5, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.q10, org.telegram.ui.Cells.a5, org.telegram.messenger.mc, RequestTimeDelegate, org.telegram.ui.ActionBar.f2, org.telegram.ui.Components.sj0, lg.e, jg.y1 {
    public final int f50703a;
    public final Object f50704b;

    public oi0(Object obj, int i7) {
        this.f50703a = i7;
        this.f50704b = obj;
    }

    @Override
    public boolean W1(int i7) {
        return true;
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f50703a) {
            case 5:
                ((zr0) this.f50704b).e();
                return;
            default:
                ((g81) this.f50704b).e();
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        switch (this.f50703a) {
            case 16:
                return ((c21) this.f50704b).f1(i7, view);
            default:
                ((n81) this.f50704b).K.b(i7, view);
                return true;
        }
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        qt0 qt0Var = (qt0) this.f50704b;
        if (z10) {
            qt0Var.d.Z((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((jt0) this.f50704b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.B0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131232248, 0);
                    kqVar.f36853r = org.telegram.messenger.g0.L(2.0f);
                    kqVar.f36854s = org.telegram.messenger.g0.L(1.0f);
                    spannableString.setSpan(kqVar, 0, 1, 33);
                    privacyControlActivity.B0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.gd.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.gd.E(num.intValue(), ',');
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        switch (this.f50703a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.f50704b).f5118c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.T4, photoViewer.E, photoViewer.f43484w2, true);
                    photoViewer.z0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((pr0) this.f50704b).finishFragment();
                return;
            case 4:
                ((jr0) this.f50704b).f49200a.S.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f50704b;
                int i13 = PopupNotificationActivity.f43532c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.Z6;
                ((tt0) this.f50704b).a(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((ki0) this.f50704b).f49437c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.bz.i((org.telegram.messenger.az) obj);
                }
                if (org.telegram.messenger.bz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.ks.e().n(proxyListActivity, 280);
                org.telegram.messenger.ks.e().k(280, new Object[0]);
                org.telegram.messenger.ks.e().c(proxyListActivity, 280);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.f43819a;
                if (l4Var != null) {
                    if (org.telegram.messenger.bz.B1 == null) {
                        l4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f43819a.F();
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity = ((u51) this.f50704b).f52543a;
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
                    e61 e61Var = themeActivity.f43956a;
                    i11 = themeActivity.textSizeRow;
                    e61Var.h(i11, new Object());
                    e61 e61Var2 = themeActivity.f43956a;
                    i12 = themeActivity.bubbleRadiusRow;
                    e61Var2.h(i12, new Object());
                }
                if (themeActivity.f43960c != null) {
                    org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0("Blue");
                    org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
                    SparseArray sparseArray = Q0.f29323b0;
                    int i15 = org.telegram.ui.ActionBar.n6.f29627n;
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) sparseArray.get(i15);
                    if (k6Var != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = new org.telegram.ui.ActionBar.e6();
                        e6Var.f28982c = "d";
                        e6Var.f28980a = "Blue_99_wp.jpg";
                        e6Var.f28981b = "Blue_99_wp.jpg";
                        k6Var.f29245y = e6Var;
                        Q0.v(e6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.n6.z1(Q0, true, false, true, false, false);
                        themeActivity.f43960c.B1(Q0, null);
                        themeActivity.f43960c.y0(0);
                        return;
                    } else if (Q0.Z != i15) {
                        if (themeActivity.f43965f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.n6.K1(D0, z10, i15, null);
                        themeActivity.f43956a.g(themeActivity.f43979r0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.n6.u1(true);
                        return;
                    }
                }
                return;
            case 19:
                v71 v71Var = ((y61) this.f50704b).f54290a;
                org.telegram.ui.ActionBar.m6 m6Var = v71Var.f52867g0;
                org.telegram.ui.ActionBar.n6.l0(m6Var, v71Var.f52905w, true);
                org.telegram.ui.ActionBar.n6.p();
                org.telegram.ui.ActionBar.n6.t1(false, false);
                org.telegram.messenger.ks.e().k(273, m6Var, Boolean.valueOf(v71Var.f52870h0), null, -1);
                v71Var.finishFragment();
                return;
            default:
                ((xa1) this.f50704b).f53903a.J0(true);
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f50703a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f50704b, (org.telegram.ui.Components.n41) obj, (View) obj2);
                return;
            default:
                oy0 oy0Var = (oy0) this.f50704b;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                py0 py0Var = oy0Var.f50793w;
                if (n41Var.f56712a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = oy0Var.f50786b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(n41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            py0.J0(py0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = oy0Var.f50787c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(n41Var.d);
                        if (tL_messageReportOption != null) {
                            py0.J0(py0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = oy0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            py0.J0(py0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    py0.J0(py0Var, n41Var.f37655m, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int i7;
        int i10;
        View fragmentView;
        switch (this.f50703a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f50704b;
                i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
                premiumPreviewFragment.f43566p0 = I0;
                premiumPreviewFragment.f43546a.setPadding(0, I0.f15979b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f43566p0.d);
                org.telegram.ui.Components.ek0 ek0Var = premiumPreviewFragment.f43546a;
                i0.b bVar = premiumPreviewFragment.f43566p0;
                org.telegram.messenger.g0.z3(ek0Var, bVar.f15978a, 0, bVar.f15980c, 0);
                us0 us0Var = premiumPreviewFragment.V;
                i0.b bVar2 = premiumPreviewFragment.f43566p0;
                us0Var.setPadding(bVar2.f15978a, 0, bVar2.f15980c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f43566p0.f15978a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f43566p0;
                    frameLayout.setPadding(i11, L, bVar3.f15980c, bVar3.d);
                }
                return r0.l1.f56380b;
            default:
                le0 le0Var = (le0) ((ob1) this.f50704b);
                i0.b I02 = org.telegram.messenger.g0.I0(l1Var, false);
                int i12 = I02.f15978a;
                le0Var.N = i12;
                int i13 = I02.f15980c;
                le0Var.O = i13;
                le0Var.M = I02.d;
                boolean a10 = le0Var.E.a();
                if (a10) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                } else {
                    i7 = 0;
                }
                le0Var.E.setPadding(0, 0, 0, le0Var.M);
                int L2 = org.telegram.messenger.g0.L(72.0f) + le0Var.M + i7;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) le0Var.I.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    le0Var.I.setLayoutParams(marginLayoutParams);
                }
                if (a10) {
                    i10 = le0Var.M + i7;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) le0Var.f50634c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    le0Var.f50634c.setLayoutParams(marginLayoutParams2);
                }
                le0Var.F.setPadding(i12, 0, i13, le0Var.M);
                if (a10) {
                    l1Var = l1Var.f56381a.m(0, 0, 0, le0Var.M);
                }
                le0Var.o0();
                le0Var.n0();
                SparseArray sparseArray = le0Var.f50632a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    mb1 mb1Var = (mb1) sparseArray.valueAt(i14);
                    if (mb1Var != null && (fragmentView = mb1Var.f50028a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f56380b;
        }
    }

    @Override
    public void run(long j3) {
        org.telegram.messenger.g0.g3(new ox0((org.telegram.messenger.az) this.f50704b, j3, 0));
    }

    @Override
    public void s(Exception exc) {
        RectF rectF = ProfileActivity.Z6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((bi.i5) this.f50704b).run();
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        kb1 kb1Var = (kb1) this.f50704b;
        if (kb1Var.h == null && !kb1Var.f49393f.e()) {
            kb1Var.f49397w.f44024f.e(false, true);
        }
        kb1Var.f();
    }

    @Override
    public void m2(ArrayList arrayList) {
    }
}
