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
public final class f implements x9, yu0, org.telegram.ui.web.z0, org.telegram.ui.Components.kp0, org.telegram.ui.Components.e5, org.telegram.ui.Components.sn0, di.u9, org.telegram.ui.Components.am0, org.telegram.ui.Cells.j1, kc1, org.telegram.ui.Components.iw0, gm, pe.a, org.telegram.ui.Components.cm0, org.telegram.ui.Cells.u7, org.telegram.ui.Components.xq, org.telegram.ui.Components.br0, s4.e0, org.telegram.ui.Components.q8, org.telegram.ui.Components.t20, r0.n, nt, g11 {
    public final int f39220a;
    public final Object f39221b;

    public f(Object obj, int i10) {
        this.f39220a = i10;
        this.f39221b = obj;
    }

    @Override
    public void A(int i10, int i11) {
        ((s4.h0) this.f39221b).p(i10, i11);
    }

    @Override
    public void B(boolean z10) {
        Runnable runnable = ((ke) this.f39221b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void B0(MessageObject messageObject) {
        m3 m3Var = ((j4) this.f39221b).f40446u0[0];
        if (m3Var != null) {
            m3Var.f41440b.I0(true);
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
    public cv0 E1() {
        return null;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ag.r0(this, i10, 19), 50L);
    }

    @Override
    public void G0(long j10, int i10, di.s3 s3Var) {
        n8 n8Var = (n8) this.f39221b;
        if (n8Var.f41776b == null) {
            s3Var.run();
        }
        n8Var.f41776b.post(s3Var);
    }

    @Override
    public boolean G1(long j10) {
        return false;
    }

    @Override
    public void H(String str) {
        g gVar = (g) this.f39221b;
        gVar.finishFragment(false);
        org.telegram.ui.Components.voip.k1 k1Var = gVar.f39503x;
        LaunchActivity launchActivity = (LaunchActivity) k1Var.f33882c;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(launchActivity, 3, null);
        e2Var.f22573i0 = false;
        e2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new j10(5, e2Var, (g) k1Var.f33881b));
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
        switch (this.f39220a) {
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
        ((s4.h0) this.f39221b).t(i10, i11);
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
        ni0 ni0Var = (ni0) this.f39221b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ni0Var.d = defaultWindowInsets;
        ni0Var.F.setPadding(defaultWindowInsets.f13450a, defaultWindowInsets.f13451b, defaultWindowInsets.f13452c, defaultWindowInsets.d);
        ni0Var.E.requestLayout();
        return r0.k1.f47114b;
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
        x60 x60Var = (x60) this.f39221b;
        x60Var.W = i10;
        AndroidUtilities.updateVisibleRows(x60Var.f45663b);
    }

    @Override
    public void U(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f39220a) {
            case 3:
                e4 e4Var = (e4) this.f39221b;
                int round = Math.round(((e4Var.f38983c - i10) * f7) + e4Var.f38982b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f38984f.f40446u0[0].getAdapter().f39886y.clear();
                    j4 j4Var = e4Var.f38984f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        j4Var.f40446u0[i11].f41441c.l();
                        h4 h4Var = j4Var.f40446u0[i11].f41441c;
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
                rb0 rb0Var = (rb0) this.f39221b;
                tb0 tb0Var = rb0Var.f43099y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    tb0Var.Z();
                    ArrayList arrayList2 = tb0Var.f43726s;
                    if (arrayList2.isEmpty()) {
                        tb0Var.Y();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new nb0(2, 0, formatString, 0, 0));
                        tb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            rb0Var.performHapticFeedback(3, 1);
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
                org.telegram.ui.Components.vw0 vw0Var = ((l5) this.f39221b).f41137b;
                vw0Var.L();
                vw0Var.M();
                return;
        }
    }

    @Override
    public jh.a V() {
        return null;
    }

    @Override
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((ke) this.f39221b).U0, 0);
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
        ((fk0) this.f39221b).a();
    }

    @Override
    public void Y0(jt jtVar) {
        oj0 oj0Var = (oj0) this.f39221b;
        oj0Var.f42233y = true;
        String str = jtVar.f40742c;
        oj0Var.N.setText(str);
        oj0Var.v(str, jtVar);
        oj0Var.f42233y = false;
        AndroidUtilities.runOnUIThread(new lj0(this, 0), 300L);
        oj0Var.P.requestFocus();
        mj0 mj0Var = oj0Var.P;
        mj0Var.setSelection(mj0Var.length());
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        bd bdVar = (bd) this.f39221b;
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
        hj hjVar = (hj) this.f39221b;
        View view = hjVar.f40015a;
        if (view != null) {
            view.setPressed(false);
            hjVar.f40015a.setSelected(false);
        }
        View view2 = hjVar.f40019n;
        if (view2 != null && !hjVar.d) {
            view2.callOnClick();
            hjVar.d = true;
        }
    }

    @Override
    public int b1() {
        ke keVar = (ke) this.f39221b;
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
        ((x60) this.f39221b).f45669w.d(true);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        h10 h10Var = (h10) this.f39221b;
        if (view instanceof org.telegram.ui.Cells.o7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.r7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            h10.a(h10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.p2) {
                if (!h10Var.f39841o0.g()) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    if (p2Var.R(f7)) {
                        h10Var.f39835i0.d(p2Var);
                        return true;
                    }
                }
                h10.a(h10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
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
        switch (this.f39220a) {
            case 6:
                x5 x5Var = ((r5) this.f39221b).d;
                x5Var.f45643d0 = i10;
                x5Var.F0(true);
                return;
            case 10:
                dc dcVar = ((bc) this.f39221b).f38026f;
                dcVar.f38833y = i10;
                dcVar.d(true);
                return;
            default:
                zu zuVar = (zu) this.f39221b;
                if (zuVar.f46363f[0].f46111f != i10) {
                    if (i10 == zuVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zuVar.f46367w = z11;
                    yu yuVar = zuVar.f46363f[1];
                    yuVar.f46111f = i10;
                    yuVar.setVisibility(0);
                    zuVar.n0(true);
                    zuVar.f46365r = z10;
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
        switch (this.f39220a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((h10) this.f39221b).f39835i0.finish();
    }

    @Override
    public void g1(int i10, int i11) {
        ((s4.h0) this.f39221b).r(i10, i11, null);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39220a) {
            case 3:
                e4 e4Var = (e4) this.f39221b;
                int i10 = e4Var.f38982b;
                return String.valueOf(Math.round((e4Var.f38981a.getProgress() * (e4Var.f38983c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f39220a) {
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
        switch (this.f39220a) {
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
        ((s4.h0) this.f39221b).s(i10, i11);
    }

    @Override
    public boolean i1(long j10, int i10, int i11, int i12, di.v9 v9Var) {
        n8 n8Var = (n8) this.f39221b;
        if (n8Var.f41776b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= n8Var.f41776b.getChildCount()) {
                    break;
                }
                View childAt = n8Var.f41776b.getChildAt(i13);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    if (k8Var.f40818n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < k8Var.f40818n.size(); i14++) {
                            ArrayList arrayList = ((l8) k8Var.f40818n.valueAt(i14)).f41163b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = k8Var.f40818n.keyAt(i14);
                                n8Var.f41785h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) k8Var.f40819r.get(keyAt);
                                if (imageReceiver != null) {
                                    v9Var.f9271c = imageReceiver;
                                    if (n8Var.f41786i0 == null) {
                                        n8Var.f41786i0 = new y0(this, 11);
                                    }
                                    v9Var.e = n8Var.f41786i0;
                                    v9Var.f9269a = k8Var;
                                    v9Var.f9273g = n8Var.fragmentView;
                                    v9Var.h = AndroidUtilities.dp(36.0f);
                                    v9Var.f9274i = n8Var.fragmentView.getBottom();
                                    v9Var.f9270b = null;
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
        switch (this.f39220a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        wb wbVar = ((sb) this.f39221b).f43441n;
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
        bd bdVar = (bd) this.f39221b;
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        if (u6Var instanceof ad) {
            u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) u6Var2).f37712a;
            bdVar2.J = !bdVar2.J;
            bdVar2.g1();
            bdVar2.c1(false);
        }
        bdVar.X0(a(), false);
        bdVar.c1(false);
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f39220a;
    }

    @Override
    public int k0() {
        switch (this.f39220a) {
            case 3:
                e4 e4Var = (e4) this.f39221b;
                return e4Var.f38983c - e4Var.f38982b;
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
        switch (this.f39220a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f39220a) {
            case 15:
                return ((tx) this.f39221b).f43927t0.isInPreviewMode();
            default:
                rg0 rg0Var = (rg0) this.f39221b;
                View view2 = null;
                rg0Var.O = null;
                int childCount = rg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = rg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !rg0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f39220a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o(float f7) {
        ((h10) this.f39221b).f39835i0.a(f7);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        switch (this.f39220a) {
            case 15:
                j5Var = ((org.telegram.ui.ActionBar.r2) ((tx) this.f39221b).f43927t0).parentLayout;
                ((ActionBarLayout) j5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f39220a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f39220a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f39220a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        hj hjVar = (hj) this.f39221b;
        View view = hjVar.f40015a;
        if (view != null) {
            view.setPressed(true);
            hjVar.f40015a.setSelected(true);
            hjVar.f40015a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        hj hjVar = (hj) this.f39221b;
        un unVar = hjVar.f40022w;
        if (hjVar.f40015a != null) {
            unVar.f44213c9 = org.telegram.ui.Components.q9.b(unVar, hjVar.v, unVar.f44249f6, unVar.b(), unVar.f44385qa);
            org.telegram.ui.ActionBar.o1 o1Var = unVar.f44213c9;
            if (o1Var != null) {
                hjVar.f40016b = o1Var;
                o1Var.setOnDismissListener(new e0(hjVar, 2));
                unVar.f44468x0.C0();
                unVar.f44493z0.R = false;
                View view = hjVar.v;
                unVar.zb(view);
                if (view != unVar.f44442v1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                unVar.n8(false, z10, 0.3f);
                unVar.r9(false);
                dl dlVar = unVar.L3;
                if (dlVar != null) {
                    dlVar.d(1, true);
                }
                UndoView undoView = unVar.K3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                hk hkVar = unVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    unVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f39220a) {
            case 15:
                return;
            default:
                rg0 rg0Var = (rg0) this.f39221b;
                rg0.k(rg0Var, view, f7, f10);
                rg0.m(rg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(rg0Var.H, 450L);
                rg0Var.O = null;
                rg0Var.invalidate();
                rg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f39220a) {
            case 15:
                return;
            default:
                rg0 rg0Var = (rg0) this.f39221b;
                rg0.k(rg0Var, view, f7, f10);
                rg0.m(rg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(rg0Var.H, 450L);
                View view2 = rg0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                rg0Var.O = null;
                rg0Var.invalidate();
                rg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f39220a) {
            case 15:
                return;
            default:
                rg0 rg0Var = (rg0) this.f39221b;
                rg0.k(rg0Var, view, f7, f10);
                rg0.m(rg0Var, f7, false, false);
                rg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f39220a) {
            case 15:
                return false;
            default:
                rg0 rg0Var = (rg0) this.f39221b;
                rg0.k(rg0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(rg0Var.H);
                rg0.l(rg0Var);
                rg0.m(rg0Var, f7, true, false);
                rg0Var.invalidate();
                rg0Var.Q.a(true, true);
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
        hj hjVar = (hj) this.f39221b;
        if (!hjVar.e && (view = hjVar.f40015a) != null) {
            view.callOnClick();
            hjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p0(String str) {
        ((dk) this.f39221b).f38898b.na(str, false);
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
            ((v50) this.f39221b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public void w() {
        int i10 = this.f39220a;
    }

    @Override
    public CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        ug.o oVar;
        switch (this.f39220a) {
            case 18:
                ug.o oVar2 = ((v10) this.f39221b).f44569c.f49778c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((v10) this.f39221b).f44569c.f49778c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void y() {
        switch (this.f39220a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((l5) this.f39221b).f41137b.M();
                return;
        }
    }

    @Override
    public boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void z() {
        int i10 = this.f39220a;
    }

    @Override
    public void z0(float f7) {
        switch (this.f39220a) {
            case 6:
            case 10:
                return;
            default:
                zu zuVar = (zu) this.f39221b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || zuVar.f46363f[1].getVisibility() == 0) {
                    if (zuVar.f46365r) {
                        yu yuVar = zuVar.f46363f[0];
                        yuVar.setTranslationX((-f7) * yuVar.getMeasuredWidth());
                        yu[] yuVarArr = zuVar.f46363f;
                        yuVarArr[1].setTranslationX(yuVarArr[0].getMeasuredWidth() - (f7 * zuVar.f46363f[0].getMeasuredWidth()));
                    } else {
                        yu yuVar2 = zuVar.f46363f[0];
                        yuVar2.setTranslationX(yuVar2.getMeasuredWidth() * f7);
                        yu[] yuVarArr2 = zuVar.f46363f;
                        yuVarArr2[1].setTranslationX((f7 * yuVarArr2[0].getMeasuredWidth()) - zuVar.f46363f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        yu[] yuVarArr3 = zuVar.f46363f;
                        yu yuVar3 = yuVarArr3[0];
                        yuVarArr3[0] = yuVarArr3[1];
                        yuVarArr3[1] = yuVar3;
                        yuVar3.setVisibility(8);
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
        wb wbVar = (wb) this.f39221b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (wbVar.f45076p0.contains(Long.valueOf(j10))) {
                    wbVar.f45076p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.f45076p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
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
    public void t(ok0 ok0Var) {
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
