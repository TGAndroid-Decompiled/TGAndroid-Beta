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
public final class li0 implements org.telegram.messenger.a20, org.telegram.ui.Cells.u5, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1, r0.m, org.telegram.messenger.w10, org.telegram.ui.Cells.z4, org.telegram.messenger.oc, RequestTimeDelegate, org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.dj0, lg.e, jg.y1 {
    public final int f47550a;
    public final Object f47551b;

    public li0(Object obj, int i7) {
        this.f47550a = i7;
        this.f47551b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7;
        int i10;
        View fragmentView;
        switch (this.f47550a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f47551b;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                premiumPreviewFragment.f41621o0 = I0;
                premiumPreviewFragment.f41602a.setPadding(0, I0.f15118b, 0, org.telegram.messenger.g0.L(48.0f) + premiumPreviewFragment.f41621o0.d);
                org.telegram.ui.Components.pj0 pj0Var = premiumPreviewFragment.f41602a;
                i0.b bVar = premiumPreviewFragment.f41621o0;
                org.telegram.messenger.g0.B3(pj0Var, bVar.f15117a, 0, bVar.f15119c, 0);
                us0 us0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f41621o0;
                us0Var.setPadding(bVar2.f15117a, 0, bVar2.f15119c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f41621o0.f15117a;
                    int L = org.telegram.messenger.g0.L(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f41621o0;
                    frameLayout.setPadding(i11, L, bVar3.f15119c, bVar3.d);
                }
                return r0.k1.f54108b;
            default:
                je0 je0Var = (je0) ((nb1) this.f47551b);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, false);
                int i12 = I02.f15117a;
                je0Var.M = i12;
                int i13 = I02.f15119c;
                je0Var.N = i13;
                je0Var.L = I02.d;
                boolean a10 = je0Var.D.a();
                if (a10) {
                    i7 = org.telegram.messenger.g0.L(44.0f);
                } else {
                    i7 = 0;
                }
                je0Var.D.setPadding(0, 0, 0, je0Var.L);
                int L2 = org.telegram.messenger.g0.L(72.0f) + je0Var.L + i7;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) je0Var.H.getLayoutParams();
                if (marginLayoutParams.height != L2) {
                    marginLayoutParams.height = L2;
                    je0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (a10) {
                    i10 = je0Var.L + i7;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) je0Var.f48015c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    je0Var.f48015c.setLayoutParams(marginLayoutParams2);
                }
                je0Var.E.setPadding(i12, 0, i13, je0Var.L);
                if (a10) {
                    k1Var = k1Var.f54109a.m(0, 0, 0, je0Var.L);
                }
                je0Var.o0();
                je0Var.n0();
                SparseArray sparseArray = je0Var.f48013a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    lb1 lb1Var = (lb1) sparseArray.valueAt(i14);
                    if (lb1Var != null && (fragmentView = lb1Var.f47505a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f54108b;
        }
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f47550a) {
            case 5:
                ((zr0) this.f47551b).e();
                return;
            default:
                ((f81) this.f47551b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        rt0 rt0Var = (rt0) this.f47551b;
        if (z9) {
            rt0Var.d.Z((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean c(int i7, View view) {
        switch (this.f47550a) {
            case 16:
                return ((c21) this.f47551b).e1(i7, view);
            default:
                ((m81) this.f47551b).J.c(i7, view);
                return true;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        PrivacyControlActivity privacyControlActivity = ((jt0) this.f47551b).d;
        if (((Integer) number).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().q()) {
                if (privacyControlActivity.A0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232243, 0);
                    wpVar.f40062r = org.telegram.messenger.g0.L(2.0f);
                    wpVar.f40063s = org.telegram.messenger.g0.L(1.0f);
                    spannableString.setSpan(wpVar, 0, 1, 33);
                    privacyControlActivity.A0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.A0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.H(',', "Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return org.telegram.messenger.hd.H(',', "Stars", num.intValue());
        }
        return org.telegram.messenger.hd.E(num.intValue(), ',');
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        boolean z9 = false;
        switch (this.f47550a) {
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((ca.i) this.f47551b).f6016c;
                try {
                    org.telegram.messenger.g0.u2(photoViewer.S4, photoViewer.D, photoViewer.f41531v2, true);
                    photoViewer.z0(false, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ((pr0) this.f47551b).finishFragment();
                return;
            case 4:
                ((jr0) this.f47551b).f47030a.R.r();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f47551b;
                int i13 = PopupNotificationActivity.f41589b0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                RectF rectF = ProfileActivity.S6;
                ((ut0) this.f47551b).a(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = (ProxyListActivity) ((hi0) this.f47551b).f46391c;
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
                l4 l4Var = proxyListActivity.f41873a;
                if (l4Var != null) {
                    if (org.telegram.messenger.iz.B1 == null) {
                        l4Var.h(ProxyListActivity.g0(proxyListActivity), 0);
                    }
                    proxyListActivity.f41873a.F();
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity = ((v51) this.f47551b).f50579a;
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
                    f61 f61Var = themeActivity.f42008a;
                    i11 = themeActivity.textSizeRow;
                    f61Var.h(i11, new Object());
                    f61 f61Var2 = themeActivity.f42008a;
                    i12 = themeActivity.bubbleRadiusRow;
                    f61Var2.h(i12, new Object());
                }
                if (themeActivity.f42012c != null) {
                    org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0("Blue");
                    org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
                    SparseArray sparseArray = Q0.f27626a0;
                    int i15 = org.telegram.ui.ActionBar.k6.f28024n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i15);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.f27400c = "d";
                        c6Var.f27398a = "Blue_99_wp.jpg";
                        c6Var.f27399b = "Blue_99_wp.jpg";
                        h6Var.f27536y = c6Var;
                        Q0.v(c6Var);
                    }
                    if (Q0 != D0) {
                        Q0.u(i15);
                        org.telegram.ui.ActionBar.k6.z1(Q0, true, false, true, false, false);
                        themeActivity.f42012c.B1(Q0, null);
                        themeActivity.f42012c.y0(0);
                        return;
                    } else if (Q0.Y != i15) {
                        if (themeActivity.f42017f == 1) {
                            z9 = true;
                        }
                        org.telegram.ui.ActionBar.k6.K1(D0, z9, i15, null);
                        themeActivity.f42008a.g(themeActivity.f42029q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.k6.u1(true);
                        return;
                    }
                }
                return;
            case 19:
                u71 u71Var = ((y61) this.f47551b).f52155a;
                org.telegram.ui.ActionBar.j6 j6Var = u71Var.f50285f0;
                org.telegram.ui.ActionBar.k6.l0(j6Var, u71Var.f50325w, true);
                org.telegram.ui.ActionBar.k6.p();
                org.telegram.ui.ActionBar.k6.t1(false, false);
                org.telegram.messenger.qs.e().k(270, j6Var, Boolean.valueOf(u71Var.f50288g0), null, -1);
                u71Var.finishFragment();
                return;
            default:
                ((wa1) this.f47551b).f51044a.J0(true);
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f47550a) {
            case 0:
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                PasskeysActivity.b0((PasskeysActivity) this.f47551b, (org.telegram.ui.Components.w31) obj, (View) obj2);
                return;
            default:
                ny0 ny0Var = (ny0) this.f47551b;
                org.telegram.ui.Components.w31 w31Var = (org.telegram.ui.Components.w31) obj;
                View view = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                oy0 oy0Var = ny0Var.f48177w;
                if (w31Var.f54440a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ny0Var.f48170b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(w31Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            oy0.I0(oy0Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ny0Var.f48171c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(w31Var.d);
                        if (tL_messageReportOption != null) {
                            oy0.I0(oy0Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = ny0Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            oy0.I0(oy0Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    oy0.I0(oy0Var, w31Var.f39830l, null, null);
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
        jb1 jb1Var = (jb1) this.f47551b;
        if (jb1Var.h == null && !jb1Var.f46926f.e()) {
            jb1Var.f46930w.f42075f.e(false, true);
        }
        jb1Var.f();
    }

    @Override
    public void r(Exception exc) {
        RectF rectF = ProfileActivity.S6;
        org.telegram.messenger.a8.e("mlkit: failed to detect language in selection", exc);
        ((jg.c1) this.f47551b).run();
    }

    @Override
    public void run(long j3) {
        org.telegram.messenger.g0.h3(new bi.r3((org.telegram.messenger.hz) this.f47551b, j3, 29));
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public void m1(ArrayList arrayList) {
    }
}
