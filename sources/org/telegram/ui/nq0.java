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
public final class nq0 implements org.telegram.ui.Cells.x5, org.telegram.ui.Components.w71, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.l1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, Utilities.Callback5, org.telegram.ui.ActionBar.l2, org.telegram.ui.Components.cm0, jg.e, hg.z1 {
    public final int f38782a;
    public final Object f38783b;

    public nq0(Object obj, int i10) {
        this.f38782a = i10;
        this.f38783b = obj;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f38782a) {
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38783b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f32463o0 = defaultWindowInsets;
                premiumPreviewFragment.f32445a.setPadding(0, defaultWindowInsets.f10889b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f32463o0.d);
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f32445a;
                i0.b bVar = premiumPreviewFragment.f32463o0;
                AndroidUtilities.setViewLayoutMargins(mm0Var, bVar.f10888a, 0, bVar.f10890c, 0);
                px0 px0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f32463o0;
                px0Var.setPadding(bVar2.f10888a, 0, bVar2.f10890c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f32463o0.f10888a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f32463o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10890c, bVar3.d);
                }
                return r0.l1.f43740b;
            default:
                kh0 kh0Var = (kh0) ((ji1) this.f38783b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10888a;
                kh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10890c;
                kh0Var.N = i14;
                kh0Var.L = defaultWindowInsets2.d;
                View view2 = kh0Var.f37658y.f39452b;
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
                kh0Var.f37658y.setPadding(0, 0, 0, kh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + kh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    kh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = kh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) kh0Var.f37392c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    kh0Var.f37392c.setLayoutParams(marginLayoutParams2);
                }
                kh0Var.E.setPadding(i13, 0, i14, kh0Var.L);
                if (z10) {
                    l1Var = l1Var.f43741a.m(0, 0, 0, kh0Var.L);
                }
                kh0Var.i0();
                kh0Var.h0();
                SparseArray sparseArray = kh0Var.f37390a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    hi1 hi1Var = (hi1) sparseArray.valueAt(i15);
                    if (hi1Var != null && (fragmentView = hi1Var.f36828a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f43740b;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f38782a) {
            case 16:
                return ((e81) this.f38783b).R(i10, view);
            case 17:
                final hb1 hb1Var = (hb1) this.f38783b;
                org.telegram.ui.ActionBar.a2[] a2VarArr = hb1Var.f36697h0;
                ma1 ma1Var = hb1Var.X;
                int i11 = ma1Var.I;
                if (i10 >= i11 && i10 <= ma1Var.J) {
                    final MessageObject messageObject = ((eb1) hb1Var.f36713v0.get(i10 - i11)).f35508b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(hb1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    hb1 hb1Var2 = hb1Var;
                                    hb1Var2.getClass();
                                    hb1Var2.presentFragment(new qj0(messageObject));
                                    return;
                                default:
                                    hb1 hb1Var3 = hb1Var;
                                    hb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hb1Var3.f36688b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    hb1Var3.presentFragment(new fo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    hb1 hb1Var2 = hb1Var;
                                    hb1Var2.getClass();
                                    hb1Var2.presentFragment(new qj0(messageObject));
                                    return;
                                default:
                                    hb1 hb1Var3 = hb1Var;
                                    hb1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hb1Var3.f36688b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    hb1Var3.presentFragment(new fo(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(hb1Var.S.V0(view, false));
                    H.Z();
                } else {
                    int i12 = ma1Var.U;
                    if (i10 >= i12 && i10 <= ma1Var.V) {
                        ((ab1) hb1Var.Q.get(i10 - i12)).c(hb1Var.f36686a, hb1Var, a2VarArr, true);
                    } else {
                        int i13 = ma1Var.R;
                        if (i10 >= i13 && i10 <= ma1Var.S) {
                            ((ab1) hb1Var.O.get(i10 - i13)).c(hb1Var.f36686a, hb1Var, a2VarArr, true);
                        } else {
                            int i14 = ma1Var.X;
                            if (i10 < i14 || i10 > ma1Var.Y) {
                                return false;
                            }
                            ((ab1) hb1Var.P.get(i10 - i14)).c(hb1Var.f36686a, hb1Var, a2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((af1) this.f38783b).J.a(i10, view);
                return true;
        }
    }

    @Override
    public void b() {
        switch (this.f38782a) {
            case 5:
                ((sw0) this.f38783b).e();
                return;
            default:
                ((se1) this.f38783b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.h00 h00Var) {
        Drawable[] drawableArr = PhotoViewer.U8;
        h00Var.f(new org.telegram.ui.Components.i00((MediaController.SavedFilterState) this.f38783b));
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        ly0 ly0Var = (ly0) this.f38783b;
        if (z10) {
            ly0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f38782a) {
            case 2:
                PhotoViewer photoViewer = ((xt0) this.f38783b).f41958b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f32405y, photoViewer.f32378v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ((gw0) this.f38783b).finishFragment();
                return;
            case 4:
                ((aw0) this.f38783b).f34361a.R.s();
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f38783b;
                int i14 = PopupNotificationActivity.f32433b0;
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
                ((org.telegram.messenger.mk) this.f38783b).run(1);
                return;
            case 13:
                ProxyListActivity proxyListActivity = ((l21) this.f38783b).f37822b;
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
                m21 m21Var = proxyListActivity.f32709a;
                if (m21Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        m21Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f32709a.F();
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity = ((bc1) this.f38783b).f34513a;
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
                    mc1 mc1Var = themeActivity.f32840a;
                    i12 = themeActivity.textSizeRow;
                    mc1Var.n(i12, new Object());
                    mc1 mc1Var2 = themeActivity.f32840a;
                    i13 = themeActivity.bubbleRadiusRow;
                    mc1Var2.n(i13, new Object());
                }
                if (themeActivity.f32844c != null) {
                    org.telegram.ui.ActionBar.f6 O0 = org.telegram.ui.ActionBar.g6.O0("Blue");
                    org.telegram.ui.ActionBar.f6 B0 = org.telegram.ui.ActionBar.g6.B0();
                    SparseArray sparseArray = O0.f19792a0;
                    int i17 = org.telegram.ui.ActionBar.g6.f20077n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i17);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.f20849c = "d";
                        z5Var.f20847a = "Blue_99_wp.jpg";
                        z5Var.f20848b = "Blue_99_wp.jpg";
                        e6Var.f19765y = z5Var;
                        O0.v(z5Var);
                    }
                    if (O0 != B0) {
                        O0.u(i17);
                        org.telegram.ui.ActionBar.g6.u1(O0, true, false, true, false, false);
                        themeActivity.f32844c.z1(O0);
                        themeActivity.f32844c.x0(0);
                        return;
                    } else if (O0.Y != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f32848f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, B0, Boolean.valueOf(z10), null, Integer.valueOf(i17));
                        themeActivity.f32840a.m(themeActivity.f32860q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.g6.p1(true);
                        return;
                    }
                }
                return;
            case 20:
                ce1 ce1Var = ((fd1) this.f38783b).f35803a;
                org.telegram.ui.ActionBar.g6.k0(ce1Var.f34867e0, ce1Var.f34902s, true);
                org.telegram.ui.ActionBar.g6.o();
                org.telegram.ui.ActionBar.g6.o1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ce1Var.f34867e0, Boolean.valueOf(ce1Var.f34871f0), null, -1);
                ce1Var.finishFragment();
                return;
            default:
                ((mh1) this.f38783b).f38266a.E0(true);
                return;
        }
    }

    @Override
    public a0.h j0() {
        return null;
    }

    @Override
    public void k(int i10) {
        ei1 ei1Var = (ei1) this.f38783b;
        if (ei1Var.h == null && !ei1Var.f35614f.e()) {
            ei1Var.v.f32902f.e(false, true);
        }
        ei1Var.l();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h41 h41Var = (h41) this.f38783b;
        org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        i41 i41Var = h41Var.v;
        if (l61Var.f43203a == 30) {
            TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = h41Var.f36600b;
            if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(l61Var.d);
                if (tL_sponsoredMessageReportOption != null) {
                    i41.I(i41Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = h41Var.f36601c;
            if (tL_reportResultChooseOption != null) {
                TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(l61Var.d);
                if (tL_messageReportOption != null) {
                    i41.I(i41Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                    return;
                }
                return;
            }
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = h41Var.d;
            if (tL_reportResultAddComment != null) {
                byte[] bArr = tL_reportResultAddComment.option;
                if (bArr != null) {
                    i41.I(i41Var, null, bArr, null);
                    return;
                }
                return;
            }
            i41.I(i41Var, l61Var.f26954l, null, null);
        }
    }

    @Override
    public boolean t0(int i10) {
        return true;
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.f38783b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((ey0) this.f38783b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f32514z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.msg_mini_lock3, 0);
                    brVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(brVar, 0, 1, 33);
                    privacyControlActivity.f32514z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f32514z0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void I0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((hg.d1) this.f38783b).run();
    }
}
