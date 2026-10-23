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
public final class pp0 implements org.telegram.ui.Cells.w5, org.telegram.ui.Components.q71, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.z4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.zl0, jg.e, hg.z1 {
    public final int f40281a;
    public final Object f40282b;

    public pp0(Object obj, int i10) {
        this.f40281a = i10;
        this.f40282b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f40281a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40282b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                premiumPreviewFragment.f33520o0 = defaultWindowInsets;
                premiumPreviewFragment.f33502a.setPadding(0, defaultWindowInsets.f12284b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f33520o0.d);
                org.telegram.ui.Components.jm0 jm0Var = premiumPreviewFragment.f33502a;
                i0.b bVar = premiumPreviewFragment.f33520o0;
                AndroidUtilities.setViewLayoutMargins(jm0Var, bVar.f12283a, 0, bVar.f12285c, 0);
                nw0 nw0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f33520o0;
                nw0Var.setPadding(bVar2.f12283a, 0, bVar2.f12285c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f33520o0.f12283a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f33520o0;
                    frameLayout.setPadding(i12, dp, bVar3.f12285c, bVar3.d);
                }
                return r0.k1.f44838b;
            default:
                ng0 ng0Var = (ng0) ((og1) this.f40282b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                int i13 = defaultWindowInsets2.f12283a;
                ng0Var.M = i13;
                int i14 = defaultWindowInsets2.f12285c;
                ng0Var.N = i14;
                ng0Var.L = defaultWindowInsets2.d;
                View view2 = ng0Var.f39596y.f43215b;
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
                ng0Var.f39596y.setPadding(0, 0, 0, ng0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + ng0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ng0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    ng0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = ng0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ng0Var.f39892c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    ng0Var.f39892c.setLayoutParams(marginLayoutParams2);
                }
                ng0Var.E.setPadding(i13, 0, i14, ng0Var.L);
                if (z10) {
                    k1Var = k1Var.f44839a.m(0, 0, 0, ng0Var.L);
                }
                ng0Var.i0();
                ng0Var.h0();
                SparseArray sparseArray = ng0Var.f39890a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    mg1 mg1Var = (mg1) sparseArray.valueAt(i15);
                    if (mg1Var != null && (fragmentView = mg1Var.f39247a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, k1Var);
                    }
                }
                return r0.k1.f44838b;
        }
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f40281a) {
            case 16:
                return ((k61) this.f40282b).R(i10, view);
            case 17:
                final p91 p91Var = (p91) this.f40282b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = p91Var.f40142h0;
                u81 u81Var = p91Var.X;
                int i11 = u81Var.I;
                if (i10 >= i11 && i10 <= u81Var.J) {
                    final MessageObject messageObject = ((m91) p91Var.f40158v0.get(i10 - i11)).f39167b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(p91Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    p91 p91Var2 = p91Var;
                                    p91Var2.getClass();
                                    p91Var2.presentFragment(new ui0(messageObject));
                                    return;
                                default:
                                    p91 p91Var3 = p91Var;
                                    p91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p91Var3.f40133b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    p91Var3.presentFragment(new qn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    p91 p91Var2 = p91Var;
                                    p91Var2.getClass();
                                    p91Var2.presentFragment(new ui0(messageObject));
                                    return;
                                default:
                                    p91 p91Var3 = p91Var;
                                    p91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", p91Var3.f40133b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    p91Var3.presentFragment(new qn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(p91Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = u81Var.U;
                    if (i10 >= i12 && i10 <= u81Var.V) {
                        ((i91) p91Var.Q.get(i10 - i12)).c(p91Var.f40131a, p91Var, b2VarArr, true);
                    } else {
                        int i13 = u81Var.R;
                        if (i10 >= i13 && i10 <= u81Var.S) {
                            ((i91) p91Var.O.get(i10 - i13)).c(p91Var.f40131a, p91Var, b2VarArr, true);
                        } else {
                            int i14 = u81Var.X;
                            if (i10 < i14 || i10 > u81Var.Y) {
                                return false;
                            }
                            ((i91) p91Var.P.get(i10 - i14)).c(p91Var.f40131a, p91Var, b2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((gd1) this.f40282b).J.a(i10, view);
                return true;
        }
    }

    @Override
    public void b() {
        switch (this.f40281a) {
            case 5:
                ((qv0) this.f40282b).e();
                return;
            default:
                ((yc1) this.f40282b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.e00 e00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        e00Var.f(new org.telegram.ui.Components.f00((MediaController.SavedFilterState) this.f40282b));
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jx0 jx0Var = (jx0) this.f40282b;
        if (z10) {
            jx0Var.d.U((Long) a5Var.getTag(), a5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(int i10) {
        kg1 kg1Var = (kg1) this.f40282b;
        if (kg1Var.h == null && !kg1Var.f38608f.e()) {
            kg1Var.v.f33963f.e(false, true);
        }
        kg1Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f40281a) {
            case 2:
                PhotoViewer photoViewer = ((ws0) this.f40282b).f42955b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f33462y, photoViewer.f33435v2, true);
                    photoViewer.H0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((fv0) this.f40282b).finishFragment();
                return;
            case 4:
                ((zu0) this.f40282b).f43812a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f40282b;
                int i14 = PopupNotificationActivity.f33490b0;
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
            case 10:
                ((org.telegram.messenger.hk) this.f40282b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((i11) this.f40282b).f37838b;
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
                j11 j11Var = proxyListActivity.f33770a;
                if (j11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        j11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f33770a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((ja1) this.f40282b).f38225a;
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
                    ua1 ua1Var = themeActivity.f33901a;
                    i12 = themeActivity.textSizeRow;
                    ua1Var.n(i12, new Object());
                    ua1 ua1Var2 = themeActivity.f33901a;
                    i13 = themeActivity.bubbleRadiusRow;
                    ua1Var2.n(i13, new Object());
                }
                if (themeActivity.f33905c != null) {
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    org.telegram.ui.ActionBar.g6 B0 = org.telegram.ui.ActionBar.h6.B0();
                    SparseArray sparseArray = O0.f20886a0;
                    int i17 = org.telegram.ui.ActionBar.h6.f21170n;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(i17);
                    if (f6Var != null) {
                        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6();
                        a6Var.f20623c = "d";
                        a6Var.f20621a = "Blue_99_wp.jpg";
                        a6Var.f20622b = "Blue_99_wp.jpg";
                        f6Var.f20856y = a6Var;
                        O0.v(a6Var);
                    }
                    if (O0 != B0) {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.h6.u1(O0, true, false, true, false, false);
                        themeActivity.f33905c.z1(O0);
                        themeActivity.f33905c.x0(0);
                        return;
                    } else if (O0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f33909f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, B0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f33901a.m(themeActivity.f33921q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.h6.p1(true);
                        return;
                    }
                }
                return;
            case 20:
                kc1 kc1Var = ((nb1) this.f40282b).f39500a;
                org.telegram.ui.ActionBar.h6.k0(kc1Var.f38535e0, kc1Var.f38570s, true);
                org.telegram.ui.ActionBar.h6.o();
                org.telegram.ui.ActionBar.h6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, kc1Var.f38535e0, Boolean.valueOf(kc1Var.f38539f0), null, -1);
                kc1Var.finishFragment();
                return;
            default:
                ((sf1) this.f40282b).f41462a.E0(true);
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n21 n21Var = (n21) this.f40282b;
        org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        o21 o21Var = n21Var.v;
        if (h61Var.f44300a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = n21Var.f39399b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(h61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    o21.I(o21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = n21Var.f39400c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(h61Var.d);
                if (tL_messageReportOption != null) {
                    o21.I(o21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = n21Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    o21.I(o21Var, null, bArr, null);
                    return;
                }
                return;
            }
            o21.I(o21Var, h61Var.f26786l, null, null);
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.oh((SharedConfig.ProxyInfo) this.f40282b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((cx0) this.f40282b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f33571z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock3, 0);
                    yqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(yqVar, 0, 1, 33);
                    privacyControlActivity.f33571z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f33571z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void S(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((hg.d1) this.f40282b).run();
    }
}
