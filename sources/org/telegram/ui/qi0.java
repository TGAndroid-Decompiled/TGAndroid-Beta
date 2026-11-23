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
public final class qi0 implements org.telegram.messenger.w10, org.telegram.ui.Cells.w5, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.s10, org.telegram.ui.Cells.a5, org.telegram.messenger.nc, RequestTimeDelegate, org.telegram.ui.ActionBar.f2, org.telegram.ui.Components.sj0, lg.e, jg.y1 {
    public final int f51224a;
    public final Object f51225b;

    public qi0(Object obj, int i7) {
        this.f51224a = i7;
        this.f51225b = obj;
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7;
        int i10;
        View fragmentView;
        switch (this.f51224a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f51225b;
                i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
                premiumPreviewFragment.f43450p0 = I0;
                premiumPreviewFragment.f43430a.setPadding(0, I0.f15884b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f43450p0.d);
                org.telegram.ui.Components.ek0 ek0Var = premiumPreviewFragment.f43430a;
                i0.b bVar = premiumPreviewFragment.f43450p0;
                org.telegram.messenger.g0.z3(ek0Var, bVar.f15883a, 0, bVar.f15885c, 0);
                ws0 ws0Var = premiumPreviewFragment.V;
                i0.b bVar2 = premiumPreviewFragment.f43450p0;
                ws0Var.setPadding(bVar2.f15883a, 0, bVar2.f15885c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f43450p0.f15883a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f43450p0;
                    frameLayout.setPadding(i11, L, bVar3.f15885c, bVar3.d);
                }
                return r0.l1.f56267b;
            default:
                le0 le0Var = (le0) ((qb1) this.f51225b);
                i0.b I02 = org.telegram.messenger.g0.I0(l1Var, false);
                int i12 = I02.f15883a;
                le0Var.N = i12;
                int i13 = I02.f15885c;
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
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) le0Var.f51134c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    le0Var.f51134c.setLayoutParams(marginLayoutParams2);
                }
                le0Var.F.setPadding(i12, 0, i13, le0Var.M);
                if (a10) {
                    l1Var = l1Var.f56268a.m(0, 0, 0, le0Var.M);
                }
                le0Var.o0();
                le0Var.n0();
                SparseArray sparseArray = le0Var.f51132a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ob1 ob1Var = (ob1) sparseArray.valueAt(i14);
                    if (ob1Var != null && (fragmentView = ob1Var.f50523a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f56267b;
        }
    }

    @Override
    public void a() {
        switch (this.f51224a) {
            case 5:
                ((bs0) this.f51225b).e();
                return;
            default:
                ((i81) this.f51225b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        st0 st0Var = (st0) this.f51225b;
        if (z10) {
            st0Var.d.Z((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f51224a) {
            case 16:
                return ((d21) this.f51225b).f1(i7, view);
            default:
                ((p81) this.f51225b).K.c(i7, view);
                return true;
        }
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((lt0) this.f51225b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.B0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131232245, 0);
                    nqVar.f37907r = org.telegram.messenger.g0.L(2.0f);
                    nqVar.f37908s = org.telegram.messenger.g0.L(1.0f);
                    spannableString.setSpan(nqVar, 0, 1, 33);
                    privacyControlActivity.B0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.B0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.hd.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.hd.E(num.intValue(), ',');
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        switch (this.f51224a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.f51225b).f5118c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.T4, photoViewer.E, photoViewer.f43368w2, true);
                    photoViewer.z0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((qr0) this.f51225b).finishFragment();
                return;
            case 4:
                ((kr0) this.f51225b).f49346a.S.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f51225b;
                int i13 = PopupNotificationActivity.f43416c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.Z6;
                ((vt0) this.f51225b).a(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((mi0) this.f51225b).f49857c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.cz.i((org.telegram.messenger.bz) obj);
                }
                if (org.telegram.messenger.cz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.ls.e().n(proxyListActivity, 280);
                org.telegram.messenger.ls.e().k(280, new Object[0]);
                org.telegram.messenger.ls.e().c(proxyListActivity, 280);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.f43703a;
                if (l4Var != null) {
                    if (org.telegram.messenger.cz.B1 == null) {
                        l4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f43703a.F();
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity = ((w51) this.f51225b).f52945a;
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
                    g61 g61Var = themeActivity.f43840a;
                    i11 = themeActivity.textSizeRow;
                    g61Var.h(i11, new Object());
                    g61 g61Var2 = themeActivity.f43840a;
                    i12 = themeActivity.bubbleRadiusRow;
                    g61Var2.h(i12, new Object());
                }
                if (themeActivity.f43844c != null) {
                    org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0("Blue");
                    org.telegram.ui.ActionBar.l6 D0 = org.telegram.ui.ActionBar.m6.D0();
                    SparseArray sparseArray = Q0.f29201b0;
                    int i15 = org.telegram.ui.ActionBar.m6.f29523n;
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) sparseArray.get(i15);
                    if (j6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.f28851c = "d";
                        d6Var.f28849a = "Blue_99_wp.jpg";
                        d6Var.f28850b = "Blue_99_wp.jpg";
                        j6Var.f29083y = d6Var;
                        Q0.v(d6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.m6.z1(Q0, true, false, true, false, false);
                        themeActivity.f43844c.B1(Q0, null);
                        themeActivity.f43844c.y0(0);
                        return;
                    } else if (Q0.Z != i15) {
                        if (themeActivity.f43849f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.m6.K1(D0, z10, i15, null);
                        themeActivity.f43840a.g(themeActivity.f43863r0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.m6.u1(true);
                        return;
                    }
                }
                return;
            case 19:
                x71 x71Var = ((a71) this.f51225b).f45496a;
                org.telegram.ui.ActionBar.l6 l6Var = x71Var.f53659g0;
                org.telegram.ui.ActionBar.m6.l0(l6Var, x71Var.f53697w, true);
                org.telegram.ui.ActionBar.m6.p();
                org.telegram.ui.ActionBar.m6.t1(false, false);
                org.telegram.messenger.ls.e().k(273, l6Var, Boolean.valueOf(x71Var.f53662h0), null, -1);
                x71Var.finishFragment();
                return;
            default:
                ((za1) this.f51225b).f54478a.J0(true);
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f51224a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f51225b, (org.telegram.ui.Components.o41) obj, (View) obj2);
                return;
            default:
                py0 py0Var = (py0) this.f51225b;
                org.telegram.ui.Components.o41 o41Var = (org.telegram.ui.Components.o41) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                qy0 qy0Var = py0Var.f50946w;
                if (o41Var.f56599a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = py0Var.f50939b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(o41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            qy0.J0(qy0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = py0Var.f50940c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(o41Var.d);
                        if (tL_messageReportOption != null) {
                            qy0.J0(qy0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = py0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            qy0.J0(qy0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    qy0.J0(qy0Var, o41Var.f38058m, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(Exception exc) {
        RectF rectF = ProfileActivity.Z6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((bi.i5) this.f51225b).run();
    }

    @Override
    public void r(int i7) {
        mb1 mb1Var = (mb1) this.f51225b;
        if (mb1Var.h == null && !mb1Var.f49817f.e()) {
            mb1Var.f49821w.f43908f.e(false, true);
        }
        mb1Var.f();
    }

    @Override
    public void run(long j3) {
        org.telegram.messenger.g0.g3(new qx0((org.telegram.messenger.bz) this.f51225b, j3, 0));
    }

    @Override
    public boolean v1(int i7) {
        return true;
    }

    @Override
    public void P1(ArrayList arrayList) {
    }
}
