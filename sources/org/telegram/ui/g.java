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
public final class g implements u9, lv0, org.telegram.ui.web.c1, org.telegram.ui.Components.to0, org.telegram.ui.Components.c5, org.telegram.ui.Components.zm0, j7, ai.fc, org.telegram.ui.Components.nl0, org.telegram.ui.Cells.l1, od1, mm, me.a, org.telegram.ui.Components.pl0, org.telegram.ui.Cells.s7, org.telegram.ui.Components.lq, org.telegram.ui.Components.lq0, s4.e0, org.telegram.ui.Components.m8, org.telegram.ui.Components.i20, r0.n, au, v11, org.telegram.ui.ActionBar.f6 {
    public final int f33798a;
    public final Object f33799b;

    public g(Object obj, int i10) {
        this.f33798a = i10;
        this.f33799b = obj;
    }

    @Override
    public void B() {
        switch (this.f33798a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f33799b).f34375b.N();
                return;
        }
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C() {
        int i10 = this.f33798a;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f33799b).p(i10, i11);
    }

    @Override
    public void D0(MessageObject messageObject) {
        l3 l3Var = ((h4) this.f33799b).f34130u0[0];
        if (l3Var != null) {
            l3Var.f35305b.J0(true);
        }
    }

    @Override
    public int F0(int i10) {
        cq0 cq0Var = (cq0) this.f33799b;
        int indexOfKey = cq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.f32846s;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.f33799b).e;
        if (s6Var != null) {
            if (z6Var.f40134c0.f49523j.size() <= 0 && !z10) {
                if (z6Var.G > 0 && z6Var.getParentActivity() != null) {
                    s6Var.getClass();
                    boolean z11 = true;
                    zh.b bVar = new zh.b(true);
                    SparseArray sparseArray = s6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((t6) sparseArray.get(0)).f37661b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((t6) sparseArray.get(1)).f37661b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((t6) sparseArray.get(2)).f37661b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f49520f;
                    if (obj3 != null) {
                        arrayList3.addAll(((t6) sparseArray.get(3)).f37661b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f49521g;
                    if (obj4 != null) {
                        arrayList4.addAll(((t6) sparseArray.get(4)).f37661b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f49523j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((zh.a) arrayList.get(i10));
                        if (((zh.a) arrayList.get(i10)).d == 0) {
                            bVar.f49531r += ((zh.a) arrayList.get(i10)).f49514c;
                        } else {
                            bVar.f49532s += ((zh.a) arrayList.get(i10)).f49514c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((zh.a) arrayList2.get(i11));
                        bVar.f49533t += ((zh.a) arrayList2.get(i11)).f49514c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((zh.a) arrayList3.get(i12));
                        bVar.f49534u += ((zh.a) arrayList3.get(i12)).f49514c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((zh.a) arrayList4.get(i13));
                        bVar.v += ((zh.a) arrayList4.get(i13)).f49514c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f49526m = z11;
                    bVar.f49527n = z11;
                    bVar.f49528o = z11;
                    bVar.f49529p = z11;
                    bVar.f49530q = z11;
                    Collections.sort(arrayList, new mb1(26));
                    Collections.sort(arrayList2, new mb1(26));
                    Collections.sort(arrayList3, new mb1(26));
                    Collections.sort(arrayList4, new mb1(26));
                    Collections.sort(bVar.h, new mb1(26));
                    kv kvVar = new kv(z6Var, s6Var, bVar, new m5.e(z6Var, s6Var, false, 6));
                    z6Var.X = kvVar;
                    z6Var.showDialog(kvVar);
                    return;
                }
                return;
            }
            zh.b bVar2 = z6Var.f40134c0;
            HashSet hashSet2 = bVar2.f49523j;
            HashSet hashSet3 = bVar2.f49525l;
            long j3 = s6Var.f37324a;
            SparseArray sparseArray2 = s6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((t6) sparseArray2.valueAt(i14)).f37661b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        zh.a aVar2 = (zh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f49524k += aVar2.f49514c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((t6) sparseArray2.valueAt(i16)).f37661b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        zh.a aVar3 = (zh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f49524k -= aVar3.f49514c;
                        }
                    }
                }
            }
            bVar2.c();
            z6Var.M.e();
            z6.h0(z6Var);
        } else if (aVar != null) {
            z6Var.f40134c0.i(aVar);
            z6Var.M.e();
            z6.h0(z6Var);
        }
    }

    @Override
    public String I0() {
        return null;
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
    public void K(String str) {
        h hVar = (h) this.f33799b;
        hVar.finishFragment(false);
        z10 z10Var = hVar.f34039x;
        LaunchActivity launchActivity = (LaunchActivity) z10Var.f40085b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.f18705g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new oo(27, b2Var, (h) z10Var.f40086c));
    }

    @Override
    public int K0(int i10) {
        switch (this.f33798a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void M0(int i10, int i11) {
        ((s4.h0) this.f33799b).t(i10, i11);
    }

    @Override
    public boolean N0(long j3) {
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
    public CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        dj0 dj0Var = (dj0) this.f33799b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        dj0Var.e = defaultWindowInsets;
        dj0Var.G.setPadding(defaultWindowInsets.f10592a, defaultWindowInsets.f10593b, defaultWindowInsets.f10594c, defaultWindowInsets.d);
        dj0Var.F.requestLayout();
        return r0.l1.f42174b;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
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
        l70 l70Var = (l70) this.f33799b;
        l70Var.W = i10;
        AndroidUtilities.updateVisibleRows(l70Var.f35353b);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V0() {
        return false;
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        String formatString;
        switch (this.f33798a) {
            case 3:
                d4 d4Var = (d4) this.f33799b;
                int i10 = d4Var.f32941b;
                int round = Math.round(((d4Var.f32942c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    d4Var.f32943f.f34130u0[0].getAdapter().f33509y.clear();
                    h4 h4Var = d4Var.f32943f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        h4Var.f34130u0[i11].f35306c.l();
                        f4 f4Var = h4Var.f34130u0[i11].f35306c;
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
                nc0 nc0Var = (nc0) this.f33799b;
                pc0 pc0Var = nc0Var.f36000y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    pc0Var.Y();
                    ArrayList arrayList2 = pc0Var.f36564s;
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
                org.telegram.ui.Components.cw0 cw0Var = ((i5) this.f33799b).f34375b;
                cw0Var.M();
                cw0Var.N();
                return;
        }
    }

    @Override
    public boolean X0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        i8 i8Var = (i8) this.f33799b;
        if (i8Var.f34493b == null) {
            e5Var.run();
        }
        i8Var.f34493b.post(e5Var);
    }

    @Override
    public void Z0(vt vtVar) {
        fk0 fk0Var = (fk0) this.f33799b;
        fk0Var.E = true;
        String str = vtVar.f38620c;
        fk0Var.O.setText(str);
        fk0Var.u(str, vtVar);
        fk0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        fk0Var.Q.requestFocus();
        dk0 dk0Var = fk0Var.Q;
        dk0Var.setSelection(dk0Var.length());
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f33798a) {
            case 12:
                bd bdVar = (bd) this.f33799b;
                f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                    return f6Var2.a();
                }
                return org.telegram.ui.ActionBar.j6.I.q();
            default:
                return ((cq0) this.f33799b).S;
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
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
        oj ojVar = (oj) this.f33799b;
        View view = ojVar.f36342a;
        if (view != null) {
            view.setPressed(false);
            ojVar.f36342a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ojVar.f36342a.getBackground() != null) {
                ojVar.f36342a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ojVar.f36346n;
        if (view2 != null && !ojVar.d) {
            view2.callOnClick();
            ojVar.d = true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.f33799b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            x10.a(x10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!x10Var.f39334o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.S(f7)) {
                        x10Var.f39328i0.f(s2Var);
                        return true;
                    }
                }
                x10.a(x10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void c0() {
        ((nk0) this.f33799b).a();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void clear() {
        ((x6) this.f33799b).e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f33798a) {
            case 6:
                v5 v5Var = ((o5) this.f33799b).d;
                v5Var.f38415b0 = i10;
                v5Var.G0(true);
                return;
            case 11:
                dc dcVar = ((bc) this.f33799b).f32366f;
                dcVar.f33029y = i10;
                dcVar.d(true);
                return;
            default:
                ov ovVar = (ov) this.f33799b;
                if (ovVar.f36413f[0].f36155f != i10) {
                    if (i10 == ovVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ovVar.f36417w = z11;
                    nv nvVar = ovVar.f36413f[1];
                    nvVar.f36155f = i10;
                    nvVar.setVisibility(0);
                    ovVar.m0(true);
                    ovVar.f36415r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f33798a) {
            case 7:
                return;
            default:
                ((l70) this.f33799b).f35359w.dismiss();
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
    public boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(int i10) {
        return F0(i10);
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        i8 i8Var = (i8) this.f33799b;
        if (i8Var.f34493b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= i8Var.f34493b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.f34493b.getChildAt(i13);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.f33560n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < f8Var.f33560n.size(); i14++) {
                            ArrayList arrayList = ((g8) f8Var.f33560n.valueAt(i14)).f33849b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = f8Var.f33560n.keyAt(i14);
                                i8Var.f34502h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.f33561r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.f914c = imageReceiver;
                                    if (i8Var.f34503i0 == null) {
                                        i8Var.f34503i0 = new y0(this, 11);
                                    }
                                    gcVar.e = i8Var.f34503i0;
                                    gcVar.f912a = f8Var;
                                    gcVar.f916g = i8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.f917i = i8Var.fragmentView.getBottom();
                                    gcVar.f913b = null;
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
        switch (this.f33798a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g() {
        ((x10) this.f33799b).f39328i0.finish();
    }

    @Override
    public int g1(int i10) {
        return F0(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f33798a) {
            case 3:
                d4 d4Var = (d4) this.f33799b;
                int i10 = d4Var.f32941b;
                return String.valueOf(Math.round((d4Var.f32940a.getProgress() * (d4Var.f32942c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        cq0 cq0Var = (cq0) this.f33799b;
        if (str.equals("drawableMsgIn")) {
            return cq0Var.f32847w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cq0Var.f32848x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.f32846s;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f33798a) {
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
    public TextureView h0() {
        return null;
    }

    @Override
    public void h1() {
        z6 z6Var = ((x6) this.f33799b).e;
        zh.b bVar = z6Var.f40134c0;
        if (bVar != null && bVar.f49523j.size() > 0) {
            z6Var.f40134c0.d();
            w6 w6Var = z6Var.M;
            if (w6Var != null) {
                w6Var.f(false);
                z6Var.M.e();
            }
        }
    }

    @Override
    public int i0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public boolean i1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f33798a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void k() {
        vb vbVar = ((rb) this.f33799b).f37120n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f33799b).s(i10, i11);
    }

    @Override
    public void k1(int i10, int i11) {
        ((s4.h0) this.f33799b).r(i10, i11, null);
    }

    @Override
    public void l(boolean z10) {
        int i10 = this.f33798a;
    }

    @Override
    public int l0() {
        switch (this.f33798a) {
            case 3:
                d4 d4Var = (d4) this.f33799b;
                return d4Var.f32942c - d4Var.f32941b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m1(int i10, View view) {
        switch (this.f33798a) {
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
    public boolean needCancelTouchBySlopMove() {
        switch (this.f33798a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f33798a) {
            case 15:
                return ((ny) this.f33799b).E0.isInPreviewMode();
            default:
                ih0 ih0Var = (ih0) this.f33799b;
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
        switch (this.f33798a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        bd bdVar = (bd) this.f33799b;
        f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (f6Var instanceof ad) {
            f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) f6Var2).f32058a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f33798a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ny) this.f33799b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f33798a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f33798a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f33798a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.f33799b;
        View view = ojVar.f36342a;
        if (view != null) {
            view.setPressed(true);
            ojVar.f36342a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ojVar.f36342a.getBackground() != null) {
                ojVar.f36342a.getBackground().setVisible(true, false);
            }
            ojVar.f36342a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        oj ojVar = (oj) this.f33799b;
        zn znVar = ojVar.f36349w;
        if (ojVar.f36342a != null) {
            znVar.Q8 = org.telegram.ui.Components.n9.b(znVar, ojVar.v, znVar.T5, znVar.d(), znVar.f40324ea);
            org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
            if (n1Var != null) {
                ojVar.f36343b = n1Var;
                n1Var.setOnDismissListener(new e0(ojVar, 2));
                znVar.f40551x0.C0();
                znVar.f40576z0.R = false;
                View view = ojVar.v;
                znVar.ob(view);
                if (view != znVar.f40377j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                znVar.g8(false, z10, 0.3f);
                znVar.h9(false);
                hl hlVar = znVar.f40579z3;
                if (hlVar != null) {
                    hlVar.e(1, true);
                }
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                mk mkVar = znVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f33798a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f33799b;
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
        switch (this.f33798a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f33799b;
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
        switch (this.f33798a) {
            case 15:
                return;
            default:
                ih0 ih0Var = (ih0) this.f33799b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, false);
                ih0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f33798a) {
            case 15:
                return false;
            default:
                ih0 ih0Var = (ih0) this.f33799b;
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
        oj ojVar = (oj) this.f33799b;
        if (!ojVar.e && (view = ojVar.f36342a) != null) {
            view.callOnClick();
            ojVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean p0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override
    public void q(float f7) {
        ((x10) this.f33799b).f39328i0.e(f7);
    }

    @Override
    public void s0(String str) {
        ((jk) this.f33799b).f34965b.da(str, false);
    }

    @Override
    public void t0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((i60) this.f33799b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void v0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.f33798a) {
            case 18:
                sg.f fVar2 = ((k20) this.f33799b).f35043c.f43232c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (fVar = ((k20) this.f33799b).f35043c.f43232c) != null) {
                    fVar.B = i10;
                    return;
                }
                return;
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
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19437v3;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y() {
        int i10 = this.f33798a;
    }

    @Override
    public void y0(float f7) {
        switch (this.f33798a) {
            case 6:
            case 11:
                return;
            default:
                ov ovVar = (ov) this.f33799b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || ovVar.f36413f[1].getVisibility() == 0) {
                    if (ovVar.f36415r) {
                        nv nvVar = ovVar.f36413f[0];
                        nvVar.setTranslationX((-f7) * nvVar.getMeasuredWidth());
                        nv[] nvVarArr = ovVar.f36413f;
                        nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth() - (f7 * ovVar.f36413f[0].getMeasuredWidth()));
                    } else {
                        nv nvVar2 = ovVar.f36413f[0];
                        nvVar2.setTranslationX(nvVar2.getMeasuredWidth() * f7);
                        nv[] nvVarArr2 = ovVar.f36413f;
                        nvVarArr2[1].setTranslationX((f7 * nvVarArr2[0].getMeasuredWidth()) - ovVar.f36413f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        nv[] nvVarArr3 = ovVar.f36413f;
                        nv nvVar3 = nvVarArr3[0];
                        nvVarArr3[0] = nvVarArr3[1];
                        nvVarArr3[1] = nvVar3;
                        nvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public org.telegram.ui.Cells.s9 z2() {
        return null;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        vb vbVar = (vb) this.f33799b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (vbVar.f38512p0.contains(Long.valueOf(j3))) {
                    vbVar.f38512p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    vbVar.f38512p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                vbVar.W0(true);
                vbVar.R0();
                vbVar.E.l();
                return;
            }
        }
        vbVar.P0(view, f7, f10);
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

    private final void p1() {
    }

    private final void r1() {
    }

    private final void s1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void A0() {
    }

    @Override
    public void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.u1 u1Var) {
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
    public void O0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void R0(int i10) {
    }

    @Override
    public void R1() {
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
    public void Y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void a1(org.telegram.ui.Cells.u1 u1Var) {
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
    public void j0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void j1() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void o0(String str) {
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
    public void v(wk0 wk0Var) {
    }

    @Override
    public void x2() {
    }

    @Override
    public void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
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
    public void Q0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
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
    public void n1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    private final void A1(View view, float f7, float f10) {
    }

    private final void C1(View view, float f7, float f10) {
    }

    private final void F1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final void u1(View view, float f7, float f10) {
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
    public void B0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }

    @Override
    public void r0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
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
    public void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
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
