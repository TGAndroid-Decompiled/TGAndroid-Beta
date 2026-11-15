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
public final class cf0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public bf0 f46124a;
    public Drawable f46125a0;
    public org.telegram.ui.Components.uj0 f46126b;
    public Drawable f46127b0;
    public TLRPC.Chat f46128c;
    public boolean f46129c0;
    public TLRPC.ChatFull d;
    public boolean f46130d0;
    public TLRPC.TL_chatInviteExported f46131e;
    public boolean f46132e0;
    public final long f46133f;
    public boolean f46134f0;
    public final int f46135g0;
    public final boolean h;
    public boolean f46136h0;
    public org.telegram.ui.Components.xi0 f46137i0;
    public final ArrayList f46138j0;
    public final ArrayList f46139k0;
    public final HashMap f46140l0;
    public org.telegram.ui.Components.p50 m0;
    public final long f46141n;
    public final ArrayList f46142n0;
    public long f46143o0;
    public boolean f46144p0;
    public final boolean f46145q0;
    public int f46146r;
    public final se0 f46147r0;
    public int f46148s;
    public boolean f46149s0;
    public final te0 f46150t0;
    public final h2.f f46151u0;
    public int f46152w;
    public int f46153x;
    public int f46154y;

    public cf0(long j3, int i7, long j10) {
        super(null);
        boolean z10;
        this.f46138j0 = new ArrayList();
        this.f46139k0 = new ArrayList();
        this.f46140l0 = new HashMap();
        this.f46142n0 = new ArrayList();
        this.f46147r0 = new se0(this);
        boolean z11 = false;
        this.f46149s0 = false;
        this.f46150t0 = new te0(this);
        this.f46151u0 = new h2.f((int[]) null);
        this.f46141n = j3;
        this.f46135g0 = i7;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(j3));
        this.f46128c = M0;
        if (org.telegram.messenger.t3.T(M0) && !this.f46128c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f46133f = org.telegram.messenger.m10.i(getAccountInstance().f22778a).f24953n;
        } else {
            this.f46133f = j10;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f46133f));
        if (this.f46133f == org.telegram.messenger.m10.i(getAccountInstance().f22778a).f24953n || (a22 != null && !a22.bot)) {
            z11 = true;
        }
        this.f46145q0 = z11;
    }

    public static void Z(org.telegram.ui.cf0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.Z(org.telegram.ui.cf0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.cf0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.a0(org.telegram.ui.cf0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(cf0 cf0Var) {
        if (cf0Var.f46133f == org.telegram.messenger.m10.i(cf0Var.getAccountInstance().f22778a).f24953n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = cf0Var.getMessagesController().j1(-cf0Var.f46141n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = cf0Var.f46131e;
            cf0Var.f46131e = null;
            cf0Var.d.exported_invite = null;
            int sendRequest = cf0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ne0(cf0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.g0.a4(cf0Var.f46126b);
            cf0Var.getConnectionsManager().bindRequestToGuid(sendRequest, cf0Var.classGuid);
            return;
        }
        cf0Var.k0(cf0Var.f46131e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29049o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29184v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29165u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28907g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749140, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 16));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f46126b = uj0Var;
        uj0Var.r1();
        this.f46126b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.f46126b.setLayoutManager(b0Var);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f46126b;
        bf0 bf0Var = new bf0(this, context);
        this.f46124a = bf0Var;
        uj0Var2.setAdapter(bf0Var);
        this.f46126b.setOnScrollListener(new bi.w3(8, this, b0Var));
        this.f46137i0 = new org.telegram.ui.Components.xi0(this.f46126b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f46126b.setItemAnimator(kVar);
        org.telegram.ui.Components.uj0 uj0Var3 = this.f46126b;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        uj0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f46126b, c8.ja.c(-1.0f, -1));
        this.f46126b.setOnItemClickListener(new fi.i4(19, this, context));
        this.f46126b.setOnItemLongClickListener(new pe0(this));
        this.Z = context.getDrawable(2131232206);
        this.f46125a0 = context.getDrawable(2131232207);
        this.f46127b0 = context.getDrawable(2131231609);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f46143o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25608y1 && ((Long) objArr[0]).longValue() == (-this.f46141n)) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var != null && o4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.uj0 uj0Var = this.f46126b;
        if (uj0Var != null) {
            int childCount = uj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f46126b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.t70) {
                    ((org.telegram.ui.Components.t70) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.p50 p50Var = this.m0;
        if (p50Var != null) {
            p50Var.updateColors();
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f46126b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46126b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29241y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46126b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46126b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46126b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().j1(-this.f46141n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ne0(this, tL_chatInviteExported, 1));
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
        boolean z11 = this.f46132e0;
        long j3 = this.f46141n;
        if (z11 && !this.f46134f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().j1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new me0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f46133f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(j10);
            }
            boolean z12 = this.f46149s0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f46139k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f46138j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.f46144p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f46131e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.l8(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().j1(-this.f46141n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ne0(this, tL_chatInviteExported, 2));
    }

    public final ue0 l0() {
        ue0 ue0Var = new ue0(this);
        ue0Var.f(ue0Var.f51927i);
        ue0Var.f51923c = this.E;
        ue0Var.d = this.F;
        ue0Var.f51924e = this.I;
        ue0Var.f51925f = this.J;
        ue0Var.f51926g = this.V;
        ue0Var.h = this.W;
        ue0Var.f51922b = this.Y;
        ue0Var.f51929k.clear();
        ue0Var.f51929k.addAll(this.f46138j0);
        ue0Var.f51930l.clear();
        ue0Var.f51930l.addAll(this.f46139k0);
        return ue0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f46131e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f46144p0 = org.telegram.messenger.t3.t0(this.f46128c);
        j0(true);
    }

    public final void n0(ue0 ue0Var) {
        if (!this.isPaused && this.f46124a != null && this.f46126b != null) {
            o0(false);
            ue0Var.f(ue0Var.f51928j);
            v4.o.c(ue0Var, true).c(this.f46124a);
            org.telegram.messenger.g0.a4(this.f46126b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        bf0 bf0Var;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(this.f46141n));
        this.f46128c = M0;
        if (M0 != null) {
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
            this.f46146r = -1;
            this.f46154y = -1;
            this.W = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.Q = -1;
            this.f46153x = -1;
            this.H = -1;
            boolean z11 = false;
            this.Y = 0;
            if (this.f46133f != org.telegram.messenger.m10.i(getAccountInstance().f22778a).f24953n) {
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
                this.f46146r = i10;
            }
            int i11 = this.Y;
            this.f46148s = i11;
            int i12 = i11 + 2;
            this.Y = i12;
            this.f46152w = i11 + 1;
            ArrayList arrayList = this.f46138j0;
            if (!z11) {
                this.f46153x = i12;
                this.Y = i11 + 4;
                this.f46154y = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.Y;
                this.f46153x = i13;
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
            if (!z11 && arrayList.isEmpty() && this.f46154y >= 0 && (!this.X || this.f46132e0 || this.f46149s0)) {
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.P = i15;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f46142n0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f46154y >= 0) && this.P == -1) {
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
            ArrayList arrayList3 = this.f46139k0;
            if (!arrayList3.isEmpty()) {
                if (this.V >= 0) {
                    int i19 = this.Y;
                    this.Y = i19 + 1;
                    this.K = i19;
                } else if ((!arrayList.isEmpty() || this.f46154y >= 0) && this.P == -1) {
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
            if (!this.f46132e0 && !this.f46149s0 && ((this.X || this.f46129c0) && !z11)) {
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
                    bf0Var = this.f46124a;
                    if (bf0Var == null && z10) {
                        bf0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i27 = this.Y;
                this.Y = i27 + 1;
                this.L = i27;
            }
            bf0Var = this.f46124a;
            if (bf0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25608y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25608y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        bf0 bf0Var = this.f46124a;
        if (bf0Var != null) {
            bf0Var.f();
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
        org.telegram.ui.Components.p50 p50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f46136h0 = true;
            if (z11 && (p50Var = this.m0) != null && p50Var.f38212g2) {
                p50Var.show();
            }
        }
        this.f46151u0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f46151u0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
