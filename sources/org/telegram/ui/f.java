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
public final class f implements v9, uu0, org.telegram.ui.web.a1, org.telegram.ui.Components.gp0, org.telegram.ui.Components.d5, org.telegram.ui.Components.nn0, l7, ci.v9, org.telegram.ui.Components.bm0, org.telegram.ui.Cells.k1, hc1, fm, oe.a, org.telegram.ui.Components.dm0, org.telegram.ui.Cells.q7, org.telegram.ui.Components.vq, org.telegram.ui.Components.xq0, s4.d0, org.telegram.ui.Components.o8, org.telegram.ui.Components.r20, r0.n, qt, c11 {
    public final int f37179a;
    public final Object f37180b;

    public f(Object obj, int i10) {
        this.f37179a = i10;
        this.f37180b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        qi0 qi0Var = (qi0) this.f37180b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        qi0Var.d = defaultWindowInsets;
        qi0Var.F.setPadding(defaultWindowInsets.f12315a, defaultWindowInsets.f12316b, defaultWindowInsets.f12317c, defaultWindowInsets.d);
        qi0Var.E.requestLayout();
        return r0.k1.f45250b;
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
        g gVar = (g) this.f37180b;
        gVar.finishFragment(false);
        ks ksVar = gVar.f37445x;
        LaunchActivity launchActivity = (LaunchActivity) ksVar.f39051b;
        Pattern pattern = LaunchActivity.E1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.f20762i0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new a50(4, c2Var, (g) ksVar.f39052c));
    }

    @Override
    public void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override
    public void H0(int i10, int i11) {
        w60 w60Var = (w60) this.f37180b;
        w60Var.W = i10;
        AndroidUtilities.updateVisibleRows(w60Var.f42936b);
    }

    @Override
    public CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
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
    public boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void L(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f37179a) {
            case 3:
                f4 f4Var = (f4) this.f37180b;
                int round = Math.round(((f4Var.f37201c - i10) * f7) + f4Var.f37200b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    f4Var.f37202f.f38805u0[0].getAdapter().f38067y.clear();
                    k4 k4Var = f4Var.f37202f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        k4Var.f38805u0[i11].f39753c.l();
                        i4 i4Var = k4Var.f38805u0[i11].f39753c;
                        ArrayList arrayList = i4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(i4Var.K);
                        Utilities.globalQueue.postRunnable(i4Var.K, 100L);
                    }
                    f4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                ub0 ub0Var = (ub0) this.f37180b;
                wb0 wb0Var = ub0Var.f42367y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    wb0Var.Y();
                    ArrayList arrayList2 = wb0Var.f42999s;
                    if (arrayList2.isEmpty()) {
                        wb0Var.X();
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
                m5.d = f7;
                org.telegram.ui.Components.ow0 ow0Var = ((m5) this.f37180b).f39376b;
                ow0Var.L();
                ow0Var.M();
                return;
        }
    }

    @Override
    public void L0(lt ltVar) {
        rj0 rj0Var = (rj0) this.f37180b;
        rj0Var.f41171y = true;
        String str = ltVar.f39324c;
        rj0Var.N.setText(str);
        rj0Var.w(str, ltVar);
        rj0Var.f41171y = false;
        AndroidUtilities.runOnUIThread(new oj0(this, 0), 300L);
        rj0Var.P.requestFocus();
        pj0 pj0Var = rj0Var.P;
        pj0Var.setSelection(pj0Var.length());
    }

    @Override
    public boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void N0() {
        gj gjVar = (gj) this.f37180b;
        View view = gjVar.f37614a;
        if (view != null) {
            view.setPressed(false);
            gjVar.f37614a.setSelected(false);
        }
        View view2 = gjVar.f37618n;
        if (view2 != null && !gjVar.d) {
            view2.callOnClick();
            gjVar.d = true;
        }
    }

    @Override
    public void O() {
        ((zj0) this.f37180b).a();
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
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
    public yu0 P1() {
        return null;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, ci.w9 w9Var) {
        k8 k8Var = (k8) this.f37180b;
        if (k8Var.f38848b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= k8Var.f38848b.getChildCount()) {
                    break;
                }
                View childAt = k8Var.f38848b.getChildAt(i13);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    if (h8Var.f37776n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < h8Var.f37776n.size(); i14++) {
                            ArrayList arrayList = ((i8) h8Var.f37776n.valueAt(i14)).f38086b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = h8Var.f37776n.keyAt(i14);
                                k8Var.f38857h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h8Var.f37777r.get(keyAt);
                                if (imageReceiver != null) {
                                    w9Var.f6069c = imageReceiver;
                                    if (k8Var.f38858i0 == null) {
                                        k8Var.f38858i0 = new a1(this, 10);
                                    }
                                    w9Var.e = k8Var.f38858i0;
                                    w9Var.f6067a = h8Var;
                                    w9Var.f6071g = k8Var.fragmentView;
                                    w9Var.h = AndroidUtilities.dp(36.0f);
                                    w9Var.f6072i = k8Var.fragmentView.getBottom();
                                    w9Var.f6068b = null;
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
    public boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
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
        c7 c7Var = ((a7) this.f37180b).e;
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
        ((s4.g0) this.f37180b).s(i10, i11);
    }

    @Override
    public void X0(long j10, int i10, ci.s3 s3Var) {
        k8 k8Var = (k8) this.f37180b;
        if (k8Var.f38848b == null) {
            s3Var.run();
        }
        k8Var.f38848b.post(s3Var);
    }

    @Override
    public int Y() {
        switch (this.f37179a) {
            case 3:
                f4 f4Var = (f4) this.f37180b;
                return f4Var.f37201c - f4Var.f37200b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        bd bdVar = (bd) this.f37180b;
        g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        if (g6Var != null) {
            g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            return g6Var2.a();
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public void a1(int i10, int i11) {
        ((s4.g0) this.f37180b).r(i10, i11, null);
    }

    @Override
    public void b0(String str) {
        ((ck) this.f37180b).f36383b.ia(str, false);
    }

    @Override
    public boolean b1(int i10, View view) {
        switch (this.f37179a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        i10 i10Var = (i10) this.f37180b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            i10.a(i10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.q2) {
                if (!i10Var.f38028o0.g()) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                    if (q2Var.R(f7)) {
                        i10Var.f38022i0.e(q2Var);
                        return true;
                    }
                }
                i10.a(i10Var, ((org.telegram.ui.Cells.q2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void c1(boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        bd bdVar = (bd) this.f37180b;
        g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        if (g6Var instanceof ad) {
            g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) g6Var2).f35649a;
            bdVar2.J = !bdVar2.J;
            bdVar2.f1();
            bdVar2.b1(false);
        }
        bdVar.W0(a(), false);
        bdVar.b1(false);
    }

    @Override
    public void clear() {
        ((a7) this.f37180b).e.n0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f37179a) {
            case 6:
                y5 y5Var = ((s5) this.f37180b).d;
                y5Var.f43717d0 = i10;
                y5Var.H0(true);
                return;
            case 11:
                cc ccVar = ((ac) this.f37180b).f35643f;
                ccVar.f36330y = i10;
                ccVar.d(true);
                return;
            default:
                cv cvVar = (cv) this.f37180b;
                if (cvVar.f36432f[0].f36175f != i10) {
                    if (i10 == cvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cvVar.f36436w = z11;
                    bv bvVar = cvVar.f36432f[1];
                    bvVar.f36175f = i10;
                    bvVar.setVisibility(0);
                    cvVar.m0(true);
                    cvVar.f36434r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.b1.a(messageObject);
    }

    @Override
    public void dismiss() {
        switch (this.f37179a) {
            case 7:
                return;
            default:
                ((w60) this.f37180b).f42942w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f37179a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public void g0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((u50) this.f37180b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37179a) {
            case 3:
                f4 f4Var = (f4) this.f37180b;
                int i10 = f4Var.f37200b;
                return String.valueOf(Math.round((f4Var.f37199a.getProgress() * (f4Var.f37201c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f37179a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((i10) this.f37180b).f38022i0.finish();
    }

    @Override
    public int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f37179a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        vb vbVar = ((rb) this.f37180b).f41078n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void j0(int i10, int i11, boolean z10) {
        tg.o oVar;
        switch (this.f37179a) {
            case 18:
                tg.o oVar2 = ((v10) this.f37180b).f42567c.f47512c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((v10) this.f37180b).f42567c.f47512c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f37179a;
    }

    @Override
    public void k0(float f7) {
        switch (this.f37179a) {
            case 6:
            case 11:
                return;
            default:
                cv cvVar = (cv) this.f37180b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || cvVar.f36432f[1].getVisibility() == 0) {
                    if (cvVar.f36434r) {
                        bv bvVar = cvVar.f36432f[0];
                        bvVar.setTranslationX((-f7) * bvVar.getMeasuredWidth());
                        bv[] bvVarArr = cvVar.f36432f;
                        bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() - (f7 * cvVar.f36432f[0].getMeasuredWidth()));
                    } else {
                        bv bvVar2 = cvVar.f36432f[0];
                        bvVar2.setTranslationX(bvVar2.getMeasuredWidth() * f7);
                        bv[] bvVarArr2 = cvVar.f36432f;
                        bvVarArr2[1].setTranslationX((f7 * bvVarArr2[0].getMeasuredWidth()) - cvVar.f36432f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        bv[] bvVarArr3 = cvVar.f36432f;
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
        n3 n3Var = ((k4) this.f37180b).f38805u0[0];
        if (n3Var != null) {
            n3Var.f39752b.I0(true);
        }
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f37179a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f37179a) {
            case 15:
                return ((wx) this.f37180b).E0.isInPreviewMode();
            default:
                tg0 tg0Var = (tg0) this.f37180b;
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
        switch (this.f37179a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o(float f7) {
        ((i10) this.f37180b).f38022i0.d(f7);
    }

    @Override
    public boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.f37179a) {
            case 15:
                h5Var = ((org.telegram.ui.ActionBar.o2) ((wx) this.f37180b).E0).parentLayout;
                ((ActionBarLayout) h5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f37179a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f37179a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f37179a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        gj gjVar = (gj) this.f37180b;
        View view = gjVar.f37614a;
        if (view != null) {
            view.setPressed(true);
            gjVar.f37614a.setSelected(true);
            gjVar.f37614a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        gj gjVar = (gj) this.f37180b;
        sn snVar = gjVar.f37621w;
        if (gjVar.f37614a != null) {
            snVar.f41484c9 = org.telegram.ui.Components.o9.b(snVar, gjVar.v, snVar.f41519f6, snVar.d(), snVar.f41654qa);
            org.telegram.ui.ActionBar.m1 m1Var = snVar.f41484c9;
            if (m1Var != null) {
                gjVar.f37615b = m1Var;
                m1Var.setOnDismissListener(new e0(gjVar, 2));
                snVar.f41737x0.B0();
                snVar.f41762z0.R = false;
                View view = gjVar.v;
                snVar.ub(view);
                if (view != snVar.f41711v1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                snVar.j8(false, z10, 0.3f);
                snVar.m9(false);
                cl clVar = snVar.L3;
                if (clVar != null) {
                    clVar.d(1, true);
                }
                UndoView undoView = snVar.K3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                gk gkVar = snVar.Y;
                if (gkVar != null && gkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f37179a) {
            case 15:
                return;
            default:
                tg0 tg0Var = (tg0) this.f37180b;
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
        switch (this.f37179a) {
            case 15:
                return;
            default:
                tg0 tg0Var = (tg0) this.f37180b;
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
        switch (this.f37179a) {
            case 15:
                return;
            default:
                tg0 tg0Var = (tg0) this.f37180b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, false);
                tg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f37179a) {
            case 15:
                return false;
            default:
                tg0 tg0Var = (tg0) this.f37180b;
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
        gj gjVar = (gj) this.f37180b;
        if (!gjVar.e && (view = gjVar.f37614a) != null) {
            view.callOnClick();
            gjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public String p0() {
        return null;
    }

    @Override
    public org.telegram.ui.Cells.p9 p2() {
        return null;
    }

    @Override
    public int r0(int i10) {
        switch (this.f37179a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        HashSet hashSet;
        c7 c7Var = ((a7) this.f37180b).e;
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
                        arrayList.addAll(((w6) sparseArray.get(0)).f42934b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((w6) sparseArray.get(1)).f42934b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((w6) sparseArray.get(2)).f42934b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f4436f;
                    if (obj3 != null) {
                        arrayList3.addAll(((w6) sparseArray.get(3)).f42934b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f4437g;
                    if (obj4 != null) {
                        arrayList4.addAll(((w6) sparseArray.get(4)).f42934b);
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
                    yu yuVar = new yu(c7Var, v6Var, cVar, new mi.q(c7Var, v6Var, false, 8));
                    c7Var.T = yuVar;
                    c7Var.showDialog(yuVar);
                    return;
                }
                return;
            }
            bi.c cVar2 = c7Var.Y;
            HashSet hashSet2 = cVar2.f4439j;
            HashSet hashSet3 = cVar2.f4441l;
            long j10 = v6Var.f42616a;
            SparseArray sparseArray2 = v6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((w6) sparseArray2.valueAt(i14)).f42934b;
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
                    ArrayList arrayList6 = ((w6) sparseArray2.valueAt(i16)).f42934b;
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
        ((s4.g0) this.f37180b).t(i10, i11);
    }

    @Override
    public void u() {
        int i10 = this.f37179a;
    }

    @Override
    public void v() {
        switch (this.f37179a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((m5) this.f37180b).f39376b.M();
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
        int i10 = this.f37179a;
    }

    @Override
    public void y(int i10, int i11) {
        ((s4.g0) this.f37180b).p(i10, i11);
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        vb vbVar = (vb) this.f37180b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (vbVar.f42697p0.contains(Long.valueOf(j10))) {
                    vbVar.f42697p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    vbVar.f42697p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                vbVar.W0(true);
                vbVar.R0();
                vbVar.E.l();
                return;
            }
        }
        vbVar.P0(view, f7, f10);
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
    public void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void B(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void D0(int i10) {
    }

    @Override
    public void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.t1 t1Var) {
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
    public void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void H() {
    }

    @Override
    public void I(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L1() {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void Y0() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.t1 t1Var) {
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
    public void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void m(org.telegram.ui.Cells.t1 t1Var) {
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
    public void p(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void q() {
    }

    @Override
    public void r(ik0 ik0Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void w1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void y0() {
    }

    @Override
    public void z(MessageObject messageObject) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }

    @Override
    public void K(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.t1 t1Var, ah.t tVar) {
    }

    @Override
    public void M0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public void h1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
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
    public void A0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void o2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void u1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
