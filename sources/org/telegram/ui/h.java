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
public final class h implements q9, hu0, org.telegram.ui.web.y0, org.telegram.ui.Components.zn0, org.telegram.ui.Components.b5, org.telegram.ui.Components.jm0, g7, lh.e9, org.telegram.ui.Components.al0, org.telegram.ui.Cells.j1, hc1, fm, wd.a, org.telegram.ui.Components.cl0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.fq, org.telegram.ui.Components.rp0, f2.l0, org.telegram.ui.Components.l8, org.telegram.ui.Components.e20, r0.o, qt, s01, org.telegram.ui.ActionBar.c6 {
    public final int f38705a;
    public final Object f38706b;

    public h(Object obj, int i10) {
        this.f38705a = i10;
        this.f38706b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.f23380v3;
    }

    @Override
    public int C0(int i10) {
        yo0 yo0Var = (yo0) this.f38706b;
        int indexOfKey = yo0Var.f44948s.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return yo0Var.f44948s.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = yo0Var.f44947r;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public String E0() {
        return null;
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public int G0(int i10) {
        switch (this.f38705a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void H0(int i10, int i11) {
        ((f2.p0) this.f38706b).t(i10, i11);
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new bg.f(this, i10, 17), 50L);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ki0 ki0Var = (ki0) this.f38706b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ki0Var.f39879e = defaultWindowInsets;
        ki0Var.C.setPadding(defaultWindowInsets.f8186a, defaultWindowInsets.f8187b, defaultWindowInsets.f8188c, defaultWindowInsets.d);
        ki0Var.B.requestLayout();
        return r0.m1.f46842b;
    }

    @Override
    public void J(String str) {
        i iVar = (i) this.f38706b;
        iVar.finishFragment(false);
        xr xrVar = iVar.f39086x;
        LaunchActivity launchActivity = (LaunchActivity) xrVar.f44645b;
        Pattern pattern = LaunchActivity.f35560x1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.f22783c0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.K).sendRequest(tL_auth_acceptLoginToken, new u80(0, c2Var, (i) xrVar.f44646c));
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean K0(long j10, int i10, int i11, int i12, lh.f9 f9Var) {
        f8 f8Var = (f8) this.f38706b;
        if (f8Var.f38021b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= f8Var.f38021b.getChildCount()) {
                    break;
                }
                View childAt = f8Var.f38021b.getChildAt(i13);
                if (childAt instanceof c8) {
                    c8 c8Var = (c8) childAt;
                    if (c8Var.f37032n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < c8Var.f37032n.size(); i14++) {
                            ArrayList arrayList = ((d8) c8Var.f37032n.valueAt(i14)).f37393b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = c8Var.f37032n.keyAt(i14);
                                f8Var.f38025d0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) c8Var.f37033r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.f15603c = imageReceiver;
                                    if (f8Var.f38027e0 == null) {
                                        f8Var.f38027e0 = new c1(this, 10);
                                    }
                                    f9Var.f15604e = f8Var.f38027e0;
                                    f9Var.f15601a = c8Var;
                                    f9Var.f15606g = f8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.f15607i = f8Var.fragmentView.getBottom();
                                    f9Var.f15602b = null;
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
    public boolean M0(long j10) {
        return false;
    }

    @Override
    public boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(q6 q6Var, kh.a aVar, boolean z10) {
        HashSet hashSet;
        x6 x6Var = ((v6) this.f38706b).f43438e;
        if (q6Var != null) {
            if (x6Var.U.f13902j.size() <= 0 && !z10) {
                if (x6Var.D > 0 && x6Var.getParentActivity() != null) {
                    q6Var.getClass();
                    boolean z11 = true;
                    kh.b bVar = new kh.b(true);
                    SparseArray sparseArray = q6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((r6) sparseArray.get(0)).f41979b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((r6) sparseArray.get(1)).f41979b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.f13898e;
                    if (obj2 != null) {
                        arrayList2.addAll(((r6) sparseArray.get(2)).f41979b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f13899f;
                    if (obj3 != null) {
                        arrayList3.addAll(((r6) sparseArray.get(3)).f41979b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f13900g;
                    if (obj4 != null) {
                        arrayList4.addAll(((r6) sparseArray.get(4)).f41979b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f13902j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((kh.a) arrayList.get(i10));
                        if (((kh.a) arrayList.get(i10)).d == 0) {
                            bVar.f13910r += ((kh.a) arrayList.get(i10)).f13891c;
                        } else {
                            bVar.f13911s += ((kh.a) arrayList.get(i10)).f13891c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((kh.a) arrayList2.get(i11));
                        bVar.f13912t += ((kh.a) arrayList2.get(i11)).f13891c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((kh.a) arrayList3.get(i12));
                        bVar.f13913u += ((kh.a) arrayList3.get(i12)).f13891c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((kh.a) arrayList4.get(i13));
                        bVar.v += ((kh.a) arrayList4.get(i13)).f13891c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f13905m = z11;
                    bVar.f13906n = z11;
                    bVar.f13907o = z11;
                    bVar.f13908p = z11;
                    bVar.f13909q = z11;
                    Collections.sort(arrayList, new c5.e(22));
                    Collections.sort(arrayList2, new c5.e(22));
                    Collections.sort(arrayList3, new c5.e(22));
                    Collections.sort(arrayList4, new c5.e(22));
                    Collections.sort(bVar.h, new c5.e(22));
                    yu yuVar = new yu(x6Var, q6Var, bVar, new oc.i(x6Var, q6Var, false, 2));
                    x6Var.P = yuVar;
                    x6Var.showDialog(yuVar);
                    return;
                }
                return;
            }
            kh.b bVar2 = x6Var.U;
            HashSet hashSet2 = bVar2.f13902j;
            HashSet hashSet3 = bVar2.f13904l;
            long j10 = q6Var.f41543a;
            SparseArray sparseArray2 = q6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((r6) sparseArray2.valueAt(i14)).f41979b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        kh.a aVar2 = (kh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f13903k += aVar2.f13891c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((r6) sparseArray2.valueAt(i16)).f41979b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        kh.a aVar3 = (kh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f13903k -= aVar3.f13891c;
                        }
                    }
                }
            }
            bVar2.c();
            x6Var.J.d();
            x6.g0(x6Var);
        } else if (aVar != null) {
            x6Var.U.i(aVar);
            x6Var.J.d();
            x6.g0(x6Var);
        }
    }

    @Override
    public void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void T0(int i10, int i11) {
        t60 t60Var = (t60) this.f38706b;
        t60Var.S = i10;
        AndroidUtilities.updateVisibleRows(t60Var.f42558b);
    }

    @Override
    public boolean U0() {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void W(float f9, boolean z10) {
        String formatString;
        switch (this.f38705a) {
            case 3:
                i4 i4Var = (i4) this.f38706b;
                int i10 = i4Var.f39118b;
                int round = Math.round(((i4Var.f39119c - i10) * f9) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    i4Var.f39121f.f40404q0[0].getAdapter().f39748y.clear();
                    m4 m4Var = i4Var.f39121f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        m4Var.f40404q0[i11].f41514c.l();
                        k4 k4Var = m4Var.f40404q0[i11].f41514c;
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
                    return;
                }
                return;
            case 4:
            default:
                sb0 sb0Var = (sb0) this.f38706b;
                ub0 ub0Var = sb0Var.f42351y;
                int round2 = Math.round(f9 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    ub0Var.Y();
                    ArrayList arrayList2 = ub0Var.f43221s;
                    if (arrayList2.isEmpty()) {
                        ub0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new ob0(2, 0, formatString, 0, 0));
                        ub0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            sb0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                j5.d = f9;
                org.telegram.ui.Components.hv0 hv0Var = ((j5) this.f38706b).f39433b;
                hv0Var.M();
                hv0Var.N();
                return;
        }
    }

    @Override
    public boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public sg.a X() {
        return null;
    }

    @Override
    public boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public lu0 Y1() {
        return null;
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void Z0(lt ltVar) {
        kj0 kj0Var = (kj0) this.f38706b;
        kj0Var.A = true;
        String str = ltVar.f40274c;
        kj0Var.K.setText(str);
        kj0Var.u(str, ltVar);
        kj0Var.A = false;
        AndroidUtilities.runOnUIThread(new q00(this, 28), 300L);
        kj0Var.M.requestFocus();
        ij0 ij0Var = kj0Var.M;
        ij0Var.setSelection(ij0Var.length());
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.f38705a) {
            case 12:
                vc vcVar = (vc) this.f38706b;
                c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
                    return c6Var2.a();
                }
                return org.telegram.ui.ActionBar.g6.I.q();
            default:
                return ((yo0) this.f38706b).F;
        }
    }

    @Override
    public void a0() {
        ((sj0) this.f38706b).a();
    }

    @Override
    public void a1() {
        fj fjVar = (fj) this.f38706b;
        View view = fjVar.f38192a;
        if (view != null) {
            view.setPressed(false);
            fjVar.f38192a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && fjVar.f38192a.getBackground() != null) {
                fjVar.f38192a.getBackground().setVisible(false, false);
            }
        }
        View view2 = fjVar.f38197n;
        if (view2 != null && !fjVar.d) {
            view2.callOnClick();
            fjVar.d = true;
        }
    }

    @Override
    public boolean a2(long j10) {
        return false;
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        h10 h10Var = (h10) this.f38706b;
        if (view instanceof org.telegram.ui.Cells.g7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            h10.a(h10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.p2) {
                if (!h10Var.f38733k0.f()) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    if (p2Var.S(f9)) {
                        h10Var.f38726e0.f(p2Var);
                        return true;
                    }
                }
                h10.a(h10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public TextureView b0() {
        return null;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void clear() {
        ((v6) this.f38706b).f43438e.m0();
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f38705a) {
            case 7:
                return;
            default:
                ((t60) this.f38706b).f42565w.d(true);
                return;
        }
    }

    @Override
    public void e(int i10, boolean z10) {
        boolean z11;
        switch (this.f38705a) {
            case 6:
                v5 v5Var = ((p5) this.f38706b).d;
                v5Var.X = i10;
                v5Var.G0(true);
                return;
            case 11:
                wb wbVar = ((ub) this.f38706b).f43213f;
                wbVar.f43926y = i10;
                wbVar.d(true);
                return;
            default:
                cv cvVar = (cv) this.f38706b;
                if (cvVar.f37222f[0].f36927f != i10) {
                    if (i10 == cvVar.f37221e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cvVar.f37226w = z11;
                    bv bvVar = cvVar.f37222f[1];
                    bvVar.f36927f = i10;
                    bvVar.setVisibility(0);
                    cvVar.m0(true);
                    cvVar.f37224r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public void f1(int i10, int i11) {
        ((f2.p0) this.f38706b).r(i10, i11, null);
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f38705a) {
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
    public int g1(int i10) {
        return C0(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38705a) {
            case 3:
                i4 i4Var = (i4) this.f38706b;
                int i10 = i4Var.f39118b;
                return String.valueOf(Math.round((i4Var.f39117a.getProgress() * (i4Var.f39119c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        yo0 yo0Var = (yo0) this.f38706b;
        if (str.equals("drawableMsgIn")) {
            return yo0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return yo0Var.f44949w;
        }
        org.telegram.ui.ActionBar.c6 c6Var = yo0Var.f44947r;
        if (c6Var != null) {
            return c6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f38705a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((h10) this.f38706b).f38726e0.finish();
    }

    @Override
    public int h0(int i10) {
        return C0(i10);
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public void i(boolean z10) {
        int i10 = this.f38705a;
    }

    @Override
    public void i0(int i10, int i11) {
        ((f2.p0) this.f38706b).s(i10, i11);
    }

    @Override
    public boolean i1(int i10, View view) {
        switch (this.f38705a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f9, float f10) {
        switch (this.f38705a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public void j1(boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        vc vcVar = (vc) this.f38706b;
        c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
        if (c6Var instanceof uc) {
            c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            vc vcVar2 = ((uc) c6Var2).f43223a;
            vcVar2.F = !vcVar2.F;
            vcVar2.d1();
            vcVar2.Z0(false);
        }
        vcVar.U0(a(), false);
        vcVar.Z0(false);
    }

    @Override
    public void k() {
        ob obVar = ((kb) this.f38706b).f39829n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            ye.d.s(obVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ye.d.s(obVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public int k0() {
        switch (this.f38705a) {
            case 3:
                i4 i4Var = (i4) this.f38706b;
                return i4Var.f39119c - i4Var.f39118b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void l1(long j10, int i10, lh.j3 j3Var) {
        f8 f8Var = (f8) this.f38706b;
        if (f8Var.f38021b == null) {
            j3Var.run();
        }
        f8Var.f38021b.post(j3Var);
    }

    @Override
    public boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean n0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f38705a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f9, float f10) {
        switch (this.f38705a) {
            case 15:
                return ((xx) this.f38706b).A0.isInPreviewMode();
            default:
                pg0 pg0Var = (pg0) this.f38706b;
                View view2 = null;
                pg0Var.K = null;
                int childCount = pg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = pg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f9 >= childAt.getLeft() && f9 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
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
    public boolean needLongPress(float f9, float f10) {
        switch (this.f38705a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o1() {
        x6 x6Var = ((v6) this.f38706b).f43438e;
        kh.b bVar = x6Var.U;
        if (bVar != null && bVar.f13902j.size() > 0) {
            x6Var.U.d();
            u6 u6Var = x6Var.J;
            if (u6Var != null) {
                u6Var.e(false);
                x6Var.J.d();
            }
        }
    }

    @Override
    public void onClickAt(View view, float f9, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f38705a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.o2) ((xx) this.f38706b).A0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f9, float f10) {
        int i10 = this.f38705a;
    }

    @Override
    public void onClickTouchMove(View view, float f9, float f10) {
        int i10 = this.f38705a;
    }

    @Override
    public void onClickTouchUp(View view, float f9, float f10) {
        int i10 = this.f38705a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        fj fjVar = (fj) this.f38706b;
        View view = fjVar.f38192a;
        if (view != null) {
            view.setPressed(true);
            fjVar.f38192a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && fjVar.f38192a.getBackground() != null) {
                fjVar.f38192a.getBackground().setVisible(true, false);
            }
            fjVar.f38192a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z10;
        fj fjVar = (fj) this.f38706b;
        tn tnVar = fjVar.f38200w;
        if (fjVar.f38192a != null) {
            tnVar.M8 = org.telegram.ui.Components.l9.b(tnVar, fjVar.v, tnVar.P5, tnVar.b(), tnVar.f42746aa);
            org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
            if (o1Var != null) {
                fjVar.f38193b = o1Var;
                o1Var.setOnDismissListener(new h0(fjVar, 2));
                tnVar.f42973t0.B0();
                tnVar.f42999v0.R = false;
                View view = fjVar.v;
                tnVar.ob(view);
                if (view != tnVar.f42803f1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tnVar.g8(false, z10, 0.3f);
                tnVar.h9(false);
                al alVar = tnVar.f43002v3;
                if (alVar != null) {
                    alVar.e(1, true);
                }
                UndoView undoView = tnVar.f42989u3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                dk dkVar = tnVar.U;
                if (dkVar != null && dkVar.getEditField() != null) {
                    tnVar.U.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f9, float f10) {
        switch (this.f38705a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f38706b;
                pg0.k(pg0Var, view, f9, f10);
                pg0.m(pg0Var, f9, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.D, 450L);
                pg0Var.K = null;
                pg0Var.invalidate();
                pg0Var.M.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f9, float f10) {
        switch (this.f38705a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f38706b;
                pg0.k(pg0Var, view, f9, f10);
                pg0.m(pg0Var, f9, false, true);
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
    public void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
        switch (this.f38705a) {
            case 15:
                return;
            default:
                pg0 pg0Var = (pg0) this.f38706b;
                pg0.k(pg0Var, view, f9, f10);
                pg0.m(pg0Var, f9, false, false);
                pg0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f9, float f10) {
        switch (this.f38705a) {
            case 15:
                return false;
            default:
                pg0 pg0Var = (pg0) this.f38706b;
                pg0.k(pg0Var, view, f9, f10);
                AndroidUtilities.cancelRunOnUIThread(pg0Var.D);
                pg0.l(pg0Var);
                pg0.m(pg0Var, f9, true, false);
                pg0Var.invalidate();
                pg0Var.M.a(true, true);
                return true;
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        fj fjVar = (fj) this.f38706b;
        if (!fjVar.f38195e && (view = fjVar.f38192a) != null) {
            view.callOnClick();
            fjVar.f38195e = true;
            return true;
        }
        return false;
    }

    @Override
    public void q() {
        int i10 = this.f38705a;
    }

    @Override
    public void q0(String str) {
        ((ak) this.f38706b).f36564b.da(str, false);
    }

    @Override
    public void r(float f9) {
        ((h10) this.f38706b).f38726e0.e(f9);
    }

    @Override
    public void r0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((r50) this.f38706b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void s0(int i10, int i11, boolean z10) {
        dg.j jVar;
        switch (this.f38705a) {
            case 18:
                dg.j jVar2 = ((t10) this.f38706b).f42525c.f5551c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (jVar = ((t10) this.f38706b).f42525c.f5551c) != null) {
                    jVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void u0(float f9) {
        switch (this.f38705a) {
            case 6:
            case 11:
                return;
            default:
                cv cvVar = (cv) this.f38706b;
                int i10 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
                if (i10 != 0 || cvVar.f37222f[1].getVisibility() == 0) {
                    if (cvVar.f37224r) {
                        bv bvVar = cvVar.f37222f[0];
                        bvVar.setTranslationX((-f9) * bvVar.getMeasuredWidth());
                        bv[] bvVarArr = cvVar.f37222f;
                        bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() - (f9 * cvVar.f37222f[0].getMeasuredWidth()));
                    } else {
                        bv bvVar2 = cvVar.f37222f[0];
                        bvVar2.setTranslationX(bvVar2.getMeasuredWidth() * f9);
                        bv[] bvVarArr2 = cvVar.f37222f;
                        bvVarArr2[1].setTranslationX((f9 * bvVarArr2[0].getMeasuredWidth()) - cvVar.f37222f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        bv[] bvVarArr3 = cvVar.f37222f;
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
    public boolean u2(int i10) {
        return false;
    }

    @Override
    public void v() {
        switch (this.f38705a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((j5) this.f38706b).f39433b.N();
                return;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void x() {
        int i10 = this.f38705a;
    }

    @Override
    public void x0(MessageObject messageObject) {
        q3 q3Var = ((m4) this.f38706b).f40404q0[0];
        if (q3Var != null) {
            q3Var.f41513b.I0(true);
        }
    }

    @Override
    public String y(long j10) {
        return null;
    }

    @Override
    public org.telegram.ui.Cells.l9 y2() {
        return null;
    }

    @Override
    public void z(int i10, int i11) {
        ((f2.p0) this.f38706b).p(i10, i11);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        MessageObject messageObject;
        ob obVar = (ob) this.f38706b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (obVar.f41062p0.contains(Long.valueOf(j10))) {
                    obVar.f41062p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    obVar.f41062p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                obVar.X0(true);
                obVar.R0();
                obVar.E.l();
                return;
            }
        }
        obVar.P0(view, f9, f10);
    }

    private final void G1(float f9) {
    }

    private final void K1(float f9) {
    }

    private final void M1() {
    }

    private final void T1() {
    }

    private final void X1() {
    }

    private final void Z1() {
    }

    private final void d2() {
    }

    private final void f2(boolean z10) {
    }

    private final void h2(boolean z10) {
    }

    private final void n1() {
    }

    private final void q1() {
    }

    private final void r1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D(MessageObject messageObject) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M() {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void N1(MessageObject messageObject) {
    }

    @Override
    public void Q0(int i10) {
    }

    @Override
    public void S0(MrzRecognizer.Result result) {
    }

    @Override
    public void S1() {
    }

    @Override
    public void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void d(boolean z10) {
    }

    @Override
    public void e1() {
    }

    @Override
    public void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void k1() {
    }

    @Override
    public void m(bk0 bk0Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void o(org.telegram.ui.Cells.s1 s1Var) {
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
    public void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void t() {
    }

    @Override
    public void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void w2() {
    }

    @Override
    public void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void z0() {
    }

    @Override
    public void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U(boolean z10, boolean z11) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    private final void B1(View view, float f9, float f10) {
    }

    private final void D1(View view, float f9, float f10) {
    }

    private final void s1(View view, float f9, float f10) {
    }

    private final void t1(View view, float f9, float f10) {
    }

    private final void v1(View view, float f9, float f10) {
    }

    private final void w1(View view, float f9, float f10) {
    }

    private final void x1(View view, float f9, float f10) {
    }

    private final void y1(View view, float f9, float f10) {
    }

    private final void z1(View view, float f9, float f10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }

    @Override
    public void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void E1(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
