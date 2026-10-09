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
public final class hq0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.y71, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.gm0, ig.e, gg.a2 {
    public final int f38388a;
    public final Object f38389b;

    public hq0(Object obj, int i10) {
        this.f38388a = i10;
        this.f38389b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f38388a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38389b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f34144o0 = defaultWindowInsets;
                premiumPreviewFragment.f34125a.setPadding(0, defaultWindowInsets.f11577b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f34144o0.d);
                org.telegram.ui.Components.qm0 qm0Var = premiumPreviewFragment.f34125a;
                i0.b bVar = premiumPreviewFragment.f34144o0;
                AndroidUtilities.setViewLayoutMargins(qm0Var, bVar.f11576a, 0, bVar.f11578c, 0);
                jx0 jx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f34144o0;
                jx0Var.setPadding(bVar2.f11576a, 0, bVar2.f11578c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f34144o0.f11576a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f34144o0;
                    frameLayout.setPadding(i12, dp, bVar3.f11578c, bVar3.d);
                }
                return r0.k1.f46774b;
            default:
                fh0 fh0Var = (fh0) ((ci1) this.f38389b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f11576a;
                fh0Var.M = i13;
                int i14 = defaultWindowInsets2.f11578c;
                fh0Var.N = i14;
                fh0Var.L = defaultWindowInsets2.d;
                View view2 = fh0Var.f37608y.f39296b;
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
                fh0Var.f37608y.setPadding(0, 0, 0, fh0Var.L);
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
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.f36685c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    fh0Var.f36685c.setLayoutParams(marginLayoutParams2);
                }
                fh0Var.E.setPadding(i13, 0, i14, fh0Var.L);
                if (z10) {
                    k1Var = k1Var.f46775a.m(0, 0, 0, fh0Var.L);
                }
                fh0Var.i0();
                fh0Var.h0();
                SparseArray sparseArray = fh0Var.f36683a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ai1 ai1Var = (ai1) sparseArray.valueAt(i15);
                    if (ai1Var != null && (fragmentView = ai1Var.f35936a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f46774b;
        }
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public void a() {
        switch (this.f38388a) {
            case 5:
                ((mw0) this.f38389b).e();
                return;
            default:
                ((me1) this.f38389b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.l00 l00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        l00Var.f(new org.telegram.ui.Components.m00((MediaController.SavedFilterState) this.f38389b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        fy0 fy0Var = (fy0) this.f38389b;
        if (z10) {
            fy0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f38388a) {
            case 16:
                return ((x71) this.f38389b).R(i10, view);
            case 17:
                final bb1 bb1Var = (bb1) this.f38389b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = bb1Var.f36214h0;
                ga1 ga1Var = bb1Var.X;
                int i11 = ga1Var.I;
                if (i10 >= i11 && i10 <= ga1Var.J) {
                    final MessageObject messageObject = ((ya1) bb1Var.f36230v0.get(i10 - i11)).f44304b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(bb1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bb1 bb1Var2 = bb1Var;
                                    bb1Var2.getClass();
                                    bb1Var2.presentFragment(new lj0(messageObject));
                                    return;
                                default:
                                    bb1 bb1Var3 = bb1Var;
                                    bb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", bb1Var3.f36204b);
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
                                    bb1Var2.presentFragment(new lj0(messageObject));
                                    return;
                                default:
                                    bb1 bb1Var3 = bb1Var;
                                    bb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", bb1Var3.f36204b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    bb1Var3.presentFragment(new zn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(bb1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = ga1Var.U;
                    if (i10 >= i12 && i10 <= ga1Var.V) {
                        ((ua1) bb1Var.Q.get(i10 - i12)).c(bb1Var.f36202a, bb1Var, b2VarArr, true);
                    } else {
                        int i13 = ga1Var.R;
                        if (i10 >= i13 && i10 <= ga1Var.S) {
                            ((ua1) bb1Var.O.get(i10 - i13)).c(bb1Var.f36202a, bb1Var, b2VarArr, true);
                        } else {
                            int i14 = ga1Var.X;
                            if (i10 < i14 || i10 > ga1Var.Y) {
                                return false;
                            }
                            ((ua1) bb1Var.P.get(i10 - i14)).c(bb1Var.f36202a, bb1Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((ue1) this.f38389b).J.d(i10, view);
                return true;
        }
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f38388a) {
            case 2:
                PhotoViewer photoViewer = ((qt0) this.f38389b).f41185b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f34082y, photoViewer.f34055v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                ((aw0) this.f38389b).finishFragment();
                return;
            case 4:
                ((uv0) this.f38389b).f42568a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f38389b;
                int i14 = PopupNotificationActivity.f34112b0;
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
                ((org.telegram.messenger.jk) this.f38389b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((d21) this.f38389b).f36807b;
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
                e21 e21Var = proxyListActivity.f34392a;
                if (e21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        e21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34392a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((wb1) this.f38389b).f43182a;
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
                    hc1 hc1Var = themeActivity.f34529a;
                    i12 = themeActivity.textSizeRow;
                    hc1Var.n(i12, new Object());
                    hc1 hc1Var2 = themeActivity.f34529a;
                    i13 = themeActivity.bubbleRadiusRow;
                    hc1Var2.n(i13, new Object());
                }
                if (themeActivity.f34533c != null) {
                    org.telegram.ui.ActionBar.h6 O0 = org.telegram.ui.ActionBar.i6.O0("Blue");
                    org.telegram.ui.ActionBar.h6 B0 = org.telegram.ui.ActionBar.i6.B0();
                    SparseArray sparseArray = O0.f20704a0;
                    int i17 = org.telegram.ui.ActionBar.i6.f20975n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(i17);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f20465c = "d";
                        b6Var.f20463a = "Blue_99_wp.jpg";
                        b6Var.f20464b = "Blue_99_wp.jpg";
                        g6Var.f20674y = b6Var;
                        O0.v(b6Var);
                    }
                    if (O0 != B0) {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.i6.u1(O0, true, false, true, false, false);
                        themeActivity.f34533c.z1(O0);
                        themeActivity.f34533c.x0(0);
                        return;
                    } else if (O0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34538f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, B0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f34529a.m(themeActivity.f34550q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.i6.p1(true);
                        return;
                    }
                }
                return;
            case 20:
                xd1 xd1Var = ((ad1) this.f38389b).f35908a;
                org.telegram.ui.ActionBar.i6.k0(xd1Var.f43950e0, xd1Var.f43985s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, xd1Var.f43950e0, Boolean.valueOf(xd1Var.f43954f0), null, -1);
                xd1Var.finishFragment();
                return;
            default:
                ((gh1) this.f38389b).f38019a.E0(true);
                return;
        }
    }

    @Override
    public void h(int i10) {
        yh1 yh1Var = (yh1) this.f38389b;
        if (yh1Var.h == null && !yh1Var.f44348f.e()) {
            yh1Var.v.f34596f.e(false, true);
        }
        yh1Var.l();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b41 b41Var = (b41) this.f38389b;
        org.telegram.ui.Components.p61 p61Var = (org.telegram.ui.Components.p61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        c41 c41Var = b41Var.v;
        if (p61Var.f17125a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.f36130b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(p61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    c41.I(c41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.f36131c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(p61Var.d);
                if (tL_messageReportOption != null) {
                    c41.I(c41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = b41Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    c41.I(c41Var, null, bArr, null);
                    return;
                }
                return;
            }
            c41.I(c41Var, p61Var.f29734l, null, null);
        }
    }

    @Override
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f38389b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((yx0) this.f38389b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f34196z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.msg_mini_lock3, 0);
                    erVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(erVar, 0, 1, 33);
                    privacyControlActivity.f34196z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f34196z0);
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
        ((gg.d1) this.f38389b).run();
    }
}
