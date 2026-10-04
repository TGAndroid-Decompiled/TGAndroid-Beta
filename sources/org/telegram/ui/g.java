package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
public final class g implements v9, gv0, org.telegram.ui.web.b1, org.telegram.ui.Components.xo0, org.telegram.ui.Components.d5, org.telegram.ui.Components.dn0, ai.fc, org.telegram.ui.Components.nl0, org.telegram.ui.Cells.l1, id1, org.telegram.ui.Components.xv0, km, me.a, org.telegram.ui.Components.pl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.oq, org.telegram.ui.Components.oq0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.m20, r0.n, yt, o11, org.telegram.ui.ActionBar.d6 {
    public final int f36455a;
    public final Object f36456b;

    public g(Object obj, int i10) {
        this.f36455a = i10;
        this.f36456b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void B() {
        switch (this.f36455a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((j5) this.f36456b).f37586b.N();
                return;
        }
    }

    @Override
    public void C() {
        int i10 = this.f36455a;
    }

    @Override
    public void C0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.f36455a) {
            case 18:
                sg.f fVar2 = ((j20) this.f36456b).f37569c.f46791c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((j20) this.f36456b).f37569c.f46791c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f36456b).p(i10, i11);
    }

    @Override
    public void E(boolean z10) {
        Runnable runnable = ((me) this.f36456b).V1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void E0(float f7) {
        switch (this.f36455a) {
            case 6:
            case 10:
                return;
            default:
                nv nvVar = (nv) this.f36456b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || nvVar.f39055f[1].getVisibility() == 0) {
                    if (nvVar.f39057r) {
                        mv mvVar = nvVar.f39055f[0];
                        mvVar.setTranslationX((-f7) * mvVar.getMeasuredWidth());
                        mv[] mvVarArr = nvVar.f39055f;
                        mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth() - (f7 * nvVar.f39055f[0].getMeasuredWidth()));
                    } else {
                        mv mvVar2 = nvVar.f39055f[0];
                        mvVar2.setTranslationX(mvVar2.getMeasuredWidth() * f7);
                        mv[] mvVarArr2 = nvVar.f39055f;
                        mvVarArr2[1].setTranslationX((f7 * mvVarArr2[0].getMeasuredWidth()) - nvVar.f39055f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        mv[] mvVarArr3 = nvVar.f39055f;
                        mv mvVar3 = mvVarArr3[0];
                        mvVarArr3[0] = mvVarArr3[1];
                        mvVarArr3[1] = mvVar3;
                        mvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void G0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.f36456b).f37280u0[0];
        if (m3Var != null) {
            m3Var.f38399b.J0(true);
        }
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Paint H(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override
    public int H0(int i10) {
        wp0 wp0Var = (wp0) this.f36456b;
        int indexOfKey = wp0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return wp0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = wp0Var.f42590s;
        if (d6Var != null) {
            return d6Var.H0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 16), 50L);
    }

    @Override
    public int K0(int i10) {
        switch (this.f36455a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void L(String str) {
        h hVar = (h) this.f36456b;
        hVar.finishFragment(false);
        pw pwVar = hVar.f36805x;
        LaunchActivity launchActivity = (LaunchActivity) pwVar.f39551b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f20427g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new no(27, b2Var, (h) pwVar.f39552c));
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public void O0(int i10, int i11) {
        ((s4.h0) this.f36456b).t(i10, i11);
    }

    @Override
    public CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        zi0 zi0Var = (zi0) this.f36456b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        zi0Var.f43806e = defaultWindowInsets;
        zi0Var.G.setPadding(defaultWindowInsets.f11526a, defaultWindowInsets.f11527b, defaultWindowInsets.f11528c, defaultWindowInsets.d);
        zi0Var.F.requestLayout();
        return r0.l1.f45616b;
    }

    @Override
    public boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void U0(int i10, int i11) {
        k70 k70Var = (k70) this.f36456b;
        k70Var.W = i10;
        AndroidUtilities.updateVisibleRows(k70Var.f37846b);
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void Y(float f7, boolean z10) {
        String formatString;
        switch (this.f36455a) {
            case 3:
                e4 e4Var = (e4) this.f36456b;
                int i10 = e4Var.f35901b;
                int round = Math.round(((e4Var.f35902c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f35904f.f37280u0[0].getAdapter().f36499y.clear();
                    i4 i4Var = e4Var.f35904f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        i4Var.f37280u0[i11].f38400c.l();
                        g4 g4Var = i4Var.f37280u0[i11].f38400c;
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
                jc0 jc0Var = (jc0) this.f36456b;
                lc0 lc0Var = jc0Var.f37649y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    lc0Var.X();
                    ArrayList arrayList2 = lc0Var.f38241s;
                    if (arrayList2.isEmpty()) {
                        lc0Var.W();
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
                j5.d = f7;
                org.telegram.ui.Components.lw0 lw0Var = ((j5) this.f36456b).f37586b;
                lw0Var.M();
                lw0Var.N();
                return;
        }
    }

    @Override
    public float Y0() {
        return org.telegram.messenger.q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((me) this.f36456b).X1, 0);
    }

    @Override
    public kv0 Y1() {
        return null;
    }

    @Override
    public hh.a Z() {
        return null;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f36455a) {
            case 11:
                cd cdVar = (cd) this.f36456b;
                d6Var = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
                    return d6Var2.a();
                }
                return org.telegram.ui.ActionBar.i6.I.q();
            default:
                return ((wp0) this.f36456b).S;
        }
    }

    @Override
    public void a0(long j3, int i10, ai.d5 d5Var) {
        k8 k8Var = (k8) this.f36456b;
        if (k8Var.f37860b == null) {
            d5Var.run();
        }
        k8Var.f37860b.post(d5Var);
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public void b(int i10, boolean z10) {
        boolean z11;
        switch (this.f36455a) {
            case 6:
                w5 w5Var = ((p5) this.f36456b).d;
                w5Var.f41911b0 = i10;
                w5Var.L0(true);
                return;
            case 10:
                dc dcVar = ((bc) this.f36456b).f35062f;
                dcVar.f35739y = i10;
                dcVar.d(true);
                return;
            default:
                nv nvVar = (nv) this.f36456b;
                if (nvVar.f39055f[0].f38770f != i10) {
                    if (i10 == nvVar.f39054e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    nvVar.f39059w = z11;
                    mv mvVar = nvVar.f39055f[1];
                    mvVar.f38770f = i10;
                    mvVar.setVisibility(0);
                    nvVar.m0(true);
                    nvVar.f39057r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public void b1(ut utVar) {
        ak0 ak0Var = (ak0) this.f36456b;
        ak0Var.E = true;
        String str = utVar.f41307c;
        ak0Var.O.setText(str);
        ak0Var.u(str, utVar);
        ak0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        ak0Var.Q.requestFocus();
        yj0 yj0Var = ak0Var.Q;
        yj0Var.setSelection(yj0Var.length());
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.f36456b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            x10.a(x10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!x10Var.f42707o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.Q(f7)) {
                        x10Var.f42701i0.f(s2Var);
                        return true;
                    }
                }
                x10.a(x10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void d(boolean z10) {
        int i10 = this.f36455a;
    }

    @Override
    public void d0() {
        ((ik0) this.f36456b).a();
    }

    @Override
    public void d1() {
        mj mjVar = (mj) this.f36456b;
        View view = mjVar.f38657a;
        if (view != null) {
            view.setPressed(false);
            mjVar.f38657a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && mjVar.f38657a.getBackground() != null) {
                mjVar.f38657a.getBackground().setVisible(false, false);
            }
        }
        View view2 = mjVar.f38662n;
        if (view2 != null && !mjVar.d) {
            view2.callOnClick();
            mjVar.d = true;
        }
    }

    @Override
    public void dismiss() {
        ((k70) this.f36456b).f37853w.d(true);
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public int e1() {
        me meVar = (me) this.f36456b;
        return meVar.Y1 + meVar.Z1;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f36455a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f36455a) {
            case 3:
                e4 e4Var = (e4) this.f36456b;
                int i10 = e4Var.f35901b;
                return String.valueOf(Math.round((e4Var.f35900a.getProgress() * (e4Var.f35902c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        wp0 wp0Var = (wp0) this.f36456b;
        if (str.equals("drawableMsgIn")) {
            return wp0Var.f42591w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return wp0Var.f42592x;
        }
        org.telegram.ui.ActionBar.d6 d6Var = wp0Var.f42590s;
        if (d6Var != null) {
            return d6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f36455a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public void i() {
        ((x10) this.f36456b).f42701i0.finish();
    }

    @Override
    public boolean i1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        k8 k8Var = (k8) this.f36456b;
        if (k8Var.f37860b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= k8Var.f37860b.getChildCount()) {
                    break;
                }
                View childAt = k8Var.f37860b.getChildAt(i13);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    if (h8Var.f36999n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < h8Var.f36999n.size(); i14++) {
                            ArrayList arrayList = ((i8) h8Var.f36999n.valueAt(i14)).f37303b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = h8Var.f36999n.keyAt(i14);
                                k8Var.f37870h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h8Var.f37000r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.f991c = imageReceiver;
                                    if (k8Var.f37871i0 == null) {
                                        k8Var.f37871i0 = new z0(this, 11);
                                    }
                                    gcVar.f992e = k8Var.f37871i0;
                                    gcVar.f989a = h8Var;
                                    gcVar.f994g = k8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.f995i = k8Var.fragmentView.getBottom();
                                    gcVar.f990b = null;
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
        switch (this.f36455a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int j0(int i10) {
        return H0(i10);
    }

    @Override
    public int j1(int i10) {
        return H0(i10);
    }

    @Override
    public TextureView k0() {
        return null;
    }

    @Override
    public void l() {
        wb wbVar = ((sb) this.f36456b).f40447n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public void m0(int i10, int i11) {
        ((s4.h0) this.f36456b).s(i10, i11);
    }

    @Override
    public void n1(int i10, int i11) {
        ((s4.h0) this.f36456b).r(i10, i11, null);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f36455a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f36455a) {
            case 15:
                return ((ny) this.f36456b).E0.isInPreviewMode();
            default:
                eh0 eh0Var = (eh0) this.f36456b;
                View view2 = null;
                eh0Var.O = null;
                int childCount = eh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = eh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !eh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f36455a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override
    public boolean o1(int i10, View view) {
        switch (this.f36455a) {
            case 6:
                return false;
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        switch (this.f36455a) {
            case 15:
                c5Var = ((org.telegram.ui.ActionBar.n2) ((ny) this.f36456b).E0).parentLayout;
                ((ActionBarLayout) c5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f36455a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f36455a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f36455a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        mj mjVar = (mj) this.f36456b;
        View view = mjVar.f38657a;
        if (view != null) {
            view.setPressed(true);
            mjVar.f38657a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && mjVar.f38657a.getBackground() != null) {
                mjVar.f38657a.getBackground().setVisible(true, false);
            }
            mjVar.f38657a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        mj mjVar = (mj) this.f36456b;
        yn ynVar = mjVar.f38665w;
        if (mjVar.f38657a != null) {
            ynVar.O8 = org.telegram.ui.Components.o9.b(ynVar, mjVar.v, ynVar.R5, ynVar.d(), ynVar.f43307ca);
            org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
            if (n1Var != null) {
                mjVar.f38658b = n1Var;
                n1Var.setOnDismissListener(new f0(mjVar, 2));
                ynVar.f43533v0.C0();
                ynVar.f43559x0.R = false;
                View view = mjVar.v;
                ynVar.nb(view);
                if (view != ynVar.f43360h1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ynVar.g8(false, z10, 0.3f);
                ynVar.i9(false);
                fl flVar = ynVar.f43562x3;
                if (flVar != null) {
                    flVar.e(1, true);
                }
                UndoView undoView = ynVar.f43549w3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                jk jkVar = ynVar.W;
                if (jkVar != null && jkVar.getEditField() != null) {
                    ynVar.W.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f36455a) {
            case 15:
                return;
            default:
                eh0 eh0Var = (eh0) this.f36456b;
                eh0.k(eh0Var, view, f7, f10);
                eh0.m(eh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(eh0Var.H, 450L);
                eh0Var.O = null;
                eh0Var.invalidate();
                eh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f36455a) {
            case 15:
                return;
            default:
                eh0 eh0Var = (eh0) this.f36456b;
                eh0.k(eh0Var, view, f7, f10);
                eh0.m(eh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(eh0Var.H, 450L);
                View view2 = eh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                eh0Var.O = null;
                eh0Var.invalidate();
                eh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f36455a) {
            case 15:
                return;
            default:
                eh0 eh0Var = (eh0) this.f36456b;
                eh0.k(eh0Var, view, f7, f10);
                eh0.m(eh0Var, f7, false, false);
                eh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f36455a) {
            case 15:
                return false;
            default:
                eh0 eh0Var = (eh0) this.f36456b;
                eh0.k(eh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(eh0Var.H);
                eh0.l(eh0Var);
                eh0.m(eh0Var, f7, true, false);
                eh0Var.invalidate();
                eh0Var.Q.a(true, true);
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
        mj mjVar = (mj) this.f36456b;
        if (!mjVar.f38660e && (view = mjVar.f38657a) != null) {
            view.callOnClick();
            mjVar.f38660e = true;
            return true;
        }
        return false;
    }

    @Override
    public int p0() {
        switch (this.f36455a) {
            case 3:
                e4 e4Var = (e4) this.f36456b;
                return e4Var.f35902c - e4Var.f35901b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void q(float f7) {
        ((x10) this.f36456b).f42701i0.e(f7);
    }

    @Override
    public void q1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        cd cdVar = (cd) this.f36456b;
        d6Var = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
        if (d6Var instanceof bd) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) d6Var2).f35065a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public void u0(String str) {
        ((gk) this.f36456b).f36669b.ca(str, false);
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21154v3;
    }

    @Override
    public void x0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((h60) this.f36456b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void y() {
        int i10 = this.f36455a;
    }

    @Override
    public org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.f36456b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (wbVar.f42041p0.contains(Long.valueOf(j3))) {
                    wbVar.f42041p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.f42041p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.W0(true);
                wbVar.R0();
                wbVar.E.l();
                return;
            }
        }
        wbVar.P0(view, f7, f10);
    }

    private final void L1(float f7) {
    }

    private final void S1(float f7) {
    }

    private final void W1() {
    }

    private final void X1() {
    }

    private final void Z1() {
    }

    private final void d2() {
    }

    private final void f2() {
    }

    private final void h2(boolean z10) {
    }

    private final void i2(boolean z10) {
    }

    private final void r1() {
    }

    private final void s1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void I(MessageObject messageObject) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void J(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void R1() {
    }

    @Override
    public void S0(int i10) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void U(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void V() {
    }

    @Override
    public void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void f(boolean z10) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n0(String str) {
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
    public void q2() {
    }

    @Override
    public void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void v(rk0 rk0Var) {
    }

    @Override
    public void x2() {
    }

    @Override
    public void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void z0() {
    }

    @Override
    public void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public void F(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void N(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void X(boolean z10, boolean z11) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override
    public void j(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    private final void B1(View view, float f7, float f10) {
    }

    private final void E1(View view, float f7, float f10) {
    }

    private final void F1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final void v1(View view, float f7, float f10) {
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
    public void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void k(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
