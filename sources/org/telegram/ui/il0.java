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
public final class il0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.kl0, vf.e, tf.j1 {
    public final int f35136a;
    public final Object f35137b;

    public il0(Object obj, int i10) {
        this.f35136a = i10;
        this.f35137b = obj;
    }

    @Override
    public a0.h I() {
        return null;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f35136a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f35137b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f31966l0 = defaultWindowInsets;
                premiumPreviewFragment.f31951a.setPadding(0, defaultWindowInsets.f7214b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31966l0.d);
                org.telegram.ui.Components.sl0 sl0Var = premiumPreviewFragment.f31951a;
                i0.b bVar = premiumPreviewFragment.f31966l0;
                AndroidUtilities.setViewLayoutMargins(sl0Var, bVar.f7213a, 0, bVar.f7215c, 0);
                ow0 ow0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.f31966l0;
                ow0Var.setPadding(bVar2.f7213a, 0, bVar2.f7215c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31966l0.f7213a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31966l0;
                    frameLayout.setPadding(i12, dp, bVar3.f7215c, bVar3.d);
                }
                return r0.m1.f43129b;
            default:
                vg0 vg0Var = (vg0) ((hh1) this.f35137b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i13 = defaultWindowInsets2.f7213a;
                vg0Var.J = i13;
                int i14 = defaultWindowInsets2.f7215c;
                vg0Var.K = i14;
                vg0Var.I = defaultWindowInsets2.d;
                View view2 = vg0Var.f39169y.f37755b;
                if (view2 != null && view2.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i10 = AndroidUtilities.dp(44.0f);
                } else {
                    i10 = 0;
                }
                vg0Var.f39169y.setPadding(0, 0, 0, vg0Var.I);
                int dp2 = AndroidUtilities.dp(72.0f) + vg0Var.I + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    vg0Var.E.setLayoutParams(marginLayoutParams);
                }
                if (z4) {
                    i11 = vg0Var.I + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) vg0Var.f34875c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    vg0Var.f34875c.setLayoutParams(marginLayoutParams2);
                }
                vg0Var.B.setPadding(i13, 0, i14, vg0Var.I);
                if (z4) {
                    m1Var = m1Var.f43130a.m(0, 0, 0, vg0Var.I);
                }
                vg0Var.i0();
                vg0Var.h0();
                SparseArray sparseArray = vg0Var.f34873a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    fh1 fh1Var = (fh1) sparseArray.valueAt(i15);
                    if (fh1Var != null && (fragmentView = fh1Var.f34260a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f43129b;
        }
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public void a() {
        switch (this.f35136a) {
            case 6:
                ((rv0) this.f35137b).e();
                return;
            default:
                ((rd1) this.f35137b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f35137b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        lx0 lx0Var = (lx0) this.f35137b;
        if (z4) {
            lx0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f35136a) {
            case 17:
                return ((e71) this.f35137b).Q(i10, view);
            case 18:
                final ga1 ga1Var = (ga1) this.f35137b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = ga1Var.f34534e0;
                l91 l91Var = ga1Var.U;
                int i11 = l91Var.F;
                if (i10 >= i11 && i10 <= l91Var.G) {
                    final MessageObject messageObject = ((da1) ga1Var.f34551s0.get(i10 - i11)).f33569b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(ga1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ga1 ga1Var2 = ga1Var;
                                    ga1Var2.getClass();
                                    ga1Var2.presentFragment(new aj0(messageObject));
                                    return;
                                default:
                                    ga1 ga1Var3 = ga1Var;
                                    ga1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ga1Var3.f34529b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ga1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ga1 ga1Var2 = ga1Var;
                                    ga1Var2.getClass();
                                    ga1Var2.presentFragment(new aj0(messageObject));
                                    return;
                                default:
                                    ga1 ga1Var3 = ga1Var;
                                    ga1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ga1Var3.f34529b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ga1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ga1Var.P.V0(view, false));
                    H.Z();
                } else {
                    int i12 = l91Var.R;
                    if (i10 >= i12 && i10 <= l91Var.S) {
                        ((z91) ga1Var.N.get(i10 - i12)).c(ga1Var.f34527a, ga1Var, d2VarArr, true);
                    } else {
                        int i13 = l91Var.O;
                        if (i10 >= i13 && i10 <= l91Var.P) {
                            ((z91) ga1Var.L.get(i10 - i13)).c(ga1Var.f34527a, ga1Var, d2VarArr, true);
                        } else {
                            int i14 = l91Var.U;
                            if (i10 < i14 || i10 > l91Var.V) {
                                return false;
                            }
                            ((z91) ga1Var.M.get(i10 - i14)).c(ga1Var.f34527a, ga1Var, d2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((yd1) this.f35137b).G.f(i10, view);
                return true;
        }
    }

    @Override
    public void g(int i10) {
        dh1 dh1Var = (dh1) this.f35137b;
        if (dh1Var.h == null && !dh1Var.f33644f.e()) {
            dh1Var.v.f32390f.e(false, true);
        }
        dh1Var.l();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13;
        switch (this.f35136a) {
            case 3:
                PhotoViewer photoViewer = ((vs0) this.f35137b).f39242b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.f31913y, photoViewer.f31861s2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((fv0) this.f35137b).finishFragment();
                return;
            case 5:
                ((zu0) this.f35137b).f40864a.O.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f35137b;
                int i14 = PopupNotificationActivity.Y;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 11:
                ((org.telegram.messenger.ok) this.f35137b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((m11) this.f35137b).f36164b;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.c0(true);
                n11 n11Var = proxyListActivity.f32206a;
                if (n11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        n11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f32206a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f32206a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((ab1) this.f35137b).f32513a;
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
                    lb1 lb1Var = themeActivity.f32331a;
                    i12 = themeActivity.textSizeRow;
                    lb1Var.n(i12, new Object());
                    lb1 lb1Var2 = themeActivity.f32331a;
                    i13 = themeActivity.bubbleRadiusRow;
                    lb1Var2.n(i13, new Object());
                }
                if (themeActivity.f32335c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.X;
                    int i17 = org.telegram.ui.ActionBar.j6.f20078n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i17);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.f19556c = "d";
                        c6Var.f19554a = "Blue_99_wp.jpg";
                        c6Var.f19555b = "Blue_99_wp.jpg";
                        h6Var.f19781y = c6Var;
                        N0.v(c6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f32335c.y1(N0);
                        themeActivity.f32335c.x0(0);
                        return;
                    } else if (N0.V != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f32339f == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z4), null, Integer.valueOf(i17));
                        themeActivity.f32331a.m(themeActivity.f32348n0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                cd1 cd1Var = ((fc1) this.f35137b).f34217a;
                org.telegram.ui.ActionBar.j6.j0(cd1Var.f33291b0, cd1Var.f33333s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, cd1Var.f33291b0, Boolean.valueOf(cd1Var.f33295c0), null, -1);
                cd1Var.finishFragment();
                return;
            default:
                ((mg1) this.f35137b).f36303a.E0(true);
                return;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f35136a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f35137b, (org.telegram.ui.Components.i51) obj, (View) obj2);
                return;
            default:
                j31 j31Var = (j31) this.f35137b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                k31 k31Var = j31Var.v;
                if (i51Var.f1808a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = j31Var.f35217b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            k31.G(k31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = j31Var.f35218c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                        if (tL_messageReportOption != null) {
                            k31.G(k31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = j31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            k31.G(k31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    k31.G(k31Var, i51Var.f25565l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.f35137b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ex0) this.f35137b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f32012w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.msg_mini_lock3, 0);
                    mqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(mqVar, 0, 1, 33);
                    privacyControlActivity.f32012w0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f32012w0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void T(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((kh.m2) this.f35137b).run();
    }
}
