package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ff0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public Drawable Z;
    public ef0 f47656a;
    public Drawable f47657a0;
    public org.telegram.ui.Components.ek0 f47658b;
    public Drawable f47659b0;
    public TLRPC.Chat f47660c;
    public boolean f47661c0;
    public TLRPC.ChatFull d;
    public boolean f47662d0;
    public TLRPC.TL_chatInviteExported f47663e;
    public boolean f47664e0;
    public final long f47665f;
    public boolean f47666f0;
    public final int f47667g0;
    public final boolean h;
    public boolean f47668h0;
    public org.telegram.ui.Components.hj0 f47669i0;
    public final ArrayList f47670j0;
    public final ArrayList f47671k0;
    public final HashMap f47672l0;
    public org.telegram.ui.Components.a60 m0;
    public final long f47673n;
    public final ArrayList f47674n0;
    public long f47675o0;
    public boolean f47676p0;
    public final boolean f47677q0;
    public int f47678r;
    public final ue0 f47679r0;
    public int f47680s;
    public boolean f47681s0;
    public final we0 f47682t0;
    public final h2.f f47683u0;
    public int f47684w;
    public int f47685x;
    public int f47686y;

    public ff0(long j3, int i7, long j10) {
        super(null);
        boolean z10;
        this.f47670j0 = new ArrayList();
        this.f47671k0 = new ArrayList();
        this.f47672l0 = new HashMap();
        this.f47674n0 = new ArrayList();
        this.f47679r0 = new ue0(this);
        boolean z11 = false;
        this.f47681s0 = false;
        this.f47682t0 = new we0(this);
        this.f47683u0 = new h2.f((int[]) null);
        this.f47673n = j3;
        this.f47667g0 = i7;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(j3));
        this.f47660c = O0;
        if (org.telegram.messenger.v3.T(O0) && !this.f47660c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f47665f = org.telegram.messenger.k10.i(getAccountInstance().f23166a).f24951n;
        } else {
            this.f47665f = j10;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f47665f));
        if (this.f47665f == org.telegram.messenger.k10.i(getAccountInstance().f23166a).f24951n || (c22 != null && !c22.bot)) {
            z11 = true;
        }
        this.f47677q0 = z11;
    }

    public static void Z(org.telegram.ui.ff0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.Z(org.telegram.ui.ff0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.ff0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.a0(org.telegram.ui.ff0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(ff0 ff0Var) {
        if (ff0Var.f47665f == org.telegram.messenger.k10.i(ff0Var.getAccountInstance().f23166a).f24951n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ff0Var.getMessagesController().l1(-ff0Var.f47673n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ff0Var.f47663e;
            ff0Var.f47663e = null;
            ff0Var.d.exported_invite = null;
            int sendRequest = ff0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new pe0(ff0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.g0.Z3(ff0Var.f47658b);
            ff0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ff0Var.classGuid);
            return;
        }
        ff0Var.k0(ff0Var.f47663e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29739y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29547o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29682v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29663u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29405g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748947, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 18));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29290a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47658b = ek0Var;
        ek0Var.r1();
        this.f47658b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.f47658b.setLayoutManager(b0Var);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f47658b;
        ef0 ef0Var = new ef0(this, context);
        this.f47656a = ef0Var;
        ek0Var2.setAdapter(ef0Var);
        this.f47658b.setOnScrollListener(new bi.j6(8, this, b0Var));
        this.f47669i0 = new org.telegram.ui.Components.hj0(this.f47658b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59139m = false;
        this.f47658b.setItemAnimator(kVar);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f47658b;
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f47658b, c8.na.c(-1.0f, -1));
        this.f47658b.setOnItemClickListener(new fi.g4(19, this, context));
        this.f47658b.setOnItemLongClickListener(new re0(this));
        this.Z = context.getDrawable(2131232207);
        this.f47657a0 = context.getDrawable(2131232208);
        this.f47659b0 = context.getDrawable(2131231610);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f47675o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25384y1 && ((Long) objArr[0]).longValue() == (-this.f47673n)) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.ek0 ek0Var = this.f47658b;
        if (ek0Var != null) {
            int childCount = ek0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f47658b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.g80) {
                    ((org.telegram.ui.Components.g80) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.a60 a60Var = this.m0;
        if (a60Var != null) {
            a60Var.updateColors();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f47658b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47658b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29739y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47658b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29529n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47658b, 32, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47658b, 0, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29477k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().l1(-this.f47673n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new pe0(this, tL_chatInviteExported, 1));
    }

    public final void i0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z10 = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
            return;
        }
        int i7 = tL_chatInviteExported.usage_limit;
        if (i7 > 0) {
            if (tL_chatInviteExported.usage >= i7) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f47664e0;
        long j3 = this.f47673n;
        if (z11 && !this.f47666f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().l1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new oe0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f47665f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(j10);
            }
            boolean z12 = this.f47681s0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f47671k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f47670j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.f47676p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f47663e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.o8(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().l1(-this.f47673n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new pe0(this, tL_chatInviteExported, 2));
    }

    public final xe0 l0() {
        xe0 xe0Var = new xe0(this);
        xe0Var.f(xe0Var.f53792i);
        xe0Var.f53788c = this.E;
        xe0Var.d = this.F;
        xe0Var.f53789e = this.I;
        xe0Var.f53790f = this.J;
        xe0Var.f53791g = this.V;
        xe0Var.h = this.W;
        xe0Var.f53787b = this.Y;
        xe0Var.f53794k.clear();
        xe0Var.f53794k.addAll(this.f47670j0);
        xe0Var.f53795l.clear();
        xe0Var.f53795l.addAll(this.f47671k0);
        return xe0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f47663e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f47676p0 = org.telegram.messenger.v3.t0(this.f47660c);
        j0(true);
    }

    public final void n0(xe0 xe0Var) {
        if (!this.isPaused && this.f47656a != null && this.f47658b != null) {
            o0(false);
            xe0Var.f(xe0Var.f53793j);
            v4.o.c(xe0Var, true).c(this.f47656a);
            org.telegram.messenger.g0.Z3(this.f47658b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        ef0 ef0Var;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(this.f47673n));
        this.f47660c = O0;
        if (O0 != null) {
            this.R = -1;
            this.S = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.I = -1;
            this.J = -1;
            this.M = -1;
            this.K = -1;
            this.L = -1;
            this.O = -1;
            this.N = -1;
            this.P = -1;
            this.f47678r = -1;
            this.f47686y = -1;
            this.W = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.Q = -1;
            this.f47685x = -1;
            this.H = -1;
            boolean z11 = false;
            this.Y = 0;
            if (this.f47665f != org.telegram.messenger.k10.i(getAccountInstance().f23166a).f24951n) {
                z11 = true;
            }
            if (z11) {
                int i7 = this.Y;
                this.R = i7;
                this.Y = i7 + 2;
                this.S = i7 + 1;
            } else {
                int i10 = this.Y;
                this.Y = i10 + 1;
                this.f47678r = i10;
            }
            int i11 = this.Y;
            this.f47680s = i11;
            int i12 = i11 + 2;
            this.Y = i12;
            this.f47684w = i11 + 1;
            ArrayList arrayList = this.f47670j0;
            if (!z11) {
                this.f47685x = i12;
                this.Y = i11 + 4;
                this.f47686y = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.Y;
                this.f47685x = i13;
                this.Y = i13 + 2;
                this.Q = i13 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i14 = this.Y;
                this.E = i14;
                int size = arrayList.size() + i14;
                this.Y = size;
                this.F = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f47686y >= 0 && (!this.X || this.f47664e0 || this.f47681s0)) {
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.P = i15;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f47674n0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f47686y >= 0) && this.P == -1) {
                        int i16 = this.Y;
                        this.Y = i16 + 1;
                        this.U = i16;
                    }
                    int i17 = this.Y;
                    int i18 = i17 + 1;
                    this.Y = i18;
                    this.T = i17;
                    this.V = i18;
                    int size2 = arrayList2.size() + i18;
                    this.Y = size2;
                    this.W = size2;
                }
            }
            ArrayList arrayList3 = this.f47671k0;
            if (!arrayList3.isEmpty()) {
                if (this.V >= 0) {
                    int i19 = this.Y;
                    this.Y = i19 + 1;
                    this.K = i19;
                } else if ((!arrayList.isEmpty() || this.f47686y >= 0) && this.P == -1) {
                    int i20 = this.Y;
                    this.Y = i20 + 1;
                    this.K = i20;
                } else if (z11 && this.E == -1) {
                    int i21 = this.Y;
                    this.Y = i21 + 1;
                    this.K = i21;
                }
                int i22 = this.Y;
                int i23 = i22 + 1;
                this.Y = i23;
                this.M = i22;
                this.I = i23;
                int size3 = arrayList3.size() + i23;
                this.J = size3;
                this.N = size3;
                this.Y = size3 + 2;
                this.O = size3 + 1;
            }
            if (!this.f47664e0 && !this.f47681s0 && ((this.X || this.f47661c0) && !z11)) {
                int i24 = this.Y;
                this.Y = i24 + 1;
                this.G = i24;
            }
            if (!arrayList.isEmpty()) {
                int i25 = this.F;
                int i26 = this.Y;
                if (i25 == i26) {
                    this.Y = i26 + 1;
                    this.H = i26;
                    ef0Var = this.f47656a;
                    if (ef0Var == null && z10) {
                        ef0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i27 = this.Y;
                this.Y = i27 + 1;
                this.L = i27;
            }
            ef0Var = this.f47656a;
            if (ef0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25384y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25384y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ef0 ef0Var = this.f47656a;
        if (ef0Var != null) {
            ef0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.a60 a60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f47668h0 = true;
            if (z11 && (a60Var = this.m0) != null && a60Var.f33297g2) {
                a60Var.show();
            }
        }
        this.f47683u0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f47683u0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
