package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class g0 extends qa {
    public b51 T;
    public TLRPC.TL_channelAdminLogEventsFilter U;
    public ArrayList V;
    public a0.h W;
    public final boolean X;
    public final gg.a Y;
    public boolean Z;

    public boolean f28477a0;

    public boolean f28478b0;

    public org.telegram.ui.ua f28479c0;

    public g0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(n2Var.getContext(), n2Var, false, false, false, false, true, 2, n2Var.getResourceProvider());
        this.U = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Z = false;
        this.f28477a0 = false;
        this.f28478b0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.g6.f23143i5;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        K();
        this.f31860y = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            tL_channelAdminLogEventsFilter2.join = tL_channelAdminLogEventsFilter.join;
            tL_channelAdminLogEventsFilter2.leave = tL_channelAdminLogEventsFilter.leave;
            tL_channelAdminLogEventsFilter2.edit_rank = tL_channelAdminLogEventsFilter.edit_rank;
            tL_channelAdminLogEventsFilter2.invite = tL_channelAdminLogEventsFilter.invite;
            tL_channelAdminLogEventsFilter2.ban = tL_channelAdminLogEventsFilter.ban;
            tL_channelAdminLogEventsFilter2.unban = tL_channelAdminLogEventsFilter.unban;
            tL_channelAdminLogEventsFilter2.kick = tL_channelAdminLogEventsFilter.kick;
            tL_channelAdminLogEventsFilter2.unkick = tL_channelAdminLogEventsFilter.unkick;
            tL_channelAdminLogEventsFilter2.promote = tL_channelAdminLogEventsFilter.promote;
            tL_channelAdminLogEventsFilter2.demote = tL_channelAdminLogEventsFilter.demote;
            tL_channelAdminLogEventsFilter2.info = tL_channelAdminLogEventsFilter.info;
            tL_channelAdminLogEventsFilter2.settings = tL_channelAdminLogEventsFilter.settings;
            tL_channelAdminLogEventsFilter2.pinned = tL_channelAdminLogEventsFilter.pinned;
            tL_channelAdminLogEventsFilter2.edit = tL_channelAdminLogEventsFilter.edit;
            tL_channelAdminLogEventsFilter2.delete = tL_channelAdminLogEventsFilter.delete;
            tL_channelAdminLogEventsFilter2.group_call = tL_channelAdminLogEventsFilter.group_call;
            tL_channelAdminLogEventsFilter2.invites = tL_channelAdminLogEventsFilter.invites;
        } else {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
            tL_channelAdminLogEventsFilter3.join = true;
            tL_channelAdminLogEventsFilter3.leave = true;
            tL_channelAdminLogEventsFilter3.edit_rank = true;
            tL_channelAdminLogEventsFilter3.invite = true;
            tL_channelAdminLogEventsFilter3.ban = true;
            tL_channelAdminLogEventsFilter3.unban = true;
            tL_channelAdminLogEventsFilter3.kick = true;
            tL_channelAdminLogEventsFilter3.unkick = true;
            tL_channelAdminLogEventsFilter3.promote = true;
            tL_channelAdminLogEventsFilter3.demote = true;
            tL_channelAdminLogEventsFilter3.info = true;
            tL_channelAdminLogEventsFilter3.settings = true;
            tL_channelAdminLogEventsFilter3.pinned = true;
            tL_channelAdminLogEventsFilter3.edit = true;
            tL_channelAdminLogEventsFilter3.delete = true;
            tL_channelAdminLogEventsFilter3.group_call = true;
            tL_channelAdminLogEventsFilter3.invites = true;
        }
        if (hVar != null) {
            this.W = hVar.clone();
        }
        this.X = z10;
        this.T.N(false);
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new s(this, 1));
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider, (zk0) null);
        this.Y = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        lh.d dVar = new lh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        aVar.addView(dVar, h7.z5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, h7.z5.f(-2.0f, 87, i11, 0, i11, 0));
        zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.p1();
    }

    public static void P(org.telegram.ui.Components.g0 r8, android.view.View r9, int r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g0.P(org.telegram.ui.Components.g0, android.view.View, int, float):void");
    }

    public final void Q(ArrayList arrayList, b51 b51Var) {
        if (this.U == null) {
            return;
        }
        arrayList.add(n41.B(null));
        org.telegram.ui.Cells.pa.o(R.string.EventLogFilterByActions, arrayList);
        boolean z10 = this.X;
        int i10 = 0;
        int i11 = 2;
        n41 n41VarZ = n41.z(R(0), LocaleController.getString(z10 ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers), 2);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
        int i12 = 1;
        n41VarZ.K(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        n41VarZ.f30839f = !this.Z;
        n41VarZ.D = new hh.z0(this, i10, 5);
        arrayList.add(n41VarZ);
        if (this.Z) {
            n41 n41VarY = n41.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            n41VarY.f30841i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            n41VarY.K(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(n41VarY);
            if (z10) {
                n41 n41VarY2 = n41.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                n41VarY2.f30841i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
                n41VarY2.K(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(n41VarY2);
            }
            n41 n41VarY3 = n41.y(5, LocaleController.getString(z10 ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            n41VarY3.f30841i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.U;
            n41VarY3.K(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(n41VarY3);
            n41 n41VarY4 = n41.y(6, LocaleController.getString(z10 ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            n41VarY4.f30841i = 1;
            n41VarY4.K(this.U.leave);
            arrayList.add(n41VarY4);
            if (z10) {
                n41 n41VarY5 = n41.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                n41VarY5.f30841i = 1;
                n41VarY5.K(this.U.edit_rank);
                arrayList.add(n41VarY5);
            }
        }
        n41 n41VarZ2 = n41.z(R(1), LocaleController.getString(z10 ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), 8);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.U;
        n41VarZ2.K(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        n41VarZ2.f30839f = !this.f28477a0;
        n41VarZ2.D = new hh.z0(this, i12, 5);
        arrayList.add(n41VarZ2);
        if (this.f28477a0) {
            n41 n41VarY6 = n41.y(9, LocaleController.getString(z10 ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            n41VarY6.f30841i = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.U;
            n41VarY6.K(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(n41VarY6);
            n41 n41VarY7 = n41.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
            n41VarY7.f30841i = 1;
            n41VarY7.K(this.U.invites);
            arrayList.add(n41VarY7);
            n41 n41VarY8 = n41.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
            n41VarY8.f30841i = 1;
            n41VarY8.K(this.U.group_call);
            arrayList.add(n41VarY8);
        }
        n41 n41VarZ3 = n41.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.U;
        n41VarZ3.K(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        n41VarZ3.f30839f = !this.f28478b0;
        n41VarZ3.D = new hh.z0(this, i11, 5);
        arrayList.add(n41VarZ3);
        if (this.f28478b0) {
            n41 n41VarY9 = n41.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            n41VarY9.f30841i = 1;
            n41VarY9.K(this.U.delete);
            arrayList.add(n41VarY9);
            n41 n41VarY10 = n41.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            n41VarY10.f30841i = 1;
            n41VarY10.K(this.U.edit);
            arrayList.add(n41VarY10);
            n41 n41VarY11 = n41.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            n41VarY11.f30841i = 1;
            n41VarY11.K(this.U.pinned);
            arrayList.add(n41VarY11);
        }
        arrayList.add(n41.B(null));
        org.telegram.ui.Cells.pa.o(R.string.EventLogFilterByAdmins, arrayList);
        n41 n41VarY12 = n41.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        a0.h hVar = this.W;
        int iM = hVar == null ? 0 : hVar.m();
        ArrayList arrayList2 = this.V;
        n41VarY12.K(iM >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(n41VarY12);
        if (this.V != null) {
            for (int i13 = 0; i13 < this.V.size(); i13++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.V.get(i13)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                n41 n41Var = new n41(37);
                n41Var.d = (-1) - i13;
                n41Var.G = user;
                n41Var.f30841i = 1;
                a0.h hVar2 = this.W;
                n41Var.K(hVar2 != null && hVar2.d(peerDialogId));
                arrayList.add(n41Var);
            }
        }
    }

    public final String R(int i10) {
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
            int i11 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z10 = this.X;
            sb2.append(i11 + ((z10 && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb2.append("/");
            sb2.append(z10 ? 5 : 3);
            return sb2.toString();
        }
        if (i10 != 1) {
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            sb3.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
        sb4.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb4.append("/3");
        return sb4.toString();
    }

    public final void S(ArrayList arrayList) {
        this.V = arrayList;
        if (arrayList != null && this.W == null) {
            this.W = new a0.h();
            ArrayList arrayList2 = this.V;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.W.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        b51 b51Var = this.T;
        if (b51Var != null) {
            b51Var.N(true);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.Y.setTranslationY(-f10);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.T = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.EventLog);
    }
}
