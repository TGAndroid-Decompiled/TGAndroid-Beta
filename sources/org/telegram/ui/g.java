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
public final class g implements t9, lv0, org.telegram.ui.web.c1, org.telegram.ui.Components.eo0, org.telegram.ui.Components.b5, org.telegram.ui.Components.lm0, i7, ai.fc, org.telegram.ui.Components.al0, org.telegram.ui.Cells.k1, md1, om, me.a, org.telegram.ui.Components.cl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.lq, org.telegram.ui.Components.wp0, s4.e0, org.telegram.ui.Components.l8, org.telegram.ui.Components.i20, r0.n, zt, v11, org.telegram.ui.ActionBar.e6 {
    public final int f33718a;
    public final Object f33719b;

    public g(Object obj, int i10) {
        this.f33718a = i10;
        this.f33719b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void B() {
        switch (this.f33718a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f33719b).f34405b.N();
                return;
        }
    }

    @Override
    public void C() {
        int i10 = this.f33718a;
    }

    @Override
    public void C0(float f7) {
        switch (this.f33718a) {
            case 6:
            case 11:
                return;
            default:
                nv nvVar = (nv) this.f33719b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || nvVar.f36050f[1].getVisibility() == 0) {
                    if (nvVar.f36052r) {
                        mv mvVar = nvVar.f36050f[0];
                        mvVar.setTranslationX((-f7) * mvVar.getMeasuredWidth());
                        mv[] mvVarArr = nvVar.f36050f;
                        mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth() - (f7 * nvVar.f36050f[0].getMeasuredWidth()));
                    } else {
                        mv mvVar2 = nvVar.f36050f[0];
                        mvVar2.setTranslationX(mvVar2.getMeasuredWidth() * f7);
                        mv[] mvVarArr2 = nvVar.f36050f;
                        mvVarArr2[1].setTranslationX((f7 * mvVarArr2[0].getMeasuredWidth()) - nvVar.f36050f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        mv[] mvVarArr3 = nvVar.f36050f;
                        mv mvVar3 = mvVarArr3[0];
                        mvVarArr3[0] = mvVarArr3[1];
                        mvVarArr3[1] = mvVar3;
                        mvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f33719b).p(i10, i11);
    }

    @Override
    public void E0(MessageObject messageObject) {
        l3 l3Var = ((h4) this.f33719b).f34151u0[0];
        if (l3Var != null) {
            l3Var.f35311b.I0(true);
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override
    public int G0(int i10) {
        aq0 aq0Var = (aq0) this.f33719b;
        int indexOfKey = aq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return aq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = aq0Var.f31902s;
        if (e6Var != null) {
            return e6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.f33719b).e;
        if (s6Var != null) {
            if (z6Var.Y.f49205j.size() <= 0 && !z10) {
                if (z6Var.H > 0 && z6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f37564b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f37564b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f37564b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f49202f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f37564b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f49203g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f37564b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f49205j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f49213r += ((zh.a) arrayList.get(i10)).f49196c;
                        } else {
                            bVar.f49214s += ((zh.a) arrayList.get(i10)).f49196c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f49215t += ((zh.a) arrayList2.get(i11)).f49196c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f49216u += ((zh.a) arrayList3.get(i12)).f49196c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f49196c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f49208m = z11;
                    bVar.f49209n = z11;
                    bVar.f49210o = z11;
                    bVar.f49211p = z11;
                    bVar.f49212q = z11;
                    Collections.sort(arrayList, new ob1(26));
                    Collections.sort(arrayList2, new ob1(26));
                    Collections.sort(arrayList3, new ob1(26));
                    Collections.sort(arrayList4, new ob1(26));
                    Collections.sort(bVar.h, new ob1(26));
                    jv jvVar = new jv(z6Var, s6Var, bVar, new o0.a(z6Var, s6Var, false, 2));
                    z6Var.T = jvVar;
                    z6Var.showDialog(jvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = z6Var.Y;
            HashSet hashSet2 = bVar2.f49205j;
            HashSet hashSet3 = bVar2.f49207l;
            long j3 = s6Var.f37257a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i14)).f37564b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f49206k += aVar2.f49196c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i16)).f37564b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f49206k -= aVar3.f49196c;
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
        AndroidUtilities.runOnUIThread(new ai.n8(this, i10, 16), 50L);
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f33719b;
        hVar.finishFragment(false);
        d20 d20Var = hVar.f34065x;
        LaunchActivity launchActivity = (LaunchActivity) d20Var.f32900b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f18473g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new qo(27, b2Var, (h) d20Var.f32901c));
    }

    @Override
    public int K0(int i10) {
        switch (this.f33718a) {
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
        ((s4.h0) this.f33719b).t(i10, i11);
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
        bj0 bj0Var = (bj0) this.f33719b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        bj0Var.e = defaultWindowInsets;
        bj0Var.G.setPadding(defaultWindowInsets.f10588a, defaultWindowInsets.f10589b, defaultWindowInsets.f10590c, defaultWindowInsets.d);
        bj0Var.F.requestLayout();
        return r0.l1.f41854b;
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
        l70 l70Var = (l70) this.f33719b;
        l70Var.W = i10;
        AndroidUtilities.updateVisibleRows(l70Var.f35356b);
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
        switch (this.f33718a) {
            case 3:
                d4 d4Var = (d4) this.f33719b;
                int i10 = d4Var.f32916b;
                int round = Math.round(((d4Var.f32917c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    d4Var.f32918f.f34151u0[0].getAdapter().f33476y.clear();
                    h4 h4Var = d4Var.f32918f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        h4Var.f34151u0[i11].f35312c.l();
                        f4 f4Var = h4Var.f34151u0[i11].f35312c;
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
                lc0 lc0Var = (lc0) this.f33719b;
                nc0 nc0Var = lc0Var.f35432y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    nc0Var.Y();
                    ArrayList arrayList2 = nc0Var.f35949s;
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
                org.telegram.ui.Components.pv0 pv0Var = ((i5) this.f33719b).f34405b;
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
    public pv0 Y1() {
        return null;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        h8 h8Var = (h8) this.f33719b;
        if (h8Var.f34189b == null) {
            e5Var.run();
        }
        h8Var.f34189b.post(e5Var);
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f33718a) {
            case 12:
                ad adVar = (ad) this.f33719b;
                e6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
                    return e6Var2.a();
                }
                return org.telegram.ui.ActionBar.i6.I.q();
            default:
                return ((aq0) this.f33719b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public void a1(vt vtVar) {
        ck0 ck0Var = (ck0) this.f33719b;
        ck0Var.E = true;
        String str = vtVar.f38682c;
        ck0Var.O.setText(str);
        ck0Var.u(str, vtVar);
        ck0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        ck0Var.Q.requestFocus();
        ak0 ak0Var = ck0Var.Q;
        ak0Var.setSelection(ak0Var.length());
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
        oj ojVar = (oj) this.f33719b;
        View view = ojVar.f36227a;
        if (view != null) {
            view.setPressed(false);
            ojVar.f36227a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ojVar.f36227a.getBackground() != null) {
                ojVar.f36227a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ojVar.f36231n;
        if (view2 != null && !ojVar.d) {
            view2.callOnClick();
            ojVar.d = true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.f33719b;
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
                if (!x10Var.f39456o0.g()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        x10Var.f39450i0.f(r2Var);
                        return true;
                    }
                }
                x10.a(x10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void c0() {
        ((kk0) this.f33719b).a();
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
        ((x6) this.f33719b).e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f33718a) {
            case 6:
                v5 v5Var = ((o5) this.f33719b).d;
                v5Var.f38348b0 = i10;
                v5Var.G0(true);
                return;
            case 11:
                cc ccVar = ((ac) this.f33719b).f31749f;
                ccVar.f32749y = i10;
                ccVar.d(true);
                return;
            default:
                nv nvVar = (nv) this.f33719b;
                if (nvVar.f36050f[0].f35813f != i10) {
                    if (i10 == nvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    nvVar.f36054w = z11;
                    mv mvVar = nvVar.f36050f[1];
                    mvVar.f35813f = i10;
                    mvVar.setVisibility(0);
                    nvVar.m0(true);
                    nvVar.f36052r = z10;
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
        switch (this.f33718a) {
            case 7:
                return;
            default:
                ((l70) this.f33719b).f35362w.dismiss();
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
        h8 h8Var = (h8) this.f33719b;
        if (h8Var.f34189b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.f34189b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f34189b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f33265n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.f33265n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.f33265n.valueAt(i14)).f33500b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.f33265n.keyAt(i14);
                                h8Var.f34198h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f33266r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.f912c = imageReceiver;
                                    if (h8Var.f34199i0 == null) {
                                        h8Var.f34199i0 = new y0(this, 10);
                                    }
                                    gcVar.e = h8Var.f34199i0;
                                    gcVar.f910a = e8Var;
                                    gcVar.f914g = h8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.f915i = h8Var.fragmentView.getBottom();
                                    gcVar.f911b = null;
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
        switch (this.f33718a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((x10) this.f33719b).f39450i0.finish();
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
        switch (this.f33718a) {
            case 3:
                d4 d4Var = (d4) this.f33719b;
                int i10 = d4Var.f32916b;
                return String.valueOf(Math.round((d4Var.f32915a.getProgress() * (d4Var.f32917c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        aq0 aq0Var = (aq0) this.f33719b;
        if (str.equals("drawableMsgIn")) {
            return aq0Var.f31903w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return aq0Var.f31904x;
        }
        org.telegram.ui.ActionBar.e6 e6Var = aq0Var.f31902s;
        if (e6Var != null) {
            return e6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f33718a) {
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
        z6 z6Var = ((x6) this.f33719b).e;
        zh.b bVar = z6Var.Y;
        if (bVar != null && bVar.f49205j.size() > 0) {
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
        switch (this.f33718a) {
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
        ub ubVar = ((qb) this.f33719b).f36834n;
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
        ((s4.h0) this.f33719b).s(i10, i11);
    }

    @Override
    public void l(boolean z10) {
        int i10 = this.f33718a;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f33719b).r(i10, i11, null);
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        switch (this.f33718a) {
            case 3:
                d4 d4Var = (d4) this.f33719b;
                return d4Var.f32917c - d4Var.f32916b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean n1(int i10, View view) {
        switch (this.f33718a) {
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
        switch (this.f33718a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f33718a) {
            case 15:
                return ((ny) this.f33719b).E0.isInPreviewMode();
            default:
                gh0 gh0Var = (gh0) this.f33719b;
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
        switch (this.f33718a) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        ad adVar = (ad) this.f33719b;
        e6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
        if (e6Var instanceof zc) {
            e6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ad adVar2 = ((zc) e6Var2).f40135a;
            adVar2.J = !adVar2.J;
            adVar2.d1();
            adVar2.Z0(false);
        }
        adVar.U0(a(), false);
        adVar.Z0(false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f33718a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ny) this.f33719b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f33718a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f33718a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f33718a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.f33719b;
        View view = ojVar.f36227a;
        if (view != null) {
            view.setPressed(true);
            ojVar.f36227a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ojVar.f36227a.getBackground() != null) {
                ojVar.f36227a.getBackground().setVisible(true, false);
            }
            ojVar.f36227a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        oj ojVar = (oj) this.f33719b;
        bo boVar = ojVar.f36234w;
        if (ojVar.f36227a != null) {
            boVar.Q8 = org.telegram.ui.Components.m9.b(boVar, ojVar.v, boVar.T5, boVar.d(), boVar.f32297ea);
            org.telegram.ui.ActionBar.n1 n1Var = boVar.Q8;
            if (n1Var != null) {
                ojVar.f36228b = n1Var;
                n1Var.setOnDismissListener(new e0(ojVar, 2));
                boVar.f32524x0.B0();
                boVar.f32549z0.R = false;
                View view = ojVar.v;
                boVar.ob(view);
                if (view != boVar.f32350j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boVar.g8(false, z10, 0.3f);
                boVar.h9(false);
                jl jlVar = boVar.f32552z3;
                if (jlVar != null) {
                    jlVar.e(1, true);
                }
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                mk mkVar = boVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    boVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f33718a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f33719b;
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
        switch (this.f33718a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f33719b;
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
        switch (this.f33718a) {
            case 15:
                return;
            default:
                gh0 gh0Var = (gh0) this.f33719b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, false);
                gh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f33718a) {
            case 15:
                return false;
            default:
                gh0 gh0Var = (gh0) this.f33719b;
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
        oj ojVar = (oj) this.f33719b;
        if (!ojVar.e && (view = ojVar.f36227a) != null) {
            view.callOnClick();
            ojVar.e = true;
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
        ((x10) this.f33719b).f39450i0.e(f7);
    }

    @Override
    public void s0(String str) {
        ((jk) this.f33719b).f34933b.da(str, false);
    }

    @Override
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((i60) this.f33719b).k1().k(0L, 33, null, null, null, null);
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
        return org.telegram.ui.ActionBar.i6.f19163v3;
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.f33718a) {
            case 18:
                sg.f fVar2 = ((k20) this.f33719b).f35014c.f42909c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((k20) this.f33719b).f35014c.f42909c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void y() {
        int i10 = this.f33718a;
    }

    @Override
    public org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.f33719b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ubVar.f37956p0.contains(Long.valueOf(j3))) {
                    ubVar.f37956p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.f37956p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
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
    public void v(tk0 tk0Var) {
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
