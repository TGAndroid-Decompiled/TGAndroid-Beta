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
public final class qh0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public ph0 f40481a;
    public boolean f40482a0;
    public org.telegram.ui.Components.sl0 f40483b;
    public boolean f40484b0;
    public TLRPC.Chat f40485c;
    public final int f40486c0;
    public TLRPC.ChatFull d;
    public boolean f40487d0;
    public TLRPC.TL_chatInviteExported f40488e;
    public org.telegram.ui.Components.zk0 f40489e0;
    public final long f40490f;
    public final ArrayList f40491f0;
    public final ArrayList f40492g0;
    public final boolean h;
    public final HashMap f40493h0;
    public org.telegram.ui.Components.u60 f40494i0;
    public final ArrayList f40495j0;
    public long f40496k0;
    public boolean f40497l0;
    public final boolean m0;
    public final long f40498n;
    public final fh0 f40499n0;
    public boolean f40500o0;
    public final gh0 f40501p0;
    public final AnimationNotificationsLocker f40502q0;
    public int f40503r;
    public int f40504s;
    public int v;
    public int f40505w;
    public int f40506x;
    public int f40507y;

    public qh0(long j10, long j11, int i10) {
        super(null);
        boolean z4;
        this.f40491f0 = new ArrayList();
        this.f40492g0 = new ArrayList();
        this.f40493h0 = new HashMap();
        this.f40495j0 = new ArrayList();
        this.f40499n0 = new fh0(this);
        boolean z10 = false;
        this.f40500o0 = false;
        this.f40501p0 = new gh0(this);
        this.f40502q0 = new AnimationNotificationsLocker();
        this.f40498n = j10;
        this.f40486c0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f40485c = chat;
        if (ChatObject.isChannel(chat) && !this.f40485c.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h = z4;
        if (j11 == 0) {
            this.f40490f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f40490f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f40490f));
        if (this.f40490f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z10 = true;
        }
        this.m0 = z10;
    }

    public static void U(org.telegram.ui.qh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh0.U(org.telegram.ui.qh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.qh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh0.V(org.telegram.ui.qh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(qh0 qh0Var) {
        if (qh0Var.f40490f == qh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = qh0Var.getMessagesController().getInputPeer(-qh0Var.f40498n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = qh0Var.f40488e;
            qh0Var.f40488e = null;
            qh0Var.d.exported_invite = null;
            int sendRequest = qh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ah0(qh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(qh0Var.f40483b);
            qh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, qh0Var.classGuid);
            return;
        }
        qh0Var.e0(qh0Var.f40488e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f40498n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ah0(this, tL_chatInviteExported, 1));
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
        int i11 = org.telegram.ui.ActionBar.k6.f21607a7;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f40483b = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f40483b);
        k kVar = new k(1, false, 10);
        this.f40483b.setLayoutManager(kVar);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f40483b;
        ph0 ph0Var = new ph0(this, context);
        this.f40481a = ph0Var;
        sl0Var2.setAdapter(ph0Var);
        this.f40483b.setOnScrollListener(new kh.l(7, this, kVar));
        this.f40489e0 = new org.telegram.ui.Components.zk0(this.f40483b, false);
        f2.l lVar = new f2.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.f40483b.setItemAnimator(lVar);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f40483b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        sl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f40483b, k7.c6.c(-1.0f, -1));
        this.f40483b.setOnItemClickListener(new hg.v0(19, this, context));
        this.f40483b.setOnItemLongClickListener(new ch0(this));
        this.V = context.getDrawable(R.drawable.msg_link_1);
        this.W = context.getDrawable(R.drawable.msg_link_2);
        this.X = context.getDrawable(R.drawable.large_income);
        this.V.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f40496k0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z4) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z10 = this.f40482a0;
        long j10 = this.f40498n;
        if (z10 && !this.f40484b0) {
            this.T = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new zg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f40490f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z11 = this.f40500o0;
            if (z11) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f40492g0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) l.d.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) l.d.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f40491f0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) l.d.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) l.d.i(1, arrayList2)).date;
                }
            }
            this.T = true;
            if (this.f40497l0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f40488e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new mh.k7(this, tL_chatInviteExported, z11, 5)), getClassGuid());
        }
        if (z4) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f40498n)) {
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f40498n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ah0(this, tL_chatInviteExported, 2));
    }

    public final hh0 f0() {
        hh0 hh0Var = new hh0(this);
        hh0Var.f(hh0Var.f37386i);
        hh0Var.f37382c = this.f40507y;
        hh0Var.d = this.B;
        hh0Var.f37383e = this.E;
        hh0Var.f37384f = this.F;
        hh0Var.f37385g = this.R;
        hh0Var.h = this.S;
        hh0Var.f37381b = this.U;
        hh0Var.f37388k.clear();
        hh0Var.f37388k.addAll(this.f40491f0);
        hh0Var.f37389l.clear();
        hh0Var.f37389l.addAll(this.f40492g0);
        return hh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f40488e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f40497l0 = ChatObject.isPublic(this.f40485c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 24);
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.y80.class, nh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f22038y6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{jh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21719g9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21963u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21981v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21859o6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21788k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{nh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 0, new Class[]{nh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40483b, 8, new Class[]{nh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Uh));
        return arrayList;
    }

    public final void h0(hh0 hh0Var) {
        if (!this.isPaused && this.f40481a != null && this.f40483b != null) {
            i0(false);
            hh0Var.f(hh0Var.f37387j);
            f2.q.c(hh0Var, true).b(this.f40481a);
            AndroidUtilities.updateVisibleRows(this.f40483b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z4) {
        ph0 ph0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f40498n));
        this.f40485c = chat;
        if (chat != null) {
            this.N = -1;
            this.O = -1;
            this.f40507y = -1;
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
            this.f40503r = -1;
            this.f40506x = -1;
            this.S = -1;
            this.R = -1;
            this.Q = -1;
            this.P = -1;
            this.M = -1;
            this.f40505w = -1;
            this.D = -1;
            boolean z10 = false;
            this.U = 0;
            if (this.f40490f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f40503r = i11;
            }
            int i12 = this.U;
            this.f40504s = i12;
            int i13 = i12 + 2;
            this.U = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f40491f0;
            if (!z10) {
                this.f40505w = i13;
                this.U = i12 + 4;
                this.f40506x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.U;
                this.f40505w = i14;
                this.U = i14 + 2;
                this.M = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.U;
                this.f40507y = i15;
                int size = arrayList.size() + i15;
                this.U = size;
                this.B = size;
            }
            if (!z10 && arrayList.isEmpty() && this.f40506x >= 0 && (!this.T || this.f40482a0 || this.f40500o0)) {
                int i16 = this.U;
                this.U = i16 + 1;
                this.L = i16;
            }
            if (!z10) {
                ArrayList arrayList2 = this.f40495j0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f40506x >= 0) && this.L == -1) {
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
            ArrayList arrayList3 = this.f40492g0;
            if (!arrayList3.isEmpty()) {
                if (this.R >= 0) {
                    int i20 = this.U;
                    this.U = i20 + 1;
                    this.G = i20;
                } else if ((!arrayList.isEmpty() || this.f40506x >= 0) && this.L == -1) {
                    int i21 = this.U;
                    this.U = i21 + 1;
                    this.G = i21;
                } else if (z10 && this.f40507y == -1) {
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
            if (!this.f40482a0 && !this.f40500o0 && ((this.T || this.Y) && !z10)) {
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
                    ph0Var = this.f40481a;
                    if (ph0Var == null && z4) {
                        ph0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.U;
                this.U = i28 + 1;
                this.H = i28;
            }
            ph0Var = this.f40481a;
            if (ph0Var == null) {
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
        ph0 ph0Var = this.f40481a;
        if (ph0Var != null) {
            ph0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.Components.u60 u60Var;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4) {
            this.f40487d0 = true;
            if (z10 && (u60Var = this.f40494i0) != null && u60Var.f31519i0) {
                u60Var.show();
            }
        }
        this.f40502q0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.f40502q0.lock();
    }
}
