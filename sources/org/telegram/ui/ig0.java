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
public final class ig0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
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
    public boolean W;
    public int X;
    public Drawable Y;
    public Drawable Z;
    public hg0 f38026a;
    public Drawable f38027a0;
    public org.telegram.ui.Components.uk0 f38028b;
    public boolean f38029b0;
    public TLRPC.Chat f38030c;
    public boolean f38031c0;
    public TLRPC.ChatFull d;
    public boolean f38032d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f38033e0;
    public final long f38034f;
    public final int f38035f0;
    public boolean f38036g0;
    public final boolean h;
    public org.telegram.ui.Components.xj0 f38037h0;
    public final ArrayList f38038i0;
    public final ArrayList f38039j0;
    public final HashMap f38040k0;
    public org.telegram.ui.Components.c60 f38041l0;
    public final ArrayList m0;
    public final long f38042n;
    public long f38043n0;
    public boolean f38044o0;
    public final boolean f38045p0;
    public final xf0 f38046q0;
    public int f38047r;
    public boolean f38048r0;
    public int f38049s;
    public final yf0 f38050s0;
    public final e2.f f38051t0;
    public int f38052w;
    public int f38053x;
    public int f38054y;

    public ig0(long j10, int i10, long j11) {
        super(null);
        boolean z10;
        this.f38038i0 = new ArrayList();
        this.f38039j0 = new ArrayList();
        this.f38040k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f38046q0 = new xf0(this);
        boolean z11 = false;
        this.f38048r0 = false;
        this.f38050s0 = new yf0(this);
        this.f38051t0 = new e2.f((int[]) null);
        this.f38042n = j10;
        this.f38035f0 = i10;
        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(j10));
        this.f38030c = L0;
        if (org.telegram.messenger.w3.T(L0) && !this.f38030c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f38034f = org.telegram.messenger.e20.i(getAccountInstance().f15043a).f15524n;
        } else {
            this.f38034f = j11;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f38034f));
        if (this.f38034f == org.telegram.messenger.e20.i(getAccountInstance().f15043a).f15524n || (Z1 != null && !Z1.bot)) {
            z11 = true;
        }
        this.f38045p0 = z11;
    }

    public static void Z(org.telegram.ui.ig0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig0.Z(org.telegram.ui.ig0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.ig0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig0.a0(org.telegram.ui.ig0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(ig0 ig0Var) {
        if (ig0Var.f38034f == org.telegram.messenger.e20.i(ig0Var.getAccountInstance().f15043a).f15524n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ig0Var.getMessagesController().i1(-ig0Var.f38042n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ig0Var.e;
            ig0Var.e = null;
            ig0Var.d.exported_invite = null;
            int sendRequest = ig0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new sf0(ig0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.i0.a4(ig0Var.f38028b);
            ig0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ig0Var.classGuid);
            return;
        }
        ig0Var.k0(ig0Var.e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21135o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21260v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21243u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20989g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131749150, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 6));
        l0 l0Var = new l0(this, context, 16);
        this.fragmentView = l0Var;
        l0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f38028b = uk0Var;
        uk0Var.r1();
        this.f38028b.setSectionsDrawBackground(true);
        dh.f fVar = new dh.f(1, false, 11);
        this.f38028b.setLayoutManager(fVar);
        org.telegram.ui.Components.uk0 uk0Var2 = this.f38028b;
        hg0 hg0Var = new hg0(this, context);
        this.f38026a = hg0Var;
        uk0Var2.setAdapter(hg0Var);
        this.f38028b.setOnScrollListener(new bi.t3(8, this, fVar));
        this.f38037h0 = new org.telegram.ui.Components.xj0(this.f38028b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        this.f38028b.setItemAnimator(jVar);
        org.telegram.ui.Components.uk0 uk0Var3 = this.f38028b;
        if (org.telegram.messenger.dd.X) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        uk0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38028b, w7.b6.c(-1.0f, -1));
        this.f38028b.setOnItemClickListener(new mg.q0(18, this, context));
        this.f38028b.setOnItemLongClickListener(new uf0(this));
        this.Y = context.getDrawable(2131232204);
        this.Z = context.getDrawable(2131232205);
        this.f38027a0 = context.getDrawable(2131231610);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f38043n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14822y1 && ((Long) objArr[0]).longValue() == (-this.f38042n)) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.uk0 uk0Var = this.f38028b;
        if (uk0Var != null) {
            int childCount = uk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f38028b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.j80) {
                    ((org.telegram.ui.Components.j80) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.c60 c60Var = this.f38041l0;
        if (c60Var != null) {
            c60Var.updateColors();
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f38028b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38028b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21312y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38028b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38028b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38028b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21060k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().i1(-this.f38042n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new sf0(this, tL_chatInviteExported, 1));
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
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            if (tL_chatInviteExported.usage >= i10) {
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
        boolean z11 = this.f38032d0;
        long j10 = this.f38042n;
        if (z11 && !this.f38033e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().i1(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new rf0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j10);
            long e = getUserConfig().e();
            long j11 = this.f38034f;
            if (j11 == e) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().n1(j11);
            }
            boolean z12 = this.f38048r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f38039j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f38038i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f38044o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new wd(this, tL_chatInviteExported, z12, 4)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().i1(-this.f38042n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new sf0(this, tL_chatInviteExported, 2));
    }

    public final zf0 l0() {
        zf0 zf0Var = new zf0(this);
        zf0Var.f(zf0Var.f43995i);
        zf0Var.f43992c = this.D;
        zf0Var.d = this.E;
        zf0Var.e = this.H;
        zf0Var.f43993f = this.I;
        zf0Var.f43994g = this.U;
        zf0Var.h = this.V;
        zf0Var.f43991b = this.X;
        zf0Var.f43997k.clear();
        zf0Var.f43997k.addAll(this.f38038i0);
        zf0Var.f43998l.clear();
        zf0Var.f43998l.addAll(this.f38039j0);
        return zf0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f38044o0 = org.telegram.messenger.w3.t0(this.f38030c);
        j0(true);
    }

    public final void n0(zf0 zf0Var) {
        if (!this.isPaused && this.f38026a != null && this.f38028b != null) {
            o0(false);
            zf0Var.f(zf0Var.f43996j);
            s4.n.c(zf0Var, true).c(this.f38026a);
            org.telegram.messenger.i0.a4(this.f38028b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        hg0 hg0Var;
        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(this.f38042n));
        this.f38030c = L0;
        if (L0 != null) {
            this.Q = -1;
            this.R = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.H = -1;
            this.I = -1;
            this.L = -1;
            this.J = -1;
            this.K = -1;
            this.N = -1;
            this.M = -1;
            this.O = -1;
            this.f38047r = -1;
            this.f38054y = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f38053x = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f38034f != org.telegram.messenger.e20.i(getAccountInstance().f15043a).f15524n) {
                z11 = true;
            }
            if (z11) {
                int i10 = this.X;
                this.Q = i10;
                this.X = i10 + 2;
                this.R = i10 + 1;
            } else {
                int i11 = this.X;
                this.X = i11 + 1;
                this.f38047r = i11;
            }
            int i12 = this.X;
            this.f38049s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.f38052w = i12 + 1;
            ArrayList arrayList = this.f38038i0;
            if (!z11) {
                this.f38053x = i13;
                this.X = i12 + 4;
                this.f38054y = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f38053x = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.D = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f38054y >= 0 && (!this.W || this.f38032d0 || this.f38048r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f38054y >= 0) && this.O == -1) {
                        int i17 = this.X;
                        this.X = i17 + 1;
                        this.T = i17;
                    }
                    int i18 = this.X;
                    int i19 = i18 + 1;
                    this.X = i19;
                    this.S = i18;
                    this.U = i19;
                    int size2 = arrayList2.size() + i19;
                    this.X = size2;
                    this.V = size2;
                }
            }
            ArrayList arrayList3 = this.f38039j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f38054y >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.D == -1) {
                    int i22 = this.X;
                    this.X = i22 + 1;
                    this.J = i22;
                }
                int i23 = this.X;
                int i24 = i23 + 1;
                this.X = i24;
                this.L = i23;
                this.H = i24;
                int size3 = arrayList3.size() + i24;
                this.I = size3;
                this.M = size3;
                this.X = size3 + 2;
                this.N = size3 + 1;
            }
            if (!this.f38032d0 && !this.f38048r0 && ((this.W || this.f38029b0) && !z11)) {
                int i25 = this.X;
                this.X = i25 + 1;
                this.F = i25;
            }
            if (!arrayList.isEmpty()) {
                int i26 = this.E;
                int i27 = this.X;
                if (i26 == i27) {
                    this.X = i27 + 1;
                    this.G = i27;
                    hg0Var = this.f38026a;
                    if (hg0Var == null && z10) {
                        hg0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            hg0Var = this.f38026a;
            if (hg0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.f14822y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        hg0 hg0Var = this.f38026a;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.c60 c60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f38036g0 = true;
            if (z11 && (c60Var = this.f38041l0) != null && c60Var.f25016c2) {
                c60Var.show();
            }
        }
        this.f38051t0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f38051t0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
