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
public final class jq0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.e81, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.l2, org.telegram.ui.Components.mm0, ig.e, gg.a2 {
    public final int f39268a;
    public final Object f39269b;

    public jq0(Object obj, int i10) {
        this.f39268a = i10;
        this.f39269b = obj;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f39268a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f39269b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f33983o0 = defaultWindowInsets;
                premiumPreviewFragment.f33964a.setPadding(0, defaultWindowInsets.f11575b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f33983o0.d);
                org.telegram.ui.Components.wm0 wm0Var = premiumPreviewFragment.f33964a;
                i0.b bVar = premiumPreviewFragment.f33983o0;
                AndroidUtilities.setViewLayoutMargins(wm0Var, bVar.f11574a, 0, bVar.f11576c, 0);
                lx0 lx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f33983o0;
                lx0Var.setPadding(bVar2.f11574a, 0, bVar2.f11576c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33983o0.f11574a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f33983o0;
                    frameLayout.setPadding(i12, dp, bVar3.f11576c, bVar3.d);
                }
                return r0.k1.f46999b;
            default:
                gh0 gh0Var = (gh0) ((ei1) this.f39269b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f11574a;
                gh0Var.M = i13;
                int i14 = defaultWindowInsets2.f11576c;
                gh0Var.N = i14;
                gh0Var.L = defaultWindowInsets2.d;
                View view2 = gh0Var.f38057y.f40049b;
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
                gh0Var.f38057y.setPadding(0, 0, 0, gh0Var.L);
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
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gh0Var.f37121c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    gh0Var.f37121c.setLayoutParams(marginLayoutParams2);
                }
                gh0Var.E.setPadding(i13, 0, i14, gh0Var.L);
                if (z10) {
                    k1Var = k1Var.f47000a.m(0, 0, 0, gh0Var.L);
                }
                gh0Var.i0();
                gh0Var.h0();
                SparseArray sparseArray = gh0Var.f37119a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ci1 ci1Var = (ci1) sparseArray.valueAt(i15);
                    if (ci1Var != null && (fragmentView = ci1Var.f36443a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f46999b;
        }
    }

    @Override
    public a0.i W() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f39268a) {
            case 5:
                ((ow0) this.f39269b).e();
                return;
            default:
                ((oe1) this.f39269b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.o00 o00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        o00Var.f(new org.telegram.ui.Components.p00((MediaController.SavedFilterState) this.f39269b));
    }

    @Override
    public boolean b0(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        hy0 hy0Var = (hy0) this.f39269b;
        if (z10) {
            hy0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f39268a) {
            case 16:
                return ((a81) this.f39269b).R(i10, view);
            case 17:
                final db1 db1Var = (db1) this.f39269b;
                org.telegram.ui.ActionBar.a2[] a2VarArr = db1Var.f36736h0;
                ia1 ia1Var = db1Var.X;
                int i11 = ia1Var.I;
                if (i10 >= i11 && i10 <= ia1Var.J) {
                    final MessageObject messageObject = ((ab1) db1Var.f36752v0.get(i10 - i11)).f35755b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.s80 H = org.telegram.ui.Components.s80.H(db1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    db1 db1Var2 = db1Var;
                                    db1Var2.getClass();
                                    db1Var2.presentFragment(new mj0(messageObject));
                                    return;
                                default:
                                    db1 db1Var3 = db1Var;
                                    db1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", db1Var3.f36726b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    db1Var3.presentFragment(new eo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    db1 db1Var2 = db1Var;
                                    db1Var2.getClass();
                                    db1Var2.presentFragment(new mj0(messageObject));
                                    return;
                                default:
                                    db1 db1Var3 = db1Var;
                                    db1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", db1Var3.f36726b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    db1Var3.presentFragment(new eo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(db1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = ia1Var.U;
                    if (i10 >= i12 && i10 <= ia1Var.V) {
                        ((wa1) db1Var.Q.get(i10 - i12)).c(db1Var.f36724a, db1Var, a2VarArr, true);
                    } else {
                        int i13 = ia1Var.R;
                        if (i10 >= i13 && i10 <= ia1Var.S) {
                            ((wa1) db1Var.O.get(i10 - i13)).c(db1Var.f36724a, db1Var, a2VarArr, true);
                        } else {
                            int i14 = ia1Var.X;
                            if (i10 < i14 || i10 > ia1Var.Y) {
                                return false;
                            }
                            ((wa1) db1Var.P.get(i10 - i14)).c(db1Var.f36724a, db1Var, a2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((we1) this.f39269b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f39268a) {
            case 2:
                PhotoViewer photoViewer = ((st0) this.f39269b).f41986b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f33921y, photoViewer.f33894v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                ((cw0) this.f39269b).finishFragment();
                return;
            case 4:
                ((wv0) this.f39269b).f43686a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f39269b;
                int i14 = PopupNotificationActivity.f33951b0;
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
                ((org.telegram.messenger.pk) this.f39269b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((g21) this.f39269b).f37900b;
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
                h21 h21Var = proxyListActivity.f34231a;
                if (h21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        h21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34231a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((yb1) this.f39269b).f44448a;
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
                    jc1 jc1Var = themeActivity.f34368a;
                    i12 = themeActivity.textSizeRow;
                    jc1Var.n(i12, new Object());
                    jc1 jc1Var2 = themeActivity.f34368a;
                    i13 = themeActivity.bubbleRadiusRow;
                    jc1Var2.n(i13, new Object());
                }
                if (themeActivity.f34372c != null) {
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.g6 B0 = org.telegram.ui.ActionBar.h6.B0();
                    SparseArray sparseArray = O0.f20430a0;
                    int i17 = org.telegram.ui.ActionBar.h6.f20738n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i17);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.f21498c = "d";
                        z5Var.f21496a = "Blue_99_wp.jpg";
                        z5Var.f21497b = "Blue_99_wp.jpg";
                        e6Var.f20371y = z5Var;
                        O0.v(z5Var);
                    }
                    if (O0 != B0) {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.h6.u1(O0, true, false, true, false, false);
                        themeActivity.f34372c.z1(O0);
                        themeActivity.f34372c.x0(0);
                        return;
                    } else if (O0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34377f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, B0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f34368a.m(themeActivity.f34389q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.h6.p1(true);
                        return;
                    }
                }
                return;
            case 20:
                zd1 zd1Var = ((cd1) this.f39269b).f36406a;
                org.telegram.ui.ActionBar.h6.k0(zd1Var.f44749e0, zd1Var.f44784s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, zd1Var.f44749e0, Boolean.valueOf(zd1Var.f44753f0), null, -1);
                zd1Var.finishFragment();
                return;
            default:
                ((ih1) this.f39269b).f38912a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        ai1 ai1Var = (ai1) this.f39269b;
        if (ai1Var.h == null && !ai1Var.f35847f.e()) {
            ai1Var.v.f34435f.e(false, true);
        }
        ai1Var.l();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d41 d41Var = (d41) this.f39269b;
        org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        e41 e41Var = d41Var.v;
        if (u61Var.f16877a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = d41Var.f36641b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(u61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    e41.I(e41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = d41Var.f36642c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(u61Var.d);
                if (tL_messageReportOption != null) {
                    e41.I(e41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = d41Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    e41.I(e41Var, null, bArr, null);
                    return;
                }
                return;
            }
            e41.I(e41Var, u61Var.f31071l, null, null);
        }
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.f39269b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ay0) this.f39269b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f34035z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(R.drawable.msg_mini_lock3, 0);
                    grVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(grVar, 0, 1, 33);
                    privacyControlActivity.f34035z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f34035z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void i0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.d1) this.f39269b).run();
    }
}
