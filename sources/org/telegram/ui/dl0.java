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

public final class dl0 implements Utilities.Callback5, org.telegram.ui.Cells.u5, org.telegram.ui.Components.z51, org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.m1, r0.o, Utilities.Callback2Return, org.telegram.ui.Cells.x4, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.rk0, rf.e, pf.i1 {

    public final int f37437a;

    public final Object f37438b;

    public dl0(Object obj, int i10) {
        this.f37437a = i10;
        this.f37438b = obj;
    }

    @Override
    public boolean D0(int i10) {
        return true;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        View fragmentView;
        switch (this.f37437a) {
            case 8:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37438b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                premiumPreviewFragment.f35857k0 = defaultWindowInsets;
                premiumPreviewFragment.f35842a.setPadding(0, defaultWindowInsets.f10490b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f35857k0.d);
                org.telegram.ui.Components.zk0 zk0Var = premiumPreviewFragment.f35842a;
                i0.c cVar = premiumPreviewFragment.f35857k0;
                AndroidUtilities.setViewLayoutMargins(zk0Var, cVar.f10489a, 0, cVar.f10491c, 0);
                fw0 fw0Var = premiumPreviewFragment.Q;
                i0.c cVar2 = premiumPreviewFragment.f35857k0;
                fw0Var.setPadding(cVar2.f10489a, 0, cVar2.f10491c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.F;
                if (frameLayout != null) {
                    int i10 = premiumPreviewFragment.f35857k0.f10489a;
                    int iDp = AndroidUtilities.dp(14.0f);
                    i0.c cVar3 = premiumPreviewFragment.f35857k0;
                    frameLayout.setPadding(i10, iDp, cVar3.f10491c, cVar3.d);
                }
                break;
            default:
                qg0 qg0Var = (qg0) ((sg1) this.f37438b);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                int i11 = defaultWindowInsets2.f10489a;
                qg0Var.I = i11;
                int i12 = defaultWindowInsets2.f10491c;
                qg0Var.J = i12;
                qg0Var.H = defaultWindowInsets2.d;
                View view2 = qg0Var.f41658y.f36817b;
                boolean z10 = view2 != null && view2.getVisibility() == 0;
                int iDp2 = z10 ? AndroidUtilities.dp(44.0f) : 0;
                qg0Var.f41658y.setPadding(0, 0, 0, qg0Var.H);
                int iDp3 = AndroidUtilities.dp(72.0f) + qg0Var.H + iDp2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qg0Var.D.getLayoutParams();
                if (marginLayoutParams.height != iDp3) {
                    marginLayoutParams.height = iDp3;
                    qg0Var.D.setLayoutParams(marginLayoutParams);
                }
                int i13 = z10 ? qg0Var.H + iDp2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) qg0Var.f42640c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    marginLayoutParams2.bottomMargin = i13;
                    qg0Var.f42640c.setLayoutParams(marginLayoutParams2);
                }
                qg0Var.A.setPadding(i11, 0, i12, qg0Var.H);
                if (z10) {
                    m1Var = m1Var.f46619a.m(0, 0, 0, qg0Var.H);
                }
                qg0Var.i0();
                qg0Var.h0();
                SparseArray sparseArray = qg0Var.f42638a;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    qg1 qg1Var = (qg1) sparseArray.valueAt(i14);
                    if (qg1Var != null && (fragmentView = qg1Var.f41659a.getFragmentView()) != null) {
                        r0.j0.b(fragmentView, m1Var);
                    }
                }
                break;
        }
        return r0.m1.f46618b;
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f37437a) {
            case 17:
                return ((n61) this.f37438b).Q(i10, view);
            case 18:
                final q91 q91Var = (q91) this.f37438b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = q91Var.f41555d0;
                v81 v81Var = q91Var.T;
                int i11 = v81Var.E;
                if (i10 < i11 || i10 > v81Var.F) {
                    int i12 = v81Var.Q;
                    if (i10 < i12 || i10 > v81Var.R) {
                        int i13 = v81Var.N;
                        if (i10 < i13 || i10 > v81Var.O) {
                            int i14 = v81Var.T;
                            if (i10 < i14 || i10 > v81Var.U) {
                                return false;
                            }
                            ((j91) q91Var.L.get(i10 - i14)).c(q91Var.f41549a, q91Var, b2VarArr, true);
                        } else {
                            ((j91) q91Var.K.get(i10 - i13)).c(q91Var.f41549a, q91Var, b2VarArr, true);
                        }
                    } else {
                        ((j91) q91Var.M.get(i10 - i12)).c(q91Var.f41549a, q91Var, b2VarArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((n91) q91Var.f41572r0.get(i10 - i11)).f40699b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(q91Var, view);
                    final int i15 = 0;
                    b70VarH.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    q91 q91Var2 = q91Var;
                                    q91Var2.getClass();
                                    q91Var2.presentFragment(new vi0(messageObject));
                                    break;
                                default:
                                    q91 q91Var3 = q91Var;
                                    q91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", q91Var3.f41551b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    q91Var3.presentFragment(new rn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i16 = 1;
                    b70VarH.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    q91 q91Var2 = q91Var;
                                    q91Var2.getClass();
                                    q91Var2.presentFragment(new vi0(messageObject));
                                    break;
                                default:
                                    q91 q91Var3 = q91Var;
                                    q91Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", q91Var3.f41551b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    q91Var3.presentFragment(new rn(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    b70VarH.W(q91Var.O.V0(view, false));
                    b70VarH.Z();
                }
                return true;
            default:
                ((ld1) this.f37438b).F.a(i10, view);
                return true;
        }
    }

    @Override
    public void b() {
        switch (this.f37437a) {
            case 6:
                ((jv0) this.f37438b).e();
                break;
            default:
                ((dd1) this.f37438b).e();
                break;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.jz jzVar) {
        MediaController.SavedFilterState savedFilterState = (MediaController.SavedFilterState) this.f37438b;
        Drawable[] drawableArr = PhotoViewer.P8;
        jzVar.f(new org.telegram.ui.Components.kz(savedFilterState));
    }

    @Override
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        bx0 bx0Var = (bx0) this.f37438b;
        if (!z10) {
            return true;
        }
        bx0Var.d.U((Long) y4Var.getTag(), y4Var);
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) throws Throwable {
        switch (this.f37437a) {
            case 3:
                PhotoViewer photoViewer = ((os0) this.f37438b).f41162b;
                try {
                    AndroidUtilities.openForView(photoViewer.P4, photoViewer.f35800y, photoViewer.f35738r2, true);
                    photoViewer.G0(false, false);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 4:
                ((yu0) this.f37438b).finishFragment();
                break;
            case 5:
                ((su0) this.f37438b).f42692a.N.s();
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37438b;
                int i11 = PopupNotificationActivity.X;
                popupNotificationActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    popupNotificationActivity.startActivity(intent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 11:
                ((org.telegram.messenger.hk) this.f37438b).run(1);
                break;
            case 14:
                ProxyListActivity proxyListActivity = ((b11) this.f37438b).f36666b;
                ArrayList arrayList = proxyListActivity.D;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.f36102e = false;
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i13 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i13);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i13);
                proxyListActivity.c0(true);
                c11 c11Var = proxyListActivity.f36099a;
                if (c11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        c11Var.n(proxyListActivity.useProxyRow, 0);
                        proxyListActivity.f36099a.n(proxyListActivity.callsRow, 0);
                    }
                    proxyListActivity.f36099a.F();
                }
                break;
            case 20:
                ThemeActivity themeActivity = ((ka1) this.f37438b).f39684a;
                boolean zK0 = ThemeActivity.k0(themeActivity, AndroidUtilities.isTablet() ? 18 : 16);
                if (ThemeActivity.Y(themeActivity, 17, true)) {
                    zK0 = true;
                }
                if (zK0) {
                    themeActivity.f36228a.n(themeActivity.textSizeRow, new Object());
                    themeActivity.f36228a.n(themeActivity.bubbleRadiusRow, new Object());
                }
                if (themeActivity.f36232c != null) {
                    org.telegram.ui.ActionBar.f6 f6VarN0 = org.telegram.ui.ActionBar.g6.N0("Blue");
                    org.telegram.ui.ActionBar.f6 f6VarA0 = org.telegram.ui.ActionBar.g6.A0();
                    SparseArray sparseArray = f6VarN0.W;
                    int i14 = org.telegram.ui.ActionBar.g6.f23227n;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) sparseArray.get(i14);
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.f24007c = "d";
                        z5Var.f24005a = "Blue_99_wp.jpg";
                        z5Var.f24006b = "Blue_99_wp.jpg";
                        e6Var.f22904y = z5Var;
                        f6VarN0.v(z5Var);
                    }
                    if (f6VarN0 != f6VarA0) {
                        f6VarN0.u(i14);
                        org.telegram.ui.ActionBar.g6.t1(f6VarN0, true, false, true, false, false);
                        themeActivity.f36232c.y1(f6VarN0);
                        themeActivity.f36232c.x0(0);
                    } else if (f6VarN0.U == i14) {
                        org.telegram.ui.ActionBar.g6.o1(true);
                    } else {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarA0, Boolean.valueOf(themeActivity.f36237f == 1), null, Integer.valueOf(i14));
                        themeActivity.f36228a.m(themeActivity.m0);
                    }
                }
                break;
            case 21:
                nc1 nc1Var = ((pb1) this.f37438b).f41321a;
                org.telegram.ui.ActionBar.g6.j0(nc1Var.f40736a0, nc1Var.f40781s, true);
                org.telegram.ui.ActionBar.g6.o();
                org.telegram.ui.ActionBar.g6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, nc1Var.f40736a0, Boolean.valueOf(nc1Var.f40739b0), null, -1);
                nc1Var.finishFragment();
                break;
            default:
                ((xf1) this.f37438b).f44441a.E0(true);
                break;
        }
    }

    @Override
    public a0.h h0() {
        return null;
    }

    @Override
    public void i(int i10) {
        og1 og1Var = (og1) this.f37438b;
        if (og1Var.h == null && !og1Var.f41094f.e()) {
            og1Var.v.f36292f.e(false, true);
        }
        og1Var.l();
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f37437a) {
            case 0:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f37438b, (org.telegram.ui.Components.n41) obj, (View) obj2);
                break;
            default:
                w21 w21Var = (w21) this.f37438b;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                x21 x21Var = w21Var.v;
                if (n41Var.f49413a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.f43582b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption == null) {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.f43583c;
                        if (tL_reportResultChooseOption == null) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = w21Var.d;
                            if (tL_reportResultAddComment == null) {
                                x21.H(x21Var, n41Var.f30844l, null, null);
                            } else {
                                byte[] bArr = tL_reportResultAddComment.option;
                                if (bArr != null) {
                                    x21.H(x21Var, null, bArr, null);
                                }
                            }
                        } else {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(n41Var.d);
                            if (tL_messageReportOption != null) {
                                x21.H(x21Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            }
                        }
                    } else {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(n41Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            x21.H(x21Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.nh((SharedConfig.ProxyInfo) this.f37438b, j10, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((uw0) this.f37438b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f35902v0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_lock3, 0);
                    cqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(cqVar, 0, 1, 33);
                    privacyControlActivity.f35902v0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f35902v0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num.intValue()));
                return spannableStringBuilder;
            }
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public void V0(ArrayList arrayList) {
    }

    @Override
    public void run(Exception exc) {
        gh.p2 p2Var = (gh.p2) this.f37438b;
        FileLog.e("mlkit: failed to detect language in selection", exc);
        p2Var.run();
    }
}
