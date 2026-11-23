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
public final class v20 extends r51 {
    public final u20 O1;
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
    public final HashSet f40654a2;
    public org.telegram.ui.k10 f40655b2;
    public boolean f40656c2;
    public int d2;
    public int f40657e2;
    public int f40658f2;
    public int f40659g2;
    public int f40660h2;
    public int f40661i2;
    public int f40662j2;
    public int f40663k2;
    public int f40664l2;
    public int f40665m2;

    public v20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.V1 = new a0.h();
        this.W1 = new a0.h();
        this.f30205q0 = 75;
        this.Q1 = chat;
        this.R1 = chatFull;
        this.Z1 = hVar;
        this.f40654a2 = hashSet;
        this.f39081o1.setOnItemClickListener(new o(this, 9));
        u20 u20Var = new u20(this, context);
        this.O1 = u20Var;
        this.f39082p1 = u20Var;
        di.b1 b1Var = this.f39081o1;
        r20 r20Var = new r20(this, context);
        this.f39083q1 = r20Var;
        b1Var.setAdapter(r20Var);
        if (!this.X1) {
            this.U1 = false;
            T0();
        }
        U0();
        N0(0.0f);
    }

    @Override
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.f40 f40Var = this.f40655b2.f49172a;
        if (!f40Var.f47541r2) {
            if (motionEvent.getX() > iVar.getLeft() && motionEvent.getX() < iVar.getRight() && motionEvent.getY() > iVar.getTop() && motionEvent.getY() < iVar.getBottom()) {
                f40Var.w1(f40Var.D3, null, iVar, true);
            } else {
                f40Var.w1(f40Var.D3, null, iVar, false);
            }
        }
    }

    @Override
    public final void M0(String str) {
        u20 u20Var = this.O1;
        jg.z1 z1Var = u20Var.d;
        v20 v20Var = u20Var.f40216x;
        s20 s20Var = u20Var.f40210e;
        if (s20Var != null) {
            org.telegram.messenger.g0.r(s20Var);
            u20Var.f40210e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = v20Var.Q1;
        di.b1 b1Var = v20Var.f39081o1;
        z1Var.g(null, true, false, true, false, chat.f28434id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            v20Var.f39087u1.e(true, true);
            b1Var.X1 = false;
            b1Var.Y1 = 0;
            u20Var.f();
            b1Var.X1 = true;
            b1Var.Y1 = 0;
            u20Var.h = true;
            int i7 = u20Var.f40212n + 1;
            u20Var.f40212n = i7;
            s20 s20Var2 = new s20(u20Var, str, i7, 0);
            u20Var.f40210e = s20Var2;
            org.telegram.messenger.g0.h3(s20Var2, 300L);
            v4.i0 adapter = b1Var.getAdapter();
            dk0 dk0Var = v20Var.f39082p1;
            if (adapter != dk0Var) {
                b1Var.setAdapter(dk0Var);
                return;
            }
            return;
        }
        u20Var.f40212n = -1;
    }

    @Override
    public final void Q0() {
        this.D1 = org.telegram.ui.ActionBar.m6.Gh;
        this.E1 = org.telegram.ui.ActionBar.m6.Vg;
        int i7 = org.telegram.ui.ActionBar.m6.f29316a;
        this.F1 = org.telegram.ui.ActionBar.m6.Wg;
        this.G1 = org.telegram.ui.ActionBar.m6.f29520kh;
        this.H1 = org.telegram.ui.ActionBar.m6.f29410eh;
        this.I1 = org.telegram.ui.ActionBar.m6.f29427fh;
        this.J1 = org.telegram.ui.ActionBar.m6.f29374ch;
        this.K1 = org.telegram.ui.ActionBar.m6.f29482ih;
        this.L1 = org.telegram.ui.ActionBar.m6.f29391dh;
    }

    public final void S0() {
        if (!this.f40656c2) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.i5.r(this.f30173a).f24605f0;
        ArrayList arrayList2 = this.T1;
        arrayList2.addAll(arrayList);
        long j3 = org.telegram.messenger.k10.i(this.f30173a).f24987n;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j10 == j3 || this.Z1.h(j10) >= 0 || this.f40654a2.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i7);
                    i7--;
                    size--;
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new jg.d(org.telegram.messenger.np.u1(this.f30173a), ConnectionsManager.getInstance(this.f30173a).getCurrentTime(), 2));
    }

    public final void T0() {
        a0.h hVar;
        TLRPC.Chat chat = this.Q1;
        boolean T = org.telegram.messenger.v3.T(chat);
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
                long j3 = org.telegram.messenger.k10.i(this.f30173a).f24987n;
                int size = chatFull.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((hVar = this.Z1) == null || hVar.h(j10) < 0)) {
                        TLRPC.User c22 = org.telegram.messenger.np.u1(this.f30173a).c2(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.p10.y(c22) && !c22.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f40656c2 = true;
                    S0();
                }
            }
            U0();
            dk0 dk0Var = this.f39083q1;
            if (dk0Var != null) {
                dk0Var.f();
                return;
            }
            return;
        }
        this.X1 = true;
        nv0 nv0Var = this.f39087u1;
        if (nv0Var != null) {
            nv0Var.e(true, false);
        }
        dk0 dk0Var2 = this.f39083q1;
        if (dk0Var2 != null) {
            dk0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.np.k1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.U1) {
            this.P1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.U1 = true;
            T0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f28433q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.u7(18, this, tL_channels_getParticipants));
    }

    public final void U0() {
        this.d2 = -1;
        this.f40658f2 = -1;
        this.f40659g2 = -1;
        this.f40660h2 = -1;
        this.f40661i2 = -1;
        this.f40662j2 = -1;
        this.f40663k2 = -1;
        this.f40657e2 = -1;
        boolean z10 = true;
        this.f40665m2 = 1;
        TLRPC.Chat chat = this.Q1;
        if (org.telegram.messenger.v3.t0(chat) || org.telegram.messenger.v3.y(3, chat)) {
            int i7 = this.f40665m2;
            this.f40665m2 = i7 + 1;
            this.d2 = i7;
        }
        if (!this.X1 || this.Y1) {
            ArrayList arrayList = this.T1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f40665m2;
                int i11 = i10 + 1;
                this.f40665m2 = i11;
                this.f40660h2 = i10;
                this.f40661i2 = i11;
                int size = arrayList.size() + i11;
                this.f40665m2 = size;
                this.f40662j2 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.S1;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.f40665m2;
                    this.f40665m2 = i12 + 1;
                    this.f40663k2 = i12;
                }
                int i13 = this.f40665m2;
                this.f40658f2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f40665m2 = size2;
                this.f40659g2 = size2;
            }
        }
        if (this.X1) {
            int i14 = this.f40665m2;
            this.f40665m2 = i14 + 1;
            this.f40664l2 = i14;
        }
        int i15 = this.f40665m2;
        this.f40665m2 = i15 + 1;
        this.f40657e2 = i15;
    }
}
