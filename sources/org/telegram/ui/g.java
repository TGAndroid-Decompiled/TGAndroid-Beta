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
public final class g implements t9, nv0, org.telegram.ui.web.b1, org.telegram.ui.Components.no0, org.telegram.ui.Components.c5, org.telegram.ui.Components.vm0, h7, zh.q7, org.telegram.ui.Components.kl0, org.telegram.ui.Cells.k1, rd1, qm, me.a, org.telegram.ui.Components.ml0, org.telegram.ui.Cells.s7, org.telegram.ui.Components.rq, org.telegram.ui.Components.hq0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.r20, r0.n, au, b21, org.telegram.ui.ActionBar.f6 {
    public final int f32949a;
    public final Object f32950b;

    public g(Object obj, int i10) {
        this.f32949a = i10;
        this.f32950b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f32949a;
    }

    @Override
    public void C(int i10, int i11) {
        ((s4.h0) this.f32950b).p(i10, i11);
    }

    @Override
    public void D0(MessageObject messageObject) {
        n3 n3Var = ((j4) this.f32950b).f33920u0[0];
        if (n3Var != null) {
            n3Var.f35102b.I0(true);
        }
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int F0(int i10) {
        bq0 bq0Var = (bq0) this.f32950b;
        int indexOfKey = bq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.f31354s;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public void H0(long j3, int i10, zh.j2 j2Var) {
        h8 h8Var = (h8) this.f32950b;
        if (h8Var.f33302b == null) {
            j2Var.run();
        }
        h8Var.f33302b.post(j2Var);
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new bi.s(this, i10, 15), 50L);
    }

    @Override
    public void J(String str) {
        h hVar = (h) this.f32950b;
        hVar.finishFragment(false);
        l80 l80Var = hVar.f33226x;
        LaunchActivity launchActivity = (LaunchActivity) l80Var.f34614b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.f17621g0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new org.telegram.ui.Components.th(22, d2Var, (h) l80Var.f34615c));
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public int K0(int i10) {
        switch (this.f32949a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void O0(int i10, int i11) {
        ((s4.h0) this.f32950b).t(i10, i11);
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        cj0 cj0Var = (cj0) this.f32950b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cj0Var.e = defaultWindowInsets;
        cj0Var.G.setPadding(defaultWindowInsets.f10074a, defaultWindowInsets.f10075b, defaultWindowInsets.f10076c, defaultWindowInsets.d);
        cj0Var.F.requestLayout();
        return r0.l1.f41073b;
    }

    @Override
    public int U() {
        return 0;
    }

    @Override
    public void U0(int i10, int i11) {
        k70 k70Var = (k70) this.f32950b;
        k70Var.W = i10;
        AndroidUtilities.updateVisibleRows(k70Var.f34248b);
    }

    @Override
    public boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void W(float f7, boolean z10) {
        String formatString;
        switch (this.f32949a) {
            case 3:
                f4 f4Var = (f4) this.f32950b;
                int i10 = f4Var.f32678b;
                int round = Math.round(((f4Var.f32679c - i10) * f7) + i10);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    f4Var.f32680f.f33920u0[0].getAdapter().f33267y.clear();
                    j4 j4Var = f4Var.f32680f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        j4Var.f33920u0[i11].f35103c.l();
                        h4 h4Var = j4Var.f33920u0[i11].f35103c;
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
                lc0 lc0Var = (lc0) this.f32950b;
                nc0 nc0Var = lc0Var.f34651y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    nc0Var.Y();
                    ArrayList arrayList2 = nc0Var.f35215s;
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
                org.telegram.ui.Components.aw0 aw0Var = ((i5) this.f32950b).f33536b;
                aw0Var.M();
                aw0Var.N();
                return;
        }
    }

    @Override
    public boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public gh.a X() {
        return null;
    }

    @Override
    public rv0 X1() {
        return null;
    }

    @Override
    public boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public boolean Y1(long j3) {
        return false;
    }

    @Override
    public void Z() {
        ((mk0) this.f32950b).a();
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.f32949a) {
            case 12:
                cd cdVar = (cd) this.f32950b;
                f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
                if (f6Var != null) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
                    return f6Var2.a();
                }
                return org.telegram.ui.ActionBar.j6.I.q();
            default:
                return ((bq0) this.f32950b).S;
        }
    }

    @Override
    public void a0(r6 r6Var, yh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = ((w6) this.f32950b).e;
        if (r6Var != null) {
            if (y6Var.Y.f47178j.size() <= 0 && !z10) {
                if (y6Var.H > 0 && y6Var.getParentActivity() != null) {
                    r6Var.getClass();
                    boolean z11 = true;
                    yh.b bVar = new yh.b(true);
                    SparseArray sparseArray = r6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = bVar.d;
                    if (obj != null) {
                        arrayList.addAll(((s6) sparseArray.get(0)).f36560b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((s6) sparseArray.get(1)).f36560b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = bVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((s6) sparseArray.get(2)).f36560b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = bVar.f47175f;
                    if (obj3 != null) {
                        arrayList3.addAll(((s6) sparseArray.get(3)).f36560b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = bVar.f47176g;
                    if (obj4 != null) {
                        arrayList4.addAll(((s6) sparseArray.get(4)).f36560b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = bVar.f47178j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((yh.a) arrayList.get(i10));
                        if (((yh.a) arrayList.get(i10)).d == 0) {
                            bVar.f47186r += ((yh.a) arrayList.get(i10)).f47169c;
                        } else {
                            bVar.f47187s += ((yh.a) arrayList.get(i10)).f47169c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((yh.a) arrayList2.get(i11));
                        bVar.f47188t += ((yh.a) arrayList2.get(i11)).f47169c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((yh.a) arrayList3.get(i12));
                        bVar.f47189u += ((yh.a) arrayList3.get(i12)).f47169c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((yh.a) arrayList4.get(i13));
                        bVar.v += ((yh.a) arrayList4.get(i13)).f47169c;
                        i13++;
                        z11 = true;
                    }
                    bVar.f47181m = z11;
                    bVar.f47182n = z11;
                    bVar.f47183o = z11;
                    bVar.f47184p = z11;
                    bVar.f47185q = z11;
                    Collections.sort(arrayList, new sg.p(19));
                    Collections.sort(arrayList2, new sg.p(19));
                    Collections.sort(arrayList3, new sg.p(19));
                    Collections.sort(arrayList4, new sg.p(19));
                    Collections.sort(bVar.h, new sg.p(19));
                    lv lvVar = new lv(y6Var, r6Var, bVar, new n7.a1(y6Var, r6Var, false, 4));
                    y6Var.T = lvVar;
                    y6Var.showDialog(lvVar);
                    return;
                }
                return;
            }
            yh.b bVar2 = y6Var.Y;
            HashSet hashSet2 = bVar2.f47178j;
            HashSet hashSet3 = bVar2.f47180l;
            long j3 = r6Var.f36238a;
            SparseArray sparseArray2 = r6Var.d;
            if (!hashSet3.contains(Long.valueOf(j3))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((s6) sparseArray2.valueAt(i14)).f36560b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        yh.a aVar2 = (yh.a) obj5;
                        if (hashSet2.add(aVar2)) {
                            bVar2.f47179k += aVar2.f47169c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((s6) sparseArray2.valueAt(i16)).f36560b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        yh.a aVar3 = (yh.a) obj6;
                        if (hashSet2.remove(aVar3)) {
                            bVar2.f47179k -= aVar3.f47169c;
                        }
                    }
                }
            }
            bVar2.c();
            y6Var.N.d();
            y6.g0(y6Var);
        } else if (aVar != null) {
            y6Var.Y.i(aVar);
            y6Var.N.d();
            y6.g0(y6Var);
        }
    }

    @Override
    public void a1(wt wtVar) {
        ek0 ek0Var = (ek0) this.f32950b;
        ek0Var.E = true;
        String str = wtVar.f38388c;
        ek0Var.O.setText(str);
        ek0Var.u(str, wtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new i10(this, 28), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override
    public boolean a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b1() {
        qj qjVar = (qj) this.f32950b;
        View view = qjVar.f36073a;
        if (view != null) {
            view.setPressed(false);
            qjVar.f36073a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && qjVar.f36073a.getBackground() != null) {
                qjVar.f36073a.getBackground().setVisible(false, false);
            }
        }
        View view2 = qjVar.f36077n;
        if (view2 != null && !qjVar.d) {
            view2.callOnClick();
            qjVar.d = true;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        z10 z10Var = (z10) this.f32950b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            z10.a(z10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.r2) {
                if (!z10Var.f39178o0.f()) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    if (r2Var.S(f7)) {
                        z10Var.f39172i0.f(r2Var);
                        return true;
                    }
                }
                z10.a(z10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public void clear() {
        ((w6) this.f32950b).e.m0();
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f32949a) {
            case 6:
                w5 w5Var = ((o5) this.f32950b).d;
                w5Var.f37704b0 = i10;
                w5Var.G0(true);
                return;
            case 11:
                ec ecVar = ((cc) this.f32950b).f31604f;
                ecVar.f32154y = i10;
                ecVar.d(true);
                return;
            default:
                pv pvVar = (pv) this.f32950b;
                if (pvVar.f35910f[0].f35619f != i10) {
                    if (i10 == pvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pvVar.f35914w = z11;
                    ov ovVar = pvVar.f35910f[1];
                    ovVar.f35619f = i10;
                    ovVar.setVisibility(0);
                    pvVar.m0(true);
                    pvVar.f35912r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f32949a) {
            case 7:
                return;
            default:
                ((k70) this.f32950b).f34254w.d(true);
                return;
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public int e0(int i10) {
        return F0(i10);
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
    public int f1(int i10) {
        return F0(i10);
    }

    @Override
    public boolean forceEnableVibration() {
        switch (this.f32949a) {
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
    public TextureView g0() {
        return null;
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        return org.telegram.messenger.em.a(messageObject);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f32949a) {
            case 3:
                f4 f4Var = (f4) this.f32950b;
                int i10 = f4Var.f32678b;
                return String.valueOf(Math.round((f4Var.f32677a.getProgress() * (f4Var.f32679c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        bq0 bq0Var = (bq0) this.f32950b;
        if (str.equals("drawableMsgIn")) {
            return bq0Var.f31355w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bq0Var.f31356x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.f31354s;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f32949a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((z10) this.f32950b).f39172i0.finish();
    }

    @Override
    public int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public void h1() {
        y6 y6Var = ((w6) this.f32950b).e;
        yh.b bVar = y6Var.Y;
        if (bVar != null && bVar.f47178j.size() > 0) {
            y6Var.Y.d();
            v6 v6Var = y6Var.N;
            if (v6Var != null) {
                v6Var.e(false);
                y6Var.N.d();
            }
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f32949a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        wb wbVar = ((sb) this.f32950b).f36638n;
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
    public void j0(int i10, int i11) {
        ((s4.h0) this.f32950b).s(i10, i11);
    }

    @Override
    public boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f32949a;
    }

    @Override
    public int k0() {
        switch (this.f32949a) {
            case 3:
                f4 f4Var = (f4) this.f32950b;
                return f4Var.f32679c - f4Var.f32678b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void k1(int i10, int i11) {
        ((s4.h0) this.f32950b).r(i10, i11, null);
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m1(int i10, View view) {
        switch (this.f32949a) {
            case 6:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        cd cdVar = (cd) this.f32950b;
        f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
        if (f6Var instanceof bd) {
            f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) f6Var2).f31236a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        switch (this.f32949a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f32949a) {
            case 15:
                return ((py) this.f32950b).E0.isInPreviewMode();
            default:
                hh0 hh0Var = (hh0) this.f32950b;
                View view2 = null;
                hh0Var.O = null;
                int childCount = hh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = hh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !hh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f32949a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.f32949a) {
            case 15:
                f5Var = ((org.telegram.ui.ActionBar.p2) ((py) this.f32950b).E0).parentLayout;
                ((ActionBarLayout) f5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f32949a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f32949a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f32949a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        qj qjVar = (qj) this.f32950b;
        View view = qjVar.f36073a;
        if (view != null) {
            view.setPressed(true);
            qjVar.f36073a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && qjVar.f36073a.getBackground() != null) {
                qjVar.f36073a.getBackground().setVisible(true, false);
            }
            qjVar.f36073a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        qj qjVar = (qj) this.f32950b;
        eo eoVar = qjVar.f36080w;
        if (qjVar.f36073a != null) {
            eoVar.Q8 = org.telegram.ui.Components.o9.b(eoVar, qjVar.v, eoVar.T5, eoVar.d(), eoVar.f32316ea);
            org.telegram.ui.ActionBar.p1 p1Var = eoVar.Q8;
            if (p1Var != null) {
                qjVar.f36074b = p1Var;
                p1Var.setOnDismissListener(new f0(qjVar, 2));
                eoVar.f32542x0.B0();
                eoVar.f32567z0.R = false;
                View view = qjVar.v;
                eoVar.ob(view);
                if (view != eoVar.f32368j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eoVar.g8(false, z10, 0.3f);
                eoVar.h9(false);
                ll llVar = eoVar.f32570z3;
                if (llVar != null) {
                    llVar.e(1, true);
                }
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ok okVar = eoVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    eoVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f32949a) {
            case 15:
                return;
            default:
                hh0 hh0Var = (hh0) this.f32950b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f32949a) {
            case 15:
                return;
            default:
                hh0 hh0Var = (hh0) this.f32950b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                View view2 = hh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f32949a) {
            case 15:
                return;
            default:
                hh0 hh0Var = (hh0) this.f32950b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, false);
                hh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f32949a) {
            case 15:
                return false;
            default:
                hh0 hh0Var = (hh0) this.f32950b;
                hh0.k(hh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(hh0Var.H);
                hh0.l(hh0Var);
                hh0.m(hh0Var, f7, true, false);
                hh0Var.invalidate();
                hh0Var.Q.a(true, true);
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
        qj qjVar = (qj) this.f32950b;
        if (!qjVar.e && (view = qjVar.f36073a) != null) {
            view.callOnClick();
            qjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(float f7) {
        ((z10) this.f32950b).f39172i0.e(f7);
    }

    @Override
    public void r0(String str) {
        ((lk) this.f32950b).f34734b.da(str, false);
    }

    @Override
    public void s0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((j60) this.f32950b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void t0(int i10, int i11, boolean z10) {
        rg.g gVar;
        switch (this.f32949a) {
            case 18:
                rg.g gVar2 = ((l20) this.f32950b).f34526c.f41455c;
                if (gVar2 != null) {
                    gVar2.C = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (gVar = ((l20) this.f32950b).f34526c.f41455c) != null) {
                    gVar.B = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean t2(int i10) {
        return false;
    }

    @Override
    public String v(long j3) {
        return null;
    }

    @Override
    public void v0(float f7) {
        switch (this.f32949a) {
            case 6:
            case 11:
                return;
            default:
                pv pvVar = (pv) this.f32950b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || pvVar.f35910f[1].getVisibility() == 0) {
                    if (pvVar.f35912r) {
                        ov ovVar = pvVar.f35910f[0];
                        ovVar.setTranslationX((-f7) * ovVar.getMeasuredWidth());
                        ov[] ovVarArr = pvVar.f35910f;
                        ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth() - (f7 * pvVar.f35910f[0].getMeasuredWidth()));
                    } else {
                        ov ovVar2 = pvVar.f35910f[0];
                        ovVar2.setTranslationX(ovVar2.getMeasuredWidth() * f7);
                        ov[] ovVarArr2 = pvVar.f35910f;
                        ovVarArr2[1].setTranslationX((f7 * ovVarArr2[0].getMeasuredWidth()) - pvVar.f35910f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        ov[] ovVarArr3 = pvVar.f35910f;
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
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.f18251v3;
    }

    @Override
    public void x() {
        int i10 = this.f32949a;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public org.telegram.ui.Cells.t9 x2() {
        return null;
    }

    @Override
    public void y() {
        switch (this.f32949a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((i5) this.f32950b).f33536b.N();
                return;
        }
    }

    @Override
    public boolean y0(long j3, int i10, int i11, int i12, zh.r7 r7Var) {
        h8 h8Var = (h8) this.f32950b;
        if (h8Var.f33302b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.f33302b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.f33302b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.f32113n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.f32113n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.f32113n.valueAt(i14)).f32704b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.f32113n.keyAt(i14);
                                h8Var.f33311h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.f32114r.get(keyAt);
                                if (imageReceiver != null) {
                                    r7Var.f48843c = imageReceiver;
                                    if (h8Var.f33312i0 == null) {
                                        h8Var.f33312i0 = new a1(this, 10);
                                    }
                                    r7Var.e = h8Var.f33312i0;
                                    r7Var.f48841a = e8Var;
                                    r7Var.f48845g = h8Var.fragmentView;
                                    r7Var.h = AndroidUtilities.dp(36.0f);
                                    r7Var.f48846i = h8Var.fragmentView.getBottom();
                                    r7Var.f48842b = null;
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
    public boolean z1() {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.f32950b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (wbVar.f37814t0.contains(Long.valueOf(j3))) {
                    wbVar.f37814t0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.f37814t0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.X0(true);
                wbVar.R0();
                wbVar.I.l();
                return;
            }
        }
        wbVar.P0(view, f7, f10);
    }

    private final void P1(float f7) {
    }

    private final void R1(float f7) {
    }

    private final void W1() {
    }

    private final void b2() {
    }

    private final void d2() {
    }

    private final void f2() {
    }

    private final void g2() {
    }

    private final void h2(boolean z10) {
    }

    private final void i2(boolean z10) {
    }

    private final void p1() {
    }

    private final void q1() {
    }

    private final void r1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void A0() {
    }

    @Override
    public void B1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void G(MessageObject messageObject) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void K1(MessageObject messageObject) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void Q1() {
    }

    @Override
    public void S(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void S0(int i10) {
    }

    @Override
    public void T() {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
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
    public void c0(int i10) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onDismiss() {
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
    public void u(vk0 vk0Var) {
    }

    @Override
    public void v2() {
    }

    @Override
    public void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
    }

    @Override
    public void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void V(boolean z10, boolean z11) {
    }

    @Override
    public void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final void A1(View view, float f7, float f10) {
    }

    private final void D1(View view, float f7, float f10) {
    }

    private final void H1(View view, float f7, float f10) {
    }

    private final void s1(View view, float f7, float f10) {
    }

    private final void u1(View view, float f7, float f10) {
    }

    private final void v1(View view, float f7, float f10) {
    }

    private final void w1(View view, float f7, float f10) {
    }

    private final void x1(View view, float f7, float f10) {
    }

    private final void y1(View view, float f7, float f10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
