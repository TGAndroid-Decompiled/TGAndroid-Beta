package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lr extends na {
    public static final int f35802z2 = 0;
    public m41 P1;
    public final TLRPC.Chat Q1;
    public final TLRPC.Chat R1;
    public final boolean S1;
    public final ArrayList T1;
    public final long U1;
    public final int V1;
    public final int W1;
    public final Runnable X1;
    public boolean Y1;
    public final boolean Z1;
    public final kr f35803a2;
    public final kr f35804b2;
    public final kr f35805c2;
    public final kr d2;
    public final boolean[] f35806e2;
    public final boolean[] f35807f2;
    public final boolean f35808g2;
    public boolean f35809h2;
    public final long f35810i2;
    public TL_communities.ParticipantJoinedChats f35811j2;
    public int[] f35812k2;
    public boolean f35813l2;
    public boolean f35814m2;
    public final TLRPC.TL_chatBannedRights f35815n2;
    public final TLRPC.TL_chatBannedRights f35816o2;
    public final ArrayList f35817p2;
    public boolean f35818q2;
    public final boolean f35819r2;
    public final boolean f35820s2;
    public boolean f35821t2;
    public boolean f35822u2;
    public boolean f35823v2;
    public boolean f35824w2;
    public float f35825x2;
    public int f35826y2;

    public lr(org.telegram.ui.ActionBar.f2 r21, org.telegram.tgnet.TLRPC.Chat r22, java.util.ArrayList r23, java.util.ArrayList r24, org.telegram.tgnet.TLRPC.ChannelParticipant[] r25, long r26, int r28, int r29, boolean r30, java.lang.Runnable r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lr.<init>(org.telegram.ui.ActionBar.f2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void d1(lr lrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            lrVar.f35812k2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(lrVar.T1).filter(new ir(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            lrVar.f35813l2 = false;
            lrVar.f35814m2 = true;
            lrVar.c1();
        }
    }

    @Override
    public final boolean J0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.f28621a, this.f36305o1.getClassGuid(), true, new dr(this, 0), this.I0);
        this.P1 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        boolean[] zArr;
        if (this.f35820s2) {
            if (this.f35822u2) {
                return org.telegram.messenger.id.M0(2131751523, null);
            }
            if (this.f35823v2) {
                return org.telegram.messenger.id.M0(2131751505, null);
            }
            return org.telegram.messenger.id.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.T1;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        iArr[0] = i7;
        int[] iArr2 = this.f35812k2;
        if (iArr2 != null && this.f35814m2) {
            if (this.f35819r2) {
                if (this.f35822u2) {
                    for (int i10 : iArr2) {
                        iArr[0] = iArr[0] + i10;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    kr krVar = this.f35804b2;
                    if (i11 >= krVar.f35461g) {
                        break;
                    }
                    if (krVar.d[i11] && ((zArr = krVar.f35459e) == null || zArr[i11])) {
                        TLObject tLObject = (TLObject) krVar.f35458c.get(i11);
                        iArr[0] = iArr[0] + this.f35812k2[i11];
                    }
                    i11++;
                }
            }
        }
        return org.telegram.messenger.id.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override
    public final void dismiss() {
        boolean z9;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.f28621a).f24774e7.edit();
        edit.putBoolean("delete_report", this.f35803a2.a());
        edit.putBoolean("delete_deleteAll", this.f35804b2.a());
        if (!this.Y1 && this.d2.a()) {
            z9 = true;
        } else {
            z9 = false;
        }
        edit.putBoolean("delete_ban", z9);
        edit.apply();
        super.dismiss();
    }

    @Override
    public final void e0() {
        Rect rect = org.telegram.messenger.g0.Q;
        qj0 qj0Var = this.f36303k1;
        rect.set(0, 0, qj0Var.getMeasuredWidth(), qj0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        qj0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f35815n2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void f1(ArrayList arrayList, kr krVar) {
        boolean z9;
        boolean e10 = krVar.e();
        int i7 = krVar.f35461g;
        int i10 = krVar.f35456a;
        if (e10) {
            boolean z10 = false;
            if (!krVar.d()) {
                y31 z11 = y31.z(i10, krVar.f35457b);
                if (krVar.f35462i > 0) {
                    z10 = true;
                }
                z11.L(z10);
                arrayList.add(z11);
                return;
            }
            String str = krVar.f35457b;
            int i11 = krVar.f35462i;
            if (i11 <= 0) {
                if (krVar.f35459e != null) {
                    i11 = krVar.h;
                } else {
                    i11 = i7;
                }
            }
            String valueOf = String.valueOf(i11);
            y31 y31Var = new y31(36);
            y31Var.d = i10;
            y31Var.f40568l = str;
            y31Var.f40571o = valueOf;
            if (krVar.f35462i > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            y31Var.L(z9);
            y31Var.f40563f = krVar.f35460f;
            y31Var.D = new lk(6, this, krVar);
            arrayList.add(y31Var);
            if (!krVar.f35460f) {
                for (int i12 = 0; i12 < i7; i12++) {
                    boolean[] zArr = krVar.f35459e;
                    if (zArr == null || zArr[i12]) {
                        y31 y31Var2 = new y31(37);
                        y31Var2.d = (i10 << 24) | i12;
                        y31Var2.G = (TLObject) krVar.f35458c.get(i12);
                        y31Var2.L(krVar.d[i12]);
                        y31Var2.f40565i = 1;
                        arrayList.add(y31Var2);
                    }
                }
            }
        }
    }

    public final void g1() {
        if (this.f35814m2) {
            c1();
        } else if (!this.f35813l2) {
            this.f35813l2 = true;
            kr krVar = this.f35804b2;
            int i7 = krVar.f35461g;
            this.f35812k2 = new int[i7];
            int[] iArr = {i7};
            for (int i10 = 0; i10 < krVar.f35461g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.qp.l1(this.Q1);
                tL_messages_search.f27067q = "";
                TLRPC.InputPeer k12 = org.telegram.messenger.qp.k1((TLObject) krVar.f35458c.get(i10));
                tL_messages_search.from_id = k12;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_messages_search, new di.j8(this, k12, i10, iArr, 4));
            }
        }
    }

    public final void h1() {
        boolean z9;
        boolean z10;
        boolean z11 = this.Y1;
        boolean z12 = false;
        kr krVar = this.d2;
        if (z11 && krVar.e()) {
            if (krVar.f35462i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f35824w2 = z10;
        }
        if (this.Y1 && krVar.e() && krVar.f35462i == 0) {
            krVar.f();
        } else if (!this.Y1 && krVar.e()) {
            boolean z13 = this.f35824w2;
            if (krVar.f35462i > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z13 != z9) {
                krVar.f();
            }
        }
        if (!this.Y1 && krVar.e()) {
            if (krVar.f35462i > 0) {
                z12 = true;
            }
            this.f35824w2 = z12;
        }
    }

    public final void i1(boolean z9) {
        boolean z10;
        int i7;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        boolean z11;
        int i10;
        String str;
        long j3 = this.f35810i2;
        boolean z12 = true;
        if (z9 && this.f35809h2 && (participantJoinedChats = this.f35811j2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.I0;
            int i11 = this.f28621a;
            ArrayList<Long> arrayList = this.f35811j2.creator_chat_ids;
            fr frVar = new fr(this, 6);
            er erVar = new er(this, 0);
            Pattern pattern = v4.f38913a;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
            int i12 = 0;
            String M0 = org.telegram.messenger.id.M0(2131751955, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.m5.s(i11, j3)));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753729, null), new u(erVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder.o(f10);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                i13++;
                Long l11 = l10;
                LinearLayout linearLayout = f10;
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(l11);
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i11).N0(longValue);
                if (M02 == null) {
                    f10 = linearLayout;
                    u1VarArr = u1VarArr2;
                } else {
                    bi.s1 s1Var = new bi.s1(context, g6Var, z12);
                    int i14 = size;
                    ((TextView) s1Var.f4662b).setText(org.telegram.messenger.m5.m(M02));
                    TextView textView = (TextView) s1Var.d;
                    if (N0 != null) {
                        int i15 = N0.participants_count;
                        int i16 = i12;
                        i10 = i13;
                        z11 = i16;
                        str = org.telegram.messenger.id.G(i15, "Members", new Object[i16]);
                    } else {
                        z11 = i12;
                        i10 = i13;
                        str = null;
                    }
                    textView.setText(str);
                    ((l9) s1Var.f4663c).e(M02, new w8(M02));
                    s1Var.setBackground(org.telegram.ui.ActionBar.l6.N0(z11));
                    s1Var.setOnClickListener(new bi.p3(u1VarArr2, frVar, longValue, 2));
                    linearLayout.addView(s1Var, c8.ha.o(-1, -2));
                    u1Var = u1Var;
                    f10 = linearLayout;
                    i13 = i10;
                    u1VarArr = u1VarArr2;
                    size = i14;
                    i12 = z11;
                    z12 = true;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
            u1VarArr[i12] = u1Var2;
            u1Var2.show();
            TextView textView2 = (TextView) u1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28106q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.X1;
        if (runnable != null) {
            runnable.run();
        }
        kr krVar = this.f35803a2;
        String str2 = "";
        if (krVar.f35462i > 0) {
            str2 = "" + org.telegram.messenger.id.G(krVar.f35462i, "UsersReported", new Object[0]);
        }
        kr krVar2 = this.d2;
        if (krVar2.f35462i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = rf.b.r(str2, "\n");
            }
            if (this.Y1) {
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(org.telegram.messenger.id.G(krVar2.f35462i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str2);
                m11.append(org.telegram.messenger.id.G(krVar2.f35462i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z13 = this.f35820s2;
        if (z13 && !this.f35822u2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (krVar2.f35462i > 0) {
            i7 = 2131624048;
        } else {
            i7 = 2131623989;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i17 = 2131748460;
        org.telegram.ui.ActionBar.f2 f2Var = this.f36305o1;
        if (isEmpty) {
            hc a02 = hc.a0(f2Var);
            if (z10) {
                i17 = 2131746381;
            }
            org.telegram.messenger.k5.o(null, i17, a02, i7, 36);
        } else {
            hc a03 = hc.a0(f2Var);
            if (z10) {
                i17 = 2131746381;
            }
            a03.I(i7, org.telegram.messenger.id.M0(i17, null), str2).j();
        }
        if (j3 != 0 && this.f35809h2) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f28621a);
            long j10 = this.R1.f26956id;
            jh.b bVar = new jh.b(4);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s12.h1(j10);
            tL_communities_toggleParticipantBanned.participant = s12.j1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.p9(s12, j10, bVar));
        }
        ArrayList arrayList2 = this.T1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final lr f34043b;

            {
                this.f34043b = this;
            }

            public Predicate and(Predicate predicate) {
                int i18 = r2;
                return Predicate$CC.$default$and(this, predicate);
            }

            public Predicate negate() {
                switch (r2) {
                    case 0:
                        return Predicate$CC.$default$negate(this);
                    case 1:
                        return Predicate$CC.$default$negate(this);
                    default:
                        return Predicate$CC.$default$negate(this);
                }
            }

            public Predicate or(Predicate predicate) {
                int i18 = r2;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                switch (r2) {
                    case 0:
                        long j11 = this.f34043b.U1;
                        TLRPC.Peer peer = ijVar.f23262k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar = this.f34043b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ijVar.f23262k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = lrVar.U1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        lr lrVar2 = this.f34043b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ijVar.f23262k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-lrVar2.U1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.nk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final lr f34043b;

            {
                this.f34043b = this;
            }

            public Predicate and(Predicate predicate) {
                int i18 = r2;
                return Predicate$CC.$default$and(this, predicate);
            }

            public Predicate negate() {
                switch (r2) {
                    case 0:
                        return Predicate$CC.$default$negate(this);
                    case 1:
                        return Predicate$CC.$default$negate(this);
                    default:
                        return Predicate$CC.$default$negate(this);
                }
            }

            public Predicate or(Predicate predicate) {
                int i18 = r2;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                switch (r2) {
                    case 0:
                        long j11 = this.f34043b.U1;
                        TLRPC.Peer peer = ijVar.f23262k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar = this.f34043b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ijVar.f23262k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = lrVar.U1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        lr lrVar2 = this.f34043b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ijVar.f23262k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-lrVar2.U1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.nk(1)));
        TLRPC.Chat chat = this.Q1;
        kr krVar3 = this.f35804b2;
        if (z13) {
            if (!this.f35823v2) {
                krVar3.b(new hr(this, arrayList3, arrayList4, 0));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.qp.s1(this.f28621a).Z(arrayList3, null, null, -chat.f26956id, this.V1, false, this.W1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.qp.s1(this.f28621a).Z(arrayList4, null, null, this.U1, this.V1, true, this.W1);
            }
        }
        krVar2.c(new fr(this, 4));
        for (int i18 = 0; i18 < krVar.f35461g; i18++) {
            if (krVar.d[i18] && ((zArr = krVar.f35459e) == null || zArr[i18])) {
                TLObject tLObject = (TLObject) krVar.f35458c.get(i18);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final lr f34043b;

                    {
                        this.f34043b = this;
                    }

                    public Predicate and(Predicate predicate) {
                        int i182 = r2;
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public Predicate negate() {
                        switch (r2) {
                            case 0:
                                return Predicate$CC.$default$negate(this);
                            case 1:
                                return Predicate$CC.$default$negate(this);
                            default:
                                return Predicate$CC.$default$negate(this);
                        }
                    }

                    public Predicate or(Predicate predicate) {
                        int i182 = r2;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                        switch (r2) {
                            case 0:
                                long j11 = this.f34043b.U1;
                                TLRPC.Peer peer = ijVar.f23262k.peer_id;
                                if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                lr lrVar = this.f34043b;
                                lrVar.getClass();
                                TLRPC.Peer peer2 = ijVar.f23262k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = lrVar.U1;
                                    if (j12 == (-j13) && j13 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                lr lrVar2 = this.f34043b;
                                lrVar2.getClass();
                                TLRPC.Peer peer3 = ijVar.f23262k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-lrVar2.U1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new ir(1, tLObject)).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.nk(1)));
                if (z13 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.qp.l1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.qp.s1(this.f28621a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f27064id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.qp.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.qp.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.qp.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f26996id = arrayList5;
                    ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f35819r2) {
            krVar3.b(new fr(this, 0));
            return;
        }
        krVar3.c(new fr(this, 1));
        this.f35805c2.c(new fr(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, this.I0);
        if (w02 != this.f35826y2) {
            this.f35826y2 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        super.show();
        cc.e();
    }
}
