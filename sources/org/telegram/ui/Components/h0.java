package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h0 extends sa {
    public w51 U;
    public TLRPC.TL_channelAdminLogEventsFilter V;
    public ArrayList W;
    public a0.h X;
    public final boolean Y;
    public final kg.a Z;
    public boolean f25276a0;
    public boolean f25277b0;
    public boolean f25278c0;
    public org.telegram.ui.ya f25279d0;

    public h0(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z4) {
        super(p2Var.getContext(), p2Var, false, false, false, false, true, 2, p2Var.getResourceProvider());
        this.V = new TLRPC.TL_channelAdminLogEventsFilter();
        this.f25276a0 = false;
        this.f25277b0 = false;
        this.f25278c0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.j6.f19970i5;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        J();
        this.f28706y = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.V;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.V;
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
            this.X = hVar.clone();
        }
        this.Y = z4;
        this.U.N(false);
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new t(this, 1));
        kg.a aVar = new kg.a(getContext(), this.resourcesProvider, (rl0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        ph.d dVar = new ph.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new g0(this, 0));
        aVar.addView(dVar, k7.b6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, k7.b6.f(-2.0f, 87, i11, 0, i11, 0));
        rl0 rl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.o1();
    }

    public static void P(org.telegram.ui.Components.h0 r8, android.view.View r9, int r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h0.P(org.telegram.ui.Components.h0, android.view.View, int, float):void");
    }

    public final void Q(ArrayList arrayList, w51 w51Var) {
        int i10;
        boolean z4;
        int i11;
        boolean z10;
        boolean z11;
        int m9;
        int size;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        boolean z15;
        int i13;
        boolean z16;
        int i14;
        boolean z17;
        if (this.V != null) {
            arrayList.add(i51.B(null));
            org.telegram.ui.ai.q(R.string.EventLogFilterByActions, arrayList);
            boolean z18 = this.Y;
            if (z18) {
                i10 = R.string.EventLogFilterSectionMembers;
            } else {
                i10 = R.string.EventLogFilterSectionSubscribers;
            }
            i51 z19 = i51.z(R(0), LocaleController.getString(i10), 2);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.V;
            if (!tL_channelAdminLogEventsFilter.promote && !tL_channelAdminLogEventsFilter.demote && ((!z18 || (!tL_channelAdminLogEventsFilter.kick && !tL_channelAdminLogEventsFilter.ban && !tL_channelAdminLogEventsFilter.unkick && !tL_channelAdminLogEventsFilter.unban)) && !tL_channelAdminLogEventsFilter.invite && !tL_channelAdminLogEventsFilter.join && !tL_channelAdminLogEventsFilter.leave && !tL_channelAdminLogEventsFilter.edit_rank)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z19.K(z4);
            z19.f25580f = !this.f25276a0;
            z19.D = new lh.y0(this, 0, 3);
            arrayList.add(z19);
            if (this.f25276a0) {
                i51 y10 = i51.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
                y10.f25582i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.V;
                if (!tL_channelAdminLogEventsFilter2.promote && !tL_channelAdminLogEventsFilter2.demote) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                y10.K(z15);
                arrayList.add(y10);
                if (z18) {
                    i51 y11 = i51.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                    y11.f25582i = 1;
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.V;
                    if (!tL_channelAdminLogEventsFilter3.kick && !tL_channelAdminLogEventsFilter3.ban && !tL_channelAdminLogEventsFilter3.unkick && !tL_channelAdminLogEventsFilter3.unban) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    y11.K(z17);
                    arrayList.add(y11);
                }
                if (z18) {
                    i13 = R.string.EventLogFilterNewMembers;
                } else {
                    i13 = R.string.EventLogFilterNewSubscribers;
                }
                i51 y12 = i51.y(5, LocaleController.getString(i13));
                y12.f25582i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.V;
                if (!tL_channelAdminLogEventsFilter4.invite && !tL_channelAdminLogEventsFilter4.join) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                y12.K(z16);
                arrayList.add(y12);
                if (z18) {
                    i14 = R.string.EventLogFilterLeavingMembers2;
                } else {
                    i14 = R.string.EventLogFilterLeavingSubscribers2;
                }
                i51 y13 = i51.y(6, LocaleController.getString(i14));
                y13.f25582i = 1;
                y13.K(this.V.leave);
                arrayList.add(y13);
                if (z18) {
                    i51 y14 = i51.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                    y14.f25582i = 1;
                    y14.K(this.V.edit_rank);
                    arrayList.add(y14);
                }
            }
            if (z18) {
                i11 = R.string.EventLogFilterSectionGroupSettings;
            } else {
                i11 = R.string.EventLogFilterSectionChannelSettings;
            }
            i51 z20 = i51.z(R(1), LocaleController.getString(i11), 8);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.V;
            if (!tL_channelAdminLogEventsFilter5.info && !tL_channelAdminLogEventsFilter5.settings && !tL_channelAdminLogEventsFilter5.invites && !tL_channelAdminLogEventsFilter5.group_call) {
                z10 = false;
            } else {
                z10 = true;
            }
            z20.K(z10);
            z20.f25580f = !this.f25277b0;
            z20.D = new lh.y0(this, 1, 3);
            arrayList.add(z20);
            if (this.f25277b0) {
                if (z18) {
                    i12 = R.string.EventLogFilterGroupInfo;
                } else {
                    i12 = R.string.EventLogFilterChannelInfo;
                }
                i51 y15 = i51.y(9, LocaleController.getString(i12));
                y15.f25582i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.V;
                if (!tL_channelAdminLogEventsFilter6.info && !tL_channelAdminLogEventsFilter6.settings) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                y15.K(z14);
                arrayList.add(y15);
                i51 y16 = i51.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
                y16.f25582i = 1;
                y16.K(this.V.invites);
                arrayList.add(y16);
                i51 y17 = i51.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
                y17.f25582i = 1;
                y17.K(this.V.group_call);
                arrayList.add(y17);
            }
            i51 z21 = i51.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.V;
            if (!tL_channelAdminLogEventsFilter7.delete && !tL_channelAdminLogEventsFilter7.edit && !tL_channelAdminLogEventsFilter7.pinned) {
                z11 = false;
            } else {
                z11 = true;
            }
            z21.K(z11);
            z21.f25580f = !this.f25278c0;
            z21.D = new lh.y0(this, 2, 3);
            arrayList.add(z21);
            if (this.f25278c0) {
                i51 y18 = i51.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
                y18.f25582i = 1;
                y18.K(this.V.delete);
                arrayList.add(y18);
                i51 y19 = i51.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
                y19.f25582i = 1;
                y19.K(this.V.edit);
                arrayList.add(y19);
                i51 y20 = i51.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
                y20.f25582i = 1;
                y20.K(this.V.pinned);
                arrayList.add(y20);
            }
            arrayList.add(i51.B(null));
            org.telegram.ui.ai.q(R.string.EventLogFilterByAdmins, arrayList);
            i51 y21 = i51.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
            a0.h hVar = this.X;
            if (hVar == null) {
                m9 = 0;
            } else {
                m9 = hVar.m();
            }
            ArrayList arrayList2 = this.W;
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            if (m9 >= size) {
                z12 = true;
            } else {
                z12 = false;
            }
            y21.K(z12);
            arrayList.add(y21);
            if (this.W != null) {
                for (int i15 = 0; i15 < this.W.size(); i15++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.W.get(i15)).peer);
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    i51 i51Var = new i51(37);
                    i51Var.d = (-1) - i15;
                    i51Var.G = user;
                    i51Var.f25582i = 1;
                    a0.h hVar2 = this.X;
                    if (hVar2 != null && hVar2.d(peerDialogId)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i51Var.K(z13);
                    arrayList.add(i51Var);
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
                StringBuilder sb = new StringBuilder();
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.V;
                sb.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb.append("/3");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.V;
            sb2.append(((tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) ? 1 : 1) + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb2.append("/3");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.V;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        boolean z4 = this.Y;
        if (z4 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        sb3.append(i11 + i12 + ((tL_channelAdminLogEventsFilter3.invite || tL_channelAdminLogEventsFilter3.join) ? 1 : 1) + (tL_channelAdminLogEventsFilter3.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter3.edit_rank ? 1 : 0));
        sb3.append("/");
        if (z4) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        sb3.append(i13);
        return sb3.toString();
    }

    public final void S(ArrayList arrayList) {
        this.W = arrayList;
        if (arrayList != null && this.X == null) {
            this.X = new a0.h();
            ArrayList arrayList2 = this.W;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.X.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        w51 w51Var = this.U;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.Z.setTranslationY(-f10);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.U = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
