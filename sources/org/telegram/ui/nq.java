package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class nq extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.iz C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public int F1;
    public final ArrayList G;
    public int G0;
    public final ArrayList H;
    public int H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public final a0.h M;
    public int M0;
    public long N;
    public int N0;
    public final int O;
    public int O0;
    public final boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;
    public iq f48046a;
    public int f48047a0;
    public int f48048a1;
    public org.telegram.ui.Components.zu0 f48049b;
    public int f48050b0;
    public int f48051b1;
    public ci.j1 f48052c;
    public int f48053c0;
    public int f48054c1;
    public kg.f0 d;
    public int f48055d0;
    public int f48056d1;
    public mq f48057e;
    public int f48058e0;
    public final int f48059e1;
    public org.telegram.ui.ActionBar.f5 f48060f;
    public int f48061f0;
    public int f48062f1;
    public int f48063g0;
    public int f48064g1;
    public UndoView h;
    public int f48065h0;
    public int f48066h1;
    public int f48067i0;
    public int f48068i1;
    public int f48069j0;
    public int f48070j1;
    public int f48071k0;
    public int k1;
    public int f48072l0;
    public boolean f48073l1;
    public int m0;
    public fq m1;
    public TLRPC.Chat f48074n;
    public int f48075n0;
    public final boolean f48076n1;
    public int f48077o0;
    public boolean f48078o1;
    public int f48079p0;
    public int f48080p1;
    public int f48081q0;
    public int f48082q1;
    public TLRPC.ChatFull f48083r;
    public int f48084r0;
    public boolean f48085r1;
    public final boolean f48086s;
    public int f48087s0;
    public int f48088s1;
    public int f48089t0;
    public final boolean f48090t1;
    public int f48091u0;
    public final boolean f48092u1;
    public int f48093v0;
    public boolean f48094v1;
    public final boolean f48095w;
    public boolean f48096w0;
    public boolean f48097w1;
    public final boolean f48098x;
    public int f48099x0;
    public boolean f48100x1;
    public final String f48101y;
    public int f48102y0;
    public boolean f48103y1;
    public int f48104z0;
    public long f48105z1;

    public nq(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.h();
        this.L = new a0.h();
        this.M = new a0.h();
        this.f48105z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.f48076n1 = this.arguments.getBoolean("open_search");
        this.f48059e1 = this.arguments.getInt("selectType");
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
        this.f48074n = M0;
        boolean z10 = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z11 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z11;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z12 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z12;
            boolean z13 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z13;
            boolean z14 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z14;
            boolean z15 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z15;
            boolean z16 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z16;
            boolean z17 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z17;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z11 && z17 && z16 && z15 && z14 && z13 && z12) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.f48101y = org.telegram.messenger.t3.D(this.E);
        boolean Y = org.telegram.messenger.t3.Y(this.f48074n);
        this.f48095w = Y;
        if (org.telegram.messenger.t3.T(this.f48074n) && !this.f48074n.megagroup && !Y) {
            z10 = true;
        }
        this.f48086s = z10;
        this.f48098x = org.telegram.messenger.t3.c0(this.f48074n);
        TLRPC.Chat chat = this.f48074n;
        if (chat != null) {
            boolean z18 = chat.signatures;
            this.f48094v1 = z18;
            this.f48090t1 = z18;
            boolean z19 = chat.signature_profiles;
            this.f48097w1 = z19;
            this.f48092u1 = z19;
        }
    }

    public static void Z(nq nqVar, long j10) {
        if (j10 != 0) {
            nqVar.N = j10;
            nqVar.f48074n = org.telegram.messenger.hp.s1(nqVar.currentAccount).M0(Long.valueOf(j10));
            nqVar.z0();
        }
    }

    public static void a0(final org.telegram.ui.nq r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.a0(org.telegram.ui.nq, android.view.View, int):void");
    }

    public static void b0(nq nqVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0) {
                hVar = nqVar.M;
            } else if (i3 == 1) {
                hVar = nqVar.L;
            } else {
                hVar = nqVar.K;
            }
            TLObject tLObject = (TLObject) hVar.f(org.telegram.messenger.zi.C1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public static void h0(nq nqVar, TLRPC.User user) {
        int i3;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = nqVar.K;
        ArrayList arrayList2 = nqVar.F;
        UndoView undoView = nqVar.h;
        long j10 = -nqVar.N;
        boolean z12 = nqVar.f48086s;
        if (z12) {
            i3 = 9;
        } else {
            i3 = 10;
        }
        undoView.m(j10, user, i3);
        boolean z13 = false;
        nqVar.f48074n.creator = false;
        int i10 = 0;
        boolean z14 = false;
        while (i10 < 3) {
            boolean z15 = true;
            if (i10 == 0) {
                hVar = nqVar.M;
                arrayList = nqVar.H;
            } else if (i10 == 1) {
                hVar = nqVar.L;
                arrayList = nqVar.G;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f27150id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f27150id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z14 = true;
                z10 = true;
            } else {
                z10 = z13;
            }
            long e10 = nqVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e10);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e10;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e10;
                tL_channelParticipantAdmin.promoted_by = e10;
                z11 = z14;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!z12) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, e10);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new org.telegram.messenger.tq(25));
            }
            i10++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f27150id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new org.telegram.messenger.tq(24));
            nqVar.G0();
        }
        nqVar.f48046a.f();
        fq fqVar = nqVar.m1;
        if (fqVar != null) {
            fqVar.a(user);
        }
    }

    public static int o0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int r0(int i3) {
        if (i3 == 1) {
            return 5;
        }
        if (i3 == 2) {
            return 10;
        }
        if (i3 == 3) {
            return 30;
        }
        if (i3 == 4) {
            return 60;
        }
        if (i3 == 5) {
            return 300;
        }
        if (i3 == 6) {
            return 900;
        }
        if (i3 == 7) {
            return 3600;
        }
        return 0;
    }

    public static int s0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i3 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i3++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i3++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i3++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i3++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i3++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i3++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i3++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i3++;
        }
        if (!tL_chatBannedRights.send_reactions) {
            return i3 + 1;
        }
        return i3;
    }

    public final void A0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        gq B0 = B0();
        boolean z10 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0) {
                hVar = this.M;
                arrayList = this.H;
            } else if (i3 == 1) {
                hVar = this.L;
                arrayList = this.G;
            } else {
                hVar = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.f48083r) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            F0(B0);
        }
        u4.h0 adapter = this.f48052c.getAdapter();
        mq mqVar = this.f48057e;
        if (adapter == mqVar) {
            kg.v1 v1Var = mqVar.h;
            Object f10 = v1Var.f17210f.f(j10);
            if (f10 != null) {
                v1Var.f17209e.remove(f10);
            }
            Object f11 = v1Var.h.f(j10);
            if (f11 != null) {
                v1Var.f17211g.remove(f11);
            }
            Object f12 = mqVar.f47743e.f(j10);
            if (f12 != null) {
                mqVar.d.remove(f12);
            }
            mqVar.f();
        }
    }

    public final gq B0() {
        gq gqVar = new gq(this);
        gqVar.f45691b = this.f48056d1;
        gqVar.f45696i = this.X0;
        gqVar.f45697j = this.Y0;
        gqVar.f45699l.clear();
        gqVar.f45699l.addAll(this.G);
        gqVar.h = this.V0;
        gqVar.f45695g = this.U0;
        gqVar.f45700m.clear();
        gqVar.f45700m.addAll(this.H);
        gqVar.f45693e = this.E0;
        gqVar.f45694f = this.F0;
        gqVar.f45698k.clear();
        gqVar.f45698k.addAll(this.F);
        gqVar.f(gqVar.f45692c);
        return gqVar;
    }

    public final void C0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j10;
        this.f48083r = chatFull;
        if (chatFull != null) {
            int p02 = p0();
            this.f48082q1 = p02;
            this.f48080p1 = p02;
            int i3 = this.f48083r.boosts_unrestrict;
            boolean z11 = false;
            if (i3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f48085r1 = z10;
            this.f48088s1 = i3;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
            if (M0 == null) {
                j10 = 0;
            } else {
                j10 = M0.send_paid_messages_stars;
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                z11 = true;
            }
            this.f48103y1 = z11;
            this.f48100x1 = z11;
            if (i10 <= 0) {
                j10 = 10;
            }
            long k10 = Utilities.k(j10, getMessagesController().I6, 1L);
            this.A1 = k10;
            this.f48105z1 = k10;
        }
    }

    public final void D0(int i3) {
        if (!this.isPaused && this.B1) {
            if (this.f48052c.getAdapter() != this.f48046a || !this.R) {
                org.telegram.ui.Components.iz izVar = null;
                for (int i10 = 0; i10 < this.f48052c.getChildCount(); i10++) {
                    View childAt = this.f48052c.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.iz) {
                        izVar = childAt;
                    }
                }
                if (izVar != null) {
                    this.f48052c.removeView(izVar);
                    i3--;
                }
                this.f48052c.getViewTreeObserver().addOnPreDrawListener(new tp(this, izVar, i3, 0));
            }
        }
    }

    public final void E0(ArrayList arrayList) {
        Collections.sort(arrayList, new qp(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void F0(gq gqVar) {
        View view;
        if (this.f48046a == null) {
            G0();
            return;
        }
        G0();
        gqVar.f(gqVar.d);
        u4.o.c(gqVar, true).c(this.f48046a);
        ci.j1 j1Var = this.f48052c;
        if (j1Var != null && this.d != null && j1Var.getChildCount() > 0) {
            int i3 = 0;
            int i10 = -1;
            while (true) {
                if (i3 < this.f48052c.getChildCount()) {
                    i10 = RecyclerView.R(this.f48052c.getChildAt(i3));
                    if (i10 != -1) {
                        view = this.f48052c.getChildAt(i3);
                        break;
                    }
                    i3++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i10, view.getTop() - this.f48052c.getPaddingTop());
            }
        }
    }

    public final void G0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.G0():void");
    }

    public final void H0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f48052c != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                if (x02 != this.E1 || x03 != this.F1) {
                    this.E1 = x02;
                    this.F1 = x03;
                    for (int i3 = 1; i3 < 4; i3++) {
                        if (i3 == 0) {
                            attachedScrapChildCount = this.f48052c.getChildCount();
                        } else if (i3 == 1) {
                            attachedScrapChildCount = this.f48052c.getHiddenChildCount();
                        } else if (i3 == 2) {
                            attachedScrapChildCount = this.f48052c.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f48052c.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i3 == 0) {
                                O = this.f48052c.getChildAt(i10);
                            } else if (i3 == 1) {
                                O = this.f48052c.V(i10);
                            } else if (i3 == 2) {
                                O = this.f48052c.P(i10);
                            } else {
                                O = this.f48052c.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                ((org.telegram.ui.Cells.a5) O).updateColors();
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28214v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28196u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return l0(true);
    }

    @Override
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.f48078o1 = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i10 = this.f48059e1;
        int i11 = this.O;
        if (i11 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752333, "ChannelPermissions"));
        } else if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752453, "ChannelBlacklist"));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752517, null));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.f48086s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752377, "ChannelMembers"));
                }
            } else if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752528, "ChannelAddAdmin"));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752452, "ChannelBlockUser"));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 10));
        if (i10 == 0 && i11 != 2 && i11 != 0 && i11 != 3) {
            if (i11 == 1 && org.telegram.messenger.t3.V(this.f48074n) && org.telegram.messenger.t3.N(this.f48074n)) {
                this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
            }
        } else {
            this.f48057e = new mq(this, context);
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
            b10.N();
            b10.C0 = new lg.w1(this, 3);
            this.f48060f = b10;
            if (i11 == 0 && !this.R) {
                b10.setVisibility(8);
            }
            if (i11 == 3) {
                this.f48060f.setSearchFieldHint(org.telegram.messenger.bd.M0(2131752307, "ChannelSearchException"));
            } else {
                this.f48060f.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, "Search"));
            }
            if (!org.telegram.messenger.t3.T(this.f48074n) && !this.f48074n.creator) {
                this.f48060f.setVisibility(8);
            }
            if (i11 == 3) {
                this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.C1 = izVar;
        izVar.setViewType(6);
        org.telegram.ui.Components.iz izVar2 = this.C1;
        izVar2.f34869x = false;
        izVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.iz izVar3 = this.C1;
        int i12 = org.telegram.ui.ActionBar.k6.G8;
        int i13 = org.telegram.ui.ActionBar.k6.f27972i6;
        izVar3.e(i12, i13, i13);
        frameLayout2.addView(this.C1, b8.mf.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout2.addView(radialProgressView, b8.mf.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, frameLayout2, 1, null);
        this.f48049b = zu0Var;
        zu0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.f48049b.f41128e.setText(org.telegram.messenger.bd.M0(2131745817, null));
        this.f48049b.setVisibility(8);
        this.f48049b.setAnimateLayoutChange(true);
        this.f48049b.e(true, false);
        this.f48049b.addView(frameLayout2, 0);
        ci.j1 j1Var = new ci.j1(12, context, this);
        this.f48052c = j1Var;
        j1Var.r1();
        this.f48052c.setSectionsDrawBackground(true);
        ci.j1 j1Var2 = this.f48052c;
        kg.f0 f0Var = new kg.f0(1, this, false);
        this.d = f0Var;
        j1Var2.setLayoutManager(f0Var);
        zp zpVar = new zp(this);
        zpVar.n(420L);
        zpVar.o(org.telegram.ui.Components.xq.h);
        zpVar.C = false;
        zpVar.f55567m = false;
        this.f48052c.setItemAnimator(zpVar);
        ci.j1 j1Var3 = this.f48052c;
        j1Var3.X1 = true;
        j1Var3.Y1 = 0;
        iq iqVar = new iq(this, context);
        this.f48046a = iqVar;
        j1Var3.setAdapter(iqVar);
        ci.j1 j1Var4 = this.f48052c;
        if (!org.telegram.messenger.bd.f21784a0) {
            i3 = 2;
        }
        j1Var4.setVerticalScrollbarPosition(i3);
        frameLayout.addView(this.f48052c, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.f48049b, b8.mf.c(-1.0f, -1));
        this.f48052c.setOnItemClickListener(new lp(this, 3));
        this.f48052c.setOnItemLongClickListener(new lp(this, 4));
        if (this.f48060f != null) {
            this.f48052c.setOnScrollListener(new h3(this, 8));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        G0();
        this.f48052c.setEmptyView(this.f48049b);
        ci.j1 j1Var5 = this.f48052c;
        j1Var5.X1 = false;
        j1Var5.Y1 = 0;
        if (this.f48076n1) {
            this.f48060f.F(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = false;
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f27002id == this.N) {
                if (!booleanValue || !org.telegram.messenger.t3.T(this.f48074n)) {
                    if (this.f48083r != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f48083r = chatFull;
                    if (!z10) {
                        int p02 = p0();
                        this.f48082q1 = p02;
                        this.f48080p1 = p02;
                        int i11 = this.f48083r.boosts_unrestrict;
                        if (i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f48085r1 = z11;
                        this.f48088s1 = i11;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
                        if (M0 == null) {
                            j10 = 0;
                        } else {
                            j10 = M0.send_paid_messages_stars;
                        }
                        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i12 > 0) {
                            z12 = true;
                        }
                        this.f48103y1 = z12;
                        this.f48100x1 = z12;
                        if (i12 <= 0) {
                            j10 = 10;
                        }
                        long k10 = Utilities.k(j10, getMessagesController().I6, 1L);
                        this.A1 = k10;
                        this.f48105z1 = k10;
                    }
                    org.telegram.messenger.g0.h3(new jp(this, 0));
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23341y1 && ((Long) objArr[0]).longValue() == (-this.N)) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f48052c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48052c, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Components.ut0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48052c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48052c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48052c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48052c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48049b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48049b.f41128e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean l0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.l0(boolean):boolean");
    }

    public final boolean m0(org.telegram.tgnet.TLObject r24, boolean r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.m0(org.telegram.tgnet.TLObject, boolean, android.view.View):boolean");
    }

    public final void n0(long j10) {
        if (this.f48095w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new c3.b(1), new c5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j10);
        tL_channels_editBanned.channel = getMessagesController().h1(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return l0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23341y1);
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        iq iqVar = this.f48046a;
        if (iqVar != null) {
            iqVar.f();
        }
        org.telegram.ui.Components.zu0 zu0Var = this.f48049b;
        if (zu0Var != null) {
            zu0Var.requestLayout();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            H0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.f48076n1) {
            this.f48060f.getSearchField().requestFocus();
            org.telegram.messenger.g0.K3(this.f48060f.getSearchField());
            this.f48060f.setVisibility(8);
        }
    }

    public final int p0() {
        TLRPC.ChatFull chatFull = this.f48083r;
        if (chatFull != null) {
            int i3 = chatFull.slowmode_seconds;
            if (i3 == 5) {
                return 1;
            }
            if (i3 == 10) {
                return 2;
            }
            if (i3 == 30) {
                return 3;
            }
            if (i3 == 60) {
                return 4;
            }
            if (i3 == 300) {
                return 5;
            }
            if (i3 == 900) {
                return 6;
            }
            if (i3 == 3600) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    public final int q0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f48083r;
        if (chatFull == null) {
            return 0;
        }
        int i3 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            return Math.max(i3, arrayList.size());
        }
        return i3;
    }

    public final boolean t0() {
        boolean z10;
        if (this.f48085r1 && v0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f48083r;
        if (chatFull != null) {
            int i3 = chatFull.boosts_unrestrict;
            int i10 = this.f48088s1;
            if (i3 != i10 || ((z10 && i10 == 0) || (!z10 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean u0(int i3) {
        if (i3 != this.V && i3 != this.W && i3 != this.X && i3 != this.Y && i3 != this.Z && i3 != this.f48047a0 && i3 != this.f48071k0 && i3 != this.f48050b0 && i3 != this.f48053c0 && i3 != this.f48055d0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.Chat chat = this.f48074n;
        if (chat.megagroup && !chat.gigagroup && org.telegram.messenger.t3.y(13, chat)) {
            if (this.f48080p1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void w0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.Q) {
            int i3 = 0;
            this.J = false;
            this.I = false;
            boolean z10 = this.f48095w;
            int i10 = this.O;
            a0.h hVar = this.L;
            ArrayList arrayList = this.G;
            a0.h hVar2 = this.M;
            ArrayList arrayList2 = this.H;
            a0.h hVar3 = this.K;
            ArrayList arrayList3 = this.F;
            if (z10 && i10 == 2) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                HashMap hashMap = org.telegram.messenger.g5.r(this.currentAccount).f22655h0;
                ArrayList arrayList4 = org.telegram.messenger.g5.r(this.currentAccount).f22656i0;
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                    int size2 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        arrayList3.add(getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                    }
                }
                G0();
                iq iqVar = this.f48046a;
                if (iqVar != null) {
                    iqVar.f();
                }
            } else if (!org.telegram.messenger.t3.T(this.f48074n)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i10 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f48083r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i3 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f48083r.participants.participants.get(i3);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i3++;
                        }
                    }
                } else if (i10 == 2 && (chatFull = this.f48083r) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().f22848n;
                    int size4 = this.f48083r.participants.participants.size();
                    while (i3 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f48083r.participants.participants.get(i3);
                        int i13 = this.f48059e1;
                        if (i13 == 0 || chatParticipant2.user_id != j10) {
                            if (i13 == 1) {
                                if (getContactsController().x(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    hVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!org.telegram.messenger.l10.x(getMessagesController().a2(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().x(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                hVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant2.user_id));
                                if (a22 != null && a22.bot) {
                                    arrayList.add(chatParticipant2);
                                    hVar.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i3++;
                    }
                }
                iq iqVar2 = this.f48046a;
                if (iqVar2 != null) {
                    iqVar2.f();
                }
                G0();
                iq iqVar3 = this.f48046a;
                if (iqVar3 != null) {
                    iqVar3.f();
                }
            } else {
                this.Q = true;
                org.telegram.ui.Components.zu0 zu0Var = this.f48049b;
                if (zu0Var != null) {
                    zu0Var.e(true, false);
                }
                iq iqVar4 = this.f48046a;
                if (iqVar4 != null) {
                    iqVar4.f();
                }
                ArrayList x02 = x0();
                ArrayList arrayList6 = new ArrayList();
                pp ppVar = new pp(this, x02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i14 = 0; i14 < x02.size(); i14++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) x02.get(i14), new cg.j0(arrayList6, i14, atomicInteger, x02, ppVar, 6)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList x0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.N);
        int i3 = this.O;
        if (i3 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i3 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i3 == 2) {
            TLRPC.ChatFull chatFull = this.f48083r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f48074n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f48059e1 == 1) {
                if (!this.J) {
                    this.k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(x0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.J) {
                this.k1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.J = true;
                arrayList.addAll(x0());
            } else if (!this.I) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.I = true;
                arrayList.addAll(x0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i3 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f27000q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void y0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i3, boolean z11) {
        boolean z12;
        long j11 = this.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ip ipVar = new ip(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i3, z10, z12, null);
        ipVar.Y0 = new wp(this, tLObject, j10, z11);
        presentFragment(ipVar, z11);
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.z0():void");
    }
}
