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
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qk0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, org.telegram.ui.Cells.x5, org.telegram.ui.Components.j71, org.telegram.ui.ActionBar.n1, r0.n, Utilities.Callback2Return, org.telegram.ui.Cells.a5, LanguageDetector.ExceptionCallback, RequestTimeDelegate, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.ol0, ig.e, gg.b2 {
    public final int f36769a;
    public final Object f36770b;

    public qk0(Object obj, int i10) {
        this.f36769a = i10;
        this.f36770b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        View fragmentView;
        switch (this.f36769a) {
            case 10:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f36770b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                premiumPreviewFragment.f31461o0 = defaultWindowInsets;
                premiumPreviewFragment.f31443a.setPadding(0, defaultWindowInsets.f10580b, 0, AndroidUtilities.dp(48.0f) + premiumPreviewFragment.f31461o0.d);
                org.telegram.ui.Components.yl0 yl0Var = premiumPreviewFragment.f31443a;
                i0.b bVar = premiumPreviewFragment.f31461o0;
                AndroidUtilities.setViewLayoutMargins(yl0Var, bVar.f10579a, 0, bVar.f10581c, 0);
                dx0 dx0Var = premiumPreviewFragment.U;
                i0.b bVar2 = premiumPreviewFragment.f31461o0;
                dx0Var.setPadding(bVar2.f10579a, 0, bVar2.f10581c, 0);
                FrameLayout frameLayout = premiumPreviewFragment.J;
                if (frameLayout != null) {
                    int i12 = premiumPreviewFragment.f31461o0.f10579a;
                    int dp = AndroidUtilities.dp(14.0f);
                    i0.b bVar3 = premiumPreviewFragment.f31461o0;
                    frameLayout.setPadding(i12, dp, bVar3.f10581c, bVar3.d);
                }
                return r0.l1.f42184b;
            default:
                bh0 bh0Var = (bh0) ((rh1) this.f36770b);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                int i13 = defaultWindowInsets2.f10579a;
                bh0Var.M = i13;
                int i14 = defaultWindowInsets2.f10581c;
                bh0Var.N = i14;
                bh0Var.L = defaultWindowInsets2.d;
                View view2 = bh0Var.f32361y.f32363b;
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
                bh0Var.f32361y.setPadding(0, 0, 0, bh0Var.L);
                int dp2 = AndroidUtilities.dp(72.0f) + bh0Var.L + i10;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bh0Var.H.getLayoutParams();
                if (marginLayoutParams.height != dp2) {
                    marginLayoutParams.height = dp2;
                    bh0Var.H.setLayoutParams(marginLayoutParams);
                }
                if (z10) {
                    i11 = bh0Var.L + i10;
                } else {
                    i11 = 0;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) bh0Var.f37134c.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != i11 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i11;
                    bh0Var.f37134c.setLayoutParams(marginLayoutParams2);
                }
                bh0Var.E.setPadding(i13, 0, i14, bh0Var.L);
                if (z10) {
                    l1Var = l1Var.f42185a.m(0, 0, 0, bh0Var.L);
                }
                bh0Var.i0();
                bh0Var.h0();
                SparseArray sparseArray = bh0Var.f37132a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ph1 ph1Var = (ph1) sparseArray.valueAt(i15);
                    if (ph1Var != null && (fragmentView = ph1Var.f36485a.getFragmentView()) != null) {
                        r0.i0.b(fragmentView, l1Var);
                    }
                }
                return r0.l1.f42184b;
        }
    }

    @Override
    public void a(int i10) {
        nh1 nh1Var = (nh1) this.f36770b;
        if (nh1Var.h == null && !nh1Var.f35997f.e()) {
            nh1Var.v.f31899f.e(false, true);
        }
        nh1Var.l();
    }

    @Override
    public void b() {
        switch (this.f36769a) {
            case 8:
                ((gw0) this.f36770b).e();
                return;
            default:
                ((ee1) this.f36770b).e();
                return;
        }
    }

    @Override
    public void c(org.telegram.ui.Components.xz xzVar) {
        Drawable[] drawableArr = PhotoViewer.U8;
        xzVar.f(new org.telegram.ui.Components.yz((MediaController.SavedFilterState) this.f36770b));
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36769a) {
            case 19:
                return ((p71) this.f36770b).Q(i10, view);
            case 20:
            default:
                ((le1) this.f36770b).J.d(i10, view);
                return true;
            case 21:
                final ra1 ra1Var = (ra1) this.f36770b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = ra1Var.f37064g0;
                w91 w91Var = ra1Var.W;
                int i11 = w91Var.I;
                if (i10 >= i11 && i10 <= w91Var.J) {
                    final MessageObject messageObject = ((oa1) ra1Var.f37081v0.get(i10 - i11)).f36173b;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(ra1Var, view);
                    H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ra1 ra1Var2 = ra1Var;
                                    ra1Var2.getClass();
                                    ra1Var2.presentFragment(new gj0(messageObject));
                                    return;
                                default:
                                    ra1 ra1Var3 = ra1Var;
                                    ra1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ra1Var3.f37056b);
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
                                    ra1Var2.presentFragment(new gj0(messageObject));
                                    return;
                                default:
                                    ra1 ra1Var3 = ra1Var;
                                    ra1Var3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ra1Var3.f37056b);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    ra1Var3.presentFragment(new xn(bundle), false);
                                    return;
                            }
                        }
                    }, false);
                    H.W(ra1Var.S.W0(view, false));
                    H.Z();
                } else {
                    int i12 = w91Var.U;
                    if (i10 >= i12 && i10 <= w91Var.V) {
                        ((ka1) ra1Var.Q.get(i10 - i12)).c(ra1Var.f37054a, ra1Var, c2VarArr, true);
                    } else {
                        int i13 = w91Var.R;
                        if (i10 >= i13 && i10 <= w91Var.S) {
                            ((ka1) ra1Var.O.get(i10 - i13)).c(ra1Var.f37054a, ra1Var, c2VarArr, true);
                        } else {
                            int i14 = w91Var.X;
                            if (i10 < i14 || i10 > w91Var.Y) {
                                return false;
                            }
                            ((ka1) ra1Var.P.get(i10 - i14)).c(ra1Var.f37054a, ra1Var, c2VarArr, true);
                        }
                    }
                }
                return true;
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        zx0 zx0Var = (zx0) this.f36770b;
        if (z10) {
            zx0Var.d.U((Long) b5Var.getTag(), b5Var);
            return true;
        }
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        uf.e eVar;
        int i11;
        boolean z10;
        int i12;
        int i13;
        switch (this.f36769a) {
            case 0:
                vk0 vk0Var = ((rk0) this.f36770b).f37149b;
                SparseArray sparseArray = vk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    tk0 tk0Var = (tk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = tk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.d dVar = vk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = tk0Var.e;
                        ArrayList arrayList2 = dVar.e;
                        if (document2 != null) {
                            if (!dVar.f44029f) {
                                dVar.f(true);
                                dVar.f44029f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((uf.c) arrayList2.get(i15)).f44021a != null && ((uf.c) arrayList2.get(i15)).f44021a.f18335id == document2.f18335id) {
                                        arrayList2.remove(i15);
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (tk0Var.f37860g != null && (eVar = vk0Var.getMediaDataController().ringtoneUploaderHashMap.get(tk0Var.f37860g)) != null) {
                        eVar.f44032c = true;
                        eVar.a();
                        int i16 = eVar.f44030a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = eVar.f44031b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (tk0Var == vk0Var.H) {
                        vk0Var.N = null;
                        vk0Var.H = (tk0) vk0Var.f38626b.get(0);
                        vk0Var.I = true;
                    }
                    vk0Var.f38625a.remove(tk0Var);
                    vk0Var.f38627c.remove(tk0Var);
                }
                vk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f18537id = tL_inputDocument;
                    tL_inputDocument.f18341id = document3.f18335id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    vk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.u7(8));
                }
                vk0.W(vk0Var);
                vk0Var.c0();
                vk0Var.f38628f.l();
                c2Var.dismiss();
                return;
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36770b;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f31174c.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 < childCount) {
                        View childAt = passcodeActivity.f31174c.getChildAt(i18);
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E6, false));
                        } else {
                            i18++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
            case 5:
                PhotoViewer photoViewer = ((lt0) this.f36770b).f35447b;
                try {
                    AndroidUtilities.openForView(photoViewer.T4, photoViewer.f31403y, photoViewer.f31376v2, true);
                    photoViewer.G0(false, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                ((uv0) this.f36770b).finishFragment();
                return;
            case 7:
                ((ov0) this.f36770b).f36258a.R.r();
                return;
            case 9:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f36770b;
                int i19 = PopupNotificationActivity.f31431b0;
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
            case 13:
                ((org.telegram.messenger.lk) this.f36770b).run(1);
                return;
            case 16:
                ProxyListActivity proxyListActivity = ((w11) this.f36770b).f38783b;
                ArrayList arrayList3 = proxyListActivity.F;
                int size = arrayList3.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList3.get(i20);
                    i20++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.d = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i21 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i21);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i21, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i21);
                proxyListActivity.b0(true);
                x11 x11Var = proxyListActivity.f31706a;
                if (x11Var != null) {
                    if (SharedConfig.currentProxy == null) {
                        x11Var.n(ProxyListActivity.a0(proxyListActivity), 0);
                    }
                    proxyListActivity.f31706a.F();
                    return;
                }
                return;
            case 23:
                ThemeActivity themeActivity = ((nb1) this.f36770b).f35926a;
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
                    yb1 yb1Var = themeActivity.f31837a;
                    i12 = themeActivity.textSizeRow;
                    yb1Var.n(i12, new Object());
                    yb1 yb1Var2 = themeActivity.f31837a;
                    i13 = themeActivity.bubbleRadiusRow;
                    yb1Var2.n(i13, new Object());
                }
                if (themeActivity.f31841c != null) {
                    org.telegram.ui.ActionBar.h6 N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    org.telegram.ui.ActionBar.h6 A0 = org.telegram.ui.ActionBar.i6.A0();
                    SparseArray sparseArray2 = N0.f18952a0;
                    int i22 = org.telegram.ui.ActionBar.i6.f19235n;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) sparseArray2.get(i22);
                    if (g6Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                        b6Var.f18694c = "d";
                        b6Var.f18692a = "Blue_99_wp.jpg";
                        b6Var.f18693b = "Blue_99_wp.jpg";
                        g6Var.f18926y = b6Var;
                        N0.v(b6Var);
                    }
                    if (N0 != A0) {
                        N0.u(i22);
                        org.telegram.ui.ActionBar.i6.t1(N0, true, false, true, false, false);
                        themeActivity.f31841c.z1(N0);
                        themeActivity.f31841c.y0(0);
                        return;
                    } else if (N0.Y != i22) {
                        NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                        int i23 = NotificationCenter.needSetDayNightTheme;
                        if (themeActivity.f31845f == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        globalInstance2.lambda$postNotificationNameOnUIThread$1(i23, A0, Boolean.valueOf(z10), null, Integer.valueOf(i22));
                        themeActivity.f31837a.m(themeActivity.f31857q0);
                        return;
                    } else {
                        org.telegram.ui.ActionBar.i6.o1(true);
                        return;
                    }
                }
                return;
            case 24:
                pd1 pd1Var = ((sc1) this.f36770b).f37400a;
                org.telegram.ui.ActionBar.i6.j0(pd1Var.f36404e0, pd1Var.f36439s, true);
                org.telegram.ui.ActionBar.i6.o();
                org.telegram.ui.ActionBar.i6.n1(false, false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, pd1Var.f36404e0, Boolean.valueOf(pd1Var.f36408f0), null, -1);
                pd1Var.finishFragment();
                return;
            default:
                ((xg1) this.f36770b).f39645a.E0(true);
                return;
        }
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f36769a) {
            case 2:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f36770b, (org.telegram.ui.Components.x51) obj, (View) obj2);
                return;
            default:
                u31 u31Var = (u31) this.f36770b;
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                v31 v31Var = u31Var.v;
                if (x51Var.f15754a == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u31Var.f38113b;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(x51Var.d);
                        if (tL_sponsoredMessageReportOption != null) {
                            v31.H(v31Var, tL_sponsoredMessageReportOption.text, tL_sponsoredMessageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u31Var.f38114c;
                    if (tL_reportResultChooseOption != null) {
                        TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(x51Var.d);
                        if (tL_messageReportOption != null) {
                            v31.H(v31Var, tL_messageReportOption.text, tL_messageReportOption.option, null);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_reportResultAddComment tL_reportResultAddComment = u31Var.d;
                    if (tL_reportResultAddComment != null) {
                        byte[] bArr = tL_reportResultAddComment.option;
                        if (bArr != null) {
                            v31.H(v31Var, null, bArr, null);
                            return;
                        }
                        return;
                    }
                    v31.H(v31Var, x51Var.f30302l, null, null);
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qh((SharedConfig.ProxyInfo) this.f36770b, j3, 1));
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        PrivacyControlActivity privacyControlActivity = ((sx0) this.f36770b).d;
        if (((Integer) obj).intValue() == 0) {
            if (!privacyControlActivity.getUserConfig().isPremium()) {
                if (privacyControlActivity.f31512z0 == null) {
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.msg_mini_lock3, 0);
                    qqVar.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                    spannableString.setSpan(qqVar, 0, 1, 33);
                    privacyControlActivity.f31512z0 = spannableString;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) privacyControlActivity.f31512z0);
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
        ((gg.e1) this.f36770b).run();
    }
}
