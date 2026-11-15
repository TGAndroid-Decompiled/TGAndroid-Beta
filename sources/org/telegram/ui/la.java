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
public final class la extends org.telegram.ui.ActionBar.e2 {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public ga E;
    public ia F;
    public ka G;
    public org.telegram.ui.Cells.b2 H;
    public org.telegram.ui.ActionBar.z4 f48906a;
    public org.telegram.ui.Components.uj0 f48907b;
    public ea f48908c;
    public boolean d;
    public int f48909e;
    public String f48910f;
    public u5 h;
    public boolean f48911n;
    public String f48912r;
    public final ArrayList f48913s;
    public final ArrayList f48914w;
    public final ArrayList f48915x;
    public final long f48916y;

    public la(Bundle bundle) {
        super(bundle);
        this.f48912r = "";
        this.f48913s = new ArrayList();
        this.f48914w = new ArrayList();
        this.f48915x = new ArrayList();
        if (bundle != null) {
            this.f48916y = bundle.getLong("bot_id");
        }
    }

    public static void Z(la laVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.t4.c0(laVar.currentAccount, tL_error, laVar, updateusername, new Object[0]);
        laVar.m0();
    }

    public static void b0(la laVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        laVar.f48909e = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(checkusername, new z9(laVar, str, checkusername, 0), 2);
    }

    public static void c0(la laVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user) {
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.np.s1(laVar.currentAccount).Y3(arrayList, false);
        org.telegram.messenger.vr.a0(laVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.m10.i(laVar.currentAccount).v(true);
        laVar.finishFragment();
    }

    public static void d0(la laVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = laVar.f48916y;
        ArrayList arrayList = laVar.f48914w;
        ArrayList arrayList2 = laVar.f48913s;
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
            reorderusernames3.bot = org.telegram.messenger.np.s1(laVar.currentAccount).o1(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        laVar.getConnectionsManager().sendRequest(reorderusernames, new fi.m5(15));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User a22 = org.telegram.messenger.np.s1(laVar.currentAccount).a2(Long.valueOf(laVar.l0()));
        a22.usernames = arrayList4;
        org.telegram.messenger.np.s1(laVar.currentAccount).X3(a22, false, true);
    }

    public static void e0(la laVar) {
        if (laVar.f48916y != 0) {
            laVar.finishFragment();
            return;
        }
        if (laVar.f48912r.startsWith("@")) {
            laVar.f48912r = laVar.f48912r.substring(1);
        }
        if (!laVar.f48912r.isEmpty() && !laVar.i0(laVar.f48912r)) {
            laVar.m0();
            return;
        }
        TLRPC.User k02 = laVar.k0();
        if (laVar.getParentActivity() != null && k02 != null) {
            String n10 = org.telegram.messenger.q10.n(k02);
            if (n10 == null) {
                n10 = "";
            }
            if (n10.equals(laVar.f48912r)) {
                laVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, laVar.getParentActivity(), null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = laVar.f48912r;
            org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(laVar.currentAccount);
            int i7 = org.telegram.messenger.np.D8;
            f10.k(org.telegram.messenger.ns.f25560r, 1);
            int sendRequest = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(updateusername, new z9(laVar, t1Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(laVar.currentAccount).bindRequestToGuid(sendRequest, laVar.classGuid);
            t1Var.setOnCancelListener(new di.z(laVar, sendRequest, 1));
            t1Var.show();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743674, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 2));
        this.f48906a = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(l0()));
        if (a22 == null) {
            a22 = k0();
        }
        if (a22 != null) {
            this.f48912r = null;
            if (a22.usernames != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= a22.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = a22.usernames.get(i7);
                    if (tL_username != null && tL_username.editable) {
                        this.f48912r = tL_username.username;
                        break;
                    }
                    i7++;
                }
            }
            if (this.f48912r == null && (str = a22.username) != null) {
                this.f48912r = str;
            }
            if (this.f48912r == null) {
                this.f48912r = "";
            }
            this.f48913s.clear();
            ArrayList arrayList = this.f48914w;
            arrayList.clear();
            for (int i10 = 0; i10 < a22.usernames.size(); i10++) {
                if (a22.usernames.get(i10).active) {
                    arrayList.add(a22.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < a22.usernames.size(); i11++) {
                if (!a22.usernames.get(i11).active) {
                    arrayList.add(a22.usernames.get(i11));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f48907b = uj0Var;
        uj0Var.r1();
        this.f48907b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.f48907b;
        ea eaVar = new ea(this);
        this.f48908c = eaVar;
        uj0Var2.setAdapter(eaVar);
        org.telegram.ui.ActionBar.q6.J(this.f48907b, org.telegram.ui.ActionBar.j6.f28941i6, getResourceProvider());
        this.f48907b.setSectionsDrawBackground(true);
        new v4.y(new gi.c(this, 1)).h(this.f48907b);
        ((FrameLayout) this.fragmentView).addView(this.f48907b, c8.ja.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new gi.a(6));
        this.f48907b.setOnItemClickListener(new ca(this));
        org.telegram.messenger.g0.i3(new fq0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f48907b;
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
        u5 u5Var = this.h;
        if (u5Var != null) {
            org.telegram.messenger.g0.r(u5Var);
            this.h = null;
            this.f48910f = null;
            if (this.f48909e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f48909e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var2 = this.H;
                        if (b2Var2 != null) {
                            b2Var2.setText(org.telegram.messenger.hd.M0(2131743652, null));
                            org.telegram.ui.Cells.b2 b2Var3 = this.H;
                            int i11 = org.telegram.ui.ActionBar.j6.f29070p7;
                            b2Var3.setTag(Integer.valueOf(i11));
                            org.telegram.ui.ActionBar.q6.U(this.H, i11, null);
                            ka kaVar2 = this.G;
                            if (kaVar2 != null) {
                                ka.a(kaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var4 = this.H;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.hd.M0(2131743656, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.H;
                            int i12 = org.telegram.ui.ActionBar.j6.f29070p7;
                            b2Var5.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.q6.U(this.H, i12, null);
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
                    b2Var6.setText(org.telegram.messenger.hd.M0(2131743656, null));
                    org.telegram.ui.Cells.b2 b2Var7 = this.H;
                    int i13 = org.telegram.ui.ActionBar.j6.f29070p7;
                    b2Var7.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.q6.U(this.H, i13, null);
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
                    b2Var8.setText(org.telegram.messenger.hd.M0(2131743655, null));
                    org.telegram.ui.Cells.b2 b2Var9 = this.H;
                    int i14 = org.telegram.ui.ActionBar.j6.f29070p7;
                    b2Var9.setTag(Integer.valueOf(i14));
                    org.telegram.ui.ActionBar.q6.U(this.H, i14, null);
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
                        b2Var10.setText(org.telegram.messenger.hd.a0("UsernameAvailable", null, 2131743667, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.H;
                        int i15 = org.telegram.ui.ActionBar.j6.f29203w6;
                        b2Var11.setTag(Integer.valueOf(i15));
                        org.telegram.ui.ActionBar.q6.U(this.H, i15, null);
                        ka kaVar6 = this.G;
                        if (kaVar6 != null) {
                            ka.a(kaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.H;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.hd.M0(2131743666, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.H;
                    int i16 = org.telegram.ui.ActionBar.j6.F6;
                    b2Var13.setTag(Integer.valueOf(i16));
                    org.telegram.ui.ActionBar.q6.U(this.H, i16, null);
                    ka kaVar7 = this.G;
                    if (kaVar7 != null) {
                        ka.a(kaVar7);
                    }
                }
                this.f48910f = str;
                u5 u5Var2 = new u5(7, this, str);
                this.h = u5Var2;
                org.telegram.messenger.g0.i3(u5Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.b2 b2Var14 = this.H;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.hd.M0(2131743654, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.H;
                int i17 = org.telegram.ui.ActionBar.j6.f29070p7;
                b2Var15.setTag(Integer.valueOf(i17));
                org.telegram.ui.ActionBar.q6.U(this.H, i17, null);
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
            if (!gaVar.f47380a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.f47380a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.f47380a.requestFocus();
            if (z10) {
                org.telegram.messenger.g0.J3(this.E.f47380a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j3 = this.f48916y;
        if (j3 != 0) {
            return org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(j3));
        }
        return org.telegram.messenger.m10.i(this.currentAccount).f();
    }

    public final long l0() {
        long j3 = this.f48916y;
        if (j3 != 0) {
            return j3;
        }
        return org.telegram.messenger.m10.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.f48907b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f48907b.getChildCount(); i7++) {
            View childAt = this.f48907b.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && i7 == 0) {
                org.telegram.messenger.g0.G3(((org.telegram.ui.Cells.n4) childAt).getTextView());
            } else if (childAt instanceof ka) {
                org.telegram.messenger.g0.G3(childAt);
            } else if (childAt instanceof ga) {
                ga gaVar = (ga) childAt;
                org.telegram.messenger.g0.G3(gaVar.f47380a);
                org.telegram.messenger.g0.G3(gaVar.f47381b);
            }
        }
        org.telegram.messenger.p2.APP_ERROR.a();
    }

    public final void n0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.la.n0(int, boolean, boolean):void");
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f48914w;
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
        if (!org.telegram.messenger.np.e1().getBoolean("view_animations", true)) {
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
