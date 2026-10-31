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
public final class vr extends ha {
    public static final int f31810z2 = 0;
    public p51 P1;
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
    public final ur a2;
    public final ur f31811b2;
    public final ur f31812c2;
    public final ur f31813d2;
    public final boolean[] f31814e2;
    public final boolean[] f31815f2;
    public final boolean f31816g2;
    public boolean f31817h2;
    public final long f31818i2;
    public TL_communities.ParticipantJoinedChats f31819j2;
    public int[] f31820k2;
    public boolean f31821l2;
    public boolean f31822m2;
    public final TLRPC.TL_chatBannedRights f31823n2;
    public final TLRPC.TL_chatBannedRights f31824o2;
    public final ArrayList f31825p2;
    public boolean f31826q2;
    public final boolean f31827r2;
    public final boolean f31828s2;
    public boolean f31829t2;
    public boolean f31830u2;
    public boolean f31831v2;
    public boolean f31832w2;
    public float f31833x2;
    public int f31834y2;

    public vr(org.telegram.ui.ActionBar.k2 r22, org.telegram.tgnet.TLRPC.Chat r23, java.util.ArrayList r24, java.util.ArrayList r25, org.telegram.tgnet.TLRPC.ChannelParticipant[] r26, long r27, int r29, int r30, boolean r31, java.lang.Runnable r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vr.<init>(org.telegram.ui.ActionBar.k2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void d1(vr vrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            vrVar.f31820k2[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(vrVar.T1).filter(new rr(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            vrVar.f31821l2 = false;
            vrVar.f31822m2 = true;
            vrVar.c1();
        }
    }

    @Override
    public final boolean J0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, this.f26669o1.getClassGuid(), true, new nr(this, 0), this.I0);
        this.P1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        int i10;
        boolean[] zArr;
        if (this.f31828s2) {
            if (this.f31830u2) {
                return org.telegram.messenger.cd.L0(2131751524, null);
            }
            if (this.f31831v2) {
                return org.telegram.messenger.cd.L0(2131751506, null);
            }
            return org.telegram.messenger.cd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        ArrayList arrayList = this.T1;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f31820k2 != null && this.f31822m2) {
            int i11 = 0;
            while (true) {
                ur urVar = this.f31811b2;
                if (i11 >= urVar.f31017g) {
                    break;
                }
                if (urVar.d[i11] && ((zArr = urVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) urVar.f31015c.get(i11);
                    iArr[0] = iArr[0] + this.f31820k2[i11];
                }
                i11++;
            }
        }
        return org.telegram.messenger.cd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.f21583a).f7.edit();
        edit.putBoolean("delete_report", this.a2.a());
        edit.putBoolean("delete_deleteAll", this.f31811b2.a());
        if (!this.Y1 && this.f31813d2.a()) {
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
        Rect rect = org.telegram.messenger.i0.Q;
        tk0 tk0Var = this.f26666k1;
        rect.set(0, 0, tk0Var.getMeasuredWidth(), tk0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(34.0f));
        tk0Var.setClipBounds(rect);
    }

    public final boolean e1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f31823n2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void f1(ArrayList arrayList, ur urVar) {
        boolean z10;
        boolean e = urVar.e();
        int i10 = urVar.f31017g;
        int i11 = urVar.f31013a;
        if (e) {
            boolean z11 = false;
            if (!urVar.d()) {
                a51 z12 = a51.z(i11, urVar.f31014b);
                if (urVar.f31018i > 0) {
                    z11 = true;
                }
                z12.L(z11);
                arrayList.add(z12);
                return;
            }
            String str = urVar.f31014b;
            int i12 = urVar.f31018i;
            if (i12 <= 0) {
                if (urVar.e != null) {
                    i12 = urVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            a51 a51Var = new a51(36);
            a51Var.d = i11;
            a51Var.f24292l = str;
            a51Var.f24295o = valueOf;
            if (urVar.f31018i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a51Var.L(z10);
            a51Var.f24287f = urVar.f31016f;
            a51Var.D = new org.telegram.ui.ud(29, this, urVar);
            arrayList.add(a51Var);
            if (!urVar.f31016f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = urVar.e;
                    if (zArr == null || zArr[i13]) {
                        a51 a51Var2 = new a51(37);
                        a51Var2.d = (i11 << 24) | i13;
                        a51Var2.G = (TLObject) urVar.f31015c.get(i13);
                        a51Var2.L(urVar.d[i13]);
                        a51Var2.f24289i = 1;
                        arrayList.add(a51Var2);
                    }
                }
            }
        }
    }

    public final void g1() {
        if (this.f31822m2) {
            c1();
        } else if (!this.f31821l2) {
            this.f31821l2 = true;
            ur urVar = this.f31811b2;
            int i10 = urVar.f31017g;
            this.f31820k2 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < urVar.f31017g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.vp.k1(this.Q1);
                tL_messages_search.f19904q = "";
                TLRPC.InputPeer j12 = org.telegram.messenger.vp.j1((TLObject) urVar.f31015c.get(i11));
                tL_messages_search.from_id = j12;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_messages_search, new org.telegram.ui.b0(this, j12, i11, iArr, 2));
            }
        }
    }

    public final void h1() {
        boolean z10;
        boolean z11;
        boolean z12 = this.Y1;
        boolean z13 = false;
        ur urVar = this.f31813d2;
        if (z12 && urVar.e()) {
            if (urVar.f31018i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31832w2 = z11;
        }
        if (this.Y1 && urVar.e() && urVar.f31018i == 0) {
            urVar.f();
        } else if (!this.Y1 && urVar.e()) {
            boolean z14 = this.f31832w2;
            if (urVar.f31018i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                urVar.f();
            }
        }
        if (!this.Y1 && urVar.e()) {
            if (urVar.f31018i > 0) {
                z13 = true;
            }
            this.f31832w2 = z13;
        }
    }

    public final void i1(boolean z10) {
        boolean z11;
        int i10;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        boolean z12;
        int i11;
        String str;
        long j10 = this.f31818i2;
        boolean z13 = true;
        if (z10 && this.f31817h2 && (participantJoinedChats = this.f31819j2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.p6 p6Var = this.I0;
            int i12 = this.f21583a;
            ArrayList<Long> arrayList = this.f31819j2.creator_chat_ids;
            pr prVar = new pr(this, 6);
            or orVar = new or(this, 0);
            Pattern pattern = s4.f30123a;
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
            org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
            int i13 = 0;
            String L0 = org.telegram.messenger.cd.L0(2131751955, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.o5.s(i12, j10)));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753729, null), new t(orVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder.o(f7);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Long l4 = arrayList.get(i14);
                i14++;
                Long l10 = l4;
                LinearLayout linearLayout = f7;
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = x1VarArr;
                long longValue = l10.longValue();
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i12).L0(l10);
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i12).M0(longValue);
                if (L02 == null) {
                    f7 = linearLayout;
                    x1VarArr = x1VarArr2;
                } else {
                    jg.a3 a3Var = new jg.a3(context, p6Var, z13);
                    int i15 = size;
                    ((TextView) a3Var.d).setText(org.telegram.messenger.o5.m(L02));
                    TextView textView = (TextView) a3Var.f9890b;
                    if (M0 != null) {
                        int i16 = M0.participants_count;
                        int i17 = i13;
                        i11 = i14;
                        z12 = i17;
                        str = org.telegram.messenger.cd.G(i16, "Members", new Object[i17]);
                    } else {
                        z12 = i13;
                        i11 = i14;
                        str = null;
                    }
                    textView.setText(str);
                    ((g9) a3Var.f9891c).e(L02, new r8(L02));
                    a3Var.setBackground(org.telegram.ui.ActionBar.t6.N0(z12));
                    a3Var.setOnClickListener(new org.telegram.ui.zn(x1VarArr2, prVar, longValue, 1));
                    linearLayout.addView(a3Var, w7.b6.o(-1, -2));
                    x1Var = x1Var;
                    f7 = linearLayout;
                    i14 = i11;
                    x1VarArr = x1VarArr2;
                    size = i15;
                    i13 = z12;
                    z13 = true;
                }
            }
            org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
            x1VarArr[i13] = x1Var2;
            x1Var2.show();
            TextView textView2 = (TextView) x1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.X1;
        if (runnable != null) {
            runnable.run();
        }
        ur urVar = this.a2;
        String str2 = "";
        if (urVar.f31018i > 0) {
            str2 = "" + org.telegram.messenger.cd.G(urVar.f31018i, "UsersReported", new Object[0]);
        }
        ur urVar2 = this.f31813d2;
        if (urVar2.f31018i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = sc.e.A(str2, "\n");
            }
            if (this.Y1) {
                StringBuilder t10 = a1.g.t(str2);
                t10.append(org.telegram.messenger.cd.G(urVar2.f31018i, "UsersRestricted", new Object[0]));
                str2 = t10.toString();
            } else {
                StringBuilder t11 = a1.g.t(str2);
                t11.append(org.telegram.messenger.cd.G(urVar2.f31018i, "UsersBanned", new Object[0]));
                str2 = t11.toString();
            }
        }
        boolean z14 = this.f31828s2;
        if (z14 && !this.f31830u2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (urVar2.f31018i > 0) {
            i10 = 2131624047;
        } else {
            i10 = 2131623989;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i18 = 2131748475;
        org.telegram.ui.ActionBar.k2 k2Var = this.f26669o1;
        if (isEmpty) {
            cc a02 = cc.a0(k2Var);
            if (z11) {
                i18 = 2131746396;
            }
            org.telegram.messenger.m5.n(null, i18, a02, i10, 36);
        } else {
            cc a03 = cc.a0(k2Var);
            if (z11) {
                i18 = 2131746396;
            }
            a03.I(i10, org.telegram.messenger.cd.L0(i18, null), str2).j();
        }
        if (j10 != 0 && this.f31817h2) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.f21583a);
            long j11 = this.R1.f19793id;
            org.telegram.messenger.z1 z1Var = new org.telegram.messenger.z1(3);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = r12.g1(j11);
            tL_communities_toggleParticipantBanned.participant = r12.i1(j10);
            tL_communities_toggleParticipantBanned.unban = false;
            r12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new a3.b(1), new org.telegram.messenger.q9(r12, j11, z1Var));
        }
        ArrayList arrayList2 = this.T1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final vr f29729b;

            {
                this.f29729b = this;
            }

            public Predicate and(Predicate predicate) {
                int i19 = r2;
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
                int i19 = r2;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                switch (r2) {
                    case 0:
                        long j12 = this.f29729b.U1;
                        TLRPC.Peer peer = jjVar.f16337k.peer_id;
                        if ((peer != null && peer.chat_id != (-j12)) || j12 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        vr vrVar = this.f29729b;
                        vrVar.getClass();
                        TLRPC.Peer peer2 = jjVar.f16337k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = vrVar.U1;
                            if (j13 == (-j14) && j14 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        vr vrVar2 = this.f29729b;
                        vrVar2.getClass();
                        TLRPC.Peer peer3 = jjVar.f16337k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-vrVar2.U1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new k2.f(8)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final vr f29729b;

            {
                this.f29729b = this;
            }

            public Predicate and(Predicate predicate) {
                int i19 = r2;
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
                int i19 = r2;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                switch (r2) {
                    case 0:
                        long j12 = this.f29729b.U1;
                        TLRPC.Peer peer = jjVar.f16337k.peer_id;
                        if ((peer != null && peer.chat_id != (-j12)) || j12 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        vr vrVar = this.f29729b;
                        vrVar.getClass();
                        TLRPC.Peer peer2 = jjVar.f16337k.peer_id;
                        if (peer2 != null) {
                            long j13 = peer2.chat_id;
                            long j14 = vrVar.U1;
                            if (j13 == (-j14) && j14 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        vr vrVar2 = this.f29729b;
                        vrVar2.getClass();
                        TLRPC.Peer peer3 = jjVar.f16337k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-vrVar2.U1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new k2.f(8)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
        TLRPC.Chat chat = this.Q1;
        ur urVar3 = this.f31811b2;
        if (z14) {
            if (!this.f31831v2) {
                urVar3.b(new androidx.car.app.utils.a(this, arrayList3, arrayList4, 22));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.vp.r1(this.f21583a).Z(arrayList3, null, null, -chat.f19793id, this.V1, false, this.W1);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.vp.r1(this.f21583a).Z(arrayList4, null, null, this.U1, this.V1, true, this.W1);
            }
        }
        urVar2.c(new pr(this, 4));
        for (int i19 = 0; i19 < urVar.f31017g; i19++) {
            if (urVar.d[i19] && ((zArr = urVar.e) == null || zArr[i19])) {
                TLObject tLObject = (TLObject) urVar.f31015c.get(i19);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final vr f29729b;

                    {
                        this.f29729b = this;
                    }

                    public Predicate and(Predicate predicate) {
                        int i192 = r2;
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
                        int i192 = r2;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                        switch (r2) {
                            case 0:
                                long j12 = this.f29729b.U1;
                                TLRPC.Peer peer = jjVar.f16337k.peer_id;
                                if ((peer != null && peer.chat_id != (-j12)) || j12 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                vr vrVar = this.f29729b;
                                vrVar.getClass();
                                TLRPC.Peer peer2 = jjVar.f16337k.peer_id;
                                if (peer2 != null) {
                                    long j13 = peer2.chat_id;
                                    long j14 = vrVar.U1;
                                    if (j13 == (-j14) && j14 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                vr vrVar2 = this.f29729b;
                                vrVar2.getClass();
                                TLRPC.Peer peer3 = jjVar.f16337k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-vrVar2.U1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new rr(1, tLObject)).map(new k2.f(8)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
                if (z14 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.vp.k1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.vp.r1(this.f21583a).p1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f19901id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.vp.h1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.vp.m1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.vp.k1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f19833id = arrayList5;
                    ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f31827r2) {
            urVar3.b(new pr(this, 0));
            return;
        }
        urVar3.c(new pr(this, 1));
        this.f31812c2.c(new pr(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0);
        if (w02 != this.f31834y2) {
            this.f31834y2 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        super.show();
        wb.e();
    }
}
