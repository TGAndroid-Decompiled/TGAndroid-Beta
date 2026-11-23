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
    public ef0 f47689a;
    public Drawable f47690a0;
    public org.telegram.ui.Components.ek0 f47691b;
    public Drawable f47692b0;
    public TLRPC.Chat f47693c;
    public boolean f47694c0;
    public TLRPC.ChatFull d;
    public boolean f47695d0;
    public TLRPC.TL_chatInviteExported f47696e;
    public boolean f47697e0;
    public final long f47698f;
    public boolean f47699f0;
    public final int f47700g0;
    public final boolean h;
    public boolean f47701h0;
    public org.telegram.ui.Components.hj0 f47702i0;
    public final ArrayList f47703j0;
    public final ArrayList f47704k0;
    public final HashMap f47705l0;
    public org.telegram.ui.Components.a60 m0;
    public final long f47706n;
    public final ArrayList f47707n0;
    public long f47708o0;
    public boolean f47709p0;
    public final boolean f47710q0;
    public int f47711r;
    public final ve0 f47712r0;
    public int f47713s;
    public boolean f47714s0;
    public final we0 f47715t0;
    public final h2.f f47716u0;
    public int f47717w;
    public int f47718x;
    public int f47719y;

    public ff0(long j3, int i7, long j10) {
        super(null);
        boolean z10;
        this.f47703j0 = new ArrayList();
        this.f47704k0 = new ArrayList();
        this.f47705l0 = new HashMap();
        this.f47707n0 = new ArrayList();
        this.f47712r0 = new ve0(this);
        boolean z11 = false;
        this.f47714s0 = false;
        this.f47715t0 = new we0(this);
        this.f47716u0 = new h2.f((int[]) null);
        this.f47706n = j3;
        this.f47700g0 = i7;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(j3));
        this.f47693c = O0;
        if (org.telegram.messenger.v3.T(O0) && !this.f47693c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f47698f = org.telegram.messenger.k10.i(getAccountInstance().f23202a).f24987n;
        } else {
            this.f47698f = j10;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f47698f));
        if (this.f47698f == org.telegram.messenger.k10.i(getAccountInstance().f23202a).f24987n || (c22 != null && !c22.bot)) {
            z11 = true;
        }
        this.f47710q0 = z11;
    }

    public static void Z(org.telegram.ui.ff0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.Z(org.telegram.ui.ff0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.ff0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.a0(org.telegram.ui.ff0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(ff0 ff0Var) {
        if (ff0Var.f47698f == org.telegram.messenger.k10.i(ff0Var.getAccountInstance().f23202a).f24987n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ff0Var.getMessagesController().l1(-ff0Var.f47706n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ff0Var.f47696e;
            ff0Var.f47696e = null;
            ff0Var.d.exported_invite = null;
            int sendRequest = ff0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new qe0(ff0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.g0.Z3(ff0Var.f47691b);
            ff0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ff0Var.classGuid);
            return;
        }
        ff0Var.k0(ff0Var.f47696e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29581o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29716v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29697u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
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
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29324a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47691b = ek0Var;
        ek0Var.r1();
        this.f47691b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.f47691b.setLayoutManager(b0Var);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f47691b;
        ef0 ef0Var = new ef0(this, context);
        this.f47689a = ef0Var;
        ek0Var2.setAdapter(ef0Var);
        this.f47691b.setOnScrollListener(new bi.g6(8, this, b0Var));
        this.f47702i0 = new org.telegram.ui.Components.hj0(this.f47691b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59194m = false;
        this.f47691b.setItemAnimator(kVar);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f47691b;
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f47691b, c8.ma.c(-1.0f, -1));
        this.f47691b.setOnItemClickListener(new fi.g4(19, this, context));
        this.f47691b.setOnItemLongClickListener(new se0(this));
        this.Z = context.getDrawable(2131232207);
        this.f47690a0 = context.getDrawable(2131232208);
        this.f47692b0 = context.getDrawable(2131231610);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f47708o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25420y1 && ((Long) objArr[0]).longValue() == (-this.f47706n)) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.ek0 ek0Var = this.f47691b;
        if (ek0Var != null) {
            int childCount = ek0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f47691b.getChildAt(i7);
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
        return this.f47691b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47691b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29773y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47691b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29563n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47691b, 32, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47691b, 0, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29511k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().l1(-this.f47706n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new qe0(this, tL_chatInviteExported, 1));
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
        boolean z11 = this.f47697e0;
        long j3 = this.f47706n;
        if (z11 && !this.f47699f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().l1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new pe0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f47698f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(j10);
            }
            boolean z12 = this.f47714s0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f47704k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f47703j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.f47709p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f47696e;
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().l1(-this.f47706n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new qe0(this, tL_chatInviteExported, 2));
    }

    public final xe0 l0() {
        xe0 xe0Var = new xe0(this);
        xe0Var.f(xe0Var.f53872i);
        xe0Var.f53868c = this.E;
        xe0Var.d = this.F;
        xe0Var.f53869e = this.I;
        xe0Var.f53870f = this.J;
        xe0Var.f53871g = this.V;
        xe0Var.h = this.W;
        xe0Var.f53867b = this.Y;
        xe0Var.f53874k.clear();
        xe0Var.f53874k.addAll(this.f47703j0);
        xe0Var.f53875l.clear();
        xe0Var.f53875l.addAll(this.f47704k0);
        return xe0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f47696e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f47709p0 = org.telegram.messenger.v3.t0(this.f47693c);
        j0(true);
    }

    public final void n0(xe0 xe0Var) {
        if (!this.isPaused && this.f47689a != null && this.f47691b != null) {
            o0(false);
            xe0Var.f(xe0Var.f53873j);
            v4.o.c(xe0Var, true).c(this.f47689a);
            org.telegram.messenger.g0.Z3(this.f47691b);
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
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(this.f47706n));
        this.f47693c = O0;
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
            this.f47711r = -1;
            this.f47719y = -1;
            this.W = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.Q = -1;
            this.f47718x = -1;
            this.H = -1;
            boolean z11 = false;
            this.Y = 0;
            if (this.f47698f != org.telegram.messenger.k10.i(getAccountInstance().f23202a).f24987n) {
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
                this.f47711r = i10;
            }
            int i11 = this.Y;
            this.f47713s = i11;
            int i12 = i11 + 2;
            this.Y = i12;
            this.f47717w = i11 + 1;
            ArrayList arrayList = this.f47703j0;
            if (!z11) {
                this.f47718x = i12;
                this.Y = i11 + 4;
                this.f47719y = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.Y;
                this.f47718x = i13;
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
            if (!z11 && arrayList.isEmpty() && this.f47719y >= 0 && (!this.X || this.f47697e0 || this.f47714s0)) {
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.P = i15;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f47707n0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f47719y >= 0) && this.P == -1) {
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
            ArrayList arrayList3 = this.f47704k0;
            if (!arrayList3.isEmpty()) {
                if (this.V >= 0) {
                    int i19 = this.Y;
                    this.Y = i19 + 1;
                    this.K = i19;
                } else if ((!arrayList.isEmpty() || this.f47719y >= 0) && this.P == -1) {
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
            if (!this.f47697e0 && !this.f47714s0 && ((this.X || this.f47694c0) && !z11)) {
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
                    ef0Var = this.f47689a;
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
            ef0Var = this.f47689a;
            if (ef0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25420y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25420y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ef0 ef0Var = this.f47689a;
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
            this.f47701h0 = true;
            if (z11 && (a60Var = this.m0) != null && a60Var.f33331g2) {
                a60Var.show();
            }
        }
        this.f47716u0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f47716u0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
