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
public final class gq0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.a81, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.l2, org.telegram.ui.Components.im0, ig.e, gg.a2 {
    public final int f38151a;
    public final Object f38152b;

    public gq0(Object obj, int i10) {
        this.f38151a = i10;
        this.f38152b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f38151a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38152b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f34172o0 = defaultWindowInsets;
                premiumPreviewFragment.f34153a.setPadding(0, defaultWindowInsets.f11576b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f34172o0.d);
                org.telegram.ui.Components.sm0 sm0Var = premiumPreviewFragment.f34153a;
                i0.b bVar = premiumPreviewFragment.f34172o0;
                AndroidUtilities.setViewLayoutMargins(sm0Var, bVar.f11575a, 0, bVar.f11577c, 0);
                ix0 ix0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f34172o0;
                ix0Var.setPadding(bVar2.f11575a, 0, bVar2.f11577c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f34172o0.f11575a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f34172o0;
                    frameLayout.setPadding(i12, dp, bVar3.f11577c, bVar3.d);
                }
                return r0.k1.f46866b;
            default:
                eh0 eh0Var = (eh0) ((bi1) this.f38152b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f11575a;
                eh0Var.M = i13;
                int i14 = defaultWindowInsets2.f11577c;
                eh0Var.N = i14;
                eh0Var.L = defaultWindowInsets2.d;
                View view2 = eh0Var.f37364y.f39062b;
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
                eh0Var.f37364y.setPadding(0, 0, 0, eh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + eh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    eh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = eh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) eh0Var.f36401c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    eh0Var.f36401c.setLayoutParams(marginLayoutParams2);
                }
                eh0Var.E.setPadding(i13, 0, i14, eh0Var.L);
                if (z10) {
                    k1Var = k1Var.f46867a.m(0, 0, 0, eh0Var.L);
                }
                eh0Var.i0();
                eh0Var.h0();
                SparseArray sparseArray = eh0Var.f36399a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    zh1 zh1Var = (zh1) sparseArray.valueAt(i15);
                    if (zh1Var != null && (fragmentView = zh1Var.f44668a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f46866b;
        }
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f38151a) {
            case 5:
                ((lw0) this.f38152b).e();
                return;
            default:
                ((le1) this.f38152b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.m00 m00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        m00Var.f(new org.telegram.ui.Components.n00((MediaController.SavedFilterState) this.f38152b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        ey0 ey0Var = (ey0) this.f38152b;
        if (z10) {
            ey0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f38151a) {
            case 16:
                return ((w71) this.f38152b).R(i10, view);
            case 17:
                final ab1 ab1Var = (ab1) this.f38152b;
                org.telegram.ui.ActionBar.a2[] a2VarArr = ab1Var.f35973h0;
                fa1 fa1Var = ab1Var.X;
                int i11 = fa1Var.I;
                if (i10 >= i11 && i10 <= fa1Var.J) {
                    final MessageObject messageObject = ((xa1) ab1Var.f35989v0.get(i10 - i11)).f44032b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(ab1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ab1 ab1Var2 = ab1Var;
                                    ab1Var2.getClass();
                                    ab1Var2.presentFragment(new kj0(messageObject));
                                    return;
                                default:
                                    ab1 ab1Var3 = ab1Var;
                                    ab1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ab1Var3.f35963b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ab1Var3.presentFragment(new zn(bundle), false);
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
                                    ab1Var2.presentFragment(new kj0(messageObject));
                                    return;
                                default:
                                    ab1 ab1Var3 = ab1Var;
                                    ab1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ab1Var3.f35963b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ab1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ab1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = fa1Var.U;
                    if (i10 >= i12 && i10 <= fa1Var.V) {
                        ((ta1) ab1Var.Q.get(i10 - i12)).c(ab1Var.f35961a, ab1Var, a2VarArr, true);
                    } else {
                        int i13 = fa1Var.R;
                        if (i10 >= i13 && i10 <= fa1Var.S) {
                            ((ta1) ab1Var.O.get(i10 - i13)).c(ab1Var.f35961a, ab1Var, a2VarArr, true);
                        } else {
                            int i14 = fa1Var.X;
                            if (i10 < i14 || i10 > fa1Var.Y) {
                                return false;
                            }
                            ((ta1) ab1Var.P.get(i10 - i14)).c(ab1Var.f35961a, ab1Var, a2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((te1) this.f38152b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f38151a) {
            case 2:
                PhotoViewer photoViewer = ((pt0) this.f38152b).f40958b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f34110y, photoViewer.f34083v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                ((zv0) this.f38152b).finishFragment();
                return;
            case 4:
                ((tv0) this.f38152b).f42280a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f38152b;
                int i14 = PopupNotificationActivity.f34140b0;
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
            case 10:
                ((org.telegram.messenger.jk) this.f38152b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((c21) this.f38152b).f36525b;
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
                d21 d21Var = proxyListActivity.f34420a;
                if (d21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        d21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34420a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((vb1) this.f38152b).f42973a;
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
                    gc1 gc1Var = themeActivity.f34557a;
                    i12 = themeActivity.textSizeRow;
                    gc1Var.n(i12, new Object());
                    gc1 gc1Var2 = themeActivity.f34557a;
                    i13 = themeActivity.bubbleRadiusRow;
                    gc1Var2.n(i13, new Object());
                }
                if (themeActivity.f34561c != null) {
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.g6 B0 = org.telegram.ui.ActionBar.h6.B0();
                    SparseArray sparseArray = O0.f20656a0;
                    int i17 = org.telegram.ui.ActionBar.h6.f20964n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.f21723c = "d";
                        z5Var.f21721a = "Blue_99_wp.jpg";
                        z5Var.f21722b = "Blue_99_wp.jpg";
                        f6Var.f20627y = z5Var;
                        O0.v(z5Var);
                    }
                    if (O0 != B0) {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.h6.u1(O0, true, false, true, false, false);
                        themeActivity.f34561c.z1(O0);
                        themeActivity.f34561c.x0(0);
                        return;
                    } else if (O0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34566f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, B0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f34557a.m(themeActivity.f34578q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.h6.p1(true);
                        return;
                    }
                }
                return;
            case 20:
                wd1 wd1Var = ((zc1) this.f38152b).f44638a;
                org.telegram.ui.ActionBar.h6.k0(wd1Var.f43340e0, wd1Var.f43375s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, wd1Var.f43340e0, Boolean.valueOf(wd1Var.f43344f0), null, -1);
                wd1Var.finishFragment();
                return;
            default:
                ((fh1) this.f38152b).f37682a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        xh1 xh1Var = (xh1) this.f38152b;
        if (xh1Var.h == null && !xh1Var.f44076f.e()) {
            xh1Var.v.f34624f.e(false, true);
        }
        xh1Var.l();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        a41 a41Var = (a41) this.f38152b;
        org.telegram.ui.Components.r61 r61Var = (org.telegram.ui.Components.r61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        b41 b41Var = a41Var.v;
        if (r61Var.f17175a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a41Var.f35877b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(r61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    b41.I(b41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a41Var.f35878c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(r61Var.d);
                if (tL_messageReportOption != null) {
                    b41.I(b41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = a41Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    b41.I(b41Var, null, bArr, null);
                    return;
                }
                return;
            }
            b41.I(b41Var, r61Var.f30361l, null, null);
        }
    }

    @Override
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f38152b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((xx0) this.f38152b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f34224z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.msg_mini_lock3, 0);
                    erVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(erVar, 0, 1, 33);
                    privacyControlActivity.f34224z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f34224z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void x0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.d1) this.f38152b).run();
    }
}
