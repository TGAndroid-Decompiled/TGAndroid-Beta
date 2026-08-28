package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g0 extends sa {
    public z41 T;
    public TLRPC.TL_channelAdminLogEventsFilter U;
    public ArrayList V;
    public a0.h W;
    public final boolean X;
    public final fg.a Y;
    public boolean Z;
    public boolean f28616a0;
    public boolean f28617b0;
    public org.telegram.ui.ta f28618c0;

    public g0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(o2Var.getContext(), o2Var, false, false, false, false, true, 2, o2Var.getResourceProvider());
        this.U = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Z = false;
        this.f28616a0 = false;
        this.f28617b0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i9 = org.telegram.ui.ActionBar.f6.f23091i5;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider));
        J();
        this.f32415y = true;
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
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setOnItemClickListener(new s(this, 1));
        fg.a aVar = new fg.a(getContext(), this.resourcesProvider, (wk0) null);
        this.Y = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider));
        kh.d dVar = new kh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.g(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        aVar.addView(dVar, g7.e6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, g7.e6.f(-2.0f, 87, i10, 0, i10, 0));
        wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.p1();
    }

    public static void O(org.telegram.ui.Components.g0 r8, android.view.View r9, int r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g0.O(org.telegram.ui.Components.g0, android.view.View, int, float):void");
    }

    public final void P(ArrayList arrayList, z41 z41Var) {
        int i9;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int m10;
        int size;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        int i13;
        boolean z18;
        if (this.U != null) {
            arrayList.add(l41.B(null));
            org.telegram.ui.Cells.j2.l(R.string.EventLogFilterByActions, arrayList);
            boolean z19 = this.X;
            if (z19) {
                i9 = R.string.EventLogFilterSectionMembers;
            } else {
                i9 = R.string.EventLogFilterSectionSubscribers;
            }
            l41 z20 = l41.z(Q(0), LocaleController.getString(i9), 2);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U;
            if (!tL_channelAdminLogEventsFilter.promote && !tL_channelAdminLogEventsFilter.demote && ((!z19 || (!tL_channelAdminLogEventsFilter.kick && !tL_channelAdminLogEventsFilter.ban && !tL_channelAdminLogEventsFilter.unkick && !tL_channelAdminLogEventsFilter.unban)) && !tL_channelAdminLogEventsFilter.invite && !tL_channelAdminLogEventsFilter.join && !tL_channelAdminLogEventsFilter.leave && !tL_channelAdminLogEventsFilter.edit_rank)) {
                z10 = false;
            } else {
                z10 = true;
            }
            z20.K(z10);
            z20.f30334f = !this.Z;
            z20.D = new gh.z0(this, 0, 5);
            arrayList.add(z20);
            if (this.Z) {
                l41 y10 = l41.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
                y10.f30336i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U;
                if (!tL_channelAdminLogEventsFilter2.promote && !tL_channelAdminLogEventsFilter2.demote) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                y10.K(z16);
                arrayList.add(y10);
                if (z19) {
                    l41 y11 = l41.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                    y11.f30336i = 1;
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U;
                    if (!tL_channelAdminLogEventsFilter3.kick && !tL_channelAdminLogEventsFilter3.ban && !tL_channelAdminLogEventsFilter3.unkick && !tL_channelAdminLogEventsFilter3.unban) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    y11.K(z18);
                    arrayList.add(y11);
                }
                if (z19) {
                    i12 = R.string.EventLogFilterNewMembers;
                } else {
                    i12 = R.string.EventLogFilterNewSubscribers;
                }
                l41 y12 = l41.y(5, LocaleController.getString(i12));
                y12.f30336i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.U;
                if (!tL_channelAdminLogEventsFilter4.invite && !tL_channelAdminLogEventsFilter4.join) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                y12.K(z17);
                arrayList.add(y12);
                if (z19) {
                    i13 = R.string.EventLogFilterLeavingMembers2;
                } else {
                    i13 = R.string.EventLogFilterLeavingSubscribers2;
                }
                l41 y13 = l41.y(6, LocaleController.getString(i13));
                y13.f30336i = 1;
                y13.K(this.U.leave);
                arrayList.add(y13);
                if (z19) {
                    l41 y14 = l41.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                    y14.f30336i = 1;
                    y14.K(this.U.edit_rank);
                    arrayList.add(y14);
                }
            }
            if (z19) {
                i10 = R.string.EventLogFilterSectionGroupSettings;
            } else {
                i10 = R.string.EventLogFilterSectionChannelSettings;
            }
            l41 z21 = l41.z(Q(1), LocaleController.getString(i10), 8);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.U;
            if (!tL_channelAdminLogEventsFilter5.info && !tL_channelAdminLogEventsFilter5.settings && !tL_channelAdminLogEventsFilter5.invites && !tL_channelAdminLogEventsFilter5.group_call) {
                z11 = false;
            } else {
                z11 = true;
            }
            z21.K(z11);
            z21.f30334f = !this.f28616a0;
            z21.D = new gh.z0(this, 1, 5);
            arrayList.add(z21);
            if (this.f28616a0) {
                if (z19) {
                    i11 = R.string.EventLogFilterGroupInfo;
                } else {
                    i11 = R.string.EventLogFilterChannelInfo;
                }
                l41 y15 = l41.y(9, LocaleController.getString(i11));
                y15.f30336i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.U;
                if (!tL_channelAdminLogEventsFilter6.info && !tL_channelAdminLogEventsFilter6.settings) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                y15.K(z15);
                arrayList.add(y15);
                l41 y16 = l41.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
                y16.f30336i = 1;
                y16.K(this.U.invites);
                arrayList.add(y16);
                l41 y17 = l41.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
                y17.f30336i = 1;
                y17.K(this.U.group_call);
                arrayList.add(y17);
            }
            l41 z22 = l41.z(Q(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.U;
            if (!tL_channelAdminLogEventsFilter7.delete && !tL_channelAdminLogEventsFilter7.edit && !tL_channelAdminLogEventsFilter7.pinned) {
                z12 = false;
            } else {
                z12 = true;
            }
            z22.K(z12);
            z22.f30334f = !this.f28617b0;
            z22.D = new gh.z0(this, 2, 5);
            arrayList.add(z22);
            if (this.f28617b0) {
                l41 y18 = l41.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
                y18.f30336i = 1;
                y18.K(this.U.delete);
                arrayList.add(y18);
                l41 y19 = l41.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
                y19.f30336i = 1;
                y19.K(this.U.edit);
                arrayList.add(y19);
                l41 y20 = l41.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
                y20.f30336i = 1;
                y20.K(this.U.pinned);
                arrayList.add(y20);
            }
            arrayList.add(l41.B(null));
            org.telegram.ui.Cells.j2.l(R.string.EventLogFilterByAdmins, arrayList);
            l41 y21 = l41.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
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
            y21.K(z13);
            arrayList.add(y21);
            if (this.V != null) {
                for (int i14 = 0; i14 < this.V.size(); i14++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.V.get(i14)).peer);
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    l41 l41Var = new l41(37);
                    l41Var.d = (-1) - i14;
                    l41Var.G = user;
                    l41Var.f30336i = 1;
                    a0.h hVar2 = this.W;
                    if (hVar2 != null && hVar2.d(peerDialogId)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    l41Var.K(z14);
                    arrayList.add(l41Var);
                }
            }
        }
    }

    public final String Q(int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (i9 != 0) {
            if (i9 != 1) {
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
            i10 = 0;
        } else {
            i10 = 1;
        }
        boolean z10 = this.X;
        if (z10 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        sb4.append(i10 + i11 + ((tL_channelAdminLogEventsFilter3.invite || tL_channelAdminLogEventsFilter3.join) ? 1 : 1) + (tL_channelAdminLogEventsFilter3.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter3.edit_rank ? 1 : 0));
        sb4.append("/");
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        sb4.append(i12);
        return sb4.toString();
    }

    public final void R(ArrayList arrayList) {
        this.V = arrayList;
        if (arrayList != null && this.W == null) {
            this.W = new a0.h();
            ArrayList arrayList2 = this.V;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.W.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        z41 z41Var = this.T;
        if (z41Var != null) {
            z41Var.N(true);
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
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.T = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
