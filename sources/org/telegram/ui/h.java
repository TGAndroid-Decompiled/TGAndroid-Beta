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
public final class h implements u9, yu0, org.telegram.ui.web.z0, org.telegram.ui.Components.jo0, org.telegram.ui.Components.y4, org.telegram.ui.Components.tm0, k7, oh.e9, org.telegram.ui.Components.jl0, org.telegram.ui.Cells.k1, ad1, km, yd.a, org.telegram.ui.Components.ll0, org.telegram.ui.Cells.p7, org.telegram.ui.Components.lq, org.telegram.ui.Components.aq0, f2.l0, org.telegram.ui.Components.g8, org.telegram.ui.Components.k20, r0.o, yt, j11, org.telegram.ui.ActionBar.g6 {
    public final int f37187a;
    public final Object f37188b;

    public h(Object obj, int i10) {
        this.f37187a = i10;
        this.f37188b = obj;
    }

    @Override
    public void A() {
        switch (this.f37187a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((l5) this.f37188b).f38540b.N();
                return;
        }
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void B() {
        int i10 = this.f37187a;
    }

    @Override
    public int B0(int i10) {
        np0 np0Var = (np0) this.f37188b;
        int indexOfKey = np0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return np0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.g6 g6Var = np0Var.f39437s;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override
    public void C(int i10, int i11) {
        ((f2.p0) this.f37188b).p(i10, i11);
    }

    @Override
    public String E0() {
        return null;
    }

    @Override
    public boolean E2(int i10) {
        return false;
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    @Override
    public int H0(int i10) {
        switch (this.f37187a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        AndroidUtilities.runOnUIThread(new af.b(this, i10, 14), 50L);
    }

    @Override
    public org.telegram.ui.Cells.n9 I2() {
        return null;
    }

    @Override
    public void J(String str) {
        i iVar = (i) this.f37188b;
        iVar.finishFragment(false);
        rs rsVar = iVar.f37517x;
        LaunchActivity launchActivity = (LaunchActivity) rsVar.f40932b;
        Pattern pattern = LaunchActivity.f34134y1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.f21243d0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.L).sendRequest(tL_auth_acceptLoginToken, new lo(27, d2Var, (i) rsVar.f40933c));
    }

    @Override
    public void L0(int i10, int i11) {
        ((f2.p0) this.f37188b).t(i10, i11);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        ti0 ti0Var = (ti0) this.f37188b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ti0Var.f41554e = defaultWindowInsets;
        ti0Var.D.setPadding(defaultWindowInsets.f7757a, defaultWindowInsets.f7758b, defaultWindowInsets.f7759c, defaultWindowInsets.d);
        ti0Var.C.requestLayout();
        return r0.m1.f46482b;
    }

    @Override
    public boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean P1() {
        return false;
    }

    @Override
    public void Q0(int i10, int i11) {
        f70 f70Var = (f70) this.f37188b;
        f70Var.T = i10;
        AndroidUtilities.updateVisibleRows(f70Var.f36691b);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public boolean T0() {
        return false;
    }

    @Override
    public void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void V0(tt ttVar) {
        uj0 uj0Var = (uj0) this.f37188b;
        uj0Var.B = true;
        String str = ttVar.f41633c;
        uj0Var.L.setText(str);
        uj0Var.u(str, ttVar);
        uj0Var.B = false;
        AndroidUtilities.runOnUIThread(new c10(this, 28), 300L);
        uj0Var.N.requestFocus();
        rj0 rj0Var = uj0Var.N;
        rj0Var.setSelection(rj0Var.length());
    }

    @Override
    public CharacterStyle W1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public void X(float f10, boolean z4) {
        String formatString;
        switch (this.f37187a) {
            case 3:
                h4 h4Var = (h4) this.f37188b;
                int i10 = h4Var.f37216b;
                int round = Math.round(((h4Var.f37217c - i10) * f10) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    h4Var.f37219f.f38524r0[0].getAdapter().f37843y.clear();
                    l4 l4Var = h4Var.f37219f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        l4Var.f38524r0[i11].f39863c.l();
                        j4 j4Var = l4Var.f38524r0[i11].f39863c;
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
                dc0 dc0Var = (dc0) this.f37188b;
                fc0 fc0Var = dc0Var.f36162y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    fc0Var.Y();
                    ArrayList arrayList2 = fc0Var.f36769s;
                    if (arrayList2.isEmpty()) {
                        fc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new zb0(2, 0, formatString, 0, 0));
                        fc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            dc0Var.performHapticFeedback(3, 1);
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
                org.telegram.ui.Components.pv0 pv0Var = ((l5) this.f37188b).f38540b;
                pv0Var.M();
                pv0Var.N();
                return;
        }
    }

    @Override
    public void X0() {
        kj kjVar = (kj) this.f37188b;
        View view = kjVar.f38327a;
        if (view != null) {
            view.setPressed(false);
            kjVar.f38327a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && kjVar.f38327a.getBackground() != null) {
                kjVar.f38327a.getBackground().setVisible(false, false);
            }
        }
        View view2 = kjVar.f38332n;
        if (view2 != null && !kjVar.d) {
            view2.callOnClick();
            kjVar.d = true;
        }
    }

    @Override
    public void Y(u6 u6Var, nh.a aVar, boolean z4) {
        HashSet hashSet;
        b7 b7Var = ((z6) this.f37188b).f43810e;
        if (u6Var != null) {
            if (b7Var.V.f16258j.size() <= 0 && !z4) {
                if (b7Var.E > 0 && b7Var.getParentActivity() != null) {
                    u6Var.getClass();
                    boolean z10 = true;
                    nh.b bVar = new nh.b(true);
                    SparseArray sparseArray = u6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((v6) sparseArray.get(0)).f42015b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((v6) sparseArray.get(1)).f42015b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f16254e;
                    if (obj2 != null) {
                        arrayList2.addAll(((v6) sparseArray.get(2)).f42015b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f16255f;
                    if (obj3 != null) {
                        arrayList3.addAll(((v6) sparseArray.get(3)).f42015b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f16256g;
                    if (obj4 != null) {
                        arrayList4.addAll(((v6) sparseArray.get(4)).f42015b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f16258j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((nh.a) arrayList.get(i10));
                        if (((nh.a) arrayList.get(i10)).d == 0) {
                            bVar.f16266r += ((nh.a) arrayList.get(i10)).f16247c;
                        } else {
                            bVar.f16267s += ((nh.a) arrayList.get(i10)).f16247c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((nh.a) arrayList2.get(i11));
                        bVar.f16268t += ((nh.a) arrayList2.get(i11)).f16247c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((nh.a) arrayList3.get(i12));
                        bVar.f16269u += ((nh.a) arrayList3.get(i12)).f16247c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((nh.a) arrayList4.get(i13));
                        bVar.v += ((nh.a) arrayList4.get(i13)).f16247c;
                        i13++;
                        z10 = true;
                    }
                    bVar.f16261m = z10;
                    bVar.f16262n = z10;
                    bVar.f16263o = z10;
                    bVar.f16264p = z10;
                    bVar.f16265q = z10;
                    Collections.sort(arrayList, new e5.f(24));
                    Collections.sort(arrayList2, new e5.f(24));
                    Collections.sort(arrayList3, new e5.f(24));
                    Collections.sort(arrayList4, new e5.f(24));
                    Collections.sort(bVar.h, new e5.f(24));
                    hv hvVar = new hv(b7Var, u6Var, bVar, new n7.qa(b7Var, u6Var, false, 9));
                    b7Var.Q = hvVar;
                    b7Var.showDialog(hvVar);
                    return;
                }
                return;
            }
            nh.b bVar2 = b7Var.V;
            HashSet hashSet2 = bVar2.f16258j;
            HashSet hashSet3 = bVar2.f16260l;
            long j10 = u6Var.f41727a;
            SparseArray sparseArray2 = u6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((v6) sparseArray2.valueAt(i14)).f42015b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        nh.a aVar2 = (nh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f16259k += aVar2.f16247c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((v6) sparseArray2.valueAt(i16)).f42015b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        nh.a aVar3 = (nh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f16259k -= aVar3.f16247c;
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
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public boolean Y1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public vg.a Z() {
        return null;
    }

    @Override
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        switch (this.f37187a) {
            case 12:
                bd bdVar = (bd) this.f37188b;
                g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
                if (g6Var != null) {
                    g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
                    return g6Var2.a();
                }
                return org.telegram.ui.ActionBar.k6.I.q();
            default:
                return ((np0) this.f37188b).P;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public void b0(long j10, int i10, oh.l3 l3Var) {
        j8 j8Var = (j8) this.f37188b;
        if (j8Var.f37859b == null) {
            l3Var.run();
        }
        j8Var.f37859b.post(l3Var);
    }

    @Override
    public boolean b1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        t10 t10Var = (t10) this.f37188b;
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
                if (!t10Var.f41371l0.f()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f10)) {
                        t10Var.f41365f0.f(r2Var);
                        return true;
                    }
                }
                t10.a(t10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void clear() {
        ((z6) this.f37188b).f43810e.m0();
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void d0() {
        ((ck0) this.f37188b).a();
    }

    @Override
    public void dismiss() {
        switch (this.f37187a) {
            case 7:
                return;
            default:
                ((f70) this.f37188b).f36698w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int e0(int i10) {
        return B0(i10);
    }

    @Override
    public boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public boolean e2(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void f(int i10, boolean z4) {
        boolean z10;
        switch (this.f37187a) {
            case 6:
                y5 y5Var = ((r5) this.f37188b).d;
                y5Var.Y = i10;
                y5Var.G0(true);
                return;
            case 11:
                ac acVar = ((yb) this.f37188b).f43590f;
                acVar.f35137y = i10;
                acVar.d(true);
                return;
            default:
                lv lvVar = (lv) this.f37188b;
                if (lvVar.f38788f[0].f38431f != i10) {
                    if (i10 == lvVar.f38787e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lvVar.f38792w = z10;
                    kv kvVar = lvVar.f38788f[1];
                    kvVar.f38431f = i10;
                    kvVar.setVisibility(0);
                    lvVar.m0(true);
                    lvVar.f38790r = z4;
                    return;
                }
                return;
        }
    }

    @Override
    public void f1() {
        b7 b7Var = ((z6) this.f37188b).f43810e;
        nh.b bVar = b7Var.V;
        if (bVar != null && bVar.f16258j.size() > 0) {
            b7Var.V.d();
            y6 y6Var = b7Var.K;
            if (y6Var != null) {
                y6Var.e(false);
                b7Var.K.d();
            }
        }
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f37187a) {
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
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public cv0 g2() {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37187a) {
            case 3:
                h4 h4Var = (h4) this.f37188b;
                int i10 = h4Var.f37216b;
                return String.valueOf(Math.round((h4Var.f37215a.getProgress() * (h4Var.f37217c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        np0 np0Var = (np0) this.f37188b;
        if (str.equals("drawableMsgIn")) {
            return np0Var.f39438w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return np0Var.f39439x;
        }
        org.telegram.ui.ActionBar.g6 g6Var = np0Var.f39437s;
        if (g6Var != null) {
            return g6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f37187a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((t10) this.f37188b).f41365f0.finish();
    }

    @Override
    public TextureView h0() {
        return null;
    }

    @Override
    public void i1(int i10, int i11) {
        ((f2.p0) this.f37188b).r(i10, i11, null);
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.f37187a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        sb sbVar = ((ob) this.f37188b).f39638n;
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
    public void j0(int i10, int i11) {
        ((f2.p0) this.f37188b).s(i10, i11);
    }

    @Override
    public boolean j1(int i10, View view) {
        switch (this.f37187a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean j2(long j10) {
        return false;
    }

    @Override
    public void k(boolean z4) {
        int i10 = this.f37187a;
    }

    @Override
    public int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public boolean k1(long j10, int i10, int i11, int i12, oh.f9 f9Var) {
        j8 j8Var = (j8) this.f37188b;
        if (j8Var.f37859b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= j8Var.f37859b.getChildCount()) {
                    break;
                }
                View childAt = j8Var.f37859b.getChildAt(i13);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    if (g8Var.f37017n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < g8Var.f37017n.size(); i14++) {
                            ArrayList arrayList = ((h8) g8Var.f37017n.valueAt(i14)).f37250b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = g8Var.f37017n.keyAt(i14);
                                j8Var.f37865e0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.f37018r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.f17148c = imageReceiver;
                                    if (j8Var.f37867f0 == null) {
                                        j8Var.f37867f0 = new a1(this, 10);
                                    }
                                    f9Var.f17149e = j8Var.f37867f0;
                                    f9Var.f17146a = g8Var;
                                    f9Var.f17151g = j8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.f17152i = j8Var.fragmentView.getBottom();
                                    f9Var.f17147b = null;
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
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override
    public void l1(boolean z4) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        bd bdVar = (bd) this.f37188b;
        g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        if (g6Var instanceof ad) {
            g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) g6Var2).f35142a;
            bdVar2.G = !bdVar2.G;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int m0() {
        switch (this.f37187a) {
            case 3:
                h4 h4Var = (h4) this.f37188b;
                return h4Var.f37217c - h4Var.f37216b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f37187a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.f37187a) {
            case 15:
                return ((iy) this.f37188b).B0.isInPreviewMode();
            default:
                yg0 yg0Var = (yg0) this.f37188b;
                View view2 = null;
                yg0Var.L = null;
                int childCount = yg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = yg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !yg0Var.M.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        switch (this.f37187a) {
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
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.f37187a) {
            case 15:
                f5Var = ((org.telegram.ui.ActionBar.p2) ((iy) this.f37188b).B0).parentLayout;
                ((ActionBarLayout) f5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        int i10 = this.f37187a;
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
        int i10 = this.f37187a;
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        int i10 = this.f37187a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        kj kjVar = (kj) this.f37188b;
        View view = kjVar.f38327a;
        if (view != null) {
            view.setPressed(true);
            kjVar.f38327a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && kjVar.f38327a.getBackground() != null) {
                kjVar.f38327a.getBackground().setVisible(true, false);
            }
            kjVar.f38327a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        kj kjVar = (kj) this.f37188b;
        xn xnVar = kjVar.f38335w;
        if (kjVar.f38327a != null) {
            xnVar.N8 = org.telegram.ui.Components.h9.b(xnVar, kjVar.v, xnVar.Q5, xnVar.b(), xnVar.f43114ba);
            org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
            if (p1Var != null) {
                kjVar.f38328b = p1Var;
                p1Var.setOnDismissListener(new g0(kjVar, 2));
                xnVar.f43340u0.B0();
                xnVar.f43367w0.R = false;
                View view = kjVar.v;
                xnVar.ob(view);
                if (view != xnVar.f43170g1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xnVar.g8(false, z4, 0.3f);
                xnVar.h9(false);
                gl glVar = xnVar.f43370w3;
                if (glVar != null) {
                    glVar.e(1, true);
                }
                UndoView undoView = xnVar.f43356v3;
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
        switch (this.f37187a) {
            case 15:
                return;
            default:
                yg0 yg0Var = (yg0) this.f37188b;
                yg0.k(yg0Var, view, f10, f11);
                yg0.m(yg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(yg0Var.E, 450L);
                yg0Var.L = null;
                yg0Var.invalidate();
                yg0Var.N.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.f37187a) {
            case 15:
                return;
            default:
                yg0 yg0Var = (yg0) this.f37188b;
                yg0.k(yg0Var, view, f10, f11);
                yg0.m(yg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(yg0Var.E, 450L);
                View view2 = yg0Var.L;
                if (view2 != null) {
                    view2.performClick();
                }
                yg0Var.L = null;
                yg0Var.invalidate();
                yg0Var.N.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.f37187a) {
            case 15:
                return;
            default:
                yg0 yg0Var = (yg0) this.f37188b;
                yg0.k(yg0Var, view, f10, f11);
                yg0.m(yg0Var, f10, false, false);
                yg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.f37187a) {
            case 15:
                return false;
            default:
                yg0 yg0Var = (yg0) this.f37188b;
                yg0.k(yg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(yg0Var.E);
                yg0.l(yg0Var);
                yg0.m(yg0Var, f10, true, false);
                yg0Var.invalidate();
                yg0Var.N.a(true, true);
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
        kj kjVar = (kj) this.f37188b;
        if (!kjVar.f38330e && (view = kjVar.f38327a) != null) {
            view.callOnClick();
            kjVar.f38330e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(float f10) {
        ((t10) this.f37188b).f41365f0.e(f10);
    }

    @Override
    public boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override
    public void t0(String str) {
        ((gk) this.f37188b).f37121b.da(str, false);
    }

    @Override
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((d60) this.f37188b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public String v(long j10) {
        return null;
    }

    @Override
    public void v0(int i10, int i11, boolean z4) {
        gg.j jVar;
        switch (this.f37187a) {
            case 18:
                gg.j jVar2 = ((g20) this.f37188b).f36969c.f7048c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (jVar = ((g20) this.f37188b).f36969c.f7048c) != null) {
                    jVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean v2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21978v3;
    }

    @Override
    public void w0(float f10) {
        switch (this.f37187a) {
            case 6:
            case 11:
                return;
            default:
                lv lvVar = (lv) this.f37188b;
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 != 0 || lvVar.f38788f[1].getVisibility() == 0) {
                    if (lvVar.f38790r) {
                        kv kvVar = lvVar.f38788f[0];
                        kvVar.setTranslationX((-f10) * kvVar.getMeasuredWidth());
                        kv[] kvVarArr = lvVar.f38788f;
                        kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() - (f10 * lvVar.f38788f[0].getMeasuredWidth()));
                    } else {
                        kv kvVar2 = lvVar.f38788f[0];
                        kvVar2.setTranslationX(kvVar2.getMeasuredWidth() * f10);
                        kv[] kvVarArr2 = lvVar.f38788f;
                        kvVarArr2[1].setTranslationX((f10 * kvVarArr2[0].getMeasuredWidth()) - lvVar.f38788f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        kv[] kvVarArr3 = lvVar.f38788f;
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
    public void x() {
        int i10 = this.f37187a;
    }

    @Override
    public void y0(MessageObject messageObject) {
        p3 p3Var = ((l4) this.f37188b).f38524r0[0];
        if (p3Var != null) {
            p3Var.f39862b.I0(true);
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        sb sbVar = (sb) this.f37188b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (sbVar.f41109q0.contains(Long.valueOf(j10))) {
                    sbVar.f41109q0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    sbVar.f41109q0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                sbVar.X0(true);
                sbVar.R0();
                sbVar.F.l();
                return;
            }
        }
        sbVar.P0(view, f10, f11);
    }

    private final void E1(float f10) {
    }

    private final void F1(float f10) {
    }

    private final void G1() {
    }

    private final void I1() {
    }

    private final void K1() {
    }

    private final void M1() {
    }

    private final void Q1() {
    }

    private final void S1(boolean z4) {
    }

    private final void V1(boolean z4) {
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void q1() {
    }

    @Override
    public void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void D0() {
    }

    @Override
    public void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void G(MessageObject messageObject) {
    }

    @Override
    public void G2() {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void J1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void O0(int i10) {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T1(MessageObject messageObject) {
    }

    @Override
    public void U() {
    }

    @Override
    public void a2() {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void d1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void h1() {
    }

    @Override
    public void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void p1() {
    }

    @Override
    public void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void r() {
    }

    @Override
    public void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void u(lk0 lk0Var) {
    }

    @Override
    public void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void z2() {
    }

    @Override
    public void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public void O1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.t1 t1Var, kh.f fVar) {
    }

    @Override
    public void U0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void W(boolean z4, boolean z10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void C1(View view, float f10, float f11) {
    }

    private final void r1(View view, float f10, float f11) {
    }

    private final void t1(View view, float f10, float f11) {
    }

    private final void u1(View view, float f10, float f11) {
    }

    private final void w1(View view, float f10, float f11) {
    }

    private final void x1(View view, float f10, float f11) {
    }

    private final void y1(View view, float f10, float f11) {
    }

    private final void z1(View view, float f10, float f11) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void H2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void a1(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public void d2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void B2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void D1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override
    public void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
