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
public final class nl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.s61, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.cl0, ig.e, gg.b2 {
    public final int f35551a;
    public final Object f35552b;

    public nl0(Object obj, int i10) {
        this.f35551a = i10;
        this.f35552b = obj;
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
        switch (this.f35551a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f35552b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31144o0 = defaultWindowInsets;
                premiumPreviewFragment.f31126a.setPadding(0, defaultWindowInsets.f10577b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31144o0.d);
                org.telegram.ui.Components.ml0 ml0Var = premiumPreviewFragment.f31126a;
                i0.b bVar = premiumPreviewFragment.f31144o0;
                AndroidUtilities.setViewLayoutMargins(ml0Var, bVar.f10576a, 0, bVar.f10578c, 0);
                cx0 cx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31144o0;
                cx0Var.setPadding(bVar2.f10576a, 0, bVar2.f10578c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31144o0.f10576a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31144o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10578c, bVar3.d);
                }
                return r0.l1.f41806b;
            default:
                zg0 zg0Var = (zg0) ((th1) this.f35552b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10576a;
                zg0Var.M = i13;
                int i14 = defaultWindowInsets2.f10578c;
                zg0Var.N = i14;
                zg0Var.L = defaultWindowInsets2.d;
                View view2 = zg0Var.f40126y.f32120b;
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
                zg0Var.f40126y.setPadding(0, 0, 0, zg0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + zg0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zg0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    zg0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = zg0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) zg0Var.f37686c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    zg0Var.f37686c.setLayoutParams(marginLayoutParams2);
                }
                zg0Var.E.setPadding(i13, 0, i14, zg0Var.L);
                if (z10) {
                    l1Var = l1Var.f41807a.m(0, 0, 0, zg0Var.L);
                }
                zg0Var.i0();
                zg0Var.h0();
                SparseArray sparseArray = zg0Var.f37684a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    rh1 rh1Var = (rh1) sparseArray.valueAt(i15);
                    if (rh1Var != null && (fragmentView = rh1Var.f36853a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f41806b;
        }
    }

    @Override
    public void a() {
        switch (this.f35551a) {
            case 6:
                ((fw0) this.f35552b).e();
                return;
            default:
                ((de1) this.f35552b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.wz wzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        wzVar.f(new org.telegram.ui.Components.xz((MediaController.SavedFilterState) this.f35552b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        yx0 yx0Var = (yx0) this.f35552b;
        if (z10) {
            yx0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f35551a) {
            case 17:
                return ((m71) this.f35552b).Q(i10, view);
            case 18:
                final ra1 ra1Var = (ra1) this.f35552b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = ra1Var.f36763h0;
                w91 w91Var = ra1Var.X;
                int i11 = w91Var.I;
                if (i10 >= i11 && i10 <= w91Var.J) {
                    final MessageObject messageObject = ((oa1) ra1Var.f36779v0.get(i10 - i11)).f35755b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(ra1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ra1 ra1Var2 = ra1Var;
                                    ra1Var2.getClass();
                                    ra1Var2.presentFragment(new ej0(messageObject));
                                    return;
                                default:
                                    ra1 ra1Var3 = ra1Var;
                                    ra1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ra1Var3.f36754b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ra1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ra1 ra1Var2 = ra1Var;
                                    ra1Var2.getClass();
                                    ra1Var2.presentFragment(new ej0(messageObject));
                                    return;
                                default:
                                    ra1 ra1Var3 = ra1Var;
                                    ra1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ra1Var3.f36754b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ra1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ra1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = w91Var.U;
                    if (i10 >= i12 && i10 <= w91Var.V) {
                        ((ka1) ra1Var.Q.get(i10 - i12)).c(ra1Var.f36752a, ra1Var, b2VarArr, true);
                    } else {
                        int i13 = w91Var.R;
                        if (i10 >= i13 && i10 <= w91Var.S) {
                            ((ka1) ra1Var.O.get(i10 - i13)).c(ra1Var.f36752a, ra1Var, b2VarArr, true);
                        } else {
                            int i14 = w91Var.X;
                            if (i10 < i14 || i10 > w91Var.Y) {
                                return false;
                            }
                            ((ka1) ra1Var.P.get(i10 - i14)).c(ra1Var.f36752a, ra1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((le1) this.f35552b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f35551a) {
            case 3:
                PhotoViewer photoViewer = ((jt0) this.f35552b).f34507b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31086y, photoViewer.f31059v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                ((tv0) this.f35552b).finishFragment();
                return;
            case 5:
                ((nv0) this.f35552b).f35609a.R.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f35552b;
                int i14 = PopupNotificationActivity.f31114b0;
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
                ((org.telegram.messenger.mk) this.f35552b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((x11) this.f35552b).f39155b;
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
                y11 y11Var = proxyListActivity.f31389a;
                if (y11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        y11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31389a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((nb1) this.f35552b).f35492a;
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
                    yb1 yb1Var = themeActivity.f31520a;
                    i12 = themeActivity.textSizeRow;
                    yb1Var.n(i12, new Object());
                    yb1 yb1Var2 = themeActivity.f31520a;
                    i13 = themeActivity.bubbleRadiusRow;
                    yb1Var2.n(i13, new Object());
                }
                if (themeActivity.f31524c != null) {
                    org.telegram.ui.ActionBar.g6 N0 = org.telegram.ui.ActionBar.h6.N0("Blue");
                    org.telegram.ui.ActionBar.g6 A0 = org.telegram.ui.ActionBar.h6.A0();
                    SparseArray sparseArray = N0.f18683a0;
                    int i17 = org.telegram.ui.ActionBar.h6.f18966n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.f18425c = "d";
                        a6Var.f18423a = "Blue_99_wp.jpg";
                        a6Var.f18424b = "Blue_99_wp.jpg";
                        f6Var.f18656y = a6Var;
                        N0.v(a6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.h6.t1(N0, true, false, true, false, false);
                        themeActivity.f31524c.y1(N0);
                        themeActivity.f31524c.x0(0);
                        return;
                    } else if (N0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31528f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f31520a.m(themeActivity.f31540q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.h6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                od1 od1Var = ((rc1) this.f35552b).f36795a;
                org.telegram.ui.ActionBar.h6.j0(od1Var.f35794e0, od1Var.f35829s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, od1Var.f35794e0, Boolean.valueOf(od1Var.f35798f0), null, -1);
                od1Var.finishFragment();
                return;
            default:
                ((xg1) this.f35552b).f39273a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        ph1 ph1Var = (ph1) this.f35552b;
        if (ph1Var.h == null && !ph1Var.f36116f.e()) {
            ph1Var.v.f31582f.e(false, true);
        }
        ph1Var.l();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f35551a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f35552b, (org.telegram.ui.Components.h51) obj, (View) obj2);
                return;
            default:
                t31 t31Var = (t31) this.f35552b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                u31 u31Var = t31Var.v;
                if (h51Var.f15508a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = t31Var.f37513b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(h51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            u31.H(u31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = t31Var.f37514c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(h51Var.d);
                        if (tL_messageReportOption != null) {
                            u31.H(u31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = t31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            u31.H(u31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    u31.H(u31Var, h51Var.f24507l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f35552b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((rx0) this.f35552b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31195z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock3, 0);
                    pqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(pqVar, 0, 1, 33);
                    privacyControlActivity.f31195z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31195z0);
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
        ((gg.e1) this.f35552b).run();
    }
}
