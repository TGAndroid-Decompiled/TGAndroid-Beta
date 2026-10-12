package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
public final class g implements y9, sv0, org.telegram.ui.web.a1, org.telegram.ui.Components.fp0, org.telegram.ui.Components.f5, org.telegram.ui.Components.nn0, m7, bi.ob, org.telegram.ui.Components.bm0, org.telegram.ui.Cells.l1, td1, sm, oe.a, org.telegram.ui.Components.dm0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.yq, org.telegram.ui.Components.yq0, s4.d0, org.telegram.ui.Components.r8, org.telegram.ui.Components.v20, r0.o, eu, b21, org.telegram.ui.ActionBar.c6 {
    public final int f36262a;
    public final Object f36263b;

    public g(Object obj, int i10) {
        this.f36262a = i10;
        this.f36263b = obj;
    }

    @Override
    public void B0(float f7) {
        switch (this.f36262a) {
            case 6:
            case 11:
                return;
            default:
                sv svVar = (sv) this.f36263b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || svVar.f40220f[1].getVisibility() == 0) {
                    if (svVar.f40222r) {
                        rv rvVar = svVar.f40220f[0];
                        rvVar.setTranslationX((-f7) * rvVar.getMeasuredWidth());
                        rv[] rvVarArr = svVar.f40220f;
                        rvVarArr[1].setTranslationX(rvVarArr[0].getMeasuredWidth() - (f7 * svVar.f40220f[0].getMeasuredWidth()));
                    } else {
                        rv rvVar2 = svVar.f40220f[0];
                        rvVar2.setTranslationX(rvVar2.getMeasuredWidth() * f7);
                        rv[] rvVarArr2 = svVar.f40220f;
                        rvVarArr2[1].setTranslationX((f7 * rvVarArr2[0].getMeasuredWidth()) - svVar.f40220f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        rv[] rvVarArr3 = svVar.f40220f;
                        rv rvVar3 = rvVarArr3[0];
                        rvVarArr3[0] = rvVarArr3[1];
                        rvVarArr3[1] = rvVar3;
                        rvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C() {
        int i10 = this.f36262a;
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.g0) this.f36263b).p(i10, i11);
    }

    @Override
    public void D0(MessageObject messageObject) {
        o3 o3Var = ((k4) this.f36263b).f37557u0[0];
        if (o3Var != null) {
            o3Var.f38847b.I0(true);
        }
    }

    @Override
    public int F0(int i10) {
        gq0 gq0Var = (gq0) this.f36263b;
        int indexOfKey = gq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return gq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = gq0Var.f36465s;
        if (c6Var != null) {
            return c6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override
    public void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override
    public boolean H0(long j10, int i10, int i11, int i12, bi.pb pbVar) {
        l8 l8Var = (l8) this.f36263b;
        if (l8Var.f37868b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= l8Var.f37868b.getChildCount()) {
                    break;
                }
                View childAt = l8Var.f37868b.getChildAt(i13);
                if (childAt instanceof i8) {
                    i8 i8Var = (i8) childAt;
                    if (i8Var.f37060n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < i8Var.f37060n.size(); i14++) {
                            ArrayList arrayList = ((j8) i8Var.f37060n.valueAt(i14)).f37303b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = i8Var.f37060n.keyAt(i14);
                                l8Var.f37877h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) i8Var.f37061r.get(keyAt);
                                if (imageReceiver != null) {
                                    pbVar.f3482c = imageReceiver;
                                    if (l8Var.f37878i0 == null) {
                                        l8Var.f37878i0 = new b1(this, 10);
                                    }
                                    pbVar.e = l8Var.f37878i0;
                                    pbVar.f3480a = i8Var;
                                    pbVar.f3484g = l8Var.fragmentView;
                                    pbVar.h = AndroidUtilities.dp(36.0f);
                                    pbVar.f3485i = l8Var.fragmentView.getBottom();
                                    pbVar.f3481b = null;
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
    public CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public String I0() {
        return null;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 17), 50L);
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void K(String str) {
        h hVar = (h) this.f36263b;
        hVar.finishFragment(false);
        gw gwVar = hVar.f36559x;
        LaunchActivity launchActivity = (LaunchActivity) gwVar.f36501b;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(launchActivity, 3, null);
        a2Var.f19569g0 = false;
        a2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new to(27, a2Var, (h) gwVar.f36502c));
    }

    @Override
    public int L0(int i10) {
        switch (this.f36262a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P0(int i10, int i11) {
        ((s4.g0) this.f36263b).t(i10, i11);
    }

    @Override
    public wv0 P1() {
        return null;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        hj0 hj0Var = (hj0) this.f36263b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        hj0Var.e = defaultWindowInsets;
        hj0Var.G.setPadding(defaultWindowInsets.f10888a, defaultWindowInsets.f10889b, defaultWindowInsets.f10890c, defaultWindowInsets.d);
        hj0Var.F.requestLayout();
        return r0.l1.f43740b;
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void X(float f7, boolean z10) {
        int i10;
        String formatString;
        switch (this.f36262a) {
            case 3:
                g4 g4Var = (g4) this.f36263b;
                int round = Math.round(((g4Var.f36300c - i10) * f7) + g4Var.f36299b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    g4Var.f36301f.f37557u0[0].getAdapter().f37028y.clear();
                    k4 k4Var = g4Var.f36301f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        k4Var.f37557u0[i11].f38848c.l();
                        i4 i4Var = k4Var.f37557u0[i11].f38848c;
                        ArrayList arrayList = i4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(i4Var.K);
                        Utilities.globalQueue.postRunnable(i4Var.K, 100L);
                    }
                    g4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                pc0 pc0Var = (pc0) this.f36263b;
                rc0 rc0Var = pc0Var.f39191y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    rc0Var.Y();
                    ArrayList arrayList2 = rc0Var.f39763s;
                    if (arrayList2.isEmpty()) {
                        rc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        if (LiteMode.getPowerSaverLevel() <= 0) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
                        } else if (LiteMode.getPowerSaverLevel() >= 100) {
                            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
                        } else {
                            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
                        }
                        arrayList2.set(1, new lc0(2, 0, formatString, 0, 0));
                        rc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            pc0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                m5.d = f7;
                org.telegram.ui.Components.ow0 ow0Var = ((m5) this.f36263b).f38164b;
                ow0Var.M();
                ow0Var.N();
                return;
        }
    }

    @Override
    public void X0(int i10, int i11) {
        p70 p70Var = (p70) this.f36263b;
        p70Var.W = i10;
        AndroidUtilities.updateVisibleRows(p70Var.f39131b);
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.f36262a) {
            case 12:
                hd hdVar = (hd) this.f36263b;
                c6Var = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
                if (c6Var != null) {
                    c6Var2 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
                    return c6Var2.a();
                }
                return org.telegram.ui.ActionBar.g6.I.q();
            default:
                return ((gq0) this.f36263b).S;
        }
    }

    @Override
    public void a0() {
        ((qk0) this.f36263b).a();
    }

    @Override
    public void a1(au auVar) {
        ik0 ik0Var = (ik0) this.f36263b;
        ik0Var.E = true;
        String str = auVar.f34341c;
        ik0Var.O.setText(str);
        ik0Var.w(str, auVar);
        ik0Var.E = false;
        AndroidUtilities.runOnUIThread(new zz(this, 29), 300L);
        ik0Var.Q.requestFocus();
        gk0 gk0Var = ik0Var.Q;
        gk0Var.setSelection(gk0Var.length());
    }

    @Override
    public int b0(int i10) {
        return F0(i10);
    }

    @Override
    public void b1() {
        tj tjVar = (tj) this.f36263b;
        View view = tjVar.f40394a;
        if (view != null) {
            view.setPressed(false);
            tjVar.f40394a.setSelected(false);
        }
        View view2 = tjVar.f40398n;
        if (view2 != null && !tjVar.d) {
            view2.callOnClick();
            tjVar.d = true;
        }
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void clear() {
        ((b7) this.f36263b).e.m0();
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        c20 c20Var = (c20) this.f36263b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            c20.a(c20Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            c20.a(c20Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            c20.a(c20Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            c20.a(c20Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.s2) {
                if (!c20Var.f34697o0.g()) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    if (s2Var.S(f7)) {
                        c20Var.f34691i0.f(s2Var);
                        return true;
                    }
                }
                c20.a(c20Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.d0.a(messageObject);
    }

    @Override
    public void dismiss() {
        switch (this.f36262a) {
            case 7:
                return;
            default:
                ((p70) this.f36263b).f39137w.d(true);
                return;
        }
    }

    @Override
    public void e(int i10, boolean z10) {
        boolean z11;
        switch (this.f36262a) {
            case 6:
                z5 z5Var = ((s5) this.f36263b).d;
                z5Var.f42480b0 = i10;
                z5Var.H0(true);
                return;
            case 11:
                ic icVar = ((gc) this.f36263b).f36372f;
                icVar.f37094y = i10;
                icVar.d(true);
                return;
            default:
                sv svVar = (sv) this.f36263b;
                if (svVar.f40220f[0].f39874f != i10) {
                    if (i10 == svVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    svVar.f40224w = z11;
                    rv rvVar = svVar.f40220f[1];
                    rvVar.f39874f = i10;
                    rvVar.setVisibility(0);
                    svVar.m0(true);
                    svVar.f40222r = z10;
                    return;
                }
                return;
        }
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
    public boolean forceEnableVibration() {
        switch (this.f36262a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public int g1(int i10) {
        return F0(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f36262a) {
            case 3:
                g4 g4Var = (g4) this.f36263b;
                int i10 = g4Var.f36299b;
                return String.valueOf(Math.round((g4Var.f36298a.getProgress() * (g4Var.f36300c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        gq0 gq0Var = (gq0) this.f36263b;
        if (str.equals("drawableMsgIn")) {
            return gq0Var.f36466w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return gq0Var.f36467x;
        }
        org.telegram.ui.ActionBar.c6 c6Var = gq0Var.f36465s;
        if (c6Var != null) {
            return c6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.P0(str);
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f36262a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((c20) this.f36263b).f34691i0.finish();
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public void i1() {
        d7 d7Var = ((b7) this.f36263b).e;
        ai.c cVar = d7Var.Y;
        if (cVar != null && cVar.f926j.size() > 0) {
            d7Var.Y.d();
            a7 a7Var = d7Var.N;
            if (a7Var != null) {
                a7Var.e(false);
                d7Var.N.d();
            }
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.f36262a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        ac acVar = ((wb) this.f36263b).f41234n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            pf.d.s(acVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.s(acVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public void j0(int i10, int i11) {
        ((s4.g0) this.f36263b).s(i10, i11);
    }

    @Override
    public void j1(w6 w6Var, ai.b bVar, boolean z10) {
        HashSet hashSet;
        d7 d7Var = ((b7) this.f36263b).e;
        if (w6Var != null) {
            if (d7Var.Y.f926j.size() <= 0 && !z10) {
                if (d7Var.H > 0 && d7Var.getParentActivity() != null) {
                    w6Var.getClass();
                    boolean z11 = true;
                    ai.c cVar = new ai.c(true);
                    SparseArray sparseArray = w6Var.d;
                    Object obj = sparseArray.get(0);
                    ArrayList arrayList = cVar.d;
                    if (obj != null) {
                        arrayList.addAll(((x6) sparseArray.get(0)).f41761b);
                    }
                    if (sparseArray.get(1) != null) {
                        arrayList.addAll(((x6) sparseArray.get(1)).f41761b);
                    }
                    Object obj2 = sparseArray.get(2);
                    ArrayList arrayList2 = cVar.e;
                    if (obj2 != null) {
                        arrayList2.addAll(((x6) sparseArray.get(2)).f41761b);
                    }
                    Object obj3 = sparseArray.get(3);
                    ArrayList arrayList3 = cVar.f923f;
                    if (obj3 != null) {
                        arrayList3.addAll(((x6) sparseArray.get(3)).f41761b);
                    }
                    Object obj4 = sparseArray.get(4);
                    ArrayList arrayList4 = cVar.f924g;
                    if (obj4 != null) {
                        arrayList4.addAll(((x6) sparseArray.get(4)).f41761b);
                    }
                    int i10 = 0;
                    while (true) {
                        int size = arrayList.size();
                        hashSet = cVar.f926j;
                        if (i10 >= size) {
                            break;
                        }
                        hashSet.add((ai.b) arrayList.get(i10));
                        if (((ai.b) arrayList.get(i10)).d == 0) {
                            cVar.f934r += ((ai.b) arrayList.get(i10)).f917c;
                        } else {
                            cVar.f935s += ((ai.b) arrayList.get(i10)).f917c;
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        hashSet.add((ai.b) arrayList2.get(i11));
                        cVar.f936t += ((ai.b) arrayList2.get(i11)).f917c;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        hashSet.add((ai.b) arrayList3.get(i12));
                        cVar.f937u += ((ai.b) arrayList3.get(i12)).f917c;
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        hashSet.add((ai.b) arrayList4.get(i13));
                        cVar.v += ((ai.b) arrayList4.get(i13)).f917c;
                        i13++;
                        z11 = true;
                    }
                    cVar.f929m = z11;
                    cVar.f930n = z11;
                    cVar.f931o = z11;
                    cVar.f932p = z11;
                    cVar.f933q = z11;
                    Collections.sort(arrayList, new a4.d(3));
                    Collections.sort(arrayList2, new a4.d(3));
                    Collections.sort(arrayList3, new a4.d(3));
                    Collections.sort(arrayList4, new a4.d(3));
                    Collections.sort(cVar.h, new a4.d(3));
                    ov ovVar = new ov(d7Var, w6Var, cVar, new n6.o(d7Var, w6Var, false, 4));
                    d7Var.T = ovVar;
                    d7Var.showDialog(ovVar);
                    return;
                }
                return;
            }
            ai.c cVar2 = d7Var.Y;
            HashSet hashSet2 = cVar2.f926j;
            HashSet hashSet3 = cVar2.f928l;
            long j10 = w6Var.f41163a;
            SparseArray sparseArray2 = w6Var.d;
            if (!hashSet3.contains(Long.valueOf(j10))) {
                for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                    ArrayList arrayList5 = ((x6) sparseArray2.valueAt(i14)).f41761b;
                    int size2 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        ai.b bVar2 = (ai.b) obj5;
                        if (hashSet2.add(bVar2)) {
                            cVar2.f927k += bVar2.f917c;
                        }
                    }
                }
            } else {
                for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                    ArrayList arrayList6 = ((x6) sparseArray2.valueAt(i16)).f41761b;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList6.get(i17);
                        i17++;
                        ai.b bVar3 = (ai.b) obj6;
                        if (hashSet2.remove(bVar3)) {
                            cVar2.f927k -= bVar3.f917c;
                        }
                    }
                }
            }
            cVar2.c();
            d7Var.N.d();
            d7.g0(d7Var);
        } else if (bVar != null) {
            d7Var.Y.i(bVar);
            d7Var.N.d();
            d7.g0(d7Var);
        }
    }

    @Override
    public void k(boolean z10) {
        int i10 = this.f36262a;
    }

    @Override
    public int k0() {
        switch (this.f36262a) {
            case 3:
                g4 g4Var = (g4) this.f36263b;
                return g4Var.f36300c - g4Var.f36299b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public void m1(int i10, int i11) {
        ((s4.g0) this.f36263b).r(i10, i11, null);
    }

    @Override
    public boolean n1(int i10, View view) {
        switch (this.f36262a) {
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
        switch (this.f36262a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.f36262a) {
            case 15:
                return ((ry) this.f36263b).E0.isInPreviewMode();
            default:
                mh0 mh0Var = (mh0) this.f36263b;
                View view2 = null;
                mh0Var.O = null;
                int childCount = mh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = mh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view2 != null && !mh0Var.P.contains(view2)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        switch (this.f36262a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        hd hdVar = (hd) this.f36263b;
        c6Var = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
        if (c6Var instanceof gd) {
            c6Var2 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            hd hdVar2 = ((gd) c6Var2).f36376a;
            hdVar2.J = !hdVar2.J;
            hdVar2.d1();
            hdVar2.Z0(false);
        }
        hdVar.U0(a(), false);
        hdVar.Z0(false);
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f36262a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.m2) ((ry) this.f36263b).E0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.f36262a;
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.f36262a;
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.f36262a;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        tj tjVar = (tj) this.f36263b;
        View view = tjVar.f40394a;
        if (view != null) {
            view.setPressed(true);
            tjVar.f40394a.setSelected(true);
            tjVar.f40394a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        tj tjVar = (tj) this.f36263b;
        fo foVar = tjVar.f40401w;
        if (tjVar.f40394a != null) {
            foVar.Q8 = org.telegram.ui.Components.r9.b(foVar, tjVar.v, foVar.T5, foVar.d(), foVar.f35932ea);
            org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
            if (m1Var != null) {
                tjVar.f40395b = m1Var;
                m1Var.setOnDismissListener(new f0(tjVar, 2));
                foVar.f36160x0.B0();
                foVar.f36185z0.R = false;
                View view = tjVar.v;
                foVar.sb(view);
                if (view != foVar.f35984j1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                foVar.j8(false, z10, 0.3f);
                foVar.m9(false);
                ol olVar = foVar.f36188z3;
                if (olVar != null) {
                    olVar.e(1, true);
                }
                UndoView undoView = foVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                sk skVar = foVar.Y;
                if (skVar != null && skVar.getEditField() != null) {
                    foVar.Y.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.f36262a) {
            case 15:
                return;
            default:
                mh0 mh0Var = (mh0) this.f36263b;
                mh0.k(mh0Var, view, f7, f10);
                mh0.m(mh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(mh0Var.H, 450L);
                mh0Var.O = null;
                mh0Var.invalidate();
                mh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.f36262a) {
            case 15:
                return;
            default:
                mh0 mh0Var = (mh0) this.f36263b;
                mh0.k(mh0Var, view, f7, f10);
                mh0.m(mh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(mh0Var.H, 450L);
                View view2 = mh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                mh0Var.O = null;
                mh0Var.invalidate();
                mh0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.f36262a) {
            case 15:
                return;
            default:
                mh0 mh0Var = (mh0) this.f36263b;
                mh0.k(mh0Var, view, f7, f10);
                mh0.m(mh0Var, f7, false, false);
                mh0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.f36262a) {
            case 15:
                return false;
            default:
                mh0 mh0Var = (mh0) this.f36263b;
                mh0.k(mh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(mh0Var.H);
                mh0.l(mh0Var);
                mh0.m(mh0Var, f7, true, false);
                mh0Var.invalidate();
                mh0Var.Q.a(true, true);
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
        tj tjVar = (tj) this.f36263b;
        if (!tjVar.e && (view = tjVar.f40394a) != null) {
            view.callOnClick();
            tjVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(long j10, int i10, bi.r4 r4Var) {
        l8 l8Var = (l8) this.f36263b;
        if (l8Var.f37868b == null) {
            r4Var.run();
        }
        l8Var.f37868b.post(r4Var);
    }

    @Override
    public org.telegram.ui.Cells.p9 p2() {
        return null;
    }

    @Override
    public void q(float f7) {
        ((c20) this.f36263b).f34691i0.e(f7);
    }

    @Override
    public void r0(String str) {
        ((ok) this.f36263b).f38991b.ia(str, false);
    }

    @Override
    public void s0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((n60) this.f36263b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void t0(int i10, int i11, boolean z10) {
        tg.o oVar;
        switch (this.f36262a) {
            case 18:
                tg.o oVar2 = ((o20) this.f36263b).f38844c.f45705c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    return;
                }
                return;
            default:
                if (i11 == 0 && (oVar = ((o20) this.f36263b).f38844c.f45705c) != null) {
                    oVar.H = i10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.f20230v3;
    }

    @Override
    public void y() {
        int i10 = this.f36262a;
    }

    @Override
    public void z() {
        switch (this.f36262a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((m5) this.f36263b).f38164b.N();
                return;
        }
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ac acVar = (ac) this.f36263b;
        if ((view instanceof org.telegram.ui.Cells.x0) && (messageObject = ((org.telegram.ui.Cells.x0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (acVar.f34149p0.contains(Long.valueOf(j10))) {
                    acVar.f34149p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    acVar.f34149p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                acVar.W0(true);
                acVar.R0();
                acVar.E.l();
                return;
            }
        }
        acVar.P0(view, f7, f10);
    }

    private final void a2(float f7) {
    }

    private final void d2(float f7) {
    }

    private final void e2() {
    }

    private final void f2() {
    }

    private final void h2() {
    }

    private final void j2() {
    }

    private final void k2() {
    }

    private final void m2(boolean z10) {
    }

    private final void q1() {
    }

    private final void q2(boolean z10) {
    }

    private final void r1() {
    }

    private final void s1() {
    }

    @Override
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.u1 u1Var) {
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
    public void F1(MessageObject messageObject) {
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
    public void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L1() {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void U() {
    }

    @Override
    public void U0(int i10) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void W0(MrzRecognizer.Result result) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void l1() {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void n2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void onDismiss() {
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
    public void v(al0 al0Var) {
    }

    @Override
    public void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void N0(int i10, int i11) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    private final void C1(View view, float f7, float f10) {
    }

    private final void E1(View view, float f7, float f10) {
    }

    private final void T1(View view, float f7, float f10) {
    }

    private final void V1(View view, float f7, float f10) {
    }

    private final void X1(View view, float f7, float f10) {
    }

    private final void Y1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final void u1(View view, float f7, float f10) {
    }

    private final void y1(View view, float f7, float f10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void Z1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override
    public void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
