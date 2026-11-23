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
public final class s20 extends q51 {
    public final r20 O1;
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
    public final HashSet f39467a2;
    public org.telegram.ui.j10 f39468b2;
    public boolean f39469c2;
    public int d2;
    public int f39470e2;
    public int f39471f2;
    public int f39472g2;
    public int f39473h2;
    public int f39474i2;
    public int f39475j2;
    public int f39476k2;
    public int f39477l2;
    public int f39478m2;

    public s20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.V1 = new a0.h();
        this.W1 = new a0.h();
        this.f30255q0 = 75;
        this.Q1 = chat;
        this.R1 = chatFull;
        this.Z1 = hVar;
        this.f39467a2 = hashSet;
        this.f38698o1.setOnItemClickListener(new n(this, 9));
        r20 r20Var = new r20(this, context);
        this.O1 = r20Var;
        this.f38699p1 = r20Var;
        di.b1 b1Var = this.f38698o1;
        o20 o20Var = new o20(this, context);
        this.f38700q1 = o20Var;
        b1Var.setAdapter(o20Var);
        if (!this.X1) {
            this.U1 = false;
            T0();
        }
        U0();
        N0(0.0f);
    }

    @Override
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.e40 e40Var = this.f39468b2.f48968a;
        if (!e40Var.f47391r2) {
            if (motionEvent.getX() > iVar.getLeft() && motionEvent.getX() < iVar.getRight() && motionEvent.getY() > iVar.getTop() && motionEvent.getY() < iVar.getBottom()) {
                e40Var.w1(e40Var.D3, null, iVar, true);
            } else {
                e40Var.w1(e40Var.D3, null, iVar, false);
            }
        }
    }

    @Override
    public final void M0(String str) {
        r20 r20Var = this.O1;
        jg.z1 z1Var = r20Var.d;
        s20 s20Var = r20Var.f39166x;
        p20 p20Var = r20Var.f39160e;
        if (p20Var != null) {
            org.telegram.messenger.g0.r(p20Var);
            r20Var.f39160e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = s20Var.Q1;
        di.b1 b1Var = s20Var.f38698o1;
        z1Var.g(null, true, false, true, false, chat.f28492id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            s20Var.f38704u1.e(true, true);
            b1Var.X1 = false;
            b1Var.Y1 = 0;
            r20Var.f();
            b1Var.X1 = true;
            b1Var.Y1 = 0;
            r20Var.h = true;
            int i7 = r20Var.f39162n + 1;
            r20Var.f39162n = i7;
            p20 p20Var2 = new p20(r20Var, str, i7, 0);
            r20Var.f39160e = p20Var2;
            org.telegram.messenger.g0.h3(p20Var2, 300L);
            v4.i0 adapter = b1Var.getAdapter();
            dk0 dk0Var = s20Var.f38699p1;
            if (adapter != dk0Var) {
                b1Var.setAdapter(dk0Var);
                return;
            }
            return;
        }
        r20Var.f39162n = -1;
    }

    @Override
    public final void Q0() {
        this.D1 = org.telegram.ui.ActionBar.n6.Gh;
        this.E1 = org.telegram.ui.ActionBar.n6.Vg;
        int i7 = org.telegram.ui.ActionBar.n6.f29386a;
        this.F1 = org.telegram.ui.ActionBar.n6.Wg;
        this.G1 = org.telegram.ui.ActionBar.n6.f29590kh;
        this.H1 = org.telegram.ui.ActionBar.n6.f29480eh;
        this.I1 = org.telegram.ui.ActionBar.n6.f29497fh;
        this.J1 = org.telegram.ui.ActionBar.n6.f29444ch;
        this.K1 = org.telegram.ui.ActionBar.n6.f29552ih;
        this.L1 = org.telegram.ui.ActionBar.n6.f29461dh;
    }

    public final void S0() {
        if (!this.f39469c2) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.i5.r(this.f30223a).f24693f0;
        ArrayList arrayList2 = this.T1;
        arrayList2.addAll(arrayList);
        long j3 = org.telegram.messenger.i10.i(this.f30223a).f24656n;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j10 == j3 || this.Z1.h(j10) >= 0 || this.f39467a2.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i7);
                    i7--;
                    size--;
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new jg.d(org.telegram.messenger.mp.u1(this.f30223a), ConnectionsManager.getInstance(this.f30223a).getCurrentTime(), 2));
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
                long j3 = org.telegram.messenger.i10.i(this.f30223a).f24656n;
                int size = chatFull.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((hVar = this.Z1) == null || hVar.h(j10) < 0)) {
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(this.f30223a).c2(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.n10.y(c22) && !c22.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f39469c2 = true;
                    S0();
                }
            }
            U0();
            dk0 dk0Var = this.f38700q1;
            if (dk0Var != null) {
                dk0Var.f();
                return;
            }
            return;
        }
        this.X1 = true;
        mv0 mv0Var = this.f38704u1;
        if (mv0Var != null) {
            mv0Var.e(true, false);
        }
        dk0 dk0Var2 = this.f38700q1;
        if (dk0Var2 != null) {
            dk0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.mp.k1(chat);
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
        tL_channels_getParticipants.filter.f28491q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.v7(18, this, tL_channels_getParticipants));
    }

    public final void U0() {
        this.d2 = -1;
        this.f39471f2 = -1;
        this.f39472g2 = -1;
        this.f39473h2 = -1;
        this.f39474i2 = -1;
        this.f39475j2 = -1;
        this.f39476k2 = -1;
        this.f39470e2 = -1;
        boolean z10 = true;
        this.f39478m2 = 1;
        TLRPC.Chat chat = this.Q1;
        if (org.telegram.messenger.v3.t0(chat) || org.telegram.messenger.v3.y(3, chat)) {
            int i7 = this.f39478m2;
            this.f39478m2 = i7 + 1;
            this.d2 = i7;
        }
        if (!this.X1 || this.Y1) {
            ArrayList arrayList = this.T1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f39478m2;
                int i11 = i10 + 1;
                this.f39478m2 = i11;
                this.f39473h2 = i10;
                this.f39474i2 = i11;
                int size = arrayList.size() + i11;
                this.f39478m2 = size;
                this.f39475j2 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.S1;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.f39478m2;
                    this.f39478m2 = i12 + 1;
                    this.f39476k2 = i12;
                }
                int i13 = this.f39478m2;
                this.f39471f2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f39478m2 = size2;
                this.f39472g2 = size2;
            }
        }
        if (this.X1) {
            int i14 = this.f39478m2;
            this.f39478m2 = i14 + 1;
            this.f39477l2 = i14;
        }
        int i15 = this.f39478m2;
        this.f39478m2 = i15 + 1;
        this.f39470e2 = i15;
    }
}
