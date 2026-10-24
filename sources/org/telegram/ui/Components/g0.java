package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g0 extends za {
    public a71 X;
    public TLRPC.TL_channelAdminLogEventsFilter Y;
    public ArrayList Z;
    public a0.h f26450a0;
    public final boolean f26451b0;
    public final ai.cd f26452c0;
    public boolean f26453d0;
    public boolean f26454e0;
    public boolean f26455f0;
    public org.telegram.ui.za f26456g0;
    public int f26457h0;

    public g0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(o2Var.getContext(), o2Var, false, true, 2, o2Var.getResourceProvider());
        this.Y = new TLRPC.TL_channelAdminLogEventsFilter();
        this.f26453d0 = false;
        this.f26454e0 = false;
        this.f26455f0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.k6.f21272i5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider);
        this.f26457h0 = w02;
        setBackgroundColor(w02);
        K();
        this.f33217y = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
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
            this.f26450a0 = hVar.clone();
        }
        this.f26451b0 = z10;
        this.X.N(false);
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new s(this, 1));
        ai.cd cdVar = new ai.cd(getContext(), this.resourcesProvider, (lm0) null);
        this.f26452c0 = cdVar;
        cdVar.setClickable(true);
        cdVar.setOrientation(1);
        cdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, cdVar, this.resourcesProvider);
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        dVar.f();
        dVar.i(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        cdVar.addView(dVar, w7.z5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(cdVar, w7.z5.f(-2.0f, 87, i11, 0, i11, 0));
        lm0 lm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.t1();
    }

    public static void P(org.telegram.ui.Components.g0 r8, android.view.View r9, int r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g0.P(org.telegram.ui.Components.g0, android.view.View, int, float):void");
    }

    public final void Q(ArrayList arrayList, a71 a71Var) {
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
        if (this.Y != null) {
            arrayList.add(l61.B(null));
            i2.o1.q(R.string.EventLogFilterByActions, arrayList);
            boolean z19 = this.f26451b0;
            if (z19) {
                i10 = R.string.EventLogFilterSectionMembers;
            } else {
                i10 = R.string.EventLogFilterSectionSubscribers;
            }
            l61 z20 = l61.z(R(0), LocaleController.getString(i10), 2);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
            if (!tL_channelAdminLogEventsFilter.promote && !tL_channelAdminLogEventsFilter.demote && ((!z19 || (!tL_channelAdminLogEventsFilter.kick && !tL_channelAdminLogEventsFilter.ban && !tL_channelAdminLogEventsFilter.unkick && !tL_channelAdminLogEventsFilter.unban)) && !tL_channelAdminLogEventsFilter.invite && !tL_channelAdminLogEventsFilter.join && !tL_channelAdminLogEventsFilter.leave && !tL_channelAdminLogEventsFilter.edit_rank)) {
                z10 = false;
            } else {
                z10 = true;
            }
            z20.K(z10);
            z20.f28222f = !this.f26453d0;
            z20.D = new ai.n1(this, 0, 8);
            arrayList.add(z20);
            if (this.f26453d0) {
                l61 y3 = l61.y(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
                y3.f28224i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
                if (!tL_channelAdminLogEventsFilter2.promote && !tL_channelAdminLogEventsFilter2.demote) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                y3.K(z16);
                arrayList.add(y3);
                if (z19) {
                    l61 y10 = l61.y(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                    y10.f28224i = 1;
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
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
                l61 y11 = l61.y(5, LocaleController.getString(i13));
                y11.f28224i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.Y;
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
                l61 y12 = l61.y(6, LocaleController.getString(i14));
                y12.f28224i = 1;
                y12.K(this.Y.leave);
                arrayList.add(y12);
                if (z19) {
                    l61 y13 = l61.y(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                    y13.f28224i = 1;
                    y13.K(this.Y.edit_rank);
                    arrayList.add(y13);
                }
            }
            if (z19) {
                i11 = R.string.EventLogFilterSectionGroupSettings;
            } else {
                i11 = R.string.EventLogFilterSectionChannelSettings;
            }
            l61 z21 = l61.z(R(1), LocaleController.getString(i11), 8);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.Y;
            if (!tL_channelAdminLogEventsFilter5.info && !tL_channelAdminLogEventsFilter5.settings && !tL_channelAdminLogEventsFilter5.invites && !tL_channelAdminLogEventsFilter5.group_call) {
                z11 = false;
            } else {
                z11 = true;
            }
            z21.K(z11);
            z21.f28222f = !this.f26454e0;
            z21.D = new ai.n1(this, 1, 8);
            arrayList.add(z21);
            if (this.f26454e0) {
                if (z19) {
                    i12 = R.string.EventLogFilterGroupInfo;
                } else {
                    i12 = R.string.EventLogFilterChannelInfo;
                }
                l61 y14 = l61.y(9, LocaleController.getString(i12));
                y14.f28224i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.Y;
                if (!tL_channelAdminLogEventsFilter6.info && !tL_channelAdminLogEventsFilter6.settings) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                y14.K(z15);
                arrayList.add(y14);
                l61 y15 = l61.y(10, LocaleController.getString(R.string.EventLogFilterInvites));
                y15.f28224i = 1;
                y15.K(this.Y.invites);
                arrayList.add(y15);
                l61 y16 = l61.y(11, LocaleController.getString(R.string.EventLogFilterCalls));
                y16.f28224i = 1;
                y16.K(this.Y.group_call);
                arrayList.add(y16);
            }
            l61 z22 = l61.z(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.Y;
            if (!tL_channelAdminLogEventsFilter7.delete && !tL_channelAdminLogEventsFilter7.edit && !tL_channelAdminLogEventsFilter7.pinned) {
                z12 = false;
            } else {
                z12 = true;
            }
            z22.K(z12);
            z22.f28222f = !this.f26455f0;
            z22.D = new ai.n1(this, 2, 8);
            arrayList.add(z22);
            if (this.f26455f0) {
                l61 y17 = l61.y(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
                y17.f28224i = 1;
                y17.K(this.Y.delete);
                arrayList.add(y17);
                l61 y18 = l61.y(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
                y18.f28224i = 1;
                y18.K(this.Y.edit);
                arrayList.add(y18);
                l61 y19 = l61.y(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
                y19.f28224i = 1;
                y19.K(this.Y.pinned);
                arrayList.add(y19);
            }
            arrayList.add(l61.B(null));
            i2.o1.q(R.string.EventLogFilterByAdmins, arrayList);
            l61 y20 = l61.y(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
            a0.h hVar = this.f26450a0;
            if (hVar == null) {
                m10 = 0;
            } else {
                m10 = hVar.m();
            }
            ArrayList arrayList2 = this.Z;
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
            if (this.Z != null) {
                for (int i15 = 0; i15 < this.Z.size(); i15++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.Z.get(i15)).peer);
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    l61 l61Var = new l61(37);
                    l61Var.d = (-1) - i15;
                    l61Var.G = user;
                    l61Var.f28224i = 1;
                    a0.h hVar2 = this.f26450a0;
                    if (hVar2 != null && hVar2.d(peerDialogId)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    l61Var.K(z14);
                    arrayList.add(l61Var);
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
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
                sb2.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb2.append("/3");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
            if (tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) {
                i14 = 1;
            }
            sb3.append(i14 + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        boolean z10 = this.f26451b0;
        if (z10 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i15 = i11 + i12;
        if (tL_channelAdminLogEventsFilter3.invite || tL_channelAdminLogEventsFilter3.join) {
            i14 = 1;
        }
        sb4.append(i15 + i14 + (tL_channelAdminLogEventsFilter3.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter3.edit_rank ? 1 : 0));
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
        this.Z = arrayList;
        if (arrayList != null && this.f26450a0 == null) {
            this.f26450a0 = new a0.h();
            ArrayList arrayList2 = this.Z;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.f26450a0.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        a71 a71Var = this.X;
        if (a71Var != null) {
            a71Var.N(true);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f26452c0.setTranslationY(-f7);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i5, this.resourcesProvider);
            if (w02 != this.f26457h0) {
                this.f26457h0 = w02;
                setBackgroundColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.X = a71Var;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.EventLog);
    }
}
