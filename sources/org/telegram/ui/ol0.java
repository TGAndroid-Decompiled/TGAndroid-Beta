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
public final class ol0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.i71, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.ml0, ig.e, gg.b2 {
    public final int f36205a;
    public final Object f36206b;

    public ol0(Object obj, int i10) {
        this.f36205a = i10;
        this.f36206b = obj;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f36205a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f36206b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f31417o0 = defaultWindowInsets;
                premiumPreviewFragment.f31399a.setPadding(0, defaultWindowInsets.f10592b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31417o0.d);
                org.telegram.ui.Components.wl0 wl0Var = premiumPreviewFragment.f31399a;
                i0.b bVar = premiumPreviewFragment.f31417o0;
                AndroidUtilities.setViewLayoutMargins(wl0Var, bVar.f10591a, 0, bVar.f10593c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31417o0;
                jx0Var.setPadding(bVar2.f10591a, 0, bVar2.f10593c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31417o0.f10591a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31417o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10593c, bVar3.d);
                }
                return r0.m1.f42108b;
            default:
                fh0 fh0Var = (fh0) ((yh1) this.f36206b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i13 = defaultWindowInsets2.f10591a;
                fh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10593c;
                fh0Var.N = i14;
                fh0Var.L = defaultWindowInsets2.d;
                View view2 = fh0Var.f33544y.f34533b;
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
                fh0Var.f33544y.setPadding(0, 0, 0, fh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + fh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    fh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = fh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.f39828c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    fh0Var.f39828c.setLayoutParams(marginLayoutParams2);
                }
                fh0Var.E.setPadding(i13, 0, i14, fh0Var.L);
                if (z10) {
                    m1Var = m1Var.f42109a.m(0, 0, 0, fh0Var.L);
                }
                fh0Var.i0();
                fh0Var.h0();
                SparseArray sparseArray = fh0Var.f39826a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    wh1 wh1Var = (wh1) sparseArray.valueAt(i15);
                    if (wh1Var != null && (fragmentView = wh1Var.f39171a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f42108b;
        }
    }

    @Override
    public void a(int i10) {
        uh1 uh1Var = (uh1) this.f36206b;
        if (uh1Var.h == null && !uh1Var.f38006f.e()) {
            uh1Var.v.f31855f.e(false, true);
        }
        uh1Var.l();
    }

    @Override
    public void b() {
        switch (this.f36205a) {
            case 7:
                ((mw0) this.f36206b).e();
                return;
            default:
                ((ke1) this.f36206b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f36206b));
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36205a) {
            case 18:
                return ((t71) this.f36206b).Q(i10, view);
            case 19:
                final za1 za1Var = (za1) this.f36206b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = za1Var.f40043h0;
                ea1 ea1Var = za1Var.X;
                int i11 = ea1Var.I;
                if (i10 >= i11 && i10 <= ea1Var.J) {
                    final MessageObject messageObject = ((wa1) za1Var.f40059v0.get(i10 - i11)).f38786b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(za1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    za1 za1Var2 = za1Var;
                                    za1Var2.getClass();
                                    za1Var2.presentFragment(new kj0(messageObject));
                                    return;
                                default:
                                    za1 za1Var3 = za1Var;
                                    za1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", za1Var3.f40034b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    za1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    za1 za1Var2 = za1Var;
                                    za1Var2.getClass();
                                    za1Var2.presentFragment(new kj0(messageObject));
                                    return;
                                default:
                                    za1 za1Var3 = za1Var;
                                    za1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", za1Var3.f40034b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    za1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(za1Var.S.W0(view, false));
                    H.Z();
                } else {
                    int i12 = ea1Var.U;
                    if (i10 >= i12 && i10 <= ea1Var.V) {
                        ((sa1) za1Var.Q.get(i10 - i12)).c(za1Var.f40032a, za1Var, b2VarArr, true);
                    } else {
                        int i13 = ea1Var.R;
                        if (i10 >= i13 && i10 <= ea1Var.S) {
                            ((sa1) za1Var.O.get(i10 - i13)).c(za1Var.f40032a, za1Var, b2VarArr, true);
                        } else {
                            int i14 = ea1Var.X;
                            if (i10 < i14 || i10 > ea1Var.Y) {
                                return false;
                            }
                            ((sa1) za1Var.P.get(i10 - i14)).c(za1Var.f40032a, za1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((se1) this.f36206b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        gy0 gy0Var = (gy0) this.f36206b;
        if (z10) {
            gy0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f36205a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36206b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31130c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.f31130c.getChildAt(i14);
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
                PhotoViewer photoViewer = ((qt0) this.f36206b).f36878b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31359y, photoViewer.f31332v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((aw0) this.f36206b).finishFragment();
                return;
            case 6:
                ((uv0) this.f36206b).f38111a.R.r();
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f36206b;
                int i15 = PopupNotificationActivity.f31387b0;
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
                ((org.telegram.messenger.nk) this.f36206b).run(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = ((d21) this.f36206b).f32844b;
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
                e21 e21Var = proxyListActivity.f31662a;
                if (e21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        e21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31662a.F();
                    return;
                }
                return;
            case 21:
                ThemeActivity themeActivity = ((ub1) this.f36206b).f37959a;
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
                    fc1 fc1Var = themeActivity.f31793a;
                    i12 = themeActivity.textSizeRow;
                    fc1Var.n(i12, new Object());
                    fc1 fc1Var2 = themeActivity.f31793a;
                    i13 = themeActivity.bubbleRadiusRow;
                    fc1Var2.n(i13, new Object());
                }
                if (themeActivity.f31797c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.f18942a0;
                    int i18 = org.telegram.ui.ActionBar.j6.f19240n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i18);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f18695c = "d";
                        b6Var.f18693a = "Blue_99_wp.jpg";
                        b6Var.f18694b = "Blue_99_wp.jpg";
                        g6Var.f18897y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f31797c.z1(N0);
                        themeActivity.f31797c.y0(0);
                        return;
                    } else if (N0.Y != i18) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i19 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31801f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i19, A0, Boolean.valueOf(z10), null, Integer.valueOf(i18));
                        themeActivity.f31793a.m(themeActivity.f31813q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 22:
                vd1 vd1Var = ((yc1) this.f36206b).f39787a;
                org.telegram.ui.ActionBar.j6.j0(vd1Var.f38481e0, vd1Var.f38516s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, vd1Var.f38481e0, Boolean.valueOf(vd1Var.f38485f0), null, -1);
                vd1Var.finishFragment();
                return;
            default:
                ((eh1) this.f36206b).f33281a.E0(true);
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
        switch (this.f36205a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f36206b, (org.telegram.ui.Components.x51) obj, (View) obj2);
                return;
            default:
                a41 a41Var = (a41) this.f36206b;
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                b41 b41Var = a41Var.v;
                if (x51Var.f15672a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a41Var.f31946b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(x51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            b41.H(b41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a41Var.f31947c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(x51Var.d);
                        if (tL_messageReportOption != null) {
                            b41.H(b41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = a41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            b41.H(b41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    b41.H(b41Var, x51Var.f30248l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f36206b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((yx0) this.f36206b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31468z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f31468z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31468z0);
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
        ((gg.e1) this.f36206b).run();
    }
}
