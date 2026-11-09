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
public final class la extends org.telegram.ui.ActionBar.f2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public ga D;
    public ia E;
    public ka F;
    public org.telegram.ui.Cells.b2 G;
    public org.telegram.ui.ActionBar.b5 f47538a;
    public org.telegram.ui.Components.qj0 f47539b;
    public ea f47540c;
    public boolean d;
    public int f47541e;
    public String f47542f;
    public org.telegram.ui.ActionBar.p h;
    public boolean f47543n;
    public String f47544r;
    public final ArrayList f47545s;
    public final ArrayList f47546w;
    public final ArrayList f47547x;
    public final long f47548y;

    public la(Bundle bundle) {
        super(bundle);
        this.f47544r = "";
        this.f47545s = new ArrayList();
        this.f47546w = new ArrayList();
        this.f47547x = new ArrayList();
        if (bundle != null) {
            this.f47548y = bundle.getLong("bot_id");
        }
    }

    public static void Z(la laVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.v4.c0(laVar.currentAccount, tL_error, laVar, updateusername, new Object[0]);
        laVar.m0();
    }

    public static void b0(la laVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        laVar.f47541e = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(checkusername, new z9(laVar, str, checkusername, 0), 2);
    }

    public static void c0(la laVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.qp.s1(laVar.currentAccount).Y3(arrayList, false);
        org.telegram.messenger.yr.a0(laVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.p10.i(laVar.currentAccount).v(true);
        laVar.finishFragment();
    }

    public static void d0(la laVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = laVar.f47548y;
        ArrayList arrayList = laVar.f47546w;
        ArrayList arrayList2 = laVar.f47545s;
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
            reorderusernames3.bot = org.telegram.messenger.qp.s1(laVar.currentAccount).o1(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        laVar.getConnectionsManager().sendRequest(reorderusernames, new di.v5(15));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User a22 = org.telegram.messenger.qp.s1(laVar.currentAccount).a2(Long.valueOf(laVar.l0()));
        a22.usernames = arrayList4;
        org.telegram.messenger.qp.s1(laVar.currentAccount).X3(a22, false, true);
    }

    public static void e0(la laVar) {
        if (laVar.f47548y != 0) {
            laVar.finishFragment();
            return;
        }
        if (laVar.f47544r.startsWith("@")) {
            laVar.f47544r = laVar.f47544r.substring(1);
        }
        if (!laVar.f47544r.isEmpty() && !laVar.i0(laVar.f47544r)) {
            laVar.m0();
            return;
        }
        TLRPC.User k02 = laVar.k0();
        if (laVar.getParentActivity() != null && k02 != null) {
            String n10 = org.telegram.messenger.t10.n(k02);
            if (n10 == null) {
                n10 = "";
            }
            if (n10.equals(laVar.f47544r)) {
                laVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, laVar.getParentActivity(), null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = laVar.f47544r;
            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(laVar.currentAccount);
            int i7 = org.telegram.messenger.qp.C8;
            f10.k(org.telegram.messenger.qs.f25063r, 1);
            int sendRequest = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(updateusername, new z9(laVar, u1Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(laVar.currentAccount).bindRequestToGuid(sendRequest, laVar.classGuid);
            u1Var.setOnCancelListener(new bi.g0(laVar, sendRequest, 1));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743674, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 1));
        this.f47538a = this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(l0()));
        if (a22 == null) {
            a22 = k0();
        }
        if (a22 != null) {
            this.f47544r = null;
            if (a22.usernames != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= a22.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = a22.usernames.get(i7);
                    if (tL_username != null && tL_username.editable) {
                        this.f47544r = tL_username.username;
                        break;
                    }
                    i7++;
                }
            }
            if (this.f47544r == null && (str = a22.username) != null) {
                this.f47544r = str;
            }
            if (this.f47544r == null) {
                this.f47544r = "";
            }
            this.f47545s.clear();
            ArrayList arrayList = this.f47546w;
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
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f47539b = qj0Var;
        qj0Var.r1();
        this.f47539b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var2 = this.f47539b;
        ea eaVar = new ea(this);
        this.f47540c = eaVar;
        qj0Var2.setAdapter(eaVar);
        org.telegram.ui.ActionBar.s6.J(this.f47539b, org.telegram.ui.ActionBar.l6.f27957i6, getResourceProvider());
        this.f47539b.setSectionsDrawBackground(true);
        new v4.y(new ei.d(this, 1)).h(this.f47539b);
        ((FrameLayout) this.fragmentView).addView(this.f47539b, c8.ha.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ei.b(6));
        this.f47539b.setOnItemClickListener(new ca(this));
        org.telegram.messenger.g0.i3(new iq0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f47539b;
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
        org.telegram.ui.Cells.b2 b2Var = this.G;
        if (b2Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            b2Var.setVisibility(i7);
            ka kaVar = this.F;
            if (kaVar != null) {
                ka.a(kaVar);
            }
        }
        org.telegram.ui.ActionBar.p pVar = this.h;
        if (pVar != null) {
            org.telegram.messenger.g0.r(pVar);
            this.h = null;
            this.f47542f = null;
            if (this.f47541e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f47541e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var2 = this.G;
                        if (b2Var2 != null) {
                            b2Var2.setText(org.telegram.messenger.id.M0(2131743652, null));
                            org.telegram.ui.Cells.b2 b2Var3 = this.G;
                            int i11 = org.telegram.ui.ActionBar.l6.f28086p7;
                            b2Var3.setTag(Integer.valueOf(i11));
                            org.telegram.ui.ActionBar.s6.U(this.G, i11, null);
                            ka kaVar2 = this.F;
                            if (kaVar2 != null) {
                                ka.a(kaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var4 = this.G;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.id.M0(2131743656, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.G;
                            int i12 = org.telegram.ui.ActionBar.l6.f28086p7;
                            b2Var5.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.s6.U(this.G, i12, null);
                            ka kaVar3 = this.F;
                            if (kaVar3 != null) {
                                ka.a(kaVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.b2 b2Var6 = this.G;
                if (b2Var6 != null) {
                    b2Var6.setText(org.telegram.messenger.id.M0(2131743656, null));
                    org.telegram.ui.Cells.b2 b2Var7 = this.G;
                    int i13 = org.telegram.ui.ActionBar.l6.f28086p7;
                    b2Var7.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.s6.U(this.G, i13, null);
                    ka kaVar4 = this.F;
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
                org.telegram.ui.Cells.b2 b2Var8 = this.G;
                if (b2Var8 != null) {
                    b2Var8.setText(org.telegram.messenger.id.M0(2131743655, null));
                    org.telegram.ui.Cells.b2 b2Var9 = this.G;
                    int i14 = org.telegram.ui.ActionBar.l6.f28086p7;
                    b2Var9.setTag(Integer.valueOf(i14));
                    org.telegram.ui.ActionBar.s6.U(this.G, i14, null);
                    ka kaVar5 = this.F;
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
                    org.telegram.ui.Cells.b2 b2Var10 = this.G;
                    if (b2Var10 != null) {
                        b2Var10.setText(org.telegram.messenger.id.a0("UsernameAvailable", null, 2131743667, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.G;
                        int i15 = org.telegram.ui.ActionBar.l6.f28219w6;
                        b2Var11.setTag(Integer.valueOf(i15));
                        org.telegram.ui.ActionBar.s6.U(this.G, i15, null);
                        ka kaVar6 = this.F;
                        if (kaVar6 != null) {
                            ka.a(kaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.G;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.id.M0(2131743666, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.G;
                    int i16 = org.telegram.ui.ActionBar.l6.F6;
                    b2Var13.setTag(Integer.valueOf(i16));
                    org.telegram.ui.ActionBar.s6.U(this.G, i16, null);
                    ka kaVar7 = this.F;
                    if (kaVar7 != null) {
                        ka.a(kaVar7);
                    }
                }
                this.f47542f = str;
                org.telegram.ui.ActionBar.p pVar2 = new org.telegram.ui.ActionBar.p(18, this, str);
                this.h = pVar2;
                org.telegram.messenger.g0.i3(pVar2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.b2 b2Var14 = this.G;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.id.M0(2131743654, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.G;
                int i17 = org.telegram.ui.ActionBar.l6.f28086p7;
                b2Var15.setTag(Integer.valueOf(i17));
                org.telegram.ui.ActionBar.s6.U(this.G, i17, null);
                ka kaVar8 = this.F;
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

    public final void j0(boolean z9) {
        ga gaVar = this.D;
        if (gaVar != null) {
            if (!gaVar.f45941a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.D.f45941a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.D.f45941a.requestFocus();
            if (z9) {
                org.telegram.messenger.g0.K3(this.D.f45941a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j3 = this.f47548y;
        if (j3 != 0) {
            return org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3));
        }
        return org.telegram.messenger.p10.i(this.currentAccount).f();
    }

    public final long l0() {
        long j3 = this.f47548y;
        if (j3 != 0) {
            return j3;
        }
        return org.telegram.messenger.p10.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.f47539b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f47539b.getChildCount(); i7++) {
            View childAt = this.f47539b.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && i7 == 0) {
                org.telegram.messenger.g0.H3(((org.telegram.ui.Cells.n4) childAt).getTextView());
            } else if (childAt instanceof ka) {
                org.telegram.messenger.g0.H3(childAt);
            } else if (childAt instanceof ga) {
                ga gaVar = (ga) childAt;
                org.telegram.messenger.g0.H3(gaVar.f45941a);
                org.telegram.messenger.g0.H3(gaVar.f45942b);
            }
        }
        org.telegram.messenger.p2.APP_ERROR.a();
    }

    public final void n0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.la.n0(int, boolean, boolean):void");
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z9, boolean z10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f47546w;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) == tL_username) {
                    n0(i7 + 4, z9, z10);
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
        if (!org.telegram.messenger.qp.e1().getBoolean("view_animations", true)) {
            j0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            j0(false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
