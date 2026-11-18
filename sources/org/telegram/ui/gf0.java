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
public final class gf0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public ff0 f47998a;
    public Drawable f47999a0;
    public org.telegram.ui.Components.ck0 f48000b;
    public Drawable f48001b0;
    public TLRPC.Chat f48002c;
    public boolean f48003c0;
    public TLRPC.ChatFull d;
    public boolean f48004d0;
    public TLRPC.TL_chatInviteExported f48005e;
    public boolean f48006e0;
    public final long f48007f;
    public boolean f48008f0;
    public final int f48009g0;
    public final boolean h;
    public boolean f48010h0;
    public org.telegram.ui.Components.fj0 f48011i0;
    public final ArrayList f48012j0;
    public final ArrayList f48013k0;
    public final HashMap f48014l0;
    public org.telegram.ui.Components.x50 m0;
    public final long f48015n;
    public final ArrayList f48016n0;
    public long f48017o0;
    public boolean f48018p0;
    public final boolean f48019q0;
    public int f48020r;
    public final ve0 f48021r0;
    public int f48022s;
    public boolean f48023s0;
    public final xe0 f48024t0;
    public final h2.f f48025u0;
    public int f48026w;
    public int f48027x;
    public int f48028y;

    public gf0(long j3, int i7, long j10) {
        super(null);
        boolean z10;
        this.f48012j0 = new ArrayList();
        this.f48013k0 = new ArrayList();
        this.f48014l0 = new HashMap();
        this.f48016n0 = new ArrayList();
        this.f48021r0 = new ve0(this);
        boolean z11 = false;
        this.f48023s0 = false;
        this.f48024t0 = new xe0(this);
        this.f48025u0 = new h2.f((int[]) null);
        this.f48015n = j3;
        this.f48009g0 = i7;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j3));
        this.f48002c = O0;
        if (org.telegram.messenger.v3.T(O0) && !this.f48002c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f48007f = org.telegram.messenger.j10.i(getAccountInstance().f23218a).f24789n;
        } else {
            this.f48007f = j10;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f48007f));
        if (this.f48007f == org.telegram.messenger.j10.i(getAccountInstance().f23218a).f24789n || (c22 != null && !c22.bot)) {
            z11 = true;
        }
        this.f48019q0 = z11;
    }

    public static void Z(org.telegram.ui.gf0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gf0.Z(org.telegram.ui.gf0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.gf0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gf0.a0(org.telegram.ui.gf0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(gf0 gf0Var) {
        if (gf0Var.f48007f == org.telegram.messenger.j10.i(gf0Var.getAccountInstance().f23218a).f24789n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = gf0Var.getMessagesController().l1(-gf0Var.f48015n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = gf0Var.f48005e;
            gf0Var.f48005e = null;
            gf0Var.d.exported_invite = null;
            int sendRequest = gf0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new qe0(gf0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.g0.Z3(gf0Var.f48000b);
            gf0Var.getConnectionsManager().bindRequestToGuid(sendRequest, gf0Var.classGuid);
            return;
        }
        gf0Var.k0(gf0Var.f48005e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29594o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29729v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29710u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748948, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 18));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29337a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f48000b = ck0Var;
        ck0Var.r1();
        this.f48000b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.f48000b.setLayoutManager(b0Var);
        org.telegram.ui.Components.ck0 ck0Var2 = this.f48000b;
        ff0 ff0Var = new ff0(this, context);
        this.f47998a = ff0Var;
        ck0Var2.setAdapter(ff0Var);
        this.f48000b.setOnScrollListener(new bi.d6(8, this, b0Var));
        this.f48011i0 = new org.telegram.ui.Components.fj0(this.f48000b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.f59152m = false;
        this.f48000b.setItemAnimator(kVar);
        org.telegram.ui.Components.ck0 ck0Var3 = this.f48000b;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        ck0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f48000b, c8.ma.c(-1.0f, -1));
        this.f48000b.setOnItemClickListener(new fi.g4(19, this, context));
        this.f48000b.setOnItemLongClickListener(new se0(this));
        this.Z = context.getDrawable(2131232207);
        this.f47999a0 = context.getDrawable(2131232208);
        this.f48001b0 = context.getDrawable(2131231610);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f48017o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25226y1 && ((Long) objArr[0]).longValue() == (-this.f48015n)) {
            org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
            if (s4Var != null && s4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.ck0 ck0Var = this.f48000b;
        if (ck0Var != null) {
            int childCount = ck0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f48000b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.e80) {
                    ((org.telegram.ui.Components.e80) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.x50 x50Var = this.m0;
        if (x50Var != null) {
            x50Var.updateColors();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f48000b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48000b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29786y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48000b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29576n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48000b, 32, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48000b, 0, new Class[]{org.telegram.ui.Cells.j2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().l1(-this.f48015n);
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
        boolean z11 = this.f48006e0;
        long j3 = this.f48015n;
        if (z11 && !this.f48008f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().l1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new pe0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f48007f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(j10);
            }
            boolean z12 = this.f48023s0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f48013k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f48012j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i5.c.h(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.f48018p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f48005e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.n8(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().l1(-this.f48015n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new qe0(this, tL_chatInviteExported, 2));
    }

    public final ye0 l0() {
        ye0 ye0Var = new ye0(this);
        ye0Var.f(ye0Var.f54131i);
        ye0Var.f54127c = this.E;
        ye0Var.d = this.F;
        ye0Var.f54128e = this.I;
        ye0Var.f54129f = this.J;
        ye0Var.f54130g = this.V;
        ye0Var.h = this.W;
        ye0Var.f54126b = this.Y;
        ye0Var.f54133k.clear();
        ye0Var.f54133k.addAll(this.f48012j0);
        ye0Var.f54134l.clear();
        ye0Var.f54134l.addAll(this.f48013k0);
        return ye0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f48005e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f48018p0 = org.telegram.messenger.v3.t0(this.f48002c);
        j0(true);
    }

    public final void n0(ye0 ye0Var) {
        if (!this.isPaused && this.f47998a != null && this.f48000b != null) {
            o0(false);
            ye0Var.f(ye0Var.f54132j);
            v4.o.c(ye0Var, true).c(this.f47998a);
            org.telegram.messenger.g0.Z3(this.f48000b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        ff0 ff0Var;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(this.f48015n));
        this.f48002c = O0;
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
            this.f48020r = -1;
            this.f48028y = -1;
            this.W = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.Q = -1;
            this.f48027x = -1;
            this.H = -1;
            boolean z11 = false;
            this.Y = 0;
            if (this.f48007f != org.telegram.messenger.j10.i(getAccountInstance().f23218a).f24789n) {
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
                this.f48020r = i10;
            }
            int i11 = this.Y;
            this.f48022s = i11;
            int i12 = i11 + 2;
            this.Y = i12;
            this.f48026w = i11 + 1;
            ArrayList arrayList = this.f48012j0;
            if (!z11) {
                this.f48027x = i12;
                this.Y = i11 + 4;
                this.f48028y = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.Y;
                this.f48027x = i13;
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
            if (!z11 && arrayList.isEmpty() && this.f48028y >= 0 && (!this.X || this.f48006e0 || this.f48023s0)) {
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.P = i15;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f48016n0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f48028y >= 0) && this.P == -1) {
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
            ArrayList arrayList3 = this.f48013k0;
            if (!arrayList3.isEmpty()) {
                if (this.V >= 0) {
                    int i19 = this.Y;
                    this.Y = i19 + 1;
                    this.K = i19;
                } else if ((!arrayList.isEmpty() || this.f48028y >= 0) && this.P == -1) {
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
            if (!this.f48006e0 && !this.f48023s0 && ((this.X || this.f48003c0) && !z11)) {
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
                    ff0Var = this.f47998a;
                    if (ff0Var == null && z10) {
                        ff0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i27 = this.Y;
                this.Y = i27 + 1;
                this.L = i27;
            }
            ff0Var = this.f47998a;
            if (ff0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25226y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25226y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ff0 ff0Var = this.f47998a;
        if (ff0Var != null) {
            ff0Var.f();
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
        org.telegram.ui.Components.x50 x50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f48010h0 = true;
            if (z11 && (x50Var = this.m0) != null && x50Var.f41892g2) {
                x50Var.show();
            }
        }
        this.f48025u0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f48025u0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
