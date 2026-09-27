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
public final class g implements w9, gv0, org.telegram.ui.web.b1, org.telegram.ui.Components.so0, org.telegram.ui.Components.d5, org.telegram.ui.Components.zm0, l7, ai.fc, org.telegram.ui.Components.nl0, org.telegram.ui.Cells.l1, gd1, lm, me.a, org.telegram.ui.Components.pl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.nq, org.telegram.ui.Components.kq0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.l20, r0.n, xt, o11, org.telegram.ui.ActionBar.e6 {
    public final int f33669a;
    public final Object f33670b;

    public g(Object obj, int i10) {
        this.f33669a = i10;
        this.f33670b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public void B() {
        switch (this.f33669a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((k5) this.f33670b).f34910b.N();
                return;
        }
    }

    @Override
    public void C() {
        int i10 = this.f33669a;
    }

    @Override
    public void C0(float f7) {
        switch (this.f33669a) {
            case 6:
            case 11:
                return;
            default:
                lv lvVar = (lv) this.f33670b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || lvVar.f35456f[1].getVisibility() == 0) {
                    if (lvVar.f35458r) {
                        kv kvVar = lvVar.f35456f[0];
                        kvVar.setTranslationX((-f7) * kvVar.getMeasuredWidth());
                        kv[] kvVarArr = lvVar.f35456f;
                        kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() - (f7 * lvVar.f35456f[0].getMeasuredWidth()));
                    } else {
                        kv kvVar2 = lvVar.f35456f[0];
                        kvVar2.setTranslationX(kvVar2.getMeasuredWidth() * f7);
                        kv[] kvVarArr2 = lvVar.f35456f;
                        kvVarArr2[1].setTranslationX((f7 * kvVarArr2[0].getMeasuredWidth()) - lvVar.f35456f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        kv[] kvVarArr3 = lvVar.f35456f;
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
    public void D(int i10, int i11) {
        ((s4.h0) this.f33670b).p(i10, i11);
    }

    @Override
    public void E0(MessageObject messageObject) {
        n3 n3Var = ((j4) this.f33670b).f34627u0[0];
        if (n3Var != null) {
            n3Var.f35795b.J0(true);
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override
    public int G0(int i10) {
        wp0 wp0Var = (wp0) this.f33670b;
        int indexOfKey = wp0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return wp0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = wp0Var.f39405s;
        if (e6Var != null) {
            return e6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void H0(u6 u6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        b7 b7Var = ((z6) this.f33670b).e;
        if (u6Var != null) {
            if (b7Var.f32260c0.f49521j.size() <= 0 && !z10) {
                if (b7Var.G > 0 && b7Var.getParentActivity() != null) {
                    u6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = u6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((v6) sparseArray.get(0)).f38457b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((v6) sparseArray.get(1)).f38457b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((v6) sparseArray.get(2)).f38457b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f49518f;
                    if (obj3 != null) {
                        arrayList3.addAll(((v6) sparseArray.get(3)).f38457b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f49519g;
                    if (obj4 != null) {
                        arrayList4.addAll(((v6) sparseArray.get(4)).f38457b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f49521j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f49529r += ((zh.a) arrayList.get(i10)).f49512c;
                        } else {
                            bVar.f49530s += ((zh.a) arrayList.get(i10)).f49512c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f49531t += ((zh.a) arrayList2.get(i11)).f49512c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f49532u += ((zh.a) arrayList3.get(i12)).f49512c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f49512c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f49524m = z11;
                    bVar.f49525n = z11;
                    bVar.f49526o = z11;
                    bVar.f49527p = z11;
                    bVar.f49528q = z11;
                    Collections.sort(arrayList, new cb1(26));
                    Collections.sort(arrayList2, new cb1(26));
                    Collections.sort(arrayList3, new cb1(26));
                    Collections.sort(arrayList4, new cb1(26));
                    Collections.sort(bVar.h, new cb1(26));
                    hv hvVar = new hv(b7Var, u6Var, bVar, new o0.a(b7Var, u6Var, false, 2));
                    b7Var.X = hvVar;
                    b7Var.showDialog(hvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = b7Var.f32260c0;
            HashSet hashSet2 = bVar2.f49521j;
            HashSet hashSet3 = bVar2.f49523l;
            long j3 = u6Var.f38128a;
            SparseArray sparseArray2 = u6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((v6) sparseArray2.valueAt(i14)).f38457b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f49522k += aVar2.f49512c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((v6) sparseArray2.valueAt(i16)).f38457b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f49522k -= aVar3.f49512c;
                        }
                    }
                }
            }
            bVar2.c();
            b7Var.M.e();
            b7.h0(b7Var);
        } else if (aVar != null) {
            b7Var.f32260c0.i(aVar);
            b7Var.M.e();
            b7.h0(b7Var);
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
        h hVar = (h) this.f33670b;
        hVar.finishFragment(false);
        jy jyVar = hVar.f34083x;
        LaunchActivity launchActivity = (LaunchActivity) jyVar.f34878b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.f18729g0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new mo(27, c2Var, (h) jyVar.f34879c));
    }

    @Override
    public int K0(int i10) {
        switch (this.f33669a) {
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
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(int i10, int i11) {
        ((s4.h0) this.f33670b).t(i10, i11);
    }

    @Override
    public CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        yi0 yi0Var = (yi0) this.f33670b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        yi0Var.e = defaultWindowInsets;
        yi0Var.G.setPadding(defaultWindowInsets.f10579a, defaultWindowInsets.f10580b, defaultWindowInsets.f10581c, defaultWindowInsets.d);
        yi0Var.F.requestLayout();
        return r0.l1.f42184b;
    }

    @Override
    public boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void U0(int i10, int i11) {
        j70 j70Var = (j70) this.f33670b;
        j70Var.W = i10;
        AndroidUtilities.updateVisibleRows(j70Var.f34645b);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        String formatString;
        switch (this.f33669a) {
            case 3:
                f4 f4Var = (f4) this.f33670b;
                int i10 = f4Var.f33407b;
                int round = Math.round(((f4Var.f33408c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    f4Var.f33409f.f34627u0[0].getAdapter().f34130y.clear();
                    j4 j4Var = f4Var.f33409f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        j4Var.f34627u0[i11].f35796c.l();
                        h4 h4Var = j4Var.f34627u0[i11].f35796c;
                        ArrayList arrayList = h4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(h4Var.K);
                        Utilities.globalQueue.postRunnable(h4Var.K, 100L);
                    }
                    f4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                ic0 ic0Var = (ic0) this.f33670b;
                kc0 kc0Var = ic0Var.f34439y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    kc0Var.Y();
                    ArrayList arrayList2 = kc0Var.f35005s;
                    if (arrayList2.isEmpty()) {
                        kc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new ec0(2, 0, formatString, 0, 0));
                        kc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ic0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                k5.d = f7;
                org.telegram.ui.Components.cw0 cw0Var = ((k5) this.f33670b).f34910b;
                cw0Var.M();
                cw0Var.N();
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
    public kv0 Y1() {
        return null;
    }

    @Override
    public void Z(long j3, int i10, ai.d5 d5Var) {
        k8 k8Var = (k8) this.f33670b;
        if (k8Var.f34925b == null) {
            d5Var.run();
        }
        k8Var.f34925b.post(d5Var);
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.f33669a) {
            case 12:
                cd cdVar = (cd) this.f33670b;
                e6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
                    return e6Var2.a();
                }
                return org.telegram.ui.ActionBar.i6.I.q();
            default:
                return ((wp0) this.f33670b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public void a1(tt ttVar) {
        yj0 yj0Var = (yj0) this.f33670b;
        yj0Var.E = true;
        String str = ttVar.f37910c;
        yj0Var.O.setText(str);
        yj0Var.u(str, ttVar);
        yj0Var.E = false;
        AndroidUtilities.runOnUIThread(new f10(this, 28), 300L);
        yj0Var.Q.requestFocus();
        wj0 wj0Var = yj0Var.Q;
        wj0Var.setSelection(wj0Var.length());
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b1() {
        nj njVar = (nj) this.f33670b;
        View view = njVar.f36014a;
        if (view != null) {
            view.setPressed(false);
            njVar.f36014a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && njVar.f36014a.getBackground() != null) {
                njVar.f36014a.getBackground().setVisible(false, false);
            }
        }
        View view2 = njVar.f36018n;
        if (view2 != null && !njVar.d) {
            view2.callOnClick();
            njVar.d = true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        w10 w10Var = (w10) this.f33670b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            w10.a(w10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!w10Var.f38773o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.S(f7)) {
                        w10Var.f38767i0.f(s2Var);
                        return true;
                    }
                }
                w10.a(w10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void c0() {
        ((gk0) this.f33670b).a();
    }

    @Override
    public boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void clear() {
        ((z6) this.f33670b).e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f33669a) {
            case 6:
                x5 x5Var = ((q5) this.f33670b).d;
                x5Var.f39526b0 = i10;
                x5Var.G0(true);
                return;
            case 11:
                dc dcVar = ((bc) this.f33670b).f32333f;
                dcVar.f32932y = i10;
                dcVar.d(true);
                return;
            default:
                lv lvVar = (lv) this.f33670b;
                if (lvVar.f35456f[0].f35163f != i10) {
                    if (i10 == lvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    lvVar.f35460w = z11;
                    kv kvVar = lvVar.f35456f[1];
                    kvVar.f35163f = i10;
                    kvVar.setVisibility(0);
                    lvVar.m0(true);
                    lvVar.f35458r = z10;
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
        switch (this.f33669a) {
            case 7:
                return;
            default:
                ((j70) this.f33670b).f34651w.dismiss();
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
    public boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        k8 k8Var = (k8) this.f33670b;
        if (k8Var.f34925b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= k8Var.f34925b.getChildCount()) {
                    break;
                }
                View childAt = k8Var.f34925b.getChildAt(i13);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    if (h8Var.f34155n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < h8Var.f34155n.size(); i14++) {
                            ArrayList arrayList = ((i8) h8Var.f34155n.valueAt(i14)).f34378b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = h8Var.f34155n.keyAt(i14);
                                k8Var.f34934h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h8Var.f34156r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.f918c = imageReceiver;
                                    if (k8Var.f34935i0 == null) {
                                        k8Var.f34935i0 = new a1(this, 11);
                                    }
                                    gcVar.e = k8Var.f34935i0;
                                    gcVar.f916a = h8Var;
                                    gcVar.f920g = k8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.f921i = k8Var.fragmentView.getBottom();
                                    gcVar.f917b = null;
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
        switch (this.f33669a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((w10) this.f33670b).f38767i0.finish();
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
        switch (this.f33669a) {
            case 3:
                f4 f4Var = (f4) this.f33670b;
                int i10 = f4Var.f33407b;
                return String.valueOf(Math.round((f4Var.f33406a.getProgress() * (f4Var.f33408c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        wp0 wp0Var = (wp0) this.f33670b;
        if (str.equals("drawableMsgIn")) {
            return wp0Var.f39406w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return wp0Var.f39407x;
        }
        org.telegram.ui.ActionBar.e6 e6Var = wp0Var.f39405s;
        if (e6Var != null) {
            return e6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f33669a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public void i1() {
        b7 b7Var = ((z6) this.f33670b).e;
        zh.b bVar = b7Var.f32260c0;
        if (bVar != null && bVar.f49521j.size() > 0) {
            b7Var.f32260c0.d();
            y6 y6Var = b7Var.M;
            if (y6Var != null) {
                y6Var.f(false);
                b7Var.M.e();
            }
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f33669a) {
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
        wb wbVar = ((sb) this.f33670b).f37385n;
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
        ((s4.h0) this.f33670b).s(i10, i11);
    }

    @Override
    public void l(boolean z10) {
        int i10 = this.f33669a;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f33670b).r(i10, i11, null);
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        switch (this.f33669a) {
            case 3:
                f4 f4Var = (f4) this.f33670b;
                return f4Var.f33408c - f4Var.f33407b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean n1(int i10, View view) {
        switch (this.f33669a) {
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
        switch (this.f33669a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f33669a) {
            case 15:
                return ((my) this.f33670b).E0.isInPreviewMode();
            default:
                dh0 dh0Var = (dh0) this.f33670b;
                View view2 = null;
                dh0Var.O = null;
                int childCount = dh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = dh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !dh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f33669a) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        cd cdVar = (cd) this.f33670b;
        e6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
        if (e6Var instanceof bd) {
            e6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) e6Var2).f32336a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f33669a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.o2) ((my) this.f33670b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f33669a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f33669a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f33669a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        nj njVar = (nj) this.f33670b;
        View view = njVar.f36014a;
        if (view != null) {
            view.setPressed(true);
            njVar.f36014a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && njVar.f36014a.getBackground() != null) {
                njVar.f36014a.getBackground().setVisible(true, false);
            }
            njVar.f36014a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        nj njVar = (nj) this.f33670b;
        xn xnVar = njVar.f36021w;
        if (njVar.f36014a != null) {
            xnVar.Q8 = org.telegram.ui.Components.o9.b(xnVar, njVar.v, xnVar.T5, xnVar.d(), xnVar.f39750ea);
            org.telegram.ui.ActionBar.o1 o1Var = xnVar.Q8;
            if (o1Var != null) {
                njVar.f36015b = o1Var;
                o1Var.setOnDismissListener(new g0(njVar, 2));
                xnVar.f39977x0.C0();
                xnVar.f40002z0.R = false;
                View view = njVar.v;
                xnVar.ob(view);
                if (view != xnVar.f39803j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xnVar.g8(false, z10, 0.3f);
                xnVar.h9(false);
                gl glVar = xnVar.f40005z3;
                if (glVar != null) {
                    glVar.e(1, true);
                }
                UndoView undoView = xnVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                lk lkVar = xnVar.Y;
                if (lkVar != null && lkVar.getEditField() != null) {
                    xnVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f33669a) {
            case 15:
                return;
            default:
                dh0 dh0Var = (dh0) this.f33670b;
                dh0.k(dh0Var, view, f7, f10);
                dh0.m(dh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(dh0Var.H, 450L);
                dh0Var.O = null;
                dh0Var.invalidate();
                dh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f33669a) {
            case 15:
                return;
            default:
                dh0 dh0Var = (dh0) this.f33670b;
                dh0.k(dh0Var, view, f7, f10);
                dh0.m(dh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(dh0Var.H, 450L);
                View view2 = dh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                dh0Var.O = null;
                dh0Var.invalidate();
                dh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f33669a) {
            case 15:
                return;
            default:
                dh0 dh0Var = (dh0) this.f33670b;
                dh0.k(dh0Var, view, f7, f10);
                dh0.m(dh0Var, f7, false, false);
                dh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f33669a) {
            case 15:
                return false;
            default:
                dh0 dh0Var = (dh0) this.f33670b;
                dh0.k(dh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(dh0Var.H);
                dh0.l(dh0Var);
                dh0.m(dh0Var, f7, true, false);
                dh0Var.invalidate();
                dh0Var.Q.a(true, true);
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
        nj njVar = (nj) this.f33670b;
        if (!njVar.e && (view = njVar.f36014a) != null) {
            view.callOnClick();
            njVar.e = true;
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
        ((w10) this.f33670b).f38767i0.e(f7);
    }

    @Override
    public void s0(String str) {
        ((ik) this.f33670b).f34499b.da(str, false);
    }

    @Override
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((g60) this.f33670b).k1().k(0L, 33, null, null, null, null);
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
        return org.telegram.ui.ActionBar.i6.f19387v3;
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.f33669a) {
            case 18:
                sg.f fVar2 = ((i20) this.f33670b).f34343c.f43242c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((i20) this.f33670b).f34343c.f43242c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public void y() {
        int i10 = this.f33669a;
    }

    @Override
    public org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.f33670b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (wbVar.f38888p0.contains(Long.valueOf(j3))) {
                    wbVar.f38888p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.f38888p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
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
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void R1() {
    }

    @Override
    public void S0(int i10) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void U() {
    }

    @Override
    public void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.u1 u1Var) {
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
    public void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void v(pk0 pk0Var) {
    }

    @Override
    public void x2() {
    }

    @Override
    public void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void z0() {
    }

    @Override
    public void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override
    public void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
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
    public void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
