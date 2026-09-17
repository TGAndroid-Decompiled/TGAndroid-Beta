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
public final class g implements v9, nv0, org.telegram.ui.web.c1, org.telegram.ui.Components.fo0, org.telegram.ui.Components.b5, org.telegram.ui.Components.mm0, k7, ai.fc, org.telegram.ui.Components.bl0, org.telegram.ui.Cells.k1, od1, om, me.a, org.telegram.ui.Components.dl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.lq, org.telegram.ui.Components.xp0, s4.e0, org.telegram.ui.Components.l8, org.telegram.ui.Components.i20, r0.n, bu, x11, org.telegram.ui.ActionBar.f6 {
    public final int f33805a;
    public final Object f33806b;

    public g(Object obj, int i10) {
        this.f33805a = i10;
        this.f33806b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void B() {
        switch (this.f33805a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f33806b).f34432b.N();
                return;
        }
    }

    @Override
    public void C() {
        int i10 = this.f33805a;
    }

    @Override
    public void C0(float f7) {
        switch (this.f33805a) {
            case 6:
            case 11:
                return;
            default:
                pv pvVar = (pv) this.f33806b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || pvVar.f36737f[1].getVisibility() == 0) {
                    if (pvVar.f36739r) {
                        ov ovVar = pvVar.f36737f[0];
                        ovVar.setTranslationX((-f7) * ovVar.getMeasuredWidth());
                        ov[] ovVarArr = pvVar.f36737f;
                        ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth() - (f7 * pvVar.f36737f[0].getMeasuredWidth()));
                    } else {
                        ov ovVar2 = pvVar.f36737f[0];
                        ovVar2.setTranslationX(ovVar2.getMeasuredWidth() * f7);
                        ov[] ovVarArr2 = pvVar.f36737f;
                        ovVarArr2[1].setTranslationX((f7 * ovVarArr2[0].getMeasuredWidth()) - pvVar.f36737f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        ov[] ovVarArr3 = pvVar.f36737f;
                        ov ovVar3 = ovVarArr3[0];
                        ovVarArr3[0] = ovVarArr3[1];
                        ovVarArr3[1] = ovVar3;
                        ovVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f33806b).p(i10, i11);
    }

    @Override
    public void E0(MessageObject messageObject) {
        l3 l3Var = ((h4) this.f33806b).f34168u0[0];
        if (l3Var != null) {
            l3Var.f35430b.J0(true);
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int G0(int i10) {
        cq0 cq0Var = (cq0) this.f33806b;
        int indexOfKey = cq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.f32864s;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void H0(t6 t6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        a7 a7Var = ((y6) this.f33806b).e;
        if (t6Var != null) {
            if (a7Var.f31737c0.f49228j.size() <= 0 && !z10) {
                if (a7Var.G > 0 && a7Var.getParentActivity() != null) {
                    t6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = t6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((u6) sparseArray.get(0)).f37944b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((u6) sparseArray.get(1)).f37944b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((u6) sparseArray.get(2)).f37944b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f49225f;
                    if (obj3 != null) {
                        arrayList3.addAll(((u6) sparseArray.get(3)).f37944b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f49226g;
                    if (obj4 != null) {
                        arrayList4.addAll(((u6) sparseArray.get(4)).f37944b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f49228j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f49236r += ((zh.a) arrayList.get(i10)).f49219c;
                        } else {
                            bVar.f49237s += ((zh.a) arrayList.get(i10)).f49219c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f49238t += ((zh.a) arrayList2.get(i11)).f49219c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f49239u += ((zh.a) arrayList3.get(i12)).f49219c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f49219c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f49231m = z11;
                    bVar.f49232n = z11;
                    bVar.f49233o = z11;
                    bVar.f49234p = z11;
                    bVar.f49235q = z11;
                    Collections.sort(arrayList, new lb1(26));
                    Collections.sort(arrayList2, new lb1(26));
                    Collections.sort(arrayList3, new lb1(26));
                    Collections.sort(arrayList4, new lb1(26));
                    Collections.sort(bVar.h, new lb1(26));
                    lv lvVar = new lv(a7Var, t6Var, bVar, new o0.a(a7Var, t6Var, false, 2));
                    a7Var.X = lvVar;
                    a7Var.showDialog(lvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = a7Var.f31737c0;
            HashSet hashSet2 = bVar2.f49228j;
            HashSet hashSet3 = bVar2.f49230l;
            long j3 = t6Var.f37667a;
            SparseArray sparseArray2 = t6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((u6) sparseArray2.valueAt(i14)).f37944b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f49229k += aVar2.f49219c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((u6) sparseArray2.valueAt(i16)).f37944b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f49229k -= aVar3.f49219c;
                        }
                    }
                }
            }
            bVar2.c();
            a7Var.M.e();
            a7.h0(a7Var);
        } else if (aVar != null) {
            a7Var.f31737c0.i(aVar);
            a7Var.M.e();
            a7.h0(a7Var);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.n8(this, i10, 16), 50L);
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f33806b;
        hVar.finishFragment(false);
        f20 f20Var = hVar.f34078x;
        LaunchActivity launchActivity = (LaunchActivity) f20Var.f33519b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.f18502g0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new qo(27, c2Var, (h) f20Var.f33520c));
    }

    @Override
    public int K0(int i10) {
        switch (this.f33805a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(int i10, int i11) {
        ((s4.h0) this.f33806b).t(i10, i11);
    }

    @Override
    public CharacterStyle O1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        dj0 dj0Var = (dj0) this.f33806b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        dj0Var.e = defaultWindowInsets;
        dj0Var.G.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        dj0Var.F.requestLayout();
        return r0.l1.f41876b;
    }

    @Override
    public boolean Q1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void U0(int i10, int i11) {
        n70 n70Var = (n70) this.f33806b;
        n70Var.W = i10;
        AndroidUtilities.updateVisibleRows(n70Var.f35957b);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        String formatString;
        switch (this.f33805a) {
            case 3:
                d4 d4Var = (d4) this.f33806b;
                int i10 = d4Var.f32992b;
                int round = Math.round(((d4Var.f32993c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    d4Var.f32994f.f34168u0[0].getAdapter().f33544y.clear();
                    h4 h4Var = d4Var.f32994f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        h4Var.f34168u0[i11].f35431c.l();
                        f4 f4Var = h4Var.f34168u0[i11].f35431c;
                        ArrayList arrayList = f4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(f4Var.K);
                        Utilities.globalQueue.postRunnable(f4Var.K, 100L);
                    }
                    d4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                nc0 nc0Var = (nc0) this.f33806b;
                pc0 pc0Var = nc0Var.f36033y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    pc0Var.Y();
                    ArrayList arrayList2 = pc0Var.f36598s;
                    if (arrayList2.isEmpty()) {
                        pc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new jc0(2, 0, formatString, 0, 0));
                        pc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            nc0Var.performHapticFeedback(3, 1);
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
                org.telegram.ui.Components.qv0 qv0Var = ((i5) this.f33806b).f34432b;
                qv0Var.M();
                qv0Var.N();
                return;
        }
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public rv0 Y1() {
        return null;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        j8 j8Var = (j8) this.f33806b;
        if (j8Var.f34793b == null) {
            e5Var.run();
        }
        j8Var.f34793b.post(e5Var);
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f33805a) {
            case 12:
                cd cdVar = (cd) this.f33806b;
                f6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
                    return f6Var2.a();
                }
                return org.telegram.ui.ActionBar.j6.I.q();
            default:
                return ((cq0) this.f33806b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public void a1(xt xtVar) {
        ek0 ek0Var = (ek0) this.f33806b;
        ek0Var.E = true;
        String str = xtVar.f39697c;
        ek0Var.O.setText(str);
        ek0Var.u(str, xtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new i10(this, 28), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b1() {
        pj pjVar = (pj) this.f33806b;
        View view = pjVar.f36640a;
        if (view != null) {
            view.setPressed(false);
            pjVar.f36640a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && pjVar.f36640a.getBackground() != null) {
                pjVar.f36640a.getBackground().setVisible(false, false);
            }
        }
        View view2 = pjVar.f36644n;
        if (view2 != null && !pjVar.d) {
            view2.callOnClick();
            pjVar.d = true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        z10 z10Var = (z10) this.f33806b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            z10.a(z10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!z10Var.f40087o0.g()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        z10Var.f40081i0.f(r2Var);
                        return true;
                    }
                }
                z10.a(z10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void c0() {
        ((mk0) this.f33806b).a();
    }

    @Override
    public boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void clear() {
        ((y6) this.f33806b).e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f33805a) {
            case 6:
                v5 v5Var = ((o5) this.f33806b).d;
                v5Var.f38277b0 = i10;
                v5Var.G0(true);
                return;
            case 11:
                ec ecVar = ((cc) this.f33806b).f32720f;
                ecVar.f33362y = i10;
                ecVar.d(true);
                return;
            default:
                pv pvVar = (pv) this.f33806b;
                if (pvVar.f36737f[0].f36431f != i10) {
                    if (i10 == pvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pvVar.f36741w = z11;
                    ov ovVar = pvVar.f36737f[1];
                    ovVar.f36431f = i10;
                    ovVar.setVisibility(0);
                    pvVar.m0(true);
                    pvVar.f36739r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f33805a) {
            case 7:
                return;
            default:
                ((n70) this.f33806b).f35963w.dismiss();
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
    public boolean e1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        j8 j8Var = (j8) this.f33806b;
        if (j8Var.f34793b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= j8Var.f34793b.getChildCount()) {
                    break;
                }
                View childAt = j8Var.f34793b.getChildAt(i13);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    if (g8Var.f33901n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < g8Var.f33901n.size(); i14++) {
                            ArrayList arrayList = ((h8) g8Var.f33901n.valueAt(i14)).f34196b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = g8Var.f33901n.keyAt(i14);
                                j8Var.f34802h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.f33902r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.f917c = imageReceiver;
                                    if (j8Var.f34803i0 == null) {
                                        j8Var.f34803i0 = new y0(this, 11);
                                    }
                                    gcVar.e = j8Var.f34803i0;
                                    gcVar.f915a = g8Var;
                                    gcVar.f919g = j8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.f920i = j8Var.fragmentView.getBottom();
                                    gcVar.f916b = null;
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
    public boolean forceEnableVibration() {
        switch (this.f33805a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((z10) this.f33806b).f40081i0.finish();
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return G0(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f33805a) {
            case 3:
                d4 d4Var = (d4) this.f33806b;
                int i10 = d4Var.f32992b;
                return String.valueOf(Math.round((d4Var.f32991a.getProgress() * (d4Var.f32993c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        cq0 cq0Var = (cq0) this.f33806b;
        if (str.equals("drawableMsgIn")) {
            return cq0Var.f32865w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cq0Var.f32866x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.f32864s;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f33805a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.messenger.wl.a(messageObject);
    }

    @Override
    public void i1() {
        a7 a7Var = ((y6) this.f33806b).e;
        zh.b bVar = a7Var.f31737c0;
        if (bVar != null && bVar.f49228j.size() > 0) {
            a7Var.f31737c0.d();
            x6 x6Var = a7Var.M;
            if (x6Var != null) {
                x6Var.f(false);
                a7Var.M.e();
            }
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f33805a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public TextureView j0() {
        return null;
    }

    @Override
    public void k() {
        wb wbVar = ((sb) this.f33806b).f37447n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f33806b).s(i10, i11);
    }

    @Override
    public void l(boolean z10) {
        int i10 = this.f33805a;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f33806b).r(i10, i11, null);
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        switch (this.f33805a) {
            case 3:
                d4 d4Var = (d4) this.f33806b;
                return d4Var.f32993c - d4Var.f32992b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean n1(int i10, View view) {
        switch (this.f33805a) {
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
        switch (this.f33805a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f33805a) {
            case 15:
                return ((py) this.f33806b).E0.isInPreviewMode();
            default:
                ih0 ih0Var = (ih0) this.f33806b;
                View view2 = null;
                ih0Var.O = null;
                int childCount = ih0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ih0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !ih0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f33805a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        cd cdVar = (cd) this.f33806b;
        f6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
        if (f6Var instanceof bd) {
            f6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) f6Var2).f32103a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.f33805a) {
            case 15:
                e5Var = ((org.telegram.ui.ActionBar.o2) ((py) this.f33806b).E0).parentLayout;
                ((ActionBarLayout) e5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f33805a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f33805a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f33805a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        pj pjVar = (pj) this.f33806b;
        View view = pjVar.f36640a;
        if (view != null) {
            view.setPressed(true);
            pjVar.f36640a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && pjVar.f36640a.getBackground() != null) {
                pjVar.f36640a.getBackground().setVisible(true, false);
            }
            pjVar.f36640a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        pj pjVar = (pj) this.f33806b;
        bo boVar = pjVar.f36647w;
        if (pjVar.f36640a != null) {
            boVar.Q8 = org.telegram.ui.Components.m9.b(boVar, pjVar.v, boVar.T5, boVar.d(), boVar.f32275ea);
            org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
            if (o1Var != null) {
                pjVar.f36641b = o1Var;
                o1Var.setOnDismissListener(new e0(pjVar, 2));
                boVar.f32502x0.C0();
                boVar.f32527z0.R = false;
                View view = pjVar.v;
                boVar.ob(view);
                if (view != boVar.f32328j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boVar.g8(false, z10, 0.3f);
                boVar.h9(false);
                jl jlVar = boVar.f32530z3;
                if (jlVar != null) {
                    jlVar.e(1, true);
                }
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                nk nkVar = boVar.Y;
                if (nkVar != null && nkVar.getEditField() != null) {
                    boVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f33805a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f33806b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ih0Var.H, 450L);
                ih0Var.O = null;
                ih0Var.invalidate();
                ih0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f33805a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f33806b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ih0Var.H, 450L);
                View view2 = ih0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                ih0Var.O = null;
                ih0Var.invalidate();
                ih0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f33805a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f33806b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, false);
                ih0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f33805a) {
            case 15:
                return false;
            default:
                ih0 ih0Var = (ih0) this.f33806b;
                ih0.k(ih0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(ih0Var.H);
                ih0.l(ih0Var);
                ih0.m(ih0Var, f7, true, false);
                ih0Var.invalidate();
                ih0Var.Q.a(true, true);
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
        pj pjVar = (pj) this.f33806b;
        if (!pjVar.e && (view = pjVar.f36640a) != null) {
            view.callOnClick();
            pjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q(float f7) {
        ((z10) this.f33806b).f40081i0.e(f7);
    }

    @Override
    public void s0(String str) {
        ((kk) this.f33806b).f35298b.da(str, false);
    }

    @Override
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((k60) this.f33806b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19189v3;
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.f33805a) {
            case 18:
                sg.f fVar2 = ((m20) this.f33806b).f35671c.f42931c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((m20) this.f33806b).f35671c.f42931c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void y() {
        int i10 = this.f33805a;
    }

    @Override
    public org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.f33806b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (wbVar.f38663p0.contains(Long.valueOf(j3))) {
                    wbVar.f38663p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.f38663p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.W0(true);
                wbVar.R0();
                wbVar.E.l();
                return;
            }
        }
        wbVar.P0(view, f7, f10);
    }

    private final void L1(float f7) {
    }

    private final void S1(float f7) {
    }

    private final void W1() {
    }

    private final void X1() {
    }

    private final void Z1() {
    }

    private final void d2() {
    }

    private final void f2() {
    }

    private final void h2(boolean z10) {
    }

    private final void i2(boolean z10) {
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
    public void C1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void R1() {
    }

    @Override
    public void S0(int i10) {
    }

    @Override
    public void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void U() {
    }

    @Override
    public void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void m2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.t1 t1Var) {
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
    public void v(vk0 vk0Var) {
    }

    @Override
    public void x2() {
    }

    @Override
    public void y0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void z0() {
    }

    @Override
    public void D1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, bi.f fVar) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final void B1(View view, float f7, float f10) {
    }

    private final void E1(View view, float f7, float f10) {
    }

    private final void F1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final void v1(View view, float f7, float f10) {
    }

    private final void w1(View view, float f7, float f10) {
    }

    private final void x1(View view, float f7, float f10) {
    }

    private final void y1(View view, float f7, float f10) {
    }

    private final void z1(View view, float f7, float f10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
