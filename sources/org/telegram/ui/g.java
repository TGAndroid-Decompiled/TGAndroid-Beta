package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
public final class g implements x9, ov0, org.telegram.ui.web.a1, org.telegram.ui.Components.pp0, org.telegram.ui.Components.f5, org.telegram.ui.Components.xn0, k7, ai.gc, org.telegram.ui.Components.lm0, org.telegram.ui.Cells.l1, qd1, rm, ne.a, org.telegram.ui.Components.nm0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.dr, org.telegram.ui.Components.hr0, s4.f0, org.telegram.ui.Components.p8, org.telegram.ui.Components.c30, r0.n, bu, w11, org.telegram.ui.ActionBar.c6 {
    public final int f37878a;
    public final Object f37879b;

    public g(Object obj, int i10) {
        this.f37878a = i10;
        this.f37879b = obj;
    }

    @Override
    public String A0() {
        return null;
    }

    @Override
    public void C() {
        int i10 = this.f37878a;
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean C2(int i10) {
        return false;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.i0) this.f37879b).p(i10, i11);
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public org.telegram.ui.Cells.p9 G2() {
        return null;
    }

    @Override
    public int H0(int i10) {
        switch (this.f37878a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.p8(this, i10, 16), 50L);
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f37879b;
        hVar.finishFragment(false);
        tw twVar = hVar.f38204x;
        LaunchActivity launchActivity = (LaunchActivity) twVar.f42301b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(launchActivity, 3, null);
        a2Var.f20163g0 = false;
        a2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new so(27, a2Var, (h) twVar.f42302c));
    }

    @Override
    public void L0(int i10, int i11) {
        ((s4.i0) this.f37879b).t(i10, i11);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ej0 ej0Var = (ej0) this.f37879b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ej0Var.f37132e = defaultWindowInsets;
        ej0Var.G.setPadding(defaultWindowInsets.f11574a, defaultWindowInsets.f11575b, defaultWindowInsets.f11576c, defaultWindowInsets.d);
        ej0Var.F.requestLayout();
        return r0.k1.f46991b;
    }

    @Override
    public boolean M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public void Q0(int i10, int i11) {
        l70 l70Var = (l70) this.f37879b;
        l70Var.W = i10;
        AndroidUtilities.updateVisibleRows(l70Var.f39651b);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public boolean T0() {
        return false;
    }

    @Override
    public void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    @Override
    public CharacterStyle U1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void V0(xt xtVar) {
        ek0 ek0Var = (ek0) this.f37879b;
        ek0Var.E = true;
        String str = xtVar.f44158c;
        ek0Var.O.setText(str);
        ek0Var.w(str, xtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new wz(this, 29), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f37878a) {
            case 3:
                e4 e4Var = (e4) this.f37879b;
                int round = Math.round(((e4Var.f36968c - i10) * f7) + e4Var.f36967b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f36970f.f38661u0[0].getAdapter().f37925y.clear();
                    i4 i4Var = e4Var.f36970f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        i4Var.f38661u0[i11].f39893c.l();
                        g4 g4Var = i4Var.f38661u0[i11].f39893c;
                        ArrayList arrayList = g4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(g4Var.K);
                        Utilities.globalQueue.postRunnable(g4Var.K, 100L);
                    }
                    e4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                lc0 lc0Var = (lc0) this.f37879b;
                nc0 nc0Var = lc0Var.f39703y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    nc0Var.Y();
                    ArrayList arrayList2 = nc0Var.f40379s;
                    if (arrayList2.isEmpty()) {
                        nc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new hc0(2, 0, formatString, 0, 0));
                        nc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            lc0Var.performHapticFeedback(3, 1);
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
                org.telegram.ui.Components.yw0 yw0Var = ((l5) this.f37879b).f39644b;
                yw0Var.M();
                yw0Var.N();
                return;
        }
    }

    @Override
    public void X0() {
        tj tjVar = (tj) this.f37879b;
        View view = tjVar.f42204a;
        if (view != null) {
            view.setPressed(false);
            tjVar.f42204a.setSelected(false);
        }
        View view2 = tjVar.f42209n;
        if (view2 != null && !tjVar.d) {
            view2.callOnClick();
            tjVar.d = true;
        }
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        j8 j8Var = (j8) this.f37879b;
        if (j8Var.f39126b == null) {
            e5Var.run();
        }
        j8Var.f39126b.post(e5Var);
    }

    @Override
    public boolean Z0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.f37878a) {
            case 12:
                fd fdVar = (fd) this.f37879b;
                c6Var = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
                    return c6Var2.a();
                }
                return org.telegram.ui.ActionBar.h6.I.q();
            default:
                return ((cq0) this.f37879b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public void b0() {
        ((mk0) this.f37879b).a();
    }

    @Override
    public boolean b1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        y10 y10Var = (y10) this.f37879b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            y10.a(y10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            y10.a(y10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            y10.a(y10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            y10.a(y10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!y10Var.f44260o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.S(f7)) {
                        y10Var.f44254i0.f(s2Var);
                        return true;
                    }
                }
                y10.a(y10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void clear() {
        ((z6) this.f37879b).f44621e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f37878a) {
            case 6:
                y5 y5Var = ((r5) this.f37879b).d;
                y5Var.f44296b0 = i10;
                y5Var.H0(true);
                return;
            case 11:
                fc fcVar = ((dc) this.f37879b).f36759f;
                fcVar.f37709y = i10;
                fcVar.d(true);
                return;
            default:
                pv pvVar = (pv) this.f37879b;
                if (pvVar.f41101f[0].f40782f != i10) {
                    if (i10 == pvVar.f41100e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pvVar.f41105w = z11;
                    ov ovVar = pvVar.f41101f[1];
                    ovVar.f40782f = i10;
                    ovVar.setVisibility(0);
                    pvVar.m0(true);
                    pvVar.f41103r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public int d0(int i10) {
        return x0(i10);
    }

    @Override
    public boolean d1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        j8 j8Var = (j8) this.f37879b;
        if (j8Var.f39126b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= j8Var.f39126b.getChildCount()) {
                    break;
                }
                View childAt = j8Var.f39126b.getChildAt(i13);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    if (g8Var.f37972n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < g8Var.f37972n.size(); i14++) {
                            ArrayList arrayList = ((h8) g8Var.f37972n.valueAt(i14)).f38279b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = g8Var.f37972n.keyAt(i14);
                                j8Var.f39136h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.f37973r.get(keyAt);
                                if (imageReceiver != null) {
                                    hcVar.f1105c = imageReceiver;
                                    if (j8Var.f39137i0 == null) {
                                        j8Var.f39137i0 = new z0(this, 10);
                                    }
                                    hcVar.f1106e = j8Var.f39137i0;
                                    hcVar.f1103a = g8Var;
                                    hcVar.f1108g = j8Var.fragmentView;
                                    hcVar.h = AndroidUtilities.dp(36.0f);
                                    hcVar.f1109i = j8Var.fragmentView.getBottom();
                                    hcVar.f1104b = null;
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
    public void dismiss() {
        switch (this.f37878a) {
            case 7:
                return;
            default:
                ((l70) this.f37879b).f39658w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public sv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public int f1(int i10) {
        return x0(i10);
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f37878a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public void g1() {
        b7 b7Var = ((z6) this.f37879b).f44621e;
        zh.b bVar = b7Var.Y;
        if (bVar != null && bVar.f54931j.size() > 0) {
            b7Var.Y.d();
            y6 y6Var = b7Var.N;
            if (y6Var != null) {
                y6Var.e(false);
                b7Var.N.d();
            }
        }
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37878a) {
            case 3:
                e4 e4Var = (e4) this.f37879b;
                int i10 = e4Var.f36967b;
                return String.valueOf(Math.round((e4Var.f36966a.getProgress() * (e4Var.f36968c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        cq0 cq0Var = (cq0) this.f37879b;
        if (str.equals("drawableMsgIn")) {
            return cq0Var.f36493w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cq0Var.f36494x;
        }
        org.telegram.ui.ActionBar.c6 c6Var = cq0Var.f36492s;
        if (c6Var != null) {
            return c6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f37878a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((y10) this.f37879b).f44254i0.finish();
    }

    @Override
    public void i0(int i10, int i11) {
        ((s4.i0) this.f37879b).s(i10, i11);
    }

    @Override
    public boolean i1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f37878a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int j0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public void j1(int i10, int i11) {
        ((s4.i0) this.f37879b).r(i10, i11, null);
    }

    @Override
    public void k() {
        yb ybVar = ((ub) this.f37879b).f42479n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            of.f.s(ybVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(ybVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public boolean k1(int i10, View view) {
        switch (this.f37878a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l(boolean z10) {
        int i10 = this.f37878a;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        fd fdVar = (fd) this.f37879b;
        c6Var = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
        if (c6Var instanceof ed) {
            c6Var2 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            fd fdVar2 = ((ed) c6Var2).f37062a;
            fdVar2.J = !fdVar2.J;
            fdVar2.d1();
            fdVar2.Z0(false);
        }
        fdVar.U0(a(), false);
        fdVar.Z0(false);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        switch (this.f37878a) {
            case 3:
                e4 e4Var = (e4) this.f37879b;
                return e4Var.f36968c - e4Var.f36967b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f37878a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f37878a) {
            case 15:
                return ((oy) this.f37879b).E0.isInPreviewMode();
            default:
                ih0 ih0Var = (ih0) this.f37879b;
                View view2 = null;
                ih0Var.O = null;
                int childCount = ih0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ih0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !ih0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f37878a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f37878a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.m2) ((oy) this.f37879b).E0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f37878a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f37878a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f37878a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tj tjVar = (tj) this.f37879b;
        View view = tjVar.f42204a;
        if (view != null) {
            view.setPressed(true);
            tjVar.f42204a.setSelected(true);
            tjVar.f42204a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        tj tjVar = (tj) this.f37879b;
        eo eoVar = tjVar.f42212w;
        if (tjVar.f42204a != null) {
            eoVar.Q8 = org.telegram.ui.Components.q9.b(eoVar, tjVar.v, eoVar.T5, eoVar.d(), eoVar.f37251ea);
            org.telegram.ui.ActionBar.m1 m1Var = eoVar.Q8;
            if (m1Var != null) {
                tjVar.f42205b = m1Var;
                m1Var.setOnDismissListener(new f0(tjVar, 2));
                eoVar.f37478x0.B0();
                eoVar.f37502z0.R = false;
                View view = tjVar.v;
                eoVar.sb(view);
                if (view != eoVar.f37303j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eoVar.j8(false, z10, 0.3f);
                eoVar.m9(false);
                ol olVar = eoVar.f37505z3;
                if (olVar != null) {
                    olVar.e(1, true);
                }
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                sk skVar = eoVar.Y;
                if (skVar != null && skVar.getEditField() != null) {
                    eoVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f37878a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f37879b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ih0Var.H, 450L);
                ih0Var.O = null;
                ih0Var.invalidate();
                ih0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f37878a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f37879b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ih0Var.H, 450L);
                View view2 = ih0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                ih0Var.O = null;
                ih0Var.invalidate();
                ih0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f37878a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f37879b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, false);
                ih0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f37878a) {
            case 15:
                return false;
            default:
                ih0 ih0Var = (ih0) this.f37879b;
                ih0.k(ih0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(ih0Var.H);
                ih0.l(ih0Var);
                ih0.m(ih0Var, f7, true, false);
                ih0Var.invalidate();
                ih0Var.Q.a(true, true);
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
        tj tjVar = (tj) this.f37879b;
        if (!tjVar.f42207e && (view = tjVar.f42204a) != null) {
            view.callOnClick();
            tjVar.f42207e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p0(String str) {
        ((ok) this.f37879b).f40738b.ia(str, false);
    }

    @Override
    public void q(float f7) {
        ((y10) this.f37879b).f44254i0.e(f7);
    }

    @Override
    public void q0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((i60) this.f37879b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public boolean r2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override
    public void t0(int i10, int i11, boolean z10) {
        sg.o oVar;
        switch (this.f37878a) {
            case 18:
                sg.o oVar2 = ((k20) this.f37879b).f39346c.f48273c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((k20) this.f37879b).f39346c.f48273c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void v0(float f7) {
        switch (this.f37878a) {
            case 6:
            case 11:
                return;
            default:
                pv pvVar = (pv) this.f37879b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || pvVar.f41101f[1].getVisibility() == 0) {
                    if (pvVar.f41103r) {
                        ov ovVar = pvVar.f41101f[0];
                        ovVar.setTranslationX((-f7) * ovVar.getMeasuredWidth());
                        ov[] ovVarArr = pvVar.f41101f;
                        ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth() - (f7 * pvVar.f41101f[0].getMeasuredWidth()));
                    } else {
                        ov ovVar2 = pvVar.f41101f[0];
                        ovVar2.setTranslationX(ovVar2.getMeasuredWidth() * f7);
                        ov[] ovVarArr2 = pvVar.f41101f;
                        ovVarArr2[1].setTranslationX((f7 * ovVarArr2[0].getMeasuredWidth()) - pvVar.f41101f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        ov[] ovVarArr3 = pvVar.f41101f;
                        ov ovVar3 = ovVarArr3[0];
                        ovVarArr3[0] = ovVarArr3[1];
                        ovVarArr3[1] = ovVar3;
                        ovVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public void w0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.f37879b).f38661u0[0];
        if (m3Var != null) {
            m3Var.f39892b.I0(true);
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f20889v3;
    }

    @Override
    public int x0(int i10) {
        cq0 cq0Var = (cq0) this.f37879b;
        int indexOfKey = cq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = cq0Var.f36492s;
        if (c6Var != null) {
            return c6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public void y() {
        int i10 = this.f37878a;
    }

    @Override
    public void y0(u6 u6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        b7 b7Var = ((z6) this.f37879b).f44621e;
        if (u6Var != null) {
            if (b7Var.Y.f54931j.size() <= 0 && !z10) {
                if (b7Var.H > 0 && b7Var.getParentActivity() != null) {
                    u6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = u6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((v6) sparseArray.get(0)).f42689b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((v6) sparseArray.get(1)).f42689b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f54927e;
                    if (obj2 != null) {
                        arrayList2.addAll(((v6) sparseArray.get(2)).f42689b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f54928f;
                    if (obj3 != null) {
                        arrayList3.addAll(((v6) sparseArray.get(3)).f42689b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f54929g;
                    if (obj4 != null) {
                        arrayList4.addAll(((v6) sparseArray.get(4)).f42689b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f54931j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f54939r += ((zh.a) arrayList.get(i10)).f54920c;
                        } else {
                            bVar.f54940s += ((zh.a) arrayList.get(i10)).f54920c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f54941t += ((zh.a) arrayList2.get(i11)).f54920c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f54942u += ((zh.a) arrayList3.get(i12)).f54920c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f54920c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f54934m = z11;
                    bVar.f54935n = z11;
                    bVar.f54936o = z11;
                    bVar.f54937p = z11;
                    bVar.f54938q = z11;
                    Collections.sort(arrayList, new ob1(28));
                    Collections.sort(arrayList2, new ob1(28));
                    Collections.sort(arrayList3, new ob1(28));
                    Collections.sort(arrayList4, new ob1(28));
                    Collections.sort(bVar.h, new ob1(28));
                    lv lvVar = new lv(b7Var, u6Var, bVar, new n6.k(b7Var, u6Var, false, 4));
                    b7Var.T = lvVar;
                    b7Var.showDialog(lvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = b7Var.Y;
            HashSet hashSet2 = bVar2.f54931j;
            HashSet hashSet3 = bVar2.f54933l;
            long j3 = u6Var.f42371a;
            SparseArray sparseArray2 = u6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((v6) sparseArray2.valueAt(i14)).f42689b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f54932k += aVar2.f54920c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((v6) sparseArray2.valueAt(i16)).f42689b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f54932k -= aVar3.f54920c;
                        }
                    }
                }
            }
            bVar2.c();
            b7Var.N.d();
            b7.g0(b7Var);
        } else if (aVar != null) {
            b7Var.Y.i(aVar);
            b7Var.N.d();
            b7.g0(b7Var);
        }
    }

    @Override
    public void z() {
        switch (this.f37878a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((l5) this.f37879b).f39644b.N();
                return;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        yb ybVar = (yb) this.f37879b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ybVar.f44425p0.contains(Long.valueOf(j3))) {
                    ybVar.f44425p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ybVar.f44425p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ybVar.W0(true);
                ybVar.R0();
                ybVar.E.l();
                return;
            }
        }
        ybVar.P0(view, f7, f10);
    }

    private final void E1(float f7) {
    }

    private final void F1(float f7) {
    }

    private final void G1() {
    }

    private final void I1() {
    }

    private final void L1() {
    }

    private final void P1() {
    }

    private final void R1() {
    }

    private final void Y1(boolean z10) {
    }

    private final void c2(boolean z10) {
    }

    private final void m1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void E0() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void J1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void O0(int i10) {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void Q1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void U() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void c1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void h1() {
    }

    @Override
    public void k0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void k2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s() {
    }

    @Override
    public void s2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void v(wk0 wk0Var) {
    }

    @Override
    public void x2() {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void U0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    private final void A1(View view, float f7, float f10) {
    }

    private final void C1(View view, float f7, float f10) {
    }

    private final void r1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final void u1(View view, float f7, float f10) {
    }

    private final void w1(View view, float f7, float f10) {
    }

    private final void x1(View view, float f7, float f10) {
    }

    private final void y1(View view, float f7, float f10) {
    }

    private final void z1(View view, float f7, float f10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void a1(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void h2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void z2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void D1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
