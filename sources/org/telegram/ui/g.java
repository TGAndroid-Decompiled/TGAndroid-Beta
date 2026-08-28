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
public final class g implements r9, ju0, org.telegram.ui.web.x0, org.telegram.ui.Components.on0, org.telegram.ui.Components.x4, org.telegram.ui.Components.wl0, h7, ih.i9, org.telegram.ui.Components.nk0, org.telegram.ui.Cells.k1, fc1, cm, ud.a, org.telegram.ui.Components.pk0, org.telegram.ui.Cells.p7, org.telegram.ui.Components.bq, org.telegram.ui.Components.gp0, f2.o0, org.telegram.ui.Components.g8, org.telegram.ui.Components.t10, r0.o, pt, r01, org.telegram.ui.ActionBar.b6 {
    public final int f38387a;
    public final Object f38388b;

    public g(Object obj, int i9) {
        this.f38387a = i9;
        this.f38388b = obj;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        AndroidUtilities.runOnUIThread(new bg.c2(this, i9, 15), 50L);
    }

    @Override
    public String C(long j10) {
        return null;
    }

    @Override
    public String C0() {
        return null;
    }

    @Override
    public void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public void E() {
        ((vj0) this.f38388b).a();
    }

    @Override
    public CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public TextureView G() {
        return null;
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.f23317v3;
    }

    @Override
    public int H0(int i9) {
        switch (this.f38387a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void H1() {
        y6 y6Var = ((w6) this.f38388b).f43679e;
        hh.b bVar = y6Var.U;
        if (bVar != null && bVar.f10793j.size() > 0) {
            y6Var.U.d();
            v6 v6Var = y6Var.J;
            if (v6Var != null) {
                v6Var.e(false);
                y6Var.J.d();
            }
        }
    }

    @Override
    public void I(int i9, int i10) {
        ((f2.r0) this.f38388b).s(i9, i10);
    }

    @Override
    public void J0(int i9, int i10) {
        ((f2.r0) this.f38388b).t(i9, i10);
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f38388b;
        hVar.finishFragment(false);
        yr yrVar = hVar.f38632x;
        LaunchActivity launchActivity = (LaunchActivity) yrVar.f44934b;
        Pattern pattern = LaunchActivity.f35493x1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.f22766c0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.K).sendRequest(tL_auth_acceptLoginToken, new v40(4, c2Var, (h) yrVar.f44935c));
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    @Override
    public void L(String str) {
        ((xj) this.f38388b).f44534b.da(str, false);
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        li0 li0Var = (li0) this.f38388b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        li0Var.f40154e = defaultWindowInsets;
        li0Var.C.setPadding(defaultWindowInsets.f10848a, defaultWindowInsets.f10849b, defaultWindowInsets.f10850c, defaultWindowInsets.d);
        li0Var.B.requestLayout();
        return r0.m1.f46928b;
    }

    @Override
    public int N0(int i9) {
        zo0 zo0Var = (zo0) this.f38388b;
        int indexOfKey = zo0Var.f45199s.indexOfKey(i9);
        if (indexOfKey >= 0) {
            return zo0Var.f45199s.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.b6 b6Var = zo0Var.f45198r;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override
    public Paint O(String str) {
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public nu0 P1() {
        return null;
    }

    @Override
    public void Q(float f10, boolean z10) {
        String formatString;
        switch (this.f38387a) {
            case 3:
                h4 h4Var = (h4) this.f38388b;
                int i9 = h4Var.f38673b;
                int round = Math.round(((h4Var.f38674c - i9) * f10) + i9);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    h4Var.f38676f.f40026q0[0].getAdapter().f39367y.clear();
                    l4 l4Var = h4Var.f38676f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        l4Var.f40026q0[i10].f41321c.l();
                        j4 j4Var = l4Var.f40026q0[i10].f41321c;
                        ArrayList arrayList = j4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(j4Var.G);
                        Utilities.globalQueue.postRunnable(j4Var.G, 100L);
                    }
                    h4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                qb0 qb0Var = (qb0) this.f38388b;
                sb0 sb0Var = qb0Var.f41752y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    sb0Var.X();
                    ArrayList arrayList2 = sb0Var.f42656s;
                    if (arrayList2.isEmpty()) {
                        sb0Var.W();
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
                i5.d = f10;
                org.telegram.ui.Components.xu0 xu0Var = ((i5) this.f38388b).f39009b;
                xu0Var.M();
                xu0Var.N();
                return;
        }
    }

    @Override
    public boolean R1(long j10) {
        return false;
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public void T(long j10, int i9, ih.n3 n3Var) {
        g8 g8Var = (g8) this.f38388b;
        if (g8Var.f38448b == null) {
            n3Var.run();
        }
        g8Var.f38448b.post(n3Var);
    }

    @Override
    public boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void V0(int i9, int i10) {
        r60 r60Var = (r60) this.f38388b;
        r60Var.S = i9;
        AndroidUtilities.updateVisibleRows(r60Var.f42278b);
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean X0() {
        return false;
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        switch (this.f38387a) {
            case 12:
                xc xcVar = (xc) this.f38388b;
                b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
                if (b6Var != null) {
                    b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
                    return b6Var2.a();
                }
                return org.telegram.ui.ActionBar.f6.I.q();
            default:
                return ((zo0) this.f38388b).F;
        }
    }

    @Override
    public void a1(lt ltVar) {
        nj0 nj0Var = (nj0) this.f38388b;
        nj0Var.A = true;
        String str = ltVar.f40227c;
        nj0Var.K.setText(str);
        nj0Var.u(str, ltVar);
        nj0Var.A = false;
        AndroidUtilities.runOnUIThread(new o00(this, 28), 300L);
        nj0Var.M.requestFocus();
        kj0 kj0Var = nj0Var.M;
        kj0Var.setSelection(kj0Var.length());
    }

    @Override
    public void b(int i9, boolean z10) {
        boolean z11;
        switch (this.f38387a) {
            case 6:
                u5 u5Var = ((o5) this.f38388b).d;
                u5Var.X = i9;
                u5Var.F0(true);
                return;
            case 11:
                xb xbVar = ((vb) this.f38388b).f43421f;
                xbVar.f44455y = i9;
                xbVar.d(true);
                return;
            default:
                bv bvVar = (bv) this.f38388b;
                if (bvVar.f37000f[0].f36560f != i9) {
                    if (i9 == bvVar.f36999e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bvVar.f37004w = z11;
                    av avVar = bvVar.f37000f[1];
                    avVar.f36560f = i9;
                    avVar.setVisibility(0);
                    bvVar.l0(true);
                    bvVar.f37002r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public void b1() {
        cj cjVar = (cj) this.f38388b;
        View view = cjVar.f37222a;
        if (view != null) {
            view.setPressed(false);
            cjVar.f37222a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && cjVar.f37222a.getBackground() != null) {
                cjVar.f37222a.getBackground().setVisible(false, false);
            }
        }
        View view2 = cjVar.f37227n;
        if (view2 != null && !cjVar.d) {
            view2.callOnClick();
            cjVar.d = true;
        }
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        f10 f10Var = (f10) this.f38388b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            f10.a(f10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.l7) {
            f10.a(f10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            f10.a(f10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            f10.a(f10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!f10Var.f38100k0.f()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.R(f10)) {
                        f10Var.f38093e0.f(r2Var);
                        return true;
                    }
                }
                f10.a(f10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public int c0() {
        switch (this.f38387a) {
            case 3:
                h4 h4Var = (h4) this.f38388b;
                return h4Var.f38674c - h4Var.f38673b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void clear() {
        ((w6) this.f38388b).f43679e.l0();
    }

    @Override
    public pg.a d0() {
        return null;
    }

    @Override
    public void dismiss() {
        switch (this.f38387a) {
            case 7:
                return;
            default:
                ((r60) this.f38388b).f42285w.d(true);
                return;
        }
    }

    @Override
    public void e(boolean z10) {
        int i9 = this.f38387a;
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f38387a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38387a) {
            case 3:
                h4 h4Var = (h4) this.f38388b;
                int i9 = h4Var.f38673b;
                return String.valueOf(Math.round((h4Var.f38672a.getProgress() * (h4Var.f38674c - i9)) + i9));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        zo0 zo0Var = (zo0) this.f38388b;
        if (str.equals("drawableMsgIn")) {
            return zo0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return zo0Var.f45200w;
        }
        org.telegram.ui.ActionBar.b6 b6Var = zo0Var.f45198r;
        if (b6Var != null) {
            return b6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.f6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f38387a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void h0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((o50) this.f38388b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.f38387a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        ((f10) this.f38388b).f38093e0.finish();
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void j1(int i9, int i10) {
        ((f2.r0) this.f38388b).r(i9, i10, null);
    }

    @Override
    public void k() {
        int i9 = this.f38387a;
    }

    @Override
    public boolean k1(int i9, View view) {
        switch (this.f38387a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public void m() {
        pb pbVar = ((lb) this.f38388b).f40103n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            ve.e.s(pbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ve.e.s(pbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void m1(boolean z10) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        xc xcVar = (xc) this.f38388b;
        b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
        if (b6Var instanceof wc) {
            b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            xc xcVar2 = ((wc) b6Var2).f43726a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        }
        xcVar.U0(a(), false);
        xcVar.Z0(false);
    }

    @Override
    public void n() {
        switch (this.f38387a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f38388b).f39009b.N();
                return;
        }
    }

    @Override
    public void n0(int i9, int i10, boolean z10) {
        ag.k kVar;
        switch (this.f38387a) {
            case 18:
                ag.k kVar2 = ((r10) this.f38388b).f42251c.f164c;
                if (kVar2 != null) {
                    kVar2.C = i9;
                    return;
                }
                return;
            default:
                if (i10 == 0 && (kVar = ((r10) this.f38388b).f42251c.f164c) != null) {
                    kVar.B = i9;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean n2(int i9) {
        return false;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f38387a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.f38387a) {
            case 15:
                return ((vx) this.f38388b).A0.isInPreviewMode();
            default:
                pg0 pg0Var = (pg0) this.f38388b;
                View view2 = null;
                pg0Var.K = null;
                int childCount = pg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = pg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !pg0Var.L.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        switch (this.f38387a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void o1(r6 r6Var, hh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = ((w6) this.f38388b).f43679e;
        if (r6Var != null) {
            if (y6Var.U.f10793j.size() <= 0 && !z10) {
                if (y6Var.D > 0 && y6Var.getParentActivity() != null) {
                    r6Var.getClass();
                    boolean z11 = true;
                    hh.b bVar = new hh.b(true);
                    SparseArray sparseArray = r6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((s6) sparseArray.get(0)).f42567b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((s6) sparseArray.get(1)).f42567b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f10789e;
                    if (obj2 != null) {
                        arrayList2.addAll(((s6) sparseArray.get(2)).f42567b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f10790f;
                    if (obj3 != null) {
                        arrayList3.addAll(((s6) sparseArray.get(3)).f42567b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f10791g;
                    if (obj4 != null) {
                        arrayList4.addAll(((s6) sparseArray.get(4)).f42567b);
                    }
                    int i9 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f10793j;
                        if (i9 >= size) {
                            break;
                        }
                        hashSet.add((hh.a) arrayList.get(i9));
                        if (((hh.a) arrayList.get(i9)).d == 0) {
                            bVar.f10801r += ((hh.a) arrayList.get(i9)).f10782c;
                        } else {
                            bVar.f10802s += ((hh.a) arrayList.get(i9)).f10782c;
                        }
                        i9++;
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        hashSet.add((hh.a) arrayList2.get(i10));
                        bVar.f10803t += ((hh.a) arrayList2.get(i10)).f10782c;
                    }
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        hashSet.add((hh.a) arrayList3.get(i11));
                        bVar.f10804u += ((hh.a) arrayList3.get(i11)).f10782c;
                    }
                    int i12 = 0;
                    while (i12 < arrayList4.size()) {
                        hashSet.add((hh.a) arrayList4.get(i12));
                        bVar.v += ((hh.a) arrayList4.get(i12)).f10782c;
                        i12++;
                        z11 = true;
                    }
                    bVar.f10796m = z11;
                    bVar.f10797n = z11;
                    bVar.f10798o = z11;
                    bVar.f10799p = z11;
                    bVar.f10800q = z11;
                    Collections.sort(arrayList, new a5.e(21));
                    Collections.sort(arrayList2, new a5.e(21));
                    Collections.sort(arrayList3, new a5.e(21));
                    Collections.sort(arrayList4, new a5.e(21));
                    Collections.sort(bVar.h, new a5.e(21));
                    xu xuVar = new xu(y6Var, r6Var, bVar, new g5.b(y6Var, r6Var, false, 29));
                    y6Var.P = xuVar;
                    y6Var.showDialog(xuVar);
                    return;
                }
                return;
            }
            hh.b bVar2 = y6Var.U;
            HashSet hashSet2 = bVar2.f10793j;
            HashSet hashSet3 = bVar2.f10795l;
            long j10 = r6Var.f42274a;
            SparseArray sparseArray2 = r6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                    ArrayList arrayList5 = ((s6) sparseArray2.valueAt(i13)).f42567b;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        hh.a aVar2 = (hh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f10794k += aVar2.f10782c;
                        }
                    }
                }
            } else {
                for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                    ArrayList arrayList6 = ((s6) sparseArray2.valueAt(i15)).f42567b;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj6 = arrayList6.get(i16);
                        i16++;
                        hh.a aVar3 = (hh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f10794k -= aVar3.f10782c;
                        }
                    }
                }
            }
            bVar2.c();
            y6Var.J.d();
            y6.f0(y6Var);
        } else if (aVar != null) {
            y6Var.U.i(aVar);
            y6Var.J.d();
            y6.f0(y6Var);
        }
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f38387a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.o2) ((vx) this.f38388b).A0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        int i9 = this.f38387a;
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
        int i9 = this.f38387a;
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        int i9 = this.f38387a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        cj cjVar = (cj) this.f38388b;
        View view = cjVar.f37222a;
        if (view != null) {
            view.setPressed(true);
            cjVar.f37222a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && cjVar.f37222a.getBackground() != null) {
                cjVar.f37222a.getBackground().setVisible(true, false);
            }
            cjVar.f37222a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z10;
        cj cjVar = (cj) this.f38388b;
        qn qnVar = cjVar.f37230w;
        if (cjVar.f37222a != null) {
            qnVar.M8 = org.telegram.ui.Components.g9.b(qnVar, cjVar.v, qnVar.P5, qnVar.b(), qnVar.f41848aa);
            org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
            if (o1Var != null) {
                cjVar.f37223b = o1Var;
                o1Var.setOnDismissListener(new g0(cjVar, 2));
                qnVar.f42077t0.B0();
                qnVar.f42103v0.R = false;
                View view = cjVar.v;
                qnVar.ob(view);
                if (view != qnVar.f41905f1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qnVar.g8(false, z10, 0.3f);
                qnVar.h9(false);
                xk xkVar = qnVar.f42106v3;
                if (xkVar != null) {
                    xkVar.e(1, true);
                }
                UndoView undoView = qnVar.f42093u3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ak akVar = qnVar.U;
                if (akVar != null && akVar.getEditField() != null) {
                    qnVar.U.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.f38387a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f38388b;
                pg0.k(pg0Var, view, f10, f11);
                pg0.m(pg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.D, 450L);
                pg0Var.K = null;
                pg0Var.invalidate();
                pg0Var.M.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.f38387a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f38388b;
                pg0.k(pg0Var, view, f10, f11);
                pg0.m(pg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.D, 450L);
                View view2 = pg0Var.K;
                if (view2 != null) {
                    view2.performClick();
                }
                pg0Var.K = null;
                pg0Var.invalidate();
                pg0Var.M.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.f38387a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f38388b;
                pg0.k(pg0Var, view, f10, f11);
                pg0.m(pg0Var, f10, false, false);
                pg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.f38387a) {
            case 15:
                return false;
            default:
                pg0 pg0Var = (pg0) this.f38388b;
                pg0.k(pg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(pg0Var.D);
                pg0.l(pg0Var);
                pg0.m(pg0Var, f10, true, false);
                pg0Var.invalidate();
                pg0Var.M.a(true, true);
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
        cj cjVar = (cj) this.f38388b;
        if (!cjVar.f37225e && (view = cjVar.f37222a) != null) {
            view.callOnClick();
            cjVar.f37225e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p() {
        int i9 = this.f38387a;
    }

    @Override
    public int p0(int i9) {
        return N0(i9);
    }

    @Override
    public int q1(int i9) {
        return N0(i9);
    }

    @Override
    public org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override
    public boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public void t(int i9, int i10) {
        ((f2.r0) this.f38388b).p(i9, i10);
    }

    @Override
    public boolean t0() {
        return false;
    }

    @Override
    public void u(float f10) {
        ((f10) this.f38388b).f38093e0.d(f10);
    }

    @Override
    public void v0(float f10) {
        switch (this.f38387a) {
            case 6:
            case 11:
                return;
            default:
                bv bvVar = (bv) this.f38388b;
                int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i9 != 0 || bvVar.f37000f[1].getVisibility() == 0) {
                    if (bvVar.f37002r) {
                        av avVar = bvVar.f37000f[0];
                        avVar.setTranslationX((-f10) * avVar.getMeasuredWidth());
                        av[] avVarArr = bvVar.f37000f;
                        avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth() - (f10 * bvVar.f37000f[0].getMeasuredWidth()));
                    } else {
                        av avVar2 = bvVar.f37000f[0];
                        avVar2.setTranslationX(avVar2.getMeasuredWidth() * f10);
                        av[] avVarArr2 = bvVar.f37000f;
                        avVarArr2[1].setTranslationX((f10 * avVarArr2[0].getMeasuredWidth()) - bvVar.f37000f[0].getMeasuredWidth());
                    }
                    if (i9 == 0) {
                        av[] avVarArr3 = bvVar.f37000f;
                        av avVar3 = avVarArr3[0];
                        avVarArr3[0] = avVarArr3[1];
                        avVarArr3[1] = avVar3;
                        avVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void x0(MessageObject messageObject) {
        p3 p3Var = ((l4) this.f38388b).f40026q0[0];
        if (p3Var != null) {
            p3Var.f41320b.I0(true);
        }
    }

    @Override
    public boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean y0(long j10, int i9, int i10, int i11, ih.j9 j9Var) {
        g8 g8Var = (g8) this.f38388b;
        if (g8Var.f38448b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= g8Var.f38448b.getChildCount()) {
                    break;
                }
                View childAt = g8Var.f38448b.getChildAt(i12);
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    if (d8Var.f37438n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < d8Var.f37438n.size(); i13++) {
                            ArrayList arrayList = ((e8) d8Var.f37438n.valueAt(i13)).f37840b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = d8Var.f37438n.keyAt(i13);
                                g8Var.f38452d0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) d8Var.f37439r.get(keyAt);
                                if (imageReceiver != null) {
                                    j9Var.f11644c = imageReceiver;
                                    if (g8Var.f38454e0 == null) {
                                        g8Var.f38454e0 = new b1(this, 10);
                                    }
                                    j9Var.f11645e = g8Var.f38454e0;
                                    j9Var.f11642a = d8Var;
                                    j9Var.f11647g = g8Var.fragmentView;
                                    j9Var.h = AndroidUtilities.dp(36.0f);
                                    j9Var.f11648i = g8Var.fragmentView.getBottom();
                                    j9Var.f11643b = null;
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                i12++;
            }
        }
        return false;
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        MessageObject messageObject;
        pb pbVar = (pb) this.f38388b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (pbVar.f41414p0.contains(Long.valueOf(j10))) {
                    pbVar.f41414p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    pbVar.f41414p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                pbVar.X0(true);
                pbVar.R0();
                pbVar.E.l();
                return;
            }
        }
        pbVar.P0(view, f10, f11);
    }

    private final void Y1(float f10) {
    }

    private final void Z1(float f10) {
    }

    private final void a2() {
    }

    private final void c2() {
    }

    private final void d2() {
    }

    private final void h2() {
    }

    private final void i2() {
    }

    private final void j2(boolean z10) {
    }

    private final void m2(boolean z10) {
    }

    private final void n1() {
    }

    private final void p1() {
    }

    private final void u1() {
    }

    @Override
    public void A() {
    }

    @Override
    public void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void B0() {
    }

    @Override
    public void C1(MessageObject messageObject) {
    }

    @Override
    public void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void I1() {
    }

    @Override
    public void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void P0(int i9) {
    }

    @Override
    public void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void U(MessageObject messageObject) {
    }

    @Override
    public void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void d(boolean z10) {
    }

    @Override
    public void d1() {
    }

    @Override
    public void g(ek0 ek0Var) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void h1() {
    }

    @Override
    public void i0(int i9) {
    }

    @Override
    public void k2() {
    }

    @Override
    public void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void w() {
    }

    @Override
    public void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void y(MessageObject messageObject) {
    }

    @Override
    public void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void D(boolean z10, boolean z11) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void c1(int i9, int i10) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override
    public void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B1(View view, float f10, float f11) {
    }

    private final void J1(View view, float f10, float f11) {
    }

    private final void K1(View view, float f10, float f11) {
    }

    private final void N1(View view, float f10, float f11) {
    }

    private final void Q1(View view, float f10, float f11) {
    }

    private final void T1(View view, float f10, float f11) {
    }

    private final void U1(View view, float f10, float f11) {
    }

    private final void V1(View view, float f10, float f11) {
    }

    private final void v1(View view, float f10, float f11) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }

    @Override
    public void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void X1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override
    public void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
