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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class kh0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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

    public jh0 f39736a;

    public boolean f39737a0;

    public org.telegram.ui.Components.zk0 f39738b;

    public final int f39739b0;

    public TLRPC.Chat f39740c;

    public boolean f39741c0;
    public TLRPC.ChatFull d;

    public org.telegram.ui.Components.gk0 f39742d0;

    public TLRPC.TL_chatInviteExported f39743e;

    public final ArrayList f39744e0;

    public final long f39745f;

    public final ArrayList f39746f0;

    public final HashMap f39747g0;
    public final boolean h;

    public org.telegram.ui.Components.f60 f39748h0;

    public final ArrayList f39749i0;

    public long f39750j0;

    public boolean f39751k0;

    public final boolean f39752l0;
    public final zg0 m0;

    public final long f39753n;

    public boolean f39754n0;

    public final ah0 f39755o0;

    public final AnimationNotificationsLocker f39756p0;

    public int f39757r;

    public int f39758s;
    public int v;

    public int f39759w;

    public int f39760x;

    public int f39761y;

    public kh0(long j10, long j11, int i10) {
        super(null);
        this.f39744e0 = new ArrayList();
        this.f39746f0 = new ArrayList();
        this.f39747g0 = new HashMap();
        this.f39749i0 = new ArrayList();
        this.m0 = new zg0(this);
        boolean z10 = false;
        this.f39754n0 = false;
        this.f39755o0 = new ah0(this);
        this.f39756p0 = new AnimationNotificationsLocker();
        this.f39753n = j10;
        this.f39739b0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f39740c = chat;
        this.h = ChatObject.isChannel(chat) && !this.f39740c.megagroup;
        if (j11 == 0) {
            this.f39745f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f39745f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f39745f));
        if (this.f39745f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z10 = true;
        }
        this.f39752l0 = z10;
    }

    public static void U(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j10 = kh0Var.f39745f;
        ArrayList arrayList = kh0Var.f39746f0;
        ArrayList arrayList2 = kh0Var.f39744e0;
        bh0 bh0VarF0 = kh0Var.f0();
        kh0Var.S = false;
        kh0Var.X = false;
        if (tL_chatInviteExported != null) {
            kh0Var.f39743e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = kh0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    kh0Var.c0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j10 != kh0Var.getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    kh0Var.f39743e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11);
                    kh0Var.c0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i12 = 0; i12 < tL_messages_exportedChatInvites.users.size(); i12++) {
                kh0Var.f39747g0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i12).f22527id), tL_messages_exportedChatInvites.users.get(i12));
            }
            int i13 = kh0Var.T;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                kh0Var.X = false;
            } else if (z10) {
                kh0Var.X = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                kh0Var.X = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !kh0Var.f39741c0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.gk0 gk0Var = kh0Var.f39742d0;
                if (gk0Var != null && !kh0Var.isPaused) {
                    gk0Var.b(i13 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = kh0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                kh0Var.getMessagesStorage().saveChatLinksCount(kh0Var.f39753n, kh0Var.d.invitesCount);
            }
        } else {
            kh0Var.X = false;
            z11 = false;
        }
        if (kh0Var.X || kh0Var.f39754n0 || j10 != kh0Var.getAccountInstance().getUserConfig().clientUserId) {
            if (kh0Var.X || kh0Var.f39754n0) {
                z12 = false;
            } else {
                kh0Var.X = true;
                kh0Var.f39754n0 = true;
            }
            if (kh0Var.X) {
                kh0Var.resumeDelayedFragmentAnimation();
            } else if (kh0Var.f39749i0.size() + arrayList.size() + arrayList2.size() >= 5) {
                kh0Var.resumeDelayedFragmentAnimation();
            }
            if (z12) {
                kh0Var.d0(false);
            }
            if (!z11 && kh0Var.f39736a != null && kh0Var.f39738b.getChildCount() > 0) {
                kh0Var.h0(bh0VarF0);
                return;
            }
            kh0Var.i0(true);
        }
        kh0Var.X = true;
        kh0Var.Z = true;
        z12 = true;
        if (kh0Var.X) {
            kh0Var.resumeDelayedFragmentAnimation();
        } else if (kh0Var.f39749i0.size() + arrayList.size() + arrayList2.size() >= 5) {
            kh0Var.resumeDelayedFragmentAnimation();
        }
        if (z12) {
            kh0Var.d0(false);
        }
        if (!z11) {
        }
        kh0Var.i0(true);
    }

    public static void V(kh0 kh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.gk0 gk0Var;
        ArrayList arrayList = kh0Var.f39749i0;
        kh0Var.S = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.admins.size(); i10++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i10);
                if (tL_chatAdminWithInvites.admin_id != kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i11 = 0; i11 < tL_messages_chatAdminsWithInvites.users.size(); i11++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i11);
                kh0Var.f39747g0.put(Long.valueOf(user.f22527id), user);
            }
        }
        int i12 = kh0Var.T;
        kh0Var.f39737a0 = true;
        kh0Var.X = false;
        if (arrayList.size() > 0 && (gk0Var = kh0Var.f39742d0) != null && !kh0Var.isPaused && kh0Var.f39741c0) {
            gk0Var.b(i12 + 1);
        }
        if (!kh0Var.X) {
            kh0Var.resumeDelayedFragmentAnimation();
        } else if (arrayList.size() + kh0Var.f39746f0.size() + kh0Var.f39744e0.size() >= 5) {
            kh0Var.resumeDelayedFragmentAnimation();
        }
        if (!kh0Var.X && !kh0Var.f39754n0) {
            kh0Var.X = true;
            kh0Var.f39754n0 = true;
            kh0Var.d0(false);
        }
        kh0Var.i0(true);
    }

    public static void W(kh0 kh0Var) {
        if (kh0Var.f39745f != kh0Var.getAccountInstance().getUserConfig().clientUserId) {
            kh0Var.e0(kh0Var.f39743e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.f39753n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = kh0Var.f39743e;
        kh0Var.f39743e = null;
        kh0Var.d.exported_invite = null;
        int iSendRequest = kh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ug0(kh0Var, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(kh0Var.f39738b);
        kh0Var.getConnectionsManager().bindRequestToGuid(iSendRequest, kh0Var.classGuid);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39753n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ug0(this, tL_chatInviteExported, 1));
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i10;
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 3));
        n0 n0Var = new n0(this, context, 14);
        this.fragmentView = n0Var;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        n0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f39738b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39738b);
        j jVar = new j(1, false, 10);
        this.f39738b.setLayoutManager(jVar);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f39738b;
        jh0 jh0Var = new jh0(this, context);
        this.f39736a = jh0Var;
        zk0Var2.setAdapter(jh0Var);
        this.f39738b.setOnScrollListener(new fh.l(7, this, jVar));
        this.f39742d0 = new org.telegram.ui.Components.gk0(this.f39738b, false);
        f2.l lVar = new f2.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.f39738b.setItemAnimator(lVar);
        this.f39738b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.f39738b, h7.z5.c(-1.0f, -1));
        this.f39738b.setOnItemClickListener(new cg.x0(21, this, context));
        this.f39738b.setOnItemLongClickListener(new wg0(this));
        this.U = context.getDrawable(R.drawable.msg_link_1);
        this.V = context.getDrawable(R.drawable.msg_link_2);
        this.W = context.getDrawable(R.drawable.large_income);
        this.U.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f39750j0 = ((long) getConnectionsManager().getCurrentTime()) - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        boolean z11 = this.Z;
        long j10 = this.f39753n;
        if (!z11 || this.f39737a0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f39745f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f39754n0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f39746f0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f39744e0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList2)).date;
                }
            }
            this.S = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new hh.l7(this, this.f39751k0 ? null : this.f39743e, z12, 6)), getClassGuid());
        } else {
            this.S = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new tg0(this, 0)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f39753n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39753n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ug0(this, tL_chatInviteExported, 2));
    }

    public final bh0 f0() {
        bh0 bh0Var = new bh0(this);
        bh0Var.f(bh0Var.f36828i);
        bh0Var.f36824c = this.f39761y;
        bh0Var.d = this.A;
        bh0Var.f36825e = this.D;
        bh0Var.f36826f = this.E;
        bh0Var.f36827g = this.Q;
        bh0Var.h = this.R;
        bh0Var.f36823b = this.T;
        bh0Var.f36830k.clear();
        bh0Var.f36830k.addAll(this.f39744e0);
        bh0Var.f36831l.clear();
        bh0Var.f36831l.addAll(this.f39746f0);
        return bh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f39743e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f39751k0 = ChatObject.isPublic(this.f39740c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.e2.class, org.telegram.ui.Components.i80.class, hh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{dh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23111g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23251o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 32, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{hh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 0, new Class[]{hh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39738b, 8, new Class[]{hh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0(bh0 bh0Var) {
        if (this.isPaused || this.f39736a == null || this.f39738b == null) {
            i0(true);
            return;
        }
        i0(false);
        bh0Var.f(bh0Var.f36829j);
        f2.q.c(bh0Var, true).b(this.f39736a);
        AndroidUtilities.updateVisibleRows(this.f39738b);
    }

    public final void i0(boolean z10) {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f39753n));
        this.f39740c = chat;
        if (chat == null) {
            return;
        }
        this.M = -1;
        this.N = -1;
        this.f39761y = -1;
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
        this.f39757r = -1;
        this.f39760x = -1;
        this.R = -1;
        this.Q = -1;
        this.P = -1;
        this.O = -1;
        this.L = -1;
        this.f39759w = -1;
        this.C = -1;
        this.T = 0;
        boolean z11 = this.f39745f != getAccountInstance().getUserConfig().clientUserId;
        if (z11) {
            int i10 = this.T;
            this.M = i10;
            this.T = i10 + 2;
            this.N = i10 + 1;
        } else {
            int i11 = this.T;
            this.T = i11 + 1;
            this.f39757r = i11;
        }
        int i12 = this.T;
        this.f39758s = i12;
        int i13 = i12 + 2;
        this.T = i13;
        this.v = i12 + 1;
        ArrayList arrayList = this.f39744e0;
        if (!z11) {
            this.f39759w = i13;
            this.T = i12 + 4;
            this.f39760x = i12 + 3;
        } else if (!arrayList.isEmpty()) {
            int i14 = this.T;
            this.f39759w = i14;
            this.T = i14 + 2;
            this.L = i14 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.T;
            this.f39761y = i15;
            int size = arrayList.size() + i15;
            this.T = size;
            this.A = size;
        }
        if (!z11 && arrayList.isEmpty() && this.f39760x >= 0 && (!this.S || this.Z || this.f39754n0)) {
            int i16 = this.T;
            this.T = i16 + 1;
            this.K = i16;
        }
        if (!z11) {
            ArrayList arrayList2 = this.f39749i0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.f39760x >= 0) && this.K == -1) {
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
        ArrayList arrayList3 = this.f39746f0;
        if (!arrayList3.isEmpty()) {
            if (this.Q >= 0) {
                int i20 = this.T;
                this.T = i20 + 1;
                this.F = i20;
            } else if ((!arrayList.isEmpty() || this.f39760x >= 0) && this.K == -1) {
                int i21 = this.T;
                this.T = i21 + 1;
                this.F = i21;
            } else if (z11 && this.f39761y == -1) {
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
        if (!this.Z && !this.f39754n0 && ((this.S || this.X) && !z11)) {
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
            } else if (arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.T;
                this.T = i28 + 1;
                this.G = i28;
            }
        } else if (arrayList.isEmpty()) {
            int i29 = this.T;
            this.T = i29 + 1;
            this.G = i29;
        } else {
            int i210 = this.T;
            this.T = i210 + 1;
            this.G = i210;
        }
        jh0 jh0Var = this.f39736a;
        if (jh0Var == null || !z10) {
            return;
        }
        jh0Var.l();
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
        jh0 jh0Var = this.f39736a;
        if (jh0Var != null) {
            jh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.f60 f60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f39741c0 = true;
            if (z11 && (f60Var = this.f39748h0) != null && f60Var.f28281h0) {
                f60Var.show();
            }
        }
        this.f39756p0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f39756p0.lock();
    }
}
