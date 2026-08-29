package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i0 extends xa {
    public k51 T;
    public TLRPC.TL_channelAdminLogEventsFilter U;
    public ArrayList V;
    public a0.h W;
    public final boolean X;
    public final ig.a Y;
    public boolean Z;
    public boolean f29289a0;
    public boolean f29290b0;
    public org.telegram.ui.sa f29291c0;

    public i0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(o2Var.getContext(), o2Var, false, false, false, false, true, 2, o2Var.getResourceProvider());
        this.U = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Z = false;
        this.f29289a0 = false;
        this.f29290b0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.g6.f23151i5;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        J();
        this.f34667y = true;
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
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new u(this, 1));
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, (jl0) null);
        this.Y = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider));
        nh.d dVar = new nh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new h0(this, 0));
        aVar.addView(dVar, i7.f6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, i7.f6.f(-2.0f, 87, i11, 0, i11, 0));
        jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.p1();
    }

    public static void P(org.telegram.ui.Components.i0 r8, android.view.View r9, int r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i0.P(org.telegram.ui.Components.i0, android.view.View, int, float):void");
    }

    public final void Q(ArrayList arrayList, k51 k51Var) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        int m10;
        int size;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        int i13;
        boolean z17;
        int i14;
        boolean z18;
        if (this.U != null) {
            arrayList.add(w41.B(null));
            org.telegram.ui.th.p(R.string.EventLogFilterByActions, arrayList);
            boolean z19 = this.X;
            if (z19) {
                i10 = R.string.EventLogFilterSectionMembers;
            } else {
                i10 = R.string.EventLogFilterSectionSubscribers;
            }
            w41 z20 = w41.z(R(0), LocaleController.getString(i10), 2);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
            if (!tL_channelAdminLogEventsFilter.promote && !tL_channelAdminLogEventsFilter.demote && ((!z19 || (!tL_channelAdminLogEventsFilter.kick && !tL_channelAdminLogEventsFilter.ban && !tL_channelAdminLogEventsFilter.unkick && !tL_channelAdminLogEventsFilter.unban)) && !tL_channelAdminLogEventsFilter.invite && !tL_channelAdminLogEventsFilter.join && !tL_channelAdminLogEventsFilter.leave && !tL_channelAdminLogEventsFilter.edit_rank)) {
                z10 = false;
            } else {
                z10 = true;
            }
            z20.K(z10);
            z20.f34295f = !this.Z;
            z20.D = new jh.y0(this, 0, 5);
            arrayList.add(z20);
            if (this.Z) {
                w41 y8 = w41.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
                y8.f34297i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
                if (!tL_channelAdminLogEventsFilter2.promote && !tL_channelAdminLogEventsFilter2.demote) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                y8.K(z16);
                arrayList.add(y8);
                if (z19) {
                    w41 y10 = w41.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                    y10.f34297i = 1;
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
                    if (!tL_channelAdminLogEventsFilter3.kick && !tL_channelAdminLogEventsFilter3.ban && !tL_channelAdminLogEventsFilter3.unkick && !tL_channelAdminLogEventsFilter3.unban) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    y10.K(z18);
                    arrayList.add(y10);
                }
                if (z19) {
                    i13 = R.string.EventLogFilterNewMembers;
                } else {
                    i13 = R.string.EventLogFilterNewSubscribers;
                }
                w41 y11 = w41.y(5, LocaleController.getString(i13));
                y11.f34297i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.U;
                if (!tL_channelAdminLogEventsFilter4.invite && !tL_channelAdminLogEventsFilter4.join) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                y11.K(z17);
                arrayList.add(y11);
                if (z19) {
                    i14 = R.string.EventLogFilterLeavingMembers2;
                } else {
                    i14 = R.string.EventLogFilterLeavingSubscribers2;
                }
                w41 y12 = w41.y(6, LocaleController.getString(i14));
                y12.f34297i = 1;
                y12.K(this.U.leave);
                arrayList.add(y12);
                if (z19) {
                    w41 y13 = w41.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                    y13.f34297i = 1;
                    y13.K(this.U.edit_rank);
                    arrayList.add(y13);
                }
            }
            if (z19) {
                i11 = R.string.EventLogFilterSectionGroupSettings;
            } else {
                i11 = R.string.EventLogFilterSectionChannelSettings;
            }
            w41 z21 = w41.z(R(1), LocaleController.getString(i11), 8);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.U;
            if (!tL_channelAdminLogEventsFilter5.info && !tL_channelAdminLogEventsFilter5.settings && !tL_channelAdminLogEventsFilter5.invites && !tL_channelAdminLogEventsFilter5.group_call) {
                z11 = false;
            } else {
                z11 = true;
            }
            z21.K(z11);
            z21.f34295f = !this.f29289a0;
            z21.D = new jh.y0(this, 1, 5);
            arrayList.add(z21);
            if (this.f29289a0) {
                if (z19) {
                    i12 = R.string.EventLogFilterGroupInfo;
                } else {
                    i12 = R.string.EventLogFilterChannelInfo;
                }
                w41 y14 = w41.y(9, LocaleController.getString(i12));
                y14.f34297i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.U;
                if (!tL_channelAdminLogEventsFilter6.info && !tL_channelAdminLogEventsFilter6.settings) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                y14.K(z15);
                arrayList.add(y14);
                w41 y15 = w41.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
                y15.f34297i = 1;
                y15.K(this.U.invites);
                arrayList.add(y15);
                w41 y16 = w41.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
                y16.f34297i = 1;
                y16.K(this.U.group_call);
                arrayList.add(y16);
            }
            w41 z22 = w41.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.U;
            if (!tL_channelAdminLogEventsFilter7.delete && !tL_channelAdminLogEventsFilter7.edit && !tL_channelAdminLogEventsFilter7.pinned) {
                z12 = false;
            } else {
                z12 = true;
            }
            z22.K(z12);
            z22.f34295f = !this.f29290b0;
            z22.D = new jh.y0(this, 2, 5);
            arrayList.add(z22);
            if (this.f29290b0) {
                w41 y17 = w41.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
                y17.f34297i = 1;
                y17.K(this.U.delete);
                arrayList.add(y17);
                w41 y18 = w41.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
                y18.f34297i = 1;
                y18.K(this.U.edit);
                arrayList.add(y18);
                w41 y19 = w41.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
                y19.f34297i = 1;
                y19.K(this.U.pinned);
                arrayList.add(y19);
            }
            arrayList.add(w41.B(null));
            org.telegram.ui.th.p(R.string.EventLogFilterByAdmins, arrayList);
            w41 y20 = w41.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
            a0.h hVar = this.W;
            if (hVar == null) {
                m10 = 0;
            } else {
                m10 = hVar.m();
            }
            ArrayList arrayList2 = this.V;
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            if (m10 >= size) {
                z13 = true;
            } else {
                z13 = false;
            }
            y20.K(z13);
            arrayList.add(y20);
            if (this.V != null) {
                for (int i15 = 0; i15 < this.V.size(); i15++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.V.get(i15)).peer);
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    w41 w41Var = new w41(37);
                    w41Var.d = (-1) - i15;
                    w41Var.G = user;
                    w41Var.f34297i = 1;
                    a0.h hVar2 = this.W;
                    if (hVar2 != null && hVar2.d(peerDialogId)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    w41Var.K(z14);
                    arrayList.add(w41Var);
                }
            }
        }
    }

    public final String R(int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                StringBuilder sb2 = new StringBuilder();
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
                sb2.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb2.append("/3");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
            sb3.append(((tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) ? 1 : 1) + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        boolean z10 = this.X;
        if (z10 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        sb4.append(i11 + i12 + ((tL_channelAdminLogEventsFilter3.invite || tL_channelAdminLogEventsFilter3.join) ? 1 : 1) + (tL_channelAdminLogEventsFilter3.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter3.edit_rank ? 1 : 0));
        sb4.append("/");
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        sb4.append(i13);
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
        k51 k51Var = this.T;
        if (k51Var != null) {
            k51Var.N(true);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override
    public final void onSmoothContainerViewLayout(float f9) {
        super.onSmoothContainerViewLayout(f9);
        this.Y.setTranslationY(-f9);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.T = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
