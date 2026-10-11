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
public final class g implements t9, lv0, org.telegram.ui.web.a1, org.telegram.ui.Components.lp0, org.telegram.ui.Components.f5, org.telegram.ui.Components.tn0, g7, ai.gc, org.telegram.ui.Components.hm0, org.telegram.ui.Cells.l1, nd1, nm, ne.a, org.telegram.ui.Components.jm0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.br, org.telegram.ui.Components.dr0, s4.f0, org.telegram.ui.Components.p8, org.telegram.ui.Components.a30, r0.n, xt, t11, org.telegram.ui.ActionBar.d6 {
    public final int f37815a;
    public final Object f37816b;

    public g(Object obj, int i10) {
        this.f37815a = i10;
        this.f37816b = obj;
    }

    @Override
    public boolean A2(int i10) {
        return false;
    }

    @Override
    public int B0(int i10) {
        switch (this.f37815a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void C() {
        int i10 = this.f37815a;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.i0) this.f37816b).p(i10, i11);
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
        return org.telegram.ui.ActionBar.h6.T0(str);
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
        h hVar = (h) this.f37816b;
        hVar.finishFragment(false);
        nw nwVar = hVar.f38193x;
        LaunchActivity launchActivity = (LaunchActivity) nwVar.f40362b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(launchActivity, 3, null);
        a2Var.f20390g0 = false;
        a2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new oo(27, a2Var, (h) nwVar.f40363c));
    }

    @Override
    public void K0(int i10, int i11) {
        ((s4.i0) this.f37816b).t(i10, i11);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        cj0 cj0Var = (cj0) this.f37816b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        cj0Var.f36730e = defaultWindowInsets;
        cj0Var.G.setPadding(defaultWindowInsets.f11575a, defaultWindowInsets.f11576b, defaultWindowInsets.f11577c, defaultWindowInsets.d);
        cj0Var.F.requestLayout();
        return r0.k1.f46866b;
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
        j70 j70Var = (j70) this.f37816b;
        j70Var.W = i10;
        AndroidUtilities.updateVisibleRows(j70Var.f38863b);
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
    public void U0(tt ttVar) {
        ck0 ck0Var = (ck0) this.f37816b;
        ck0Var.E = true;
        String str = ttVar.f42261c;
        ck0Var.O.setText(str);
        ck0Var.w(str, ttVar);
        ck0Var.E = false;
        AndroidUtilities.runOnUIThread(new tz(this, 29), 300L);
        ck0Var.Q.requestFocus();
        ak0 ak0Var = ck0Var.Q;
        ak0Var.setSelection(ak0Var.length());
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
        pj pjVar = (pj) this.f37816b;
        View view = pjVar.f40882a;
        if (view != null) {
            view.setPressed(false);
            pjVar.f40882a.setSelected(false);
        }
        View view2 = pjVar.f40887n;
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
        switch (this.f37815a) {
            case 3:
                d4 d4Var = (d4) this.f37816b;
                int round = Math.round(((d4Var.f36895c - i10) * f7) + d4Var.f36894b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    d4Var.f36897f.f38285u0[0].getAdapter().f37535y.clear();
                    h4 h4Var = d4Var.f36897f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        h4Var.f38285u0[i11].f39497c.l();
                        f4 f4Var = h4Var.f38285u0[i11].f39497c;
                        ArrayList arrayList = f4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(f4Var.K);
                        Utilities.globalQueue.postRunnable(f4Var.K, 100L);
                    }
                    d4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                jc0 jc0Var = (jc0) this.f37816b;
                lc0 lc0Var = jc0Var.f38983y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    lc0Var.Y();
                    ArrayList arrayList2 = lc0Var.f39589s;
                    if (arrayList2.isEmpty()) {
                        lc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new fc0(2, 0, formatString, 0, 0));
                        lc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            jc0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                h5.d = f7;
                org.telegram.ui.Components.uw0 uw0Var = ((h5) this.f37816b).f38296b;
                uw0Var.M();
                uw0Var.N();
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
        f8 f8Var = (f8) this.f37816b;
        if (f8Var.f37577b == null) {
            e5Var.run();
        }
        f8Var.f37577b.post(e5Var);
    }

    @Override
    public boolean Z0(String str, j9 j9Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f37815a) {
            case 12:
                ad adVar = (ad) this.f37816b;
                d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
                    return d6Var2.a();
                }
                return org.telegram.ui.ActionBar.h6.I.q();
            default:
                return ((zp0) this.f37816b).S;
        }
    }

    @Override
    public void a0() {
        ((kk0) this.f37816b).a();
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
        v10 v10Var = (v10) this.f37816b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            v10.a(v10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            v10.a(v10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            v10.a(v10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            v10.a(v10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!v10Var.f42847o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.S(f7)) {
                        v10Var.f42841i0.f(s2Var);
                        return true;
                    }
                }
                v10.a(v10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
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
        ((v6) this.f37816b).f42879e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f37815a) {
            case 6:
                u5 u5Var = ((n5) this.f37816b).d;
                u5Var.f42354b0 = i10;
                u5Var.H0(true);
                return;
            case 11:
                bc bcVar = ((zb) this.f37816b).f44630f;
                bcVar.f36341y = i10;
                bcVar.d(true);
                return;
            default:
                lv lvVar = (lv) this.f37816b;
                if (lvVar.f39737f[0].f39426f != i10) {
                    if (i10 == lvVar.f39736e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    lvVar.f39741w = z11;
                    kv kvVar = lvVar.f39737f[1];
                    kvVar.f39426f = i10;
                    kvVar.setVisibility(0);
                    lvVar.m0(true);
                    lvVar.f39739r = z10;
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
        switch (this.f37815a) {
            case 7:
                return;
            default:
                ((j70) this.f37816b).f38870w.d(true);
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
        f8 f8Var = (f8) this.f37816b;
        if (f8Var.f37577b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= f8Var.f37577b.getChildCount()) {
                    break;
                }
                View childAt = f8Var.f37577b.getChildAt(i13);
                if (childAt instanceof c8) {
                    c8 c8Var = (c8) childAt;
                    if (c8Var.f36622n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < c8Var.f36622n.size(); i14++) {
                            ArrayList arrayList = ((d8) c8Var.f36622n.valueAt(i14)).f36936b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = c8Var.f36622n.keyAt(i14);
                                f8Var.f37587h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) c8Var.f36623r.get(keyAt);
                                if (imageReceiver != null) {
                                    hcVar.f1107c = imageReceiver;
                                    if (f8Var.f37588i0 == null) {
                                        f8Var.f37588i0 = new y0(this, 10);
                                    }
                                    hcVar.f1108e = f8Var.f37588i0;
                                    hcVar.f1105a = c8Var;
                                    hcVar.f1110g = f8Var.fragmentView;
                                    hcVar.h = AndroidUtilities.dp(36.0f);
                                    hcVar.f1111i = f8Var.fragmentView.getBottom();
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
    public pv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void f0(int i10, int i11) {
        ((s4.i0) this.f37816b).s(i10, i11);
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f37815a) {
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
        x6 x6Var = ((v6) this.f37816b).f42879e;
        zh.b bVar = x6Var.Y;
        if (bVar != null && bVar.f54794j.size() > 0) {
            x6Var.Y.d();
            u6 u6Var = x6Var.N;
            if (u6Var != null) {
                u6Var.e(false);
                x6Var.N.d();
            }
        }
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37815a) {
            case 3:
                d4 d4Var = (d4) this.f37816b;
                int i10 = d4Var.f36894b;
                return String.valueOf(Math.round((d4Var.f36893a.getProgress() * (d4Var.f36895c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        zp0 zp0Var = (zp0) this.f37816b;
        if (str.equals("drawableMsgIn")) {
            return zp0Var.f45055w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return zp0Var.f45056x;
        }
        org.telegram.ui.ActionBar.d6 d6Var = zp0Var.f45054s;
        if (d6Var != null) {
            return d6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f37815a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((v10) this.f37816b).f42841i0.finish();
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public int i0() {
        switch (this.f37815a) {
            case 3:
                d4 d4Var = (d4) this.f37816b;
                return d4Var.f36895c - d4Var.f36894b;
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
        switch (this.f37815a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j1(int i10, int i11) {
        ((s4.i0) this.f37816b).r(i10, i11, null);
    }

    @Override
    public void k() {
        ub ubVar = ((qb) this.f37816b).f41128n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            of.f.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public boolean k1(int i10, View view) {
        switch (this.f37815a) {
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
        int i10 = this.f37815a;
    }

    @Override
    public int l0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        ad adVar = (ad) this.f37816b;
        d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
        if (d6Var instanceof zc) {
            d6Var2 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            ad adVar2 = ((zc) d6Var2).f44637a;
            adVar2.J = !adVar2.J;
            adVar2.d1();
            adVar2.Z0(false);
        }
        adVar.U0(a(), false);
        adVar.Z0(false);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f37815a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f37815a) {
            case 15:
                return ((ly) this.f37816b).E0.isInPreviewMode();
            default:
                gh0 gh0Var = (gh0) this.f37816b;
                View view2 = null;
                gh0Var.O = null;
                int childCount = gh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = gh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !gh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f37815a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o0(String str) {
        ((kk) this.f37816b).f39368b.ia(str, false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f37815a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.m2) ((ly) this.f37816b).E0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f37815a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f37815a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f37815a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        pj pjVar = (pj) this.f37816b;
        View view = pjVar.f40882a;
        if (view != null) {
            view.setPressed(true);
            pjVar.f40882a.setSelected(true);
            pjVar.f40882a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        pj pjVar = (pj) this.f37816b;
        zn znVar = pjVar.f40890w;
        if (pjVar.f40882a != null) {
            znVar.Q8 = org.telegram.ui.Components.q9.b(znVar, pjVar.v, znVar.T5, znVar.d(), znVar.f44762ea);
            org.telegram.ui.ActionBar.m1 m1Var = znVar.Q8;
            if (m1Var != null) {
                pjVar.f40883b = m1Var;
                m1Var.setOnDismissListener(new e0(pjVar, 2));
                znVar.f44989x0.B0();
                znVar.f45013z0.R = false;
                View view = pjVar.v;
                znVar.sb(view);
                if (view != znVar.f44814j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                znVar.j8(false, z10, 0.3f);
                znVar.m9(false);
                kl klVar = znVar.f45016z3;
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
        switch (this.f37815a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f37816b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(gh0Var.H, 450L);
                gh0Var.O = null;
                gh0Var.invalidate();
                gh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f37815a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f37816b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(gh0Var.H, 450L);
                View view2 = gh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                gh0Var.O = null;
                gh0Var.invalidate();
                gh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f37815a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f37816b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, false);
                gh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f37815a) {
            case 15:
                return false;
            default:
                gh0 gh0Var = (gh0) this.f37816b;
                gh0.k(gh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(gh0Var.H);
                gh0.l(gh0Var);
                gh0.m(gh0Var, f7, true, false);
                gh0Var.invalidate();
                gh0Var.Q.a(true, true);
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
        pj pjVar = (pj) this.f37816b;
        if (!pjVar.f40885e && (view = pjVar.f40882a) != null) {
            view.callOnClick();
            pjVar.f40885e = true;
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
        ((v10) this.f37816b).f42841i0.e(f7);
    }

    @Override
    public void q0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((g60) this.f37816b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public boolean r2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void s0(int i10, int i11, boolean z10) {
        sg.o oVar;
        switch (this.f37815a) {
            case 18:
                sg.o oVar2 = ((h20) this.f37816b).f38233c.f48132c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((h20) this.f37816b).f38233c.f48132c) != null) {
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
        switch (this.f37815a) {
            case 6:
            case 11:
                return;
            default:
                lv lvVar = (lv) this.f37816b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || lvVar.f39737f[1].getVisibility() == 0) {
                    if (lvVar.f39739r) {
                        kv kvVar = lvVar.f39737f[0];
                        kvVar.setTranslationX((-f7) * kvVar.getMeasuredWidth());
                        kv[] kvVarArr = lvVar.f39737f;
                        kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() - (f7 * lvVar.f39737f[0].getMeasuredWidth()));
                    } else {
                        kv kvVar2 = lvVar.f39737f[0];
                        kvVar2.setTranslationX(kvVar2.getMeasuredWidth() * f7);
                        kv[] kvVarArr2 = lvVar.f39737f;
                        kvVarArr2[1].setTranslationX((f7 * kvVarArr2[0].getMeasuredWidth()) - lvVar.f39737f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        kv[] kvVarArr3 = lvVar.f39737f;
                        kv kvVar3 = kvVarArr3[0];
                        kvVarArr3[0] = kvVarArr3[1];
                        kvVarArr3[1] = kvVar3;
                        kvVar3.setVisibility(8);
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
        l3 l3Var = ((h4) this.f37816b).f38285u0[0];
        if (l3Var != null) {
            l3Var.f39496b.I0(true);
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f21115v3;
    }

    @Override
    public int x0(int i10) {
        zp0 zp0Var = (zp0) this.f37816b;
        int indexOfKey = zp0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return zp0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = zp0Var.f45054s;
        if (d6Var != null) {
            return d6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public void y() {
        int i10 = this.f37815a;
    }

    @Override
    public void y0(q6 q6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        x6 x6Var = ((v6) this.f37816b).f42879e;
        if (q6Var != null) {
            if (x6Var.Y.f54794j.size() <= 0 && !z10) {
                if (x6Var.H > 0 && x6Var.getParentActivity() != null) {
                    q6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = q6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((r6) sparseArray.get(0)).f41337b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((r6) sparseArray.get(1)).f41337b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f54790e;
                    if (obj2 != null) {
                        arrayList2.addAll(((r6) sparseArray.get(2)).f41337b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f54791f;
                    if (obj3 != null) {
                        arrayList3.addAll(((r6) sparseArray.get(3)).f41337b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f54792g;
                    if (obj4 != null) {
                        arrayList4.addAll(((r6) sparseArray.get(4)).f41337b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f54794j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f54802r += ((zh.a) arrayList.get(i10)).f54783c;
                        } else {
                            bVar.f54803s += ((zh.a) arrayList.get(i10)).f54783c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f54804t += ((zh.a) arrayList2.get(i11)).f54783c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f54805u += ((zh.a) arrayList3.get(i12)).f54783c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f54783c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f54797m = z11;
                    bVar.f54798n = z11;
                    bVar.f54799o = z11;
                    bVar.f54800p = z11;
                    bVar.f54801q = z11;
                    Collections.sort(arrayList, new lb1(28));
                    Collections.sort(arrayList2, new lb1(28));
                    Collections.sort(arrayList3, new lb1(28));
                    Collections.sort(arrayList4, new lb1(28));
                    Collections.sort(bVar.h, new lb1(28));
                    hv hvVar = new hv(x6Var, q6Var, bVar, new n6.k(x6Var, q6Var, false, 4));
                    x6Var.T = hvVar;
                    x6Var.showDialog(hvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = x6Var.Y;
            HashSet hashSet2 = bVar2.f54794j;
            HashSet hashSet3 = bVar2.f54796l;
            long j3 = q6Var.f41046a;
            SparseArray sparseArray2 = q6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((r6) sparseArray2.valueAt(i14)).f41337b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f54795k += aVar2.f54783c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((r6) sparseArray2.valueAt(i16)).f41337b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f54795k -= aVar3.f54783c;
                        }
                    }
                }
            }
            bVar2.c();
            x6Var.N.d();
            x6.g0(x6Var);
        } else if (aVar != null) {
            x6Var.Y.i(aVar);
            x6Var.N.d();
            x6.g0(x6Var);
        }
    }

    @Override
    public void z() {
        switch (this.f37815a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((h5) this.f37816b).f38296b.N();
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
        ub ubVar = (ub) this.f37816b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ubVar.f42488p0.contains(Long.valueOf(j3))) {
                    ubVar.f42488p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.f42488p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.W0(true);
                ubVar.R0();
                ubVar.E.l();
                return;
            }
        }
        ubVar.P0(view, f7, f10);
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
    public void v(uk0 uk0Var) {
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
