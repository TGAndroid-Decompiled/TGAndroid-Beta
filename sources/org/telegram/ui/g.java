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
public final class g implements u9, mv0, org.telegram.ui.web.a1, org.telegram.ui.Components.kp0, org.telegram.ui.Components.f5, org.telegram.ui.Components.sn0, h7, ai.gc, org.telegram.ui.Components.gm0, org.telegram.ui.Cells.l1, od1, nm, ne.a, org.telegram.ui.Components.im0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.br, org.telegram.ui.Components.cr0, s4.f0, org.telegram.ui.Components.p8, org.telegram.ui.Components.a30, r0.n, yt, u11, org.telegram.ui.ActionBar.e6 {
    public final int f37774a;
    public final Object f37775b;

    public g(Object obj, int i10) {
        this.f37774a = i10;
        this.f37775b = obj;
    }

    @Override
    public boolean A2(int i10) {
        return false;
    }

    @Override
    public int B0(int i10) {
        switch (this.f37774a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void C() {
        int i10 = this.f37774a;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.i0) this.f37775b).p(i10, i11);
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override
    public org.telegram.ui.Cells.p9 E2() {
        return null;
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.i6.T0(str);
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
        h hVar = (h) this.f37775b;
        hVar.finishFragment(false);
        rw rwVar = hVar.f38206x;
        LaunchActivity launchActivity = (LaunchActivity) rwVar.f41572b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f20424g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new oo(27, b2Var, (h) rwVar.f41573c));
    }

    @Override
    public void K0(int i10, int i11) {
        ((s4.i0) this.f37775b).t(i10, i11);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        dj0 dj0Var = (dj0) this.f37775b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        dj0Var.f37041e = defaultWindowInsets;
        dj0Var.G.setPadding(defaultWindowInsets.f11576a, defaultWindowInsets.f11577b, defaultWindowInsets.f11578c, defaultWindowInsets.d);
        dj0Var.F.requestLayout();
        return r0.k1.f46820b;
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
    public boolean Q() {
        return false;
    }

    @Override
    public void Q0(int i10, int i11) {
        j70 j70Var = (j70) this.f37775b;
        j70Var.W = i10;
        AndroidUtilities.updateVisibleRows(j70Var.f38890b);
    }

    @Override
    public boolean R(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public boolean S() {
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
    public void U0(ut utVar) {
        dk0 dk0Var = (dk0) this.f37775b;
        dk0Var.E = true;
        String str = utVar.f42595c;
        dk0Var.O.setText(str);
        dk0Var.w(str, utVar);
        dk0Var.E = false;
        AndroidUtilities.runOnUIThread(new uz(this, 29), 300L);
        dk0Var.Q.requestFocus();
        bk0 bk0Var = dk0Var.Q;
        bk0Var.setSelection(bk0Var.length());
    }

    @Override
    public CharacterStyle U1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public void W0() {
        pj pjVar = (pj) this.f37775b;
        View view = pjVar.f40858a;
        if (view != null) {
            view.setPressed(false);
            pjVar.f40858a.setSelected(false);
        }
        View view2 = pjVar.f40863n;
        if (view2 != null && !pjVar.d) {
            view2.callOnClick();
            pjVar.d = true;
        }
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f37774a) {
            case 3:
                e4 e4Var = (e4) this.f37775b;
                int round = Math.round(((e4Var.f37192c - i10) * f7) + e4Var.f37191b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f37194f.f38559u0[0].getAdapter().f37818y.clear();
                    i4 i4Var = e4Var.f37194f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        i4Var.f38559u0[i11].f39797c.l();
                        g4 g4Var = i4Var.f38559u0[i11].f39797c;
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
                kc0 kc0Var = (kc0) this.f37775b;
                mc0 mc0Var = kc0Var.f39265y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    mc0Var.Y();
                    ArrayList arrayList2 = mc0Var.f39879s;
                    if (arrayList2.isEmpty()) {
                        mc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new gc0(2, 0, formatString, 0, 0));
                        mc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            kc0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                i5.d = f7;
                org.telegram.ui.Components.tw0 tw0Var = ((i5) this.f37775b).f38573b;
                tw0Var.M();
                tw0Var.N();
                return;
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
        g8 g8Var = (g8) this.f37775b;
        if (g8Var.f37959b == null) {
            e5Var.run();
        }
        g8Var.f37959b.post(e5Var);
    }

    @Override
    public boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f37774a) {
            case 12:
                bd bdVar = (bd) this.f37775b;
                e6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                    return e6Var2.a();
                }
                return org.telegram.ui.ActionBar.i6.I.q();
            default:
                return ((aq0) this.f37775b).S;
        }
    }

    @Override
    public void a0() {
        ((lk0) this.f37775b).a();
    }

    @Override
    public int a1(int i10) {
        return x0(i10);
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        w10 w10Var = (w10) this.f37775b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            w10.a(w10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!w10Var.f43105o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.S(f7)) {
                        w10Var.f43099i0.f(s2Var);
                        return true;
                    }
                }
                w10.a(w10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    @Override
    public boolean c1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void clear() {
        ((w6) this.f37775b).f43138e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f37774a) {
            case 6:
                v5 v5Var = ((o5) this.f37775b).d;
                v5Var.f42687b0 = i10;
                v5Var.H0(true);
                return;
            case 11:
                cc ccVar = ((ac) this.f37775b).f35946f;
                ccVar.f36668y = i10;
                ccVar.d(true);
                return;
            default:
                mv mvVar = (mv) this.f37775b;
                if (mvVar.f40039f[0].f39729f != i10) {
                    if (i10 == mvVar.f40038e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    mvVar.f40043w = z11;
                    lv lvVar = mvVar.f40039f[1];
                    lvVar.f39729f = i10;
                    lvVar.setVisibility(0);
                    mvVar.m0(true);
                    mvVar.f40041r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public TextureView d0() {
        return null;
    }

    @Override
    public void dismiss() {
        switch (this.f37774a) {
            case 7:
                return;
            default:
                ((j70) this.f37775b).f38897w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean e1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        g8 g8Var = (g8) this.f37775b;
        if (g8Var.f37959b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= g8Var.f37959b.getChildCount()) {
                    break;
                }
                View childAt = g8Var.f37959b.getChildAt(i13);
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    if (d8Var.f36930n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < d8Var.f36930n.size(); i14++) {
                            ArrayList arrayList = ((e8) d8Var.f36930n.valueAt(i14)).f37226b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = d8Var.f36930n.keyAt(i14);
                                g8Var.f37969h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) d8Var.f36931r.get(keyAt);
                                if (imageReceiver != null) {
                                    hcVar.f1107c = imageReceiver;
                                    if (g8Var.f37970i0 == null) {
                                        g8Var.f37970i0 = new z0(this, 10);
                                    }
                                    hcVar.f1108e = g8Var.f37970i0;
                                    hcVar.f1105a = d8Var;
                                    hcVar.f1110g = g8Var.fragmentView;
                                    hcVar.h = AndroidUtilities.dp(36.0f);
                                    hcVar.f1111i = g8Var.fragmentView.getBottom();
                                    hcVar.f1106b = null;
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
    public qv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void f0(int i10, int i11) {
        ((s4.i0) this.f37775b).s(i10, i11);
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f37774a) {
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
    public void g1() {
        y6 y6Var = ((w6) this.f37775b).f43138e;
        zh.b bVar = y6Var.Y;
        if (bVar != null && bVar.f54751j.size() > 0) {
            y6Var.Y.d();
            v6 v6Var = y6Var.N;
            if (v6Var != null) {
                v6Var.e(false);
                y6Var.N.d();
            }
        }
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37774a) {
            case 3:
                e4 e4Var = (e4) this.f37775b;
                int i10 = e4Var.f37191b;
                return String.valueOf(Math.round((e4Var.f37190a.getProgress() * (e4Var.f37192c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        aq0 aq0Var = (aq0) this.f37775b;
        if (str.equals("drawableMsgIn")) {
            return aq0Var.f36042w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return aq0Var.f36043x;
        }
        org.telegram.ui.ActionBar.e6 e6Var = aq0Var.f36041s;
        if (e6Var != null) {
            return e6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.P0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f37774a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((w10) this.f37775b).f43099i0.finish();
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public int i0() {
        switch (this.f37774a) {
            case 3:
                e4 e4Var = (e4) this.f37775b;
                return e4Var.f37192c - e4Var.f37191b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
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
        switch (this.f37774a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j1(int i10, int i11) {
        ((s4.i0) this.f37775b).r(i10, i11, null);
    }

    @Override
    public void k() {
        vb vbVar = ((rb) this.f37775b).f41412n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            of.f.s(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public boolean k1(int i10, View view) {
        switch (this.f37774a) {
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
        int i10 = this.f37774a;
    }

    @Override
    public int l0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        bd bdVar = (bd) this.f37775b;
        e6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (e6Var instanceof ad) {
            e6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) e6Var2).f35953a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f37774a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f37774a) {
            case 15:
                return ((my) this.f37775b).E0.isInPreviewMode();
            default:
                hh0 hh0Var = (hh0) this.f37775b;
                View view2 = null;
                hh0Var.O = null;
                int childCount = hh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = hh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !hh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f37774a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o0(String str) {
        ((kk) this.f37775b).f39356b.ia(str, false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f37774a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((my) this.f37775b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f37774a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f37774a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f37774a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        pj pjVar = (pj) this.f37775b;
        View view = pjVar.f40858a;
        if (view != null) {
            view.setPressed(true);
            pjVar.f40858a.setSelected(true);
            pjVar.f40858a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        pj pjVar = (pj) this.f37775b;
        zn znVar = pjVar.f40866w;
        if (pjVar.f40858a != null) {
            znVar.Q8 = org.telegram.ui.Components.q9.b(znVar, pjVar.v, znVar.T5, znVar.d(), znVar.f44807ea);
            org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
            if (n1Var != null) {
                pjVar.f40859b = n1Var;
                n1Var.setOnDismissListener(new f0(pjVar, 2));
                znVar.f45034x0.B0();
                znVar.f45058z0.R = false;
                View view = pjVar.v;
                znVar.sb(view);
                if (view != znVar.f44859j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                znVar.j8(false, z10, 0.3f);
                znVar.m9(false);
                kl klVar = znVar.f45061z3;
                if (klVar != null) {
                    klVar.e(1, true);
                }
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ok okVar = znVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f37774a) {
            case 15:
                return;
            default:
                hh0 hh0Var = (hh0) this.f37775b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f37774a) {
            case 15:
                return;
            default:
                hh0 hh0Var = (hh0) this.f37775b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                View view2 = hh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f37774a) {
            case 15:
                return;
            default:
                hh0 hh0Var = (hh0) this.f37775b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, false);
                hh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f37774a) {
            case 15:
                return false;
            default:
                hh0 hh0Var = (hh0) this.f37775b;
                hh0.k(hh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(hh0Var.H);
                hh0.l(hh0Var);
                hh0.m(hh0Var, f7, true, false);
                hh0Var.invalidate();
                hh0Var.Q.a(true, true);
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
        pj pjVar = (pj) this.f37775b;
        if (!pjVar.f40861e && (view = pjVar.f40858a) != null) {
            view.callOnClick();
            pjVar.f40861e = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q(float f7) {
        ((w10) this.f37775b).f43099i0.e(f7);
    }

    @Override
    public void q0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((g60) this.f37775b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public boolean r2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void s0(int i10, int i11, boolean z10) {
        sg.o oVar;
        switch (this.f37774a) {
            case 18:
                sg.o oVar2 = ((i20) this.f37775b).f38507c.f48086c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((i20) this.f37775b).f38507c.f48086c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean t0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override
    public void u0(float f7) {
        switch (this.f37774a) {
            case 6:
            case 11:
                return;
            default:
                mv mvVar = (mv) this.f37775b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || mvVar.f40039f[1].getVisibility() == 0) {
                    if (mvVar.f40041r) {
                        lv lvVar = mvVar.f40039f[0];
                        lvVar.setTranslationX((-f7) * lvVar.getMeasuredWidth());
                        lv[] lvVarArr = mvVar.f40039f;
                        lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth() - (f7 * mvVar.f40039f[0].getMeasuredWidth()));
                    } else {
                        lv lvVar2 = mvVar.f40039f[0];
                        lvVar2.setTranslationX(lvVar2.getMeasuredWidth() * f7);
                        lv[] lvVarArr2 = mvVar.f40039f;
                        lvVarArr2[1].setTranslationX((f7 * lvVarArr2[0].getMeasuredWidth()) - mvVar.f40039f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        lv[] lvVarArr3 = mvVar.f40039f;
                        lv lvVar3 = lvVarArr3[0];
                        lvVarArr3[0] = lvVarArr3[1];
                        lvVarArr3[1] = lvVar3;
                        lvVar3.setVisibility(8);
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
        m3 m3Var = ((i4) this.f37775b).f38559u0[0];
        if (m3Var != null) {
            m3Var.f39796b.I0(true);
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21129v3;
    }

    @Override
    public int x0(int i10) {
        aq0 aq0Var = (aq0) this.f37775b;
        int indexOfKey = aq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return aq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = aq0Var.f36041s;
        if (e6Var != null) {
            return e6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    @Override
    public void y() {
        int i10 = this.f37774a;
    }

    @Override
    public void y0(r6 r6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = ((w6) this.f37775b).f43138e;
        if (r6Var != null) {
            if (y6Var.Y.f54751j.size() <= 0 && !z10) {
                if (y6Var.H > 0 && y6Var.getParentActivity() != null) {
                    r6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = r6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((s6) sparseArray.get(0)).f41632b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((s6) sparseArray.get(1)).f41632b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f54747e;
                    if (obj2 != null) {
                        arrayList2.addAll(((s6) sparseArray.get(2)).f41632b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f54748f;
                    if (obj3 != null) {
                        arrayList3.addAll(((s6) sparseArray.get(3)).f41632b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f54749g;
                    if (obj4 != null) {
                        arrayList4.addAll(((s6) sparseArray.get(4)).f41632b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f54751j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f54759r += ((zh.a) arrayList.get(i10)).f54740c;
                        } else {
                            bVar.f54760s += ((zh.a) arrayList.get(i10)).f54740c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f54761t += ((zh.a) arrayList2.get(i11)).f54740c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f54762u += ((zh.a) arrayList3.get(i12)).f54740c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f54740c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f54754m = z11;
                    bVar.f54755n = z11;
                    bVar.f54756o = z11;
                    bVar.f54757p = z11;
                    bVar.f54758q = z11;
                    Collections.sort(arrayList, new mb1(28));
                    Collections.sort(arrayList2, new mb1(28));
                    Collections.sort(arrayList3, new mb1(28));
                    Collections.sort(arrayList4, new mb1(28));
                    Collections.sort(bVar.h, new mb1(28));
                    iv ivVar = new iv(y6Var, r6Var, bVar, new n6.t(y6Var, r6Var, false, 3));
                    y6Var.T = ivVar;
                    y6Var.showDialog(ivVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = y6Var.Y;
            HashSet hashSet2 = bVar2.f54751j;
            HashSet hashSet3 = bVar2.f54753l;
            long j3 = r6Var.f41325a;
            SparseArray sparseArray2 = r6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((s6) sparseArray2.valueAt(i14)).f41632b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f54752k += aVar2.f54740c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((s6) sparseArray2.valueAt(i16)).f41632b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f54752k -= aVar3.f54740c;
                        }
                    }
                }
            }
            bVar2.c();
            y6Var.N.d();
            y6.g0(y6Var);
        } else if (aVar != null) {
            y6Var.Y.i(aVar);
            y6Var.N.d();
            y6.g0(y6Var);
        }
    }

    @Override
    public void z() {
        switch (this.f37774a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f37775b).f38573b.N();
                return;
        }
    }

    @Override
    public String z0() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        vb vbVar = (vb) this.f37775b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (vbVar.f42832p0.contains(Long.valueOf(j3))) {
                    vbVar.f42832p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    vbVar.f42832p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                vbVar.W0(true);
                vbVar.R0();
                vbVar.E.l();
                return;
            }
        }
        vbVar.P0(view, f7, f10);
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
    public void C2() {
    }

    @Override
    public void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F0() {
    }

    @Override
    public void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void J1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.u1 u1Var) {
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
    public void P() {
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
    public void U(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void X1() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void d1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void h1() {
    }

    @Override
    public void k2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void m0(org.telegram.ui.Cells.u1 u1Var) {
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
    public void v(vk0 vk0Var) {
    }

    @Override
    public void w2() {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void I0(int i10, int i11) {
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
    public void V(boolean z10, boolean z11) {
    }

    @Override
    public void V0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
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

    private final void B1(View view, float f7, float f10) {
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
    public void A1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void D2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void b1(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void h2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void D1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
