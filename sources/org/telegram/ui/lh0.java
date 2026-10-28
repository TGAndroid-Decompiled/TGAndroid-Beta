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
public final class lh0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public kh0 f41161a;
    public Drawable f41162a0;
    public org.telegram.ui.Components.nm0 f41163b;
    public boolean f41164b0;
    public TLRPC.Chat f41165c;
    public boolean f41166c0;
    public TLRPC.ChatFull d;
    public boolean f41167d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f41168e0;
    public final long f41169f;
    public final int f41170f0;
    public boolean f41171g0;
    public final boolean h;
    public org.telegram.ui.Components.rl0 f41172h0;
    public final ArrayList f41173i0;
    public final ArrayList f41174j0;
    public final HashMap f41175k0;
    public org.telegram.ui.Components.o70 f41176l0;
    public final ArrayList m0;
    public final long f41177n;
    public long f41178n0;
    public boolean f41179o0;
    public final boolean f41180p0;
    public final ah0 f41181q0;
    public int f41182r;
    public boolean f41183r0;
    public int f41184s;
    public final bh0 f41185s0;
    public final AnimationNotificationsLocker f41186t0;
    public int v;
    public int f41187w;
    public int f41188x;
    public int f41189y;

    public lh0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f41173i0 = new ArrayList();
        this.f41174j0 = new ArrayList();
        this.f41175k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f41181q0 = new ah0(this);
        boolean z11 = false;
        this.f41183r0 = false;
        this.f41185s0 = new bh0(this);
        this.f41186t0 = new AnimationNotificationsLocker();
        this.f41177n = j10;
        this.f41170f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f41165c = chat;
        if (ChatObject.isChannel(chat) && !this.f41165c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f41169f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f41169f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f41169f));
        if (this.f41169f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f41180p0 = z11;
    }

    public static void V(org.telegram.ui.lh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh0.V(org.telegram.ui.lh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void W(org.telegram.ui.lh0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh0.W(org.telegram.ui.lh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(lh0 lh0Var) {
        if (lh0Var.f41169f == lh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = lh0Var.getMessagesController().getInputPeer(-lh0Var.f41177n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = lh0Var.e;
            lh0Var.e = null;
            lh0Var.d.exported_invite = null;
            int sendRequest = lh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new vg0(lh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(lh0Var.f41163b);
            lh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, lh0Var.classGuid);
            return;
        }
        lh0Var.g0(lh0Var.e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23561o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23693v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23674u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23415g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    public final void c0() {
        org.telegram.ui.Components.nm0 nm0Var = this.f41163b;
        if (nm0Var != null) {
            int childCount = nm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f41163b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.s90) {
                    ((org.telegram.ui.Components.s90) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.o70 o70Var = this.f41176l0;
        if (o70Var != null) {
            o70Var.updateColors();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 12));
        k0 k0Var = new k0(this, context, 14);
        this.fragmentView = k0Var;
        k0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f41163b = nm0Var;
        nm0Var.u1();
        this.f41163b.setSectionsDrawBackground(true);
        ig.a0 a0Var = new ig.a0(1, false, 12);
        this.f41163b.setLayoutManager(a0Var);
        org.telegram.ui.Components.nm0 nm0Var2 = this.f41163b;
        kh0 kh0Var = new kh0(this, context);
        this.f41161a = kh0Var;
        nm0Var2.setAdapter(kh0Var);
        this.f41163b.setOnScrollListener(new ai.u0(7, this, a0Var));
        this.f41172h0 = new org.telegram.ui.Components.rl0(this.f41163b, false);
        s4.l lVar = new s4.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        this.f41163b.setItemAnimator(lVar);
        org.telegram.ui.Components.nm0 nm0Var3 = this.f41163b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        nm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f41163b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f41163b.setOnItemClickListener(new di.x4(19, this, context));
        this.f41163b.setOnItemLongClickListener(new xg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f41162a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        k0(true);
        this.f41178n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f41177n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new vg0(this, tL_chatInviteExported, 1));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f41177n)) {
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
        boolean z11 = this.f41167d0;
        long j10 = this.f41177n;
        if (z11 && !this.f41168e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new ug0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f41169f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f41183r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f41174j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f41173i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) ic.a.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f41179o0) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f41177n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new vg0(this, tL_chatInviteExported, 2));
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f41163b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(13, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41163b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23749y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41163b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23541n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41163b, 32, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41163b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23486k7));
        return arrayList;
    }

    public final ch0 h0() {
        ch0 ch0Var = new ch0(this);
        ch0Var.f(ch0Var.f38350i);
        ch0Var.f38347c = this.f41189y;
        ch0Var.d = this.E;
        ch0Var.e = this.H;
        ch0Var.f38348f = this.I;
        ch0Var.f38349g = this.U;
        ch0Var.h = this.V;
        ch0Var.f38346b = this.X;
        ch0Var.f38352k.clear();
        ch0Var.f38352k.addAll(this.f41173i0);
        ch0Var.f38353l.clear();
        ch0Var.f38353l.addAll(this.f41174j0);
        return ch0Var;
    }

    public final void i0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f41179o0 = ChatObject.isPublic(this.f41165c);
        f0(true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(ch0 ch0Var) {
        if (!this.isPaused && this.f41161a != null && this.f41163b != null) {
            k0(false);
            ch0Var.f(ch0Var.f38351j);
            s4.p.c(ch0Var, true).c(this.f41161a);
            AndroidUtilities.updateVisibleRows(this.f41163b);
            return;
        }
        k0(true);
    }

    public final void k0(boolean z10) {
        kh0 kh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f41177n));
        this.f41165c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f41189y = -1;
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
            this.f41182r = -1;
            this.f41188x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f41187w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f41169f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f41182r = i11;
            }
            int i12 = this.X;
            this.f41184s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f41173i0;
            if (!z11) {
                this.f41187w = i13;
                this.X = i12 + 4;
                this.f41188x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f41187w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f41189y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f41188x >= 0 && (!this.W || this.f41167d0 || this.f41183r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f41188x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f41174j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f41188x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f41189y == -1) {
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
            if (!this.f41167d0 && !this.f41183r0 && ((this.W || this.f41164b0) && !z11)) {
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
                    kh0Var = this.f41161a;
                    if (kh0Var == null && z10) {
                        kh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            kh0Var = this.f41161a;
            if (kh0Var == null) {
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogDeleted);
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
        kh0 kh0Var = this.f41161a;
        if (kh0Var != null) {
            kh0Var.l();
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
        org.telegram.ui.Components.o70 o70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f41171g0 = true;
            if (z11 && (o70Var = this.f41176l0) != null && o70Var.f31222l0) {
                o70Var.show();
            }
        }
        this.f41186t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f41186t0.lock();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
