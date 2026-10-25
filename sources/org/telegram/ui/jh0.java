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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jh0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public ih0 f40642a;
    public Drawable f40643a0;
    public org.telegram.ui.Components.mm0 f40644b;
    public boolean f40645b0;
    public TLRPC.Chat f40646c;
    public boolean f40647c0;
    public TLRPC.ChatFull d;
    public boolean f40648d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f40649e0;
    public final long f40650f;
    public final int f40651f0;
    public boolean f40652g0;
    public final boolean h;
    public org.telegram.ui.Components.ql0 f40653h0;
    public final ArrayList f40654i0;
    public final ArrayList f40655j0;
    public final HashMap f40656k0;
    public org.telegram.ui.Components.n70 f40657l0;
    public final ArrayList m0;
    public final long f40658n;
    public long f40659n0;
    public boolean f40660o0;
    public final boolean f40661p0;
    public final yg0 f40662q0;
    public int f40663r;
    public boolean f40664r0;
    public int f40665s;
    public final zg0 f40666s0;
    public final AnimationNotificationsLocker f40667t0;
    public int v;
    public int f40668w;
    public int f40669x;
    public int f40670y;

    public jh0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f40654i0 = new ArrayList();
        this.f40655j0 = new ArrayList();
        this.f40656k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f40662q0 = new yg0(this);
        boolean z11 = false;
        this.f40664r0 = false;
        this.f40666s0 = new zg0(this);
        this.f40667t0 = new AnimationNotificationsLocker();
        this.f40658n = j10;
        this.f40651f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f40646c = chat;
        if (ChatObject.isChannel(chat) && !this.f40646c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f40650f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f40650f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f40650f));
        if (this.f40650f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f40661p0 = z11;
    }

    public static void V(org.telegram.ui.jh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jh0.V(org.telegram.ui.jh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void W(org.telegram.ui.jh0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jh0.W(org.telegram.ui.jh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(jh0 jh0Var) {
        if (jh0Var.f40650f == jh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = jh0Var.getMessagesController().getInputPeer(-jh0Var.f40658n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = jh0Var.e;
            jh0Var.e = null;
            jh0Var.d.exported_invite = null;
            int sendRequest = jh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new tg0(jh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(jh0Var.f40644b);
            jh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, jh0Var.classGuid);
            return;
        }
        jh0Var.g0(jh0Var.e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23746y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23558o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23690v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23671u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23412g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    public final void c0() {
        org.telegram.ui.Components.mm0 mm0Var = this.f40644b;
        if (mm0Var != null) {
            int childCount = mm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f40644b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.r90) {
                    ((org.telegram.ui.Components.r90) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.n70 n70Var = this.f40657l0;
        if (n70Var != null) {
            n70Var.updateColors();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 12));
        k0 k0Var = new k0(this, context, 14);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23297a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f40644b = mm0Var;
        mm0Var.u1();
        this.f40644b.setSectionsDrawBackground(true);
        ig.a0 a0Var = new ig.a0(1, false, 12);
        this.f40644b.setLayoutManager(a0Var);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f40644b;
        ih0 ih0Var = new ih0(this, context);
        this.f40642a = ih0Var;
        mm0Var2.setAdapter(ih0Var);
        this.f40644b.setOnScrollListener(new ai.u0(7, this, a0Var));
        this.f40653h0 = new org.telegram.ui.Components.ql0(this.f40644b, false);
        s4.l lVar = new s4.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        this.f40644b.setItemAnimator(lVar);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f40644b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f40644b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f40644b.setOnItemClickListener(new di.x4(19, this, context));
        this.f40644b.setOnItemLongClickListener(new vg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f40643a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        k0(true);
        this.f40659n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f40658n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new tg0(this, tL_chatInviteExported, 1));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f40658n)) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var != null && j5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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

    public final void f0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f40648d0;
        long j10 = this.f40658n;
        if (z11 && !this.f40649e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new sg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f40650f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f40664r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f40655j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f40654i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f40660o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bi.r9(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            k0(true);
        }
    }

    public final void g0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f40658n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new tg0(this, tL_chatInviteExported, 2));
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f40644b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(13, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f40644b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23746y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f40644b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23538n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f40644b, 32, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f40644b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23483k7));
        return arrayList;
    }

    public final ah0 h0() {
        ah0 ah0Var = new ah0(this);
        ah0Var.f(ah0Var.f37796i);
        ah0Var.f37793c = this.f40670y;
        ah0Var.d = this.E;
        ah0Var.e = this.H;
        ah0Var.f37794f = this.I;
        ah0Var.f37795g = this.U;
        ah0Var.h = this.V;
        ah0Var.f37792b = this.X;
        ah0Var.f37798k.clear();
        ah0Var.f37798k.addAll(this.f40654i0);
        ah0Var.f37799l.clear();
        ah0Var.f37799l.addAll(this.f40655j0);
        return ah0Var;
    }

    public final void i0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f40660o0 = ChatObject.isPublic(this.f40646c);
        f0(true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(ah0 ah0Var) {
        if (!this.isPaused && this.f40642a != null && this.f40644b != null) {
            k0(false);
            ah0Var.f(ah0Var.f37797j);
            s4.p.c(ah0Var, true).c(this.f40642a);
            AndroidUtilities.updateVisibleRows(this.f40644b);
            return;
        }
        k0(true);
    }

    public final void k0(boolean z10) {
        ih0 ih0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f40658n));
        this.f40646c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f40670y = -1;
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
            this.f40663r = -1;
            this.f40669x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f40668w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f40650f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f40663r = i11;
            }
            int i12 = this.X;
            this.f40665s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f40654i0;
            if (!z11) {
                this.f40668w = i13;
                this.X = i12 + 4;
                this.f40669x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f40668w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f40670y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f40669x >= 0 && (!this.W || this.f40648d0 || this.f40664r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f40669x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f40655j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f40669x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f40670y == -1) {
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
            if (!this.f40648d0 && !this.f40664r0 && ((this.W || this.f40645b0) && !z11)) {
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
                    ih0Var = this.f40642a;
                    if (ih0Var == null && z10) {
                        ih0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            ih0Var = this.f40642a;
            if (ih0Var == null) {
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ih0 ih0Var = this.f40642a;
        if (ih0Var != null) {
            ih0Var.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.n70 n70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f40652g0 = true;
            if (z11 && (n70Var = this.f40657l0) != null && n70Var.f30897l0) {
                n70Var.show();
            }
        }
        this.f40667t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f40667t0.lock();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
