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
public final class h implements w9, yu0, org.telegram.ui.web.b1, org.telegram.ui.Components.io0, org.telegram.ui.Components.y4, org.telegram.ui.Components.sm0, m7, nh.e9, org.telegram.ui.Components.il0, org.telegram.ui.Cells.j1, ad1, mm, yd.a, org.telegram.ui.Components.kl0, org.telegram.ui.Cells.o7, org.telegram.ui.Components.iq, org.telegram.ui.Components.aq0, f2.k0, org.telegram.ui.Components.g8, org.telegram.ui.Components.k20, r0.o, zt, k11, org.telegram.ui.ActionBar.f6 {
    public final int f34531a;
    public final Object f34532b;

    public h(Object obj, int i10) {
        this.f34531a = i10;
        this.f34532b = obj;
    }

    @Override
    public void B() {
        switch (this.f34531a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((n5) this.f34532b).f36388b.N();
                return;
        }
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void C() {
        int i10 = this.f34531a;
    }

    @Override
    public String C0() {
        return null;
    }

    @Override
    public void D(int i10, int i11) {
        ((f2.o0) this.f34532b).p(i10, i11);
    }

    @Override
    public org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override
    public boolean F1() {
        return false;
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int H0(int i10) {
        switch (this.f34531a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        AndroidUtilities.runOnUIThread(new ah.b(this, i10, 13), 50L);
    }

    @Override
    public void K(String str) {
        i iVar = (i) this.f34532b;
        iVar.finishFragment(false);
        ss ssVar = iVar.f34781x;
        LaunchActivity launchActivity = (LaunchActivity) ssVar.f38303b;
        Pattern pattern = LaunchActivity.f31586y1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.f19565d0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.L).sendRequest(tL_auth_acceptLoginToken, new no(27, d2Var, (i) ssVar.f38304c));
    }

    @Override
    public boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void L0(int i10, int i11) {
        ((f2.o0) this.f34532b).t(i10, i11);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        ui0 ui0Var = (ui0) this.f34532b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ui0Var.e = defaultWindowInsets;
        ui0Var.D.setPadding(defaultWindowInsets.f7196a, defaultWindowInsets.f7197b, defaultWindowInsets.f7198c, defaultWindowInsets.d);
        ui0Var.C.requestLayout();
        return r0.m1.f43153b;
    }

    @Override
    public boolean M1() {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public void Q0(int i10, int i11) {
        g70 g70Var = (g70) this.f34532b;
        g70Var.T = i10;
        AndroidUtilities.updateVisibleRows(g70Var.f34341b);
    }

    @Override
    public boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean T0() {
        return false;
    }

    @Override
    public boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean V0(long j10, int i10, int i11, int i12, nh.f9 f9Var) {
        l8 l8Var = (l8) this.f34532b;
        if (l8Var.f35674b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= l8Var.f35674b.getChildCount()) {
                    break;
                }
                View childAt = l8Var.f35674b.getChildAt(i13);
                if (childAt instanceof i8) {
                    i8 i8Var = (i8) childAt;
                    if (i8Var.f34832n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < i8Var.f34832n.size(); i14++) {
                            ArrayList arrayList = ((j8) i8Var.f34832n.valueAt(i14)).f35106b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = i8Var.f34832n.keyAt(i14);
                                l8Var.f35679e0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) i8Var.f34833r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.f15314c = imageReceiver;
                                    if (l8Var.f35681f0 == null) {
                                        l8Var.f35681f0 = new c1(this, 10);
                                    }
                                    f9Var.e = l8Var.f35681f0;
                                    f9Var.f15312a = i8Var;
                                    f9Var.f15316g = l8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.f15317i = l8Var.fragmentView.getBottom();
                                    f9Var.f15313b = null;
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
    public int W() {
        return 0;
    }

    @Override
    public void X0() {
        mj mjVar = (mj) this.f34532b;
        View view = mjVar.f36107a;
        if (view != null) {
            view.setPressed(false);
            mjVar.f36107a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && mjVar.f36107a.getBackground() != null) {
                mjVar.f36107a.getBackground().setVisible(false, false);
            }
        }
        View view2 = mjVar.f36111n;
        if (view2 != null && !mjVar.d) {
            view2.callOnClick();
            mjVar.d = true;
        }
    }

    @Override
    public void Y(float f10, boolean z4) {
        String formatString;
        switch (this.f34531a) {
            case 3:
                j4 j4Var = (j4) this.f34532b;
                int i10 = j4Var.f35079b;
                int round = Math.round(((j4Var.f35080c - i10) * f10) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    j4Var.f35081f.f36375r0[0].getAdapter().f35648y.clear();
                    n4 n4Var = j4Var.f35081f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        n4Var.f36375r0[i11].f37685c.l();
                        l4 l4Var = n4Var.f36375r0[i11].f37685c;
                        ArrayList arrayList = l4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(l4Var.H);
                        Utilities.globalQueue.postRunnable(l4Var.H, 100L);
                    }
                    j4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                ec0 ec0Var = (ec0) this.f34532b;
                gc0 gc0Var = ec0Var.f33781y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    gc0Var.Y();
                    ArrayList arrayList2 = gc0Var.f34414s;
                    if (arrayList2.isEmpty()) {
                        gc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new ac0(2, 0, formatString, 0, 0));
                        gc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ec0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                n5.d = f10;
                org.telegram.ui.Components.qv0 qv0Var = ((n5) this.f34532b).f36388b;
                qv0Var.M();
                qv0Var.N();
                return;
        }
    }

    @Override
    public void Y0(ut utVar) {
        uj0 uj0Var = (uj0) this.f34532b;
        uj0Var.B = true;
        String str = utVar.f38915c;
        uj0Var.L.setText(str);
        uj0Var.u(str, utVar);
        uj0Var.B = false;
        AndroidUtilities.runOnUIThread(new d10(this, 28), 300L);
        uj0Var.N.requestFocus();
        sj0 sj0Var = uj0Var.N;
        sj0Var.setSelection(sj0Var.length());
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f34531a) {
            case 12:
                dd ddVar = (dd) this.f34532b;
                f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
                    return f6Var2.a();
                }
                return org.telegram.ui.ActionBar.j6.I.q();
            default:
                return ((np0) this.f34532b).P;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void b0() {
        ((ck0) this.f34532b).a();
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        u10 u10Var = (u10) this.f34532b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            u10.a(u10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.q2) {
                if (!u10Var.f38653l0.f()) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                    if (q2Var.S(f10)) {
                        u10Var.f38647f0.f(q2Var);
                        return true;
                    }
                }
                u10.a(u10Var, ((org.telegram.ui.Cells.q2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public cv0 c2() {
        return null;
    }

    @Override
    public void clear() {
        ((b7) this.f34532b).e.m0();
    }

    @Override
    public void d(int i10, boolean z4) {
        boolean z10;
        switch (this.f34531a) {
            case 6:
                a6 a6Var = ((t5) this.f34532b).d;
                a6Var.Y = i10;
                a6Var.G0(true);
                return;
            case 11:
                cc ccVar = ((ac) this.f34532b).f32547f;
                ccVar.f33079y = i10;
                ccVar.d(true);
                return;
            default:
                mv mvVar = (mv) this.f34532b;
                if (mvVar.f36224f[0].f35931f != i10) {
                    if (i10 == mvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mvVar.f36228w = z10;
                    lv lvVar = mvVar.f36224f[1];
                    lvVar.f35931f = i10;
                    lvVar.setVisibility(0);
                    mvVar.m0(true);
                    mvVar.f36226r = z4;
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
    public void dismiss() {
        switch (this.f34531a) {
            case 7:
                return;
            default:
                ((g70) this.f34532b).f34347w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public TextureView e0() {
        return null;
    }

    @Override
    public boolean e2(long j10) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f1(int i10) {
        return x0(i10);
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f34531a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void g1() {
        d7 d7Var = ((b7) this.f34532b).e;
        mh.b bVar = d7Var.V;
        if (bVar != null && bVar.f14168j.size() > 0) {
            d7Var.V.d();
            a7 a7Var = d7Var.K;
            if (a7Var != null) {
                a7Var.e(false);
                d7Var.K.d();
            }
        }
    }

    @Override
    public boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f34531a) {
            case 3:
                j4 j4Var = (j4) this.f34532b;
                int i10 = j4Var.f35079b;
                return String.valueOf(Math.round((j4Var.f35078a.getProgress() * (j4Var.f35080c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        np0 np0Var = (np0) this.f34532b;
        if (str.equals("drawableMsgIn")) {
            return np0Var.f36568w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return np0Var.f36569x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = np0Var.f36567s;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f34531a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((u10) this.f34532b).f38647f0.finish();
    }

    @Override
    public void h0(int i10, int i11) {
        ((f2.o0) this.f34532b).s(i10, i11);
    }

    @Override
    public boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.f34531a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        ub ubVar = ((qb) this.f34532b).f37374n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            ze.d.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ze.d.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public int j0() {
        switch (this.f34531a) {
            case 3:
                j4 j4Var = (j4) this.f34532b;
                return j4Var.f35080c - j4Var.f35079b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void j1(int i10, int i11) {
        ((f2.o0) this.f34532b).r(i10, i11, null);
    }

    @Override
    public void k(boolean z4) {
        int i10 = this.f34531a;
    }

    @Override
    public int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public boolean k1(int i10, View view) {
        switch (this.f34531a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public void l1(boolean z4) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        dd ddVar = (dd) this.f34532b;
        f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
        if (f6Var instanceof cd) {
            f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            dd ddVar2 = ((cd) f6Var2).f33082a;
            ddVar2.G = !ddVar2.G;
            ddVar2.d1();
            ddVar2.Z0(false);
        }
        ddVar.U0(a(), false);
        ddVar.Z0(false);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f34531a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.f34531a) {
            case 15:
                return ((jy) this.f34532b).B0.isInPreviewMode();
            default:
                zg0 zg0Var = (zg0) this.f34532b;
                View view2 = null;
                zg0Var.L = null;
                int childCount = zg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = zg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !zg0Var.M.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        switch (this.f34531a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o0(String str) {
        ((ik) this.f34532b).f34992b.da(str, false);
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.f34531a) {
            case 15:
                e5Var = ((org.telegram.ui.ActionBar.p2) ((jy) this.f34532b).B0).parentLayout;
                ((ActionBarLayout) e5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        int i10 = this.f34531a;
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
        int i10 = this.f34531a;
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        int i10 = this.f34531a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        mj mjVar = (mj) this.f34532b;
        View view = mjVar.f36107a;
        if (view != null) {
            view.setPressed(true);
            mjVar.f36107a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && mjVar.f36107a.getBackground() != null) {
                mjVar.f36107a.getBackground().setVisible(true, false);
            }
            mjVar.f36107a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        mj mjVar = (mj) this.f34532b;
        zn znVar = mjVar.f36114w;
        if (mjVar.f36107a != null) {
            znVar.N8 = org.telegram.ui.Components.h9.b(znVar, mjVar.v, znVar.Q5, znVar.d(), znVar.f40534ba);
            org.telegram.ui.ActionBar.p1 p1Var = znVar.N8;
            if (p1Var != null) {
                mjVar.f36108b = p1Var;
                p1Var.setOnDismissListener(new h0(mjVar, 2));
                znVar.f40759u0.B0();
                znVar.f40786w0.R = false;
                View view = mjVar.v;
                znVar.ob(view);
                if (view != znVar.f40589g1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                znVar.g8(false, z4, 0.3f);
                znVar.h9(false);
                il ilVar = znVar.f40789w3;
                if (ilVar != null) {
                    ilVar.e(1, true);
                }
                UndoView undoView = znVar.f40775v3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                lk lkVar = znVar.V;
                if (lkVar != null && lkVar.getEditField() != null) {
                    znVar.V.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.f34531a) {
            case 15:
                return;
            default:
                zg0 zg0Var = (zg0) this.f34532b;
                zg0.k(zg0Var, view, f10, f11);
                zg0.m(zg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(zg0Var.E, 450L);
                zg0Var.L = null;
                zg0Var.invalidate();
                zg0Var.N.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.f34531a) {
            case 15:
                return;
            default:
                zg0 zg0Var = (zg0) this.f34532b;
                zg0.k(zg0Var, view, f10, f11);
                zg0.m(zg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(zg0Var.E, 450L);
                View view2 = zg0Var.L;
                if (view2 != null) {
                    view2.performClick();
                }
                zg0Var.L = null;
                zg0Var.invalidate();
                zg0Var.N.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.f34531a) {
            case 15:
                return;
            default:
                zg0 zg0Var = (zg0) this.f34532b;
                zg0.k(zg0Var, view, f10, f11);
                zg0.m(zg0Var, f10, false, false);
                zg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.f34531a) {
            case 15:
                return false;
            default:
                zg0 zg0Var = (zg0) this.f34532b;
                zg0.k(zg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(zg0Var.E);
                zg0.l(zg0Var);
                zg0.m(zg0Var, f10, true, false);
                zg0Var.invalidate();
                zg0Var.N.a(true, true);
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
        mj mjVar = (mj) this.f34532b;
        if (!mjVar.e && (view = mjVar.f36107a) != null) {
            view.callOnClick();
            mjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(float f10) {
        ((u10) this.f34532b).f38647f0.e(f10);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((e60) this.f34532b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void r(w6 w6Var, mh.a aVar, boolean z4) {
        HashSet hashSet;
        d7 d7Var = ((b7) this.f34532b).e;
        if (w6Var != null) {
            if (d7Var.V.f14168j.size() <= 0 && !z4) {
                if (d7Var.E > 0 && d7Var.getParentActivity() != null) {
                    w6Var.getClass();
                    boolean z10 = true;
                    mh.b bVar = new mh.b(true);
                    SparseArray sparseArray = w6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((x6) sparseArray.get(0)).f39847b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((x6) sparseArray.get(1)).f39847b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((x6) sparseArray.get(2)).f39847b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f14165f;
                    if (obj3 != null) {
                        arrayList3.addAll(((x6) sparseArray.get(3)).f39847b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f14166g;
                    if (obj4 != null) {
                        arrayList4.addAll(((x6) sparseArray.get(4)).f39847b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f14168j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((mh.a) arrayList.get(i10));
                        if (((mh.a) arrayList.get(i10)).d == 0) {
                            bVar.f14176r += ((mh.a) arrayList.get(i10)).f14159c;
                        } else {
                            bVar.f14177s += ((mh.a) arrayList.get(i10)).f14159c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((mh.a) arrayList2.get(i11));
                        bVar.f14178t += ((mh.a) arrayList2.get(i11)).f14159c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((mh.a) arrayList3.get(i12));
                        bVar.f14179u += ((mh.a) arrayList3.get(i12)).f14159c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((mh.a) arrayList4.get(i13));
                        bVar.v += ((mh.a) arrayList4.get(i13)).f14159c;
                        i13++;
                        z10 = true;
                    }
                    bVar.f14171m = z10;
                    bVar.f14172n = z10;
                    bVar.f14173o = z10;
                    bVar.f14174p = z10;
                    bVar.f14175q = z10;
                    Collections.sort(arrayList, new e5.e(22));
                    Collections.sort(arrayList2, new e5.e(22));
                    Collections.sort(arrayList3, new e5.e(22));
                    Collections.sort(arrayList4, new e5.e(22));
                    Collections.sort(bVar.h, new e5.e(22));
                    iv ivVar = new iv(d7Var, w6Var, bVar, new n7.qa(9, d7Var, w6Var));
                    d7Var.Q = ivVar;
                    d7Var.showDialog(ivVar);
                    return;
                }
                return;
            }
            mh.b bVar2 = d7Var.V;
            HashSet hashSet2 = bVar2.f14168j;
            HashSet hashSet3 = bVar2.f14170l;
            long j10 = w6Var.f39277a;
            SparseArray sparseArray2 = w6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((x6) sparseArray2.valueAt(i14)).f39847b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        mh.a aVar2 = (mh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f14169k += aVar2.f14159c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((x6) sparseArray2.valueAt(i16)).f39847b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        mh.a aVar3 = (mh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f14169k -= aVar3.f14159c;
                        }
                    }
                }
            }
            bVar2.c();
            d7Var.K.d();
            d7.g0(d7Var);
        } else if (aVar != null) {
            d7Var.V.i(aVar);
            d7Var.K.d();
            d7.g0(d7Var);
        }
    }

    @Override
    public void r0(int i10, int i11, boolean z4) {
        fg.j jVar;
        switch (this.f34531a) {
            case 18:
                fg.j jVar2 = ((h20) this.f34532b).f34553c.f6119c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (jVar = ((h20) this.f34532b).f34553c.f6119c) != null) {
                    jVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean t0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override
    public void u0(float f10) {
        switch (this.f34531a) {
            case 6:
            case 11:
                return;
            default:
                mv mvVar = (mv) this.f34532b;
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 != 0 || mvVar.f36224f[1].getVisibility() == 0) {
                    if (mvVar.f36226r) {
                        lv lvVar = mvVar.f36224f[0];
                        lvVar.setTranslationX((-f10) * lvVar.getMeasuredWidth());
                        lv[] lvVarArr = mvVar.f36224f;
                        lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth() - (f10 * mvVar.f36224f[0].getMeasuredWidth()));
                    } else {
                        lv lvVar2 = mvVar.f36224f[0];
                        lvVar2.setTranslationX(lvVar2.getMeasuredWidth() * f10);
                        lv[] lvVarArr2 = mvVar.f36224f;
                        lvVarArr2[1].setTranslationX((f10 * lvVarArr2[0].getMeasuredWidth()) - mvVar.f36224f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        lv[] lvVarArr3 = mvVar.f36224f;
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
    public String w(long j10) {
        return null;
    }

    @Override
    public void w0(MessageObject messageObject) {
        r3 r3Var = ((n4) this.f34532b).f36375r0[0];
        if (r3Var != null) {
            r3Var.f37684b.I0(true);
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20197v3;
    }

    @Override
    public int x0(int i10) {
        np0 np0Var = (np0) this.f34532b;
        int indexOfKey = np0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return np0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = np0Var.f36567s;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public void z() {
        int i10 = this.f34531a;
    }

    @Override
    public void z0(long j10, int i10, nh.k3 k3Var) {
        l8 l8Var = (l8) this.f34532b;
        if (l8Var.f35674b == null) {
            k3Var.run();
        }
        l8Var.f35674b.post(k3Var);
    }

    @Override
    public boolean z2(int i10) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.f34532b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (ubVar.f38749q0.contains(Long.valueOf(j10))) {
                    ubVar.f38749q0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.f38749q0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.X0(true);
                ubVar.R0();
                ubVar.F.l();
                return;
            }
        }
        ubVar.P0(view, f10, f11);
    }

    private final void E1(float f10) {
    }

    private final void G1(float f10) {
    }

    private final void J1() {
    }

    private final void N1() {
    }

    private final void P1() {
    }

    private final void W1() {
    }

    private final void X1() {
    }

    private final void b2(boolean z4) {
    }

    private final void d2(boolean z4) {
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void q1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void B2() {
    }

    @Override
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void E0() {
    }

    @Override
    public void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O0(int i10) {
    }

    @Override
    public void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void Q1(MessageObject messageObject) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void V() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void o() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void s0(String str) {
    }

    @Override
    public void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void v(lk0 lk0Var) {
    }

    @Override
    public void v2() {
    }

    @Override
    public void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X(boolean z4, boolean z10) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void B1(View view, float f10, float f11) {
    }

    private final void C1(View view, float f10, float f11) {
    }

    private final void s1(View view, float f10, float f11) {
    }

    private final void t1(View view, float f10, float f11) {
    }

    private final void v1(View view, float f10, float f11) {
    }

    private final void w1(View view, float f10, float f11) {
    }

    private final void x1(View view, float f10, float f11) {
    }

    private final void y1(View view, float f10, float f11) {
    }

    @Override
    public void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void D1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override
    public void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
