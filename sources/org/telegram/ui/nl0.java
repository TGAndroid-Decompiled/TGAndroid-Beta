package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
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
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
public final class nl0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.w5, org.telegram.ui.Components.u61, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.cl0, ig.e, gg.b2 {
    public final int f36125a;
    public final Object f36126b;

    public nl0(Object obj, int i10) {
        this.f36125a = i10;
        this.f36126b = obj;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f36125a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f36126b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31186o0 = defaultWindowInsets;
                premiumPreviewFragment.f31168a.setPadding(0, defaultWindowInsets.f10592b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31186o0.d);
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.f31168a;
                i0.b bVar = premiumPreviewFragment.f31186o0;
                AndroidUtilities.setViewLayoutMargins(ml0Var, bVar.f10591a, 0, bVar.f10593c, 0);
                lx0 lx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31186o0;
                lx0Var.setPadding(bVar2.f10591a, 0, bVar2.f10593c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31186o0.f10591a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31186o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10593c, bVar3.d);
                }
                return r0.l1.f41876b;
            default:
                gh0 gh0Var = (gh0) ((ai1) this.f36126b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10591a;
                gh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10593c;
                gh0Var.N = i14;
                gh0Var.L = defaultWindowInsets2.d;
                View view2 = gh0Var.f33978y.f35284b;
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
                gh0Var.f33978y.setPadding(0, 0, 0, gh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + gh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    gh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = gh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gh0Var.f31900c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    gh0Var.f31900c.setLayoutParams(marginLayoutParams2);
                }
                gh0Var.E.setPadding(i13, 0, i14, gh0Var.L);
                if (z10) {
                    l1Var = l1Var.f41877a.m(0, 0, 0, gh0Var.L);
                }
                gh0Var.i0();
                gh0Var.h0();
                SparseArray sparseArray = gh0Var.f31898a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    yh1 yh1Var = (yh1) sparseArray.valueAt(i15);
                    if (yh1Var != null && (fragmentView = yh1Var.f39918a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f41876b;
        }
    }

    @Override
    public void a() {
        switch (this.f36125a) {
            case 7:
                ((ow0) this.f36126b).e();
                return;
            default:
                ((me1) this.f36126b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.T8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f36126b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        hy0 hy0Var = (hy0) this.f36126b;
        if (z10) {
            hy0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36125a) {
            case 18:
                return ((v71) this.f36126b).Q(i10, view);
            case 19:
                final ab1 ab1Var = (ab1) this.f36126b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = ab1Var.f31793h0;
                fa1 fa1Var = ab1Var.X;
                int i11 = fa1Var.I;
                if (i10 >= i11 && i10 <= fa1Var.J) {
                    final MessageObject messageObject = ((xa1) ab1Var.f31809v0.get(i10 - i11)).f39506b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(ab1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ab1 ab1Var2 = ab1Var;
                                    ab1Var2.getClass();
                                    ab1Var2.presentFragment(new lj0(messageObject));
                                    return;
                                default:
                                    ab1 ab1Var3 = ab1Var;
                                    ab1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ab1Var3.f31784b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ab1Var3.presentFragment(new bo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ab1 ab1Var2 = ab1Var;
                                    ab1Var2.getClass();
                                    ab1Var2.presentFragment(new lj0(messageObject));
                                    return;
                                default:
                                    ab1 ab1Var3 = ab1Var;
                                    ab1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ab1Var3.f31784b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ab1Var3.presentFragment(new bo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ab1Var.S.W0(view, false));
                    H.Z();
                } else {
                    int i12 = fa1Var.U;
                    if (i10 >= i12 && i10 <= fa1Var.V) {
                        ((ta1) ab1Var.Q.get(i10 - i12)).c(ab1Var.f31782a, ab1Var, c2VarArr, true);
                    } else {
                        int i13 = fa1Var.R;
                        if (i10 >= i13 && i10 <= fa1Var.S) {
                            ((ta1) ab1Var.O.get(i10 - i13)).c(ab1Var.f31782a, ab1Var, c2VarArr, true);
                        } else {
                            int i14 = fa1Var.X;
                            if (i10 < i14 || i10 > fa1Var.Y) {
                                return false;
                            }
                            ((ta1) ab1Var.P.get(i10 - i14)).c(ab1Var.f31782a, ab1Var, c2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((ue1) this.f36126b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f36125a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36126b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f30900c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.f30900c.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
                        } else {
                            i14++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
            case 4:
                PhotoViewer photoViewer = ((st0) this.f36126b).f37548b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31128y, photoViewer.f31101v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((cw0) this.f36126b).finishFragment();
                return;
            case 6:
                ((wv0) this.f36126b).f39178a.R.r();
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f36126b;
                int i15 = PopupNotificationActivity.f31156b0;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 12:
                ((org.telegram.messenger.nk) this.f36126b).run(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = ((f21) this.f36126b).f33522b;
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
                g21 g21Var = proxyListActivity.f31431a;
                if (g21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        g21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31431a.F();
                    return;
                }
                return;
            case 21:
                ThemeActivity themeActivity = ((wb1) this.f36126b).f38679a;
                if (AndroidUtilities.isTablet()) {
                    i11 = 18;
                } else {
                    i11 = 16;
                }
                boolean k02 = ThemeActivity.k0(themeActivity, i11);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    k02 = true;
                }
                if (k02) {
                    hc1 hc1Var = themeActivity.f31562a;
                    i12 = themeActivity.textSizeRow;
                    hc1Var.n(i12, new Object());
                    hc1 hc1Var2 = themeActivity.f31562a;
                    i13 = themeActivity.bubbleRadiusRow;
                    hc1Var2.n(i13, new Object());
                }
                if (themeActivity.f31566c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.f18757a0;
                    int i18 = org.telegram.ui.ActionBar.j6.f19040n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i18);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.f18539c = "d";
                        c6Var.f18537a = "Blue_99_wp.jpg";
                        c6Var.f18538b = "Blue_99_wp.jpg";
                        h6Var.f18740y = c6Var;
                        N0.v(c6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f31566c.z1(N0);
                        themeActivity.f31566c.y0(0);
                        return;
                    } else if (N0.Y != i18) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i19 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31570f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i19, A0, Boolean.valueOf(z10), null, Integer.valueOf(i18));
                        themeActivity.f31562a.m(themeActivity.f31582q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 22:
                xd1 xd1Var = ((ad1) this.f36126b).f31834a;
                org.telegram.ui.ActionBar.j6.j0(xd1Var.f39545e0, xd1Var.f39580s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.f39545e0, Boolean.valueOf(xd1Var.f39549f0), null, -1);
                xd1Var.finishFragment();
                return;
            default:
                ((gh1) this.f36126b).f33979a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        wh1 wh1Var = (wh1) this.f36126b;
        if (wh1Var.h == null && !wh1Var.f39037f.e()) {
            wh1Var.v.f31624f.e(false, true);
        }
        wh1Var.l();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f36125a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f36126b, (org.telegram.ui.Components.j51) obj, (View) obj2);
                return;
            default:
                c41 c41Var = (c41) this.f36126b;
                org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                d41 d41Var = c41Var.v;
                if (j51Var.f15543a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = c41Var.f32661b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(j51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            d41.H(d41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = c41Var.f32662c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(j51Var.d);
                        if (tL_messageReportOption != null) {
                            d41.H(d41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = c41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            d41.H(d41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    d41.H(d41Var, j51Var.f25124l, null, null);
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
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f36126b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ay0) this.f36126b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31237z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f31237z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31237z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void Q(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.e1) this.f36126b).run();
    }
}
