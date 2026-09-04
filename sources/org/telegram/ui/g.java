package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
public final class g implements t9, kv0, org.telegram.ui.web.c1, org.telegram.ui.Components.eo0, org.telegram.ui.Components.d5, org.telegram.ui.Components.lm0, i7, bi.lb, org.telegram.ui.Components.al0, org.telegram.ui.Cells.k1, nd1, pm, me.a, org.telegram.ui.Components.cl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.kq, org.telegram.ui.Components.wp0, s4.e0, org.telegram.ui.Components.p8, org.telegram.ui.Components.i20, r0.n, au, x11, org.telegram.ui.ActionBar.f6 {
    public final int f36514a;
    public final Object f36515b;

    public g(Object obj, int i10) {
        this.f36514a = i10;
        this.f36515b = obj;
    }

    @Override
    public void B() {
        switch (this.f36514a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f36515b).f37242b.N();
                return;
        }
    }

    @Override
    public void B0(int i10, int i11, boolean z10) {
        tg.f fVar;
        switch (this.f36514a) {
            case 18:
                tg.f fVar2 = ((k20) this.f36515b).f37898c.f46490c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((k20) this.f36515b).f37898c.f46490c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C() {
        int i10 = this.f36514a;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f36515b).p(i10, i11);
    }

    @Override
    public void D0(float f7) {
        switch (this.f36514a) {
            case 6:
            case 11:
                return;
            default:
                ov ovVar = (ov) this.f36515b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || ovVar.f39321f[1].getVisibility() == 0) {
                    if (ovVar.f39323r) {
                        nv nvVar = ovVar.f39321f[0];
                        nvVar.setTranslationX((-f7) * nvVar.getMeasuredWidth());
                        nv[] nvVarArr = ovVar.f39321f;
                        nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth() - (f7 * ovVar.f39321f[0].getMeasuredWidth()));
                    } else {
                        nv nvVar2 = ovVar.f39321f[0];
                        nvVar2.setTranslationX(nvVar2.getMeasuredWidth() * f7);
                        nv[] nvVarArr2 = ovVar.f39321f;
                        nvVarArr2[1].setTranslationX((f7 * nvVarArr2[0].getMeasuredWidth()) - ovVar.f39321f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        nv[] nvVarArr3 = ovVar.f39321f;
                        nv nvVar3 = nvVarArr3[0];
                        nvVarArr3[0] = nvVarArr3[1];
                        nvVarArr3[1] = nvVar3;
                        nvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void E0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.f36515b).f37232u0[0];
        if (m3Var != null) {
            m3Var.f38551b.I0(true);
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int G0(int i10) {
        bq0 bq0Var = (bq0) this.f36515b;
        int indexOfKey = bq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.f34875s;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean H0(long j3, int i10, int i11, int i12, bi.mb mbVar) {
        h8 h8Var = (h8) this.f36515b;
        if (h8Var.f36898b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.f36898b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f36898b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f35967n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.f35967n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.f35967n.valueAt(i14)).f36321b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.f35967n.keyAt(i14);
                                h8Var.f36908h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f35968r.get(keyAt);
                                if (imageReceiver != null) {
                                    mbVar.f3335c = imageReceiver;
                                    if (h8Var.f36909i0 == null) {
                                        h8Var.f36909i0 = new z0(this, 10);
                                    }
                                    mbVar.f3336e = h8Var.f36909i0;
                                    mbVar.f3333a = e8Var;
                                    mbVar.f3338g = h8Var.fragmentView;
                                    mbVar.h = AndroidUtilities.dp(36.0f);
                                    mbVar.f3339i = h8Var.fragmentView.getBottom();
                                    mbVar.f3334b = null;
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
    public CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public boolean I0(long j3) {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 17), 50L);
    }

    @Override
    public boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f36515b;
        hVar.finishFragment(false);
        z10 z10Var = hVar.f36832x;
        LaunchActivity launchActivity = (LaunchActivity) z10Var.f43263b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f20237g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new ro(27, b2Var, (h) z10Var.f43264c));
    }

    @Override
    public String K0() {
        return null;
    }

    @Override
    public int M0(int i10) {
        switch (this.f36514a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
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
    public void P0(int i10, int i11) {
        ((s4.h0) this.f36515b).t(i10, i11);
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public ov0 Q1() {
        return null;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(long j3) {
        return false;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        cj0 cj0Var = (cj0) this.f36515b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cj0Var.f35134e = defaultWindowInsets;
        cj0Var.G.setPadding(defaultWindowInsets.f11425a, defaultWindowInsets.f11426b, defaultWindowInsets.f11427c, defaultWindowInsets.d);
        cj0Var.F.requestLayout();
        return r0.l1.f44710b;
    }

    @Override
    public boolean U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void X(float f7, boolean z10) {
        String formatString;
        switch (this.f36514a) {
            case 3:
                e4 e4Var = (e4) this.f36515b;
                int i10 = e4Var.f35919b;
                int round = Math.round(((e4Var.f35920c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f35922f.f37232u0[0].getAdapter().f36557y.clear();
                    i4 i4Var = e4Var.f35922f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        i4Var.f37232u0[i11].f38552c.l();
                        g4 g4Var = i4Var.f37232u0[i11].f38552c;
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
                lc0 lc0Var = (lc0) this.f36515b;
                nc0 nc0Var = lc0Var.f38300y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    nc0Var.Y();
                    ArrayList arrayList2 = nc0Var.f38923s;
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
                i5.d = f7;
                org.telegram.ui.Components.ov0 ov0Var = ((i5) this.f36515b).f37242b;
                ov0Var.M();
                ov0Var.N();
                return;
        }
    }

    @Override
    public boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public void Y0(int i10, int i11) {
        l70 l70Var = (l70) this.f36515b;
        l70Var.W = i10;
        AndroidUtilities.updateVisibleRows(l70Var.f38208b);
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0() {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f36514a) {
            case 12:
                bd bdVar = (bd) this.f36515b;
                f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                    return f6Var2.a();
                }
                return org.telegram.ui.ActionBar.j6.I.q();
            default:
                return ((bq0) this.f36515b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void a1(vt vtVar) {
        ek0 ek0Var = (ek0) this.f36515b;
        ek0Var.E = true;
        String str = vtVar.f41695c;
        ek0Var.O.setText(str);
        ek0Var.u(str, vtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override
    public void b(int i10, boolean z10) {
        boolean z11;
        switch (this.f36514a) {
            case 6:
                v5 v5Var = ((o5) this.f36515b).d;
                v5Var.f41413b0 = i10;
                v5Var.G0(true);
                return;
            case 11:
                cc ccVar = ((ac) this.f36515b).f34379f;
                ccVar.f35068y = i10;
                ccVar.d(true);
                return;
            default:
                ov ovVar = (ov) this.f36515b;
                if (ovVar.f39321f[0].f39039f != i10) {
                    if (i10 == ovVar.f39320e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ovVar.f39325w = z11;
                    nv nvVar = ovVar.f39321f[1];
                    nvVar.f39039f = i10;
                    nvVar.setVisibility(0);
                    ovVar.m0(true);
                    ovVar.f39323r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b0() {
        ((nk0) this.f36515b).a();
    }

    @Override
    public void b1() {
        oj ojVar = (oj) this.f36515b;
        View view = ojVar.f39259a;
        if (view != null) {
            view.setPressed(false);
            ojVar.f39259a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ojVar.f39259a.getBackground() != null) {
                ojVar.f39259a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ojVar.f39264n;
        if (view2 != null && !ojVar.d) {
            view2.callOnClick();
            ojVar.d = true;
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        return org.telegram.messenger.wl.a(messageObject);
    }

    @Override
    public void clear() {
        ((x6) this.f36515b).f42597e.m0();
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.f36515b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            x10.a(x10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!x10Var.f42554o0.g()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        x10Var.f42548i0.f(r2Var);
                        return true;
                    }
                }
                x10.a(x10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f36514a) {
            case 7:
                return;
            default:
                ((l70) this.f36515b).f38215w.d(true);
                return;
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f36514a) {
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
    public CharSequence getContentDescription() {
        switch (this.f36514a) {
            case 3:
                e4 e4Var = (e4) this.f36515b;
                int i10 = e4Var.f35919b;
                return String.valueOf(Math.round((e4Var.f35918a.getProgress() * (e4Var.f35920c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        bq0 bq0Var = (bq0) this.f36515b;
        if (str.equals("drawableMsgIn")) {
            return bq0Var.f34876w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bq0Var.f34877x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.f34875s;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f36514a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((x10) this.f36515b).f42548i0.finish();
    }

    @Override
    public int h0(int i10) {
        return G0(i10);
    }

    @Override
    public int h1(int i10) {
        return G0(i10);
    }

    @Override
    public TextureView i0() {
        return null;
    }

    @Override
    public void i1() {
        z6 z6Var = ((x6) this.f36515b).f42597e;
        ai.c cVar = z6Var.Y;
        if (cVar != null && cVar.f751j.size() > 0) {
            z6Var.Y.d();
            w6 w6Var = z6Var.N;
            if (w6Var != null) {
                w6Var.e(false);
                z6Var.N.d();
            }
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f36514a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        ub ubVar = ((qb) this.f36515b).f39822n;
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
    public boolean j0() {
        return false;
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f36514a;
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f36515b).s(i10, i11);
    }

    @Override
    public void k1(s6 s6Var, ai.b bVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.f36515b).f42597e;
        if (s6Var != null) {
            if (z6Var.Y.f751j.size() <= 0 && !z10) {
                if (z6Var.H > 0 && z6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    ai.c cVar = new ai.c(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f40633b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f40633b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.f747e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f40633b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f748f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f40633b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f749g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f40633b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f751j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((ai.b) arrayList.get(i10));
                        if (((ai.b) arrayList.get(i10)).d == 0) {
                            cVar.f759r += ((ai.b) arrayList.get(i10)).f740c;
                        } else {
                            cVar.f760s += ((ai.b) arrayList.get(i10)).f740c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((ai.b) arrayList2.get(i11));
                        cVar.f761t += ((ai.b) arrayList2.get(i11)).f740c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((ai.b) arrayList3.get(i12));
                        cVar.f762u += ((ai.b) arrayList3.get(i12)).f740c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((ai.b) arrayList4.get(i13));
                        cVar.v += ((ai.b) arrayList4.get(i13)).f740c;
                        i13++;
                        z11 = true;
                    }
                    cVar.f754m = z11;
                    cVar.f755n = z11;
                    cVar.f756o = z11;
                    cVar.f757p = z11;
                    cVar.f758q = z11;
                    Collections.sort(arrayList, new a4.e(2));
                    Collections.sort(arrayList2, new a4.e(2));
                    Collections.sort(arrayList3, new a4.e(2));
                    Collections.sort(arrayList4, new a4.e(2));
                    Collections.sort(cVar.h, new a4.e(2));
                    kv kvVar = new kv(z6Var, s6Var, cVar, new o0.a(z6Var, s6Var, false, 2));
                    z6Var.T = kvVar;
                    z6Var.showDialog(kvVar);
                    return;
                }
                return;
            }
            ai.c cVar2 = z6Var.Y;
            HashSet hashSet2 = cVar2.f751j;
            HashSet hashSet3 = cVar2.f753l;
            long j3 = s6Var.f40312a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i14)).f40633b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        ai.b bVar2 = (ai.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f752k += bVar2.f740c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i16)).f40633b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        ai.b bVar3 = (ai.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f752k -= bVar3.f740c;
                        }
                    }
                }
            }
            cVar2.c();
            z6Var.N.d();
            z6.g0(z6Var);
        } else if (bVar != null) {
            z6Var.Y.i(bVar);
            z6Var.N.d();
            z6.g0(z6Var);
        }
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public int l0() {
        switch (this.f36514a) {
            case 3:
                e4 e4Var = (e4) this.f36515b;
                return e4Var.f35920c - e4Var.f35919b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void m1(int i10, int i11) {
        ((s4.h0) this.f36515b).r(i10, i11, null);
    }

    @Override
    public boolean m2(int i10) {
        return false;
    }

    @Override
    public boolean n0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override
    public boolean n1(int i10, View view) {
        switch (this.f36514a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f36514a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f36514a) {
            case 15:
                return ((ny) this.f36515b).E0.isInPreviewMode();
            default:
                gh0 gh0Var = (gh0) this.f36515b;
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
        switch (this.f36514a) {
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
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f36514a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ny) this.f36515b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f36514a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f36514a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f36514a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.f36515b;
        View view = ojVar.f39259a;
        if (view != null) {
            view.setPressed(true);
            ojVar.f39259a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ojVar.f39259a.getBackground() != null) {
                ojVar.f39259a.getBackground().setVisible(true, false);
            }
            ojVar.f39259a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        oj ojVar = (oj) this.f36515b;
        co coVar = ojVar.f39267w;
        if (ojVar.f39259a != null) {
            coVar.Q8 = org.telegram.ui.Components.p9.b(coVar, ojVar.v, coVar.T5, coVar.d(), coVar.f35247ea);
            org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
            if (n1Var != null) {
                ojVar.f39260b = n1Var;
                n1Var.setOnDismissListener(new e0(ojVar, 2));
                coVar.f35473x0.B0();
                coVar.f35498z0.R = false;
                View view = ojVar.v;
                coVar.ob(view);
                if (view != coVar.f35299j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coVar.g8(false, z10, 0.3f);
                coVar.h9(false);
                jl jlVar = coVar.f35501z3;
                if (jlVar != null) {
                    jlVar.e(1, true);
                }
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                mk mkVar = coVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    coVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f36514a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f36515b;
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
        switch (this.f36514a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f36515b;
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
        switch (this.f36514a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f36515b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, false);
                gh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f36514a) {
            case 15:
                return false;
            default:
                gh0 gh0Var = (gh0) this.f36515b;
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
        oj ojVar = (oj) this.f36515b;
        if (!ojVar.f39262e && (view = ojVar.f39259a) != null) {
            view.callOnClick();
            ojVar.f39262e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(long j3, int i10, bi.p4 p4Var) {
        h8 h8Var = (h8) this.f36515b;
        if (h8Var.f36898b == null) {
            p4Var.run();
        }
        h8Var.f36898b.post(p4Var);
    }

    @Override
    public void p1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        bd bdVar = (bd) this.f36515b;
        f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (f6Var instanceof ad) {
            f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) f6Var2).f34386a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override
    public void q(float f7) {
        ((x10) this.f36515b).f42548i0.e(f7);
    }

    @Override
    public org.telegram.ui.Cells.r9 q2() {
        return null;
    }

    @Override
    public void r0(String str) {
        ((jk) this.f36515b).f37796b.da(str, false);
    }

    @Override
    public boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean u1() {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20987v3;
    }

    @Override
    public void z() {
        int i10 = this.f36514a;
    }

    @Override
    public void z0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((j60) this.f36515b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.f36515b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ubVar.f41041t0.contains(Long.valueOf(j3))) {
                    ubVar.f41041t0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.f41041t0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.X0(true);
                ubVar.R0();
                ubVar.I.l();
                return;
            }
        }
        ubVar.P0(view, f7, f10);
    }

    private final void a2(float f7) {
    }

    private final void b2(float f7) {
    }

    private final void c2() {
    }

    private final void f2() {
    }

    private final void g2() {
    }

    private final void h2() {
    }

    private final void j2() {
    }

    private final void l2(boolean z10) {
    }

    private final void n2(boolean z10) {
    }

    private final void q1() {
    }

    private final void r1() {
    }

    private final void s1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L1() {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void U() {
    }

    @Override
    public void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void V0(int i10) {
    }

    @Override
    public void W0(MrzRecognizer.Result result) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void e1() {
    }

    @Override
    public void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void i2() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void v(wk0 wk0Var) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void w0() {
    }

    @Override
    public void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
    }

    @Override
    public void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void O0(int i10, int i11) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    private final void C1(View view, float f7, float f10) {
    }

    private final void E1(View view, float f7, float f10) {
    }

    private final void P1(View view, float f7, float f10) {
    }

    private final void R1(View view, float f7, float f10) {
    }

    private final void V1(View view, float f7, float f10) {
    }

    private final void X1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final void x1(View view, float f7, float f10) {
    }

    private final void y1(View view, float f7, float f10) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void T1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void Z1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
