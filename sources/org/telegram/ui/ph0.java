package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
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
    public boolean T;
    public int U;
    public Drawable V;
    public Drawable W;
    public Drawable X;
    public boolean Y;
    public boolean Z;
    public oh0 f37317a;
    public boolean f37318a0;
    public org.telegram.ui.Components.sl0 f37319b;
    public boolean f37320b0;
    public TLRPC.Chat f37321c;
    public final int f37322c0;
    public TLRPC.ChatFull d;
    public boolean f37323d0;
    public TLRPC.TL_chatInviteExported e;
    public org.telegram.ui.Components.zk0 f37324e0;
    public final long f37325f;
    public final ArrayList f37326f0;
    public final ArrayList f37327g0;
    public final boolean h;
    public final HashMap f37328h0;
    public org.telegram.ui.Components.s60 f37329i0;
    public final ArrayList f37330j0;
    public long f37331k0;
    public boolean f37332l0;
    public final boolean m0;
    public final long f37333n;
    public final eh0 f37334n0;
    public boolean f37335o0;
    public final fh0 f37336p0;
    public final AnimationNotificationsLocker f37337q0;
    public int f37338r;
    public int f37339s;
    public int v;
    public int f37340w;
    public int f37341x;
    public int f37342y;

    public ph0(long j10, long j11, int i10) {
        super(null);
        boolean z4;
        this.f37326f0 = new ArrayList();
        this.f37327g0 = new ArrayList();
        this.f37328h0 = new HashMap();
        this.f37330j0 = new ArrayList();
        this.f37334n0 = new eh0(this);
        boolean z10 = false;
        this.f37335o0 = false;
        this.f37336p0 = new fh0(this);
        this.f37337q0 = new AnimationNotificationsLocker();
        this.f37333n = j10;
        this.f37322c0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f37321c = chat;
        if (ChatObject.isChannel(chat) && !this.f37321c.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h = z4;
        if (j11 == 0) {
            this.f37325f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f37325f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f37325f));
        if (this.f37325f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z10 = true;
        }
        this.m0 = z10;
    }

    public static void U(org.telegram.ui.ph0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph0.U(org.telegram.ui.ph0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.ph0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph0.V(org.telegram.ui.ph0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(ph0 ph0Var) {
        if (ph0Var.f37325f == ph0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ph0Var.getMessagesController().getInputPeer(-ph0Var.f37333n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var.e;
            ph0Var.e = null;
            ph0Var.d.exported_invite = null;
            int sendRequest = ph0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new zg0(ph0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(ph0Var.f37319b);
            ph0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ph0Var.classGuid);
            return;
        }
        ph0Var.e0(ph0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f37333n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new zg0(this, tL_chatInviteExported, 1));
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z4 = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z4 = true;
            }
            tL_chatInviteExported.expired = z4;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            if (tL_chatInviteExported.usage >= i10) {
                z4 = true;
            }
            tL_chatInviteExported.expired = z4;
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 24));
        l0 l0Var = new l0(this, context, 14);
        this.fragmentView = l0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f37319b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37319b);
        k kVar = new k(1, false, 10);
        this.f37319b.setLayoutManager(kVar);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f37319b;
        oh0 oh0Var = new oh0(this, context);
        this.f37317a = oh0Var;
        sl0Var2.setAdapter(oh0Var);
        this.f37319b.setOnScrollListener(new jh.l(7, this, kVar));
        this.f37324e0 = new org.telegram.ui.Components.zk0(this.f37319b, false);
        f2.l lVar = new f2.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.f5818m = false;
        this.f37319b.setItemAnimator(lVar);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f37319b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        sl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f37319b, k7.b6.c(-1.0f, -1));
        this.f37319b.setOnItemClickListener(new gg.v0(20, this, context));
        this.f37319b.setOnItemLongClickListener(new bh0(this));
        this.V = context.getDrawable(R.drawable.msg_link_1);
        this.W = context.getDrawable(R.drawable.msg_link_2);
        this.X = context.getDrawable(R.drawable.large_income);
        this.V.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f37331k0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z4) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z10 = this.f37318a0;
        long j10 = this.f37333n;
        if (z10 && !this.f37320b0) {
            this.T = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new yg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f37325f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z11 = this.f37335o0;
            if (z11) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f37327g0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f37326f0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList2)).date;
                }
            }
            this.T = true;
            if (this.f37332l0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new lh.k7(this, tL_chatInviteExported, z11, 5)), getClassGuid());
        }
        if (z4) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f37333n)) {
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var != null && e5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f37333n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new zg0(this, tL_chatInviteExported, 2));
    }

    public final gh0 f0() {
        gh0 gh0Var = new gh0(this);
        gh0Var.f(gh0Var.f34625i);
        gh0Var.f34622c = this.f37342y;
        gh0Var.d = this.B;
        gh0Var.e = this.E;
        gh0Var.f34623f = this.F;
        gh0Var.f34624g = this.R;
        gh0Var.h = this.S;
        gh0Var.f34621b = this.U;
        gh0Var.f34627k.clear();
        gh0Var.f34627k.addAll(this.f37326f0);
        gh0Var.f34628l.clear();
        gh0Var.f34628l.addAll(this.f37327g0);
        return gh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f37332l0 = ChatObject.isPublic(this.f37321c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 24);
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.x80.class, mh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20281y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{ih0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19963g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20207u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20225v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20103o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20032k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{mh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 0, new Class[]{mh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37319b, 8, new Class[]{mh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0(gh0 gh0Var) {
        if (!this.isPaused && this.f37317a != null && this.f37319b != null) {
            i0(false);
            gh0Var.f(gh0Var.f34626j);
            f2.q.c(gh0Var, true).b(this.f37317a);
            AndroidUtilities.updateVisibleRows(this.f37319b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z4) {
        oh0 oh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f37333n));
        this.f37321c = chat;
        if (chat != null) {
            this.N = -1;
            this.O = -1;
            this.f37342y = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.F = -1;
            this.I = -1;
            this.G = -1;
            this.H = -1;
            this.K = -1;
            this.J = -1;
            this.L = -1;
            this.f37338r = -1;
            this.f37341x = -1;
            this.S = -1;
            this.R = -1;
            this.Q = -1;
            this.P = -1;
            this.M = -1;
            this.f37340w = -1;
            this.D = -1;
            boolean z10 = false;
            this.U = 0;
            if (this.f37325f != getAccountInstance().getUserConfig().clientUserId) {
                z10 = true;
            }
            if (z10) {
                int i10 = this.U;
                this.N = i10;
                this.U = i10 + 2;
                this.O = i10 + 1;
            } else {
                int i11 = this.U;
                this.U = i11 + 1;
                this.f37338r = i11;
            }
            int i12 = this.U;
            this.f37339s = i12;
            int i13 = i12 + 2;
            this.U = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f37326f0;
            if (!z10) {
                this.f37340w = i13;
                this.U = i12 + 4;
                this.f37341x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.U;
                this.f37340w = i14;
                this.U = i14 + 2;
                this.M = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.U;
                this.f37342y = i15;
                int size = arrayList.size() + i15;
                this.U = size;
                this.B = size;
            }
            if (!z10 && arrayList.isEmpty() && this.f37341x >= 0 && (!this.T || this.f37318a0 || this.f37335o0)) {
                int i16 = this.U;
                this.U = i16 + 1;
                this.L = i16;
            }
            if (!z10) {
                ArrayList arrayList2 = this.f37330j0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f37341x >= 0) && this.L == -1) {
                        int i17 = this.U;
                        this.U = i17 + 1;
                        this.Q = i17;
                    }
                    int i18 = this.U;
                    int i19 = i18 + 1;
                    this.U = i19;
                    this.P = i18;
                    this.R = i19;
                    int size2 = arrayList2.size() + i19;
                    this.U = size2;
                    this.S = size2;
                }
            }
            ArrayList arrayList3 = this.f37327g0;
            if (!arrayList3.isEmpty()) {
                if (this.R >= 0) {
                    int i20 = this.U;
                    this.U = i20 + 1;
                    this.G = i20;
                } else if ((!arrayList.isEmpty() || this.f37341x >= 0) && this.L == -1) {
                    int i21 = this.U;
                    this.U = i21 + 1;
                    this.G = i21;
                } else if (z10 && this.f37342y == -1) {
                    int i22 = this.U;
                    this.U = i22 + 1;
                    this.G = i22;
                }
                int i23 = this.U;
                int i24 = i23 + 1;
                this.U = i24;
                this.I = i23;
                this.E = i24;
                int size3 = arrayList3.size() + i24;
                this.F = size3;
                this.J = size3;
                this.U = size3 + 2;
                this.K = size3 + 1;
            }
            if (!this.f37318a0 && !this.f37335o0 && ((this.T || this.Y) && !z10)) {
                int i25 = this.U;
                this.U = i25 + 1;
                this.C = i25;
            }
            if (!arrayList.isEmpty()) {
                int i26 = this.B;
                int i27 = this.U;
                if (i26 == i27) {
                    this.U = i27 + 1;
                    this.D = i27;
                    oh0Var = this.f37317a;
                    if (oh0Var == null && z4) {
                        oh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.U;
                this.U = i28 + 1;
                this.H = i28;
            }
            oh0Var = this.f37317a;
            if (oh0Var == null) {
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
        oh0 oh0Var = this.f37317a;
        if (oh0Var != null) {
            oh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.Components.s60 s60Var;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4) {
            this.f37323d0 = true;
            if (z10 && (s60Var = this.f37329i0) != null && s60Var.f28648i0) {
                s60Var.show();
            }
        }
        this.f37337q0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.f37337q0.lock();
    }
}
