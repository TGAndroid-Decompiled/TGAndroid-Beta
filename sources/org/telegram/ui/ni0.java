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
public final class ni0 implements org.telegram.messenger.x10, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.t10, org.telegram.ui.Cells.z4, org.telegram.messenger.nc, RequestTimeDelegate, org.telegram.ui.ActionBar.d2, org.telegram.ui.Components.ij0, lg.e, jg.y1 {
    public final int f49568a;
    public final Object f49569b;

    public ni0(Object obj, int i7) {
        this.f49568a = i7;
        this.f49569b = obj;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i7;
        int i10;
        View fragmentView;
        switch (this.f49568a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f49569b;
                i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.f42995p0 = I0;
                premiumPreviewFragment.f42975a.setPadding(0, I0.f15575b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f42995p0.d);
                org.telegram.ui.Components.uj0 uj0Var = premiumPreviewFragment.f42975a;
                i0.c cVar = premiumPreviewFragment.f42995p0;
                org.telegram.messenger.g0.A3(uj0Var, cVar.f15574a, 0, cVar.f15576c, 0);
                rs0 rs0Var = premiumPreviewFragment.V;
                i0.c cVar2 = premiumPreviewFragment.f42995p0;
                rs0Var.setPadding(cVar2.f15574a, 0, cVar2.f15576c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.K;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f42995p0.f15574a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f42995p0;
                    frameLayout.setPadding(i11, L, cVar3.f15576c, cVar3.d);
                }
                return r0.k1.f55681b;
            default:
                je0 je0Var = (je0) ((mb1) this.f49569b);
                i0.c I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i12 = I02.f15574a;
                je0Var.N = i12;
                int i13 = I02.f15576c;
                je0Var.O = i13;
                je0Var.M = I02.d;
                boolean a10 = je0Var.E.a();
                if (a10) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                } else {
                    i7 = 0;
                }
                je0Var.E.setPadding(0, 0, 0, je0Var.M);
                int L2 = org.telegram.messenger.g0.L(72.0f) + je0Var.M + i7;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) je0Var.I.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    je0Var.I.setLayoutParams(marginLayoutParams);
                }
                if (a10) {
                    i10 = je0Var.M + i7;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) je0Var.f49201c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    je0Var.f49201c.setLayoutParams(marginLayoutParams2);
                }
                je0Var.F.setPadding(i12, 0, i13, je0Var.M);
                if (a10) {
                    k1Var = k1Var.f55682a.m(0, 0, 0, je0Var.M);
                }
                je0Var.o0();
                je0Var.n0();
                SparseArray sparseArray = je0Var.f49199a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    kb1 kb1Var = (kb1) sparseArray.valueAt(i14);
                    if (kb1Var != null && (fragmentView = kb1Var.f48620a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f55681b;
        }
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f49568a) {
            case 5:
                ((xr0) this.f49569b).e();
                return;
            default:
                ((e81) this.f49569b).e();
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        switch (this.f49568a) {
            case 16:
                return ((z11) this.f49569b).e1(i7, view);
            default:
                ((l81) this.f49569b).K.b(i7, view);
                return true;
        }
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ot0 ot0Var = (ot0) this.f49569b;
        if (z10) {
            ot0Var.d.Z((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((ht0) this.f49569b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.B0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131232244, 0);
                    eqVar.f34414r = org.telegram.messenger.g0.L(2.0f);
                    eqVar.f34415s = org.telegram.messenger.g0.L(1.0f);
                    spannableString.setSpan(eqVar, 0, 1, 33);
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
    public boolean e0(int i7) {
        return true;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        switch (this.f49568a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.f49569b).f4844c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.T4, photoViewer.E, photoViewer.f42913w2, true);
                    photoViewer.z0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((nr0) this.f49569b).finishFragment();
                return;
            case 4:
                ((hr0) this.f49569b).f47806a.S.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f49569b;
                int i13 = PopupNotificationActivity.f42961c0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.X6;
                ((rt0) this.f49569b).a(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((ji0) this.f49569b).f48351c;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.gz.i((org.telegram.messenger.fz) obj);
                }
                if (org.telegram.messenger.gz.B1 == null) {
                    proxyListActivity.d = false;
                }
                org.telegram.messenger.ns.e().n(proxyListActivity, 277);
                org.telegram.messenger.ns.e().k(277, new Object[0]);
                org.telegram.messenger.ns.e().c(proxyListActivity, 277);
                proxyListActivity.h0(true);
                l4 l4Var = proxyListActivity.f43247a;
                if (l4Var != null) {
                    if (org.telegram.messenger.gz.B1 == null) {
                        l4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f43247a.F();
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity = ((s51) this.f49569b).f51111a;
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
                    c61 c61Var = themeActivity.f43384a;
                    i11 = themeActivity.textSizeRow;
                    c61Var.h(i11, new Object());
                    c61 c61Var2 = themeActivity.f43384a;
                    i12 = themeActivity.bubbleRadiusRow;
                    c61Var2.h(i12, new Object());
                }
                if (themeActivity.f43388c != null) {
                    org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0("Blue");
                    org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
                    SparseArray sparseArray = Q0.f28701b0;
                    int i15 = org.telegram.ui.ActionBar.j6.f29025n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i15);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f28454c = "d";
                        b6Var.f28452a = "Blue_99_wp.jpg";
                        b6Var.f28453b = "Blue_99_wp.jpg";
                        g6Var.f28623y = b6Var;
                        Q0.v(b6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.j6.z1(Q0, true, false, true, false, false);
                        themeActivity.f43388c.B1(Q0, null);
                        themeActivity.f43388c.y0(0);
                        return;
                    } else if (Q0.Z != i15) {
                        if (themeActivity.f43393f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.j6.K1(D0, z10, i15, null);
                        themeActivity.f43384a.g(themeActivity.f43407r0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.u1(true);
                        return;
                    }
                }
                return;
            case 19:
                t71 t71Var = ((v61) this.f49569b).f52143a;
                org.telegram.ui.ActionBar.i6 i6Var = t71Var.f51431g0;
                org.telegram.ui.ActionBar.j6.l0(i6Var, t71Var.f51469w, true);
                org.telegram.ui.ActionBar.j6.p();
                org.telegram.ui.ActionBar.j6.t1(false, false);
                org.telegram.messenger.ns.e().k(270, i6Var, Boolean.valueOf(t71Var.f51434h0), null, -1);
                t71Var.finishFragment();
                return;
            default:
                ((va1) this.f49569b).f52180a.J0(true);
                return;
        }
    }

    @Override
    public void i(int i7) {
        ib1 ib1Var = (ib1) this.f49569b;
        if (ib1Var.h == null && !ib1Var.f48011f.e()) {
            ib1Var.f48015w.f43452f.e(false, true);
        }
        ib1Var.f();
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f49568a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f49569b, (org.telegram.ui.Components.b41) obj, (View) obj2);
                return;
            default:
                ly0 ly0Var = (ly0) this.f49569b;
                org.telegram.ui.Components.b41 b41Var = (org.telegram.ui.Components.b41) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                my0 my0Var = ly0Var.f49065w;
                if (b41Var.f56015a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ly0Var.f49058b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(b41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            my0.I0(my0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ly0Var.f49059c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(b41Var.d);
                        if (tL_messageReportOption != null) {
                            my0.I0(my0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = ly0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            my0.I0(my0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    my0.I0(my0Var, b41Var.f33184l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public void r(Exception exc) {
        RectF rectF = ProfileActivity.X6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((bi.u2) this.f49569b).run();
    }

    @Override
    public void run(long j3) {
        org.telegram.messenger.g0.h3(new di.x2((org.telegram.messenger.fz) this.f49569b, j3, 29));
    }

    @Override
    public void l0(ArrayList arrayList) {
    }
}
