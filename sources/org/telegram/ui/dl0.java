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
public final class dl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.x51, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.n1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.ok0, qf.e, of.u1 {
    public final int f37559a;
    public final Object f37560b;

    public dl0(Object obj, int i9) {
        this.f37559a = i9;
        this.f37560b = obj;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        boolean z10;
        int i9;
        int i10;
        View fragmentView;
        switch (this.f37559a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37560b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f35854k0 = defaultWindowInsets;
                premiumPreviewFragment.f35839a.setPadding(0, defaultWindowInsets.f10849b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f35854k0.d);
                org.telegram.ui.Components.wk0 wk0Var = premiumPreviewFragment.f35839a;
                i0.b bVar = premiumPreviewFragment.f35854k0;
                AndroidUtilities.setViewLayoutMargins(wk0Var, bVar.f10848a, 0, bVar.f10850c, 0);
                fw0 fw0Var = premiumPreviewFragment.Q;
                i0.b bVar2 = premiumPreviewFragment.f35854k0;
                fw0Var.setPadding(bVar2.f10848a, 0, bVar2.f10850c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.F;
                if (frameLayout != null) {
                    int i11 = premiumPreviewFragment.f35854k0.f10848a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f35854k0;
                    frameLayout.setPadding(i11, dp, bVar3.f10850c, bVar3.d);
                }
                return r0.m1.f46928b;
            default:
                ng0 ng0Var = (ng0) ((tg1) this.f37560b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i12 = defaultWindowInsets2.f10848a;
                ng0Var.I = i12;
                int i13 = defaultWindowInsets2.f10850c;
                ng0Var.J = i13;
                ng0Var.H = defaultWindowInsets2.d;
                View view2 = ng0Var.f40724y.f37205b;
                if (view2 != null && view2.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i9 = AndroidUtilities.dp(44.0f);
                } else {
                    i9 = 0;
                }
                ng0Var.f40724y.setPadding(0, 0, 0, ng0Var.H);
                int dp2 = AndroidUtilities.dp(72.0f) + ng0Var.H + i9;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ng0Var.D.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    ng0Var.D.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i10 = ng0Var.H + i9;
                } else {
                    i10 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ng0Var.f42999c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i10 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != i13) {
                    marginLayoutParams2.leftMargin = i12;
                    marginLayoutParams2.rightMargin = i13;
                    marginLayoutParams2.bottomMargin = i10;
                    ng0Var.f42999c.setLayoutParams(marginLayoutParams2);
                }
                ng0Var.A.setPadding(i12, 0, i13, ng0Var.H);
                if (z10) {
                    m1Var = m1Var.f46929a.m(0, 0, 0, ng0Var.H);
                }
                ng0Var.h0();
                ng0Var.g0();
                SparseArray sparseArray = ng0Var.f42997a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    rg1 rg1Var = (rg1) sparseArray.valueAt(i14);
                    if (rg1Var != null && (fragmentView = rg1Var.f42421a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f46928b;
        }
    }

    @Override
    public a0.h O() {
        return null;
    }

    @Override
    public boolean a(int i9, View view) {
        switch (this.f37559a) {
            case 17:
                return ((o61) this.f37560b).P(i9, view);
            case 18:
                final s91 s91Var = (s91) this.f37560b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = s91Var.f42612d0;
                x81 x81Var = s91Var.T;
                int i10 = x81Var.E;
                if (i9 >= i10 && i9 <= x81Var.F) {
                    final MessageObject messageObject = ((p91) s91Var.f42629r0.get(i9 - i10)).f41381b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(s91Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    s91 s91Var2 = s91Var;
                                    s91Var2.getClass();
                                    s91Var2.presentFragment(new ti0(messageObject));
                                    return;
                                default:
                                    s91 s91Var3 = s91Var;
                                    s91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", s91Var3.f42608b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    s91Var3.presentFragment(new qn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    s91 s91Var2 = s91Var;
                                    s91Var2.getClass();
                                    s91Var2.presentFragment(new ti0(messageObject));
                                    return;
                                default:
                                    s91 s91Var3 = s91Var;
                                    s91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", s91Var3.f42608b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    s91Var3.presentFragment(new qn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(s91Var.O.V0(view, false));
                    H.Z();
                } else {
                    int i11 = x81Var.Q;
                    if (i9 >= i11 && i9 <= x81Var.R) {
                        ((l91) s91Var.M.get(i9 - i11)).c(s91Var.f42606a, s91Var, c2VarArr, true);
                    } else {
                        int i12 = x81Var.N;
                        if (i9 >= i12 && i9 <= x81Var.O) {
                            ((l91) s91Var.K.get(i9 - i12)).c(s91Var.f42606a, s91Var, c2VarArr, true);
                        } else {
                            int i13 = x81Var.T;
                            if (i9 < i13 || i9 > x81Var.U) {
                                return false;
                            }
                            ((l91) s91Var.L.get(i9 - i13)).c(s91Var.f42606a, s91Var, c2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((kd1) this.f37560b).F.a(i9, view);
                return true;
        }
    }

    @Override
    public void b() {
        switch (this.f37559a) {
            case 6:
                ((iv0) this.f37560b).e();
                return;
            default:
                ((dd1) this.f37560b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.hz hzVar) {
        Drawable[] drawableArr = PhotoViewer.P8;
        hzVar.f(new org.telegram.ui.Components.iz((MediaController.SavedFilterState) this.f37560b));
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        bx0 bx0Var = (bx0) this.f37560b;
        if (z10) {
            bx0Var.d.T((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void e(int i9) {
        pg1 pg1Var = (pg1) this.f37560b;
        if (pg1Var.h == null && !pg1Var.f41518f.e()) {
            pg1Var.v.f36289f.e(false, true);
        }
        pg1Var.l();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        switch (this.f37559a) {
            case 3:
                PhotoViewer photoViewer = ((ns0) this.f37560b).f40805b;
                try {
                    AndroidUtilities.openForView(photoViewer.P4, photoViewer.f35797y, photoViewer.f35735r2, true);
                    photoViewer.F0(false, false);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                ((xu0) this.f37560b).finishFragment();
                return;
            case 5:
                ((ru0) this.f37560b).f42494a.N.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37560b;
                int i13 = PopupNotificationActivity.X;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 11:
                ((org.telegram.messenger.dk) this.f37560b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((a11) this.f37560b).f36330b;
                ArrayList arrayList = proxyListActivity.D;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.f36099e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i15 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i15);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i15);
                proxyListActivity.b0(true);
                b11 b11Var = proxyListActivity.f36096a;
                if (b11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        b11Var.n(ProxyListActivity.Z(proxyListActivity), 0);
                        proxyListActivity.f36096a.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f36096a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((ma1) this.f37560b).f40373a;
                if (AndroidUtilities.isTablet()) {
                    i10 = 18;
                } else {
                    i10 = 16;
                }
                boolean j02 = ThemeActivity.j0(themeActivity, i10);
                if (ThemeActivity.X(themeActivity, 17, true)) {
                    j02 = true;
                }
                if (j02) {
                    xa1 xa1Var = themeActivity.f36225a;
                    i11 = themeActivity.textSizeRow;
                    xa1Var.n(i11, new Object());
                    xa1 xa1Var2 = themeActivity.f36225a;
                    i12 = themeActivity.bubbleRadiusRow;
                    xa1Var2.n(i12, new Object());
                }
                if (themeActivity.f36229c != null) {
                    org.telegram.ui.ActionBar.e6 N0 = org.telegram.ui.ActionBar.f6.N0("Blue");
                    org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
                    SparseArray sparseArray = N0.W;
                    int i16 = org.telegram.ui.ActionBar.f6.f23172n;
                    org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) sparseArray.get(i16);
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5();
                        y5Var.f23982c = "d";
                        y5Var.f23980a = "Blue_99_wp.jpg";
                        y5Var.f23981b = "Blue_99_wp.jpg";
                        d6Var.f22887y = y5Var;
                        N0.v(y5Var);
                    }
                    if (N0 != A0) {
                        N0.u(i16);
                        org.telegram.ui.ActionBar.f6.t1(N0, true, false, true, false, false);
                        themeActivity.f36229c.y1(N0);
                        themeActivity.f36229c.x0(0);
                        return;
                    } else if (N0.U != i16) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i17 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f36234f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i17, A0, Boolean.valueOf(z10), null, Integer.valueOf(i16));
                        themeActivity.f36225a.m(themeActivity.m0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.f6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                oc1 oc1Var = ((rb1) this.f37560b).f42358a;
                org.telegram.ui.ActionBar.f6.j0(oc1Var.f41057a0, oc1Var.f41102s, true);
                org.telegram.ui.ActionBar.f6.o();
                org.telegram.ui.ActionBar.f6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, oc1Var.f41057a0, Boolean.valueOf(oc1Var.f41060b0), null, -1);
                oc1Var.finishFragment();
                return;
            default:
                ((yf1) this.f37560b).f44856a.D0(true);
                return;
        }
    }

    @Override
    public boolean p0(int i9) {
        return true;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37559a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.V((PasskeysActivity) this.f37560b, (org.telegram.ui.Components.l41) obj, (View) obj2);
                return;
            default:
                x21 x21Var = (x21) this.f37560b;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                y21 y21Var = x21Var.v;
                if (l41Var.f48814a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.f44337b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(l41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            y21.G(y21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.f44338c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(l41Var.d);
                        if (tL_messageReportOption != null) {
                            y21.G(y21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = x21Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            y21.G(y21Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    y21.G(y21Var, l41Var.f30339l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.jh((SharedConfig.ProxyInfo) this.f37560b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((uw0) this.f37560b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f35899v0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3, 0);
                    eqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(eqVar, 0, 1, 33);
                    privacyControlActivity.f35899v0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f35899v0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void H0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((fh.u2) this.f37560b).run();
    }
}
