package org.telegram.ui;

import android.content.SharedPreferences;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;
public final class f implements x9, av0, org.telegram.ui.web.z0, org.telegram.ui.Components.lp0, org.telegram.ui.Components.e5, org.telegram.ui.Components.tn0, di.u9, org.telegram.ui.Components.bm0, org.telegram.ui.Cells.j1, mc1, org.telegram.ui.Components.jw0, im, pe.a, org.telegram.ui.Components.dm0, org.telegram.ui.Cells.u7, org.telegram.ui.Components.xq, org.telegram.ui.Components.cr0, s4.e0, org.telegram.ui.Components.q8, org.telegram.ui.Components.t20, r0.n, pt, i11 {
    public final int f39114a;
    public final Object f39115b;

    public f(Object obj, int i10) {
        this.f39114a = i10;
        this.f39115b = obj;
    }

    @Override
    public void A(int i10, int i11) {
        ((s4.h0) this.f39115b).p(i10, i11);
    }

    @Override
    public void B(boolean z10) {
        Runnable runnable = ((ke) this.f39115b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void B0(MessageObject messageObject) {
        m3 m3Var = ((j4) this.f39115b).f40414u0[0];
        if (m3Var != null) {
            m3Var.f41312b.I0(true);
        }
    }

    @Override
    public boolean C0(long j10) {
        return false;
    }

    @Override
    public boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public ev0 E1() {
        return null;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ag.r0(this, i10, 19), 50L);
    }

    @Override
    public void G0(long j10, int i10, di.s3 s3Var) {
        n8 n8Var = (n8) this.f39115b;
        if (n8Var.f41651b == null) {
            s3Var.run();
        }
        n8Var.f41651b.post(s3Var);
    }

    @Override
    public boolean G1(long j10) {
        return false;
    }

    @Override
    public void H(String str) {
        g gVar = (g) this.f39115b;
        gVar.finishFragment(false);
        org.telegram.ui.Components.voip.k1 k1Var = gVar.f39461x;
        LaunchActivity launchActivity = (LaunchActivity) k1Var.f33990c;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(launchActivity, 3, null);
        e2Var.f22576i0 = false;
        e2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new l10(5, e2Var, (g) k1Var.f33989b));
    }

    @Override
    public String H0() {
        return null;
    }

    @Override
    public boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean M() {
        return false;
    }

    @Override
    public int M0(int i10) {
        switch (this.f39114a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public void N0(int i10, int i11) {
        ((s4.h0) this.f39115b).t(i10, i11);
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        pi0 pi0Var = (pi0) this.f39115b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        pi0Var.d = defaultWindowInsets;
        pi0Var.F.setPadding(defaultWindowInsets.f13449a, defaultWindowInsets.f13450b, defaultWindowInsets.f13451c, defaultWindowInsets.d);
        pi0Var.E.requestLayout();
        return r0.k1.f47152b;
    }

    @Override
    public boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public int S() {
        return 0;
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override
    public void T0(int i10, int i11) {
        z60 z60Var = (z60) this.f39115b;
        z60Var.W = i10;
        AndroidUtilities.updateVisibleRows(z60Var.f46173b);
    }

    @Override
    public void U(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f39114a) {
            case 3:
                e4 e4Var = (e4) this.f39115b;
                int round = Math.round(((e4Var.f38751c - i10) * f7) + e4Var.f38750b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f38752f.f40414u0[0].getAdapter().f39771y.clear();
                    j4 j4Var = e4Var.f38752f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        j4Var.f40414u0[i11].f41313c.l();
                        h4 h4Var = j4Var.f40414u0[i11].f41313c;
                        ArrayList arrayList = h4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(h4Var.K);
                        Utilities.globalQueue.postRunnable(h4Var.K, 100L);
                    }
                    e4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                ub0 ub0Var = (ub0) this.f39115b;
                wb0 wb0Var = ub0Var.f43970y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    wb0Var.Z();
                    ArrayList arrayList2 = wb0Var.f44627s;
                    if (arrayList2.isEmpty()) {
                        wb0Var.Y();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new qb0(2, 0, formatString, 0, 0));
                        wb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ub0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                l5.d = f7;
                org.telegram.ui.Components.ww0 ww0Var = ((l5) this.f39115b).f40978b;
                ww0Var.L();
                ww0Var.M();
                return;
        }
    }

    @Override
    public jh.a V() {
        return null;
    }

    @Override
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((ke) this.f39115b).U0, 0);
    }

    @Override
    public boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean X0() {
        return false;
    }

    @Override
    public boolean X1(int i10) {
        return false;
    }

    @Override
    public void Y() {
        ((hk0) this.f39115b).a();
    }

    @Override
    public void Y0(lt ltVar) {
        qj0 qj0Var = (qj0) this.f39115b;
        qj0Var.f42737y = true;
        String str = ltVar.f41260c;
        qj0Var.N.setText(str);
        qj0Var.v(str, ltVar);
        qj0Var.f42737y = false;
        AndroidUtilities.runOnUIThread(new nj0(this, 0), 300L);
        qj0Var.P.requestFocus();
        oj0 oj0Var = qj0Var.P;
        oj0Var.setSelection(oj0Var.length());
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        bd bdVar = (bd) this.f39115b;
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        if (u6Var != null) {
            u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            return u6Var2.a();
        }
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public void a1() {
        kj kjVar = (kj) this.f39115b;
        View view = kjVar.f40809a;
        if (view != null) {
            view.setPressed(false);
            kjVar.f40809a.setSelected(false);
        }
        View view2 = kjVar.f40813n;
        if (view2 != null && !kjVar.d) {
            view2.callOnClick();
            kjVar.d = true;
        }
    }

    @Override
    public int b1() {
        ke keVar = (ke) this.f39115b;
        return keVar.V0 + keVar.W0;
    }

    @Override
    public org.telegram.ui.Cells.t9 b2() {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override
    public void dismiss() {
        ((z60) this.f39115b).f46179w.d(true);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        j10 j10Var = (j10) this.f39115b;
        if (view instanceof org.telegram.ui.Cells.o7) {
            j10.a(j10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            j10.a(j10Var, ((org.telegram.ui.Cells.r7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            j10.a(j10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            j10.a(j10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.p2) {
                if (!j10Var.f40338o0.g()) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    if (p2Var.R(f7)) {
                        j10Var.f40332i0.d(p2Var);
                        return true;
                    }
                }
                j10.a(j10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void f(int i10, boolean z10) {
        boolean z11;
        switch (this.f39114a) {
            case 6:
                x5 x5Var = ((r5) this.f39115b).d;
                x5Var.f45479d0 = i10;
                x5Var.F0(true);
                return;
            case 10:
                dc dcVar = ((bc) this.f39115b).f37970f;
                dcVar.f38580y = i10;
                dcVar.d(true);
                return;
            default:
                bv bvVar = (bv) this.f39115b;
                if (bvVar.f38108f[0].f37831f != i10) {
                    if (i10 == bvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bvVar.f38112w = z11;
                    av avVar = bvVar.f38108f[1];
                    avVar.f37831f = i10;
                    avVar.setVisibility(0);
                    bvVar.n0(true);
                    bvVar.f38110r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f39114a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((j10) this.f39115b).f40332i0.finish();
    }

    @Override
    public void g1(int i10, int i11) {
        ((s4.h0) this.f39115b).r(i10, i11, null);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39114a) {
            case 3:
                e4 e4Var = (e4) this.f39115b;
                int i10 = e4Var.f38750b;
                return String.valueOf(Math.round((e4Var.f38749a.getProgress() * (e4Var.f38751c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f39114a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean h0(org.telegram.ui.Components.c6 c6Var) {
        return false;
    }

    @Override
    public boolean h1(int i10, View view) {
        switch (this.f39114a) {
            case 6:
                return false;
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i0(int i10, int i11) {
        ((s4.h0) this.f39115b).s(i10, i11);
    }

    @Override
    public boolean i1(long j10, int i10, int i11, int i12, di.v9 v9Var) {
        n8 n8Var = (n8) this.f39115b;
        if (n8Var.f41651b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= n8Var.f41651b.getChildCount()) {
                    break;
                }
                View childAt = n8Var.f41651b.getChildAt(i13);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    if (k8Var.f40681n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < k8Var.f40681n.size(); i14++) {
                            ArrayList arrayList = ((l8) k8Var.f40681n.valueAt(i14)).f40992b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = k8Var.f40681n.keyAt(i14);
                                n8Var.f41660h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) k8Var.f40682r.get(keyAt);
                                if (imageReceiver != null) {
                                    v9Var.f9270c = imageReceiver;
                                    if (n8Var.f41661i0 == null) {
                                        n8Var.f41661i0 = new y0(this, 11);
                                    }
                                    v9Var.e = n8Var.f41661i0;
                                    v9Var.f9268a = k8Var;
                                    v9Var.f9272g = n8Var.fragmentView;
                                    v9Var.h = AndroidUtilities.dp(36.0f);
                                    v9Var.f9273i = n8Var.fragmentView.getBottom();
                                    v9Var.f9269b = null;
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                i13++;
            }
        }
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f39114a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        wb wbVar = ((sb) this.f39115b).f43288n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            qf.d.r(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void j1(boolean z10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        bd bdVar = (bd) this.f39115b;
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        if (u6Var instanceof ad) {
            u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) u6Var2).f37735a;
            bdVar2.J = !bdVar2.J;
            bdVar2.g1();
            bdVar2.c1(false);
        }
        bdVar.X0(a(), false);
        bdVar.c1(false);
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f39114a;
    }

    @Override
    public int k0() {
        switch (this.f39114a) {
            case 3:
                e4 e4Var = (e4) this.f39115b;
                return e4Var.f38751c - e4Var.f38750b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f39114a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f39114a) {
            case 15:
                return ((wx) this.f39115b).f45420t0.isInPreviewMode();
            default:
                tg0 tg0Var = (tg0) this.f39115b;
                View view2 = null;
                tg0Var.O = null;
                int childCount = tg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = tg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !tg0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f39114a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o(float f7) {
        ((j10) this.f39115b).f40332i0.a(f7);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        switch (this.f39114a) {
            case 15:
                j5Var = ((org.telegram.ui.ActionBar.r2) ((wx) this.f39115b).f45420t0).parentLayout;
                ((ActionBarLayout) j5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f39114a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f39114a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f39114a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        kj kjVar = (kj) this.f39115b;
        View view = kjVar.f40809a;
        if (view != null) {
            view.setPressed(true);
            kjVar.f40809a.setSelected(true);
            kjVar.f40809a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z10;
        kj kjVar = (kj) this.f39115b;
        wn wnVar = kjVar.f40816w;
        if (kjVar.f40809a != null) {
            wnVar.f45134g9 = org.telegram.ui.Components.q9.b(wnVar, kjVar.v, wnVar.f45168j6, wnVar.b(), wnVar.f45309ua);
            org.telegram.ui.ActionBar.o1 o1Var = wnVar.f45134g9;
            if (o1Var != null) {
                kjVar.f40810b = o1Var;
                o1Var.setOnDismissListener(new e0(kjVar, 2));
                wnVar.f45339x0.C0();
                wnVar.f45364z0.R = false;
                View view = kjVar.v;
                wnVar.Db(view);
                if (view != wnVar.f45313v1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wnVar.p8(false, z10, 0.3f);
                wnVar.u9(false);
                fl flVar = wnVar.L3;
                if (flVar != null) {
                    flVar.d(1, true);
                }
                UndoView undoView = wnVar.K3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f39114a) {
            case 15:
                return;
            default:
                tg0 tg0Var = (tg0) this.f39115b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(tg0Var.H, 450L);
                tg0Var.O = null;
                tg0Var.invalidate();
                tg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f39114a) {
            case 15:
                return;
            default:
                tg0 tg0Var = (tg0) this.f39115b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(tg0Var.H, 450L);
                View view2 = tg0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                tg0Var.O = null;
                tg0Var.invalidate();
                tg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f39114a) {
            case 15:
                return;
            default:
                tg0 tg0Var = (tg0) this.f39115b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, false);
                tg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f39114a) {
            case 15:
                return false;
            default:
                tg0 tg0Var = (tg0) this.f39115b;
                tg0.k(tg0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(tg0Var.H);
                tg0.l(tg0Var);
                tg0.m(tg0Var, f7, true, false);
                tg0Var.invalidate();
                tg0Var.Q.a(true, true);
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        kj kjVar = (kj) this.f39115b;
        if (!kjVar.e && (view = kjVar.f40809a) != null) {
            view.callOnClick();
            kjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p0(String str) {
        ((fk) this.f39115b).f39392b.qa(str, false);
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public String u(long j10) {
        return null;
    }

    @Override
    public void v0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((x50) this.f39115b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public void w() {
        int i10 = this.f39114a;
    }

    @Override
    public CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        ug.o oVar;
        switch (this.f39114a) {
            case 18:
                ug.o oVar2 = ((x10) this.f39115b).f45455c.f49816c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((x10) this.f39115b).f45455c.f49816c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void y() {
        switch (this.f39114a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((l5) this.f39115b).f40978b.M();
                return;
        }
    }

    @Override
    public boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void z() {
        int i10 = this.f39114a;
    }

    @Override
    public void z0(float f7) {
        switch (this.f39114a) {
            case 6:
            case 10:
                return;
            default:
                bv bvVar = (bv) this.f39115b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || bvVar.f38108f[1].getVisibility() == 0) {
                    if (bvVar.f38110r) {
                        av avVar = bvVar.f38108f[0];
                        avVar.setTranslationX((-f7) * avVar.getMeasuredWidth());
                        av[] avVarArr = bvVar.f38108f;
                        avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth() - (f7 * bvVar.f38108f[0].getMeasuredWidth()));
                    } else {
                        av avVar2 = bvVar.f38108f[0];
                        avVar2.setTranslationX(avVar2.getMeasuredWidth() * f7);
                        av[] avVarArr2 = bvVar.f38108f;
                        avVarArr2[1].setTranslationX((f7 * avVarArr2[0].getMeasuredWidth()) - bvVar.f38108f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        av[] avVarArr3 = bvVar.f38108f;
                        av avVar3 = avVarArr3[0];
                        avVarArr3[0] = avVarArr3[1];
                        avVarArr3[1] = avVar3;
                        avVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.f39115b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (wbVar.f44605p0.contains(Long.valueOf(j10))) {
                    wbVar.f44605p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.f44605p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.X0(true);
                wbVar.S0();
                wbVar.E.l();
                return;
            }
        }
        wbVar.Q0(view, f7, f10);
    }

    private final void d2() {
    }

    private final void e2() {
    }

    private final void f2() {
    }

    private final void g2() {
    }

    private final void h2() {
    }

    private final void o1() {
    }

    private final void t1() {
    }

    @Override
    public void R() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void n() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void z1() {
    }

    private final void Y1(float f7) {
    }

    private final void c2(float f7) {
    }

    private final void i2(boolean z10) {
    }

    private final void j2(boolean z10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void E(MessageObject messageObject) {
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K(MessageObject messageObject) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Q0(int i10) {
    }

    @Override
    public void R0(MrzRecognizer.Result result) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Z(int i10) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void g0(String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void t(qk0 qk0Var) {
    }

    @Override
    public void u1(MessageObject messageObject) {
    }

    @Override
    public void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void T(boolean z10, boolean z11) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override
    public void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void D1(View view, float f7, float f10) {
    }

    private final void F1(View view, float f7, float f10) {
    }

    private final void J1(View view, float f7, float f10) {
    }

    private final void L1(View view, float f7, float f10) {
    }

    private final void N1(View view, float f7, float f10) {
    }

    private final void O1(View view, float f7, float f10) {
    }

    private final void P1(View view, float f7, float f10) {
    }

    private final void S1(View view, float f7, float f10) {
    }

    private final void T1(View view, float f7, float f10) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void U1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
