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
public final class hl0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.b6, org.telegram.ui.Components.g81, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.e5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.q2, org.telegram.ui.Components.bm0, kg.f, ig.z1 {
    public final int f40031a;
    public final Object f40032b;

    public hl0(Object obj, int i10) {
        this.f40031a = i10;
        this.f40032b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f40031a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40032b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f35880o0 = defaultWindowInsets;
                premiumPreviewFragment.f35862a.setPadding(0, defaultWindowInsets.f13451b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f35880o0.d);
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f35862a;
                i0.b bVar = premiumPreviewFragment.f35880o0;
                AndroidUtilities.setViewLayoutMargins(mm0Var, bVar.f13450a, 0, bVar.f13452c, 0);
                vw0 vw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f35880o0;
                vw0Var.setPadding(bVar2.f13450a, 0, bVar2.f13452c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f35880o0.f13450a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f35880o0;
                    frameLayout.setPadding(i12, dp, bVar3.f13452c, bVar3.d);
                }
                return r0.k1.f47114b;
            default:
                pg0 pg0Var = (pg0) ((ug1) this.f40032b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f13450a;
                pg0Var.L = i13;
                int i14 = defaultWindowInsets2.f13452c;
                pg0Var.M = i14;
                pg0Var.K = defaultWindowInsets2.d;
                View view2 = pg0Var.f42496x.f39370b;
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
                pg0Var.f42496x.setPadding(0, 0, 0, pg0Var.K);
                int dp2 = AndroidUtilities.dp(72.0f) + pg0Var.K + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pg0Var.G.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    pg0Var.G.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = pg0Var.K + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pg0Var.f44132c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    pg0Var.f44132c.setLayoutParams(marginLayoutParams2);
                }
                pg0Var.f42497y.setPadding(i13, 0, i14, pg0Var.K);
                if (z10) {
                    k1Var = k1Var.f47115a.m(0, 0, 0, pg0Var.K);
                }
                pg0Var.f0();
                pg0Var.e0();
                SparseArray sparseArray = pg0Var.f44130a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    sg1 sg1Var = (sg1) sparseArray.valueAt(i15);
                    if (sg1Var != null && (fragmentView = sg1Var.f43502a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f47114b;
        }
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f40031a) {
            case 7:
                ((xv0) this.f40032b).e();
                return;
            default:
                ((id1) this.f40032b).e();
                return;
        }
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        rx0 rx0Var = (rx0) this.f40032b;
        if (z10) {
            rx0Var.d.V((Long) f5Var.getTag(), f5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean c(int i10, View view) {
        switch (this.f40031a) {
            case 18:
                return ((p61) this.f40032b).Q(i10, view);
            default:
                ((pd1) this.f40032b).J.c(i10, view);
                return true;
        }
    }

    @Override
    public void d(org.telegram.ui.Components.e00 e00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00((MediaController.SavedFilterState) this.f40032b));
    }

    public void e(String str) {
        WidgetConformanceActivity widgetConformanceActivity = (WidgetConformanceActivity) this.f40032b;
        TextView textView = widgetConformanceActivity.f37600a;
        textView.append(str + "\n");
        widgetConformanceActivity.f37601b.post(new vh1(widgetConformanceActivity, 3));
    }

    @Override
    public void f(int i10) {
        qg1 qg1Var = (qg1) this.f40032b;
        if (qg1Var.h == null && !qg1Var.f42833f.e()) {
            qg1Var.v.f36322f.e(false, true);
        }
        qg1Var.l();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = false;
        switch (this.f40031a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40032b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f35592c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.f35592c.getChildAt(i14);
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
                PhotoViewer photoViewer = ((dt0) this.f40032b).f38927b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f35822y, photoViewer.f35795v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((mv0) this.f40032b).finishFragment();
                return;
            case 6:
                ((gv0) this.f40032b).f39785a.R.r();
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f40032b;
                int i15 = PopupNotificationActivity.f35850b0;
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
                ((org.telegram.messenger.kk) this.f40032b).run(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = ((q11) this.f40032b).f42705b;
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
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i18);
                proxyListActivity.d0(true);
                r11 r11Var = proxyListActivity.f36130a;
                if (r11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        r11Var.n(ProxyListActivity.c0(proxyListActivity), 0);
                    }
                    proxyListActivity.f36130a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((qa1) this.f40032b).f42795a;
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
                    bb1 bb1Var = themeActivity.f36260a;
                    i12 = themeActivity.textSizeRow;
                    bb1Var.n(i12, new Object());
                    bb1 bb1Var2 = themeActivity.f36260a;
                    i13 = themeActivity.bubbleRadiusRow;
                    bb1Var2.n(i13, new Object());
                }
                if (themeActivity.f36264c != null) {
                    org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0("Blue");
                    org.telegram.ui.ActionBar.x6 C0 = org.telegram.ui.ActionBar.y6.C0();
                    SparseArray sparseArray = P0.f23250a0;
                    int i19 = org.telegram.ui.ActionBar.y6.f23531n;
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) sparseArray.get(i19);
                    if (w6Var != null) {
                        org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6();
                        r6Var.f23050c = "d";
                        r6Var.f23048a = "Blue_99_wp.jpg";
                        r6Var.f23049b = "Blue_99_wp.jpg";
                        w6Var.f23233y = r6Var;
                        P0.v(r6Var);
                    }
                    if (P0 != C0) {
                        P0.u(i19);
                        org.telegram.ui.ActionBar.y6.w1(P0, true, false, true, false, false);
                        themeActivity.f36264c.E1(P0, null);
                        themeActivity.f36264c.y0(0);
                        return;
                    } else if (P0.Y != i19) {
                        if (themeActivity.f36268f == 1) {
                            z10 = true;
                        }
                        org.telegram.ui.ActionBar.y6.H1(C0, z10, i19, null);
                        themeActivity.f36260a.m(themeActivity.f36280q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.y6.r1(true);
                        return;
                    }
                }
                return;
            case 21:
                tc1 tc1Var = ((vb1) this.f40032b).f44762a;
                org.telegram.ui.ActionBar.y6.k0(tc1Var.f43751f0, tc1Var.v, true);
                org.telegram.ui.ActionBar.y6.o();
                org.telegram.ui.ActionBar.y6.q1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, tc1Var.f43751f0, Boolean.valueOf(tc1Var.f43754g0), null, -1);
                tc1Var.finishFragment();
                return;
            default:
                ((bg1) this.f40032b).f38088a.F0(true);
                return;
        }
    }

    @Override
    public boolean k0(int i10) {
        return true;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f40032b, j10, 1));
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f40031a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.X((PasskeysActivity) this.f40032b, (org.telegram.ui.Components.t61) obj, (View) obj2);
                return;
            default:
                u21 u21Var = (u21) this.f40032b;
                org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                v21 v21Var = u21Var.v;
                if (t61Var.f47037a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u21Var.f43982b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(t61Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            v21.J(v21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u21Var.f43983c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(t61Var.d);
                        if (tL_messageReportOption != null) {
                            v21.J(v21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = u21Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            v21.J(v21Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    v21.J(v21Var, t61Var.f32872l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((kx0) this.f40032b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f35930y0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock3, 0);
                    zqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(zqVar, 0, 1, 33);
                    privacyControlActivity.f35930y0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f35930y0);
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
        ((ig.d1) this.f40032b).run();
    }
}
