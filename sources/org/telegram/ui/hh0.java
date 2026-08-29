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
public final class hh0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
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
    public boolean S;
    public int T;
    public Drawable U;
    public Drawable V;
    public Drawable W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public gh0 f38912a;
    public boolean f38913a0;
    public org.telegram.ui.Components.jl0 f38914b;
    public final int f38915b0;
    public TLRPC.Chat f38916c;
    public boolean f38917c0;
    public TLRPC.ChatFull d;
    public org.telegram.ui.Components.pk0 f38918d0;
    public TLRPC.TL_chatInviteExported f38919e;
    public final ArrayList f38920e0;
    public final long f38921f;
    public final ArrayList f38922f0;
    public final HashMap f38923g0;
    public final boolean h;
    public org.telegram.ui.Components.n60 f38924h0;
    public final ArrayList f38925i0;
    public long f38926j0;
    public boolean f38927k0;
    public final boolean f38928l0;
    public final wg0 m0;
    public final long f38929n;
    public boolean f38930n0;
    public final xg0 f38931o0;
    public final AnimationNotificationsLocker f38932p0;
    public int f38933r;
    public int f38934s;
    public int v;
    public int f38935w;
    public int f38936x;
    public int f38937y;

    public hh0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f38920e0 = new ArrayList();
        this.f38922f0 = new ArrayList();
        this.f38923g0 = new HashMap();
        this.f38925i0 = new ArrayList();
        this.m0 = new wg0(this);
        boolean z11 = false;
        this.f38930n0 = false;
        this.f38931o0 = new xg0(this);
        this.f38932p0 = new AnimationNotificationsLocker();
        this.f38929n = j10;
        this.f38915b0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f38916c = chat;
        if (ChatObject.isChannel(chat) && !this.f38916c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f38921f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f38921f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f38921f));
        if (this.f38921f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f38928l0 = z11;
    }

    public static void U(org.telegram.ui.hh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hh0.U(org.telegram.ui.hh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.hh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hh0.V(org.telegram.ui.hh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(hh0 hh0Var) {
        if (hh0Var.f38921f == hh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.f38929n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var.f38919e;
            hh0Var.f38919e = null;
            hh0Var.d.exported_invite = null;
            int sendRequest = hh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new rg0(hh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(hh0Var.f38914b);
            hh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, hh0Var.classGuid);
            return;
        }
        hh0Var.e0(hh0Var.f38919e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38929n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new rg0(this, tL_chatInviteExported, 1));
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 24));
        n0 n0Var = new n0(this, context, 14);
        this.fragmentView = n0Var;
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        n0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f38914b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38914b);
        k kVar = new k(1, false, 10);
        this.f38914b.setLayoutManager(kVar);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f38914b;
        gh0 gh0Var = new gh0(this, context);
        this.f38912a = gh0Var;
        jl0Var2.setAdapter(gh0Var);
        this.f38914b.setOnScrollListener(new hh.l(7, this, kVar));
        this.f38918d0 = new org.telegram.ui.Components.pk0(this.f38914b, false);
        f2.l lVar = new f2.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.f38914b.setItemAnimator(lVar);
        org.telegram.ui.Components.jl0 jl0Var3 = this.f38914b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        jl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38914b, i7.f6.c(-1.0f, -1));
        this.f38914b.setOnItemClickListener(new eg.w0(20, this, context));
        this.f38914b.setOnItemLongClickListener(new tg0(this));
        this.U = context.getDrawable(R.drawable.msg_link_1);
        this.V = context.getDrawable(R.drawable.msg_link_2);
        this.W = context.getDrawable(R.drawable.large_income);
        this.U.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f38926j0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.Z;
        long j10 = this.f38929n;
        if (z11 && !this.f38913a0) {
            this.S = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new qg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f38921f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f38930n0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f38922f0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) j7.l1.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) j7.l1.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f38920e0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) j7.l1.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) j7.l1.i(1, arrayList2)).date;
                }
            }
            this.S = true;
            if (this.f38927k0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f38919e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new jh.j7(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f38929n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38929n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new rg0(this, tL_chatInviteExported, 2));
    }

    public final yg0 f0() {
        yg0 yg0Var = new yg0(this);
        yg0Var.f(yg0Var.f44874i);
        yg0Var.f44870c = this.f38937y;
        yg0Var.d = this.A;
        yg0Var.f44871e = this.D;
        yg0Var.f44872f = this.E;
        yg0Var.f44873g = this.Q;
        yg0Var.h = this.R;
        yg0Var.f44869b = this.T;
        yg0Var.f44876k.clear();
        yg0Var.f44876k.addAll(this.f38920e0);
        yg0Var.f44877l.clear();
        yg0Var.f44877l.addAll(this.f38922f0);
        return yg0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f38919e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f38927k0 = ChatObject.isPublic(this.f38916c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 24);
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.e2.class, org.telegram.ui.Components.r80.class, eh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{ah0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23120g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23260o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 32, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23190k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{eh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 0, new Class[]{eh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38914b, 8, new Class[]{eh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0(yg0 yg0Var) {
        if (!this.isPaused && this.f38912a != null && this.f38914b != null) {
            i0(false);
            yg0Var.f(yg0Var.f44875j);
            f2.q.c(yg0Var, true).b(this.f38912a);
            AndroidUtilities.updateVisibleRows(this.f38914b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        gh0 gh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f38929n));
        this.f38916c = chat;
        if (chat != null) {
            this.M = -1;
            this.N = -1;
            this.f38937y = -1;
            this.A = -1;
            this.B = -1;
            this.D = -1;
            this.E = -1;
            this.H = -1;
            this.F = -1;
            this.G = -1;
            this.J = -1;
            this.I = -1;
            this.K = -1;
            this.f38933r = -1;
            this.f38936x = -1;
            this.R = -1;
            this.Q = -1;
            this.P = -1;
            this.O = -1;
            this.L = -1;
            this.f38935w = -1;
            this.C = -1;
            boolean z11 = false;
            this.T = 0;
            if (this.f38921f != getAccountInstance().getUserConfig().clientUserId) {
                z11 = true;
            }
            if (z11) {
                int i10 = this.T;
                this.M = i10;
                this.T = i10 + 2;
                this.N = i10 + 1;
            } else {
                int i11 = this.T;
                this.T = i11 + 1;
                this.f38933r = i11;
            }
            int i12 = this.T;
            this.f38934s = i12;
            int i13 = i12 + 2;
            this.T = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f38920e0;
            if (!z11) {
                this.f38935w = i13;
                this.T = i12 + 4;
                this.f38936x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.T;
                this.f38935w = i14;
                this.T = i14 + 2;
                this.L = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.T;
                this.f38937y = i15;
                int size = arrayList.size() + i15;
                this.T = size;
                this.A = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f38936x >= 0 && (!this.S || this.Z || this.f38930n0)) {
                int i16 = this.T;
                this.T = i16 + 1;
                this.K = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f38925i0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f38936x >= 0) && this.K == -1) {
                        int i17 = this.T;
                        this.T = i17 + 1;
                        this.P = i17;
                    }
                    int i18 = this.T;
                    int i19 = i18 + 1;
                    this.T = i19;
                    this.O = i18;
                    this.Q = i19;
                    int size2 = arrayList2.size() + i19;
                    this.T = size2;
                    this.R = size2;
                }
            }
            ArrayList arrayList3 = this.f38922f0;
            if (!arrayList3.isEmpty()) {
                if (this.Q >= 0) {
                    int i20 = this.T;
                    this.T = i20 + 1;
                    this.F = i20;
                } else if ((!arrayList.isEmpty() || this.f38936x >= 0) && this.K == -1) {
                    int i21 = this.T;
                    this.T = i21 + 1;
                    this.F = i21;
                } else if (z11 && this.f38937y == -1) {
                    int i22 = this.T;
                    this.T = i22 + 1;
                    this.F = i22;
                }
                int i23 = this.T;
                int i24 = i23 + 1;
                this.T = i24;
                this.H = i23;
                this.D = i24;
                int size3 = arrayList3.size() + i24;
                this.E = size3;
                this.I = size3;
                this.T = size3 + 2;
                this.J = size3 + 1;
            }
            if (!this.Z && !this.f38930n0 && ((this.S || this.X) && !z11)) {
                int i25 = this.T;
                this.T = i25 + 1;
                this.B = i25;
            }
            if (!arrayList.isEmpty()) {
                int i26 = this.A;
                int i27 = this.T;
                if (i26 == i27) {
                    this.T = i27 + 1;
                    this.C = i27;
                    gh0Var = this.f38912a;
                    if (gh0Var == null && z10) {
                        gh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.T;
                this.T = i28 + 1;
                this.G = i28;
            }
            gh0Var = this.f38912a;
            if (gh0Var == null) {
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
        gh0 gh0Var = this.f38912a;
        if (gh0Var != null) {
            gh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.n60 n60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f38917c0 = true;
            if (z11 && (n60Var = this.f38924h0) != null && n60Var.f30895h0) {
                n60Var.show();
            }
        }
        this.f38932p0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f38932p0.lock();
    }
}
