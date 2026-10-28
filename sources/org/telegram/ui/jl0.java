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
import android.widget.TextView;
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
public final class jl0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.b6, org.telegram.ui.Components.h81, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.e5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.q2, org.telegram.ui.Components.cm0, kg.f, ig.z1 {
    public final int f40559a;
    public final Object f40560b;

    public jl0(Object obj, int i10) {
        this.f40559a = i10;
        this.f40560b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f40559a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40560b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f35907o0 = defaultWindowInsets;
                premiumPreviewFragment.f35889a.setPadding(0, defaultWindowInsets.f13450b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f35907o0.d);
                org.telegram.ui.Components.nm0 nm0Var = premiumPreviewFragment.f35889a;
                i0.b bVar = premiumPreviewFragment.f35907o0;
                AndroidUtilities.setViewLayoutMargins(nm0Var, bVar.f13449a, 0, bVar.f13451c, 0);
                xw0 xw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f35907o0;
                xw0Var.setPadding(bVar2.f13449a, 0, bVar2.f13451c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f35907o0.f13449a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f35907o0;
                    frameLayout.setPadding(i12, dp, bVar3.f13451c, bVar3.d);
                }
                return r0.k1.f47152b;
            default:
                rg0 rg0Var = (rg0) ((wg1) this.f40560b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f13449a;
                rg0Var.L = i13;
                int i14 = defaultWindowInsets2.f13451c;
                rg0Var.M = i14;
                rg0Var.K = defaultWindowInsets2.d;
                View view2 = rg0Var.f42987x.f39893b;
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
                rg0Var.f42987x.setPadding(0, 0, 0, rg0Var.K);
                int dp2 = AndroidUtilities.dp(72.0f) + rg0Var.K + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rg0Var.G.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    rg0Var.G.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = rg0Var.K + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rg0Var.f45001c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    rg0Var.f45001c.setLayoutParams(marginLayoutParams2);
                }
                rg0Var.f42988y.setPadding(i13, 0, i14, rg0Var.K);
                if (z10) {
                    k1Var = k1Var.f47153a.m(0, 0, 0, rg0Var.K);
                }
                rg0Var.f0();
                rg0Var.e0();
                SparseArray sparseArray = rg0Var.f44999a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ug1 ug1Var = (ug1) sparseArray.valueAt(i15);
                    if (ug1Var != null && (fragmentView = ug1Var.f44021a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f47152b;
        }
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f40559a) {
            case 7:
                ((zv0) this.f40560b).e();
                return;
            default:
                ((kd1) this.f40560b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        tx0 tx0Var = (tx0) this.f40560b;
        if (z10) {
            tx0Var.d.V((Long) f5Var.getTag(), f5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean c(int i10, View view) {
        switch (this.f40559a) {
            case 18:
                return ((s61) this.f40560b).Q(i10, view);
            default:
                ((rd1) this.f40560b).J.c(i10, view);
                return true;
        }
    }

    @Override
    public void d(org.telegram.ui.Components.e00 e00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00((MediaController.SavedFilterState) this.f40560b));
    }

    public void e(String str) {
        WidgetConformanceActivity widgetConformanceActivity = (WidgetConformanceActivity) this.f40560b;
        TextView textView = widgetConformanceActivity.f37627a;
        textView.append(str + "\n");
        widgetConformanceActivity.f37628b.post(new xh1(widgetConformanceActivity, 3));
    }

    @Override
    public void f(int i10) {
        sg1 sg1Var = (sg1) this.f40560b;
        if (sg1Var.h == null && !sg1Var.f43322f.e()) {
            sg1Var.v.f36349f.e(false, true);
        }
        sg1Var.l();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        switch (this.f40559a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40560b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f35619c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.f35619c.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.ga) {
                            org.telegram.ui.ActionBar.f7.V(((org.telegram.ui.Cells.ga) childAt).getTextView(), org.telegram.ui.ActionBar.y6.E6, null);
                        } else {
                            i14++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
            case 4:
                PhotoViewer photoViewer = ((ft0) this.f40560b).f39423b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f35849y, photoViewer.f35822v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((ov0) this.f40560b).finishFragment();
                return;
            case 6:
                ((iv0) this.f40560b).f40276a.R.r();
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f40560b;
                int i15 = PopupNotificationActivity.f35877b0;
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
                int i16 = ProfileActivity.R6;
                ((org.telegram.messenger.lk) this.f40560b).run(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = ((s11) this.f40560b).f43222b;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList.get(i17);
                    i17++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i18 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i18);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i18, new Object[0]);
                NotificationCenter.getGlobalInstance().addWeakObserver(proxyListActivity, i18);
                proxyListActivity.d0(true);
                t11 t11Var = proxyListActivity.f36157a;
                if (t11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        t11Var.n(ProxyListActivity.c0(proxyListActivity), 0);
                    }
                    proxyListActivity.f36157a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((sa1) this.f40560b).f43285a;
                if (AndroidUtilities.isTablet()) {
                    i11 = 18;
                } else {
                    i11 = 16;
                }
                boolean l02 = ThemeActivity.l0(themeActivity, i11);
                if (ThemeActivity.Z(themeActivity, 17, true)) {
                    l02 = true;
                }
                if (l02) {
                    db1 db1Var = themeActivity.f36287a;
                    i12 = themeActivity.textSizeRow;
                    db1Var.n(i12, new Object());
                    db1 db1Var2 = themeActivity.f36287a;
                    i13 = themeActivity.bubbleRadiusRow;
                    db1Var2.n(i13, new Object());
                }
                if (themeActivity.f36291c != null) {
                    org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0("Blue");
                    org.telegram.ui.ActionBar.x6 C0 = org.telegram.ui.ActionBar.y6.C0();
                    SparseArray sparseArray = P0.f23253a0;
                    int i19 = org.telegram.ui.ActionBar.y6.f23534n;
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) sparseArray.get(i19);
                    if (w6Var != null) {
                        org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6();
                        r6Var.f23053c = "d";
                        r6Var.f23051a = "Blue_99_wp.jpg";
                        r6Var.f23052b = "Blue_99_wp.jpg";
                        w6Var.f23236y = r6Var;
                        P0.v(r6Var);
                    }
                    if (P0 != C0) {
                        P0.u(i19);
                        org.telegram.ui.ActionBar.y6.w1(P0, true, false, true, false, false);
                        themeActivity.f36291c.E1(P0, null);
                        themeActivity.f36291c.y0(0);
                        return;
                    } else if (P0.Y != i19) {
                        if (themeActivity.f36295f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.y6.H1(C0, z10, i19, null);
                        themeActivity.f36287a.m(themeActivity.f36307q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.y6.r1(true);
                        return;
                    }
                }
                return;
            case 21:
                vc1 vc1Var = ((xb1) this.f40560b).f45649a;
                org.telegram.ui.ActionBar.y6.k0(vc1Var.f44264f0, vc1Var.v, true);
                org.telegram.ui.ActionBar.y6.o();
                org.telegram.ui.ActionBar.y6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vc1Var.f44264f0, Boolean.valueOf(vc1Var.f44267g0), null, -1);
                vc1Var.finishFragment();
                return;
            default:
                ((dg1) this.f40560b).f38609a.F0(true);
                return;
        }
    }

    @Override
    public boolean k0(int i10) {
        return true;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f40560b, j10, 1));
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f40559a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.X((PasskeysActivity) this.f40560b, (org.telegram.ui.Components.u61) obj, (View) obj2);
                return;
            default:
                w21 w21Var = (w21) this.f40560b;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                x21 x21Var = w21Var.v;
                if (u61Var.f47075a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.f44500b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(u61Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            x21.J(x21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.f44501c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(u61Var.d);
                        if (tL_messageReportOption != null) {
                            x21.J(x21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = w21Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            x21.J(x21Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    x21.J(x21Var, u61Var.f33249l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((mx0) this.f40560b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f35957y0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock3, 0);
                    zqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(zqVar, 0, 1, 33);
                    privacyControlActivity.f35957y0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f35957y0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void p0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        int i10 = ProfileActivity.R6;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((ig.d1) this.f40560b).run();
    }
}
