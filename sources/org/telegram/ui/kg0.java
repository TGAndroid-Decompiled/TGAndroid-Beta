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
public final class kg0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public jg0 f38794a;
    public Drawable f38795a0;
    public org.telegram.ui.Components.tk0 f38796b;
    public boolean f38797b0;
    public TLRPC.Chat f38798c;
    public boolean f38799c0;
    public TLRPC.ChatFull d;
    public boolean f38800d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f38801e0;
    public final long f38802f;
    public final int f38803f0;
    public boolean f38804g0;
    public final boolean h;
    public org.telegram.ui.Components.wj0 f38805h0;
    public final ArrayList f38806i0;
    public final ArrayList f38807j0;
    public final HashMap f38808k0;
    public org.telegram.ui.Components.c60 f38809l0;
    public final ArrayList m0;
    public final long f38810n;
    public long f38811n0;
    public boolean f38812o0;
    public final boolean f38813p0;
    public final zf0 f38814q0;
    public int f38815r;
    public boolean f38816r0;
    public int f38817s;
    public final ag0 f38818s0;
    public final e2.f f38819t0;
    public int f38820w;
    public int f38821x;
    public int f38822y;

    public kg0(long j10, int i10, long j11) {
        super(null);
        boolean z10;
        this.f38806i0 = new ArrayList();
        this.f38807j0 = new ArrayList();
        this.f38808k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f38814q0 = new zf0(this);
        boolean z11 = false;
        this.f38816r0 = false;
        this.f38818s0 = new ag0(this);
        this.f38819t0 = new e2.f(null);
        this.f38810n = j10;
        this.f38803f0 = i10;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(j10));
        this.f38798c = L0;
        if (org.telegram.messenger.w3.T(L0) && !this.f38798c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f38802f = org.telegram.messenger.d20.i(getAccountInstance().f14863a).f15165n;
        } else {
            this.f38802f = j11;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f38802f));
        if (this.f38802f == org.telegram.messenger.d20.i(getAccountInstance().f14863a).f15165n || (Z1 != null && !Z1.bot)) {
            z11 = true;
        }
        this.f38813p0 = z11;
    }

    public static void Y(org.telegram.ui.kg0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kg0.Y(org.telegram.ui.kg0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void Z(org.telegram.ui.kg0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kg0.Z(org.telegram.ui.kg0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void a0(kg0 kg0Var) {
        if (kg0Var.f38802f == org.telegram.messenger.d20.i(kg0Var.getAccountInstance().f14863a).f15165n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = kg0Var.getMessagesController().i1(-kg0Var.f38810n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = kg0Var.e;
            kg0Var.e = null;
            kg0Var.d.exported_invite = null;
            int sendRequest = kg0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new tf0(kg0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.i0.a4(kg0Var.f38796b);
            kg0Var.getConnectionsManager().bindRequestToGuid(sendRequest, kg0Var.classGuid);
            return;
        }
        kg0Var.j0(kg0Var.e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21134o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21259v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21242u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20988g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749150, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 6));
        l0 l0Var = new l0(this, context, 16);
        this.fragmentView = l0Var;
        l0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20872a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f38796b = tk0Var;
        tk0Var.r1();
        this.f38796b.setSectionsDrawBackground(true);
        dh.f fVar = new dh.f(1, false, 11);
        this.f38796b.setLayoutManager(fVar);
        org.telegram.ui.Components.tk0 tk0Var2 = this.f38796b;
        jg0 jg0Var = new jg0(this, context);
        this.f38794a = jg0Var;
        tk0Var2.setAdapter(jg0Var);
        this.f38796b.setOnScrollListener(new bi.t3(8, this, fVar));
        this.f38805h0 = new org.telegram.ui.Components.wj0(this.f38796b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f38796b.setItemAnimator(jVar);
        org.telegram.ui.Components.tk0 tk0Var3 = this.f38796b;
        if (org.telegram.messenger.cd.X) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        tk0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38796b, w7.b6.c(-1.0f, -1));
        this.f38796b.setOnItemClickListener(new mg.q0(18, this, context));
        this.f38796b.setOnItemLongClickListener(new wf0(this));
        this.Y = context.getDrawable(2131232204);
        this.Z = context.getDrawable(2131232205);
        this.f38795a0 = context.getDrawable(2131231610);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        n0(true);
        this.f38811n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19726y1 && ((Long) objArr[0]).longValue() == (-this.f38810n)) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void f0() {
        org.telegram.ui.Components.tk0 tk0Var = this.f38796b;
        if (tk0Var != null) {
            int childCount = tk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f38796b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.j80) {
                    ((org.telegram.ui.Components.j80) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.c60 c60Var = this.f38809l0;
        if (c60Var != null) {
            c60Var.updateColors();
        }
    }

    public final void g0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().i1(-this.f38810n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new tf0(this, tL_chatInviteExported, 1));
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f38796b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38796b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21311y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38796b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38796b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38796b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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

    public final void i0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f38800d0;
        long j10 = this.f38810n;
        if (z11 && !this.f38801e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().i1(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new sf0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j10);
            long e = getUserConfig().e();
            long j11 = this.f38802f;
            if (j11 == e) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().n1(j11);
            }
            boolean z12 = this.f38816r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f38807j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f38806i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f38812o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new wd(this, tL_chatInviteExported, z12, 4)), getClassGuid());
        }
        if (z10) {
            n0(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().i1(-this.f38810n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new tf0(this, tL_chatInviteExported, 2));
    }

    public final bg0 k0() {
        bg0 bg0Var = new bg0(this);
        bg0Var.f(bg0Var.f36255i);
        bg0Var.f36252c = this.D;
        bg0Var.d = this.E;
        bg0Var.e = this.H;
        bg0Var.f36253f = this.I;
        bg0Var.f36254g = this.U;
        bg0Var.h = this.V;
        bg0Var.f36251b = this.X;
        bg0Var.f36257k.clear();
        bg0Var.f36257k.addAll(this.f38806i0);
        bg0Var.f36258l.clear();
        bg0Var.f36258l.addAll(this.f38807j0);
        return bg0Var;
    }

    public final void l0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f38812o0 = org.telegram.messenger.w3.t0(this.f38798c);
        i0(true);
    }

    public final void m0(bg0 bg0Var) {
        if (!this.isPaused && this.f38794a != null && this.f38796b != null) {
            n0(false);
            bg0Var.f(bg0Var.f36256j);
            s4.n.c(bg0Var, true).c(this.f38794a);
            org.telegram.messenger.i0.a4(this.f38796b);
            return;
        }
        n0(true);
    }

    public final void n0(boolean z10) {
        jg0 jg0Var;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(this.f38810n));
        this.f38798c = L0;
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
            this.f38815r = -1;
            this.f38822y = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f38821x = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f38802f != org.telegram.messenger.d20.i(getAccountInstance().f14863a).f15165n) {
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
                this.f38815r = i11;
            }
            int i12 = this.X;
            this.f38817s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.f38820w = i12 + 1;
            ArrayList arrayList = this.f38806i0;
            if (!z11) {
                this.f38821x = i13;
                this.X = i12 + 4;
                this.f38822y = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f38821x = i14;
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
            if (!z11 && arrayList.isEmpty() && this.f38822y >= 0 && (!this.W || this.f38800d0 || this.f38816r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f38822y >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f38807j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f38822y >= 0) && this.O == -1) {
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
            if (!this.f38800d0 && !this.f38816r0 && ((this.W || this.f38797b0) && !z11)) {
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
                    jg0Var = this.f38794a;
                    if (jg0Var == null && z10) {
                        jg0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            jg0Var = this.f38794a;
            if (jg0Var == null) {
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19726y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19726y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        jg0 jg0Var = this.f38794a;
        if (jg0Var != null) {
            jg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.c60 c60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f38804g0 = true;
            if (z11 && (c60Var = this.f38809l0) != null && c60Var.f24991c2) {
                c60Var.show();
            }
        }
        this.f38819t0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f38819t0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
