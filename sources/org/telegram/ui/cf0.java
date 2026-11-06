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
public final class cf0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public bf0 f44772a;
    public Drawable f44773a0;
    public org.telegram.ui.Components.pj0 f44774b;
    public boolean f44775b0;
    public TLRPC.Chat f44776c;
    public boolean f44777c0;
    public TLRPC.ChatFull d;
    public boolean f44778d0;
    public TLRPC.TL_chatInviteExported f44779e;
    public boolean f44780e0;
    public final long f44781f;
    public final int f44782f0;
    public boolean f44783g0;
    public final boolean h;
    public org.telegram.ui.Components.si0 f44784h0;
    public final ArrayList f44785i0;
    public final ArrayList f44786j0;
    public final HashMap f44787k0;
    public org.telegram.ui.Components.m50 f44788l0;
    public final ArrayList m0;
    public final long f44789n;
    public long f44790n0;
    public boolean f44791o0;
    public final boolean f44792p0;
    public final se0 f44793q0;
    public int f44794r;
    public boolean f44795r0;
    public int f44796s;
    public final te0 f44797s0;
    public final h2.f f44798t0;
    public int f44799w;
    public int f44800x;
    public int f44801y;

    public cf0(long j3, int i7, long j10) {
        super(null);
        boolean z9;
        this.f44785i0 = new ArrayList();
        this.f44786j0 = new ArrayList();
        this.f44787k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f44793q0 = new se0(this);
        boolean z10 = false;
        this.f44795r0 = false;
        this.f44797s0 = new te0(this);
        this.f44798t0 = new h2.f((int[]) null);
        this.f44789n = j3;
        this.f44782f0 = i7;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j3));
        this.f44776c = M0;
        if (org.telegram.messenger.t3.T(M0) && !this.f44776c.megagroup) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h = z9;
        if (j10 == 0) {
            this.f44781f = org.telegram.messenger.p10.i(getAccountInstance().f21723a).f24478n;
        } else {
            this.f44781f = j10;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f44781f));
        if (this.f44781f == org.telegram.messenger.p10.i(getAccountInstance().f21723a).f24478n || (a22 != null && !a22.bot)) {
            z10 = true;
        }
        this.f44792p0 = z10;
    }

    public static void Z(org.telegram.ui.cf0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.Z(org.telegram.ui.cf0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.cf0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.a0(org.telegram.ui.cf0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(cf0 cf0Var) {
        if (cf0Var.f44781f == org.telegram.messenger.p10.i(cf0Var.getAccountInstance().f21723a).f24478n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = cf0Var.getMessagesController().j1(-cf0Var.f44789n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = cf0Var.f44779e;
            cf0Var.f44779e = null;
            cf0Var.d.exported_invite = null;
            int sendRequest = cf0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ne0(cf0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.g0.b4(cf0Var.f44774b);
            cf0Var.getConnectionsManager().bindRequestToGuid(sendRequest, cf0Var.classGuid);
            return;
        }
        cf0Var.k0(cf0Var.f44779e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28048o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28183v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28164u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27906g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749139, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 15));
        k0 k0Var = new k0(15, context, this);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27792a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f44774b = pj0Var;
        pj0Var.r1();
        this.f44774b.setSectionsDrawBackground(true);
        jg.b0 b0Var = new jg.b0(1, false, 12);
        this.f44774b.setLayoutManager(b0Var);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f44774b;
        bf0 bf0Var = new bf0(this, context);
        this.f44772a = bf0Var;
        pj0Var2.setAdapter(bf0Var);
        this.f44774b.setOnScrollListener(new ai.o0(7, this, b0Var));
        this.f44784h0 = new org.telegram.ui.Components.si0(this.f44774b, false);
        v4.k kVar = new v4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f56954m = false;
        this.f44774b.setItemAnimator(kVar);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f44774b;
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f44774b, c8.ha.c(-1.0f, -1));
        this.f44774b.setOnItemClickListener(new di.p4(19, this, context));
        this.f44774b.setOnItemLongClickListener(new pe0(this));
        this.Y = context.getDrawable(2131232205);
        this.Z = context.getDrawable(2131232206);
        this.f44773a0 = context.getDrawable(2131231609);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f44790n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25095y1 && ((Long) objArr[0]).longValue() == (-this.f44789n)) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.pj0 pj0Var = this.f44774b;
        if (pj0Var != null) {
            int childCount = pj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f44774b.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.q70) {
                    ((org.telegram.ui.Components.q70) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.m50 m50Var = this.f44788l0;
        if (m50Var != null) {
            m50Var.updateColors();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f44774b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44774b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28240y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44774b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28030n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44774b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44774b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().j1(-this.f44789n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ne0(this, tL_chatInviteExported, 1));
    }

    public final void i0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z9 = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z9 = true;
            }
            tL_chatInviteExported.expired = z9;
            return;
        }
        int i7 = tL_chatInviteExported.usage_limit;
        if (i7 > 0) {
            if (tL_chatInviteExported.usage >= i7) {
                z9 = true;
            }
            tL_chatInviteExported.expired = z9;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z10 = this.f44778d0;
        long j3 = this.f44789n;
        if (z10 && !this.f44780e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().j1(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new me0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j3);
            long e10 = getUserConfig().e();
            long j10 = this.f44781f;
            if (j10 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(j10);
            }
            boolean z11 = this.f44795r0;
            if (z11) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f44786j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f44785i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) jg.g.i(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f44791o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f44779e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bi.u9(this, tL_chatInviteExported, z11, 7)), getClassGuid());
        }
        if (z9) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().j1(-this.f44789n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ne0(this, tL_chatInviteExported, 2));
    }

    public final ue0 l0() {
        ue0 ue0Var = new ue0(this);
        ue0Var.f(ue0Var.f50392i);
        ue0Var.f50388c = this.D;
        ue0Var.d = this.E;
        ue0Var.f50389e = this.H;
        ue0Var.f50390f = this.I;
        ue0Var.f50391g = this.U;
        ue0Var.h = this.V;
        ue0Var.f50387b = this.X;
        ue0Var.f50394k.clear();
        ue0Var.f50394k.addAll(this.f44785i0);
        ue0Var.f50395l.clear();
        ue0Var.f50395l.addAll(this.f44786j0);
        return ue0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f44779e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f44791o0 = org.telegram.messenger.t3.t0(this.f44776c);
        j0(true);
    }

    public final void n0(ue0 ue0Var) {
        if (!this.isPaused && this.f44772a != null && this.f44774b != null) {
            o0(false);
            ue0Var.f(ue0Var.f50393j);
            v4.o.c(ue0Var, true).c(this.f44772a);
            org.telegram.messenger.g0.b4(this.f44774b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z9) {
        bf0 bf0Var;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.f44789n));
        this.f44776c = M0;
        if (M0 != null) {
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
            this.f44794r = -1;
            this.f44801y = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f44800x = -1;
            this.G = -1;
            boolean z10 = false;
            this.X = 0;
            if (this.f44781f != org.telegram.messenger.p10.i(getAccountInstance().f21723a).f24478n) {
                z10 = true;
            }
            if (z10) {
                int i7 = this.X;
                this.Q = i7;
                this.X = i7 + 2;
                this.R = i7 + 1;
            } else {
                int i10 = this.X;
                this.X = i10 + 1;
                this.f44794r = i10;
            }
            int i11 = this.X;
            this.f44796s = i11;
            int i12 = i11 + 2;
            this.X = i12;
            this.f44799w = i11 + 1;
            ArrayList arrayList = this.f44785i0;
            if (!z10) {
                this.f44800x = i12;
                this.X = i11 + 4;
                this.f44801y = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.X;
                this.f44800x = i13;
                this.X = i13 + 2;
                this.P = i13 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.D = i14;
                int size = arrayList.size() + i14;
                this.X = size;
                this.E = size;
            }
            if (!z10 && arrayList.isEmpty() && this.f44801y >= 0 && (!this.W || this.f44778d0 || this.f44795r0)) {
                int i15 = this.X;
                this.X = i15 + 1;
                this.O = i15;
            }
            if (!z10) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f44801y >= 0) && this.O == -1) {
                        int i16 = this.X;
                        this.X = i16 + 1;
                        this.T = i16;
                    }
                    int i17 = this.X;
                    int i18 = i17 + 1;
                    this.X = i18;
                    this.S = i17;
                    this.U = i18;
                    int size2 = arrayList2.size() + i18;
                    this.X = size2;
                    this.V = size2;
                }
            }
            ArrayList arrayList3 = this.f44786j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i19 = this.X;
                    this.X = i19 + 1;
                    this.J = i19;
                } else if ((!arrayList.isEmpty() || this.f44801y >= 0) && this.O == -1) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if (z10 && this.D == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                }
                int i22 = this.X;
                int i23 = i22 + 1;
                this.X = i23;
                this.L = i22;
                this.H = i23;
                int size3 = arrayList3.size() + i23;
                this.I = size3;
                this.M = size3;
                this.X = size3 + 2;
                this.N = size3 + 1;
            }
            if (!this.f44778d0 && !this.f44795r0 && ((this.W || this.f44775b0) && !z10)) {
                int i24 = this.X;
                this.X = i24 + 1;
                this.F = i24;
            }
            if (!arrayList.isEmpty()) {
                int i25 = this.E;
                int i26 = this.X;
                if (i25 == i26) {
                    this.X = i26 + 1;
                    this.G = i26;
                    bf0Var = this.f44772a;
                    if (bf0Var == null && z9) {
                        bf0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i27 = this.X;
                this.X = i27 + 1;
                this.K = i27;
            }
            bf0Var = this.f44772a;
            if (bf0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25095y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25095y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        bf0 bf0Var = this.f44772a;
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
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.Components.m50 m50Var;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9) {
            this.f44783g0 = true;
            if (z10 && (m50Var = this.f44788l0) != null && m50Var.f35907c2) {
                m50Var.show();
            }
        }
        this.f44798t0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        this.f44798t0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
