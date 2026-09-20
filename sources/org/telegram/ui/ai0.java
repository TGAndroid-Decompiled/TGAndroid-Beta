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
public final class ai0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public zh0 f32071a;
    public Drawable f32072a0;
    public org.telegram.ui.Components.vl0 f32073b;
    public boolean f32074b0;
    public TLRPC.Chat f32075c;
    public boolean f32076c0;
    public TLRPC.ChatFull d;
    public boolean f32077d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f32078e0;
    public final long f32079f;
    public final int f32080f0;
    public boolean f32081g0;
    public final boolean h;
    public org.telegram.ui.Components.al0 f32082h0;
    public final ArrayList f32083i0;
    public final ArrayList f32084j0;
    public final HashMap f32085k0;
    public org.telegram.ui.Components.z60 f32086l0;
    public final ArrayList m0;
    public final long f32087n;
    public long f32088n0;
    public boolean f32089o0;
    public final boolean f32090p0;
    public final ph0 f32091q0;
    public int f32092r;
    public boolean f32093r0;
    public int f32094s;
    public final qh0 f32095s0;
    public final AnimationNotificationsLocker f32096t0;
    public int v;
    public int f32097w;
    public int f32098x;
    public int f32099y;

    public ai0(long j3, long j10, int i10) {
        super(null);
        boolean z10;
        this.f32083i0 = new ArrayList();
        this.f32084j0 = new ArrayList();
        this.f32085k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f32091q0 = new ph0(this);
        boolean z11 = false;
        this.f32093r0 = false;
        this.f32095s0 = new qh0(this);
        this.f32096t0 = new AnimationNotificationsLocker();
        this.f32087n = j3;
        this.f32080f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.f32075c = chat;
        if (ChatObject.isChannel(chat) && !this.f32075c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f32079f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f32079f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32079f));
        if (this.f32079f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f32090p0 = z11;
    }

    public static void U(org.telegram.ui.ai0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ai0.U(org.telegram.ui.ai0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.ai0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ai0.V(org.telegram.ui.ai0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(ai0 ai0Var) {
        if (ai0Var.f32079f == ai0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ai0Var.getMessagesController().getInputPeer(-ai0Var.f32087n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ai0Var.e;
            ai0Var.e = null;
            ai0Var.d.exported_invite = null;
            int sendRequest = ai0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new kh0(ai0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(ai0Var.f32073b);
            ai0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ai0Var.classGuid);
            return;
        }
        ai0Var.e0(ai0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f32087n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new kh0(this, tL_chatInviteExported, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 7));
        j0 j0Var = new j0(this, context, 13);
        this.fragmentView = j0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f19038a7;
        j0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f32073b = vl0Var;
        vl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f32073b);
        gg.b0 b0Var = new gg.b0(1, false, 12);
        this.f32073b.setLayoutManager(b0Var);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f32073b;
        zh0 zh0Var = new zh0(this, context);
        this.f32071a = zh0Var;
        vl0Var2.setAdapter(zh0Var);
        this.f32073b.setOnScrollListener(new ii.m3(6, this, b0Var));
        this.f32082h0 = new org.telegram.ui.Components.al0(this.f32073b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.f43009m = false;
        this.f32073b.setItemAnimator(jVar);
        org.telegram.ui.Components.vl0 vl0Var3 = this.f32073b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        vl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f32073b, w7.y5.c(-1.0f, -1));
        this.f32073b.setOnItemClickListener(new ai.o6(19, this, context));
        this.f32073b.setOnItemLongClickListener(new mh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f32072a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f32088n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f32077d0;
        long j3 = this.f32087n;
        if (z11 && !this.f32078e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new jh0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f32079f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.f32093r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f32084j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f32083i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f32089o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ci.v1(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f32087n)) {
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var != null && d5Var.getLastFragment() == this) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f32087n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new kh0(this, tL_chatInviteExported, 2));
    }

    public final rh0 f0() {
        rh0 rh0Var = new rh0(this);
        rh0Var.f(rh0Var.f37163i);
        rh0Var.f37160c = this.f32099y;
        rh0Var.d = this.E;
        rh0Var.e = this.H;
        rh0Var.f37161f = this.I;
        rh0Var.f37162g = this.U;
        rh0Var.h = this.V;
        rh0Var.f37159b = this.X;
        rh0Var.f37165k.clear();
        rh0Var.f37165k.addAll(this.f32083i0);
        rh0Var.f37166l.clear();
        rh0Var.f37166l.addAll(this.f32084j0);
        return rh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f32089o0 = ChatObject.isPublic(this.f32075c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.j6.f19094d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.d90.class, xh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19372s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19058b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f19477y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f19279n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, null, org.telegram.ui.ActionBar.j6.f19345r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{th0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19151g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19407u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19425v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19296o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19223k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{xh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 0, new Class[]{xh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32073b, 8, new Class[]{xh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0(rh0 rh0Var) {
        if (!this.isPaused && this.f32071a != null && this.f32073b != null) {
            i0(false);
            rh0Var.f(rh0Var.f37164j);
            s4.o.c(rh0Var, true).b(this.f32071a);
            AndroidUtilities.updateVisibleRows(this.f32073b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        zh0 zh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f32087n));
        this.f32075c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f32099y = -1;
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
            this.f32092r = -1;
            this.f32098x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f32097w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f32079f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f32092r = i11;
            }
            int i12 = this.X;
            this.f32094s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f32083i0;
            if (!z11) {
                this.f32097w = i13;
                this.X = i12 + 4;
                this.f32098x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f32097w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f32099y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f32098x >= 0 && (!this.W || this.f32077d0 || this.f32093r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f32098x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f32084j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f32098x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f32099y == -1) {
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
            if (!this.f32077d0 && !this.f32093r0 && ((this.W || this.f32074b0) && !z11)) {
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
                    zh0Var = this.f32071a;
                    if (zh0Var == null && z10) {
                        zh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            zh0Var = this.f32071a;
            if (zh0Var == null) {
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
        zh0 zh0Var = this.f32071a;
        if (zh0Var != null) {
            zh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.z60 z60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f32081g0 = true;
            if (z11 && (z60Var = this.f32086l0) != null && z60Var.f30760l0) {
                z60Var.show();
            }
        }
        this.f32096t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f32096t0.lock();
    }
}
