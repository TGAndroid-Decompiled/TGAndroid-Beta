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
public final class ka extends org.telegram.ui.ActionBar.d2 {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public fa E;
    public ha F;
    public ja G;
    public org.telegram.ui.Cells.b2 H;
    public org.telegram.ui.ActionBar.b5 f46838a;
    public org.telegram.ui.Components.tj0 f46839b;
    public da f46840c;
    public boolean d;
    public int f46841e;
    public String f46842f;
    public org.telegram.messenger.voip.l0 h;
    public boolean f46843n;
    public String f46844r;
    public final ArrayList f46845s;
    public final ArrayList f46846w;
    public final ArrayList f46847x;
    public final long f46848y;

    public ka(Bundle bundle) {
        super(bundle);
        this.f46844r = "";
        this.f46845s = new ArrayList();
        this.f46846w = new ArrayList();
        this.f46847x = new ArrayList();
        if (bundle != null) {
            this.f46848y = bundle.getLong("bot_id");
        }
    }

    public static void Z(ka kaVar, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.t4.e0(kaVar.currentAccount, tL_error, kaVar, updateusername, new Object[0]);
        kaVar.m0();
    }

    public static void a0(ka kaVar, int i3) {
        ConnectionsManager.getInstance(kaVar.currentAccount).cancelRequest(i3, true);
    }

    public static void b0(ka kaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        kaVar.f46841e = ConnectionsManager.getInstance(kaVar.currentAccount).sendRequest(checkusername, new y9(kaVar, str, checkusername, 0), 2);
    }

    public static void c0(ka kaVar, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.User user) {
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.hp.s1(kaVar.currentAccount).Y3(arrayList, false);
        org.telegram.messenger.qr.a0(kaVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.h10.i(kaVar.currentAccount).v(true);
        kaVar.finishFragment();
    }

    public static void d0(ka kaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = kaVar.f46848y;
        ArrayList arrayList = kaVar.f46846w;
        ArrayList arrayList2 = kaVar.f46845s;
        if (!kaVar.d) {
            return;
        }
        kaVar.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            if (((TLRPC.TL_username) arrayList2.get(i3)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i3)).username);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((TLRPC.TL_username) arrayList.get(i10)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i10)).username);
            }
        }
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = org.telegram.messenger.hp.s1(kaVar.currentAccount).o1(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        kaVar.getConnectionsManager().sendRequest(reorderusernames, new ei.u5(15));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User a22 = org.telegram.messenger.hp.s1(kaVar.currentAccount).a2(Long.valueOf(kaVar.l0()));
        a22.usernames = arrayList4;
        org.telegram.messenger.hp.s1(kaVar.currentAccount).X3(a22, false, true);
    }

    public static void e0(ka kaVar) {
        if (kaVar.f46848y != 0) {
            kaVar.finishFragment();
            return;
        }
        if (kaVar.f46844r.startsWith("@")) {
            kaVar.f46844r = kaVar.f46844r.substring(1);
        }
        if (!kaVar.f46844r.isEmpty() && !kaVar.i0(kaVar.f46844r)) {
            kaVar.m0();
            return;
        }
        TLRPC.User k02 = kaVar.k0();
        if (kaVar.getParentActivity() != null && k02 != null) {
            String n4 = org.telegram.messenger.l10.n(k02);
            if (n4 == null) {
                n4 = "";
            }
            if (n4.equals(kaVar.f46844r)) {
                kaVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, kaVar.getParentActivity(), null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = kaVar.f46844r;
            org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(kaVar.currentAccount);
            int i3 = org.telegram.messenger.hp.C8;
            f10.k(org.telegram.messenger.hs.f23292r, 1);
            int sendRequest = ConnectionsManager.getInstance(kaVar.currentAccount).sendRequest(updateusername, new y9(kaVar, s1Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(kaVar.currentAccount).bindRequestToGuid(sendRequest, kaVar.classGuid);
            s1Var.setOnCancelListener(new ci.b0(kaVar, sendRequest, 1));
            s1Var.show();
        }
    }

    public static int f0(ka kaVar) {
        return kaVar.currentAccount;
    }

    public static int g0(ka kaVar) {
        return kaVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743684, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 2));
        this.f46838a = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(l0()));
        if (a22 == null) {
            a22 = k0();
        }
        if (a22 != null) {
            this.f46844r = null;
            if (a22.usernames != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= a22.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = a22.usernames.get(i3);
                    if (tL_username != null && tL_username.editable) {
                        this.f46844r = tL_username.username;
                        break;
                    }
                    i3++;
                }
            }
            if (this.f46844r == null && (str = a22.username) != null) {
                this.f46844r = str;
            }
            if (this.f46844r == null) {
                this.f46844r = "";
            }
            this.f46845s.clear();
            ArrayList arrayList = this.f46846w;
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
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f46839b = tj0Var;
        tj0Var.r1();
        this.f46839b.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f46839b;
        da daVar = new da(this);
        this.f46840c = daVar;
        tj0Var2.setAdapter(daVar);
        org.telegram.ui.ActionBar.r6.K(this.f46839b, org.telegram.ui.ActionBar.k6.f27972i6, getResourceProvider());
        this.f46839b.setSectionsDrawBackground(true);
        new u4.y(new fi.c(this, 1)).h(this.f46839b);
        ((FrameLayout) this.fragmentView).addView(this.f46839b, b8.mf.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new fi.a(6));
        this.f46839b.setOnItemClickListener(new ba(this));
        org.telegram.messenger.g0.i3(new xp0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f46839b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final boolean i0(String str) {
        int i3;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.b2 b2Var = this.H;
        if (b2Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            b2Var.setVisibility(i3);
            ja jaVar = this.G;
            if (jaVar != null) {
                ja.a(jaVar);
            }
        }
        org.telegram.messenger.voip.l0 l0Var = this.h;
        if (l0Var != null) {
            org.telegram.messenger.g0.r(l0Var);
            this.h = null;
            this.f46842f = null;
            if (this.f46841e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f46841e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var2 = this.H;
                        if (b2Var2 != null) {
                            b2Var2.setText(org.telegram.messenger.bd.M0(2131743662, null));
                            org.telegram.ui.Cells.b2 b2Var3 = this.H;
                            int i11 = org.telegram.ui.ActionBar.k6.f28102p7;
                            b2Var3.setTag(Integer.valueOf(i11));
                            org.telegram.ui.ActionBar.r6.V(this.H, i11, null);
                            ja jaVar2 = this.G;
                            if (jaVar2 != null) {
                                ja.a(jaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var4 = this.H;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.bd.M0(2131743666, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.H;
                            int i12 = org.telegram.ui.ActionBar.k6.f28102p7;
                            b2Var5.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.r6.V(this.H, i12, null);
                            ja jaVar3 = this.G;
                            if (jaVar3 != null) {
                                ja.a(jaVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.b2 b2Var6 = this.H;
                if (b2Var6 != null) {
                    b2Var6.setText(org.telegram.messenger.bd.M0(2131743666, null));
                    org.telegram.ui.Cells.b2 b2Var7 = this.H;
                    int i13 = org.telegram.ui.ActionBar.k6.f28102p7;
                    b2Var7.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.r6.V(this.H, i13, null);
                    ja jaVar4 = this.G;
                    if (jaVar4 != null) {
                        ja.a(jaVar4);
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
                    b2Var8.setText(org.telegram.messenger.bd.M0(2131743665, null));
                    org.telegram.ui.Cells.b2 b2Var9 = this.H;
                    int i14 = org.telegram.ui.ActionBar.k6.f28102p7;
                    b2Var9.setTag(Integer.valueOf(i14));
                    org.telegram.ui.ActionBar.r6.V(this.H, i14, null);
                    ja jaVar5 = this.G;
                    if (jaVar5 != null) {
                        ja.a(jaVar5);
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
                        b2Var10.setText(org.telegram.messenger.bd.a0("UsernameAvailable", null, 2131743677, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.H;
                        int i15 = org.telegram.ui.ActionBar.k6.f28234w6;
                        b2Var11.setTag(Integer.valueOf(i15));
                        org.telegram.ui.ActionBar.r6.V(this.H, i15, null);
                        ja jaVar6 = this.G;
                        if (jaVar6 != null) {
                            ja.a(jaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.H;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.bd.M0(2131743676, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.H;
                    int i16 = org.telegram.ui.ActionBar.k6.F6;
                    b2Var13.setTag(Integer.valueOf(i16));
                    org.telegram.ui.ActionBar.r6.V(this.H, i16, null);
                    ja jaVar7 = this.G;
                    if (jaVar7 != null) {
                        ja.a(jaVar7);
                    }
                }
                this.f46842f = str;
                org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(23, this, str);
                this.h = l0Var2;
                org.telegram.messenger.g0.i3(l0Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.b2 b2Var14 = this.H;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.bd.M0(2131743664, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.H;
                int i17 = org.telegram.ui.ActionBar.k6.f28102p7;
                b2Var15.setTag(Integer.valueOf(i17));
                org.telegram.ui.ActionBar.r6.V(this.H, i17, null);
                ja jaVar8 = this.G;
                if (jaVar8 != null) {
                    ja.a(jaVar8);
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
        fa faVar = this.E;
        if (faVar != null) {
            if (!faVar.f45225a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.f45225a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.f45225a.requestFocus();
            if (z10) {
                org.telegram.messenger.g0.K3(this.E.f45225a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j10 = this.f46848y;
        if (j10 != 0) {
            return org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(j10));
        }
        return org.telegram.messenger.h10.i(this.currentAccount).f();
    }

    public final long l0() {
        long j10 = this.f46848y;
        if (j10 != 0) {
            return j10;
        }
        return org.telegram.messenger.h10.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.f46839b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f46839b.getChildCount(); i3++) {
            View childAt = this.f46839b.getChildAt(i3);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && i3 == 0) {
                org.telegram.messenger.g0.H3(((org.telegram.ui.Cells.n4) childAt).getTextView());
            } else if (childAt instanceof ja) {
                org.telegram.messenger.g0.H3(childAt);
            } else if (childAt instanceof fa) {
                fa faVar = (fa) childAt;
                org.telegram.messenger.g0.H3(faVar.f45225a);
                org.telegram.messenger.g0.H3(faVar.f45226b);
            }
        }
        org.telegram.messenger.p2.APP_ERROR.a();
    }

    public final void n0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ka.n0(int, boolean, boolean):void");
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f46846w;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) == tL_username) {
                    n0(i3 + 4, z10, z11);
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.hp.e1().getBoolean("view_animations", true)) {
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
