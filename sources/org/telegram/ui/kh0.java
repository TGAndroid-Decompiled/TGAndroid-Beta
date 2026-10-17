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
public final class kh0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public jh0 f38526a;
    public Drawable f38527a0;
    public org.telegram.ui.Components.im0 f38528b;
    public boolean f38529b0;
    public TLRPC.Chat f38530c;
    public boolean f38531c0;
    public TLRPC.ChatFull d;
    public boolean f38532d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f38533e0;
    public final long f38534f;
    public final int f38535f0;
    public boolean f38536g0;
    public final boolean h;
    public org.telegram.ui.Components.nl0 f38537h0;
    public final ArrayList f38538i0;
    public final ArrayList f38539j0;
    public final HashMap f38540k0;
    public org.telegram.ui.Components.l70 f38541l0;
    public final ArrayList m0;
    public final long f38542n;
    public long f38543n0;
    public boolean f38544o0;
    public final boolean f38545p0;
    public final yg0 f38546q0;
    public int f38547r;
    public boolean f38548r0;
    public int f38549s;
    public final ah0 f38550s0;
    public final AnimationNotificationsLocker f38551t0;
    public int v;
    public int f38552w;
    public int f38553x;
    public int f38554y;

    public kh0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f38538i0 = new ArrayList();
        this.f38539j0 = new ArrayList();
        this.f38540k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f38546q0 = new yg0(this);
        boolean z11 = false;
        this.f38548r0 = false;
        this.f38550s0 = new ah0(this);
        this.f38551t0 = new AnimationNotificationsLocker();
        this.f38542n = j10;
        this.f38535f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f38530c = chat;
        if (ChatObject.isChannel(chat) && !this.f38530c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f38534f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f38534f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f38534f));
        if (this.f38534f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f38545p0 = z11;
    }

    public static void U(org.telegram.ui.kh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kh0.U(org.telegram.ui.kh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.kh0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kh0.V(org.telegram.ui.kh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(kh0 kh0Var) {
        if (kh0Var.f38534f == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.f38542n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = kh0Var.e;
            kh0Var.e = null;
            kh0Var.d.exported_invite = null;
            int sendRequest = kh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new tg0(kh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(kh0Var.f38528b);
            kh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, kh0Var.classGuid);
            return;
        }
        kh0Var.e0(kh0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38542n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new tg0(this, tL_chatInviteExported, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 10));
        m0 m0Var = new m0(this, context, 14);
        this.fragmentView = m0Var;
        int i11 = org.telegram.ui.ActionBar.h6.f20928a7;
        m0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f38528b = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38528b);
        hg.a0 a0Var = new hg.a0(1, false, 12);
        this.f38528b.setLayoutManager(a0Var);
        org.telegram.ui.Components.im0 im0Var2 = this.f38528b;
        jh0 jh0Var = new jh0(this, context);
        this.f38526a = jh0Var;
        im0Var2.setAdapter(jh0Var);
        this.f38528b.setOnScrollListener(new ki.m3(6, this, a0Var));
        this.f38537h0 = new org.telegram.ui.Components.nl0(this.f38528b, false);
        s4.k kVar = new s4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45972m = false;
        this.f38528b.setItemAnimator(kVar);
        org.telegram.ui.Components.im0 im0Var3 = this.f38528b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        im0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38528b, w7.z5.d(-1.0f, -1));
        this.f38528b.setOnItemClickListener(new ci.y4(19, this, context));
        this.f38528b.setOnItemLongClickListener(new vg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f38527a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f38543n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f38532d0;
        long j10 = this.f38542n;
        if (z11 && !this.f38533e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new sg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f38534f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f38548r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f38539j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f38538i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.h(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f38544o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ai.w9(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f38542n)) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38542n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new tg0(this, tL_chatInviteExported, 2));
    }

    public final bh0 f0() {
        bh0 bh0Var = new bh0(this);
        bh0Var.f(bh0Var.f35682i);
        bh0Var.f35679c = this.f38554y;
        bh0Var.d = this.E;
        bh0Var.e = this.H;
        bh0Var.f35680f = this.I;
        bh0Var.f35681g = this.U;
        bh0Var.h = this.V;
        bh0Var.f35678b = this.X;
        bh0Var.f35684k.clear();
        bh0Var.f35684k.addAll(this.f38538i0);
        bh0Var.f35685l.clear();
        bh0Var.f35685l.addAll(this.f38539j0);
        return bh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f38544o0 = ChatObject.isPublic(this.f38530c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.q90.class, hh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21075i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20948b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21374y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21169n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.h6.f21237r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{dh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21042g9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21302u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21319v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21189o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21114k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{hh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 0, new Class[]{hh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38528b, 8, new Class[]{hh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Uh));
        return arrayList;
    }

    public final void h0(bh0 bh0Var) {
        if (!this.isPaused && this.f38526a != null && this.f38528b != null) {
            i0(false);
            bh0Var.f(bh0Var.f35683j);
            s4.o.c(bh0Var, true).c(this.f38526a);
            AndroidUtilities.updateVisibleRows(this.f38528b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        jh0 jh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f38542n));
        this.f38530c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f38554y = -1;
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
            this.f38547r = -1;
            this.f38553x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f38552w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f38534f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f38547r = i11;
            }
            int i12 = this.X;
            this.f38549s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f38538i0;
            if (!z11) {
                this.f38552w = i13;
                this.X = i12 + 4;
                this.f38553x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f38552w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f38554y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f38553x >= 0 && (!this.W || this.f38532d0 || this.f38548r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f38553x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f38539j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f38553x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f38554y == -1) {
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
            if (!this.f38532d0 && !this.f38548r0 && ((this.W || this.f38529b0) && !z11)) {
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
                    jh0Var = this.f38526a;
                    if (jh0Var == null && z10) {
                        jh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            jh0Var = this.f38526a;
            if (jh0Var == null) {
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
        jh0 jh0Var = this.f38526a;
        if (jh0Var != null) {
            jh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.l70 l70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f38536g0 = true;
            if (z11 && (l70Var = this.f38541l0) != null && l70Var.f28130l0) {
                l70Var.show();
            }
        }
        this.f38551t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f38551t0.lock();
    }
}
