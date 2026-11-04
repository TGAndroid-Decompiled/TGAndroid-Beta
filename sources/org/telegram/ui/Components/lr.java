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
public final class lr extends ma {
    public static final int A2 = 0;
    public f41 Q1;
    public final TLRPC.Chat R1;
    public final TLRPC.Chat S1;
    public final boolean T1;
    public final ArrayList U1;
    public final long V1;
    public final int W1;
    public final int X1;
    public final Runnable Y1;
    public boolean Z1;
    public final boolean f35827a2;
    public final kr f35828b2;
    public final kr c2;
    public final kr f35829d2;
    public final kr f35830e2;
    public final boolean[] f35831f2;
    public final boolean[] f35832g2;
    public final boolean f35833h2;
    public boolean f35834i2;
    public final long f35835j2;
    public TL_communities.ParticipantJoinedChats f35836k2;
    public int[] f35837l2;
    public boolean f35838m2;
    public boolean f35839n2;
    public final TLRPC.TL_chatBannedRights f35840o2;
    public final TLRPC.TL_chatBannedRights f35841p2;
    public final ArrayList f35842q2;
    public boolean f35843r2;
    public final boolean f35844s2;
    public final boolean f35845t2;
    public boolean f35846u2;
    public boolean f35847v2;
    public boolean f35848w2;
    public boolean f35849x2;
    public float f35850y2;
    public int f35851z2;

    public lr(org.telegram.ui.ActionBar.d2 r22, org.telegram.tgnet.TLRPC.Chat r23, java.util.ArrayList r24, java.util.ArrayList r25, org.telegram.tgnet.TLRPC.ChannelParticipant[] r26, long r27, int r29, int r30, boolean r31, java.lang.Runnable r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lr.<init>(org.telegram.ui.ActionBar.d2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void d1(lr lrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i3, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            lrVar.f35837l2[i3] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(lrVar.U1).filter(new ir(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            lrVar.f35838m2 = false;
            lrVar.f35839n2 = true;
            lrVar.c1();
        }
    }

    @Override
    public final boolean J0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, this.f36105p1.getClassGuid(), true, new dr(this, 0), this.J0);
        this.Q1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        int i3;
        boolean[] zArr;
        if (this.f35845t2) {
            if (this.f35847v2) {
                return org.telegram.messenger.bd.M0(2131751524, null);
            }
            if (this.f35848w2) {
                return org.telegram.messenger.bd.M0(2131751506, null);
            }
            return org.telegram.messenger.bd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.U1;
        if (arrayList != null) {
            i3 = arrayList.size();
        } else {
            i3 = 0;
        }
        iArr[0] = i3;
        int[] iArr2 = this.f35837l2;
        if (iArr2 != null && this.f35839n2) {
            if (this.f35844s2) {
                if (this.f35847v2) {
                    for (int i10 : iArr2) {
                        iArr[0] = iArr[0] + i10;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    kr krVar = this.c2;
                    if (i11 >= krVar.f35467g) {
                        break;
                    }
                    if (krVar.d[i11] && ((zArr = krVar.f35465e) == null || zArr[i11])) {
                        TLObject tLObject = (TLObject) krVar.f35464c.get(i11);
                        iArr[0] = iArr[0] + this.f35837l2[i11];
                    }
                    i11++;
                }
            }
        }
        return org.telegram.messenger.bd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.f28583a).f22999e7.edit();
        edit.putBoolean("delete_report", this.f35828b2.a());
        edit.putBoolean("delete_deleteAll", this.c2.a());
        if (!this.Z1 && this.f35830e2.a()) {
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
        tj0 tj0Var = this.f36102l1;
        rect.set(0, 0, tj0Var.getMeasuredWidth(), tj0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        tj0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f35840o2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void f1(ArrayList arrayList, kr krVar) {
        boolean z10;
        boolean e10 = krVar.e();
        int i3 = krVar.f35467g;
        int i10 = krVar.f35462a;
        if (e10) {
            boolean z11 = false;
            if (!krVar.d()) {
                r31 z12 = r31.z(i10, krVar.f35463b);
                if (krVar.f35468i > 0) {
                    z11 = true;
                }
                z12.L(z11);
                arrayList.add(z12);
                return;
            }
            String str = krVar.f35463b;
            int i11 = krVar.f35468i;
            if (i11 <= 0) {
                if (krVar.f35465e != null) {
                    i11 = krVar.h;
                } else {
                    i11 = i3;
                }
            }
            String valueOf = String.valueOf(i11);
            r31 r31Var = new r31(36);
            r31Var.d = i10;
            r31Var.f37627l = str;
            r31Var.f37630o = valueOf;
            if (krVar.f35468i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r31Var.L(z10);
            r31Var.f37622f = krVar.f35466f;
            r31Var.D = new q2(12, this, krVar);
            arrayList.add(r31Var);
            if (!krVar.f35466f) {
                for (int i12 = 0; i12 < i3; i12++) {
                    boolean[] zArr = krVar.f35465e;
                    if (zArr == null || zArr[i12]) {
                        r31 r31Var2 = new r31(37);
                        r31Var2.d = (i10 << 24) | i12;
                        r31Var2.G = (TLObject) krVar.f35464c.get(i12);
                        r31Var2.L(krVar.d[i12]);
                        r31Var2.f37624i = 1;
                        arrayList.add(r31Var2);
                    }
                }
            }
        }
    }

    public final void g1() {
        if (this.f35839n2) {
            c1();
        } else if (!this.f35838m2) {
            this.f35838m2 = true;
            kr krVar = this.c2;
            int i3 = krVar.f35467g;
            this.f35837l2 = new int[i3];
            int[] iArr = {i3};
            for (int i10 = 0; i10 < krVar.f35467g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.hp.l1(this.R1);
                tL_messages_search.f27112q = "";
                TLRPC.InputPeer k1 = org.telegram.messenger.hp.k1((TLObject) krVar.f35464c.get(i10));
                tL_messages_search.from_id = k1;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_search, new ei.i8(this, k1, i10, iArr, 4));
            }
        }
    }

    public final void h1() {
        boolean z10;
        boolean z11;
        boolean z12 = this.Z1;
        boolean z13 = false;
        kr krVar = this.f35830e2;
        if (z12 && krVar.e()) {
            if (krVar.f35468i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35849x2 = z11;
        }
        if (this.Z1 && krVar.e() && krVar.f35468i == 0) {
            krVar.f();
        } else if (!this.Z1 && krVar.e()) {
            boolean z14 = this.f35849x2;
            if (krVar.f35468i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                krVar.f();
            }
        }
        if (!this.Z1 && krVar.e()) {
            if (krVar.f35468i > 0) {
                z13 = true;
            }
            this.f35849x2 = z13;
        }
    }

    public final void i1(boolean z10) {
        boolean z11;
        int i3;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        boolean z12;
        int i10;
        String str;
        long j10 = this.f35835j2;
        boolean z13 = true;
        if (z10 && this.f35834i2 && (participantJoinedChats = this.f35836k2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            int i11 = this.f28583a;
            ArrayList<Long> arrayList = this.f35836k2.creator_chat_ids;
            fr frVar = new fr(this, 6);
            er erVar = new er(this, 0);
            Pattern pattern = t4.f38241a;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            int i12 = 0;
            String M0 = org.telegram.messenger.bd.M0(2131751955, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.m5.s(i11, j10)));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753729, null), new t(erVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.o(f10);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                i13++;
                Long l11 = l10;
                LinearLayout linearLayout = f10;
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i11).M0(l11);
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i11).N0(longValue);
                if (M02 == null) {
                    f10 = linearLayout;
                    s1VarArr = s1VarArr2;
                } else {
                    ci.l1 l1Var = new ci.l1(context, e6Var, z13);
                    int i14 = size;
                    ((TextView) l1Var.f5431b).setText(org.telegram.messenger.m5.m(M02));
                    TextView textView = (TextView) l1Var.d;
                    if (N0 != null) {
                        int i15 = N0.participants_count;
                        int i16 = i12;
                        i10 = i13;
                        z12 = i16;
                        str = org.telegram.messenger.bd.G(i15, "Members", new Object[i16]);
                    } else {
                        z12 = i12;
                        i10 = i13;
                        str = null;
                    }
                    textView.setText(str);
                    ((k9) l1Var.f5432c).e(M02, new u8(M02));
                    l1Var.setBackground(org.telegram.ui.ActionBar.k6.N0(z12));
                    l1Var.setOnClickListener(new ci.c3(s1VarArr2, frVar, longValue, 2));
                    linearLayout.addView(l1Var, b8.mf.o(-1, -2));
                    s1Var = s1Var;
                    f10 = linearLayout;
                    i13 = i10;
                    s1VarArr = s1VarArr2;
                    size = i14;
                    i12 = z12;
                    z13 = true;
                }
            }
            org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
            s1VarArr[i12] = s1Var2;
            s1Var2.show();
            TextView textView2 = (TextView) s1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28122q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.Y1;
        if (runnable != null) {
            runnable.run();
        }
        kr krVar = this.f35828b2;
        String str2 = "";
        if (krVar.f35468i > 0) {
            str2 = "" + org.telegram.messenger.bd.G(krVar.f35468i, "UsersReported", new Object[0]);
        }
        kr krVar2 = this.f35830e2;
        if (krVar2.f35468i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = t4.c.q(str2, "\n");
            }
            if (this.Z1) {
                StringBuilder l12 = com.google.android.recaptcha.internal.a.l(str2);
                l12.append(org.telegram.messenger.bd.G(krVar2.f35468i, "UsersRestricted", new Object[0]));
                str2 = l12.toString();
            } else {
                StringBuilder l13 = com.google.android.recaptcha.internal.a.l(str2);
                l13.append(org.telegram.messenger.bd.G(krVar2.f35468i, "UsersBanned", new Object[0]));
                str2 = l13.toString();
            }
        }
        boolean z14 = this.f35845t2;
        if (z14 && !this.f35847v2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (krVar2.f35468i > 0) {
            i3 = 2131624048;
        } else {
            i3 = 2131623989;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i17 = 2131748468;
        org.telegram.ui.ActionBar.d2 d2Var = this.f36105p1;
        if (isEmpty) {
            fc a02 = fc.a0(d2Var);
            if (z11) {
                i17 = 2131746389;
            }
            org.telegram.messenger.k5.o(null, i17, a02, i3, 36);
        } else {
            fc a03 = fc.a0(d2Var);
            if (z11) {
                i17 = 2131746389;
            }
            a03.I(i3, org.telegram.messenger.bd.M0(i17, null), str2).j();
        }
        if (j10 != 0 && this.f35834i2) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.f28583a);
            long j11 = this.S1.f27001id;
            kh.b bVar = new kh.b(4);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s12.h1(j11);
            tL_communities_toggleParticipantBanned.participant = s12.j1(j10);
            tL_communities_toggleParticipantBanned.unban = false;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new c3.b(1), new org.telegram.messenger.j9(s12, j11, bVar));
        }
        ArrayList arrayList2 = this.U1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final lr f34181b;

            {
                this.f34181b = this;
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
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                switch (r2) {
                    case 0:
                        long j12 = this.f34181b.V1;
                        TLRPC.Peer peer = ziVar.f26868k.peer_id;
                        if ((peer != null && peer.chat_id != (-j12)) || j12 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar = this.f34181b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ziVar.f26868k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = lrVar.V1;
                            if (j13 == (-j14) && j14 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        lr lrVar2 = this.f34181b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ziVar.f26868k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-lrVar2.V1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new fa.b(9)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final lr f34181b;

            {
                this.f34181b = this;
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
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                switch (r2) {
                    case 0:
                        long j12 = this.f34181b.V1;
                        TLRPC.Peer peer = ziVar.f26868k.peer_id;
                        if ((peer != null && peer.chat_id != (-j12)) || j12 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar = this.f34181b;
                        lrVar.getClass();
                        TLRPC.Peer peer2 = ziVar.f26868k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = lrVar.V1;
                            if (j13 == (-j14) && j14 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        lr lrVar2 = this.f34181b;
                        lrVar2.getClass();
                        TLRPC.Peer peer3 = ziVar.f26868k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-lrVar2.V1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new fa.b(9)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
        TLRPC.Chat chat = this.R1;
        kr krVar3 = this.c2;
        if (z14) {
            if (!this.f35848w2) {
                krVar3.b(new hr(this, arrayList3, arrayList4, 0));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.hp.s1(this.f28583a).Z(arrayList3, null, null, -chat.f27001id, this.W1, false, this.X1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.hp.s1(this.f28583a).Z(arrayList4, null, null, this.V1, this.W1, true, this.X1);
            }
        }
        krVar2.c(new fr(this, 4));
        for (int i18 = 0; i18 < krVar.f35467g; i18++) {
            if (krVar.d[i18] && ((zArr = krVar.f35465e) == null || zArr[i18])) {
                TLObject tLObject = (TLObject) krVar.f35464c.get(i18);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final lr f34181b;

                    {
                        this.f34181b = this;
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
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                        switch (r2) {
                            case 0:
                                long j12 = this.f34181b.V1;
                                TLRPC.Peer peer = ziVar.f26868k.peer_id;
                                if ((peer != null && peer.chat_id != (-j12)) || j12 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                lr lrVar = this.f34181b;
                                lrVar.getClass();
                                TLRPC.Peer peer2 = ziVar.f26868k.peer_id;
                                if (peer2 != null) {
                                    long j13 = peer2.chat_id;
                                    long j14 = lrVar.V1;
                                    if (j13 == (-j14) && j14 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                lr lrVar2 = this.f34181b;
                                lrVar2.getClass();
                                TLRPC.Peer peer3 = ziVar.f26868k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-lrVar2.V1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new ir(1, tLObject)).map(new fa.b(9)).collect(Collectors.toCollection(new org.telegram.messenger.ek(1)));
                if (z14 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.hp.l1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.hp.s1(this.f28583a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f27109id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.hp.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.hp.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.hp.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f27041id = arrayList5;
                    ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f35844s2) {
            krVar3.b(new fr(this, 0));
            return;
        }
        krVar3.c(new fr(this, 1));
        this.f35829d2.c(new fr(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
        if (w02 != this.f35851z2) {
            this.f35851z2 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        super.show();
        ac.e();
    }
}
