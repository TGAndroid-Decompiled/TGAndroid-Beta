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
public final class lh0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public kh0 f39271a;
    public Drawable f39272a0;
    public org.telegram.ui.Components.lm0 f39273b;
    public boolean f39274b0;
    public TLRPC.Chat f39275c;
    public boolean f39276c0;
    public TLRPC.ChatFull d;
    public boolean f39277d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f39278e0;
    public final long f39279f;
    public final int f39280f0;
    public boolean f39281g0;
    public final boolean h;
    public org.telegram.ui.Components.ql0 f39282h0;
    public final ArrayList f39283i0;
    public final ArrayList f39284j0;
    public final HashMap f39285k0;
    public org.telegram.ui.Components.k70 f39286l0;
    public final ArrayList m0;
    public final long f39287n;
    public long f39288n0;
    public boolean f39289o0;
    public final boolean f39290p0;
    public final zg0 f39291q0;
    public int f39292r;
    public boolean f39293r0;
    public int f39294s;
    public final bh0 f39295s0;
    public final AnimationNotificationsLocker f39296t0;
    public int v;
    public int f39297w;
    public int f39298x;
    public int f39299y;

    public lh0(long j10, long j11, int i10) {
        super(null);
        boolean z10;
        this.f39283i0 = new ArrayList();
        this.f39284j0 = new ArrayList();
        this.f39285k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f39291q0 = new zg0(this);
        boolean z11 = false;
        this.f39293r0 = false;
        this.f39295s0 = new bh0(this);
        this.f39296t0 = new AnimationNotificationsLocker();
        this.f39287n = j10;
        this.f39280f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.f39275c = chat;
        if (ChatObject.isChannel(chat) && !this.f39275c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f39279f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f39279f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f39279f));
        if (this.f39279f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f39290p0 = z11;
    }

    public static void U(org.telegram.ui.lh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh0.U(org.telegram.ui.lh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.lh0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh0.V(org.telegram.ui.lh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(lh0 lh0Var) {
        if (lh0Var.f39279f == lh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = lh0Var.getMessagesController().getInputPeer(-lh0Var.f39287n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = lh0Var.e;
            lh0Var.e = null;
            lh0Var.d.exported_invite = null;
            int sendRequest = lh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ug0(lh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(lh0Var.f39273b);
            lh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, lh0Var.classGuid);
            return;
        }
        lh0Var.f0(lh0Var.e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21387o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21517v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21500u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21240g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    public final void b0() {
        org.telegram.ui.Components.lm0 lm0Var = this.f39273b;
        if (lm0Var != null) {
            int childCount = lm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f39273b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.p90) {
                    ((org.telegram.ui.Components.p90) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.k70 k70Var = this.f39286l0;
        if (k70Var != null) {
            k70Var.updateColors();
        }
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39287n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ug0(this, tL_chatInviteExported, 1));
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
        int i11 = org.telegram.ui.ActionBar.k6.f21126a7;
        org.telegram.ui.ActionBar.r6.i(i11, l0Var, null);
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f39273b = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f39273b);
        hg.a0 a0Var = new hg.a0(1, false, 12);
        this.f39273b.setLayoutManager(a0Var);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f39273b;
        kh0 kh0Var = new kh0(this, context);
        this.f39271a = kh0Var;
        lm0Var2.setAdapter(kh0Var);
        this.f39273b.setOnScrollListener(new ki.m3(6, this, a0Var));
        this.f39282h0 = new org.telegram.ui.Components.ql0(this.f39273b, false);
        s4.k kVar = new s4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.zr.h);
        kVar.C = false;
        kVar.f46376m = false;
        this.f39273b.setItemAnimator(kVar);
        org.telegram.ui.Components.lm0 lm0Var3 = this.f39273b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        lm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f39273b, w7.z5.c(-1.0f, -1));
        this.f39273b.setOnItemClickListener(new ci.x4(19, this, context));
        this.f39273b.setOnItemLongClickListener(new wg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f39272a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        j0(true);
        this.f39288n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
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
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f39287n)) {
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
        boolean z11 = this.f39277d0;
        long j10 = this.f39287n;
        if (z11 && !this.f39278e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new tg0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f39279f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.f39293r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f39284j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f39283i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f39289o0) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39287n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ug0(this, tL_chatInviteExported, 2));
    }

    public final ch0 g0() {
        ch0 ch0Var = new ch0(this);
        ch0Var.f(ch0Var.f36345i);
        ch0Var.f36342c = this.f39299y;
        ch0Var.d = this.E;
        ch0Var.e = this.H;
        ch0Var.f36343f = this.I;
        ch0Var.f36344g = this.U;
        ch0Var.h = this.V;
        ch0Var.f36341b = this.X;
        ch0Var.f36347k.clear();
        ch0Var.f36347k.addAll(this.f39283i0);
        ch0Var.f36348l.clear();
        ch0Var.f36348l.addAll(this.f39284j0);
        return ch0Var;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(13, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39273b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21572y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39273b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39273b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39273b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21312k7));
        return arrayList;
    }

    public final void h0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f39289o0 = ChatObject.isPublic(this.f39275c);
        e0(true);
    }

    public final void i0(ch0 ch0Var) {
        if (!this.isPaused && this.f39271a != null && this.f39273b != null) {
            j0(false);
            ch0Var.f(ch0Var.f36346j);
            s4.o.c(ch0Var, true).c(this.f39271a);
            AndroidUtilities.updateVisibleRows(this.f39273b);
            return;
        }
        j0(true);
    }

    public final void j0(boolean z10) {
        kh0 kh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f39287n));
        this.f39275c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f39299y = -1;
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
            this.f39292r = -1;
            this.f39298x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f39297w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f39279f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f39292r = i11;
            }
            int i12 = this.X;
            this.f39294s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f39283i0;
            if (!z11) {
                this.f39297w = i13;
                this.X = i12 + 4;
                this.f39298x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f39297w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f39299y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f39298x >= 0 && (!this.W || this.f39277d0 || this.f39293r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f39298x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f39284j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f39298x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f39299y == -1) {
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
            if (!this.f39277d0 && !this.f39293r0 && ((this.W || this.f39274b0) && !z11)) {
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
                    kh0Var = this.f39271a;
                    if (kh0Var == null && z10) {
                        kh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            kh0Var = this.f39271a;
            if (kh0Var == null) {
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
        kh0 kh0Var = this.f39271a;
        if (kh0Var != null) {
            kh0Var.l();
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
        org.telegram.ui.Components.k70 k70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f39281g0 = true;
            if (z11 && (k70Var = this.f39286l0) != null && k70Var.f27923l0) {
                k70Var.show();
            }
        }
        this.f39296t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f39296t0.lock();
    }
}
