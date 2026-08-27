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

public final class g implements s9, ku0, org.telegram.ui.web.y0, org.telegram.ui.Components.pn0, org.telegram.ui.Components.x4, org.telegram.ui.Components.zl0, i7, jh.e9, org.telegram.ui.Components.qk0, org.telegram.ui.Cells.j1, ec1, em, vd.a, org.telegram.ui.Components.sk0, org.telegram.ui.Cells.m7, org.telegram.ui.Components.zp, org.telegram.ui.Components.gp0, f2.m0, org.telegram.ui.Components.f8, org.telegram.ui.Components.w10, r0.o, st, s01, org.telegram.ui.ActionBar.c6 {

    public final int f38247a;

    public final Object f38248b;

    public g(Object obj, int i10) {
        this.f38247a = i10;
        this.f38248b = obj;
    }

    @Override
    public void A(int i10, int i11) {
        ((f2.q0) this.f38248b).p(i10, i11);
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void C(String str) {
        h hVar = (h) this.f38248b;
        hVar.finishFragment(false);
        zr zrVar = hVar.f38639x;
        LaunchActivity launchActivity = (LaunchActivity) zrVar.f45241b;
        h hVar2 = (h) zrVar.f45242c;
        Pattern pattern = LaunchActivity.f35496x1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f22747c0 = false;
        b2Var.show();
        byte[] bArrDecode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = bArrDecode;
        ConnectionsManager.getInstance(launchActivity.K).sendRequest(tL_auth_acceptLoginToken, new v80(1, b2Var, hVar2));
    }

    @Override
    public int D0(int i10) {
        switch (this.f38247a) {
        }
        return 0;
    }

    @Override
    public void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.f23371v3;
    }

    @Override
    public CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public void G() {
        ((wj0) this.f38248b).a();
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new cg.w1(this, i10, 14), 50L);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ni0 ni0Var = (ni0) this.f38248b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ni0Var.f40847e = defaultWindowInsets;
        ni0Var.C.setPadding(defaultWindowInsets.f10489a, defaultWindowInsets.f10490b, defaultWindowInsets.f10491c, defaultWindowInsets.d);
        ni0Var.B.requestLayout();
        return r0.m1.f46618b;
    }

    @Override
    public void J(s6 s6Var, ih.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.f38248b).f44289e;
        if (s6Var == null) {
            if (aVar != null) {
                z6Var.U.i(aVar);
                z6Var.J.d();
                z6.g0(z6Var);
                return;
            }
            return;
        }
        if (z6Var.U.f11489j.size() > 0 || z10) {
            ih.b bVar = z6Var.U;
            HashSet hashSet2 = bVar.f11489j;
            HashSet hashSet3 = bVar.f11491l;
            long j10 = s6Var.f42522a;
            SparseArray sparseArray = s6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f42788b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ih.a aVar2 = (ih.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.f11490k -= aVar2.f11478c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((t6) sparseArray.valueAt(i12)).f42788b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ih.a aVar3 = (ih.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.f11490k += aVar3.f11478c;
                        }
                    }
                }
            }
            bVar.c();
            z6Var.J.d();
            z6.g0(z6Var);
            return;
        }
        if (z6Var.D <= 0 || z6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z11 = true;
        ih.b bVar2 = new ih.b(true);
        SparseArray sparseArray2 = s6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((t6) sparseArray2.get(0)).f42788b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((t6) sparseArray2.get(1)).f42788b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.f11485e;
        if (obj4 != null) {
            arrayList4.addAll(((t6) sparseArray2.get(2)).f42788b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f11486f;
        if (obj5 != null) {
            arrayList5.addAll(((t6) sparseArray2.get(3)).f42788b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.f11487g;
        if (obj6 != null) {
            arrayList6.addAll(((t6) sparseArray2.get(4)).f42788b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.f11489j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((ih.a) arrayList3.get(i14));
            if (((ih.a) arrayList3.get(i14)).d == 0) {
                bVar2.f11497r += ((ih.a) arrayList3.get(i14)).f11478c;
            } else {
                bVar2.f11498s += ((ih.a) arrayList3.get(i14)).f11478c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((ih.a) arrayList4.get(i15));
            bVar2.f11499t += ((ih.a) arrayList4.get(i15)).f11478c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((ih.a) arrayList5.get(i16));
            bVar2.f11500u += ((ih.a) arrayList5.get(i16)).f11478c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((ih.a) arrayList6.get(i17));
            bVar2.v += ((ih.a) arrayList6.get(i17)).f11478c;
            i17++;
            z11 = true;
        }
        bVar2.f11492m = z11;
        bVar2.f11493n = z11;
        bVar2.f11494o = z11;
        bVar2.f11495p = z11;
        bVar2.f11496q = z11;
        int i18 = 22;
        Collections.sort(arrayList3, new a5.f(i18));
        Collections.sort(arrayList4, new a5.f(i18));
        Collections.sort(arrayList5, new a5.f(i18));
        Collections.sort(arrayList6, new a5.f(i18));
        Collections.sort(bVar2.h, new a5.f(i18));
        av avVar = new av(z6Var, s6Var, bVar2, new i6(0, z6Var, s6Var));
        z6Var.P = avVar;
        z6Var.showDialog(avVar);
    }

    @Override
    public TextureView K() {
        return null;
    }

    @Override
    public void K0(int i10, int i11) {
        ((f2.q0) this.f38248b).t(i10, i11);
    }

    @Override
    public boolean L0(long j10) {
        return false;
    }

    @Override
    public boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public Paint N(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public int N0(int i10) {
        ap0 ap0Var = (ap0) this.f38248b;
        int iIndexOfKey = ap0Var.f36592s.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            return ap0Var.f36592s.valueAt(iIndexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = ap0Var.f36591r;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public ou0 O1() {
        return null;
    }

    @Override
    public void P(float f10, boolean z10) {
        switch (this.f38247a) {
            case 3:
                i4 i4Var = (i4) this.f38248b;
                int i10 = i4Var.f38971b;
                int iRound = Math.round(((i4Var.f38972c - i10) * f10) + i10);
                if (iRound != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = iRound;
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    editorEdit.commit();
                    i4Var.f38974f.f40347q0[0].getAdapter().f39597y.clear();
                    m4 m4Var = i4Var.f38974f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        m4Var.f40347q0[i11].f41497c.l();
                        k4 k4Var = m4Var.f40347q0[i11].f41497c;
                        ArrayList arrayList = k4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(k4Var.G);
                        Utilities.globalQueue.postRunnable(k4Var.G, 100L);
                    }
                    i4Var.invalidate();
                }
                break;
            case 4:
            default:
                vb0 vb0Var = (vb0) this.f38248b;
                xb0 xb0Var = vb0Var.f43412y;
                int iRound2 = Math.round(f10 * 100.0f);
                if (iRound2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(iRound2);
                    xb0Var.Y();
                    ArrayList arrayList2 = xb0Var.f44379s;
                    if (arrayList2.isEmpty()) {
                        xb0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new rb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        xb0Var.d.m(1);
                    }
                    if (iRound2 <= 0 || iRound2 >= 100) {
                        try {
                            vb0Var.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                j5.d = f10;
                org.telegram.ui.Components.zu0 zu0Var = ((j5) this.f38248b).f39254b;
                zu0Var.M();
                zu0Var.N();
                break;
        }
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public void S(int i10, int i11) {
        ((f2.q0) this.f38248b).s(i10, i11);
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public void V0(int i10, int i11) {
        u60 u60Var = (u60) this.f38248b;
        u60Var.S = i10;
        AndroidUtilities.updateVisibleRows(u60Var.f43134b);
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean X() {
        return false;
    }

    @Override
    public boolean X0() {
        return false;
    }

    @Override
    public boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public void Z0(nt ntVar) {
        oj0 oj0Var = (oj0) this.f38248b;
        oj0Var.A = true;
        String str = ntVar.f40917c;
        oj0Var.K.setText(str);
        oj0Var.v(str, ntVar);
        oj0Var.A = false;
        AndroidUtilities.runOnUIThread(new r00(this, 28), 300L);
        oj0Var.M.requestFocus();
        mj0 mj0Var = oj0Var.M;
        mj0Var.setSelection(mj0Var.length());
    }

    @Override
    public boolean a() {
        switch (this.f38247a) {
            case 12:
                xc xcVar = (xc) this.f38248b;
                return ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider != null ? ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider.a() : org.telegram.ui.ActionBar.g6.I.q();
            default:
                return ((ap0) this.f38248b).F;
        }
    }

    @Override
    public int a0() {
        switch (this.f38247a) {
            case 3:
                i4 i4Var = (i4) this.f38248b;
                return i4Var.f38972c - i4Var.f38971b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override
    public void b(int i10, boolean z10) {
        switch (this.f38247a) {
            case 6:
                v5 v5Var = ((p5) this.f38248b).d;
                v5Var.X = i10;
                v5Var.G0(true);
                break;
            case 11:
                yb ybVar = ((wb) this.f38248b).f43686f;
                ybVar.f44762y = i10;
                ybVar.d(true);
                break;
            default:
                ev evVar = (ev) this.f38248b;
                if (evVar.f37857f[0].f37557f != i10) {
                    evVar.f37861w = i10 == evVar.f37856e.getFirstTabId();
                    dv dvVar = evVar.f37857f[1];
                    dvVar.f37557f = i10;
                    dvVar.setVisibility(0);
                    evVar.m0(true);
                    evVar.f37859r = z10;
                    break;
                }
                break;
        }
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public void b1() {
        ej ejVar = (ej) this.f38248b;
        View view = ejVar.f37774a;
        if (view != null) {
            view.setPressed(false);
            ejVar.f37774a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ejVar.f37774a.getBackground() != null) {
                ejVar.f37774a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ejVar.f37779n;
        if (view2 == null || ejVar.d) {
            return;
        }
        view2.callOnClick();
        ejVar.d = true;
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        i10 i10Var = (i10) this.f38248b;
        if (view instanceof org.telegram.ui.Cells.f7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.e7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.d2) {
            i10.a(i10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            if (!i10Var.f38949k0.f()) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (p2Var.S(f10)) {
                    i10Var.f38942e0.f(p2Var);
                    return true;
                }
            }
            i10.a(i10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void clear() {
        ((x6) this.f38248b).f44289e.m0();
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public qg.a d0() {
        return null;
    }

    @Override
    public void dismiss() {
        switch (this.f38247a) {
            case 7:
                break;
            default:
                ((u60) this.f38248b).f43141w.d(true);
                break;
        }
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f38247a) {
        }
        return false;
    }

    @Override
    public void g(boolean z10) {
        int i10 = this.f38247a;
    }

    @Override
    public void g0(String str) {
        ((zj) this.f38248b).f45189b.da(str, false);
    }

    @Override
    public void g1(long j10, int i10, jh.l3 l3Var) {
        h8 h8Var = (h8) this.f38248b;
        if (h8Var.f38700b == null) {
            l3Var.run();
        }
        h8Var.f38700b.post(l3Var);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38247a) {
            case 3:
                i4 i4Var = (i4) this.f38248b;
                int i10 = i4Var.f38971b;
                return String.valueOf(Math.round((i4Var.f38970a.getProgress() * (i4Var.f38972c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        ap0 ap0Var = (ap0) this.f38248b;
        if (str.equals("drawableMsgIn")) {
            return ap0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return ap0Var.f36593w;
        }
        org.telegram.ui.ActionBar.c6 c6Var = ap0Var.f36591r;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f38247a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (((long) ViewConfiguration.getLongPressTimeout()) * 750) / 1000;
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public void h0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((s50) this.f38248b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void i() {
        ((i10) this.f38248b).f38942e0.finish();
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.f38247a) {
        }
        return false;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void k() {
        qb qbVar = ((mb) this.f38248b).f40428n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            we.e.s(qbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            we.e.s(qbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void k1(int i10, int i11) {
        ((f2.q0) this.f38248b).r(i10, i11, null);
    }

    @Override
    public boolean k2(int i10) {
        return false;
    }

    @Override
    public int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public boolean l1(int i10, View view) {
        switch (this.f38247a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override
    public void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override
    public void n() {
        int i10 = this.f38247a;
    }

    @Override
    public void n0(int i10, int i11, boolean z10) {
        bg.j jVar;
        switch (this.f38247a) {
            case 18:
                bg.j jVar2 = ((u10) this.f38248b).f43067c.f2090c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                }
                break;
            default:
                if (i11 == 0 && (jVar = ((u10) this.f38248b).f43067c.f2090c) != null) {
                    jVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override
    public void n1(boolean z10) {
        xc xcVar = (xc) this.f38248b;
        if (((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider instanceof wc) {
            xc xcVar2 = ((wc) ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider).f43700a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        }
        xcVar.U0(a(), false);
        xcVar.Z0(false);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f38247a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.f38247a) {
            case 15:
                return ((yx) this.f38248b).A0.isInPreviewMode();
            default:
                sg0 sg0Var = (sg0) this.f38248b;
                View view2 = null;
                sg0Var.K = null;
                for (int childCount = sg0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = sg0Var.getChildAt(childCount);
                    if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                        view2 = childAt;
                        return view2 == null && !sg0Var.L.contains(view2);
                    }
                }
                if (view2 == null) {
                }
        }
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        switch (this.f38247a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o0(float f10) {
        switch (this.f38247a) {
            case 6:
            case 11:
                break;
            default:
                ev evVar = (ev) this.f38248b;
                if (f10 != 1.0f || evVar.f37857f[1].getVisibility() == 0) {
                    if (evVar.f37859r) {
                        dv dvVar = evVar.f37857f[0];
                        dvVar.setTranslationX((-f10) * dvVar.getMeasuredWidth());
                        dv[] dvVarArr = evVar.f37857f;
                        dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth() - (f10 * evVar.f37857f[0].getMeasuredWidth()));
                    } else {
                        dv dvVar2 = evVar.f37857f[0];
                        dvVar2.setTranslationX(dvVar2.getMeasuredWidth() * f10);
                        dv[] dvVarArr2 = evVar.f37857f;
                        dvVarArr2[1].setTranslationX((f10 * dvVarArr2[0].getMeasuredWidth()) - evVar.f37857f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        dv[] dvVarArr3 = evVar.f37857f;
                        dv dvVar3 = dvVarArr3[0];
                        dvVarArr3[0] = dvVarArr3[1];
                        dvVarArr3[1] = dvVar3;
                        dvVar3.setVisibility(8);
                    }
                }
                break;
        }
    }

    @Override
    public int o1(int i10) {
        return N0(i10);
    }

    @Override
    public org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        switch (this.f38247a) {
            case 15:
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) ((yx) this.f38248b).A0).parentLayout).r();
                break;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        int i10 = this.f38247a;
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
        int i10 = this.f38247a;
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        int i10 = this.f38247a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ej ejVar = (ej) this.f38248b;
        View view = ejVar.f37774a;
        if (view != null) {
            view.setPressed(true);
            ejVar.f37774a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ejVar.f37774a.getBackground() != null) {
                ejVar.f37774a.getBackground().setVisible(true, false);
            }
            ejVar.f37774a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        ej ejVar = (ej) this.f38248b;
        rn rnVar = ejVar.f37782w;
        if (ejVar.f37774a != null) {
            rnVar.M8 = org.telegram.ui.Components.f9.b(rnVar, ejVar.v, rnVar.P5, rnVar.b(), rnVar.f41983aa);
            org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
            if (n1Var != null) {
                ejVar.f37775b = n1Var;
                n1Var.setOnDismissListener(new h0(ejVar, 2));
                rnVar.f42213t0.B0();
                rnVar.f42239v0.R = false;
                View view = ejVar.v;
                rnVar.ob(view);
                rnVar.g8(false, view != rnVar.f42041f1, 0.3f);
                rnVar.h9(false);
                zk zkVar = rnVar.f42242v3;
                if (zkVar != null) {
                    zkVar.e(1, true);
                }
                UndoView undoView = rnVar.f42229u3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ck ckVar = rnVar.U;
                if (ckVar == null || ckVar.getEditField() == null) {
                    return;
                }
                rnVar.U.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.f38247a) {
            case 15:
                break;
            default:
                sg0 sg0Var = (sg0) this.f38248b;
                sg0.k(sg0Var, view, f10, f11);
                sg0.m(sg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(sg0Var.D, 450L);
                sg0Var.K = null;
                sg0Var.invalidate();
                sg0Var.M.a(false, true);
                break;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.f38247a) {
            case 15:
                break;
            default:
                sg0 sg0Var = (sg0) this.f38248b;
                sg0.k(sg0Var, view, f10, f11);
                sg0.m(sg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(sg0Var.D, 450L);
                View view2 = sg0Var.K;
                if (view2 != null) {
                    view2.performClick();
                }
                sg0Var.K = null;
                sg0Var.invalidate();
                sg0Var.M.a(false, true);
                break;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.f38247a) {
            case 15:
                break;
            default:
                sg0 sg0Var = (sg0) this.f38248b;
                sg0.k(sg0Var, view, f10, f11);
                sg0.m(sg0Var, f10, false, false);
                sg0Var.invalidate();
                break;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.f38247a) {
            case 15:
                return false;
            default:
                sg0 sg0Var = (sg0) this.f38248b;
                sg0.k(sg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(sg0Var.D);
                sg0Var.setSkipDrawSelector(true);
                sg0.m(sg0Var, f10, true, false);
                sg0Var.invalidate();
                sg0Var.M.a(true, true);
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
        ej ejVar = (ej) this.f38248b;
        if (ejVar.f37777e || (view = ejVar.f37774a) == null) {
            return false;
        }
        view.callOnClick();
        ejVar.f37777e = true;
        return true;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public int q0(int i10) {
        return N0(i10);
    }

    @Override
    public void r() {
        switch (this.f38247a) {
            case 5:
                ((j5) this.f38248b).f39254b.N();
                break;
        }
    }

    @Override
    public void s(float f10) {
        ((i10) this.f38248b).f38942e0.d(f10);
    }

    @Override
    public boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public boolean s1() {
        return false;
    }

    @Override
    public void t1() {
        z6 z6Var = ((x6) this.f38248b).f44289e;
        ih.b bVar = z6Var.U;
        if (bVar == null || bVar.f11489j.size() <= 0) {
            return;
        }
        z6Var.U.d();
        w6 w6Var = z6Var.J;
        if (w6Var != null) {
            w6Var.e(false);
            z6Var.J.d();
        }
    }

    @Override
    public boolean u0() {
        return false;
    }

    @Override
    public void w() {
        int i10 = this.f38247a;
    }

    @Override
    public void w0(MessageObject messageObject) {
        q3 q3Var = ((m4) this.f38248b).f40347q0[0];
        if (q3Var != null) {
            q3Var.f41496b.I0(true);
        }
    }

    @Override
    public boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean y0(long j10, int i10, int i11, int i12, jh.f9 f9Var) {
        h8 h8Var = (h8) this.f38248b;
        if (h8Var.f38700b != null) {
            loop0: for (int i13 = 0; i13 < h8Var.f38700b.getChildCount(); i13++) {
                View childAt = h8Var.f38700b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f37658n != null) {
                        for (int i14 = 0; i14 < e8Var.f37658n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.f37658n.valueAt(i14)).f37959b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int iKeyAt = e8Var.f37658n.keyAt(i14);
                                h8Var.f38704d0 = iKeyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f37659r.get(iKeyAt);
                                if (imageReceiver == null) {
                                    break loop0;
                                }
                                f9Var.f13335c = imageReceiver;
                                if (h8Var.f38706e0 == null) {
                                    h8Var.f38706e0 = new c1(this, 10);
                                }
                                f9Var.f13336e = h8Var.f38706e0;
                                f9Var.f13333a = e8Var;
                                f9Var.f13338g = h8Var.fragmentView;
                                f9Var.h = AndroidUtilities.dp(36.0f);
                                f9Var.f13339i = h8Var.fragmentView.getBottom();
                                f9Var.f13334b = null;
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    @Override
    public String z0() {
        return null;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        qb qbVar = (qb) this.f38248b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (qbVar.f41610p0.contains(Long.valueOf(j10))) {
                    qbVar.f41610p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    qbVar.f41610p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                qbVar.X0(true);
                qbVar.R0();
                qbVar.E.l();
                return;
            }
        }
        qbVar.P0(view, f10, f11);
    }

    private final void X1(float f10) {
    }

    private final void Y1(float f10) {
    }

    private final void e2() {
    }

    private final void f2() {
    }

    private final void g2() {
    }

    private final void j2() {
    }

    private final void l2() {
    }

    private final void p1() {
    }

    private final void p2(boolean z10) {
    }

    private final void q1() {
    }

    private final void q2(boolean z10) {
    }

    private final void r1() {
    }

    @Override
    public void B() {
    }

    @Override
    public void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void C0() {
    }

    @Override
    public void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D1(MessageObject messageObject) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void I1() {
    }

    @Override
    public void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void P0(int i10) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void T(MessageObject messageObject) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void d1() {
    }

    @Override
    public void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void h2() {
    }

    @Override
    public void i0(int i10) {
    }

    @Override
    public void j1() {
    }

    @Override
    public void l(fk0 fk0Var) {
    }

    @Override
    public void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void m2() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void q() {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void u() {
    }

    @Override
    public void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void y(MessageObject messageObject) {
    }

    @Override
    public void E(boolean z10, boolean z11) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void c1(int i10, int i11) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void C1(View view, float f10, float f11) {
    }

    private final void J1(View view, float f10, float f11) {
    }

    private final void N1(View view, float f10, float f11) {
    }

    private final void P1(View view, float f10, float f11) {
    }

    private final void S1(View view, float f10, float f11) {
    }

    private final void T1(View view, float f10, float f11) {
    }

    private final void U1(View view, float f10, float f11) {
    }

    private final void w1(View view, float f10, float f11) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }

    @Override
    public void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void W1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override
    public void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
