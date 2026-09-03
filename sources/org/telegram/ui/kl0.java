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
public final class kl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.w61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.kl0, wf.e, uf.j1 {
    public final int f38341a;
    public final Object f38342b;

    public kl0(Object obj, int i10) {
        this.f38341a = i10;
        this.f38342b = obj;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f38341a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38342b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f34496l0 = defaultWindowInsets;
                premiumPreviewFragment.f34480a.setPadding(0, defaultWindowInsets.f7758b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f34496l0.d);
                org.telegram.ui.Components.sl0 sl0Var = premiumPreviewFragment.f34480a;
                i0.b bVar = premiumPreviewFragment.f34496l0;
                AndroidUtilities.setViewLayoutMargins(sl0Var, bVar.f7757a, 0, bVar.f7759c, 0);
                vw0 vw0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.f34496l0;
                vw0Var.setPadding(bVar2.f7757a, 0, bVar2.f7759c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f34496l0.f7757a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f34496l0;
                    frameLayout.setPadding(i12, dp, bVar3.f7759c, bVar3.d);
                }
                return r0.m1.f46482b;
            default:
                wg0 wg0Var = (wg0) ((ph1) this.f38342b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i13 = defaultWindowInsets2.f7757a;
                wg0Var.J = i13;
                int i14 = defaultWindowInsets2.f7759c;
                wg0Var.K = i14;
                wg0Var.I = defaultWindowInsets2.d;
                View view2 = wg0Var.f42769y.f43042b;
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
                wg0Var.f42769y.setPadding(0, 0, 0, wg0Var.I);
                int dp2 = AndroidUtilities.dp(72.0f) + wg0Var.I + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    wg0Var.E.setLayoutParams(marginLayoutParams);
                }
                if (z4) {
                    i11 = wg0Var.I + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) wg0Var.f40022c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    wg0Var.f40022c.setLayoutParams(marginLayoutParams2);
                }
                wg0Var.B.setPadding(i13, 0, i14, wg0Var.I);
                if (z4) {
                    m1Var = m1Var.f46483a.m(0, 0, 0, wg0Var.I);
                }
                wg0Var.i0();
                wg0Var.h0();
                SparseArray sparseArray = wg0Var.f40020a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    nh1 nh1Var = (nh1) sparseArray.valueAt(i15);
                    if (nh1Var != null && (fragmentView = nh1Var.f39375a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f46482b;
        }
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public void a() {
        switch (this.f38341a) {
            case 6:
                ((yv0) this.f38342b).e();
                return;
            default:
                ((zd1) this.f38342b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.xz xzVar) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        xzVar.f(new org.telegram.ui.Components.yz((MediaController.SavedFilterState) this.f38342b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        sx0 sx0Var = (sx0) this.f38342b;
        if (z4) {
            sx0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f38341a) {
            case 17:
                return ((k71) this.f38342b).Q(i10, view);
            case 18:
                final na1 na1Var = (na1) this.f38342b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = na1Var.f39256e0;
                s91 s91Var = na1Var.U;
                int i11 = s91Var.F;
                if (i10 >= i11 && i10 <= s91Var.G) {
                    final MessageObject messageObject = ((ka1) na1Var.f39273s0.get(i10 - i11)).f38242b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(na1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    na1 na1Var2 = na1Var;
                                    na1Var2.getClass();
                                    na1Var2.presentFragment(new bj0(messageObject));
                                    return;
                                default:
                                    na1 na1Var3 = na1Var;
                                    na1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", na1Var3.f39250b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    na1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    na1 na1Var2 = na1Var;
                                    na1Var2.getClass();
                                    na1Var2.presentFragment(new bj0(messageObject));
                                    return;
                                default:
                                    na1 na1Var3 = na1Var;
                                    na1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", na1Var3.f39250b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    na1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(na1Var.P.U0(view, false));
                    H.Z();
                } else {
                    int i12 = s91Var.R;
                    if (i10 >= i12 && i10 <= s91Var.S) {
                        ((ga1) na1Var.N.get(i10 - i12)).c(na1Var.f39248a, na1Var, d2VarArr, true);
                    } else {
                        int i13 = s91Var.O;
                        if (i10 >= i13 && i10 <= s91Var.P) {
                            ((ga1) na1Var.L.get(i10 - i13)).c(na1Var.f39248a, na1Var, d2VarArr, true);
                        } else {
                            int i14 = s91Var.U;
                            if (i10 < i14 || i10 > s91Var.V) {
                                return false;
                            }
                            ((ga1) na1Var.M.get(i10 - i14)).c(na1Var.f39248a, na1Var, d2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((he1) this.f38342b).G.f(i10, view);
                return true;
        }
    }

    @Override
    public void g(int i10) {
        lh1 lh1Var = (lh1) this.f38342b;
        if (lh1Var.h == null && !lh1Var.f38653f.e()) {
            lh1Var.v.f34934f.e(false, true);
        }
        lh1Var.l();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13;
        switch (this.f38341a) {
            case 3:
                PhotoViewer photoViewer = ((ct0) this.f38342b).f35859b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.f34439y, photoViewer.f34387s2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ((mv0) this.f38342b).finishFragment();
                return;
            case 5:
                ((gv0) this.f38342b).f37168a.O.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f38342b;
                int i14 = PopupNotificationActivity.Y;
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
            case 11:
                ((org.telegram.messenger.ok) this.f38342b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((t11) this.f38342b).f41381b;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.f34742e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.c0(true);
                u11 u11Var = proxyListActivity.f34739a;
                if (u11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        u11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f34739a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34739a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((hb1) this.f38342b).f37320a;
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
                    sb1 sb1Var = themeActivity.f34870a;
                    i12 = themeActivity.textSizeRow;
                    sb1Var.n(i12, new Object());
                    sb1 sb1Var2 = themeActivity.f34870a;
                    i13 = themeActivity.bubbleRadiusRow;
                    sb1Var2.n(i13, new Object());
                }
                if (themeActivity.f34874c != null) {
                    org.telegram.ui.ActionBar.j6 N0 = org.telegram.ui.ActionBar.k6.N0("Blue");
                    org.telegram.ui.ActionBar.j6 A0 = org.telegram.ui.ActionBar.k6.A0();
                    SparseArray sparseArray = N0.X;
                    int i17 = org.telegram.ui.ActionBar.k6.f21834n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i17);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.f21286c = "d";
                        d6Var.f21284a = "Blue_99_wp.jpg";
                        d6Var.f21285b = "Blue_99_wp.jpg";
                        i6Var.f21490y = d6Var;
                        N0.v(d6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.k6.t1(N0, true, false, true, false, false);
                        themeActivity.f34874c.x1(N0);
                        themeActivity.f34874c.x0(0);
                        return;
                    } else if (N0.V != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34879f == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z4), null, Integer.valueOf(i17));
                        themeActivity.f34870a.m(themeActivity.f34888n0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.k6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                jd1 jd1Var = ((lc1) this.f38342b).f38613a;
                org.telegram.ui.ActionBar.k6.j0(jd1Var.f37965b0, jd1Var.f38008s, true);
                org.telegram.ui.ActionBar.k6.o();
                org.telegram.ui.ActionBar.k6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, jd1Var.f37965b0, Boolean.valueOf(jd1Var.f37969c0), null, -1);
                jd1Var.finishFragment();
                return;
            default:
                ((tg1) this.f38342b).f41538a.E0(true);
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f38341a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f38342b, (org.telegram.ui.Components.h51) obj, (View) obj2);
                return;
            default:
                p31 p31Var = (p31) this.f38342b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                q31 q31Var = p31Var.v;
                if (h51Var.f2505a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p31Var.f39873b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(h51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            q31.G(q31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p31Var.f39874c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(h51Var.d);
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
                    q31.G(q31Var, h51Var.f27375l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.f38342b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((lx0) this.f38342b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f34543w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f34543w0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f34543w0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void V(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((lh.l2) this.f38342b).run();
    }
}
