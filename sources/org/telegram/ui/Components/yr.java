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
public final class yr extends sa {
    public static final int D2 = 0;
    public boolean A2;
    public float B2;
    public int C2;
    public z41 T1;
    public final TLRPC.Chat U1;
    public final TLRPC.Chat V1;
    public final boolean W1;
    public final ArrayList X1;
    public final long Y1;
    public final int Z1;
    public final int f42596a2;
    public final Runnable f42597b2;
    public boolean f42598c2;
    public final boolean d2;
    public final xr f42599e2;
    public final xr f42600f2;
    public final xr f42601g2;
    public final xr f42602h2;
    public final boolean[] f42603i2;
    public final boolean[] f42604j2;
    public final boolean f42605k2;
    public boolean f42606l2;
    public final long f42607m2;
    public TL_communities.ParticipantJoinedChats f42608n2;
    public int[] f42609o2;
    public boolean f42610p2;
    public boolean f42611q2;
    public final TLRPC.TL_chatBannedRights f42612r2;
    public final TLRPC.TL_chatBannedRights f42613s2;
    public final ArrayList f42614t2;
    public boolean f42615u2;
    public final boolean f42616v2;
    public final boolean f42617w2;
    public boolean f42618x2;
    public boolean f42619y2;
    public boolean f42620z2;

    public yr(org.telegram.ui.ActionBar.h2 r22, org.telegram.tgnet.TLRPC.Chat r23, java.util.ArrayList r24, java.util.ArrayList r25, org.telegram.tgnet.TLRPC.ChannelParticipant[] r26, long r27, int r29, int r30, boolean r31, java.lang.Runnable r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yr.<init>(org.telegram.ui.ActionBar.h2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void e1(yr yrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            yrVar.f42609o2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(yrVar.X1).filter(new vr(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            yrVar.f42610p2 = false;
            yrVar.f42611q2 = true;
            yrVar.d1();
        }
    }

    @Override
    public final boolean K0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.d2);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30189a, this.f39538s1.getClassGuid(), true, new rr(this, 0), this.J0);
        this.T1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        boolean[] zArr;
        if (this.f42617w2) {
            if (this.f42619y2) {
                return org.telegram.messenger.gd.M0(2131751512, null);
            }
            if (this.f42620z2) {
                return org.telegram.messenger.gd.M0(2131751494, null);
            }
            return org.telegram.messenger.gd.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.X1;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        iArr[0] = i7;
        int[] iArr2 = this.f42609o2;
        if (iArr2 != null && this.f42611q2) {
            if (this.f42616v2) {
                if (this.f42619y2) {
                    for (int i10 : iArr2) {
                        iArr[0] = iArr[0] + i10;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    xr xrVar = this.f42600f2;
                    if (i11 >= xrVar.f42171g) {
                        break;
                    }
                    if (xrVar.d[i11] && ((zArr = xrVar.f42169e) == null || zArr[i11])) {
                        TLObject tLObject = (TLObject) xrVar.f42168c.get(i11);
                        iArr[0] = iArr[0] + this.f42609o2[i11];
                    }
                    i11++;
                }
            }
        }
        return org.telegram.messenger.gd.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.f30189a).h7.edit();
        edit.putBoolean("delete_report", this.f42599e2.a());
        edit.putBoolean("delete_deleteAll", this.f42600f2.a());
        if (!this.f42598c2 && this.f42602h2.a()) {
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
        ck0 ck0Var = this.f39534o1;
        rect.set(0, 0, ck0Var.getMeasuredWidth(), ck0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        ck0Var.setClipBounds(rect);
    }

    public final boolean f1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f42612r2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void g1(ArrayList arrayList, xr xrVar) {
        boolean z10;
        boolean e10 = xrVar.e();
        int i7 = xrVar.f42171g;
        int i10 = xrVar.f42166a;
        if (e10) {
            boolean z11 = false;
            if (!xrVar.d()) {
                l41 z12 = l41.z(i10, xrVar.f42167b);
                if (xrVar.f42172i > 0) {
                    z11 = true;
                }
                z12.L(z11);
                arrayList.add(z12);
                return;
            }
            String str = xrVar.f42167b;
            int i11 = xrVar.f42172i;
            if (i11 <= 0) {
                if (xrVar.f42169e != null) {
                    i11 = xrVar.h;
                } else {
                    i11 = i7;
                }
            }
            String valueOf = String.valueOf(i11);
            l41 l41Var = new l41(36);
            l41Var.d = i10;
            l41Var.f37018m = str;
            l41Var.f37021p = valueOf;
            if (xrVar.f42172i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l41Var.L(z10);
            l41Var.f37012f = xrVar.f42170f;
            l41Var.E = new y7(9, this, xrVar);
            arrayList.add(l41Var);
            if (!xrVar.f42170f) {
                for (int i12 = 0; i12 < i7; i12++) {
                    boolean[] zArr = xrVar.f42169e;
                    if (zArr == null || zArr[i12]) {
                        l41 l41Var2 = new l41(37);
                        l41Var2.d = (i10 << 24) | i12;
                        l41Var2.H = (TLObject) xrVar.f42168c.get(i12);
                        l41Var2.L(xrVar.d[i12]);
                        l41Var2.f37014i = 1;
                        arrayList.add(l41Var2);
                    }
                }
            }
        }
    }

    public final void h1() {
        if (this.f42611q2) {
            d1();
        } else if (!this.f42610p2) {
            this.f42610p2 = true;
            xr xrVar = this.f42600f2;
            int i7 = xrVar.f42171g;
            this.f42609o2 = new int[i7];
            int[] iArr = {i7};
            for (int i10 = 0; i10 < xrVar.f42171g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.mp.n1(this.U1);
                tL_messages_search.f28516q = "";
                TLRPC.InputPeer m12 = org.telegram.messenger.mp.m1((TLObject) xrVar.f42168c.get(i10));
                tL_messages_search.from_id = m12;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f30189a).sendRequest(tL_messages_search, new fi.y7(this, m12, i10, iArr, 4));
            }
        }
    }

    public final void i1() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f42598c2;
        boolean z13 = false;
        xr xrVar = this.f42602h2;
        if (z12 && xrVar.e()) {
            if (xrVar.f42172i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A2 = z11;
        }
        if (this.f42598c2 && xrVar.e() && xrVar.f42172i == 0) {
            xrVar.f();
        } else if (!this.f42598c2 && xrVar.e()) {
            boolean z14 = this.A2;
            if (xrVar.f42172i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                xrVar.f();
            }
        }
        if (!this.f42598c2 && xrVar.e()) {
            if (xrVar.f42172i > 0) {
                z13 = true;
            }
            this.A2 = z13;
        }
    }

    public final void j1(boolean z10) {
        boolean z11;
        int i7;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        boolean z12;
        int i10;
        String str;
        long j3 = this.f42607m2;
        boolean z13 = true;
        if (z10 && this.f42606l2 && (participantJoinedChats = this.f42608n2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            int i11 = this.f30189a;
            ArrayList<Long> arrayList = this.f42608n2.creator_chat_ids;
            tr trVar = new tr(this, 6);
            sr srVar = new sr(this, 0);
            Pattern pattern = b5.f33529a;
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            int i12 = 0;
            String M0 = org.telegram.messenger.gd.M0(2131751944, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.n5.s(i11, j3)));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753727, null), new b0(srVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            alertDialog$Builder.o(g10);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                i13++;
                Long l11 = l10;
                LinearLayout linearLayout = g10;
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(l11);
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i11).P0(longValue);
                if (O0 == null) {
                    g10 = linearLayout;
                    u1VarArr = u1VarArr2;
                } else {
                    di.d1 d1Var = new di.d1(context, i6Var, z13);
                    int i14 = size;
                    ((TextView) d1Var.f8645b).setText(org.telegram.messenger.n5.m(O0));
                    TextView textView = (TextView) d1Var.d;
                    if (P0 != null) {
                        int i15 = P0.participants_count;
                        int i16 = i12;
                        i10 = i13;
                        z12 = i16;
                        str = org.telegram.messenger.gd.G(i15, "Members", new Object[i16]);
                    } else {
                        z12 = i12;
                        i10 = i13;
                        str = null;
                    }
                    textView.setText(str);
                    ((q9) d1Var.f8646c).f(O0, new b9(O0));
                    d1Var.setBackground(org.telegram.ui.ActionBar.n6.N0(z12));
                    d1Var.setOnClickListener(new di.d3(u1VarArr2, trVar, longValue, 2));
                    linearLayout.addView(d1Var, c8.ma.o(-1, -2));
                    u1Var = u1Var;
                    g10 = linearLayout;
                    i13 = i10;
                    u1VarArr = u1VarArr2;
                    size = i14;
                    i12 = z12;
                    z13 = true;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
            u1VarArr[i12] = u1Var2;
            u1Var2.show();
            TextView textView2 = (TextView) u1Var2.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29637q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.f42597b2;
        if (runnable != null) {
            runnable.run();
        }
        xr xrVar = this.f42599e2;
        String str2 = "";
        if (xrVar.f42172i > 0) {
            str2 = "" + org.telegram.messenger.gd.G(xrVar.f42172i, "UsersReported", new Object[0]);
        }
        xr xrVar2 = this.f42602h2;
        if (xrVar2.f42172i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = p5.c.v(str2, "\n");
            }
            if (this.f42598c2) {
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(org.telegram.messenger.gd.G(xrVar2.f42172i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str2);
                m11.append(org.telegram.messenger.gd.G(xrVar2.f42172i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z14 = this.f42617w2;
        if (z14 && !this.f42619y2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (xrVar2.f42172i > 0) {
            i7 = 2131624049;
        } else {
            i7 = 2131623990;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i17 = 2131748268;
        org.telegram.ui.ActionBar.h2 h2Var = this.f39538s1;
        if (isEmpty) {
            lc b02 = lc.b0(h2Var);
            if (z11) {
                i17 = 2131746186;
            }
            org.telegram.messenger.f3.n(null, i17, b02, i7, 36);
        } else {
            lc b03 = lc.b0(h2Var);
            if (z11) {
                i17 = 2131746186;
            }
            b03.I(i7, org.telegram.messenger.gd.M0(i17, null), str2).j();
        }
        if (j3 != 0 && this.f42606l2) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.f30189a);
            long j10 = this.V1.f28405id;
            jh.b bVar = new jh.b(4);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = u12.j1(j10);
            tL_communities_toggleParticipantBanned.participant = u12.l1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.n9(u12, j10, bVar));
        }
        ArrayList arrayList2 = this.X1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final yr f40403b;

            {
                this.f40403b = this;
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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                switch (r2) {
                    case 0:
                        long j11 = this.f40403b.Y1;
                        TLRPC.Peer peer = fjVar.f23968k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        yr yrVar = this.f40403b;
                        yrVar.getClass();
                        TLRPC.Peer peer2 = fjVar.f23968k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = yrVar.Y1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        yr yrVar2 = this.f40403b;
                        yrVar2.getClass();
                        TLRPC.Peer peer3 = fjVar.f23968k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-yrVar2.Y1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final yr f40403b;

            {
                this.f40403b = this;
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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                switch (r2) {
                    case 0:
                        long j11 = this.f40403b.Y1;
                        TLRPC.Peer peer = fjVar.f23968k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        yr yrVar = this.f40403b;
                        yrVar.getClass();
                        TLRPC.Peer peer2 = fjVar.f23968k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = yrVar.Y1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        yr yrVar2 = this.f40403b;
                        yrVar2.getClass();
                        TLRPC.Peer peer3 = fjVar.f23968k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-yrVar2.Y1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
        TLRPC.Chat chat = this.U1;
        xr xrVar3 = this.f42600f2;
        if (z14) {
            if (!this.f42620z2) {
                xrVar3.b(new rm(this, arrayList3, arrayList4, 1));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.mp.u1(this.f30189a).Z(arrayList3, null, null, -chat.f28405id, this.Z1, false, this.f42596a2);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.mp.u1(this.f30189a).Z(arrayList4, null, null, this.Y1, this.Z1, true, this.f42596a2);
            }
        }
        xrVar2.c(new tr(this, 4));
        for (int i18 = 0; i18 < xrVar.f42171g; i18++) {
            if (xrVar.d[i18] && ((zArr = xrVar.f42169e) == null || zArr[i18])) {
                TLObject tLObject = (TLObject) xrVar.f42168c.get(i18);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final yr f40403b;

                    {
                        this.f40403b = this;
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
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                        switch (r2) {
                            case 0:
                                long j11 = this.f40403b.Y1;
                                TLRPC.Peer peer = fjVar.f23968k.peer_id;
                                if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                yr yrVar = this.f40403b;
                                yrVar.getClass();
                                TLRPC.Peer peer2 = fjVar.f23968k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = yrVar.Y1;
                                    if (j12 == (-j13) && j13 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                yr yrVar2 = this.f40403b;
                                yrVar2.getClass();
                                TLRPC.Peer peer3 = fjVar.f23968k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-yrVar2.Y1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new vr(1, tLObject)).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.jk(1)));
                if (z14 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.mp.n1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.mp.u1(this.f30189a).s1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f28513id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f30189a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.mp.k1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.mp.p1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.mp.n1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f28445id = arrayList5;
                    ConnectionsManager.getInstance(this.f30189a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f42616v2) {
            xrVar3.b(new tr(this, 0));
            return;
        }
        xrVar3.c(new tr(this, 1));
        this.f42601g2.c(new tr(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, this.J0);
        if (w02 != this.C2) {
            this.C2 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        super.show();
        gc.e();
    }
}
