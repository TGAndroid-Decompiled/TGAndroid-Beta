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
public final class ml0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.h71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.l2, org.telegram.ui.Components.ml0, ig.e, gg.b2 {
    public final int f35618a;
    public final Object f35619b;

    public ml0(Object obj, int i10) {
        this.f35618a = i10;
        this.f35619b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f35618a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f35619b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31459o0 = defaultWindowInsets;
                premiumPreviewFragment.f31441a.setPadding(0, defaultWindowInsets.f10577b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31459o0.d);
                org.telegram.ui.Components.wl0 wl0Var = premiumPreviewFragment.f31441a;
                i0.b bVar = premiumPreviewFragment.f31459o0;
                AndroidUtilities.setViewLayoutMargins(wl0Var, bVar.f10576a, 0, bVar.f10578c, 0);
                ax0 ax0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31459o0;
                ax0Var.setPadding(bVar2.f10576a, 0, bVar2.f10578c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31459o0.f10576a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31459o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10578c, bVar3.d);
                }
                return r0.l1.f42139b;
            default:
                yg0 yg0Var = (yg0) ((th1) this.f35619b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10576a;
                yg0Var.M = i13;
                int i14 = defaultWindowInsets2.f10578c;
                yg0Var.N = i14;
                yg0Var.L = defaultWindowInsets2.d;
                View view2 = yg0Var.f40148y.f32425b;
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
                yg0Var.f40148y.setPadding(0, 0, 0, yg0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + yg0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    yg0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = yg0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) yg0Var.f38126c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    yg0Var.f38126c.setLayoutParams(marginLayoutParams2);
                }
                yg0Var.E.setPadding(i13, 0, i14, yg0Var.L);
                if (z10) {
                    l1Var = l1Var.f42140a.m(0, 0, 0, yg0Var.L);
                }
                yg0Var.i0();
                yg0Var.h0();
                SparseArray sparseArray = yg0Var.f38124a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    rh1 rh1Var = (rh1) sparseArray.valueAt(i15);
                    if (rh1Var != null && (fragmentView = rh1Var.f37337a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f42139b;
        }
    }

    @Override
    public void a(int i10) {
        ph1 ph1Var = (ph1) this.f35619b;
        if (ph1Var.h == null && !ph1Var.f36550f.e()) {
            ph1Var.v.f31897f.e(false, true);
        }
        ph1Var.l();
    }

    @Override
    public void b() {
        switch (this.f35618a) {
            case 6:
                ((dw0) this.f35619b).e();
                return;
            default:
                ((de1) this.f35619b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.wz wzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        wzVar.f(new org.telegram.ui.Components.xz((MediaController.SavedFilterState) this.f35619b));
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f35618a) {
            case 17:
                return ((n71) this.f35619b).Q(i10, view);
            case 18:
                final sa1 sa1Var = (sa1) this.f35619b;
                org.telegram.ui.ActionBar.a2[] a2VarArr = sa1Var.f37678h0;
                x91 x91Var = sa1Var.X;
                int i11 = x91Var.I;
                if (i10 >= i11 && i10 <= x91Var.J) {
                    final MessageObject messageObject = ((pa1) sa1Var.f37694v0.get(i10 - i11)).f36486b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(sa1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    sa1 sa1Var2 = sa1Var;
                                    sa1Var2.getClass();
                                    sa1Var2.presentFragment(new dj0(messageObject));
                                    return;
                                default:
                                    sa1 sa1Var3 = sa1Var;
                                    sa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", sa1Var3.f37669b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    sa1Var3.presentFragment(new wn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    sa1 sa1Var2 = sa1Var;
                                    sa1Var2.getClass();
                                    sa1Var2.presentFragment(new dj0(messageObject));
                                    return;
                                default:
                                    sa1 sa1Var3 = sa1Var;
                                    sa1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", sa1Var3.f37669b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    sa1Var3.presentFragment(new wn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(sa1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = x91Var.U;
                    if (i10 >= i12 && i10 <= x91Var.V) {
                        ((la1) sa1Var.Q.get(i10 - i12)).c(sa1Var.f37667a, sa1Var, a2VarArr, true);
                    } else {
                        int i13 = x91Var.R;
                        if (i10 >= i13 && i10 <= x91Var.S) {
                            ((la1) sa1Var.O.get(i10 - i13)).c(sa1Var.f37667a, sa1Var, a2VarArr, true);
                        } else {
                            int i14 = x91Var.X;
                            if (i10 < i14 || i10 > x91Var.Y) {
                                return false;
                            }
                            ((la1) sa1Var.P.get(i10 - i14)).c(sa1Var.f37667a, sa1Var, a2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((le1) this.f35619b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        xx0 xx0Var = (xx0) this.f35619b;
        if (z10) {
            xx0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f35618a) {
            case 3:
                PhotoViewer photoViewer = ((it0) this.f35619b).f34576b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31401y, photoViewer.f31374v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((rv0) this.f35619b).finishFragment();
                return;
            case 5:
                ((lv0) this.f35619b).f35416a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f35619b;
                int i14 = PopupNotificationActivity.f31429b0;
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
            case 11:
                ((org.telegram.messenger.lk) this.f35619b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((v11) this.f35619b).f38600b;
                ArrayList arrayList = proxyListActivity.F;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.b0(true);
                w11 w11Var = proxyListActivity.f31704a;
                if (w11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        w11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31704a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((nb1) this.f35619b).f35844a;
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
                    yb1 yb1Var = themeActivity.f31835a;
                    i12 = themeActivity.textSizeRow;
                    yb1Var.n(i12, new Object());
                    yb1 yb1Var2 = themeActivity.f31835a;
                    i13 = themeActivity.bubbleRadiusRow;
                    yb1Var2.n(i13, new Object());
                }
                if (themeActivity.f31839c != null) {
                    org.telegram.ui.ActionBar.g6 N0 = org.telegram.ui.ActionBar.h6.N0("Blue");
                    org.telegram.ui.ActionBar.g6 A0 = org.telegram.ui.ActionBar.h6.A0();
                    SparseArray sparseArray = N0.f18933a0;
                    int i17 = org.telegram.ui.ActionBar.h6.f19236n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.f19960c = "d";
                        z5Var.f19958a = "Blue_99_wp.jpg";
                        z5Var.f19959b = "Blue_99_wp.jpg";
                        f6Var.f18905y = z5Var;
                        N0.v(z5Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.h6.t1(N0, true, false, true, false, false);
                        themeActivity.f31839c.y1(N0);
                        themeActivity.f31839c.x0(0);
                        return;
                    } else if (N0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31843f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f31835a.m(themeActivity.f31855q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.h6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                od1 od1Var = ((rc1) this.f35619b).f37298a;
                org.telegram.ui.ActionBar.h6.j0(od1Var.f36166e0, od1Var.f36201s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, od1Var.f36166e0, Boolean.valueOf(od1Var.f36170f0), null, -1);
                od1Var.finishFragment();
                return;
            default:
                ((xg1) this.f35619b).f39921a.E0(true);
                return;
        }
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f35618a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f35619b, (org.telegram.ui.Components.v51) obj, (View) obj2);
                return;
            default:
                s31 s31Var = (s31) this.f35619b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                t31 t31Var = s31Var.v;
                if (v51Var.f15715a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = s31Var.f37582b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(v51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            t31.H(t31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = s31Var.f37583c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(v51Var.d);
                        if (tL_messageReportOption != null) {
                            t31.H(t31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = s31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            t31.H(t31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    t31.H(t31Var, v51Var.f29048l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f35619b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((qx0) this.f35619b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31510z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock3, 0);
                    pqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(pqVar, 0, 1, 33);
                    privacyControlActivity.f31510z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31510z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void F(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.e1) this.f35619b).run();
    }
}
