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
public final class as extends sa {
    public static final int D2 = 0;
    public boolean A2;
    public float B2;
    public int C2;
    public c51 T1;
    public final TLRPC.Chat U1;
    public final TLRPC.Chat V1;
    public final boolean W1;
    public final ArrayList X1;
    public final long Y1;
    public final int Z1;
    public final int f33605a2;
    public final Runnable f33606b2;
    public boolean f33607c2;
    public final boolean d2;
    public final zr f33608e2;
    public final zr f33609f2;
    public final zr f33610g2;
    public final zr f33611h2;
    public final boolean[] f33612i2;
    public final boolean[] f33613j2;
    public final boolean f33614k2;
    public boolean f33615l2;
    public final long f33616m2;
    public TL_communities.ParticipantJoinedChats f33617n2;
    public int[] f33618o2;
    public boolean f33619p2;
    public boolean f33620q2;
    public final TLRPC.TL_chatBannedRights f33621r2;
    public final TLRPC.TL_chatBannedRights f33622s2;
    public final ArrayList f33623t2;
    public boolean f33624u2;
    public final boolean f33625v2;
    public final boolean f33626w2;
    public boolean f33627x2;
    public boolean f33628y2;
    public boolean f33629z2;

    public as(org.telegram.ui.ActionBar.g2 r22, org.telegram.tgnet.TLRPC.Chat r23, java.util.ArrayList r24, java.util.ArrayList r25, org.telegram.tgnet.TLRPC.ChannelParticipant[] r26, long r27, int r29, int r30, boolean r31, java.lang.Runnable r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.as.<init>(org.telegram.ui.ActionBar.g2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void e1(as asVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            asVar.f33618o2[i7] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(asVar.X1).filter(new xr(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            asVar.f33619p2 = false;
            asVar.f33620q2 = true;
            asVar.d1();
        }
    }

    @Override
    public final boolean K0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.e2);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30173a, this.f39536s1.getClassGuid(), true, new tr(this, 0), this.J0);
        this.T1 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        boolean[] zArr;
        if (this.f33626w2) {
            if (this.f33628y2) {
                return org.telegram.messenger.hd.N0(2131751511, null);
            }
            if (this.f33629z2) {
                return org.telegram.messenger.hd.N0(2131751493, null);
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
        int[] iArr2 = this.f33618o2;
        if (iArr2 != null && this.f33620q2) {
            if (this.f33625v2) {
                if (this.f33628y2) {
                    for (int i10 : iArr2) {
                        iArr[0] = iArr[0] + i10;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    zr zrVar = this.f33609f2;
                    if (i11 >= zrVar.f42971g) {
                        break;
                    }
                    if (zrVar.d[i11] && ((zArr = zrVar.f42969e) == null || zArr[i11])) {
                        TLObject tLObject = (TLObject) zrVar.f42968c.get(i11);
                        iArr[0] = iArr[0] + this.f33618o2[i11];
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
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.f30173a).h7.edit();
        edit.putBoolean("delete_report", this.f33608e2.a());
        edit.putBoolean("delete_deleteAll", this.f33609f2.a());
        if (!this.f33607c2 && this.f33611h2.a()) {
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
        ek0 ek0Var = this.f39532o1;
        rect.set(0, 0, ek0Var.getMeasuredWidth(), ek0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(34.0f));
        ek0Var.setClipBounds(rect);
    }

    public final boolean f1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f33621r2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void g1(ArrayList arrayList, zr zrVar) {
        boolean z10;
        boolean e10 = zrVar.e();
        int i7 = zrVar.f42971g;
        int i10 = zrVar.f42966a;
        if (e10) {
            boolean z11 = false;
            if (!zrVar.d()) {
                o41 z12 = o41.z(i10, zrVar.f42967b);
                if (zrVar.f42972i > 0) {
                    z11 = true;
                }
                z12.L(z11);
                arrayList.add(z12);
                return;
            }
            String str = zrVar.f42967b;
            int i11 = zrVar.f42972i;
            if (i11 <= 0) {
                if (zrVar.f42969e != null) {
                    i11 = zrVar.h;
                } else {
                    i11 = i7;
                }
            }
            String valueOf = String.valueOf(i11);
            o41 o41Var = new o41(36);
            o41Var.d = i10;
            o41Var.f38092m = str;
            o41Var.f38095p = valueOf;
            if (zrVar.f42972i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o41Var.L(z10);
            o41Var.f38086f = zrVar.f42970f;
            o41Var.E = new m8(8, this, zrVar);
            arrayList.add(o41Var);
            if (!zrVar.f42970f) {
                for (int i12 = 0; i12 < i7; i12++) {
                    boolean[] zArr = zrVar.f42969e;
                    if (zArr == null || zArr[i12]) {
                        o41 o41Var2 = new o41(37);
                        o41Var2.d = (i10 << 24) | i12;
                        o41Var2.H = (TLObject) zrVar.f42968c.get(i12);
                        o41Var2.L(zrVar.d[i12]);
                        o41Var2.f38088i = 1;
                        arrayList.add(o41Var2);
                    }
                }
            }
        }
    }

    public final void h1() {
        if (this.f33620q2) {
            d1();
        } else if (!this.f33619p2) {
            this.f33619p2 = true;
            zr zrVar = this.f33609f2;
            int i7 = zrVar.f42971g;
            this.f33618o2 = new int[i7];
            int[] iArr = {i7};
            for (int i10 = 0; i10 < zrVar.f42971g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = org.telegram.messenger.np.n1(this.U1);
                tL_messages_search.f28545q = "";
                TLRPC.InputPeer m12 = org.telegram.messenger.np.m1((TLObject) zrVar.f42968c.get(i10));
                tL_messages_search.from_id = m12;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_messages_search, new fi.y7(this, m12, i10, iArr, 4));
            }
        }
    }

    public final void i1() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f33607c2;
        boolean z13 = false;
        zr zrVar = this.f33611h2;
        if (z12 && zrVar.e()) {
            if (zrVar.f42972i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A2 = z11;
        }
        if (this.f33607c2 && zrVar.e() && zrVar.f42972i == 0) {
            zrVar.f();
        } else if (!this.f33607c2 && zrVar.e()) {
            boolean z14 = this.A2;
            if (zrVar.f42972i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                zrVar.f();
            }
        }
        if (!this.f33607c2 && zrVar.e()) {
            if (zrVar.f42972i > 0) {
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
        long j3 = this.f33616m2;
        boolean z13 = true;
        if (z10 && this.f33615l2 && (participantJoinedChats = this.f33617n2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.h6 h6Var = this.J0;
            int i11 = this.f30173a;
            ArrayList<Long> arrayList = this.f33617n2.creator_chat_ids;
            vr vrVar = new vr(this, 6);
            ur urVar = new ur(this, 0);
            Pattern pattern = c5.f34013a;
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            int i12 = 0;
            String N0 = org.telegram.messenger.hd.N0(2131751943, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(arrayList.size(), "CommunityBanWarningMessage", org.telegram.messenger.n5.s(i11, j3)));
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753726, null), new c0(urVar, 6));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            alertDialog$Builder.o(g10);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                i13++;
                Long l11 = l10;
                LinearLayout linearLayout = g10;
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                long longValue = l11.longValue();
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i11).O0(l11);
                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i11).P0(longValue);
                if (O0 == null) {
                    g10 = linearLayout;
                    t1VarArr = t1VarArr2;
                } else {
                    di.d1 d1Var = new di.d1(context, h6Var, z13);
                    int i14 = size;
                    ((TextView) d1Var.f8672b).setText(org.telegram.messenger.n5.m(O0));
                    TextView textView = (TextView) d1Var.d;
                    if (P0 != null) {
                        int i15 = P0.participants_count;
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
                    ((q9) d1Var.f8673c).f(O0, new b9(O0));
                    d1Var.setBackground(org.telegram.ui.ActionBar.m6.N0(z12));
                    d1Var.setOnClickListener(new di.d3(t1VarArr2, vrVar, longValue, 2));
                    linearLayout.addView(d1Var, c8.ma.o(-1, -2));
                    t1Var = t1Var;
                    g10 = linearLayout;
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
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29622q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.f33606b2;
        if (runnable != null) {
            runnable.run();
        }
        zr zrVar = this.f33608e2;
        String str2 = "";
        if (zrVar.f42972i > 0) {
            str2 = "" + org.telegram.messenger.hd.G(zrVar.f42972i, "UsersReported", new Object[0]);
        }
        zr zrVar2 = this.f33611h2;
        if (zrVar2.f42972i > 0) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = p5.c.v(str2, "\n");
            }
            if (this.f33607c2) {
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(org.telegram.messenger.hd.G(zrVar2.f42972i, "UsersRestricted", new Object[0]));
                str2 = m10.toString();
            } else {
                StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str2);
                m11.append(org.telegram.messenger.hd.G(zrVar2.f42972i, "UsersBanned", new Object[0]));
                str2 = m11.toString();
            }
        }
        boolean z14 = this.f33626w2;
        if (z14 && !this.f33628y2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zrVar2.f42972i > 0) {
            i7 = 2131624049;
        } else {
            i7 = 2131623990;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i17 = 2131748267;
        org.telegram.ui.ActionBar.g2 g2Var = this.f39536s1;
        if (isEmpty) {
            lc b02 = lc.b0(g2Var);
            if (z11) {
                i17 = 2131746185;
            }
            org.telegram.messenger.f3.n(null, i17, b02, i7, 36);
        } else {
            lc b03 = lc.b0(g2Var);
            if (z11) {
                i17 = 2131746185;
            }
            b03.I(i7, org.telegram.messenger.hd.N0(i17, null), str2).j();
        }
        if (j3 != 0 && this.f33615l2) {
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.f30173a);
            long j10 = this.V1.f28434id;
            jh.b bVar = new jh.b(4);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = u12.j1(j10);
            tL_communities_toggleParticipantBanned.participant = u12.l1(j3);
            tL_communities_toggleParticipantBanned.unban = false;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new org.telegram.messenger.o9(u12, j10, bVar));
        }
        ArrayList arrayList2 = this.X1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final as f41881b;

            {
                this.f41881b = this;
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
                        long j11 = this.f41881b.Y1;
                        TLRPC.Peer peer = gjVar.f24213k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        as asVar = this.f41881b;
                        asVar.getClass();
                        TLRPC.Peer peer2 = gjVar.f24213k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = asVar.Y1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        as asVar2 = this.f41881b;
                        asVar2.getClass();
                        TLRPC.Peer peer3 = gjVar.f24213k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-asVar2.Y1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.kk(1)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final as f41881b;

            {
                this.f41881b = this;
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
                        long j11 = this.f41881b.Y1;
                        TLRPC.Peer peer = gjVar.f24213k.peer_id;
                        if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                            return true;
                        }
                        return false;
                    case 1:
                        as asVar = this.f41881b;
                        asVar.getClass();
                        TLRPC.Peer peer2 = gjVar.f24213k.peer_id;
                        if (peer2 != null) {
                            long j12 = peer2.chat_id;
                            long j13 = asVar.Y1;
                            if (j12 == (-j13) && j13 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        as asVar2 = this.f41881b;
                        asVar2.getClass();
                        TLRPC.Peer peer3 = gjVar.f24213k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-asVar2.Y1)) {
                            return true;
                        }
                        return false;
                }
            }
        }).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.kk(1)));
        TLRPC.Chat chat = this.U1;
        zr zrVar3 = this.f33609f2;
        if (z14) {
            if (!this.f33629z2) {
                zrVar3.b(new tm(this, arrayList3, arrayList4, 1));
            }
        } else {
            if (!arrayList3.isEmpty()) {
                org.telegram.messenger.np.u1(this.f30173a).Z(arrayList3, null, null, -chat.f28434id, this.Z1, false, this.f33605a2);
            }
            if (!arrayList4.isEmpty()) {
                org.telegram.messenger.np.u1(this.f30173a).Z(arrayList4, null, null, this.Y1, this.Z1, true, this.f33605a2);
            }
        }
        zrVar2.c(new vr(this, 4));
        for (int i18 = 0; i18 < zrVar.f42971g; i18++) {
            if (zrVar.d[i18] && ((zArr = zrVar.f42969e) == null || zArr[i18])) {
                TLObject tLObject = (TLObject) zrVar.f42968c.get(i18);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final as f41881b;

                    {
                        this.f41881b = this;
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
                                long j11 = this.f41881b.Y1;
                                TLRPC.Peer peer = gjVar.f24213k.peer_id;
                                if ((peer != null && peer.chat_id != (-j11)) || j11 == 0) {
                                    return true;
                                }
                                return false;
                            case 1:
                                as asVar = this.f41881b;
                                asVar.getClass();
                                TLRPC.Peer peer2 = gjVar.f24213k.peer_id;
                                if (peer2 != null) {
                                    long j12 = peer2.chat_id;
                                    long j13 = asVar.Y1;
                                    if (j12 == (-j13) && j13 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                as asVar2 = this.f41881b;
                                asVar2.getClass();
                                TLRPC.Peer peer3 = gjVar.f24213k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-asVar2.Y1)) {
                                    return true;
                                }
                                return false;
                        }
                    }
                }).filter(new xr(1, tLObject)).map(new aa.l(10)).collect(Collectors.toCollection(new org.telegram.messenger.kk(1)));
                if (z14 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = org.telegram.messenger.np.n1(chat);
                    tL_messages_reportReaction.user_id = org.telegram.messenger.np.u1(this.f30173a).s1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.f28542id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = org.telegram.messenger.np.k1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.np.p1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = org.telegram.messenger.np.n1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.f28474id = arrayList5;
                    ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.f33625v2) {
            zrVar3.b(new vr(this, 0));
            return;
        }
        zrVar3.c(new vr(this, 1));
        this.f33610g2.c(new vr(this, 2));
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0);
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
