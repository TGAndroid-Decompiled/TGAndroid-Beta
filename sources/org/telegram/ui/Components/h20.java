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
public final class h20 extends c51 {
    public final g20 N1;
    public int O1;
    public final TLRPC.Chat P1;
    public final TLRPC.ChatFull Q1;
    public final ArrayList R1;
    public final ArrayList S1;
    public boolean T1;
    public final a0.h U1;
    public final a0.h V1;
    public boolean W1;
    public boolean X1;
    public final a0.h Y1;
    public final HashSet Z1;
    public org.telegram.ui.l10 f34137a2;
    public boolean f34138b2;
    public int f34139c2;
    public int d2;
    public int f34140e2;
    public int f34141f2;
    public int f34142g2;
    public int f34143h2;
    public int f34144i2;
    public int f34145j2;
    public int f34146k2;
    public int f34147l2;

    public h20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.R1 = new ArrayList();
        this.S1 = new ArrayList();
        this.U1 = new a0.h();
        this.V1 = new a0.h();
        this.f28699p0 = 75;
        this.P1 = chat;
        this.Q1 = chatFull;
        this.Y1 = hVar;
        this.Z1 = hashSet;
        this.n1.setOnItemClickListener(new j(this, 9));
        g20 g20Var = new g20(this, context);
        this.N1 = g20Var;
        this.f32464o1 = g20Var;
        bi.q1 q1Var = this.n1;
        d20 d20Var = new d20(this, context);
        this.f32465p1 = d20Var;
        q1Var.setAdapter(d20Var);
        if (!this.W1) {
            this.T1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.f40 f40Var = this.f34137a2.f47485a;
        if (!f40Var.f45569q2) {
            if (motionEvent.getX() > iVar.getLeft() && motionEvent.getX() < iVar.getRight() && motionEvent.getY() > iVar.getTop() && motionEvent.getY() < iVar.getBottom()) {
                f40Var.v1(f40Var.f45608y3, null, iVar, true);
            } else {
                f40Var.v1(f40Var.f45608y3, null, iVar, false);
            }
        }
    }

    @Override
    public final void L0(String str) {
        g20 g20Var = this.N1;
        jg.z1 z1Var = g20Var.d;
        h20 h20Var = g20Var.f33754x;
        e20 e20Var = g20Var.f33748e;
        if (e20Var != null) {
            org.telegram.messenger.g0.r(e20Var);
            g20Var.f33748e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = h20Var.P1;
        bi.q1 q1Var = h20Var.n1;
        z1Var.g(null, true, false, true, false, chat.f26960id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            h20Var.f32469t1.e(true, true);
            q1Var.W1 = false;
            q1Var.X1 = 0;
            g20Var.f();
            q1Var.W1 = true;
            q1Var.X1 = 0;
            g20Var.h = true;
            int i7 = g20Var.f33750n + 1;
            g20Var.f33750n = i7;
            e20 e20Var2 = new e20(g20Var, str, i7, 0);
            g20Var.f33748e = e20Var2;
            org.telegram.messenger.g0.i3(e20Var2, 300L);
            v4.g0 adapter = q1Var.getAdapter();
            oj0 oj0Var = h20Var.f32464o1;
            if (adapter != oj0Var) {
                q1Var.setAdapter(oj0Var);
                return;
            }
            return;
        }
        g20Var.f33750n = -1;
    }

    @Override
    public final void P0() {
        this.C1 = org.telegram.ui.ActionBar.m6.Dh;
        this.D1 = org.telegram.ui.ActionBar.m6.Sg;
        int i7 = org.telegram.ui.ActionBar.m6.f27826a;
        this.E1 = org.telegram.ui.ActionBar.m6.Tg;
        this.F1 = org.telegram.ui.ActionBar.m6.f27973hh;
        this.G1 = org.telegram.ui.ActionBar.m6.f27863bh;
        this.H1 = org.telegram.ui.ActionBar.m6.f27883ch;
        this.I1 = org.telegram.ui.ActionBar.m6.Zg;
        this.J1 = org.telegram.ui.ActionBar.m6.f27936fh;
        this.K1 = org.telegram.ui.ActionBar.m6.f27844ah;
    }

    public final void R0() {
        if (!this.f34138b2) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.g5.r(this.f28669a).f22612e0;
        ArrayList arrayList2 = this.S1;
        arrayList2.addAll(arrayList);
        long j3 = org.telegram.messenger.p10.i(this.f28669a).f24493n;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j10 == j3 || this.Y1.h(j10) >= 0 || this.Z1.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i7);
                    i7--;
                    size--;
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new jg.d(org.telegram.messenger.qp.s1(this.f28669a), ConnectionsManager.getInstance(this.f28669a).getCurrentTime(), 2));
    }

    public final void S0() {
        a0.h hVar;
        TLRPC.Chat chat = this.P1;
        boolean T = org.telegram.messenger.t3.T(chat);
        TLRPC.ChatFull chatFull = this.Q1;
        if (!T) {
            this.W1 = false;
            ArrayList arrayList = this.R1;
            arrayList.clear();
            this.S1.clear();
            a0.h hVar2 = this.U1;
            hVar2.b();
            this.V1.b();
            if (chatFull != null) {
                long j3 = org.telegram.messenger.p10.i(this.f28669a).f24493n;
                int size = chatFull.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((hVar = this.Y1) == null || hVar.h(j10) < 0)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.t10.x(a22) && !a22.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f34138b2 = true;
                    R0();
                }
            }
            T0();
            oj0 oj0Var = this.f32465p1;
            if (oj0Var != null) {
                oj0Var.f();
                return;
            }
            return;
        }
        this.W1 = true;
        bv0 bv0Var = this.f32469t1;
        if (bv0Var != null) {
            bv0Var.e(true, false);
        }
        oj0 oj0Var2 = this.f32465p1;
        if (oj0Var2 != null) {
            oj0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.T1) {
            this.O1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.T1 = true;
            S0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f26959q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ld(16, this, tL_channels_getParticipants));
    }

    public final void T0() {
        this.f34139c2 = -1;
        this.f34140e2 = -1;
        this.f34141f2 = -1;
        this.f34142g2 = -1;
        this.f34143h2 = -1;
        this.f34144i2 = -1;
        this.f34145j2 = -1;
        this.d2 = -1;
        boolean z9 = true;
        this.f34147l2 = 1;
        TLRPC.Chat chat = this.P1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i7 = this.f34147l2;
            this.f34147l2 = i7 + 1;
            this.f34139c2 = i7;
        }
        if (!this.W1 || this.X1) {
            ArrayList arrayList = this.S1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f34147l2;
                int i11 = i10 + 1;
                this.f34147l2 = i11;
                this.f34142g2 = i10;
                this.f34143h2 = i11;
                int size = arrayList.size() + i11;
                this.f34147l2 = size;
                this.f34144i2 = size;
            } else {
                z9 = false;
            }
            ArrayList arrayList2 = this.R1;
            if (!arrayList2.isEmpty()) {
                if (z9) {
                    int i12 = this.f34147l2;
                    this.f34147l2 = i12 + 1;
                    this.f34145j2 = i12;
                }
                int i13 = this.f34147l2;
                this.f34140e2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f34147l2 = size2;
                this.f34141f2 = size2;
            }
        }
        if (this.W1) {
            int i14 = this.f34147l2;
            this.f34147l2 = i14 + 1;
            this.f34146k2 = i14;
        }
        int i15 = this.f34147l2;
        this.f34147l2 = i15 + 1;
        this.d2 = i15;
    }
}
