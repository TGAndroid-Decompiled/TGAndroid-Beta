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
    public gh0 f38791a;
    public boolean f38792a0;
    public org.telegram.ui.Components.wk0 f38793b;
    public final int f38794b0;
    public TLRPC.Chat f38795c;
    public boolean f38796c0;
    public TLRPC.ChatFull d;
    public org.telegram.ui.Components.dk0 f38797d0;
    public TLRPC.TL_chatInviteExported f38798e;
    public final ArrayList f38799e0;
    public final long f38800f;
    public final ArrayList f38801f0;
    public final HashMap f38802g0;
    public final boolean h;
    public org.telegram.ui.Components.a60 f38803h0;
    public final ArrayList f38804i0;
    public long f38805j0;
    public boolean f38806k0;
    public final boolean f38807l0;
    public final wg0 m0;
    public final long f38808n;
    public boolean f38809n0;
    public final xg0 f38810o0;
    public final AnimationNotificationsLocker f38811p0;
    public int f38812r;
    public int f38813s;
    public int v;
    public int f38814w;
    public int f38815x;
    public int f38816y;

    public hh0(long j10, long j11, int i9) {
        super(null);
        boolean z10;
        this.f38799e0 = new ArrayList();
        this.f38801f0 = new ArrayList();
        this.f38802g0 = new HashMap();
        this.f38804i0 = new ArrayList();
        this.m0 = new wg0(this);
        boolean z11 = false;
        this.f38809n0 = false;
        this.f38810o0 = new xg0(this);
        this.f38811p0 = new AnimationNotificationsLocker();
        this.f38808n = j10;
        this.f38794b0 = i9;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f38795c = chat;
        if (ChatObject.isChannel(chat) && !this.f38795c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f38800f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f38800f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f38800f));
        if (this.f38800f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f38807l0 = z11;
    }

    public static void T(org.telegram.ui.hh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hh0.T(org.telegram.ui.hh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void U(org.telegram.ui.hh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hh0.U(org.telegram.ui.hh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void V(hh0 hh0Var) {
        if (hh0Var.f38800f == hh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.f38808n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var.f38798e;
            hh0Var.f38798e = null;
            hh0Var.d.exported_invite = null;
            int sendRequest = hh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new rg0(hh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(hh0Var.f38793b);
            hh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, hh0Var.classGuid);
            return;
        }
        hh0Var.d0(hh0Var.f38798e);
    }

    public final void a0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38808n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new rg0(this, tL_chatInviteExported, 1));
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z10 = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
            return;
        }
        int i9 = tL_chatInviteExported.usage_limit;
        if (i9 > 0) {
            if (tL_chatInviteExported.usage >= i9) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
        }
    }

    public final void c0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.Z;
        long j10 = this.f38808n;
        if (z11 && !this.f38792a0) {
            this.S = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new qg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f38800f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f38809n0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f38801f0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f38799e0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList2)).date;
                }
            }
            this.S = true;
            if (this.f38806k0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f38798e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new gh.m7(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            h0(true);
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 2));
        m0 m0Var = new m0(this, context, 14);
        this.fragmentView = m0Var;
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        m0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f38793b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38793b);
        of.y yVar = new of.y(1, false, 11);
        this.f38793b.setLayoutManager(yVar);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f38793b;
        gh0 gh0Var = new gh0(this, context);
        this.f38791a = gh0Var;
        wk0Var2.setAdapter(gh0Var);
        this.f38793b.setOnScrollListener(new eh.n(7, this, yVar));
        this.f38797d0 = new org.telegram.ui.Components.dk0(this.f38793b, false);
        f2.n nVar = new f2.n();
        nVar.n(420L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.f38793b.setItemAnimator(nVar);
        org.telegram.ui.Components.wk0 wk0Var3 = this.f38793b;
        if (LocaleController.isRTL) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        wk0Var3.setVerticalScrollbarPosition(i9);
        frameLayout.addView(this.f38793b, g7.e6.c(-1.0f, -1));
        this.f38793b.setOnItemClickListener(new bg.b1(21, this, context));
        this.f38793b.setOnItemLongClickListener(new tg0(this));
        this.U = context.getDrawable(R.drawable.msg_link_1);
        this.V = context.getDrawable(R.drawable.msg_link_2);
        this.W = context.getDrawable(R.drawable.large_income);
        this.U.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        h0(true);
        this.f38805j0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38808n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new rg0(this, tL_chatInviteExported, 2));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f38808n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final yg0 e0() {
        yg0 yg0Var = new yg0(this);
        yg0Var.f(yg0Var.f44864i);
        yg0Var.f44860c = this.f38816y;
        yg0Var.d = this.A;
        yg0Var.f44861e = this.D;
        yg0Var.f44862f = this.E;
        yg0Var.f44863g = this.Q;
        yg0Var.h = this.R;
        yg0Var.f44859b = this.T;
        yg0Var.f44866k.clear();
        yg0Var.f44866k.addAll(this.f38799e0);
        yg0Var.f44867l.clear();
        yg0Var.f44867l.addAll(this.f38801f0);
        return yg0Var;
    }

    public final void f0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f38798e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f38806k0 = ChatObject.isPublic(this.f38795c);
        c0(true);
    }

    public final void g0(yg0 yg0Var) {
        if (!this.isPaused && this.f38791a != null && this.f38793b != null) {
            h0(false);
            yg0Var.f(yg0Var.f44865j);
            f2.s.c(yg0Var, true).b(this.f38791a);
            AndroidUtilities.updateVisibleRows(this.f38793b);
            return;
        }
        h0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.e80.class, eh0.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{ah0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23058g9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{eh0.class}, new String[]{"titleView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 0, new Class[]{eh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38793b, 8, new Class[]{eh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Uh));
        return arrayList;
    }

    public final void h0(boolean z10) {
        gh0 gh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f38808n));
        this.f38795c = chat;
        if (chat != null) {
            this.M = -1;
            this.N = -1;
            this.f38816y = -1;
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
            this.f38812r = -1;
            this.f38815x = -1;
            this.R = -1;
            this.Q = -1;
            this.P = -1;
            this.O = -1;
            this.L = -1;
            this.f38814w = -1;
            this.C = -1;
            boolean z11 = false;
            this.T = 0;
            if (this.f38800f != getAccountInstance().getUserConfig().clientUserId) {
                z11 = true;
            }
            if (z11) {
                int i9 = this.T;
                this.M = i9;
                this.T = i9 + 2;
                this.N = i9 + 1;
            } else {
                int i10 = this.T;
                this.T = i10 + 1;
                this.f38812r = i10;
            }
            int i11 = this.T;
            this.f38813s = i11;
            int i12 = i11 + 2;
            this.T = i12;
            this.v = i11 + 1;
            ArrayList arrayList = this.f38799e0;
            if (!z11) {
                this.f38814w = i12;
                this.T = i11 + 4;
                this.f38815x = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.T;
                this.f38814w = i13;
                this.T = i13 + 2;
                this.L = i13 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i14 = this.T;
                this.f38816y = i14;
                int size = arrayList.size() + i14;
                this.T = size;
                this.A = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f38815x >= 0 && (!this.S || this.Z || this.f38809n0)) {
                int i15 = this.T;
                this.T = i15 + 1;
                this.K = i15;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f38804i0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f38815x >= 0) && this.K == -1) {
                        int i16 = this.T;
                        this.T = i16 + 1;
                        this.P = i16;
                    }
                    int i17 = this.T;
                    int i18 = i17 + 1;
                    this.T = i18;
                    this.O = i17;
                    this.Q = i18;
                    int size2 = arrayList2.size() + i18;
                    this.T = size2;
                    this.R = size2;
                }
            }
            ArrayList arrayList3 = this.f38801f0;
            if (!arrayList3.isEmpty()) {
                if (this.Q >= 0) {
                    int i19 = this.T;
                    this.T = i19 + 1;
                    this.F = i19;
                } else if ((!arrayList.isEmpty() || this.f38815x >= 0) && this.K == -1) {
                    int i20 = this.T;
                    this.T = i20 + 1;
                    this.F = i20;
                } else if (z11 && this.f38816y == -1) {
                    int i21 = this.T;
                    this.T = i21 + 1;
                    this.F = i21;
                }
                int i22 = this.T;
                int i23 = i22 + 1;
                this.T = i23;
                this.H = i22;
                this.D = i23;
                int size3 = arrayList3.size() + i23;
                this.E = size3;
                this.I = size3;
                this.T = size3 + 2;
                this.J = size3 + 1;
            }
            if (!this.Z && !this.f38809n0 && ((this.S || this.X) && !z11)) {
                int i24 = this.T;
                this.T = i24 + 1;
                this.B = i24;
            }
            if (!arrayList.isEmpty()) {
                int i25 = this.A;
                int i26 = this.T;
                if (i25 == i26) {
                    this.T = i26 + 1;
                    this.C = i26;
                    gh0Var = this.f38791a;
                    if (gh0Var == null && z10) {
                        gh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i27 = this.T;
                this.T = i27 + 1;
                this.G = i27;
            }
            gh0Var = this.f38791a;
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
        gh0 gh0Var = this.f38791a;
        if (gh0Var != null) {
            gh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.a60 a60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f38796c0 = true;
            if (z11 && (a60Var = this.f38803h0) != null && a60Var.f26687h0) {
                a60Var.show();
            }
        }
        this.f38811p0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f38811p0.lock();
    }
}
