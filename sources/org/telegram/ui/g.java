package org.telegram.ui;

import android.content.SharedPreferences;
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
public final class g implements x9, tu0, org.telegram.ui.web.a1, org.telegram.ui.Components.bp0, org.telegram.ui.Components.e5, org.telegram.ui.Components.jn0, l7, ci.v9, org.telegram.ui.Components.xl0, org.telegram.ui.Cells.l1, dc1, gm, oe.a, org.telegram.ui.Components.zl0, org.telegram.ui.Cells.q7, org.telegram.ui.Components.vq, org.telegram.ui.Components.sq0, s4.d0, org.telegram.ui.Components.o8, org.telegram.ui.Components.r20, r0.n, pt, a11 {
    public final int f36996a;
    public final Object f36997b;

    public g(Object obj, int i10) {
        this.f36996a = i10;
        this.f36997b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ni0 ni0Var = (ni0) this.f36997b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ni0Var.e = defaultWindowInsets;
        ni0Var.G.setPadding(defaultWindowInsets.f12284a, defaultWindowInsets.f12285b, defaultWindowInsets.f12286c, defaultWindowInsets.d);
        ni0Var.F.requestLayout();
        return r0.k1.f44826b;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 19), 50L);
    }

    @Override
    public void E(String str) {
        h hVar = (h) this.f36997b;
        hVar.finishFragment(false);
        zu zuVar = hVar.f37367x;
        LaunchActivity launchActivity = (LaunchActivity) zuVar.f43789c;
        Pattern pattern = LaunchActivity.C1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f20661g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new z40(4, b2Var, (h) zuVar.f43788b));
    }

    @Override
    public void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public void H0(int i10, int i11) {
        u60 u60Var = (u60) this.f36997b;
        u60Var.W = i10;
        AndroidUtilities.updateVisibleRows(u60Var.f41865b);
    }

    @Override
    public CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public boolean I0() {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void L(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f36996a) {
            case 3:
                g4 g4Var = (g4) this.f36997b;
                int round = Math.round(((g4Var.f37062c - i10) * f7) + g4Var.f37061b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    g4Var.f37063f.f38725u0[0].getAdapter().f38035y.clear();
                    l4 l4Var = g4Var.f37063f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        l4Var.f38725u0[i11].f39647c.l();
                        j4 j4Var = l4Var.f38725u0[i11].f39647c;
                        ArrayList arrayList = j4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(j4Var.K);
                        Utilities.globalQueue.postRunnable(j4Var.K, 100L);
                    }
                    g4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                qb0 qb0Var = (qb0) this.f36997b;
                sb0 sb0Var = qb0Var.f40329y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    sb0Var.Y();
                    ArrayList arrayList2 = sb0Var.f41044s;
                    if (arrayList2.isEmpty()) {
                        sb0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new mb0(2, 0, formatString, 0, 0));
                        sb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            qb0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                n5.d = f7;
                org.telegram.ui.Components.jw0 jw0Var = ((n5) this.f36997b).f39296b;
                jw0Var.M();
                jw0Var.N();
                return;
        }
    }

    @Override
    public void L0(kt ktVar) {
        oj0 oj0Var = (oj0) this.f36997b;
        oj0Var.E = true;
        String str = ktVar.f38626c;
        oj0Var.O.setText(str);
        oj0Var.w(str, ktVar);
        oj0Var.E = false;
        AndroidUtilities.runOnUIThread(new fz(this, 29), 300L);
        oj0Var.Q.requestFocus();
        lj0 lj0Var = oj0Var.Q;
        lj0Var.setSelection(lj0Var.length());
    }

    @Override
    public boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void N0() {
        ij ijVar = (ij) this.f36997b;
        View view = ijVar.f37899a;
        if (view != null) {
            view.setPressed(false);
            ijVar.f37899a.setSelected(false);
        }
        View view2 = ijVar.f37903n;
        if (view2 != null && !ijVar.d) {
            view2.callOnClick();
            ijVar.d = true;
        }
    }

    @Override
    public void O() {
        ((wj0) this.f36997b).a();
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public xu0 P1() {
        return null;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, ci.w9 w9Var) {
        k8 k8Var = (k8) this.f36997b;
        if (k8Var.f38409b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= k8Var.f38409b.getChildCount()) {
                    break;
                }
                View childAt = k8Var.f38409b.getChildAt(i13);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    if (h8Var.f37434n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < h8Var.f37434n.size(); i14++) {
                            ArrayList arrayList = ((i8) h8Var.f37434n.valueAt(i14)).f37750b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = h8Var.f37434n.keyAt(i14);
                                k8Var.f38418h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h8Var.f37435r.get(keyAt);
                                if (imageReceiver != null) {
                                    w9Var.f6062c = imageReceiver;
                                    if (k8Var.f38419i0 == null) {
                                        k8Var.f38419i0 = new b1(this, 10);
                                    }
                                    w9Var.e = k8Var.f38419i0;
                                    w9Var.f6060a = h8Var;
                                    w9Var.f6064g = k8Var.fragmentView;
                                    w9Var.h = AndroidUtilities.dp(36.0f);
                                    w9Var.f6065i = k8Var.fragmentView.getBottom();
                                    w9Var.f6061b = null;
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
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public TextureView U() {
        return null;
    }

    @Override
    public boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public ih.a W() {
        return null;
    }

    @Override
    public void W0() {
        c7 c7Var = ((a7) this.f36997b).e;
        bi.c cVar = c7Var.Y;
        if (cVar != null && cVar.f4439j.size() > 0) {
            c7Var.Y.d();
            z6 z6Var = c7Var.N;
            if (z6Var != null) {
                z6Var.e(false);
                c7Var.N.d();
            }
        }
    }

    @Override
    public void X(int i10, int i11) {
        ((s4.g0) this.f36997b).s(i10, i11);
    }

    @Override
    public void X0(long j10, int i10, ci.s3 s3Var) {
        k8 k8Var = (k8) this.f36997b;
        if (k8Var.f38409b == null) {
            s3Var.run();
        }
        k8Var.f38409b.post(s3Var);
    }

    @Override
    public int Y() {
        switch (this.f36996a) {
            case 3:
                g4 g4Var = (g4) this.f36997b;
                return g4Var.f37062c - g4Var.f37061b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        dd ddVar = (dd) this.f36997b;
        d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        if (d6Var != null) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            return d6Var2.a();
        }
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public void a1(int i10, int i11) {
        ((s4.g0) this.f36997b).r(i10, i11, null);
    }

    @Override
    public void b0(String str) {
        ((dk) this.f36997b).f36214b.ia(str, false);
    }

    @Override
    public boolean b1(int i10, View view) {
        switch (this.f36996a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void c1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        dd ddVar = (dd) this.f36997b;
        d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        if (d6Var instanceof cd) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            dd ddVar2 = ((cd) d6Var2).f35884a;
            ddVar2.J = !ddVar2.J;
            ddVar2.d1();
            ddVar2.Z0(false);
        }
        ddVar.U0(a(), false);
        ddVar.Z0(false);
    }

    @Override
    public void clear() {
        ((a7) this.f36997b).e.m0();
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        g10 g10Var = (g10) this.f36997b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            g10.a(g10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.m7) {
            g10.a(g10Var, ((org.telegram.ui.Cells.m7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            g10.a(g10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            g10.a(g10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!g10Var.f37034o0.g()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        g10Var.f37028i0.f(r2Var);
                        return true;
                    }
                }
                g10.a(g10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public void dismiss() {
        switch (this.f36996a) {
            case 7:
                return;
            default:
                ((u60) this.f36997b).f41871w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void f(int i10, boolean z10) {
        boolean z11;
        switch (this.f36996a) {
            case 6:
                z5 z5Var = ((t5) this.f36997b).d;
                z5Var.f43553b0 = i10;
                z5Var.H0(true);
                return;
            case 11:
                ec ecVar = ((cc) this.f36997b).f35876f;
                ecVar.f36461y = i10;
                ecVar.d(true);
                return;
            default:
                cv cvVar = (cv) this.f36997b;
                if (cvVar.f35985f[0].f35718f != i10) {
                    if (i10 == cvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cvVar.f35989w = z11;
                    bv bvVar = cvVar.f35985f[1];
                    bvVar.f35718f = i10;
                    bvVar.setVisibility(0);
                    cvVar.m0(true);
                    cvVar.f35987r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f36996a) {
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
    public void g0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((s50) this.f36997b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f36996a) {
            case 3:
                g4 g4Var = (g4) this.f36997b;
                int i10 = g4Var.f37061b;
                return String.valueOf(Math.round((g4Var.f37060a.getProgress() * (g4Var.f37062c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f36996a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((g10) this.f36997b).f37028i0.finish();
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f36996a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        xb xbVar = ((tb) this.f36997b).f41633n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(xbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(xbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void j0(int i10, int i11, boolean z10) {
        tg.o oVar;
        switch (this.f36996a) {
            case 18:
                tg.o oVar2 = ((t10) this.f36997b).f41551c.f47064c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((t10) this.f36997b).f41551c.f47064c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f36996a;
    }

    @Override
    public void k0(float f7) {
        switch (this.f36996a) {
            case 6:
            case 11:
                return;
            default:
                cv cvVar = (cv) this.f36997b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || cvVar.f35985f[1].getVisibility() == 0) {
                    if (cvVar.f35987r) {
                        bv bvVar = cvVar.f35985f[0];
                        bvVar.setTranslationX((-f7) * bvVar.getMeasuredWidth());
                        bv[] bvVarArr = cvVar.f35985f;
                        bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() - (f7 * cvVar.f35985f[0].getMeasuredWidth()));
                    } else {
                        bv bvVar2 = cvVar.f35985f[0];
                        bvVar2.setTranslationX(bvVar2.getMeasuredWidth() * f7);
                        bv[] bvVarArr2 = cvVar.f35985f;
                        bvVarArr2[1].setTranslationX((f7 * bvVarArr2[0].getMeasuredWidth()) - cvVar.f35985f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        bv[] bvVarArr3 = cvVar.f35985f;
                        bv bvVar3 = bvVarArr3[0];
                        bvVarArr3[0] = bvVarArr3[1];
                        bvVarArr3[1] = bvVar3;
                        bvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public void m0(MessageObject messageObject) {
        o3 o3Var = ((l4) this.f36997b).f38725u0[0];
        if (o3Var != null) {
            o3Var.f39646b.I0(true);
        }
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f36996a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f36996a) {
            case 15:
                return ((wx) this.f36997b).E0.isInPreviewMode();
            default:
                qg0 qg0Var = (qg0) this.f36997b;
                View view2 = null;
                qg0Var.O = null;
                int childCount = qg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = qg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !qg0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f36996a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o(float f7) {
        ((g10) this.f36997b).f37028i0.e(f7);
    }

    @Override
    public boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f36996a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((wx) this.f36997b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f36996a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f36996a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f36996a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ij ijVar = (ij) this.f36997b;
        View view = ijVar.f37899a;
        if (view != null) {
            view.setPressed(true);
            ijVar.f37899a.setSelected(true);
            ijVar.f37899a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        ij ijVar = (ij) this.f36997b;
        sn snVar = ijVar.f37906w;
        if (ijVar.f37899a != null) {
            snVar.Q8 = org.telegram.ui.Components.o9.b(snVar, ijVar.v, snVar.T5, snVar.d(), snVar.f41191ea);
            org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
            if (m1Var != null) {
                ijVar.f37900b = m1Var;
                m1Var.setOnDismissListener(new f0(ijVar, 2));
                snVar.f41419x0.B0();
                snVar.f41444z0.R = false;
                View view = ijVar.v;
                snVar.sb(view);
                if (view != snVar.f41243j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                snVar.j8(false, z10, 0.3f);
                snVar.m9(false);
                dl dlVar = snVar.f41447z3;
                if (dlVar != null) {
                    dlVar.e(1, true);
                }
                UndoView undoView = snVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                hk hkVar = snVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f36996a) {
            case 15:
                return;
            default:
                qg0 qg0Var = (qg0) this.f36997b;
                qg0.k(qg0Var, view, f7, f10);
                qg0.m(qg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(qg0Var.H, 450L);
                qg0Var.O = null;
                qg0Var.invalidate();
                qg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f36996a) {
            case 15:
                return;
            default:
                qg0 qg0Var = (qg0) this.f36997b;
                qg0.k(qg0Var, view, f7, f10);
                qg0.m(qg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(qg0Var.H, 450L);
                View view2 = qg0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                qg0Var.O = null;
                qg0Var.invalidate();
                qg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f36996a) {
            case 15:
                return;
            default:
                qg0 qg0Var = (qg0) this.f36997b;
                qg0.k(qg0Var, view, f7, f10);
                qg0.m(qg0Var, f7, false, false);
                qg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f36996a) {
            case 15:
                return false;
            default:
                qg0 qg0Var = (qg0) this.f36997b;
                qg0.k(qg0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(qg0Var.H);
                qg0.l(qg0Var);
                qg0.m(qg0Var, f7, true, false);
                qg0Var.invalidate();
                qg0Var.Q.a(true, true);
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
        ij ijVar = (ij) this.f36997b;
        if (!ijVar.e && (view = ijVar.f37899a) != null) {
            view.callOnClick();
            ijVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public String p0() {
        return null;
    }

    @Override
    public org.telegram.ui.Cells.o9 p2() {
        return null;
    }

    @Override
    public int r0(int i10) {
        switch (this.f36996a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        HashSet hashSet;
        c7 c7Var = ((a7) this.f36997b).e;
        if (v6Var != null) {
            if (c7Var.Y.f4439j.size() <= 0 && !z10) {
                if (c7Var.H > 0 && c7Var.getParentActivity() != null) {
                    v6Var.getClass();
                    boolean z11 = true;
                    bi.c cVar = new bi.c(true);
                    SparseArray sparseArray = v6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((w6) sparseArray.get(0)).f42363b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((w6) sparseArray.get(1)).f42363b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((w6) sparseArray.get(2)).f42363b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f4436f;
                    if (obj3 != null) {
                        arrayList3.addAll(((w6) sparseArray.get(3)).f42363b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f4437g;
                    if (obj4 != null) {
                        arrayList4.addAll(((w6) sparseArray.get(4)).f42363b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f4439j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((bi.b) arrayList.get(i10));
                        if (((bi.b) arrayList.get(i10)).d == 0) {
                            cVar.f4447r += ((bi.b) arrayList.get(i10)).f4430c;
                        } else {
                            cVar.f4448s += ((bi.b) arrayList.get(i10)).f4430c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((bi.b) arrayList2.get(i11));
                        cVar.f4449t += ((bi.b) arrayList2.get(i11)).f4430c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((bi.b) arrayList3.get(i12));
                        cVar.f4450u += ((bi.b) arrayList3.get(i12)).f4430c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((bi.b) arrayList4.get(i13));
                        cVar.v += ((bi.b) arrayList4.get(i13)).f4430c;
                        i13++;
                        z11 = true;
                    }
                    cVar.f4442m = z11;
                    cVar.f4443n = z11;
                    cVar.f4444o = z11;
                    cVar.f4445p = z11;
                    cVar.f4446q = z11;
                    Collections.sort(arrayList, new a4.d(6));
                    Collections.sort(arrayList2, new a4.d(6));
                    Collections.sort(arrayList3, new a4.d(6));
                    Collections.sort(arrayList4, new a4.d(6));
                    Collections.sort(cVar.h, new a4.d(6));
                    xu xuVar = new xu(c7Var, v6Var, cVar, new n2.e(c7Var, v6Var, false, 6));
                    c7Var.T = xuVar;
                    c7Var.showDialog(xuVar);
                    return;
                }
                return;
            }
            bi.c cVar2 = c7Var.Y;
            HashSet hashSet2 = cVar2.f4439j;
            HashSet hashSet3 = cVar2.f4441l;
            long j10 = v6Var.f42108a;
            SparseArray sparseArray2 = v6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((w6) sparseArray2.valueAt(i14)).f42363b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        bi.b bVar2 = (bi.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f4440k += bVar2.f4430c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((w6) sparseArray2.valueAt(i16)).f42363b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        bi.b bVar3 = (bi.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f4440k -= bVar3.f4430c;
                        }
                    }
                }
            }
            cVar2.c();
            c7Var.N.d();
            c7.g0(c7Var);
        } else if (bVar != null) {
            c7Var.Y.i(bVar);
            c7Var.N.d();
            c7.g0(c7Var);
        }
    }

    @Override
    public void t0(int i10, int i11) {
        ((s4.g0) this.f36997b).t(i10, i11);
    }

    @Override
    public void u() {
        int i10 = this.f36996a;
    }

    @Override
    public void v() {
        switch (this.f36996a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((n5) this.f36997b).f39296b.N();
                return;
        }
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void x() {
        int i10 = this.f36996a;
    }

    @Override
    public void y(int i10, int i11) {
        ((s4.g0) this.f36997b).p(i10, i11);
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        xb xbVar = (xb) this.f36997b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (xbVar.f43045p0.contains(Long.valueOf(j10))) {
                    xbVar.f43045p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    xbVar.f43045p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                xbVar.W0(true);
                xbVar.R0();
                xbVar.E.l();
                return;
            }
        }
        xbVar.P0(view, f7, f10);
    }

    private final void C1(float f7) {
    }

    private final void E1() {
    }

    private final void T1() {
    }

    private final void V1() {
    }

    private final void X1() {
    }

    private final void Y1() {
    }

    private final void Z1(boolean z10) {
    }

    private final void a2(boolean z10) {
    }

    private final void e1() {
    }

    private final void g1() {
    }

    private final void i1() {
    }

    private final void y1(float f7) {
    }

    @Override
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void D0(int i10) {
    }

    @Override
    public void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F0(MrzRecognizer.Result result) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H() {
    }

    @Override
    public void I(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L1() {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void Y0() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void m(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n() {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void n2() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void q() {
    }

    @Override
    public void r(gk0 gk0Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void y0() {
    }

    @Override
    public void z(MessageObject messageObject) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }

    @Override
    public void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    private final void j1(View view, float f7, float f10) {
    }

    private final void l1(View view, float f7, float f10) {
    }

    private final void m1(View view, float f7, float f10) {
    }

    private final void n1(View view, float f7, float f10) {
    }

    private final void o1(View view, float f7, float f10) {
    }

    private final void q1(View view, float f7, float f10) {
    }

    private final void r1(View view, float f7, float f10) {
    }

    private final void s1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void u1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
