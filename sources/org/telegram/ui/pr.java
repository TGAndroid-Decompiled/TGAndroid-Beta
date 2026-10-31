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
public final class pr extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.zz B1;
    public int C0;
    public RadialProgressView C1;
    public TLRPC.TL_chatBannedRights D;
    public int D0;
    public int D1;
    public final ArrayList E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public int I0;
    public final a0.h J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public long M;
    public int M0;
    public final int N;
    public int N0;
    public final boolean O;
    public int O0;
    public boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public int R;
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
    public lr f40718a;
    public int f40719a0;
    public int f40720a1;
    public org.telegram.ui.Components.dw0 f40721b;
    public int f40722b0;
    public int f40723b1;
    public ag.b1 f40724c;
    public int f40725c0;
    public int f40726c1;
    public br d;
    public int f40727d0;
    public final int f40728d1;
    public or e;
    public int f40729e0;
    public int f40730e1;
    public org.telegram.ui.ActionBar.p5 f40731f;
    public int f40732f0;
    public int f40733f1;
    public int f40734g0;
    public int f40735g1;
    public UndoView h;
    public int f40736h0;
    public int f40737h1;
    public int f40738i0;
    public int f40739i1;
    public int f40740j0;
    public int f40741j1;
    public int f40742k0;
    public boolean f40743k1;
    public int f40744l0;
    public ir l1;
    public int m0;
    public final boolean f40745m1;
    public TLRPC.Chat f40746n;
    public int f40747n0;
    public boolean f40748n1;
    public int f40749o0;
    public int f40750o1;
    public int f40751p0;
    public int f40752p1;
    public int f40753q0;
    public boolean f40754q1;
    public TLRPC.ChatFull f40755r;
    public int f40756r0;
    public int f40757r1;
    public final boolean f40758s;
    public int f40759s0;
    public final boolean f40760s1;
    public int f40761t0;
    public final boolean f40762t1;
    public int f40763u0;
    public boolean f40764u1;
    public boolean f40765v0;
    public boolean f40766v1;
    public final boolean f40767w;
    public int f40768w0;
    public boolean f40769w1;
    public final boolean f40770x;
    public int f40771x0;
    public boolean f40772x1;
    public final String f40773y;
    public int f40774y0;
    public long f40775y1;
    public int f40776z0;
    public long f40777z1;

    public pr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.D = new TLRPC.TL_chatBannedRights();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new a0.h();
        this.f40775y1 = 10L;
        this.f40777z1 = 10L;
        this.M = this.arguments.getLong("chat_id");
        this.N = this.arguments.getInt("type");
        this.O = this.arguments.getBoolean("transfer");
        this.f40745m1 = this.arguments.getBoolean("open_search");
        this.f40728d1 = this.arguments.getInt("selectType");
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
        this.f40746n = L0;
        boolean z10 = false;
        if (L0 != null && (tL_chatBannedRights = L0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
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
        this.f40773y = org.telegram.messenger.w3.D(this.D);
        boolean Y = org.telegram.messenger.w3.Y(this.f40746n);
        this.f40767w = Y;
        if (org.telegram.messenger.w3.T(this.f40746n) && !this.f40746n.megagroup && !Y) {
            z10 = true;
        }
        this.f40758s = z10;
        this.f40770x = org.telegram.messenger.w3.c0(this.f40746n);
        TLRPC.Chat chat = this.f40746n;
        if (chat != null) {
            boolean z18 = chat.signatures;
            this.f40764u1 = z18;
            this.f40760s1 = z18;
            boolean z19 = chat.signature_profiles;
            this.f40766v1 = z19;
            this.f40762t1 = z19;
        }
    }

    public static void Y(pr prVar, long j10) {
        if (j10 != 0) {
            prVar.M = j10;
            prVar.f40746n = org.telegram.messenger.vp.r1(prVar.currentAccount).L0(Long.valueOf(j10));
            prVar.y0();
        }
    }

    public static void Z(final org.telegram.ui.pr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.Z(org.telegram.ui.pr, android.view.View, int):void");
    }

    public static void a0(pr prVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = prVar.L;
            } else if (i10 == 1) {
                hVar = prVar.K;
            } else {
                hVar = prVar.J;
            }
            TLObject tLObject = (TLObject) hVar.f(org.telegram.messenger.jj.C1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public static void g0(pr prVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = prVar.J;
        ArrayList arrayList2 = prVar.E;
        UndoView undoView = prVar.h;
        long j10 = -prVar.M;
        boolean z12 = prVar.f40758s;
        if (z12) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        boolean z13 = false;
        prVar.f40746n.creator = false;
        int i11 = 0;
        boolean z14 = false;
        while (i11 < 3) {
            boolean z15 = true;
            if (i11 == 0) {
                hVar = prVar.L;
                arrayList = prVar.G;
            } else if (i11 == 1) {
                hVar = prVar.K;
                arrayList = prVar.F;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f19942id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f19942id;
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
            long e = prVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e;
                tL_channelParticipantAdmin.promoted_by = e;
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
                hVar.k(tL_channelParticipantAdmin, e);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new f6(7));
            }
            i11++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f19942id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new f6(6));
            prVar.F0();
        }
        prVar.f40718a.f();
        ir irVar = prVar.l1;
        if (irVar != null) {
            irVar.a(user);
        }
    }

    public static int n0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int q0(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 3) {
            return 30;
        }
        if (i10 == 4) {
            return 60;
        }
        if (i10 == 5) {
            return 300;
        }
        if (i10 == 6) {
            return 900;
        }
        if (i10 == 7) {
            return 3600;
        }
        return 0;
    }

    public static int r0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i10++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i10++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i10++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i10++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i10++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i10++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i10++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i10++;
        }
        if (!tL_chatBannedRights.send_reactions) {
            return i10 + 1;
        }
        return i10;
    }

    public final jr A0() {
        jr jrVar = new jr(this);
        jrVar.f38567b = this.f40726c1;
        jrVar.f38571i = this.W0;
        jrVar.f38572j = this.X0;
        jrVar.f38574l.clear();
        jrVar.f38574l.addAll(this.F);
        jrVar.h = this.U0;
        jrVar.f38570g = this.T0;
        jrVar.f38575m.clear();
        jrVar.f38575m.addAll(this.G);
        jrVar.e = this.D0;
        jrVar.f38569f = this.E0;
        jrVar.f38573k.clear();
        jrVar.f38573k.addAll(this.E);
        jrVar.f(jrVar.f38568c);
        return jrVar;
    }

    public final void B0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j10;
        this.f40755r = chatFull;
        if (chatFull != null) {
            int o02 = o0();
            this.f40752p1 = o02;
            this.f40750o1 = o02;
            int i10 = this.f40755r.boosts_unrestrict;
            boolean z11 = false;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40754q1 = z10;
            this.f40757r1 = i10;
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
            if (L0 == null) {
                j10 = 0;
            } else {
                j10 = L0.send_paid_messages_stars;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                z11 = true;
            }
            this.f40772x1 = z11;
            this.f40769w1 = z11;
            if (i11 <= 0) {
                j10 = 10;
            }
            long k10 = Utilities.k(j10, getMessagesController().J6, 1L);
            this.f40777z1 = k10;
            this.f40775y1 = k10;
        }
    }

    public final void C0(int i10) {
        if (!this.isPaused && this.A1) {
            if (this.f40724c.getAdapter() != this.f40718a || !this.Q) {
                org.telegram.ui.Components.zz zzVar = null;
                for (int i11 = 0; i11 < this.f40724c.getChildCount(); i11++) {
                    View childAt = this.f40724c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.zz) {
                        zzVar = childAt;
                    }
                }
                if (zzVar != null) {
                    this.f40724c.removeView(zzVar);
                    i10--;
                }
                this.f40724c.getViewTreeObserver().addOnPreDrawListener(new uq(this, zzVar, i10, 0));
            }
        }
    }

    public final void D0(ArrayList arrayList) {
        Collections.sort(arrayList, new rq(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void E0(jr jrVar) {
        View view;
        if (this.f40718a == null) {
            F0();
            return;
        }
        F0();
        jrVar.f(jrVar.d);
        s4.n.c(jrVar, true).c(this.f40718a);
        ag.b1 b1Var = this.f40724c;
        if (b1Var != null && this.d != null && b1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f40724c.getChildCount()) {
                    i11 = RecyclerView.R(this.f40724c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f40724c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f40724c.getPaddingTop());
            }
        }
    }

    public final void F0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.F0():void");
    }

    public final void G0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f40724c != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                if (x02 != this.D1 || x03 != this.E1) {
                    this.D1 = x02;
                    this.E1 = x03;
                    for (int i10 = 1; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f40724c.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f40724c.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f40724c.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f40724c.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f40724c.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f40724c.V(i11);
                            } else if (i10 == 2) {
                                O = this.f40724c.P(i11);
                            } else {
                                O = this.f40724c.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.e5) {
                                ((org.telegram.ui.Cells.e5) O).updateColors();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21259v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21242u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.f40748n1 = false;
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i11 = this.f40728d1;
        int i12 = this.N;
        if (i12 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752333, "ChannelPermissions"));
        } else if (i12 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752453, "ChannelBlacklist"));
        } else if (i12 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752517, null));
        } else if (i12 == 2) {
            if (i11 == 0) {
                if (this.f40758s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752377, "ChannelMembers"));
                }
            } else if (i11 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752528, "ChannelAddAdmin"));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752452, "ChannelBlockUser"));
            } else if (i11 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 0));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && org.telegram.messenger.w3.V(this.f40746n) && org.telegram.messenger.w3.N(this.f40746n)) {
                this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
            }
        } else {
            this.e = new or(this, context);
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
            b10.N();
            b10.B0 = new ag.l3(this, 3);
            this.f40731f = b10;
            if (i12 == 0 && !this.Q) {
                b10.setVisibility(8);
            }
            if (i12 == 3) {
                this.f40731f.setSearchFieldHint(org.telegram.messenger.cd.L0(2131752307, "ChannelSearchException"));
            } else {
                this.f40731f.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, "Search"));
            }
            if (!org.telegram.messenger.w3.T(this.f40746n) && !this.f40746n.creator) {
                this.f40731f.setVisibility(8);
            }
            if (i12 == 3) {
                this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.B1 = zzVar;
        zzVar.setViewType(6);
        org.telegram.ui.Components.zz zzVar2 = this.B1;
        zzVar2.f33274x = false;
        zzVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.zz zzVar3 = this.B1;
        int i13 = org.telegram.ui.ActionBar.t6.G8;
        int i14 = org.telegram.ui.ActionBar.t6.f21020i6;
        zzVar3.e(i13, i14, i14);
        frameLayout2.addView(this.B1, w7.b6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, w7.b6.e(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, frameLayout2, 1, null);
        this.f40721b = dw0Var;
        dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.f40721b.e.setText(org.telegram.messenger.cd.L0(2131745824, null));
        this.f40721b.setVisibility(8);
        this.f40721b.setAnimateLayoutChange(true);
        this.f40721b.e(true, false);
        this.f40721b.addView(frameLayout2, 0);
        ag.b1 b1Var = new ag.b1(this, context, 7);
        this.f40724c = b1Var;
        b1Var.r1();
        this.f40724c.setSectionsDrawBackground(true);
        ag.b1 b1Var2 = this.f40724c;
        br brVar = new br(this, 0);
        this.d = brVar;
        b1Var2.setLayoutManager(brVar);
        cr crVar = new cr(this);
        crVar.n(420L);
        crVar.o(org.telegram.ui.Components.gr.h);
        crVar.C = false;
        crVar.f47927m = false;
        this.f40724c.setItemAnimator(crVar);
        ag.b1 b1Var3 = this.f40724c;
        b1Var3.W1 = true;
        b1Var3.X1 = 0;
        lr lrVar = new lr(this, context);
        this.f40718a = lrVar;
        b1Var3.setAdapter(lrVar);
        ag.b1 b1Var4 = this.f40724c;
        if (!org.telegram.messenger.cd.X) {
            i10 = 2;
        }
        b1Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f40724c, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f40721b, w7.b6.c(-1.0f, -1));
        this.f40724c.setOnItemClickListener(new lq(this, 3));
        this.f40724c.setOnItemLongClickListener(new lq(this, 4));
        if (this.f40731f != null) {
            this.f40724c.setOnScrollListener(new h3(this, 8));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        F0();
        this.f40724c.setEmptyView(this.f40721b);
        ag.b1 b1Var5 = this.f40724c;
        b1Var5.W1 = false;
        b1Var5.X1 = 0;
        if (this.f40745m1) {
            this.f40731f.F(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = false;
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f19794id == this.M) {
                if (!booleanValue || !org.telegram.messenger.w3.T(this.f40746n)) {
                    if (this.f40755r != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f40755r = chatFull;
                    if (!z10) {
                        int o02 = o0();
                        this.f40752p1 = o02;
                        this.f40750o1 = o02;
                        int i12 = this.f40755r.boosts_unrestrict;
                        if (i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f40754q1 = z11;
                        this.f40757r1 = i12;
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.M));
                        if (L0 == null) {
                            j10 = 0;
                        } else {
                            j10 = L0.send_paid_messages_stars;
                        }
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z12 = true;
                        }
                        this.f40772x1 = z12;
                        this.f40769w1 = z12;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long k10 = Utilities.k(j10, getMessagesController().J6, 1L);
                        this.f40777z1 = k10;
                        this.f40775y1 = k10;
                    }
                    org.telegram.messenger.i0.g3(new jq(this, 0));
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19726y1 && ((Long) objArr[0]).longValue() == (-this.M)) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f40724c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40724c, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.e5.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.yu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40724c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40724c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V6));
        int i10 = org.telegram.ui.ActionBar.t6.f21311y6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40724c, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40724c, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40721b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40721b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean k0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.k0(boolean):boolean");
    }

    public final boolean l0(org.telegram.tgnet.TLObject r24, boolean r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.l0(org.telegram.tgnet.TLObject, boolean, android.view.View):boolean");
    }

    public final void m0(long j10) {
        if (this.f40767w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().i1(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().g1(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new a3.b(1), new z4(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().i1(j10);
        tL_channels_editBanned.channel = getMessagesController().g1(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new k(this, 4));
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final int o0() {
        TLRPC.ChatFull chatFull = this.f40755r;
        if (chatFull != null) {
            int i10 = chatFull.slowmode_seconds;
            if (i10 == 5) {
                return 1;
            }
            if (i10 == 10) {
                return 2;
            }
            if (i10 == 30) {
                return 3;
            }
            if (i10 == 60) {
                return 4;
            }
            if (i10 == 300) {
                return 5;
            }
            if (i10 == 900) {
                return 6;
            }
            if (i10 == 3600) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return k0(z10);
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
        getNotificationCenter().c(this, org.telegram.messenger.zs.T);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19726y1);
        v0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.T);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19726y1);
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
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        lr lrVar = this.f40718a;
        if (lrVar != null) {
            lrVar.f();
        }
        org.telegram.ui.Components.dw0 dw0Var = this.f40721b;
        if (dw0Var != null) {
            dw0Var.requestLayout();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            G0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.A1 = true;
        }
        if (z10 && !z11 && this.f40745m1) {
            this.f40731f.getSearchField().requestFocus();
            org.telegram.messenger.i0.J3(this.f40731f.getSearchField());
            this.f40731f.setVisibility(8);
        }
    }

    public final int p0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f40755r;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            return Math.max(i10, arrayList.size());
        }
        return i10;
    }

    public final boolean s0() {
        boolean z10;
        if (this.f40754q1 && u0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f40755r;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f40757r1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean t0(int i10) {
        if (i10 != this.U && i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.Y && i10 != this.Z && i10 != this.f40740j0 && i10 != this.f40719a0 && i10 != this.f40722b0 && i10 != this.f40725c0) {
            return false;
        }
        return true;
    }

    public final boolean u0() {
        TLRPC.Chat chat = this.f40746n;
        if (chat.megagroup && !chat.gigagroup && org.telegram.messenger.w3.y(13, chat)) {
            if (this.f40750o1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.D;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.P) {
            int i10 = 0;
            this.I = false;
            this.H = false;
            boolean z10 = this.f40767w;
            int i11 = this.N;
            a0.h hVar = this.K;
            ArrayList arrayList = this.F;
            a0.h hVar2 = this.L;
            ArrayList arrayList2 = this.G;
            a0.h hVar3 = this.J;
            ArrayList arrayList3 = this.E;
            if (z10 && i11 == 2) {
                this.P = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                HashMap hashMap = org.telegram.messenger.i5.r(this.currentAccount).f16068g0;
                ArrayList arrayList4 = org.telegram.messenger.i5.r(this.currentAccount).f16069h0;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                    int size2 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList5.get(i13);
                        i13++;
                        arrayList3.add(getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                    }
                }
                F0();
                lr lrVar = this.f40718a;
                if (lrVar != null) {
                    lrVar.f();
                }
            } else if (!org.telegram.messenger.w3.T(this.f40746n)) {
                this.P = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f40755r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f40755r.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f40755r) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().f15165n;
                    int size4 = this.f40755r.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f40755r.participants.participants.get(i10);
                        int i14 = this.f40728d1;
                        if (i14 == 0 || chatParticipant2.user_id != j10) {
                            if (i14 == 1) {
                                if (getContactsController().x(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    hVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!org.telegram.messenger.h20.x(getMessagesController().Z1(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().x(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                hVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(chatParticipant2.user_id));
                                if (Z1 != null && Z1.bot) {
                                    arrayList.add(chatParticipant2);
                                    hVar.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i10++;
                    }
                }
                lr lrVar2 = this.f40718a;
                if (lrVar2 != null) {
                    lrVar2.f();
                }
                F0();
                lr lrVar3 = this.f40718a;
                if (lrVar3 != null) {
                    lrVar3.f();
                }
            } else {
                this.P = true;
                org.telegram.ui.Components.dw0 dw0Var = this.f40721b;
                if (dw0Var != null) {
                    dw0Var.e(true, false);
                }
                lr lrVar4 = this.f40718a;
                if (lrVar4 != null) {
                    lrVar4.f();
                }
                ArrayList w02 = w0();
                ArrayList arrayList6 = new ArrayList();
                qq qqVar = new qq(this, w02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < w02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) w02.get(i15), new q8(arrayList6, i15, atomicInteger, w02, qqVar, 1)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList w0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().g1(this.M);
        int i10 = this.N;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.f40755r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f40746n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f40728d1 == 1) {
                if (!this.I) {
                    this.f40741j1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.I = true;
                    arrayList.addAll(w0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.I) {
                this.f40741j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(w0());
            } else if (!this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(w0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f19792q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void x0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        boolean z12;
        long j11 = this.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        iq iqVar = new iq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z10, z12, null);
        iqVar.X0 = new xq(this, tLObject, j10, z11);
        presentFragment(iqVar, z11);
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.y0():void");
    }

    public final void z0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        jr A0 = A0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.L;
                arrayList = this.G;
            } else if (i10 == 1) {
                hVar = this.K;
                arrayList = this.F;
            } else {
                hVar = this.J;
                arrayList = this.E;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.N == 0 && (chatFull = this.f40755r) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            E0(A0);
        }
        s4.g0 adapter = this.f40724c.getAdapter();
        or orVar = this.e;
        if (adapter == orVar) {
            zf.m1 m1Var = orVar.h;
            Object f7 = m1Var.f55578f.f(j10);
            if (f7 != null) {
                m1Var.e.remove(f7);
            }
            Object f10 = m1Var.h.f(j10);
            if (f10 != null) {
                m1Var.f55579g.remove(f10);
            }
            Object f11 = orVar.e.f(j10);
            if (f11 != null) {
                orVar.d.remove(f11);
            }
            orVar.f();
        }
    }
}
