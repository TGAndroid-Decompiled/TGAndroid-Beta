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
public final class h implements u9, ru0, org.telegram.ui.web.z0, org.telegram.ui.Components.jo0, org.telegram.ui.Components.y4, org.telegram.ui.Components.tm0, k7, nh.e9, org.telegram.ui.Components.jl0, org.telegram.ui.Cells.k1, tc1, km, yd.a, org.telegram.ui.Components.ll0, org.telegram.ui.Cells.p7, org.telegram.ui.Components.jq, org.telegram.ui.Components.aq0, f2.k0, org.telegram.ui.Components.g8, org.telegram.ui.Components.j20, r0.o, xt, d11, org.telegram.ui.ActionBar.f6 {
    public final int f34708a;
    public final Object f34709b;

    public h(Object obj, int i10) {
        this.f34708a = i10;
        this.f34709b = obj;
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void B() {
        switch (this.f34708a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((l5) this.f34709b).f35958b.N();
                return;
        }
    }

    @Override
    public void C() {
        int i10 = this.f34708a;
    }

    @Override
    public org.telegram.ui.Cells.n9 C2() {
        return null;
    }

    @Override
    public void D(int i10, int i11) {
        ((f2.o0) this.f34709b).p(i10, i11);
    }

    @Override
    public void D0(long j10, int i10, nh.k3 k3Var) {
        j8 j8Var = (j8) this.f34709b;
        if (j8Var.f35257b == null) {
            k3Var.run();
        }
        j8Var.f35257b.post(k3Var);
    }

    @Override
    public boolean D1() {
        return false;
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public String G0() {
        return null;
    }

    @Override
    public int I0(int i10) {
        switch (this.f34708a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean I1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        AndroidUtilities.runOnUIThread(new af.b(this, i10, 14), 50L);
    }

    @Override
    public void K(String str) {
        i iVar = (i) this.f34709b;
        iVar.finishFragment(false);
        qs qsVar = iVar.f34987x;
        LaunchActivity launchActivity = (LaunchActivity) qsVar.f37835b;
        Pattern pattern = LaunchActivity.f31612y1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.f19590d0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.L).sendRequest(tL_auth_acceptLoginToken, new lo(27, d2Var, (i) qsVar.f37836c));
    }

    @Override
    public boolean K1() {
        return false;
    }

    @Override
    public void M0(int i10, int i11) {
        ((f2.o0) this.f34709b).t(i10, i11);
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        si0 si0Var = (si0) this.f34709b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        si0Var.e = defaultWindowInsets;
        si0Var.D.setPadding(defaultWindowInsets.f7213a, defaultWindowInsets.f7214b, defaultWindowInsets.f7215c, defaultWindowInsets.d);
        si0Var.C.requestLayout();
        return r0.m1.f43129b;
    }

    @Override
    public boolean O0(long j10) {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public void P1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void U0(int i10, int i11) {
        e70 e70Var = (e70) this.f34709b;
        e70Var.T = i10;
        AndroidUtilities.updateVisibleRows(e70Var.f33916b);
    }

    @Override
    public boolean V0() {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean X0(long j10, int i10, int i11, int i12, nh.f9 f9Var) {
        j8 j8Var = (j8) this.f34709b;
        if (j8Var.f35257b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= j8Var.f35257b.getChildCount()) {
                    break;
                }
                View childAt = j8Var.f35257b.getChildAt(i13);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    if (g8Var.f34474n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < g8Var.f34474n.size(); i14++) {
                            ArrayList arrayList = ((h8) g8Var.f34474n.valueAt(i14)).f34780b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = g8Var.f34474n.keyAt(i14);
                                j8Var.f35262e0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.f34475r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.f15334c = imageReceiver;
                                    if (j8Var.f35264f0 == null) {
                                        j8Var.f35264f0 = new a1(this, 10);
                                    }
                                    f9Var.e = j8Var.f35264f0;
                                    f9Var.f15332a = g8Var;
                                    f9Var.f15336g = j8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.f15337i = j8Var.fragmentView.getBottom();
                                    f9Var.f15333b = null;
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
    public void Y(float f10, boolean z4) {
        String formatString;
        switch (this.f34708a) {
            case 3:
                h4 h4Var = (h4) this.f34709b;
                int i10 = h4Var.f34750b;
                int round = Math.round(((h4Var.f34751c - i10) * f10) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    h4Var.f34752f.f35945r0[0].getAdapter().f35230y.clear();
                    l4 l4Var = h4Var.f34752f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        l4Var.f35945r0[i11].f37160c.l();
                        j4 j4Var = l4Var.f35945r0[i11].f37160c;
                        ArrayList arrayList = j4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(j4Var.H);
                        Utilities.globalQueue.postRunnable(j4Var.H, 100L);
                    }
                    h4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                cc0 cc0Var = (cc0) this.f34709b;
                ec0 ec0Var = cc0Var.f33269y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    ec0Var.Y();
                    ArrayList arrayList2 = ec0Var.f33988s;
                    if (arrayList2.isEmpty()) {
                        ec0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new yb0(2, 0, formatString, 0, 0));
                        ec0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            cc0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                l5.d = f10;
                org.telegram.ui.Components.qv0 qv0Var = ((l5) this.f34709b).f35958b;
                qv0Var.M();
                qv0Var.N();
                return;
        }
    }

    @Override
    public boolean Y0(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public boolean Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f34708a) {
            case 12:
                bd bdVar = (bd) this.f34709b;
                f6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
                    return f6Var2.a();
                }
                return org.telegram.ui.ActionBar.j6.I.q();
            default:
                return ((gp0) this.f34709b).G;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public vu0 a2() {
        return null;
    }

    @Override
    public void b0() {
        ((ak0) this.f34709b).a();
    }

    @Override
    public void b1(st stVar) {
        sj0 sj0Var = (sj0) this.f34709b;
        sj0Var.B = true;
        String str = stVar.f38437c;
        sj0Var.L.setText(str);
        sj0Var.u(str, stVar);
        sj0Var.B = false;
        AndroidUtilities.runOnUIThread(new c10(this, 28), 300L);
        sj0Var.N.requestFocus();
        qj0 qj0Var = sj0Var.N;
        qj0Var.setSelection(qj0Var.length());
    }

    @Override
    public boolean mo18c(float f10, float f11, int i10, View view) {
        t10 t10Var = (t10) this.f34709b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.l7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            t10.a(t10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!t10Var.f38487l0.f()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f10)) {
                        t10Var.f38481f0.f(r2Var);
                        return true;
                    }
                }
                t10.a(t10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    @Override
    public void c1() {
        kj kjVar = (kj) this.f34709b;
        View view = kjVar.f35742a;
        if (view != null) {
            view.setPressed(false);
            kjVar.f35742a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && kjVar.f35742a.getBackground() != null) {
                kjVar.f35742a.getBackground().setVisible(false, false);
            }
        }
        View view2 = kjVar.f35746n;
        if (view2 != null && !kjVar.d) {
            view2.callOnClick();
            kjVar.d = true;
        }
    }

    @Override
    public void clear() {
        ((z6) this.f34709b).e.m0();
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean d0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean d2(long j10) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f34708a) {
            case 7:
                return;
            default:
                ((e70) this.f34709b).f33922w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void e0(int i10, int i11) {
        ((f2.o0) this.f34709b).s(i10, i11);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void f(int i10, boolean z4) {
        boolean z10;
        switch (this.f34708a) {
            case 6:
                y5 y5Var = ((r5) this.f34709b).d;
                y5Var.Y = i10;
                y5Var.G0(true);
                return;
            case 11:
                bc bcVar = ((zb) this.f34709b).f40752f;
                bcVar.f32903y = i10;
                bcVar.d(true);
                return;
            default:
                kv kvVar = (kv) this.f34709b;
                if (kvVar.f35821f[0].f35514f != i10) {
                    if (i10 == kvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kvVar.f35825w = z10;
                    jv jvVar = kvVar.f35821f[1];
                    jvVar.f35514f = i10;
                    jvVar.setVisibility(0);
                    kvVar.m0(true);
                    kvVar.f35823r = z4;
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
    public boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public boolean f2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f34708a) {
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
    public int g1(int i10) {
        return x0(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f34708a) {
            case 3:
                h4 h4Var = (h4) this.f34709b;
                int i10 = h4Var.f34750b;
                return String.valueOf(Math.round((h4Var.f34749a.getProgress() * (h4Var.f34751c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        gp0 gp0Var = (gp0) this.f34709b;
        if (str.equals("drawableMsgIn")) {
            return gp0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return gp0Var.f34660w;
        }
        org.telegram.ui.ActionBar.f6 f6Var = gp0Var.f34658r;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f34708a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((t10) this.f34709b).f38481f0.finish();
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public void h1() {
        b7 b7Var = ((z6) this.f34709b).e;
        mh.b bVar = b7Var.V;
        if (bVar != null && bVar.f14180j.size() > 0) {
            b7Var.V.d();
            y6 y6Var = b7Var.K;
            if (y6Var != null) {
                y6Var.e(false);
                b7Var.K.d();
            }
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.f34708a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        sb sbVar = ((ob) this.f34709b).f36864n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            af.g.s(sbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            af.g.s(sbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public int j0() {
        switch (this.f34708a) {
            case 3:
                h4 h4Var = (h4) this.f34709b;
                return h4Var.f34751c - h4Var.f34750b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public void k(boolean z4) {
        int i10 = this.f34708a;
    }

    @Override
    public int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public void k1(int i10, int i11) {
        ((f2.o0) this.f34709b).r(i10, i11, null);
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m1(int i10, View view) {
        switch (this.f34708a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public void n1(boolean z4) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        bd bdVar = (bd) this.f34709b;
        f6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        if (f6Var instanceof ad) {
            f6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) f6Var2).f32520a;
            bdVar2.G = !bdVar2.G;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f34708a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.f34708a) {
            case 15:
                return ((hy) this.f34709b).B0.isInPreviewMode();
            default:
                xg0 xg0Var = (xg0) this.f34709b;
                View view2 = null;
                xg0Var.L = null;
                int childCount = xg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = xg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !xg0Var.M.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        switch (this.f34708a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.f34708a) {
            case 15:
                e5Var = ((org.telegram.ui.ActionBar.p2) ((hy) this.f34709b).B0).parentLayout;
                ((ActionBarLayout) e5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        int i10 = this.f34708a;
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
        int i10 = this.f34708a;
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        int i10 = this.f34708a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        kj kjVar = (kj) this.f34709b;
        View view = kjVar.f35742a;
        if (view != null) {
            view.setPressed(true);
            kjVar.f35742a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && kjVar.f35742a.getBackground() != null) {
                kjVar.f35742a.getBackground().setVisible(true, false);
            }
            kjVar.f35742a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z4;
        kj kjVar = (kj) this.f34709b;
        xn xnVar = kjVar.f35749w;
        if (kjVar.f35742a != null) {
            xnVar.N8 = org.telegram.ui.Components.h9.b(xnVar, kjVar.v, xnVar.Q5, xnVar.b(), xnVar.f39968ba);
            org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
            if (p1Var != null) {
                kjVar.f35743b = p1Var;
                p1Var.setOnDismissListener(new g0(kjVar, 2));
                xnVar.f40193u0.B0();
                xnVar.f40220w0.R = false;
                View view = kjVar.v;
                xnVar.ob(view);
                if (view != xnVar.f40023g1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xnVar.g8(false, z4, 0.3f);
                xnVar.h9(false);
                gl glVar = xnVar.f40223w3;
                if (glVar != null) {
                    glVar.e(1, true);
                }
                UndoView undoView = xnVar.f40209v3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                jk jkVar = xnVar.V;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.V.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.f34708a) {
            case 15:
                return;
            default:
                xg0 xg0Var = (xg0) this.f34709b;
                xg0.k(xg0Var, view, f10, f11);
                xg0.m(xg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(xg0Var.E, 450L);
                xg0Var.L = null;
                xg0Var.invalidate();
                xg0Var.N.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.f34708a) {
            case 15:
                return;
            default:
                xg0 xg0Var = (xg0) this.f34709b;
                xg0.k(xg0Var, view, f10, f11);
                xg0.m(xg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(xg0Var.E, 450L);
                View view2 = xg0Var.L;
                if (view2 != null) {
                    view2.performClick();
                }
                xg0Var.L = null;
                xg0Var.invalidate();
                xg0Var.N.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.f34708a) {
            case 15:
                return;
            default:
                xg0 xg0Var = (xg0) this.f34709b;
                xg0.k(xg0Var, view, f10, f11);
                xg0.m(xg0Var, f10, false, false);
                xg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.f34708a) {
            case 15:
                return false;
            default:
                xg0 xg0Var = (xg0) this.f34709b;
                xg0.k(xg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(xg0Var.E);
                xg0.l(xg0Var);
                xg0.m(xg0Var, f10, true, false);
                xg0Var.invalidate();
                xg0Var.N.a(true, true);
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        kj kjVar = (kj) this.f34709b;
        if (!kjVar.e && (view = kjVar.f35742a) != null) {
            view.callOnClick();
            kjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(float f10) {
        ((t10) this.f34709b).f38481f0.e(f10);
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override
    public void r(u6 u6Var, mh.a aVar, boolean z4) {
        HashSet hashSet;
        b7 b7Var = ((z6) this.f34709b).e;
        if (u6Var != null) {
            if (b7Var.V.f14180j.size() <= 0 && !z4) {
                if (b7Var.E > 0 && b7Var.getParentActivity() != null) {
                    u6Var.getClass();
                    boolean z10 = true;
                    mh.b bVar = new mh.b(true);
                    SparseArray sparseArray = u6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((v6) sparseArray.get(0)).f39086b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((v6) sparseArray.get(1)).f39086b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((v6) sparseArray.get(2)).f39086b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f14177f;
                    if (obj3 != null) {
                        arrayList3.addAll(((v6) sparseArray.get(3)).f39086b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f14178g;
                    if (obj4 != null) {
                        arrayList4.addAll(((v6) sparseArray.get(4)).f39086b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f14180j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((mh.a) arrayList.get(i10));
                        if (((mh.a) arrayList.get(i10)).d == 0) {
                            bVar.f14188r += ((mh.a) arrayList.get(i10)).f14171c;
                        } else {
                            bVar.f14189s += ((mh.a) arrayList.get(i10)).f14171c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((mh.a) arrayList2.get(i11));
                        bVar.f14190t += ((mh.a) arrayList2.get(i11)).f14171c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((mh.a) arrayList3.get(i12));
                        bVar.f14191u += ((mh.a) arrayList3.get(i12)).f14171c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((mh.a) arrayList4.get(i13));
                        bVar.v += ((mh.a) arrayList4.get(i13)).f14171c;
                        i13++;
                        z10 = true;
                    }
                    bVar.f14183m = z10;
                    bVar.f14184n = z10;
                    bVar.f14185o = z10;
                    bVar.f14186p = z10;
                    bVar.f14187q = z10;
                    Collections.sort(arrayList, new e5.f(22));
                    Collections.sort(arrayList2, new e5.f(22));
                    Collections.sort(arrayList3, new e5.f(22));
                    Collections.sort(arrayList4, new e5.f(22));
                    Collections.sort(bVar.h, new e5.f(22));
                    gv gvVar = new gv(b7Var, u6Var, bVar, new n7.qa(9, b7Var, u6Var));
                    b7Var.Q = gvVar;
                    b7Var.showDialog(gvVar);
                    return;
                }
                return;
            }
            mh.b bVar2 = b7Var.V;
            HashSet hashSet2 = bVar2.f14180j;
            HashSet hashSet3 = bVar2.f14182l;
            long j10 = u6Var.f38849a;
            SparseArray sparseArray2 = u6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((v6) sparseArray2.valueAt(i14)).f39086b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        mh.a aVar2 = (mh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f14181k += aVar2.f14171c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((v6) sparseArray2.valueAt(i16)).f39086b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        mh.a aVar3 = (mh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f14181k -= aVar3.f14171c;
                        }
                    }
                }
            }
            bVar2.c();
            b7Var.K.d();
            b7.g0(b7Var);
        } else if (aVar != null) {
            b7Var.V.i(aVar);
            b7Var.K.d();
            b7.g0(b7Var);
        }
    }

    @Override
    public void r0(String str) {
        ((gk) this.f34709b).f34635b.da(str, false);
    }

    @Override
    public void t0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((c60) this.f34709b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void u0(int i10, int i11, boolean z4) {
        fg.j jVar;
        switch (this.f34708a) {
            case 18:
                fg.j jVar2 = ((f20) this.f34709b).f34142c.f6119c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (jVar = ((f20) this.f34709b).f34142c.f6119c) != null) {
                    jVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void v0(float f10) {
        switch (this.f34708a) {
            case 6:
            case 11:
                return;
            default:
                kv kvVar = (kv) this.f34709b;
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 != 0 || kvVar.f35821f[1].getVisibility() == 0) {
                    if (kvVar.f35823r) {
                        jv jvVar = kvVar.f35821f[0];
                        jvVar.setTranslationX((-f10) * jvVar.getMeasuredWidth());
                        jv[] jvVarArr = kvVar.f35821f;
                        jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth() - (f10 * kvVar.f35821f[0].getMeasuredWidth()));
                    } else {
                        jv jvVar2 = kvVar.f35821f[0];
                        jvVar2.setTranslationX(jvVar2.getMeasuredWidth() * f10);
                        jv[] jvVarArr2 = kvVar.f35821f;
                        jvVarArr2[1].setTranslationX((f10 * jvVarArr2[0].getMeasuredWidth()) - kvVar.f35821f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        jv[] jvVarArr3 = kvVar.f35821f;
                        jv jvVar3 = jvVarArr3[0];
                        jvVarArr3[0] = jvVarArr3[1];
                        jvVarArr3[1] = jvVar3;
                        jvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public void w0(MessageObject messageObject) {
        p3 p3Var = ((l4) this.f34709b).f35945r0[0];
        if (p3Var != null) {
            p3Var.f37159b.I0(true);
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20222v3;
    }

    @Override
    public int x0(int i10) {
        gp0 gp0Var = (gp0) this.f34709b;
        int indexOfKey = gp0Var.f34659s.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return gp0Var.f34659s.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = gp0Var.f34658r;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public boolean y2(int i10) {
        return false;
    }

    @Override
    public void z() {
        int i10 = this.f34708a;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        sb sbVar = (sb) this.f34709b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (sbVar.f38270q0.contains(Long.valueOf(j10))) {
                    sbVar.f38270q0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    sbVar.f38270q0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                sbVar.X0(true);
                sbVar.R0();
                sbVar.F.l();
                return;
            }
        }
        sbVar.P0(view, f10, f11);
    }

    private final void H1(float f10) {
    }

    private final void L1(float f10) {
    }

    private final void N1() {
    }

    private final void Q1() {
    }

    private final void U1() {
    }

    private final void W1() {
    }

    private final void b2() {
    }

    private final void c2(boolean z4) {
    }

    private final void g2(boolean z4) {
    }

    private final void p1() {
    }

    private final void q1() {
    }

    private final void s1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void A2() {
    }

    @Override
    public void B0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void C0() {
    }

    @Override
    public void E1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.t1 t1Var) {
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
    public void L0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(MessageObject messageObject) {
    }

    @Override
    public void P0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void Q0(int i10) {
    }

    @Override
    public void S0(MrzRecognizer.Result result) {
    }

    @Override
    public void U(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void V() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void a1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void i1() {
    }

    @Override
    public void i2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void l1() {
    }

    @Override
    public void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void o() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void t2() {
    }

    @Override
    public void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void v(jk0 jk0Var) {
    }

    @Override
    public void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void G1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public void J1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K0(int i10, int i11) {
    }

    @Override
    public void M(org.telegram.ui.Cells.t1 t1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void R0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X(boolean z4, boolean z10) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void k2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public void o1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void B1(View view, float f10, float f11) {
    }

    private final void C1(View view, float f10, float f11) {
    }

    private final void t1(View view, float f10, float f11) {
    }

    private final void u1(View view, float f10, float f11) {
    }

    private final void v1(View view, float f10, float f11) {
    }

    private final void w1(View view, float f10, float f11) {
    }

    private final void y1(View view, float f10, float f11) {
    }

    private final void z1(View view, float f10, float f11) {
    }

    @Override
    public void B2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void e2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void v2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void F1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override
    public void T(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
