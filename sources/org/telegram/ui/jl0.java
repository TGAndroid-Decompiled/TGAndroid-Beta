package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
public final class jl0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.s71, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.ol0, ig.e, gg.b2 {
    public final int f37722a;
    public final Object f37723b;

    public jl0(Object obj, int i10) {
        this.f37722a = i10;
        this.f37723b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f37722a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37723b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f34141o0 = defaultWindowInsets;
                premiumPreviewFragment.f34122a.setPadding(0, defaultWindowInsets.f11527b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f34141o0.d);
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.f34122a;
                i0.b bVar = premiumPreviewFragment.f34141o0;
                AndroidUtilities.setViewLayoutMargins(zl0Var, bVar.f11526a, 0, bVar.f11528c, 0);
                dx0 dx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f34141o0;
                dx0Var.setPadding(bVar2.f11526a, 0, bVar2.f11528c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f34141o0.f11526a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f34141o0;
                    frameLayout.setPadding(i12, dp, bVar3.f11528c, bVar3.d);
                }
                return r0.l1.f45616b;
            default:
                ch0 ch0Var = (ch0) ((th1) this.f37723b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f11526a;
                ch0Var.M = i13;
                int i14 = defaultWindowInsets2.f11528c;
                ch0Var.N = i14;
                ch0Var.L = defaultWindowInsets2.d;
                View view2 = ch0Var.f35476y.f35779b;
                if (view2 != null && view2.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(44.0f);
                } else {
                    i10 = 0;
                }
                ch0Var.f35476y.setPadding(0, 0, 0, ch0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + ch0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ch0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    ch0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = ch0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ch0Var.f40855c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    ch0Var.f40855c.setLayoutParams(marginLayoutParams2);
                }
                ch0Var.E.setPadding(i13, 0, i14, ch0Var.L);
                if (z10) {
                    l1Var = l1Var.f45617a.m(0, 0, 0, ch0Var.L);
                }
                ch0Var.i0();
                ch0Var.h0();
                SparseArray sparseArray = ch0Var.f40853a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    rh1 rh1Var = (rh1) sparseArray.valueAt(i15);
                    if (rh1Var != null && (fragmentView = rh1Var.f40134a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f45616b;
        }
    }

    @Override
    public void a(int i10) {
        ph1 ph1Var = (ph1) this.f37723b;
        if (ph1Var.h == null && !ph1Var.f39496f.e()) {
            ph1Var.v.f34593f.e(false, true);
        }
        ph1Var.l();
    }

    @Override
    public void b() {
        switch (this.f37722a) {
            case 7:
                ((gw0) this.f37723b).e();
                return;
            default:
                ((ge1) this.f37723b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.yz yzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        yzVar.f(new org.telegram.ui.Components.zz((MediaController.SavedFilterState) this.f37723b));
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f37722a) {
            case 18:
                return ((p71) this.f37723b).O(i10, view);
            default:
                ((ne1) this.f37723b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        ay0 ay0Var = (ay0) this.f37723b;
        if (z10) {
            ay0Var.d.S((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f37722a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37723b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33848c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.f33848c.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E6, false));
                        } else {
                            i14++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
            case 4:
                PhotoViewer photoViewer = ((lt0) this.f37723b).f38340b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f34079y, photoViewer.f34052v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 5:
                ((uv0) this.f37723b).finishFragment();
                return;
            case 6:
                ((ov0) this.f37723b).f39288a.R.r();
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37723b;
                int i15 = PopupNotificationActivity.f34109b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 12:
                ((org.telegram.messenger.mk) this.f37723b).run(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = ((w11) this.f37723b).f41897b;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i17 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i17);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i17, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i17);
                proxyListActivity.b0(true);
                x11 x11Var = proxyListActivity.f34389a;
                if (x11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        x11Var.n(ProxyListActivity.Z(proxyListActivity), 0);
                    }
                    proxyListActivity.f34389a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((qb1) this.f37723b).f39693a;
                if (AndroidUtilities.isTablet()) {
                    i11 = 18;
                } else {
                    i11 = 16;
                }
                boolean k02 = ThemeActivity.k0(themeActivity, i11);
                if (ThemeActivity.X(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    bc1 bc1Var = themeActivity.f34526a;
                    i12 = themeActivity.textSizeRow;
                    bc1Var.n(i12, new Object());
                    bc1 bc1Var2 = themeActivity.f34526a;
                    i13 = themeActivity.bubbleRadiusRow;
                    bc1Var2.n(i13, new Object());
                }
                if (themeActivity.f34530c != null) {
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    org.telegram.ui.ActionBar.h6 A0 = org.telegram.ui.ActionBar.i6.A0();
                    SparseArray sparseArray = N0.f20693a0;
                    int i18 = org.telegram.ui.ActionBar.i6.f21001n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i18);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.f20391c = "d";
                        a6Var.f20389a = "Blue_99_wp.jpg";
                        a6Var.f20390b = "Blue_99_wp.jpg";
                        f6Var.f20636y = a6Var;
                        N0.v(a6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.i6.t1(N0, true, false, true, false, false);
                        themeActivity.f34530c.A1(N0);
                        themeActivity.f34530c.y0(0);
                        return;
                    } else if (N0.Y != i18) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i19 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34535f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i19, A0, Boolean.valueOf(z10), null, Integer.valueOf(i18));
                        themeActivity.f34526a.m(themeActivity.f34547q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.i6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                rd1 rd1Var = ((uc1) this.f37723b).f41150a;
                org.telegram.ui.ActionBar.i6.j0(rd1Var.f40052e0, rd1Var.f40087s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, rd1Var.f40052e0, Boolean.valueOf(rd1Var.f40056f0), null, -1);
                rd1Var.finishFragment();
                return;
            default:
                ((zg1) this.f37723b).f43782a.E0(true);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37722a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.U((PasskeysActivity) this.f37723b, (org.telegram.ui.Components.g61) obj, (View) obj2);
                return;
            default:
                u31 u31Var = (u31) this.f37723b;
                org.telegram.ui.Components.g61 g61Var = (org.telegram.ui.Components.g61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                v31 v31Var = u31Var.v;
                if (g61Var.f17187a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u31Var.f41044b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(g61Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            v31.F(v31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u31Var.f41045c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(g61Var.d);
                        if (tL_messageReportOption != null) {
                            v31.F(v31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = u31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            v31.F(v31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    v31.F(v31Var, g61Var.f26674l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f37723b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((sx0) this.f37723b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f34193z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.msg_mini_lock3, 0);
                    rqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(rqVar, 0, 1, 33);
                    privacyControlActivity.f34193z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f34193z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void C(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.e1) this.f37723b).run();
    }
}
