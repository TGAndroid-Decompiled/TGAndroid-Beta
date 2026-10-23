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
public final class mh0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public lh0 f39576a;
    public Drawable f39577a0;
    public org.telegram.ui.Components.mm0 f39578b;
    public boolean f39579b0;
    public TLRPC.Chat f39580c;
    public boolean f39581c0;
    public TLRPC.ChatFull d;
    public boolean f39582d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f39583e0;
    public final long f39584f;
    public final int f39585f0;
    public boolean f39586g0;
    public final boolean h;
    public org.telegram.ui.Components.rl0 f39587h0;
    public final ArrayList f39588i0;
    public final ArrayList f39589j0;
    public final HashMap f39590k0;
    public org.telegram.ui.Components.m70 f39591l0;
    public final ArrayList m0;
    public final long f39592n;
    public long f39593n0;
    public boolean f39594o0;
    public final boolean f39595p0;
    public final ah0 f39596q0;
    public int f39597r;
    public boolean f39598r0;
    public int f39599s;
    public final ch0 f39600s0;
    public final AnimationNotificationsLocker f39601t0;
    public int v;
    public int f39602w;
    public int f39603x;
    public int f39604y;

    public mh0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f39588i0 = new ArrayList();
        this.f39589j0 = new ArrayList();
        this.f39590k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f39596q0 = new ah0(this);
        boolean z11 = false;
        this.f39598r0 = false;
        this.f39600s0 = new ch0(this);
        this.f39601t0 = new AnimationNotificationsLocker();
        this.f39592n = j10;
        this.f39585f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f39580c = chat;
        if (ChatObject.isChannel(chat) && !this.f39580c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f39584f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f39584f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f39584f));
        if (this.f39584f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f39595p0 = z11;
    }

    public static void U(org.telegram.ui.mh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mh0.U(org.telegram.ui.mh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.mh0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mh0.V(org.telegram.ui.mh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(mh0 mh0Var) {
        if (mh0Var.f39584f == mh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = mh0Var.getMessagesController().getInputPeer(-mh0Var.f39592n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var.e;
            mh0Var.e = null;
            mh0Var.d.exported_invite = null;
            int sendRequest = mh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new vg0(mh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(mh0Var.f39578b);
            mh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, mh0Var.classGuid);
            return;
        }
        mh0Var.f0(mh0Var.e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21571y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21386o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21516v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21499u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21239g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21145b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    public final void b0() {
        org.telegram.ui.Components.mm0 mm0Var = this.f39578b;
        if (mm0Var != null) {
            int childCount = mm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f39578b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.r90) {
                    ((org.telegram.ui.Components.r90) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.m70 m70Var = this.f39591l0;
        if (m70Var != null) {
            m70Var.updateColors();
        }
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39592n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new vg0(this, tL_chatInviteExported, 1));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 10));
        l0 l0Var = new l0(this, context, 14);
        this.fragmentView = l0Var;
        int i11 = org.telegram.ui.ActionBar.k6.f21125a7;
        org.telegram.ui.ActionBar.r6.i(i11, l0Var, null);
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39578b = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f39578b);
        hg.a0 a0Var = new hg.a0(1, false, 12);
        this.f39578b.setLayoutManager(a0Var);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39578b;
        lh0 lh0Var = new lh0(this, context);
        this.f39576a = lh0Var;
        mm0Var2.setAdapter(lh0Var);
        this.f39578b.setOnScrollListener(new ki.m3(6, this, a0Var));
        this.f39587h0 = new org.telegram.ui.Components.rl0(this.f39578b, false);
        s4.k kVar = new s4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        this.f39578b.setItemAnimator(kVar);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f39578b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f39578b, w7.z5.c(-1.0f, -1));
        this.f39578b.setOnItemClickListener(new ci.x4(19, this, context));
        this.f39578b.setOnItemLongClickListener(new xg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f39577a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        j0(true);
        this.f39593n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f39592n)) {
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var != null && h5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f39582d0;
        long j10 = this.f39592n;
        if (z11 && !this.f39583e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new ug0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f39584f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f39598r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f39589j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f39588i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f39594o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ai.w9(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            j0(true);
        }
    }

    public final void f0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39592n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new vg0(this, tL_chatInviteExported, 2));
    }

    public final dh0 g0() {
        dh0 dh0Var = new dh0(this);
        dh0Var.f(dh0Var.f36631i);
        dh0Var.f36628c = this.f39604y;
        dh0Var.d = this.E;
        dh0Var.e = this.H;
        dh0Var.f36629f = this.I;
        dh0Var.f36630g = this.U;
        dh0Var.h = this.V;
        dh0Var.f36627b = this.X;
        dh0Var.f36633k.clear();
        dh0Var.f36633k.addAll(this.f39588i0);
        dh0Var.f36634l.clear();
        dh0Var.f36634l.addAll(this.f39589j0);
        return dh0Var;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(13, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39578b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21571y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39578b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21366n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39578b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39578b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21311k7));
        return arrayList;
    }

    public final void h0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f39594o0 = ChatObject.isPublic(this.f39580c);
        e0(true);
    }

    public final void i0(dh0 dh0Var) {
        if (!this.isPaused && this.f39576a != null && this.f39578b != null) {
            j0(false);
            dh0Var.f(dh0Var.f36632j);
            s4.o.c(dh0Var, true).c(this.f39576a);
            AndroidUtilities.updateVisibleRows(this.f39578b);
            return;
        }
        j0(true);
    }

    public final void j0(boolean z10) {
        lh0 lh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f39592n));
        this.f39580c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f39604y = -1;
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
            this.f39597r = -1;
            this.f39603x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f39602w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f39584f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f39597r = i11;
            }
            int i12 = this.X;
            this.f39599s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f39588i0;
            if (!z11) {
                this.f39602w = i13;
                this.X = i12 + 4;
                this.f39603x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f39602w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f39604y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f39603x >= 0 && (!this.W || this.f39582d0 || this.f39598r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f39603x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f39589j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f39603x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f39604y == -1) {
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
            if (!this.f39582d0 && !this.f39598r0 && ((this.W || this.f39579b0) && !z11)) {
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
                    lh0Var = this.f39576a;
                    if (lh0Var == null && z10) {
                        lh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            lh0Var = this.f39576a;
            if (lh0Var == null) {
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
        lh0 lh0Var = this.f39576a;
        if (lh0Var != null) {
            lh0Var.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            b0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.m70 m70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f39586g0 = true;
            if (z11 && (m70Var = this.f39591l0) != null && m70Var.f28589l0) {
                m70Var.show();
            }
        }
        this.f39601t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f39601t0.lock();
    }
}
