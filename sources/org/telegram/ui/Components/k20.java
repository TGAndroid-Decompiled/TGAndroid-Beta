package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k20 extends e51 {
    public final j20 O1;
    public int P1;
    public final TLRPC.Chat Q1;
    public final TLRPC.ChatFull R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public boolean U1;
    public final a0.h V1;
    public final a0.h W1;
    public boolean X1;
    public boolean Y1;
    public final a0.h Z1;
    public final HashSet f36242a2;
    public org.telegram.ui.h10 f36243b2;
    public boolean f36244c2;
    public int d2;
    public int f36245e2;
    public int f36246f2;
    public int f36247g2;
    public int f36248h2;
    public int f36249i2;
    public int f36250j2;
    public int f36251k2;
    public int f36252l2;
    public int f36253m2;

    public k20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.V1 = new a0.h();
        this.W1 = new a0.h();
        this.f29711q0 = 75;
        this.Q1 = chat;
        this.R1 = chatFull;
        this.Z1 = hVar;
        this.f36242a2 = hashSet;
        this.f34191o1.setOnItemClickListener(new j(this, 9));
        j20 j20Var = new j20(this, context);
        this.O1 = j20Var;
        this.f34192p1 = j20Var;
        di.c1 c1Var = this.f34191o1;
        g20 g20Var = new g20(this, context);
        this.f34193q1 = g20Var;
        c1Var.setAdapter(g20Var);
        if (!this.X1) {
            this.U1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.c40 c40Var = this.f36243b2.f47572a;
        if (!c40Var.f45955r2) {
            if (motionEvent.getX() > iVar.getLeft() && motionEvent.getX() < iVar.getRight() && motionEvent.getY() > iVar.getTop() && motionEvent.getY() < iVar.getBottom()) {
                c40Var.v1(c40Var.D3, null, iVar, true);
            } else {
                c40Var.v1(c40Var.D3, null, iVar, false);
            }
        }
    }

    @Override
    public final void L0(String str) {
        j20 j20Var = this.O1;
        jg.z1 z1Var = j20Var.d;
        k20 k20Var = j20Var.f35830x;
        h20 h20Var = j20Var.f35824e;
        if (h20Var != null) {
            org.telegram.messenger.g0.r(h20Var);
            j20Var.f35824e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = k20Var.Q1;
        di.c1 c1Var = k20Var.f34191o1;
        z1Var.g(null, true, false, true, false, chat.f28051id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            k20Var.f34197u1.e(true, true);
            c1Var.X1 = false;
            c1Var.Y1 = 0;
            j20Var.f();
            c1Var.X1 = true;
            c1Var.Y1 = 0;
            j20Var.h = true;
            int i7 = j20Var.f35826n + 1;
            j20Var.f35826n = i7;
            h20 h20Var2 = new h20(j20Var, str, i7, 0);
            j20Var.f35824e = h20Var2;
            org.telegram.messenger.g0.i3(h20Var2, 300L);
            v4.h0 adapter = c1Var.getAdapter();
            tj0 tj0Var = k20Var.f34192p1;
            if (adapter != tj0Var) {
                c1Var.setAdapter(tj0Var);
                return;
            }
            return;
        }
        j20Var.f35826n = -1;
    }

    @Override
    public final void P0() {
        this.D1 = org.telegram.ui.ActionBar.j6.Gh;
        this.E1 = org.telegram.ui.ActionBar.j6.Vg;
        int i7 = org.telegram.ui.ActionBar.j6.f28784a;
        this.F1 = org.telegram.ui.ActionBar.j6.Wg;
        this.G1 = org.telegram.ui.ActionBar.j6.f28988kh;
        this.H1 = org.telegram.ui.ActionBar.j6.f28878eh;
        this.I1 = org.telegram.ui.ActionBar.j6.f28895fh;
        this.J1 = org.telegram.ui.ActionBar.j6.f28842ch;
        this.K1 = org.telegram.ui.ActionBar.j6.f28950ih;
        this.L1 = org.telegram.ui.ActionBar.j6.f28859dh;
    }

    public final void R0() {
        if (!this.f36244c2) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.g5.r(this.f29679a).f23681f0;
        ArrayList arrayList2 = this.T1;
        arrayList2.addAll(arrayList);
        long j3 = org.telegram.messenger.m10.i(this.f29679a).f24959n;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j10 == j3 || this.Z1.h(j10) >= 0 || this.f36242a2.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i7);
                    i7--;
                    size--;
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new jg.d(org.telegram.messenger.np.s1(this.f29679a), ConnectionsManager.getInstance(this.f29679a).getCurrentTime(), 2));
    }

    public final void S0() {
        a0.h hVar;
        TLRPC.Chat chat = this.Q1;
        boolean T = org.telegram.messenger.t3.T(chat);
        TLRPC.ChatFull chatFull = this.R1;
        if (!T) {
            this.X1 = false;
            ArrayList arrayList = this.S1;
            arrayList.clear();
            this.T1.clear();
            a0.h hVar2 = this.V1;
            hVar2.b();
            this.W1.b();
            if (chatFull != null) {
                long j3 = org.telegram.messenger.m10.i(this.f29679a).f24959n;
                int size = chatFull.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((hVar = this.Z1) == null || hVar.h(j10) < 0)) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.q10.x(a22) && !a22.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f36244c2 = true;
                    R0();
                }
            }
            T0();
            tj0 tj0Var = this.f34193q1;
            if (tj0Var != null) {
                tj0Var.f();
                return;
            }
            return;
        }
        this.X1 = true;
        cv0 cv0Var = this.f34197u1;
        if (cv0Var != null) {
            cv0Var.e(true, false);
        }
        tj0 tj0Var2 = this.f34193q1;
        if (tj0Var2 != null) {
            tj0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.np.i1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.U1) {
            this.P1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.U1 = true;
            S0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f28050q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.v7(18, this, tL_channels_getParticipants));
    }

    public final void T0() {
        this.d2 = -1;
        this.f36246f2 = -1;
        this.f36247g2 = -1;
        this.f36248h2 = -1;
        this.f36249i2 = -1;
        this.f36250j2 = -1;
        this.f36251k2 = -1;
        this.f36245e2 = -1;
        boolean z10 = true;
        this.f36253m2 = 1;
        TLRPC.Chat chat = this.Q1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i7 = this.f36253m2;
            this.f36253m2 = i7 + 1;
            this.d2 = i7;
        }
        if (!this.X1 || this.Y1) {
            ArrayList arrayList = this.T1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f36253m2;
                int i11 = i10 + 1;
                this.f36253m2 = i11;
                this.f36248h2 = i10;
                this.f36249i2 = i11;
                int size = arrayList.size() + i11;
                this.f36253m2 = size;
                this.f36250j2 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.S1;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.f36253m2;
                    this.f36253m2 = i12 + 1;
                    this.f36251k2 = i12;
                }
                int i13 = this.f36253m2;
                this.f36246f2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f36253m2 = size2;
                this.f36247g2 = size2;
            }
        }
        if (this.X1) {
            int i14 = this.f36253m2;
            this.f36253m2 = i14 + 1;
            this.f36252l2 = i14;
        }
        int i15 = this.f36253m2;
        this.f36253m2 = i15 + 1;
        this.f36245e2 = i15;
    }
}
