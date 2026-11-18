package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class la extends org.telegram.ui.ActionBar.h2 {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public ga E;
    public ia F;
    public ka G;
    public org.telegram.ui.Cells.b2 H;
    public org.telegram.ui.ActionBar.d5 f49509a;
    public org.telegram.ui.Components.ck0 f49510b;
    public ea f49511c;
    public boolean d;
    public int f49512e;
    public String f49513f;
    public k9 h;
    public boolean f49514n;
    public String f49515r;
    public final ArrayList f49516s;
    public final ArrayList f49517w;
    public final ArrayList f49518x;
    public final long f49519y;

    public la(Bundle bundle) {
        super(bundle);
        this.f49515r = "";
        this.f49516s = new ArrayList();
        this.f49517w = new ArrayList();
        this.f49518x = new ArrayList();
        if (bundle != null) {
            this.f49519y = bundle.getLong("bot_id");
        }
    }

    public static void Z(la laVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.b5.c0(laVar.currentAccount, tL_error, laVar, updateusername, new Object[0]);
        laVar.m0();
    }

    public static void b0(la laVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        laVar.f49512e = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(checkusername, new z9(laVar, str, checkusername, 0), 2);
    }

    public static void c0(la laVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.mp.u1(laVar.currentAccount).f4(arrayList, false);
        org.telegram.messenger.tr.a0(laVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.j10.i(laVar.currentAccount).v(true);
        laVar.finishFragment();
    }

    public static void d0(la laVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = laVar.f49519y;
        ArrayList arrayList = laVar.f49517w;
        ArrayList arrayList2 = laVar.f49516s;
        if (!laVar.d) {
            return;
        }
        laVar.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            if (((TLRPC.TL_username) arrayList2.get(i7)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i7)).username);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((TLRPC.TL_username) arrayList.get(i10)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i10)).username);
            }
        }
        if (j3 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = org.telegram.messenger.mp.u1(laVar.currentAccount).q1(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        laVar.getConnectionsManager().sendRequest(reorderusernames, new fi.k5(15));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User c22 = org.telegram.messenger.mp.u1(laVar.currentAccount).c2(Long.valueOf(laVar.l0()));
        c22.usernames = arrayList4;
        org.telegram.messenger.mp.u1(laVar.currentAccount).e4(c22, false, true);
    }

    public static void e0(la laVar) {
        if (laVar.f49519y != 0) {
            laVar.finishFragment();
            return;
        }
        if (laVar.f49515r.startsWith("@")) {
            laVar.f49515r = laVar.f49515r.substring(1);
        }
        if (!laVar.f49515r.isEmpty() && !laVar.i0(laVar.f49515r)) {
            laVar.m0();
            return;
        }
        TLRPC.User k02 = laVar.k0();
        if (laVar.getParentActivity() != null && k02 != null) {
            String o4 = org.telegram.messenger.o10.o(k02);
            if (o4 == null) {
                o4 = "";
            }
            if (o4.equals(laVar.f49515r)) {
                laVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, laVar.getParentActivity(), null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = laVar.f49515r;
            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(laVar.currentAccount);
            int i7 = org.telegram.messenger.mp.I8;
            f10.k(org.telegram.messenger.ks.f25179r, 1);
            int sendRequest = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(updateusername, new z9(laVar, u1Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(laVar.currentAccount).bindRequestToGuid(sendRequest, laVar.classGuid);
            u1Var.setOnCancelListener(new di.z(laVar, sendRequest, 1));
            u1Var.show();
        }
    }

    public static int f0(la laVar) {
        return laVar.currentAccount;
    }

    public static int g0(la laVar) {
        return laVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131743437, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 4));
        this.f49509a = this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null));
        TLRPC.User c22 = org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(l0()));
        if (c22 == null) {
            c22 = k0();
        }
        if (c22 != null) {
            this.f49515r = null;
            if (c22.usernames != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= c22.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = c22.usernames.get(i7);
                    if (tL_username != null && tL_username.editable) {
                        this.f49515r = tL_username.username;
                        break;
                    }
                    i7++;
                }
            }
            if (this.f49515r == null && (str = c22.username) != null) {
                this.f49515r = str;
            }
            if (this.f49515r == null) {
                this.f49515r = "";
            }
            this.f49516s.clear();
            ArrayList arrayList = this.f49517w;
            arrayList.clear();
            for (int i10 = 0; i10 < c22.usernames.size(); i10++) {
                if (c22.usernames.get(i10).active) {
                    arrayList.add(c22.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < c22.usernames.size(); i11++) {
                if (!c22.usernames.get(i11).active) {
                    arrayList.add(c22.usernames.get(i11));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f49510b = ck0Var;
        ck0Var.r1();
        this.f49510b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.f49510b;
        ea eaVar = new ea(this);
        this.f49511c = eaVar;
        ck0Var2.setAdapter(eaVar);
        org.telegram.ui.ActionBar.u6.J(this.f49510b, org.telegram.ui.ActionBar.n6.f29488i6, getResourceProvider());
        this.f49510b.setSectionsDrawBackground(true);
        new v4.z(new gi.c(this, 1)).h(this.f49510b);
        ((FrameLayout) this.fragmentView).addView(this.f49510b, c8.ma.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new gi.a(6));
        this.f49510b.setOnItemClickListener(new ca(this));
        org.telegram.messenger.g0.h3(new hq0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f49510b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final boolean i0(String str) {
        int i7;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.b2 b2Var = this.H;
        if (b2Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            b2Var.setVisibility(i7);
            ka kaVar = this.G;
            if (kaVar != null) {
                ka.a(kaVar);
            }
        }
        k9 k9Var = this.h;
        if (k9Var != null) {
            org.telegram.messenger.g0.r(k9Var);
            this.h = null;
            this.f49513f = null;
            if (this.f49512e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f49512e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var2 = this.H;
                        if (b2Var2 != null) {
                            b2Var2.setText(org.telegram.messenger.gd.M0(2131743415, null));
                            org.telegram.ui.Cells.b2 b2Var3 = this.H;
                            int i11 = org.telegram.ui.ActionBar.n6.f29617p7;
                            b2Var3.setTag(Integer.valueOf(i11));
                            org.telegram.ui.ActionBar.u6.U(this.H, i11, null);
                            ka kaVar2 = this.G;
                            if (kaVar2 != null) {
                                ka.a(kaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var4 = this.H;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.gd.M0(2131743419, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.H;
                            int i12 = org.telegram.ui.ActionBar.n6.f29617p7;
                            b2Var5.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.u6.U(this.H, i12, null);
                            ka kaVar3 = this.G;
                            if (kaVar3 != null) {
                                ka.a(kaVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.b2 b2Var6 = this.H;
                if (b2Var6 != null) {
                    b2Var6.setText(org.telegram.messenger.gd.M0(2131743419, null));
                    org.telegram.ui.Cells.b2 b2Var7 = this.H;
                    int i13 = org.telegram.ui.ActionBar.n6.f29617p7;
                    b2Var7.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.u6.U(this.H, i13, null);
                    ka kaVar4 = this.G;
                    if (kaVar4 != null) {
                        ka.a(kaVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.b2 b2Var8 = this.H;
                if (b2Var8 != null) {
                    b2Var8.setText(org.telegram.messenger.gd.M0(2131743418, null));
                    org.telegram.ui.Cells.b2 b2Var9 = this.H;
                    int i14 = org.telegram.ui.ActionBar.n6.f29617p7;
                    b2Var9.setTag(Integer.valueOf(i14));
                    org.telegram.ui.ActionBar.u6.U(this.H, i14, null);
                    ka kaVar5 = this.G;
                    if (kaVar5 != null) {
                        ka.a(kaVar5);
                        return false;
                    }
                }
            } else {
                String str2 = k0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.b2 b2Var10 = this.H;
                    if (b2Var10 != null) {
                        b2Var10.setText(org.telegram.messenger.gd.a0("UsernameAvailable", null, 2131743430, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.H;
                        int i15 = org.telegram.ui.ActionBar.n6.f29750w6;
                        b2Var11.setTag(Integer.valueOf(i15));
                        org.telegram.ui.ActionBar.u6.U(this.H, i15, null);
                        ka kaVar6 = this.G;
                        if (kaVar6 != null) {
                            ka.a(kaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.H;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.gd.M0(2131743429, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.H;
                    int i16 = org.telegram.ui.ActionBar.n6.F6;
                    b2Var13.setTag(Integer.valueOf(i16));
                    org.telegram.ui.ActionBar.u6.U(this.H, i16, null);
                    ka kaVar7 = this.G;
                    if (kaVar7 != null) {
                        ka.a(kaVar7);
                    }
                }
                this.f49513f = str;
                k9 k9Var2 = new k9(3, this, str);
                this.h = k9Var2;
                org.telegram.messenger.g0.h3(k9Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.b2 b2Var14 = this.H;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.gd.M0(2131743417, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.H;
                int i17 = org.telegram.ui.ActionBar.n6.f29617p7;
                b2Var15.setTag(Integer.valueOf(i17));
                org.telegram.ui.ActionBar.u6.U(this.H, i17, null);
                ka kaVar8 = this.G;
                if (kaVar8 != null) {
                    ka.a(kaVar8);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        ga gaVar = this.E;
        if (gaVar != null) {
            if (!gaVar.f48007a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.f48007a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.f48007a.requestFocus();
            if (z10) {
                org.telegram.messenger.g0.I3(this.E.f48007a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j3 = this.f49519y;
        if (j3 != 0) {
            return org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(j3));
        }
        return org.telegram.messenger.j10.i(this.currentAccount).f();
    }

    public final long l0() {
        long j3 = this.f49519y;
        if (j3 != 0) {
            return j3;
        }
        return org.telegram.messenger.j10.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.f49510b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f49510b.getChildCount(); i7++) {
            View childAt = this.f49510b.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && i7 == 0) {
                org.telegram.messenger.g0.F3(((org.telegram.ui.Cells.n4) childAt).getTextView());
            } else if (childAt instanceof ka) {
                org.telegram.messenger.g0.F3(childAt);
            } else if (childAt instanceof ga) {
                ga gaVar = (ga) childAt;
                org.telegram.messenger.g0.F3(gaVar.f48007a);
                org.telegram.messenger.g0.F3(gaVar.f48008b);
            }
        }
        org.telegram.messenger.q2.APP_ERROR.a();
    }

    public final void n0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.la.n0(int, boolean, boolean):void");
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f49517w;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) == tL_username) {
                    n0(i7 + 4, z10, z11);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.mp.g1().getBoolean("view_animations", true)) {
            j0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            j0(false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
