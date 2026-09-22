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
public final class ol0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, org.telegram.ui.Cells.y5, org.telegram.ui.Components.k71, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.b5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.ol0, ig.e, gg.b2 {
    public final int f36360a;
    public final Object f36361b;

    public ol0(Object obj, int i10) {
        this.f36360a = i10;
        this.f36361b = obj;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public boolean L(int i10) {
        return true;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f36360a) {
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f36361b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31478o0 = defaultWindowInsets;
                premiumPreviewFragment.f31460a.setPadding(0, defaultWindowInsets.f10593b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31478o0.d);
                org.telegram.ui.Components.yl0 yl0Var = premiumPreviewFragment.f31460a;
                i0.b bVar = premiumPreviewFragment.f31478o0;
                AndroidUtilities.setViewLayoutMargins(yl0Var, bVar.f10592a, 0, bVar.f10594c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31478o0;
                jx0Var.setPadding(bVar2.f10592a, 0, bVar2.f10594c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31478o0.f10592a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31478o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10594c, bVar3.d);
                }
                return r0.l1.f42174b;
            default:
                gh0 gh0Var = (gh0) ((ai1) this.f36361b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10592a;
                gh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10594c;
                gh0Var.N = i14;
                gh0Var.L = defaultWindowInsets2.d;
                View view2 = gh0Var.f33919y.f35211b;
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
                gh0Var.f33919y.setPadding(0, 0, 0, gh0Var.L);
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
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gh0Var.f32123c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    gh0Var.f32123c.setLayoutParams(marginLayoutParams2);
                }
                gh0Var.E.setPadding(i13, 0, i14, gh0Var.L);
                if (z10) {
                    l1Var = l1Var.f42175a.m(0, 0, 0, gh0Var.L);
                }
                gh0Var.i0();
                gh0Var.h0();
                SparseArray sparseArray = gh0Var.f32121a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    yh1 yh1Var = (yh1) sparseArray.valueAt(i15);
                    if (yh1Var != null && (fragmentView = yh1Var.f39963a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f42174b;
        }
    }

    @Override
    public void a() {
        switch (this.f36360a) {
            case 7:
                ((mw0) this.f36361b).e();
                return;
            default:
                ((me1) this.f36361b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.vz vzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        vzVar.f(new org.telegram.ui.Components.wz((MediaController.SavedFilterState) this.f36361b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        gy0 gy0Var = (gy0) this.f36361b;
        if (z10) {
            gy0Var.d.U((Long) c5Var.getTag(), c5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36360a) {
            case 18:
                return ((w71) this.f36361b).Q(i10, view);
            case 19:
                final bb1 bb1Var = (bb1) this.f36361b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = bb1Var.f32342h0;
                ga1 ga1Var = bb1Var.X;
                int i11 = ga1Var.I;
                if (i10 >= i11 && i10 <= ga1Var.J) {
                    final MessageObject messageObject = ((ya1) bb1Var.f32358v0.get(i10 - i11)).f39896b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(bb1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bb1 bb1Var2 = bb1Var;
                                    bb1Var2.getClass();
                                    bb1Var2.presentFragment(new mj0(messageObject));
                                    return;
                                default:
                                    bb1 bb1Var3 = bb1Var;
                                    bb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", bb1Var3.f32333b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    bb1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bb1 bb1Var2 = bb1Var;
                                    bb1Var2.getClass();
                                    bb1Var2.presentFragment(new mj0(messageObject));
                                    return;
                                default:
                                    bb1 bb1Var3 = bb1Var;
                                    bb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", bb1Var3.f32333b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    bb1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(bb1Var.S.W0(view, false));
                    H.Z();
                } else {
                    int i12 = ga1Var.U;
                    if (i10 >= i12 && i10 <= ga1Var.V) {
                        ((ua1) bb1Var.Q.get(i10 - i12)).c(bb1Var.f32331a, bb1Var, b2VarArr, true);
                    } else {
                        int i13 = ga1Var.R;
                        if (i10 >= i13 && i10 <= ga1Var.S) {
                            ((ua1) bb1Var.O.get(i10 - i13)).c(bb1Var.f32331a, bb1Var, b2VarArr, true);
                        } else {
                            int i14 = ga1Var.X;
                            if (i10 < i14 || i10 > ga1Var.Y) {
                                return false;
                            }
                            ((ua1) bb1Var.P.get(i10 - i14)).c(bb1Var.f32331a, bb1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((ue1) this.f36361b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public void f(int i10) {
        wh1 wh1Var = (wh1) this.f36361b;
        if (wh1Var.h == null && !wh1Var.f39175f.e()) {
            wh1Var.v.f31916f.e(false, true);
        }
        wh1Var.l();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f36360a) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36361b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31191c.getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount) {
                        View childAt = passcodeActivity.f31191c.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.fa) {
                            ((org.telegram.ui.Cells.fa) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
                        } else {
                            i14++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
            case 4:
                PhotoViewer photoViewer = ((qt0) this.f36361b).f36987b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31420y, photoViewer.f31393v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ((aw0) this.f36361b).finishFragment();
                return;
            case 6:
                ((uv0) this.f36361b).f38241a.R.r();
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f36361b;
                int i15 = PopupNotificationActivity.f31448b0;
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
                ((org.telegram.messenger.mk) this.f36361b).run(1);
                return;
            case 15:
                ProxyListActivity proxyListActivity = ((d21) this.f36361b).f32935b;
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
                e21 e21Var = proxyListActivity.f31723a;
                if (e21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        e21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31723a.F();
                    return;
                }
                return;
            case 21:
                ThemeActivity themeActivity = ((wb1) this.f36361b).f38814a;
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
                    hc1 hc1Var = themeActivity.f31854a;
                    i12 = themeActivity.textSizeRow;
                    hc1Var.n(i12, new Object());
                    hc1 hc1Var2 = themeActivity.f31854a;
                    i13 = themeActivity.bubbleRadiusRow;
                    hc1Var2.n(i13, new Object());
                }
                if (themeActivity.f31858c != null) {
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
                    SparseArray sparseArray = N0.f18989a0;
                    int i18 = org.telegram.ui.ActionBar.j6.f19287n;
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(i18);
                    if (h6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f18742c = "d";
                        b6Var.f18740a = "Blue_99_wp.jpg";
                        b6Var.f18741b = "Blue_99_wp.jpg";
                        h6Var.f18962y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i18);
                        org.telegram.ui.ActionBar.j6.t1(N0, true, false, true, false, false);
                        themeActivity.f31858c.z1(N0);
                        themeActivity.f31858c.y0(0);
                        return;
                    } else if (N0.Y != i18) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i19 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31862f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i19, A0, Boolean.valueOf(z10), null, Integer.valueOf(i18));
                        themeActivity.f31854a.m(themeActivity.f31874q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.j6.o1(true);
                        return;
                    }
                }
                return;
            case 22:
                xd1 xd1Var = ((ad1) this.f36361b).f32060a;
                org.telegram.ui.ActionBar.j6.j0(xd1Var.f39508e0, xd1Var.f39543s, true);
                org.telegram.ui.ActionBar.j6.o();
                org.telegram.ui.ActionBar.j6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.f39508e0, Boolean.valueOf(xd1Var.f39512f0), null, -1);
                xd1Var.finishFragment();
                return;
            default:
                ((gh1) this.f36361b).f33920a.E0(true);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f36360a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f36361b, (org.telegram.ui.Components.y51) obj, (View) obj2);
                return;
            default:
                b41 b41Var = (b41) this.f36361b;
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                c41 c41Var = b41Var.v;
                if (y51Var.f15719a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.f32270b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(y51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            c41.G(c41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.f32271c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(y51Var.d);
                        if (tL_messageReportOption != null) {
                            c41.G(c41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b41Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            c41.G(c41Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    c41.G(c41Var, y51Var.f30518l, null, null);
                    return;
                }
                return;
        }
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rh((SharedConfig.ProxyInfo) this.f36361b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((zx0) this.f36361b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31529z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f31529z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31529z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void O(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((gg.e1) this.f36361b).run();
    }
}
