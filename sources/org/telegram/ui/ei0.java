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
public final class ei0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public di0 f35584a;
    public Drawable f35585a0;
    public org.telegram.ui.Components.mm0 f35586b;
    public boolean f35587b0;
    public TLRPC.Chat f35588c;
    public boolean f35589c0;
    public TLRPC.ChatFull d;
    public boolean f35590d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f35591e0;
    public final long f35592f;
    public final int f35593f0;
    public boolean f35594g0;
    public final boolean h;
    public org.telegram.ui.Components.rl0 f35595h0;
    public final ArrayList f35596i0;
    public final ArrayList f35597j0;
    public final HashMap f35598k0;
    public org.telegram.ui.Components.p70 f35599l0;
    public final ArrayList m0;
    public final long f35600n;
    public long f35601n0;
    public boolean f35602o0;
    public final boolean f35603p0;
    public final th0 f35604q0;
    public int f35605r;
    public boolean f35606r0;
    public int f35607s;
    public final uh0 f35608s0;
    public final AnimationNotificationsLocker f35609t0;
    public int v;
    public int f35610w;
    public int f35611x;
    public int f35612y;

    public ei0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f35596i0 = new ArrayList();
        this.f35597j0 = new ArrayList();
        this.f35598k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f35604q0 = new th0(this);
        boolean z11 = false;
        this.f35606r0 = false;
        this.f35608s0 = new uh0(this);
        this.f35609t0 = new AnimationNotificationsLocker();
        this.f35600n = j10;
        this.f35593f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f35588c = chat;
        if (ChatObject.isChannel(chat) && !this.f35588c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f35592f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f35592f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35592f));
        if (this.f35592f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f35603p0 = z11;
    }

    public static void U(org.telegram.ui.ei0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei0.U(org.telegram.ui.ei0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.ei0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei0.V(org.telegram.ui.ei0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(ei0 ei0Var) {
        if (ei0Var.f35592f == ei0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = ei0Var.getMessagesController().getInputPeer(-ei0Var.f35600n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = ei0Var.e;
            ei0Var.e = null;
            ei0Var.d.exported_invite = null;
            int sendRequest = ei0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new oh0(ei0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(ei0Var.f35586b);
            ei0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ei0Var.classGuid);
            return;
        }
        ei0Var.e0(ei0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f35600n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new oh0(this, tL_chatInviteExported, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 9));
        l0 l0Var = new l0(this, context, 14);
        this.fragmentView = l0Var;
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35586b = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35586b);
        hg.a0 a0Var = new hg.a0(1, false, 12);
        this.f35586b.setLayoutManager(a0Var);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f35586b;
        di0 di0Var = new di0(this, context);
        this.f35584a = di0Var;
        mm0Var2.setAdapter(di0Var);
        this.f35586b.setOnScrollListener(new ji.n3(6, this, a0Var));
        this.f35595h0 = new org.telegram.ui.Components.rl0(this.f35586b, false);
        s4.k kVar = new s4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.f35586b.setItemAnimator(kVar);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f35586b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f35586b, w7.a6.d(-1.0f, -1));
        this.f35586b.setOnItemClickListener(new bi.z5(19, this, context));
        this.f35586b.setOnItemLongClickListener(new qh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f35585a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f35601n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f35590d0;
        long j10 = this.f35600n;
        if (z11 && !this.f35591e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new nh0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f35592f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f35606r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f35597j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.d.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.d.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f35596i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.d.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.d.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f35602o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.u1(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f35600n)) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f35600n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new oh0(this, tL_chatInviteExported, 2));
    }

    public final vh0 f0() {
        vh0 vh0Var = new vh0(this);
        vh0Var.f(vh0Var.f41006i);
        vh0Var.f41003c = this.f35612y;
        vh0Var.d = this.E;
        vh0Var.e = this.H;
        vh0Var.f41004f = this.I;
        vh0Var.f41005g = this.U;
        vh0Var.h = this.V;
        vh0Var.f41002b = this.X;
        vh0Var.f41008k.clear();
        vh0Var.f41008k.addAll(this.f35596i0);
        vh0Var.f41009l.clear();
        vh0Var.f41009l.addAll(this.f35597j0);
        return vh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f35602o0 = ChatObject.isPublic(this.f35588c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.w90.class, bi0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f20288y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f20084n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{xh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19957g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20216u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20233v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20104o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20029k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{bi0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 0, new Class[]{bi0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35586b, 8, new Class[]{bi0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0(vh0 vh0Var) {
        if (!this.isPaused && this.f35584a != null && this.f35586b != null) {
            i0(false);
            vh0Var.f(vh0Var.f41007j);
            s4.o.c(vh0Var, true).c(this.f35584a);
            AndroidUtilities.updateVisibleRows(this.f35586b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        di0 di0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f35600n));
        this.f35588c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f35612y = -1;
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
            this.f35605r = -1;
            this.f35611x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f35610w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f35592f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f35605r = i11;
            }
            int i12 = this.X;
            this.f35607s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f35596i0;
            if (!z11) {
                this.f35610w = i13;
                this.X = i12 + 4;
                this.f35611x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f35610w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f35612y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f35611x >= 0 && (!this.W || this.f35590d0 || this.f35606r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f35611x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f35597j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f35611x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f35612y == -1) {
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
            if (!this.f35590d0 && !this.f35606r0 && ((this.W || this.f35587b0) && !z11)) {
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
                    di0Var = this.f35584a;
                    if (di0Var == null && z10) {
                        di0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            di0Var = this.f35584a;
            if (di0Var == null) {
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
        di0 di0Var = this.f35584a;
        if (di0Var != null) {
            di0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.p70 p70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f35594g0 = true;
            if (z11 && (p70Var = this.f35599l0) != null && p70Var.f28219l0) {
                p70Var.show();
            }
        }
        this.f35609t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f35609t0.lock();
    }
}
