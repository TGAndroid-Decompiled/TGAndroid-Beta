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
public final class kl0 implements Utilities.Callback5, org.telegram.ui.Cells.w5, org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.jl0, vf.e, tf.i1 {
    public final int f35554a;
    public final Object f35555b;

    public kl0(Object obj, int i10) {
        this.f35554a = i10;
        this.f35555b = obj;
    }

    @Override
    public a0.h H0() {
        return null;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f35554a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f35555b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f31940l0 = defaultWindowInsets;
                premiumPreviewFragment.f31925a.setPadding(0, defaultWindowInsets.f7197b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31940l0.d);
                org.telegram.ui.Components.rl0 rl0Var = premiumPreviewFragment.f31925a;
                i0.b bVar = premiumPreviewFragment.f31940l0;
                AndroidUtilities.setViewLayoutMargins(rl0Var, bVar.f7196a, 0, bVar.f7198c, 0);
                vw0 vw0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.f31940l0;
                vw0Var.setPadding(bVar2.f7196a, 0, bVar2.f7198c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31940l0.f7196a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31940l0;
                    frameLayout.setPadding(i12, dp, bVar3.f7198c, bVar3.d);
                }
                return r0.m1.f43153b;
            default:
                xg0 xg0Var = (xg0) ((ph1) this.f35555b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i13 = defaultWindowInsets2.f7196a;
                xg0Var.J = i13;
                int i14 = defaultWindowInsets2.f7198c;
                xg0Var.K = i14;
                xg0Var.I = defaultWindowInsets2.d;
                View view2 = xg0Var.f39981y.f40273b;
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
                xg0Var.f39981y.setPadding(0, 0, 0, xg0Var.I);
                int dp2 = AndroidUtilities.dp(72.0f) + xg0Var.I + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    xg0Var.E.setLayoutParams(marginLayoutParams);
                }
                if (z4) {
                    i11 = xg0Var.I + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) xg0Var.f37165c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    xg0Var.f37165c.setLayoutParams(marginLayoutParams2);
                }
                xg0Var.B.setPadding(i13, 0, i14, xg0Var.I);
                if (z4) {
                    m1Var = m1Var.f43154a.m(0, 0, 0, xg0Var.I);
                }
                xg0Var.i0();
                xg0Var.h0();
                SparseArray sparseArray = xg0Var.f37163a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    nh1 nh1Var = (nh1) sparseArray.valueAt(i15);
                    if (nh1Var != null && (fragmentView = nh1Var.f36521a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f43153b;
        }
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f35554a) {
            case 6:
                ((yv0) this.f35555b).e();
                return;
            default:
                ((yd1) this.f35555b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f35555b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        sx0 sx0Var = (sx0) this.f35555b;
        if (z4) {
            sx0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f35554a) {
            case 17:
                return ((l71) this.f35555b).Q(i10, view);
            case 18:
                final oa1 oa1Var = (oa1) this.f35555b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = oa1Var.f36718e0;
                t91 t91Var = oa1Var.U;
                int i11 = t91Var.F;
                if (i10 >= i11 && i10 <= t91Var.G) {
                    final MessageObject messageObject = ((la1) oa1Var.f36735s0.get(i10 - i11)).f35727b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(oa1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    oa1 oa1Var2 = oa1Var;
                                    oa1Var2.getClass();
                                    oa1Var2.presentFragment(new cj0(messageObject));
                                    return;
                                default:
                                    oa1 oa1Var3 = oa1Var;
                                    oa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", oa1Var3.f36713b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    oa1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    oa1 oa1Var2 = oa1Var;
                                    oa1Var2.getClass();
                                    oa1Var2.presentFragment(new cj0(messageObject));
                                    return;
                                default:
                                    oa1 oa1Var3 = oa1Var;
                                    oa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", oa1Var3.f36713b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    oa1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(oa1Var.P.U0(view, false));
                    H.Z();
                } else {
                    int i12 = t91Var.R;
                    if (i10 >= i12 && i10 <= t91Var.S) {
                        ((ha1) oa1Var.N.get(i10 - i12)).c(oa1Var.f36711a, oa1Var, d2VarArr, true);
                    } else {
                        int i13 = t91Var.O;
                        if (i10 >= i13 && i10 <= t91Var.P) {
                            ((ha1) oa1Var.L.get(i10 - i13)).c(oa1Var.f36711a, oa1Var, d2VarArr, true);
                        } else {
                            int i14 = t91Var.U;
                            if (i10 < i14 || i10 > t91Var.V) {
                                return false;
                            }
                            ((ha1) oa1Var.M.get(i10 - i14)).c(oa1Var.f36711a, oa1Var, d2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((ge1) this.f35555b).G.d(i10, view);
                return true;
        }
    }

    @Override
    public void k(int i10) {
        lh1 lh1Var = (lh1) this.f35555b;
        if (lh1Var.h == null && !lh1Var.f35770f.e()) {
            lh1Var.v.f32364f.e(false, true);
        }
        lh1Var.l();
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13;
        switch (this.f35554a) {
            case 3:
                PhotoViewer photoViewer = ((ct0) this.f35555b).f33220b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.f31887y, photoViewer.f31835s2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((mv0) this.f35555b).finishFragment();
                return;
            case 5:
                ((gv0) this.f35555b).f34516a.O.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f35555b;
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
                ((org.telegram.messenger.ok) this.f35555b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((t11) this.f35555b).f38356b;
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
                u11 u11Var = proxyListActivity.f32180a;
                if (u11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        u11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f32180a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f32180a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((ib1) this.f35555b).f34894a;
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
                    tb1 tb1Var = themeActivity.f32305a;
                    i12 = themeActivity.textSizeRow;
                    tb1Var.n(i12, new Object());
                    tb1 tb1Var2 = themeActivity.f32305a;
                    i13 = themeActivity.bubbleRadiusRow;
                    tb1Var2.n(i13, new Object());
                }
                if (themeActivity.f32309c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.X;
                    int i17 = org.telegram.ui.ActionBar.j6.f20053n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i17);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = new org.telegram.ui.ActionBar.c6();
                        c6Var.f19531c = "d";
                        c6Var.f19529a = "Blue_99_wp.jpg";
                        c6Var.f19530b = "Blue_99_wp.jpg";
                        h6Var.f19756y = c6Var;
                        N0.v(c6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f32309c.x1(N0);
                        themeActivity.f32309c.x0(0);
                        return;
                    } else if (N0.V != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f32313f == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z4), null, Integer.valueOf(i17));
                        themeActivity.f32305a.m(themeActivity.f32322n0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                jd1 jd1Var = ((mc1) this.f35555b).f36030a;
                org.telegram.ui.ActionBar.j6.j0(jd1Var.f35183b0, jd1Var.f35225s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, jd1Var.f35183b0, Boolean.valueOf(jd1Var.f35187c0), null, -1);
                jd1Var.finishFragment();
                return;
            default:
                ((ug1) this.f35555b).f38813a.E0(true);
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f35554a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f35555b, (org.telegram.ui.Components.i51) obj, (View) obj2);
                return;
            default:
                p31 p31Var = (p31) this.f35555b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                q31 q31Var = p31Var.v;
                if (i51Var.f1830a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p31Var.f36930b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(i51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            q31.G(q31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p31Var.f36931c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(i51Var.d);
                        if (tL_messageReportOption != null) {
                            q31.G(q31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = p31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            q31.G(q31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    q31.G(q31Var, i51Var.f25585l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean t1(int i10) {
        return true;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.f35555b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((lx0) this.f35555b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31986w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.msg_mini_lock3, 0);
                    lqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(lqVar, 0, 1, 33);
                    privacyControlActivity.f31986w0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31986w0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void J1(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((kh.l2) this.f35555b).run();
    }
}
