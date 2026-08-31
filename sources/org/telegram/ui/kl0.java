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
public final class kl0 implements Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.o1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.ll0, wf.e, uf.j1 {
    public final int f38437a;
    public final Object f38438b;

    public kl0(Object obj, int i10) {
        this.f38437a = i10;
        this.f38438b = obj;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f38437a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38438b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f34496l0 = defaultWindowInsets;
                premiumPreviewFragment.f34480a.setPadding(0, defaultWindowInsets.f7758b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f34496l0.d);
                org.telegram.ui.Components.tl0 tl0Var = premiumPreviewFragment.f34480a;
                i0.b bVar = premiumPreviewFragment.f34496l0;
                AndroidUtilities.setViewLayoutMargins(tl0Var, bVar.f7757a, 0, bVar.f7759c, 0);
                qw0 qw0Var = premiumPreviewFragment.R;
                i0.b bVar2 = premiumPreviewFragment.f34496l0;
                qw0Var.setPadding(bVar2.f7757a, 0, bVar2.f7759c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.G;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f34496l0.f7757a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f34496l0;
                    frameLayout.setPadding(i12, dp, bVar3.f7759c, bVar3.d);
                }
                return r0.m1.f46451b;
            default:
                wg0 wg0Var = (wg0) ((jh1) this.f38438b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i13 = defaultWindowInsets2.f7757a;
                wg0Var.J = i13;
                int i14 = defaultWindowInsets2.f7759c;
                wg0Var.K = i14;
                wg0Var.I = defaultWindowInsets2.d;
                View view2 = wg0Var.f42808y.f41286b;
                if (view2 != null && view2.getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i10 = AndroidUtilities.dp(44.0f);
                } else {
                    i10 = 0;
                }
                wg0Var.f42808y.setPadding(0, 0, 0, wg0Var.I);
                int dp2 = AndroidUtilities.dp(72.0f) + wg0Var.I + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wg0Var.E.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    wg0Var.E.setLayoutParams(marginLayoutParams);
                }
                if (z4) {
                    i11 = wg0Var.I + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) wg0Var.f38158c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    wg0Var.f38158c.setLayoutParams(marginLayoutParams2);
                }
                wg0Var.B.setPadding(i13, 0, i14, wg0Var.I);
                if (z4) {
                    m1Var = m1Var.f46452a.m(0, 0, 0, wg0Var.I);
                }
                wg0Var.i0();
                wg0Var.h0();
                SparseArray sparseArray = wg0Var.f38156a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    hh1 hh1Var = (hh1) sparseArray.valueAt(i15);
                    if (hh1Var != null && (fragmentView = hh1Var.f37508a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                return r0.m1.f46451b;
        }
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public void a() {
        switch (this.f38437a) {
            case 6:
                ((tv0) this.f38438b).e();
                return;
            default:
                ((ud1) this.f38438b).e();
                return;
        }
    }

    @Override
    public void b(org.telegram.ui.Components.xz xzVar) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        xzVar.f(new org.telegram.ui.Components.yz((MediaController.SavedFilterState) this.f38438b));
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        nx0 nx0Var = (nx0) this.f38438b;
        if (z4) {
            nx0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f38437a) {
            case 17:
                return ((f71) this.f38438b).Q(i10, view);
            case 18:
                final ha1 ha1Var = (ha1) this.f38438b;
                org.telegram.ui.ActionBar.d2[] d2VarArr = ha1Var.f37424e0;
                m91 m91Var = ha1Var.U;
                int i11 = m91Var.F;
                if (i10 >= i11 && i10 <= m91Var.G) {
                    final MessageObject messageObject = ((ea1) ha1Var.f37441s0.get(i10 - i11)).f36456b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(ha1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ha1 ha1Var2 = ha1Var;
                                    ha1Var2.getClass();
                                    ha1Var2.presentFragment(new bj0(messageObject));
                                    return;
                                default:
                                    ha1 ha1Var3 = ha1Var;
                                    ha1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ha1Var3.f37418b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ha1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ha1 ha1Var2 = ha1Var;
                                    ha1Var2.getClass();
                                    ha1Var2.presentFragment(new bj0(messageObject));
                                    return;
                                default:
                                    ha1 ha1Var3 = ha1Var;
                                    ha1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ha1Var3.f37418b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ha1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ha1Var.P.V0(view, false));
                    H.Z();
                } else {
                    int i12 = m91Var.R;
                    if (i10 >= i12 && i10 <= m91Var.S) {
                        ((aa1) ha1Var.N.get(i10 - i12)).c(ha1Var.f37416a, ha1Var, d2VarArr, true);
                    } else {
                        int i13 = m91Var.O;
                        if (i10 >= i13 && i10 <= m91Var.P) {
                            ((aa1) ha1Var.L.get(i10 - i13)).c(ha1Var.f37416a, ha1Var, d2VarArr, true);
                        } else {
                            int i14 = m91Var.U;
                            if (i10 < i14 || i10 > m91Var.V) {
                                return false;
                            }
                            ((aa1) ha1Var.M.get(i10 - i14)).c(ha1Var.f37416a, ha1Var, d2VarArr, true);
                        }
                    }
                }
                return true;
            default:
                ((be1) this.f38438b).G.f(i10, view);
                return true;
        }
    }

    @Override
    public void g(int i10) {
        fh1 fh1Var = (fh1) this.f38438b;
        if (fh1Var.h == null && !fh1Var.f36888f.e()) {
            fh1Var.v.f34934f.e(false, true);
        }
        fh1Var.l();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13;
        switch (this.f38437a) {
            case 3:
                PhotoViewer photoViewer = ((xs0) this.f38438b).f43455b;
                try {
                    AndroidUtilities.openForView(photoViewer.Q4, photoViewer.f34439y, photoViewer.f34387s2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ((hv0) this.f38438b).finishFragment();
                return;
            case 5:
                ((bv0) this.f38438b).f35598a.O.r();
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f38438b;
                int i14 = PopupNotificationActivity.Y;
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
            case 11:
                ((org.telegram.messenger.ok) this.f38438b).run(1);
                return;
            case 14:
                ProxyListActivity proxyListActivity = ((p11) this.f38438b).f39897b;
                ArrayList arrayList = proxyListActivity.E;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.f34742e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i16 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i16);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i16);
                proxyListActivity.c0(true);
                q11 q11Var = proxyListActivity.f34739a;
                if (q11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        q11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                        proxyListActivity.f34739a.n(ProxyListActivity.b0(proxyListActivity), 0);
                    }
                    proxyListActivity.f34739a.F();
                    return;
                }
                return;
            case 20:
                ThemeActivity themeActivity = ((bb1) this.f38438b).f35413a;
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
                    mb1 mb1Var = themeActivity.f34870a;
                    i12 = themeActivity.textSizeRow;
                    mb1Var.n(i12, new Object());
                    mb1 mb1Var2 = themeActivity.f34870a;
                    i13 = themeActivity.bubbleRadiusRow;
                    mb1Var2.n(i13, new Object());
                }
                if (themeActivity.f34874c != null) {
                    org.telegram.ui.ActionBar.j6 N0 = org.telegram.ui.ActionBar.k6.N0("Blue");
                    org.telegram.ui.ActionBar.j6 A0 = org.telegram.ui.ActionBar.k6.A0();
                    SparseArray sparseArray = N0.X;
                    int i17 = org.telegram.ui.ActionBar.k6.f21832n;
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(i17);
                    if (i6Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = new org.telegram.ui.ActionBar.d6();
                        d6Var.f21284c = "d";
                        d6Var.f21282a = "Blue_99_wp.jpg";
                        d6Var.f21283b = "Blue_99_wp.jpg";
                        i6Var.f21488y = d6Var;
                        N0.v(d6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i17);
                        org.telegram.ui.ActionBar.k6.t1(N0, true, false, true, false, false);
                        themeActivity.f34874c.y1(N0);
                        themeActivity.f34874c.x0(0);
                        return;
                    } else if (N0.V != i17) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i18 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f34879f == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i18, A0, Boolean.valueOf(z4), null, Integer.valueOf(i17));
                        themeActivity.f34870a.m(themeActivity.f34888n0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.k6.o1(true);
                        return;
                    }
                }
                return;
            case 21:
                ed1 ed1Var = ((gc1) this.f38438b).f37158a;
                org.telegram.ui.ActionBar.k6.j0(ed1Var.f36490b0, ed1Var.f36533s, true);
                org.telegram.ui.ActionBar.k6.o();
                org.telegram.ui.ActionBar.k6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ed1Var.f36490b0, Boolean.valueOf(ed1Var.f36494c0), null, -1);
                ed1Var.finishFragment();
                return;
            default:
                ((og1) this.f38438b).f39776a.E0(true);
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f38437a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f38438b, (org.telegram.ui.Components.j51) obj, (View) obj2);
                return;
            default:
                l31 l31Var = (l31) this.f38438b;
                org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                m31 m31Var = l31Var.v;
                if (j51Var.f2505a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = l31Var.f38572b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(j51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            m31.G(m31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = l31Var.f38573c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(j51Var.d);
                        if (tL_messageReportOption != null) {
                            m31.G(m31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = l31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            m31.G(m31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    m31.G(m31Var, j51Var.f28014l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.th((SharedConfig.ProxyInfo) this.f38438b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((gx0) this.f38438b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f34543w0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                    oqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    privacyControlActivity.f34543w0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f34543w0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void V(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        ((lh.l2) this.f38438b).run();
    }
}
