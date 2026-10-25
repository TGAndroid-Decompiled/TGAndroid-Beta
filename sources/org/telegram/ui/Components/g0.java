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
public final class g0 extends bb {
    public j71 X;
    public TLRPC.TL_channelAdminLogEventsFilter Y;
    public ArrayList Z;
    public a0.h f28347a0;
    public final boolean f28348b0;
    public final bi.sc f28349c0;
    public boolean f28350d0;
    public boolean f28351e0;
    public boolean f28352f0;
    public org.telegram.ui.ab f28353g0;
    public int f28354h0;

    public g0(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(r2Var.getContext(), r2Var, false, true, 2, r2Var.getResourceProvider());
        this.Y = new TLRPC.TL_channelAdminLogEventsFilter();
        this.f28350d0 = false;
        this.f28351e0 = false;
        this.f28352f0 = false;
        this.v = 0.35f;
        fixNavigationBar();
        int i10 = org.telegram.ui.ActionBar.y6.f23445i5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider);
        this.f28354h0 = w02;
        setBackgroundColor(w02);
        K();
        this.f26814y = true;
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
            this.f28347a0 = hVar.clone();
        }
        this.f28348b0 = z10;
        this.X.O(false);
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new s(this, 1));
        bi.sc scVar = new bi.sc(getContext(), this.resourcesProvider, (mm0) null);
        this.f28349c0 = scVar;
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.ActionBar.f7.i(i10, scVar, this.resourcesProvider);
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        dVar.f();
        dVar.i(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        scVar.addView(dVar, gb1.u(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(scVar, gb1.j(-2.0f, 87, i11, 0, i11, 0));
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.u1();
    }

    public static void P(org.telegram.ui.Components.g0 r8, android.view.View r9, int r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g0.P(org.telegram.ui.Components.g0, android.view.View, int, float):void");
    }

    public final void Q(ArrayList arrayList, j71 j71Var) {
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
            arrayList.add(t61.C(null));
            ic.a.p(R.string.EventLogFilterByActions, arrayList);
            boolean z19 = this.f28348b0;
            if (z19) {
                i10 = R.string.EventLogFilterSectionMembers;
            } else {
                i10 = R.string.EventLogFilterSectionSubscribers;
            }
            t61 A = t61.A(R(0), LocaleController.getString(i10), 2);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Y;
            if (!tL_channelAdminLogEventsFilter.promote && !tL_channelAdminLogEventsFilter.demote && ((!z19 || (!tL_channelAdminLogEventsFilter.kick && !tL_channelAdminLogEventsFilter.ban && !tL_channelAdminLogEventsFilter.unkick && !tL_channelAdminLogEventsFilter.unban)) && !tL_channelAdminLogEventsFilter.invite && !tL_channelAdminLogEventsFilter.join && !tL_channelAdminLogEventsFilter.leave && !tL_channelAdminLogEventsFilter.edit_rank)) {
                z10 = false;
            } else {
                z10 = true;
            }
            A.L(z10);
            A.f32867f = !this.f28350d0;
            A.D = new ai.w(this, 0, 10);
            arrayList.add(A);
            if (this.f28350d0) {
                t61 z20 = t61.z(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
                z20.f32869i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Y;
                if (!tL_channelAdminLogEventsFilter2.promote && !tL_channelAdminLogEventsFilter2.demote) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                z20.L(z16);
                arrayList.add(z20);
                if (z19) {
                    t61 z21 = t61.z(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                    z21.f32869i = 1;
                    TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Y;
                    if (!tL_channelAdminLogEventsFilter3.kick && !tL_channelAdminLogEventsFilter3.ban && !tL_channelAdminLogEventsFilter3.unkick && !tL_channelAdminLogEventsFilter3.unban) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    z21.L(z18);
                    arrayList.add(z21);
                }
                if (z19) {
                    i13 = R.string.EventLogFilterNewMembers;
                } else {
                    i13 = R.string.EventLogFilterNewSubscribers;
                }
                t61 z22 = t61.z(5, LocaleController.getString(i13));
                z22.f32869i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.Y;
                if (!tL_channelAdminLogEventsFilter4.invite && !tL_channelAdminLogEventsFilter4.join) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                z22.L(z17);
                arrayList.add(z22);
                if (z19) {
                    i14 = R.string.EventLogFilterLeavingMembers2;
                } else {
                    i14 = R.string.EventLogFilterLeavingSubscribers2;
                }
                t61 z23 = t61.z(6, LocaleController.getString(i14));
                z23.f32869i = 1;
                z23.L(this.Y.leave);
                arrayList.add(z23);
                if (z19) {
                    t61 z24 = t61.z(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                    z24.f32869i = 1;
                    z24.L(this.Y.edit_rank);
                    arrayList.add(z24);
                }
            }
            if (z19) {
                i11 = R.string.EventLogFilterSectionGroupSettings;
            } else {
                i11 = R.string.EventLogFilterSectionChannelSettings;
            }
            t61 A2 = t61.A(R(1), LocaleController.getString(i11), 8);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.Y;
            if (!tL_channelAdminLogEventsFilter5.info && !tL_channelAdminLogEventsFilter5.settings && !tL_channelAdminLogEventsFilter5.invites && !tL_channelAdminLogEventsFilter5.group_call) {
                z11 = false;
            } else {
                z11 = true;
            }
            A2.L(z11);
            A2.f32867f = !this.f28351e0;
            A2.D = new ai.w(this, 1, 10);
            arrayList.add(A2);
            if (this.f28351e0) {
                if (z19) {
                    i12 = R.string.EventLogFilterGroupInfo;
                } else {
                    i12 = R.string.EventLogFilterChannelInfo;
                }
                t61 z25 = t61.z(9, LocaleController.getString(i12));
                z25.f32869i = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.Y;
                if (!tL_channelAdminLogEventsFilter6.info && !tL_channelAdminLogEventsFilter6.settings) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                z25.L(z15);
                arrayList.add(z25);
                t61 z26 = t61.z(10, LocaleController.getString(R.string.EventLogFilterInvites));
                z26.f32869i = 1;
                z26.L(this.Y.invites);
                arrayList.add(z26);
                t61 z27 = t61.z(11, LocaleController.getString(R.string.EventLogFilterCalls));
                z27.f32869i = 1;
                z27.L(this.Y.group_call);
                arrayList.add(z27);
            }
            t61 A3 = t61.A(R(2), LocaleController.getString(R.string.EventLogFilterSectionMessages), 12);
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.Y;
            if (!tL_channelAdminLogEventsFilter7.delete && !tL_channelAdminLogEventsFilter7.edit && !tL_channelAdminLogEventsFilter7.pinned) {
                z12 = false;
            } else {
                z12 = true;
            }
            A3.L(z12);
            A3.f32867f = !this.f28352f0;
            A3.D = new ai.w(this, 2, 10);
            arrayList.add(A3);
            if (this.f28352f0) {
                t61 z28 = t61.z(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
                z28.f32869i = 1;
                z28.L(this.Y.delete);
                arrayList.add(z28);
                t61 z29 = t61.z(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
                z29.f32869i = 1;
                z29.L(this.Y.edit);
                arrayList.add(z29);
                t61 z30 = t61.z(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
                z30.f32869i = 1;
                z30.L(this.Y.pinned);
                arrayList.add(z30);
            }
            arrayList.add(t61.C(null));
            ic.a.p(R.string.EventLogFilterByAdmins, arrayList);
            t61 z31 = t61.z(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
            a0.h hVar = this.f28347a0;
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
            z31.L(z13);
            arrayList.add(z31);
            if (this.Z != null) {
                for (int i15 = 0; i15 < this.Z.size(); i15++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.Z.get(i15)).peer);
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    t61 t61Var = new t61(37);
                    t61Var.d = (-1) - i15;
                    t61Var.G = user;
                    t61Var.f32869i = 1;
                    a0.h hVar2 = this.f28347a0;
                    if (hVar2 != null && hVar2.d(peerDialogId)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t61Var.L(z14);
                    arrayList.add(t61Var);
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
        boolean z10 = this.f28348b0;
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
        if (arrayList != null && this.f28347a0 == null) {
            this.f28347a0 = new a0.h();
            ArrayList arrayList2 = this.Z;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.f28347a0.k(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        j71 j71Var = this.X;
        if (j71Var != null) {
            j71Var.O(true);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.d.canScrollVertically(-1);
    }

    @Override
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.f28349c0.setTranslationY(-f7);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23445i5, this.resourcesProvider);
            if (w02 != this.f28354h0) {
                this.f28354h0 = w02;
                setBackgroundColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 3), this.resourcesProvider);
        this.X = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.EventLog);
    }
}
