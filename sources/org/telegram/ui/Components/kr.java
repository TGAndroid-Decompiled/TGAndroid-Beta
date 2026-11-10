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
public final class kr extends ma {
    public static final int C2 = 0;
    public float A2;
    public int B2;
    public m41 S1;
    public final TLRPC.Chat T1;
    public final TLRPC.Chat U1;
    public final boolean V1;
    public final ArrayList W1;
    public final long X1;
    public final int Y1;
    public final int Z1;
    public final Runnable f35394a2;
    public boolean f35395b2;
    public final boolean f35396c2;
    public final jr d2;
    public final jr f35397e2;
    public final jr f35398f2;
    public final jr f35399g2;
    public final boolean[] f35400h2;
    public final boolean[] f35401i2;
    public final boolean f35402j2;
    public boolean f35403k2;
    public final long f35404l2;
    public TL_communities.ParticipantJoinedChats f35405m2;
    public int[] f35406n2;
    public boolean f35407o2;
    public boolean f35408p2;
    public final TLRPC.TL_chatBannedRights f35409q2;
    public final TLRPC.TL_chatBannedRights f35410r2;
    public final ArrayList f35411s2;
    public boolean f35412t2;
    public final boolean f35413u2;
    public final boolean f35414v2;
    public boolean f35415w2;
    public boolean f35416x2;
    public boolean f35417y2;
    public boolean f35418z2;

    public kr(org.telegram.ui.ActionBar.f2 r21, org.telegram.tgnet.TLRPC.Chat r22, java.util.ArrayList r23, java.util.ArrayList r24, org.telegram.tgnet.TLRPC.ChannelParticipant[] r25, long r26, int r28, int r29, boolean r30, java.lang.Runnable r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kr.<init>(org.telegram.ui.ActionBar.f2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void d1(kr krVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            krVar.f35406n2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(krVar.W1).filter(new hr(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            krVar.f35407o2 = false;
            krVar.f35408p2 = true;
            krVar.c1();
        }
    }

    @Override
    public final boolean J0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, this.f35905r1.getClassGuid(), true, new cr(this, 0), this.I0);
        this.S1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        boolean[] zArr;
        if (this.f35414v2) {
            if (this.f35416x2) {
                return org.telegram.messenger.id.M0(2131751523, null);
            }
            if (this.f35417y2) {
                return org.telegram.messenger.id.M0(2131751505, null);
            }
            return org.telegram.messenger.id.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.W1;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        iArr[0] = i7;
        int[] iArr2 = this.f35406n2;
        if (iArr2 != null && this.f35408p2) {
            if (this.f35413u2) {
                if (this.f35416x2) {
                    for (int i10 : iArr2) {
                        iArr[0] = iArr[0] + i10;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    jr jrVar = this.f35397e2;
                    if (i11 >= jrVar.f35052g) {
                        break;
                    }
                    if (jrVar.d[i11] && ((zArr = jrVar.f35050e) == null || zArr[i11])) {
                        TLObject tLObject = (TLObject) jrVar.f35049c.get(i11);
                        iArr[0] = iArr[0] + this.f35406n2[i11];
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
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.f28669a).f24778e7.edit();
        edit.putBoolean("delete_report", this.d2.a());
        edit.putBoolean("delete_deleteAll", this.f35397e2.a());
        if (!this.f35395b2 && this.f35399g2.a()) {
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
        pj0 pj0Var = this.n1;
        rect.set(0, 0, pj0Var.getMeasuredWidth(), pj0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        pj0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f35409q2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void f1(ArrayList arrayList, jr jrVar) {
        boolean z9;
        boolean e10 = jrVar.e();
        int i7 = jrVar.f35052g;
        int i10 = jrVar.f35047a;
        if (e10) {
            boolean z10 = false;
            if (!jrVar.d()) {
                x31 z11 = x31.z(i10, jrVar.f35048b);
                if (jrVar.f35053i > 0) {
                    z10 = true;
                }
                z11.L(z10);
                arrayList.add(z11);
                return;
            }
            String str = jrVar.f35048b;
            int i11 = jrVar.f35053i;
            if (i11 <= 0) {
                if (jrVar.f35050e != null) {
                    i11 = jrVar.h;
                } else {
                    i11 = i7;
                }
            }
            String valueOf = String.valueOf(i11);
            x31 x31Var = new x31(36);
            x31Var.d = i10;
            x31Var.f40156l = str;
            x31Var.f40159o = valueOf;
            if (jrVar.f35053i > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            x31Var.L(z9);
            x31Var.f40151f = jrVar.f35051f;
            x31Var.D = new kk(6, this, jrVar);
            arrayList.add(x31Var);
            if (!jrVar.f35051f) {
                for (int i12 = 0; i12 < i7; i12++) {
                    boolean[] zArr = jrVar.f35050e;
                    if (zArr == null || zArr[i12]) {
                        x31 x31Var2 = new x31(37);
                        x31Var2.d = (i10 << 24) | i12;
                        x31Var2.G = (TLObject) jrVar.f35049c.get(i12);
                        x31Var2.L(jrVar.d[i12]);
                        x31Var2.f40153i = 1;
                        arrayList.add(x31Var2);
                    }
                }
            }
        }
    }

    public final void g1() {
        if (this.f35408p2) {
            c1();
        } else if (!this.f35407o2) {
            this.f35407o2 = true;
            jr jrVar = this.f35397e2;
            int i7 = jrVar.f35052g;
            this.f35406n2 = new int[i7];
            int[] iArr = {i7};
            for (int i10 = 0; i10 < jrVar.f35052g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.qp.l1(this.T1);
                tL_messages_search.f27071q = "";
                TLRPC.InputPeer k12 = org.telegram.messenger.qp.k1((TLObject) jrVar.f35049c.get(i10));
                tL_messages_search.from_id = k12;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_search, new di.j8(this, k12, i10, iArr, 4));
            }
        }
    }

    public final void h1() {
        boolean z9;
        boolean z10;
        boolean z11 = this.f35395b2;
        boolean z12 = false;
        jr jrVar = this.f35399g2;
        if (z11 && jrVar.e()) {
            if (jrVar.f35053i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f35418z2 = z10;
        }
        if (this.f35395b2 && jrVar.e() && jrVar.f35053i == 0) {
            jrVar.f();
        } else if (!this.f35395b2 && jrVar.e()) {
            boolean z13 = this.f35418z2;
            if (jrVar.f35053i > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z13 != z9) {
                jrVar.f();
            }
        }
        if (!this.f35395b2 && jrVar.e()) {
            if (jrVar.f35053i > 0) {
                z12 = true;
            }
            this.f35418z2 = z12;
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
        long j3 = this.f35404l2;
        boolean z12 = true;
        if (z9 && this.f35403k2 && (participantJoinedChats = this.f35405m2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.h6 h6Var = this.I0;
            int i11 = this.f28669a;
            ArrayList<Long> arrayList = this.f35405m2.creator_chat_ids;
            er erVar = new er(this, 6);
            dr drVar = new dr(this, 0);
            Pattern pattern = u4.f38507a;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            int i12 = 0;
            String M0 = org.telegram.messenger.id.M0(2131751955, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.m5.s(i11, j3)));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753729, null), new t(drVar, 6));
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
                    bi.s1 s1Var = new bi.s1(context, h6Var, z12);
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
                    ((k9) s1Var.f4663c).e(M02, new v8(M02));
                    s1Var.setBackground(org.telegram.ui.ActionBar.m6.N0(z11));
                    s1Var.setOnClickListener(new bi.p3(u1VarArr2, erVar, longValue, 2));
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
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28131q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.f35394a2;
        if (runnable != null) {
            runnable.run();
        }
        jr jrVar = this.d2;
        String str2 = "";
        if (jrVar.f35053i > 0) {
            str2 = "" + org.telegram.messenger.id.G(jrVar.f35053i, "UsersReported", new Object[0]);
        }
        jr jrVar2 = this.f35399g2;
        if (jrVar2.f35053i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = rf.b.r(str2, "\n");
            }
            if (this.f35395b2) {
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(org.telegram.messenger.id.G(jrVar2.f35053i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str2);
                m11.append(org.telegram.messenger.id.G(jrVar2.f35053i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z13 = this.f35414v2;
        if (z13 && !this.f35416x2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (jrVar2.f35053i > 0) {
            i7 = 2131624048;
        } else {
            i7 = 2131623989;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i17 = 2131748460;
        org.telegram.ui.ActionBar.f2 f2Var = this.f35905r1;
        if (isEmpty) {
            gc a02 = gc.a0(f2Var);
            if (z10) {
                i17 = 2131746381;
            }
            org.telegram.messenger.k5.o(null, i17, a02, i7, 36);
        } else {
            gc a03 = gc.a0(f2Var);
            if (z10) {
                i17 = 2131746381;
            }
            a03.I(i7, org.telegram.messenger.id.M0(i17, null), str2).j();
        }
        if (j3 != 0 && this.f35403k2) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f28669a);
            long j10 = this.U1.f26960id;
            jh.b bVar = new jh.b(4);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s12.h1(j10);
            tL_communities_toggleParticipantBanned.participant = s12.j1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.p9(s12, j10, bVar));
        }
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final kr f33637b;

            {
                this.f33637b = this;
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
                        long j11 = this.f33637b.X1;
                        TLRPC.Peer peer = ijVar.f23266k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        kr krVar = this.f33637b;
                        krVar.getClass();
                        TLRPC.Peer peer2 = ijVar.f23266k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = krVar.X1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        kr krVar2 = this.f33637b;
                        krVar2.getClass();
                        TLRPC.Peer peer3 = ijVar.f23266k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-krVar2.X1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.nk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final kr f33637b;

            {
                this.f33637b = this;
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
                        long j11 = this.f33637b.X1;
                        TLRPC.Peer peer = ijVar.f23266k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        kr krVar = this.f33637b;
                        krVar.getClass();
                        TLRPC.Peer peer2 = ijVar.f23266k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = krVar.X1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        kr krVar2 = this.f33637b;
                        krVar2.getClass();
                        TLRPC.Peer peer3 = ijVar.f23266k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-krVar2.X1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.nk(1)));
        TLRPC.Chat chat = this.T1;
        jr jrVar3 = this.f35397e2;
        if (z13) {
            if (!this.f35417y2) {
                jrVar3.b(new gr(this, arrayList3, arrayList4, 0));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.qp.s1(this.f28669a).Z(arrayList3, null, null, -chat.f26960id, this.Y1, false, this.Z1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.qp.s1(this.f28669a).Z(arrayList4, null, null, this.X1, this.Y1, true, this.Z1);
            }
        }
        jrVar2.c(new er(this, 4));
        for (int i18 = 0; i18 < jrVar.f35052g; i18++) {
            if (jrVar.d[i18] && ((zArr = jrVar.f35050e) == null || zArr[i18])) {
                TLObject tLObject = (TLObject) jrVar.f35049c.get(i18);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final kr f33637b;

                    {
                        this.f33637b = this;
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
                                long j11 = this.f33637b.X1;
                                TLRPC.Peer peer = ijVar.f23266k.peer_id;
                                if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                kr krVar = this.f33637b;
                                krVar.getClass();
                                TLRPC.Peer peer2 = ijVar.f23266k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = krVar.X1;
                                    if (j12 == (-j13) && j13 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                kr krVar2 = this.f33637b;
                                krVar2.getClass();
                                TLRPC.Peer peer3 = ijVar.f23266k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-krVar2.X1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new hr(1, tLObject)).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.nk(1)));
                if (z13 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.qp.l1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.qp.s1(this.f28669a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f27068id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.qp.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.qp.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.qp.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f27000id = arrayList5;
                    ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f35413u2) {
            jrVar3.b(new er(this, 0));
            return;
        }
        jrVar3.c(new er(this, 1));
        this.f35398f2.c(new er(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
        if (w02 != this.B2) {
            this.B2 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        super.show();
        bc.e();
    }
}
