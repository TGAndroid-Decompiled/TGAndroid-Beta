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
public final class ih0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public hh0 f37970a;
    public Drawable f37971a0;
    public org.telegram.ui.Components.im0 f37972b;
    public boolean f37973b0;
    public TLRPC.Chat f37974c;
    public boolean f37975c0;
    public TLRPC.ChatFull d;
    public boolean f37976d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f37977e0;
    public final long f37978f;
    public final int f37979f0;
    public boolean f37980g0;
    public final boolean h;
    public org.telegram.ui.Components.nl0 f37981h0;
    public final ArrayList f37982i0;
    public final ArrayList f37983j0;
    public final HashMap f37984k0;
    public org.telegram.ui.Components.l70 f37985l0;
    public final ArrayList m0;
    public final long f37986n;
    public long f37987n0;
    public boolean f37988o0;
    public final boolean f37989p0;
    public final wg0 f37990q0;
    public int f37991r;
    public boolean f37992r0;
    public int f37993s;
    public final yg0 f37994s0;
    public final AnimationNotificationsLocker f37995t0;
    public int v;
    public int f37996w;
    public int f37997x;
    public int f37998y;

    public ih0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f37982i0 = new ArrayList();
        this.f37983j0 = new ArrayList();
        this.f37984k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f37990q0 = new wg0(this);
        boolean z11 = false;
        this.f37992r0 = false;
        this.f37994s0 = new yg0(this);
        this.f37995t0 = new AnimationNotificationsLocker();
        this.f37986n = j10;
        this.f37979f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f37974c = chat;
        if (ChatObject.isChannel(chat) && !this.f37974c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f37978f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f37978f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f37978f));
        if (this.f37978f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f37989p0 = z11;
    }

    public static void U(org.telegram.ui.ih0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ih0.U(org.telegram.ui.ih0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.ih0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ih0.V(org.telegram.ui.ih0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(ih0 ih0Var) {
        if (ih0Var.f37978f == ih0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ih0Var.getMessagesController().getInputPeer(-ih0Var.f37986n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ih0Var.e;
            ih0Var.e = null;
            ih0Var.d.exported_invite = null;
            int sendRequest = ih0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new rg0(ih0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(ih0Var.f37972b);
            ih0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ih0Var.classGuid);
            return;
        }
        ih0Var.e0(ih0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f37986n);
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
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 10));
        m0 m0Var = new m0(this, context, 14);
        this.fragmentView = m0Var;
        int i11 = org.telegram.ui.ActionBar.h6.f20929a7;
        m0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f37972b = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37972b);
        hg.a0 a0Var = new hg.a0(1, false, 12);
        this.f37972b.setLayoutManager(a0Var);
        org.telegram.ui.Components.im0 im0Var2 = this.f37972b;
        hh0 hh0Var = new hh0(this, context);
        this.f37970a = hh0Var;
        im0Var2.setAdapter(hh0Var);
        this.f37972b.setOnScrollListener(new ki.m3(6, this, a0Var));
        this.f37981h0 = new org.telegram.ui.Components.nl0(this.f37972b, false);
        s4.k kVar = new s4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45946m = false;
        this.f37972b.setItemAnimator(kVar);
        org.telegram.ui.Components.im0 im0Var3 = this.f37972b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        im0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f37972b, w7.z5.c(-1.0f, -1));
        this.f37972b.setOnItemClickListener(new ci.y4(19, this, context));
        this.f37972b.setOnItemLongClickListener(new tg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f37971a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f37987n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f37976d0;
        long j10 = this.f37986n;
        if (z11 && !this.f37977e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new qg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f37978f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f37992r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f37983j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.e.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.e.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f37982i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.e.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.e.h(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f37988o0) {
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
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f37986n)) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f37986n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new rg0(this, tL_chatInviteExported, 2));
    }

    public final zg0 f0() {
        zg0 zg0Var = new zg0(this);
        zg0Var.f(zg0Var.f43742i);
        zg0Var.f43739c = this.f37998y;
        zg0Var.d = this.E;
        zg0Var.e = this.H;
        zg0Var.f43740f = this.I;
        zg0Var.f43741g = this.U;
        zg0Var.h = this.V;
        zg0Var.f43738b = this.X;
        zg0Var.f43744k.clear();
        zg0Var.f43744k.addAll(this.f37982i0);
        zg0Var.f43745l.clear();
        zg0Var.f43745l.addAll(this.f37983j0);
        return zg0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f37988o0 = ChatObject.isPublic(this.f37974c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.h6.f20987d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.q90.class, fh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20929a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21266s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21322v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21285t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21076i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21108k0, null, null, org.telegram.ui.ActionBar.h6.f20988d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20949b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21375y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21170n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.h6.f21238r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{bh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21043g9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21303u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21320v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21190o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21115k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{fh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 0, new Class[]{fh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37972b, 8, new Class[]{fh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Uh));
        return arrayList;
    }

    public final void h0(zg0 zg0Var) {
        if (!this.isPaused && this.f37970a != null && this.f37972b != null) {
            i0(false);
            zg0Var.f(zg0Var.f43743j);
            s4.o.c(zg0Var, true).c(this.f37970a);
            AndroidUtilities.updateVisibleRows(this.f37972b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        hh0 hh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f37986n));
        this.f37974c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f37998y = -1;
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
            this.f37991r = -1;
            this.f37997x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f37996w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f37978f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f37991r = i11;
            }
            int i12 = this.X;
            this.f37993s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f37982i0;
            if (!z11) {
                this.f37996w = i13;
                this.X = i12 + 4;
                this.f37997x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f37996w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f37998y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f37997x >= 0 && (!this.W || this.f37976d0 || this.f37992r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f37997x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f37983j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f37997x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f37998y == -1) {
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
            if (!this.f37976d0 && !this.f37992r0 && ((this.W || this.f37973b0) && !z11)) {
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
                    hh0Var = this.f37970a;
                    if (hh0Var == null && z10) {
                        hh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            hh0Var = this.f37970a;
            if (hh0Var == null) {
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
        hh0 hh0Var = this.f37970a;
        if (hh0Var != null) {
            hh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.l70 l70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f37980g0 = true;
            if (z11 && (l70Var = this.f37985l0) != null && l70Var.f28136l0) {
                l70Var.show();
            }
        }
        this.f37995t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f37995t0.lock();
    }
}
