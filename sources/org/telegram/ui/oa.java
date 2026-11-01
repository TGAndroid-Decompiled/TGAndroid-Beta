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
public final class oa extends org.telegram.ui.ActionBar.k2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public ia D;
    public la E;
    public na F;
    public org.telegram.ui.Cells.b2 G;
    public org.telegram.ui.ActionBar.l5 f40110a;
    public org.telegram.ui.Components.uk0 f40111b;
    public ga f40112c;
    public boolean d;
    public int e;
    public String f40113f;
    public h0 h;
    public boolean f40114n;
    public String f40115r;
    public final ArrayList f40116s;
    public final ArrayList f40117w;
    public final ArrayList f40118x;
    public final long f40119y;

    public oa(Bundle bundle) {
        super(bundle);
        this.f40115r = "";
        this.f40116s = new ArrayList();
        this.f40117w = new ArrayList();
        this.f40118x = new ArrayList();
        if (bundle != null) {
            this.f40119y = bundle.getLong("bot_id");
        }
    }

    public static void Z(oa oaVar, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.Components.s4.e0(oaVar.currentAccount, tL_error, oaVar, updateusername, new Object[0]);
        oaVar.m0();
    }

    public static void b0(oa oaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        oaVar.e = ConnectionsManager.getInstance(oaVar.currentAccount).sendRequest(checkusername, new aa(oaVar, str, checkusername, 0), 2);
    }

    public static void c0(oa oaVar, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.User user) {
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        org.telegram.messenger.wp.r1(oaVar.currentAccount).V3(arrayList, false);
        org.telegram.messenger.is.a0(oaVar.currentAccount).m1(arrayList, null, false, true);
        org.telegram.messenger.e20.i(oaVar.currentAccount).v(true);
        oaVar.finishFragment();
    }

    public static void d0(oa oaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = oaVar.f40119y;
        ArrayList arrayList = oaVar.f40117w;
        ArrayList arrayList2 = oaVar.f40116s;
        if (!oaVar.d) {
            return;
        }
        oaVar.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (((TLRPC.TL_username) arrayList2.get(i10)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i10)).username);
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((TLRPC.TL_username) arrayList.get(i11)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i11)).username);
            }
        }
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = org.telegram.messenger.wp.r1(oaVar.currentAccount).n1(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        oaVar.getConnectionsManager().sendRequest(reorderusernames, new ag.c3(10));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(oaVar.currentAccount).Z1(Long.valueOf(oaVar.l0()));
        Z1.usernames = arrayList4;
        org.telegram.messenger.wp.r1(oaVar.currentAccount).U3(Z1, false, true);
    }

    public static void e0(oa oaVar) {
        if (oaVar.f40119y != 0) {
            oaVar.finishFragment();
            return;
        }
        if (oaVar.f40115r.startsWith("@")) {
            oaVar.f40115r = oaVar.f40115r.substring(1);
        }
        if (!oaVar.f40115r.isEmpty() && !oaVar.i0(oaVar.f40115r)) {
            oaVar.m0();
            return;
        }
        TLRPC.User k02 = oaVar.k0();
        if (oaVar.getParentActivity() != null && k02 != null) {
            String n10 = org.telegram.messenger.i20.n(k02);
            if (n10 == null) {
                n10 = "";
            }
            if (n10.equals(oaVar.f40115r)) {
                oaVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, oaVar.getParentActivity(), null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = oaVar.f40115r;
            org.telegram.messenger.at f7 = org.telegram.messenger.at.f(oaVar.currentAccount);
            int i10 = org.telegram.messenger.wp.D8;
            f7.k(org.telegram.messenger.at.f14772r, 1);
            int sendRequest = ConnectionsManager.getInstance(oaVar.currentAccount).sendRequest(updateusername, new aa(oaVar, x1Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(oaVar.currentAccount).bindRequestToGuid(sendRequest, oaVar.classGuid);
            x1Var.setOnCancelListener(new ba(oaVar, sendRequest, 0));
            x1Var.show();
        }
    }

    public static int f0(oa oaVar) {
        return oaVar.currentAccount;
    }

    public static int g0(oa oaVar) {
        return oaVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131743700, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 21));
        this.f40110a = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(l0()));
        if (Z1 == null) {
            Z1 = k0();
        }
        if (Z1 != null) {
            this.f40115r = null;
            if (Z1.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= Z1.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = Z1.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f40115r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f40115r == null && (str = Z1.username) != null) {
                this.f40115r = str;
            }
            if (this.f40115r == null) {
                this.f40115r = "";
            }
            this.f40116s.clear();
            ArrayList arrayList = this.f40117w;
            arrayList.clear();
            for (int i11 = 0; i11 < Z1.usernames.size(); i11++) {
                if (Z1.usernames.get(i11).active) {
                    arrayList.add(Z1.usernames.get(i11));
                }
            }
            for (int i12 = 0; i12 < Z1.usernames.size(); i12++) {
                if (!Z1.usernames.get(i12).active) {
                    arrayList.add(Z1.usernames.get(i12));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f40111b = uk0Var;
        uk0Var.r1();
        this.f40111b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f40111b;
        ga gaVar = new ga(this);
        this.f40112c = gaVar;
        uk0Var2.setAdapter(gaVar);
        org.telegram.ui.ActionBar.a7.K(this.f40111b, org.telegram.ui.ActionBar.t6.f21021i6, getResourceProvider());
        this.f40111b.setSectionsDrawBackground(true);
        new s4.x(new ja(this, 0)).h(this.f40111b);
        ((FrameLayout) this.fragmentView).addView(this.f40111b, w7.b6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(5));
        this.f40111b.setOnItemClickListener(new ea(this));
        org.telegram.messenger.i0.h3(new qr0(this, 19), 40L);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f40111b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final boolean i0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.b2 b2Var = this.G;
        if (b2Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b2Var.setVisibility(i10);
            na naVar = this.F;
            if (naVar != null) {
                na.a(naVar);
            }
        }
        h0 h0Var = this.h;
        if (h0Var != null) {
            org.telegram.messenger.i0.r(h0Var);
            this.h = null;
            this.f40113f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.b2 b2Var2 = this.G;
                        if (b2Var2 != null) {
                            b2Var2.setText(org.telegram.messenger.dd.L0(2131743678, null));
                            org.telegram.ui.Cells.b2 b2Var3 = this.G;
                            int i12 = org.telegram.ui.ActionBar.t6.f21154p7;
                            b2Var3.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.a7.V(this.G, i12, null);
                            na naVar2 = this.F;
                            if (naVar2 != null) {
                                na.a(naVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.b2 b2Var4 = this.G;
                        if (b2Var4 != null) {
                            b2Var4.setText(org.telegram.messenger.dd.L0(2131743682, null));
                            org.telegram.ui.Cells.b2 b2Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.t6.f21154p7;
                            b2Var5.setTag(Integer.valueOf(i13));
                            org.telegram.ui.ActionBar.a7.V(this.G, i13, null);
                            na naVar3 = this.F;
                            if (naVar3 != null) {
                                na.a(naVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.b2 b2Var6 = this.G;
                if (b2Var6 != null) {
                    b2Var6.setText(org.telegram.messenger.dd.L0(2131743682, null));
                    org.telegram.ui.Cells.b2 b2Var7 = this.G;
                    int i14 = org.telegram.ui.ActionBar.t6.f21154p7;
                    b2Var7.setTag(Integer.valueOf(i14));
                    org.telegram.ui.ActionBar.a7.V(this.G, i14, null);
                    na naVar4 = this.F;
                    if (naVar4 != null) {
                        na.a(naVar4);
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
                    b2Var8.setText(org.telegram.messenger.dd.L0(2131743681, null));
                    org.telegram.ui.Cells.b2 b2Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.t6.f21154p7;
                    b2Var9.setTag(Integer.valueOf(i15));
                    org.telegram.ui.ActionBar.a7.V(this.G, i15, null);
                    na naVar5 = this.F;
                    if (naVar5 != null) {
                        na.a(naVar5);
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
                        b2Var10.setText(org.telegram.messenger.dd.a0("UsernameAvailable", null, 2131743693, str));
                        org.telegram.ui.Cells.b2 b2Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.t6.f21278w6;
                        b2Var11.setTag(Integer.valueOf(i16));
                        org.telegram.ui.ActionBar.a7.V(this.G, i16, null);
                        na naVar6 = this.F;
                        if (naVar6 != null) {
                            na.a(naVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.b2 b2Var12 = this.G;
                if (b2Var12 != null) {
                    b2Var12.setText(org.telegram.messenger.dd.L0(2131743692, null));
                    org.telegram.ui.Cells.b2 b2Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.t6.F6;
                    b2Var13.setTag(Integer.valueOf(i17));
                    org.telegram.ui.ActionBar.a7.V(this.G, i17, null);
                    na naVar7 = this.F;
                    if (naVar7 != null) {
                        na.a(naVar7);
                    }
                }
                this.f40113f = str;
                h0 h0Var2 = new h0(12, this, str);
                this.h = h0Var2;
                org.telegram.messenger.i0.h3(h0Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.b2 b2Var14 = this.G;
            if (b2Var14 != null) {
                b2Var14.setText(org.telegram.messenger.dd.L0(2131743680, null));
                org.telegram.ui.Cells.b2 b2Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.t6.f21154p7;
                b2Var15.setTag(Integer.valueOf(i18));
                org.telegram.ui.ActionBar.a7.V(this.G, i18, null);
                na naVar8 = this.F;
                if (naVar8 != null) {
                    na.a(naVar8);
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
        ia iaVar = this.D;
        if (iaVar != null) {
            if (!iaVar.f37985a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.D.f37985a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.D.f37985a.requestFocus();
            if (z10) {
                org.telegram.messenger.i0.J3(this.D.f37985a);
            }
        }
    }

    public final TLRPC.User k0() {
        long j10 = this.f40119y;
        if (j10 != 0) {
            return org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(j10));
        }
        return org.telegram.messenger.e20.i(this.currentAccount).f();
    }

    public final long l0() {
        long j10 = this.f40119y;
        if (j10 != 0) {
            return j10;
        }
        return org.telegram.messenger.e20.i(this.currentAccount).e();
    }

    public final void m0() {
        if (this.f40111b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f40111b.getChildCount(); i10++) {
            View childAt = this.f40111b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.p4) && i10 == 0) {
                org.telegram.messenger.i0.G3(((org.telegram.ui.Cells.p4) childAt).getTextView());
            } else if (childAt instanceof na) {
                org.telegram.messenger.i0.G3(childAt);
            } else if (childAt instanceof ia) {
                ia iaVar = (ia) childAt;
                org.telegram.messenger.i0.G3(iaVar.f37985a);
                org.telegram.messenger.i0.G3(iaVar.f37986b);
            }
        }
        org.telegram.messenger.t2.APP_ERROR.a();
    }

    public final void n0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oa.n0(int, boolean, boolean):void");
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40117w;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == tL_username) {
                    n0(i10 + 4, z10, z11);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.wp.d1().getBoolean("view_animations", true)) {
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
