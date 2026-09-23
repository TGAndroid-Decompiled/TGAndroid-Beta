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
public final class g implements t9, ev0, org.telegram.ui.web.a1, org.telegram.ui.Components.eo0, org.telegram.ui.Components.d5, org.telegram.ui.Components.mm0, i7, ai.fc, org.telegram.ui.Components.bl0, org.telegram.ui.Cells.k1, fd1, lm, me.a, org.telegram.ui.Components.dl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.mq, org.telegram.ui.Components.wp0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.j20, r0.n, wt, o11, org.telegram.ui.ActionBar.d6 {
    public final int f33401a;
    public final Object f33402b;

    public g(Object obj, int i10) {
        this.f33401a = i10;
        this.f33402b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void B() {
        switch (this.f33401a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((j5) this.f33402b).f34326b.N();
                return;
        }
    }

    @Override
    public void C() {
        int i10 = this.f33401a;
    }

    @Override
    public void C0(float f7) {
        switch (this.f33401a) {
            case 6:
            case 11:
                return;
            default:
                kv kvVar = (kv) this.f33402b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || kvVar.f34806f[1].getVisibility() == 0) {
                    if (kvVar.f34808r) {
                        jv jvVar = kvVar.f34806f[0];
                        jvVar.setTranslationX((-f7) * jvVar.getMeasuredWidth());
                        jv[] jvVarArr = kvVar.f34806f;
                        jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth() - (f7 * kvVar.f34806f[0].getMeasuredWidth()));
                    } else {
                        jv jvVar2 = kvVar.f34806f[0];
                        jvVar2.setTranslationX(jvVar2.getMeasuredWidth() * f7);
                        jv[] jvVarArr2 = kvVar.f34806f;
                        jvVarArr2[1].setTranslationX((f7 * jvVarArr2[0].getMeasuredWidth()) - kvVar.f34806f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        jv[] jvVarArr3 = kvVar.f34806f;
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
    public void D(int i10, int i11) {
        ((s4.h0) this.f33402b).p(i10, i11);
    }

    @Override
    public void E0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.f33402b).f34021u0[0];
        if (m3Var != null) {
            m3Var.f35130b.I0(true);
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    @Override
    public int G0(int i10) {
        up0 up0Var = (up0) this.f33402b;
        int indexOfKey = up0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return up0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = up0Var.f38160s;
        if (d6Var != null) {
            return d6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.f33402b).e;
        if (s6Var != null) {
            if (z6Var.Y.f49149j.size() <= 0 && !z10) {
                if (z6Var.H > 0 && z6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f37538b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f37538b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f37538b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f49146f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f37538b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f49147g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f37538b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f49149j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f49157r += ((zh.a) arrayList.get(i10)).f49140c;
                        } else {
                            bVar.f49158s += ((zh.a) arrayList.get(i10)).f49140c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f49159t += ((zh.a) arrayList2.get(i11)).f49140c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f49160u += ((zh.a) arrayList3.get(i12)).f49140c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f49140c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f49152m = z11;
                    bVar.f49153n = z11;
                    bVar.f49154o = z11;
                    bVar.f49155p = z11;
                    bVar.f49156q = z11;
                    Collections.sort(arrayList, new cb1(26));
                    Collections.sort(arrayList2, new cb1(26));
                    Collections.sort(arrayList3, new cb1(26));
                    Collections.sort(arrayList4, new cb1(26));
                    Collections.sort(bVar.h, new cb1(26));
                    gv gvVar = new gv(z6Var, s6Var, bVar, new o0.a(z6Var, s6Var, false, 2));
                    z6Var.T = gvVar;
                    z6Var.showDialog(gvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = z6Var.Y;
            HashSet hashSet2 = bVar2.f49149j;
            HashSet hashSet3 = bVar2.f49151l;
            long j3 = s6Var.f37130a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i14)).f37538b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f49150k += aVar2.f49140c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i16)).f37538b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f49150k -= aVar3.f49140c;
                        }
                    }
                }
            }
            bVar2.c();
            z6Var.N.d();
            z6.g0(z6Var);
        } else if (aVar != null) {
            z6Var.Y.i(aVar);
            z6Var.N.d();
            z6.g0(z6Var);
        }
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 16), 50L);
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f33402b;
        hVar.finishFragment(false);
        w10 w10Var = hVar.f33692x;
        LaunchActivity launchActivity = (LaunchActivity) w10Var.f38509b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f18459g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new mo(27, b2Var, (h) w10Var.f38510c));
    }

    @Override
    public int K0(int i10) {
        switch (this.f33401a) {
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
        ((s4.h0) this.f33402b).t(i10, i11);
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
        wi0 wi0Var = (wi0) this.f33402b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wi0Var.e = defaultWindowInsets;
        wi0Var.G.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        wi0Var.F.requestLayout();
        return r0.l1.f41806b;
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
        i70 i70Var = (i70) this.f33402b;
        i70Var.W = i10;
        AndroidUtilities.updateVisibleRows(i70Var.f34044b);
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
        switch (this.f33401a) {
            case 3:
                e4 e4Var = (e4) this.f33402b;
                int i10 = e4Var.f32790b;
                int round = Math.round(((e4Var.f32791c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f32792f.f34021u0[0].getAdapter().f33458y.clear();
                    i4 i4Var = e4Var.f32792f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        i4Var.f34021u0[i11].f35131c.l();
                        g4 g4Var = i4Var.f34021u0[i11].f35131c;
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
                gc0 gc0Var = (gc0) this.f33402b;
                ic0 ic0Var = gc0Var.f33522y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    ic0Var.Y();
                    ArrayList arrayList2 = ic0Var.f34108s;
                    if (arrayList2.isEmpty()) {
                        ic0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new cc0(2, 0, formatString, 0, 0));
                        ic0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            gc0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                j5.d = f7;
                org.telegram.ui.Components.pv0 pv0Var = ((j5) this.f33402b).f34326b;
                pv0Var.M();
                pv0Var.N();
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
    public iv0 Y1() {
        return null;
    }

    @Override
    public void Z(long j3, int i10, ai.d5 d5Var) {
        h8 h8Var = (h8) this.f33402b;
        if (h8Var.f33752b == null) {
            d5Var.run();
        }
        h8Var.f33752b.post(d5Var);
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.f33401a) {
            case 12:
                ad adVar = (ad) this.f33402b;
                d6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
                if (d6Var != null) {
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
                    return d6Var2.a();
                }
                return org.telegram.ui.ActionBar.h6.I.q();
            default:
                return ((up0) this.f33402b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public void a1(st stVar) {
        wj0 wj0Var = (wj0) this.f33402b;
        wj0Var.E = true;
        String str = stVar.f37417c;
        wj0Var.O.setText(str);
        wj0Var.u(str, stVar);
        wj0Var.E = false;
        AndroidUtilities.runOnUIThread(new d10(this, 28), 300L);
        wj0Var.Q.requestFocus();
        uj0 uj0Var = wj0Var.Q;
        uj0Var.setSelection(uj0Var.length());
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
        lj ljVar = (lj) this.f33402b;
        View view = ljVar.f34992a;
        if (view != null) {
            view.setPressed(false);
            ljVar.f34992a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ljVar.f34992a.getBackground() != null) {
                ljVar.f34992a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ljVar.f34996n;
        if (view2 != null && !ljVar.d) {
            view2.callOnClick();
            ljVar.d = true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        u10 u10Var = (u10) this.f33402b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            u10.a(u10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!u10Var.f37862o0.g()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        u10Var.f37856i0.f(r2Var);
                        return true;
                    }
                }
                u10.a(u10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void c0() {
        ((ek0) this.f33402b).a();
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
        ((x6) this.f33402b).e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f33401a) {
            case 6:
                w5 w5Var = ((p5) this.f33402b).d;
                w5Var.f38533b0 = i10;
                w5Var.G0(true);
                return;
            case 11:
                bc bcVar = ((zb) this.f33402b).f40097f;
                bcVar.f32074y = i10;
                bcVar.d(true);
                return;
            default:
                kv kvVar = (kv) this.f33402b;
                if (kvVar.f34806f[0].f34517f != i10) {
                    if (i10 == kvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kvVar.f34810w = z11;
                    jv jvVar = kvVar.f34806f[1];
                    jvVar.f34517f = i10;
                    jvVar.setVisibility(0);
                    kvVar.m0(true);
                    kvVar.f34808r = z10;
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
        switch (this.f33401a) {
            case 7:
                return;
            default:
                ((i70) this.f33402b).f34050w.d(true);
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
    public boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        h8 h8Var = (h8) this.f33402b;
        if (h8Var.f33752b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.f33752b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f33752b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f32840n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.f32840n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.f32840n.valueAt(i14)).f33211b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.f32840n.keyAt(i14);
                                h8Var.f33761h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f32841r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.f915c = imageReceiver;
                                    if (h8Var.f33762i0 == null) {
                                        h8Var.f33762i0 = new z0(this, 10);
                                    }
                                    gcVar.e = h8Var.f33762i0;
                                    gcVar.f913a = e8Var;
                                    gcVar.f917g = h8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.f918i = h8Var.fragmentView.getBottom();
                                    gcVar.f914b = null;
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
        switch (this.f33401a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((u10) this.f33402b).f37856i0.finish();
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
        switch (this.f33401a) {
            case 3:
                e4 e4Var = (e4) this.f33402b;
                int i10 = e4Var.f32790b;
                return String.valueOf(Math.round((e4Var.f32789a.getProgress() * (e4Var.f32791c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        up0 up0Var = (up0) this.f33402b;
        if (str.equals("drawableMsgIn")) {
            return up0Var.f38161w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return up0Var.f38162x;
        }
        org.telegram.ui.ActionBar.d6 d6Var = up0Var.f38160s;
        if (d6Var != null) {
            return d6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f33401a) {
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
        return org.telegram.messenger.ul.a(messageObject);
    }

    @Override
    public void i1() {
        z6 z6Var = ((x6) this.f33402b).e;
        zh.b bVar = z6Var.Y;
        if (bVar != null && bVar.f49149j.size() > 0) {
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
        switch (this.f33401a) {
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
        ub ubVar = ((qb) this.f33402b).f36380n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f33402b).s(i10, i11);
    }

    @Override
    public void l(boolean z10) {
        int i10 = this.f33401a;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f33402b).r(i10, i11, null);
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        switch (this.f33401a) {
            case 3:
                e4 e4Var = (e4) this.f33402b;
                return e4Var.f32791c - e4Var.f32790b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean n1(int i10, View view) {
        switch (this.f33401a) {
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
        switch (this.f33401a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f33401a) {
            case 15:
                return ((ky) this.f33402b).E0.isInPreviewMode();
            default:
                bh0 bh0Var = (bh0) this.f33402b;
                View view2 = null;
                bh0Var.O = null;
                int childCount = bh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = bh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !bh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f33401a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        ad adVar = (ad) this.f33402b;
        d6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
        if (d6Var instanceof zc) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ad adVar2 = ((zc) d6Var2).f40102a;
            adVar2.J = !adVar2.J;
            adVar2.d1();
            adVar2.Z0(false);
        }
        adVar.U0(a(), false);
        adVar.Z0(false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        switch (this.f33401a) {
            case 15:
                c5Var = ((org.telegram.ui.ActionBar.n2) ((ky) this.f33402b).E0).parentLayout;
                ((ActionBarLayout) c5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f33401a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f33401a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f33401a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        lj ljVar = (lj) this.f33402b;
        View view = ljVar.f34992a;
        if (view != null) {
            view.setPressed(true);
            ljVar.f34992a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ljVar.f34992a.getBackground() != null) {
                ljVar.f34992a.getBackground().setVisible(true, false);
            }
            ljVar.f34992a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        lj ljVar = (lj) this.f33402b;
        xn xnVar = ljVar.f34999w;
        if (ljVar.f34992a != null) {
            xnVar.Q8 = org.telegram.ui.Components.o9.b(xnVar, ljVar.v, xnVar.T5, xnVar.d(), xnVar.f39370ea);
            org.telegram.ui.ActionBar.n1 n1Var = xnVar.Q8;
            if (n1Var != null) {
                ljVar.f34993b = n1Var;
                n1Var.setOnDismissListener(new f0(ljVar, 2));
                xnVar.f39596x0.B0();
                xnVar.f39621z0.R = false;
                View view = ljVar.v;
                xnVar.ob(view);
                if (view != xnVar.f39422j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xnVar.g8(false, z10, 0.3f);
                xnVar.h9(false);
                gl glVar = xnVar.f39624z3;
                if (glVar != null) {
                    glVar.e(1, true);
                }
                UndoView undoView = xnVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                jk jkVar = xnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f33401a) {
            case 15:
                return;
            default:
                bh0 bh0Var = (bh0) this.f33402b;
                bh0.k(bh0Var, view, f7, f10);
                bh0.m(bh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(bh0Var.H, 450L);
                bh0Var.O = null;
                bh0Var.invalidate();
                bh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f33401a) {
            case 15:
                return;
            default:
                bh0 bh0Var = (bh0) this.f33402b;
                bh0.k(bh0Var, view, f7, f10);
                bh0.m(bh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(bh0Var.H, 450L);
                View view2 = bh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                bh0Var.O = null;
                bh0Var.invalidate();
                bh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f33401a) {
            case 15:
                return;
            default:
                bh0 bh0Var = (bh0) this.f33402b;
                bh0.k(bh0Var, view, f7, f10);
                bh0.m(bh0Var, f7, false, false);
                bh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f33401a) {
            case 15:
                return false;
            default:
                bh0 bh0Var = (bh0) this.f33402b;
                bh0.k(bh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(bh0Var.H);
                bh0.l(bh0Var);
                bh0.m(bh0Var, f7, true, false);
                bh0Var.invalidate();
                bh0Var.Q.a(true, true);
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
        lj ljVar = (lj) this.f33402b;
        if (!ljVar.e && (view = ljVar.f34992a) != null) {
            view.callOnClick();
            ljVar.e = true;
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
        ((u10) this.f33402b).f37856i0.e(f7);
    }

    @Override
    public void s0(String str) {
        ((gk) this.f33402b).f33584b.da(str, false);
    }

    @Override
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((f60) this.f33402b).k1().k(0L, 33, null, null, null, null);
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
        return org.telegram.ui.ActionBar.h6.f19115v3;
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.f33401a) {
            case 18:
                sg.f fVar2 = ((h20) this.f33402b).f33710c.f42861c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((h20) this.f33402b).f33710c.f42861c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void y() {
        int i10 = this.f33401a;
    }

    @Override
    public org.telegram.ui.Cells.s9 z2() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.f33402b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ubVar.f38028p0.contains(Long.valueOf(j3))) {
                    ubVar.f38028p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.f38028p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.W0(true);
                ubVar.R0();
                ubVar.E.l();
                return;
            }
        }
        ubVar.P0(view, f7, f10);
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
    public void v(nk0 nk0Var) {
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
