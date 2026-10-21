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
public final class g implements v9, ru0, org.telegram.ui.web.z0, org.telegram.ui.Components.cp0, org.telegram.ui.Components.e5, org.telegram.ui.Components.kn0, l7, ci.w9, org.telegram.ui.Components.yl0, org.telegram.ui.Cells.l1, bc1, em, oe.a, org.telegram.ui.Components.am0, org.telegram.ui.Cells.q7, org.telegram.ui.Components.vq, org.telegram.ui.Components.uq0, s4.d0, org.telegram.ui.Components.o8, org.telegram.ui.Components.r20, r0.n, nt, y01 {
    public final int f37149a;
    public final Object f37150b;

    public g(Object obj, int i10) {
        this.f37149a = i10;
        this.f37150b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        mi0 mi0Var = (mi0) this.f37150b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        mi0Var.d = defaultWindowInsets;
        mi0Var.F.setPadding(defaultWindowInsets.f12283a, defaultWindowInsets.f12284b, defaultWindowInsets.f12285c, defaultWindowInsets.d);
        mi0Var.E.requestLayout();
        return r0.k1.f44834b;
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
        h hVar = (h) this.f37150b;
        hVar.finishFragment(false);
        xu xuVar = hVar.f37446x;
        LaunchActivity launchActivity = (LaunchActivity) xuVar.f43274c;
        Pattern pattern = LaunchActivity.C1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f20665g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new x40(4, b2Var, (h) xuVar.f43273b));
    }

    @Override
    public void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public void H0(int i10, int i11) {
        s60 s60Var = (s60) this.f37150b;
        s60Var.W = i10;
        AndroidUtilities.updateVisibleRows(s60Var.f41375b);
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
        switch (this.f37149a) {
            case 3:
                g4 g4Var = (g4) this.f37150b;
                int round = Math.round(((g4Var.f37180c - i10) * f7) + g4Var.f37179b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    g4Var.f37181f.f38779u0[0].getAdapter().f38168y.clear();
                    l4 l4Var = g4Var.f37181f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        l4Var.f38779u0[i11].f39754c.l();
                        j4 j4Var = l4Var.f38779u0[i11].f39754c;
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
                ob0 ob0Var = (ob0) this.f37150b;
                qb0 qb0Var = ob0Var.f39826y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    qb0Var.Y();
                    ArrayList arrayList2 = qb0Var.f40529s;
                    if (arrayList2.isEmpty()) {
                        qb0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new kb0(2, 0, formatString, 0, 0));
                        qb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ob0Var.performHapticFeedback(3, 1);
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
                org.telegram.ui.Components.lw0 lw0Var = ((n5) this.f37150b).f39413b;
                lw0Var.M();
                lw0Var.N();
                return;
        }
    }

    @Override
    public void L0(ht htVar) {
        mj0 mj0Var = (mj0) this.f37150b;
        mj0Var.E = true;
        String str = htVar.f37786c;
        mj0Var.O.setText(str);
        mj0Var.w(str, htVar);
        mj0Var.E = false;
        AndroidUtilities.runOnUIThread(new dz(this, 29), 300L);
        mj0Var.Q.requestFocus();
        kj0 kj0Var = mj0Var.Q;
        kj0Var.setSelection(kj0Var.length());
    }

    @Override
    public boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void N0() {
        gj gjVar = (gj) this.f37150b;
        View view = gjVar.f37338a;
        if (view != null) {
            view.setPressed(false);
            gjVar.f37338a.setSelected(false);
        }
        View view2 = gjVar.f37342n;
        if (view2 != null && !gjVar.d) {
            view2.callOnClick();
            gjVar.d = true;
        }
    }

    @Override
    public void O() {
        ((uj0) this.f37150b).a();
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
    public vu0 P1() {
        return null;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, ci.x9 x9Var) {
        k8 k8Var = (k8) this.f37150b;
        if (k8Var.f38442b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= k8Var.f38442b.getChildCount()) {
                    break;
                }
                View childAt = k8Var.f38442b.getChildAt(i13);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    if (h8Var.f37534n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < h8Var.f37534n.size(); i14++) {
                            ArrayList arrayList = ((i8) h8Var.f37534n.valueAt(i14)).f37875b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = h8Var.f37534n.keyAt(i14);
                                k8Var.f38451h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h8Var.f37535r.get(keyAt);
                                if (imageReceiver != null) {
                                    x9Var.f6174c = imageReceiver;
                                    if (k8Var.f38452i0 == null) {
                                        k8Var.f38452i0 = new b1(this, 10);
                                    }
                                    x9Var.e = k8Var.f38452i0;
                                    x9Var.f6172a = h8Var;
                                    x9Var.f6176g = k8Var.fragmentView;
                                    x9Var.h = AndroidUtilities.dp(36.0f);
                                    x9Var.f6177i = k8Var.fragmentView.getBottom();
                                    x9Var.f6173b = null;
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
        c7 c7Var = ((a7) this.f37150b).e;
        bi.c cVar = c7Var.Y;
        if (cVar != null && cVar.f4435j.size() > 0) {
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
        ((s4.g0) this.f37150b).s(i10, i11);
    }

    @Override
    public void X0(long j10, int i10, ci.t3 t3Var) {
        k8 k8Var = (k8) this.f37150b;
        if (k8Var.f38442b == null) {
            t3Var.run();
        }
        k8Var.f38442b.post(t3Var);
    }

    @Override
    public int Y() {
        switch (this.f37149a) {
            case 3:
                g4 g4Var = (g4) this.f37150b;
                return g4Var.f37180c - g4Var.f37179b;
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
        bd bdVar = (bd) this.f37150b;
        d6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (d6Var != null) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            return d6Var2.a();
        }
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public void a1(int i10, int i11) {
        ((s4.g0) this.f37150b).r(i10, i11, null);
    }

    @Override
    public void b0(String str) {
        ((bk) this.f37150b).f35667b.ia(str, false);
    }

    @Override
    public boolean b1(int i10, View view) {
        switch (this.f37149a) {
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
        bd bdVar = (bd) this.f37150b;
        d6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (d6Var instanceof ad) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) d6Var2).f35348a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override
    public void clear() {
        ((a7) this.f37150b).e.m0();
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        e10 e10Var = (e10) this.f37150b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            e10.a(e10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.m7) {
            e10.a(e10Var, ((org.telegram.ui.Cells.m7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            e10.a(e10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            e10.a(e10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!e10Var.f36510o0.g()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        e10Var.f36504i0.f(r2Var);
                        return true;
                    }
                }
                e10.a(e10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
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
        switch (this.f37149a) {
            case 7:
                return;
            default:
                ((s60) this.f37150b).f41381w.d(true);
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
        switch (this.f37149a) {
            case 6:
                z5 z5Var = ((t5) this.f37150b).d;
                z5Var.f43632b0 = i10;
                z5Var.H0(true);
                return;
            case 11:
                cc ccVar = ((ac) this.f37150b).f35340f;
                ccVar.f35936y = i10;
                ccVar.d(true);
                return;
            default:
                av avVar = (av) this.f37150b;
                if (avVar.f35431f[0].f43807f != i10) {
                    if (i10 == avVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    avVar.f35435w = z11;
                    zu zuVar = avVar.f35431f[1];
                    zuVar.f43807f = i10;
                    zuVar.setVisibility(0);
                    avVar.m0(true);
                    avVar.f35433r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f37149a) {
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
            ((q50) this.f37150b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37149a) {
            case 3:
                g4 g4Var = (g4) this.f37150b;
                int i10 = g4Var.f37179b;
                return String.valueOf(Math.round((g4Var.f37178a.getProgress() * (g4Var.f37180c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f37149a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((e10) this.f37150b).f36504i0.finish();
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f37149a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        vb vbVar = ((rb) this.f37150b).f41111n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.H1;
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
        switch (this.f37149a) {
            case 18:
                tg.o oVar2 = ((r10) this.f37150b).f41032c.f47073c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((r10) this.f37150b).f41032c.f47073c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f37149a;
    }

    @Override
    public void k0(float f7) {
        switch (this.f37149a) {
            case 6:
            case 11:
                return;
            default:
                av avVar = (av) this.f37150b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || avVar.f35431f[1].getVisibility() == 0) {
                    if (avVar.f35433r) {
                        zu zuVar = avVar.f35431f[0];
                        zuVar.setTranslationX((-f7) * zuVar.getMeasuredWidth());
                        zu[] zuVarArr = avVar.f35431f;
                        zuVarArr[1].setTranslationX(zuVarArr[0].getMeasuredWidth() - (f7 * avVar.f35431f[0].getMeasuredWidth()));
                    } else {
                        zu zuVar2 = avVar.f35431f[0];
                        zuVar2.setTranslationX(zuVar2.getMeasuredWidth() * f7);
                        zu[] zuVarArr2 = avVar.f35431f;
                        zuVarArr2[1].setTranslationX((f7 * zuVarArr2[0].getMeasuredWidth()) - avVar.f35431f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        zu[] zuVarArr3 = avVar.f35431f;
                        zu zuVar3 = zuVarArr3[0];
                        zuVarArr3[0] = zuVarArr3[1];
                        zuVarArr3[1] = zuVar3;
                        zuVar3.setVisibility(8);
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
        o3 o3Var = ((l4) this.f37150b).f38779u0[0];
        if (o3Var != null) {
            o3Var.f39753b.I0(true);
        }
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f37149a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f37149a) {
            case 15:
                return ((ux) this.f37150b).E0.isInPreviewMode();
            default:
                pg0 pg0Var = (pg0) this.f37150b;
                View view2 = null;
                pg0Var.O = null;
                int childCount = pg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = pg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !pg0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f37149a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o(float f7) {
        ((e10) this.f37150b).f36504i0.e(f7);
    }

    @Override
    public boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f37149a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ux) this.f37150b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f37149a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f37149a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f37149a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        gj gjVar = (gj) this.f37150b;
        View view = gjVar.f37338a;
        if (view != null) {
            view.setPressed(true);
            gjVar.f37338a.setSelected(true);
            gjVar.f37338a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        gj gjVar = (gj) this.f37150b;
        qn qnVar = gjVar.f37345w;
        if (gjVar.f37338a != null) {
            qnVar.Q8 = org.telegram.ui.Components.o9.b(qnVar, gjVar.v, qnVar.T5, qnVar.d(), qnVar.f40673ea);
            org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
            if (m1Var != null) {
                gjVar.f37339b = m1Var;
                m1Var.setOnDismissListener(new f0(gjVar, 2));
                qnVar.f40901x0.B0();
                qnVar.f40926z0.R = false;
                View view = gjVar.v;
                qnVar.tb(view);
                if (view != qnVar.f40725j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qnVar.j8(false, z10, 0.3f);
                qnVar.m9(false);
                bl blVar = qnVar.f40929z3;
                if (blVar != null) {
                    blVar.e(1, true);
                }
                UndoView undoView = qnVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                fk fkVar = qnVar.Y;
                if (fkVar != null && fkVar.getEditField() != null) {
                    qnVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f37149a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f37150b;
                pg0.k(pg0Var, view, f7, f10);
                pg0.m(pg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.H, 450L);
                pg0Var.O = null;
                pg0Var.invalidate();
                pg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f37149a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f37150b;
                pg0.k(pg0Var, view, f7, f10);
                pg0.m(pg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.H, 450L);
                View view2 = pg0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                pg0Var.O = null;
                pg0Var.invalidate();
                pg0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f37149a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f37150b;
                pg0.k(pg0Var, view, f7, f10);
                pg0.m(pg0Var, f7, false, false);
                pg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f37149a) {
            case 15:
                return false;
            default:
                pg0 pg0Var = (pg0) this.f37150b;
                pg0.k(pg0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(pg0Var.H);
                pg0.l(pg0Var);
                pg0.m(pg0Var, f7, true, false);
                pg0Var.invalidate();
                pg0Var.Q.a(true, true);
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
        gj gjVar = (gj) this.f37150b;
        if (!gjVar.e && (view = gjVar.f37338a) != null) {
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
    public org.telegram.ui.Cells.o9 p2() {
        return null;
    }

    @Override
    public int r0(int i10) {
        switch (this.f37149a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        HashSet hashSet;
        c7 c7Var = ((a7) this.f37150b).e;
        if (v6Var != null) {
            if (c7Var.Y.f4435j.size() <= 0 && !z10) {
                if (c7Var.H > 0 && c7Var.getParentActivity() != null) {
                    v6Var.getClass();
                    boolean z11 = true;
                    bi.c cVar = new bi.c(true);
                    SparseArray sparseArray = v6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((w6) sparseArray.get(0)).f42478b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((w6) sparseArray.get(1)).f42478b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((w6) sparseArray.get(2)).f42478b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f4432f;
                    if (obj3 != null) {
                        arrayList3.addAll(((w6) sparseArray.get(3)).f42478b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f4433g;
                    if (obj4 != null) {
                        arrayList4.addAll(((w6) sparseArray.get(4)).f42478b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f4435j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((bi.b) arrayList.get(i10));
                        if (((bi.b) arrayList.get(i10)).d == 0) {
                            cVar.f4443r += ((bi.b) arrayList.get(i10)).f4426c;
                        } else {
                            cVar.f4444s += ((bi.b) arrayList.get(i10)).f4426c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((bi.b) arrayList2.get(i11));
                        cVar.f4445t += ((bi.b) arrayList2.get(i11)).f4426c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((bi.b) arrayList3.get(i12));
                        cVar.f4446u += ((bi.b) arrayList3.get(i12)).f4426c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((bi.b) arrayList4.get(i13));
                        cVar.v += ((bi.b) arrayList4.get(i13)).f4426c;
                        i13++;
                        z11 = true;
                    }
                    cVar.f4438m = z11;
                    cVar.f4439n = z11;
                    cVar.f4440o = z11;
                    cVar.f4441p = z11;
                    cVar.f4442q = z11;
                    Collections.sort(arrayList, new a4.d(6));
                    Collections.sort(arrayList2, new a4.d(6));
                    Collections.sort(arrayList3, new a4.d(6));
                    Collections.sort(arrayList4, new a4.d(6));
                    Collections.sort(cVar.h, new a4.d(6));
                    vu vuVar = new vu(c7Var, v6Var, cVar, new n2.e(c7Var, v6Var, false, 6));
                    c7Var.T = vuVar;
                    c7Var.showDialog(vuVar);
                    return;
                }
                return;
            }
            bi.c cVar2 = c7Var.Y;
            HashSet hashSet2 = cVar2.f4435j;
            HashSet hashSet3 = cVar2.f4437l;
            long j10 = v6Var.f42114a;
            SparseArray sparseArray2 = v6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((w6) sparseArray2.valueAt(i14)).f42478b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        bi.b bVar2 = (bi.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f4436k += bVar2.f4426c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((w6) sparseArray2.valueAt(i16)).f42478b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        bi.b bVar3 = (bi.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f4436k -= bVar3.f4426c;
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
        ((s4.g0) this.f37150b).t(i10, i11);
    }

    @Override
    public void u() {
        int i10 = this.f37149a;
    }

    @Override
    public void v() {
        switch (this.f37149a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((n5) this.f37150b).f39413b.N();
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
        int i10 = this.f37149a;
    }

    @Override
    public void y(int i10, int i11) {
        ((s4.g0) this.f37150b).p(i10, i11);
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        vb vbVar = (vb) this.f37150b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (vbVar.f42179p0.contains(Long.valueOf(j10))) {
                    vbVar.f42179p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    vbVar.f42179p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
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
    public void r(ek0 ek0Var) {
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
