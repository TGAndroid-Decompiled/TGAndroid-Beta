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
public final class rr extends ja {
    public static final int D2 = 0;
    public boolean A2;
    public float B2;
    public int C2;
    public p41 T1;
    public final TLRPC.Chat U1;
    public final TLRPC.Chat V1;
    public final boolean W1;
    public final ArrayList X1;
    public final long Y1;
    public final int Z1;
    public final int f39020a2;
    public final Runnable f39021b2;
    public boolean f39022c2;
    public final boolean d2;
    public final qr f39023e2;
    public final qr f39024f2;
    public final qr f39025g2;
    public final qr f39026h2;
    public final boolean[] f39027i2;
    public final boolean[] f39028j2;
    public final boolean f39029k2;
    public boolean f39030l2;
    public final long f39031m2;
    public TL_communities.ParticipantJoinedChats f39032n2;
    public int[] f39033o2;
    public boolean f39034p2;
    public boolean f39035q2;
    public final TLRPC.TL_chatBannedRights f39036r2;
    public final TLRPC.TL_chatBannedRights f39037s2;
    public final ArrayList f39038t2;
    public boolean f39039u2;
    public final boolean f39040v2;
    public final boolean f39041w2;
    public boolean f39042x2;
    public boolean f39043y2;
    public boolean f39044z2;

    public rr(org.telegram.ui.ActionBar.e2 r22, org.telegram.tgnet.TLRPC.Chat r23, java.util.ArrayList r24, java.util.ArrayList r25, org.telegram.tgnet.TLRPC.ChannelParticipant[] r26, long r27, int r29, int r30, boolean r31, java.lang.Runnable r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rr.<init>(org.telegram.ui.ActionBar.e2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void d1(rr rrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            rrVar.f39033o2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(rrVar.X1).filter(new or(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            rrVar.f39034p2 = false;
            rrVar.f39035q2 = true;
            rrVar.c1();
        }
    }

    @Override
    public final boolean J0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, this.f35935s1.getClassGuid(), true, new kr(this, 0), this.J0);
        this.T1 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        boolean[] zArr;
        if (this.f39041w2) {
            if (this.f39043y2) {
                return org.telegram.messenger.hd.M0(2131751523, null);
            }
            if (this.f39044z2) {
                return org.telegram.messenger.hd.M0(2131751505, null);
            }
            return org.telegram.messenger.hd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.X1;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        iArr[0] = i7;
        int[] iArr2 = this.f39033o2;
        if (iArr2 != null && this.f39035q2) {
            if (this.f39040v2) {
                if (this.f39043y2) {
                    for (int i10 : iArr2) {
                        iArr[0] = iArr[0] + i10;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    qr qrVar = this.f39024f2;
                    if (i11 >= qrVar.f38748g) {
                        break;
                    }
                    if (qrVar.d[i11] && ((zArr = qrVar.f38746e) == null || zArr[i11])) {
                        TLObject tLObject = (TLObject) qrVar.f38745c.get(i11);
                        iArr[0] = iArr[0] + this.f39033o2[i11];
                    }
                    i11++;
                }
            }
        }
        return org.telegram.messenger.hd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.f29679a).f25283f7.edit();
        edit.putBoolean("delete_report", this.f39023e2.a());
        edit.putBoolean("delete_deleteAll", this.f39024f2.a());
        if (!this.f39022c2 && this.f39026h2.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        edit.putBoolean("delete_ban", z10);
        edit.apply();
        super.dismiss();
    }

    @Override
    public final void e0() {
        Rect rect = org.telegram.messenger.g0.Q;
        uj0 uj0Var = this.f35931o1;
        rect.set(0, 0, uj0Var.getMeasuredWidth(), uj0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        uj0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f39036r2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void f1(ArrayList arrayList, qr qrVar) {
        boolean z10;
        boolean e10 = qrVar.e();
        int i7 = qrVar.f38748g;
        int i10 = qrVar.f38743a;
        if (e10) {
            boolean z11 = false;
            if (!qrVar.d()) {
                b41 z12 = b41.z(i10, qrVar.f38744b);
                if (qrVar.f38749i > 0) {
                    z11 = true;
                }
                z12.L(z11);
                arrayList.add(z12);
                return;
            }
            String str = qrVar.f38744b;
            int i11 = qrVar.f38749i;
            if (i11 <= 0) {
                if (qrVar.f38746e != null) {
                    i11 = qrVar.h;
                } else {
                    i11 = i7;
                }
            }
            String valueOf = String.valueOf(i11);
            b41 b41Var = new b41(36);
            b41Var.d = i10;
            b41Var.f33184l = str;
            b41Var.f33187o = valueOf;
            if (qrVar.f38749i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b41Var.L(z10);
            b41Var.f33179f = qrVar.f38747f;
            b41Var.D = new n2(13, this, qrVar);
            arrayList.add(b41Var);
            if (!qrVar.f38747f) {
                for (int i12 = 0; i12 < i7; i12++) {
                    boolean[] zArr = qrVar.f38746e;
                    if (zArr == null || zArr[i12]) {
                        b41 b41Var2 = new b41(37);
                        b41Var2.d = (i10 << 24) | i12;
                        b41Var2.G = (TLObject) qrVar.f38745c.get(i12);
                        b41Var2.L(qrVar.d[i12]);
                        b41Var2.f33181i = 1;
                        arrayList.add(b41Var2);
                    }
                }
            }
        }
    }

    public final void g1() {
        if (this.f39035q2) {
            c1();
        } else if (!this.f39034p2) {
            this.f39034p2 = true;
            qr qrVar = this.f39024f2;
            int i7 = qrVar.f38748g;
            this.f39033o2 = new int[i7];
            int[] iArr = {i7};
            for (int i10 = 0; i10 < qrVar.f38748g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.np.l1(this.U1);
                tL_messages_search.f28162q = "";
                TLRPC.InputPeer k12 = org.telegram.messenger.np.k1((TLObject) qrVar.f38745c.get(i10));
                tL_messages_search.from_id = k12;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_search, new fi.b8(this, k12, i10, iArr, 4));
            }
        }
    }

    public final void h1() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f39022c2;
        boolean z13 = false;
        qr qrVar = this.f39026h2;
        if (z12 && qrVar.e()) {
            if (qrVar.f38749i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A2 = z11;
        }
        if (this.f39022c2 && qrVar.e() && qrVar.f38749i == 0) {
            qrVar.f();
        } else if (!this.f39022c2 && qrVar.e()) {
            boolean z14 = this.A2;
            if (qrVar.f38749i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                qrVar.f();
            }
        }
        if (!this.f39022c2 && qrVar.e()) {
            if (qrVar.f38749i > 0) {
                z13 = true;
            }
            this.A2 = z13;
        }
    }

    public final void i1(boolean z10) {
        boolean z11;
        int i7;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        boolean z12;
        int i10;
        String str;
        long j3 = this.f39031m2;
        boolean z13 = true;
        if (z10 && this.f39030l2 && (participantJoinedChats = this.f39032n2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            int i11 = this.f29679a;
            ArrayList<Long> arrayList = this.f39032n2.creator_chat_ids;
            mr mrVar = new mr(this, 6);
            lr lrVar = new lr(this, 0);
            Pattern pattern = t4.f39505a;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            int i12 = 0;
            String M0 = org.telegram.messenger.hd.M0(2131751955, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.m5.s(i11, j3)));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753729, null), new s(lrVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            alertDialog$Builder.o(f10);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                i13++;
                Long l11 = l10;
                LinearLayout linearLayout = f10;
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(i11).M0(l11);
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i11).N0(longValue);
                if (M02 == null) {
                    f10 = linearLayout;
                    t1VarArr = t1VarArr2;
                } else {
                    di.e1 e1Var = new di.e1(context, e6Var, z13);
                    int i14 = size;
                    ((TextView) e1Var.f8441b).setText(org.telegram.messenger.m5.m(M02));
                    TextView textView = (TextView) e1Var.d;
                    if (N0 != null) {
                        int i15 = N0.participants_count;
                        int i16 = i12;
                        i10 = i13;
                        z12 = i16;
                        str = org.telegram.messenger.hd.G(i15, "Members", new Object[i16]);
                    } else {
                        z12 = i12;
                        i10 = i13;
                        str = null;
                    }
                    textView.setText(str);
                    ((i9) e1Var.f8442c).f(M02, new t8(M02));
                    e1Var.setBackground(org.telegram.ui.ActionBar.j6.N0(z12));
                    e1Var.setOnClickListener(new di.v2(t1VarArr2, mrVar, longValue, 2));
                    linearLayout.addView(e1Var, c8.ja.o(-1, -2));
                    t1Var = t1Var;
                    f10 = linearLayout;
                    i13 = i10;
                    t1VarArr = t1VarArr2;
                    size = i14;
                    i12 = z12;
                    z13 = true;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
            t1VarArr[i12] = t1Var2;
            t1Var2.show();
            TextView textView2 = (TextView) t1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.f39021b2;
        if (runnable != null) {
            runnable.run();
        }
        qr qrVar = this.f39023e2;
        String str2 = "";
        if (qrVar.f38749i > 0) {
            str2 = "" + org.telegram.messenger.hd.G(qrVar.f38749i, "UsersReported", new Object[0]);
        }
        qr qrVar2 = this.f39026h2;
        if (qrVar2.f38749i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = r.b.v(str2, "\n");
            }
            if (this.f39022c2) {
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(org.telegram.messenger.hd.G(qrVar2.f38749i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str2);
                m11.append(org.telegram.messenger.hd.G(qrVar2.f38749i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z14 = this.f39041w2;
        if (z14 && !this.f39043y2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qrVar2.f38749i > 0) {
            i7 = 2131624049;
        } else {
            i7 = 2131623990;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i17 = 2131748460;
        org.telegram.ui.ActionBar.e2 e2Var = this.f35935s1;
        if (isEmpty) {
            cc a02 = cc.a0(e2Var);
            if (z11) {
                i17 = 2131746381;
            }
            org.telegram.messenger.k5.n(null, i17, a02, i7, 36);
        } else {
            cc a03 = cc.a0(e2Var);
            if (z11) {
                i17 = 2131746381;
            }
            a03.I(i7, org.telegram.messenger.hd.M0(i17, null), str2).j();
        }
        if (j3 != 0 && this.f39030l2) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.f29679a);
            long j10 = this.V1.f28051id;
            jh.b bVar = new jh.b(4);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s12.h1(j10);
            tL_communities_toggleParticipantBanned.participant = s12.j1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.o9(s12, j10, bVar));
        }
        ArrayList arrayList2 = this.X1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final rr f37678b;

            {
                this.f37678b = this;
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
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                switch (r2) {
                    case 0:
                        long j11 = this.f37678b.Y1;
                        TLRPC.Peer peer = gjVar.f23819k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        rr rrVar = this.f37678b;
                        rrVar.getClass();
                        TLRPC.Peer peer2 = gjVar.f23819k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = rrVar.Y1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        rr rrVar2 = this.f37678b;
                        rrVar2.getClass();
                        TLRPC.Peer peer3 = gjVar.f23819k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-rrVar2.Y1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.lk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final rr f37678b;

            {
                this.f37678b = this;
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
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                switch (r2) {
                    case 0:
                        long j11 = this.f37678b.Y1;
                        TLRPC.Peer peer = gjVar.f23819k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        rr rrVar = this.f37678b;
                        rrVar.getClass();
                        TLRPC.Peer peer2 = gjVar.f23819k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = rrVar.Y1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        rr rrVar2 = this.f37678b;
                        rrVar2.getClass();
                        TLRPC.Peer peer3 = gjVar.f23819k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-rrVar2.Y1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.lk(1)));
        TLRPC.Chat chat = this.U1;
        qr qrVar3 = this.f39024f2;
        if (z14) {
            if (!this.f39044z2) {
                qrVar3.b(new km(this, arrayList3, arrayList4, 1));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.np.s1(this.f29679a).Z(arrayList3, null, null, -chat.f28051id, this.Z1, false, this.f39020a2);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.np.s1(this.f29679a).Z(arrayList4, null, null, this.Y1, this.Z1, true, this.f39020a2);
            }
        }
        qrVar2.c(new mr(this, 4));
        for (int i18 = 0; i18 < qrVar.f38748g; i18++) {
            if (qrVar.d[i18] && ((zArr = qrVar.f38746e) == null || zArr[i18])) {
                TLObject tLObject = (TLObject) qrVar.f38745c.get(i18);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final rr f37678b;

                    {
                        this.f37678b = this;
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
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                        switch (r2) {
                            case 0:
                                long j11 = this.f37678b.Y1;
                                TLRPC.Peer peer = gjVar.f23819k.peer_id;
                                if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                rr rrVar = this.f37678b;
                                rrVar.getClass();
                                TLRPC.Peer peer2 = gjVar.f23819k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = rrVar.Y1;
                                    if (j12 == (-j13) && j13 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                rr rrVar2 = this.f37678b;
                                rrVar2.getClass();
                                TLRPC.Peer peer3 = gjVar.f23819k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-rrVar2.Y1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new or(1, tLObject)).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.lk(1)));
                if (z14 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.np.l1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.np.s1(this.f29679a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f28159id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.np.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.np.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.np.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f28091id = arrayList5;
                    ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f39040v2) {
            qrVar3.b(new mr(this, 0));
            return;
        }
        qrVar3.c(new mr(this, 1));
        this.f39025g2.c(new mr(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
        if (w02 != this.C2) {
            this.C2 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        super.show();
        xb.e();
    }
}
