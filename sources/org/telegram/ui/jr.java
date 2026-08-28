package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class jr extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A;
    public int A0;
    public final ArrayList B;
    public int B0;
    public final ArrayList C;
    public int C0;
    public final ArrayList D;
    public int D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public int F0;
    public final a0.h G;
    public int G0;
    public final a0.h H;
    public int H0;
    public final a0.h I;
    public int I0;
    public long J;
    public int J0;
    public final int K;
    public int K0;
    public final boolean L;
    public int L0;
    public boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public int O;
    public int O0;
    public int P;
    public int P0;
    public int Q;
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
    public er f39557a;
    public int f39558a0;
    public final int f39559a1;
    public org.telegram.ui.Components.gw0 f39560b;
    public int f39561b0;
    public int f39562b1;
    public gh.f1 f39563c;
    public int f39564c0;
    public int f39565c1;
    public of.g0 d;
    public int f39566d0;
    public int f39567d1;
    public ir f39568e;
    public int f39569e0;
    public int f39570e1;
    public org.telegram.ui.ActionBar.w0 f39571f;
    public int f39572f0;
    public int f39573f1;
    public int f39574g0;
    public int f39575g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int f39576h0;
    public boolean f39577h1;
    public int f39578i0;
    public br f39579i1;
    public int f39580j0;
    public final boolean f39581j1;
    public int f39582k0;
    public boolean f39583k1;
    public int f39584l0;
    public int l1;
    public int m0;
    public int f39585m1;
    public UndoView f39586n;
    public int f39587n0;
    public boolean f39588n1;
    public int f39589o0;
    public int f39590o1;
    public int f39591p0;
    public final boolean f39592p1;
    public int f39593q0;
    public final boolean f39594q1;
    public TLRPC.Chat f39595r;
    public int f39596r0;
    public boolean f39597r1;
    public TLRPC.ChatFull f39598s;
    public boolean f39599s0;
    public boolean f39600s1;
    public int f39601t0;
    public boolean f39602t1;
    public int f39603u0;
    public boolean f39604u1;
    public final boolean v;
    public int f39605v0;
    public long f39606v1;
    public final boolean f39607w;
    public int f39608w0;
    public long f39609w1;
    public final boolean f39610x;
    public int f39611x0;
    public boolean f39612x1;
    public final String f39613y;
    public int f39614y0;
    public org.telegram.ui.Components.e00 f39615y1;
    public int f39616z0;
    public RadialProgressView f39617z1;

    public jr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.A = new TLRPC.TL_chatBannedRights();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.G = new a0.h();
        this.H = new a0.h();
        this.I = new a0.h();
        this.f39606v1 = 10L;
        this.f39609w1 = 10L;
        this.J = this.arguments.getLong("chat_id");
        this.K = this.arguments.getInt("type");
        this.L = this.arguments.getBoolean("transfer");
        this.f39581j1 = this.arguments.getBoolean("open_search");
        this.f39559a1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
        this.f39595r = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.A;
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
        this.f39613y = ChatObject.getBannedRightsString(this.A);
        boolean isCommunity = ChatObject.isCommunity(this.f39595r);
        this.f39607w = isCommunity;
        if (ChatObject.isChannel(this.f39595r) && !this.f39595r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.f39610x = ChatObject.isForum(this.f39595r);
        TLRPC.Chat chat2 = this.f39595r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f39597r1 = z18;
            this.f39592p1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f39600s1 = z19;
            this.f39594q1 = z19;
        }
    }

    public static void T(jr jrVar, long j10) {
        if (j10 != 0) {
            jrVar.J = j10;
            jrVar.f39595r = MessagesController.getInstance(jrVar.currentAccount).getChat(Long.valueOf(j10));
            jrVar.t0();
        }
    }

    public static void U(org.telegram.ui.jr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.U(org.telegram.ui.jr, android.view.View, int):void");
    }

    public static void V(jr jrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == 0) {
                hVar = jrVar.I;
            } else if (i9 == 1) {
                hVar = jrVar.H;
            } else {
                hVar = jrVar.G;
            }
            TLObject tLObject = (TLObject) hVar.f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public static org.telegram.ui.ActionBar.b5 W(jr jrVar) {
        return jrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(jr jrVar) {
        return jrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Y(jr jrVar) {
        return jrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Z(jr jrVar) {
        return jrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 a0(jr jrVar) {
        return jrVar.parentLayout;
    }

    public static void b0(jr jrVar, TLRPC.User user) {
        int i9;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = jrVar.G;
        ArrayList arrayList2 = jrVar.B;
        UndoView undoView = jrVar.f39586n;
        long j10 = -jrVar.J;
        boolean z12 = jrVar.v;
        if (z12) {
            i9 = 9;
        } else {
            i9 = 10;
        }
        undoView.m(j10, user, i9);
        jrVar.f39595r.creator = false;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < 3) {
            boolean z14 = true;
            if (i10 == 0) {
                hVar = jrVar.I;
                arrayList = jrVar.D;
            } else if (i10 == 1) {
                hVar = jrVar.H;
                arrayList = jrVar.C;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f22527id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f22527id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z10 = true;
            } else {
                z10 = false;
            }
            long clientUserId = jrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z11 = z13;
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
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z13;
                z14 = z10;
            }
            if (z14) {
                Collections.sort(arrayList, new j9.a(21));
            }
            i10++;
            z13 = z11;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f22527id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new j9.a(20));
            jrVar.A0();
        }
        jrVar.f39557a.l();
        br brVar = jrVar.f39579i1;
        if (brVar != null) {
            brVar.a(user);
        }
    }

    public static int i0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int l0(int i9) {
        if (i9 == 1) {
            return 5;
        }
        if (i9 == 2) {
            return 10;
        }
        if (i9 == 3) {
            return 30;
        }
        if (i9 == 4) {
            return 60;
        }
        if (i9 == 5) {
            return 300;
        }
        if (i9 == 6) {
            return 900;
        }
        if (i9 == 7) {
            return 3600;
        }
        return 0;
    }

    public static int m0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i9 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i9++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i9++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i9++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i9++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i9++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i9++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i9++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i9++;
        }
        if (!tL_chatBannedRights.send_reactions) {
            return i9 + 1;
        }
        return i9;
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.A0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return f0(true);
    }

    @Override
    public final View createView(Context context) {
        this.f39583k1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f39559a1;
        int i11 = this.K;
        if (i11 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.v) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i10 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 0));
        if (i10 == 0 && i11 != 2 && i11 != 0 && i11 != 3) {
            if (i11 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f39595r) && ChatObject.hasAdminRights(this.f39595r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.f39568e = new ir(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new cb(this, 2);
            this.f39571f = a2;
            if (i11 == 0 && !this.N) {
                a2.setVisibility(8);
            }
            if (i11 == 3) {
                this.f39571f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f39571f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f39595r) && !this.f39595r.creator) {
                this.f39571f.setVisibility(8);
            }
            if (i11 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.f39615y1 = e00Var;
        e00Var.setViewType(6);
        org.telegram.ui.Components.e00 e00Var2 = this.f39615y1;
        e00Var2.f27885w = false;
        e00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.e00 e00Var3 = this.f39615y1;
        int i12 = org.telegram.ui.ActionBar.f6.G8;
        int i13 = org.telegram.ui.ActionBar.f6.f23092i6;
        e00Var3.f(i12, i13, i13);
        frameLayout3.addView(this.f39615y1, g7.e6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39617z1 = radialProgressView;
        frameLayout3.addView(radialProgressView, g7.e6.e(-2, -2, 17));
        this.f39615y1.setVisibility(8);
        this.f39617z1.setVisibility(8);
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, frameLayout3, 1, null);
        this.f39560b = gw0Var;
        gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f39560b.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f39560b.setVisibility(8);
        this.f39560b.setAnimateLayoutChange(true);
        this.f39560b.e(true, false);
        frameLayout2.addView(this.f39560b, g7.e6.c(-1.0f, -1));
        this.f39560b.addView(frameLayout3, 0);
        gh.f1 f1Var = new gh.f1(this, context, 9);
        this.f39563c = f1Var;
        f1Var.p1();
        gh.f1 f1Var2 = this.f39563c;
        of.g0 g0Var = new of.g0(this);
        this.d = g0Var;
        f1Var2.setLayoutManager(g0Var);
        uq uqVar = new uq(this);
        uqVar.n(420L);
        uqVar.o(org.telegram.ui.Components.gr.h);
        uqVar.C = false;
        uqVar.f5532m = false;
        this.f39563c.setItemAnimator(uqVar);
        gh.f1 f1Var3 = this.f39563c;
        f1Var3.U1 = true;
        f1Var3.V1 = 0;
        er erVar = new er(this, context);
        this.f39557a = erVar;
        f1Var3.setAdapter(erVar);
        gh.f1 f1Var4 = this.f39563c;
        if (!LocaleController.isRTL) {
            i9 = 2;
        }
        f1Var4.setVerticalScrollbarPosition(i9);
        frameLayout2.addView(this.f39563c, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f39563c);
        this.f39563c.setOnItemClickListener(new eq(this, 3));
        this.f39563c.setOnItemLongClickListener(new eq(this, 4));
        if (this.f39571f != null) {
            this.f39563c.setOnScrollListener(new l3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f39586n = undoView;
        frameLayout2.addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        A0();
        this.f39563c.setEmptyView(this.f39560b);
        gh.f1 f1Var5 = this.f39563c;
        f1Var5.U1 = false;
        f1Var5.V1 = 0;
        if (this.f39581j1) {
            this.f39571f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = false;
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f22381id == this.J) {
                if (!booleanValue || !ChatObject.isChannel(this.f39595r)) {
                    if (this.f39598s != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f39598s = chatFull;
                    if (!z10) {
                        int j02 = j0();
                        this.f39585m1 = j02;
                        this.l1 = j02;
                        int i11 = this.f39598s.boosts_unrestrict;
                        if (i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f39588n1 = z11;
                        this.f39590o1 = i11;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
                        if (chat == null) {
                            j10 = 0;
                        } else {
                            j10 = chat.send_paid_messages_stars;
                        }
                        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i12 > 0) {
                            z12 = true;
                        }
                        this.f39604u1 = z12;
                        this.f39602t1 = z12;
                        if (i12 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.f39609w1 = clamp;
                        this.f39606v1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new cq(this, 0));
                }
            }
        } else if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.J)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean f0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.f0(boolean):boolean");
    }

    public final boolean g0(TLObject tLObject, boolean z10, View view) {
        int i9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i10;
        jr jrVar;
        final long j11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        boolean z19;
        String str2;
        int i13;
        if (tLObject == null || (i9 = this.f39559a1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z20 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i10 = channelParticipant.date;
            str = channelParticipant.rank;
            z11 = z20;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i10 = chatParticipant.date;
                str = "";
                z11 = ChatObject.canAddAdmins(this.f39595r);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z11 = false;
                i10 = 0;
            }
        }
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z21 = this.v;
        int i15 = this.K;
        if (i15 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (ChatObject.canAddAdmins(this.f39595r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11)) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z22 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11) {
                z14 = z13;
                j12 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = true;
            } else {
                z14 = z13;
                j12 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = false;
            }
            if (!z22 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (ChatObject.canBlockUsers(this.f39595r) && z15 && !z21 && ChatObject.isChannel(this.f39595r) && !this.f39595r.gigagroup) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i9 == 0) {
                z14 = (!UserObject.isDeleted(user)) & z14;
            }
            if (!z14 && (!ChatObject.canBlockUsers(this.f39595r) || !z15)) {
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z10 && z18) {
                boolean z23 = z17;
                lq lqVar = new lq(this, j12, i10, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z15);
                long j13 = j12;
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
                H.W(this.f39563c.V0(view, false));
                int i16 = R.drawable.msg_admins;
                if (z16) {
                    i12 = R.string.EditAdminRights;
                } else {
                    i12 = R.string.SetAsAdmin;
                }
                H.l(i16, LocaleController.getString(i12), new ri(lqVar, 11), z14);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new k6(this, tLObject, user, lqVar, 12), z23);
                if (ChatObject.canBlockUsers(this.f39595r) && z15) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i17 = R.drawable.msg_remove;
                if (z21) {
                    str2 = "ChannelRemoveUser";
                    i13 = R.string.ChannelRemoveUser;
                } else {
                    str2 = "KickFromGroup";
                    i13 = R.string.KickFromGroup;
                }
                H.m(z19, i17, LocaleController.getString(str2, i13), true, new e5.w(this, user, j13, 19));
                H.S = 190;
                H.Z();
                return true;
            }
            return z18;
        }
        final long j14 = j10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        org.telegram.ui.Components.x60 H2 = org.telegram.ui.Components.x60.H(this, view);
        if (i15 == 3 && ChatObject.canBlockUsers(this.f39595r)) {
            jrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new fh.m1(jrVar, j14, tL_chatBannedRights, str, tLObject, 9), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(jrVar) {
                public final jr f37581b;

                {
                    this.f37581b = jrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f37581b.h0(j14);
                            return;
                        case 1:
                            jr jrVar2 = this.f37581b;
                            long j15 = j14;
                            jrVar2.h0(j15);
                            jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                            return;
                        case 2:
                            this.f37581b.h0(j14);
                            return;
                        default:
                            jr jrVar3 = this.f37581b;
                            MessagesController messagesController = jrVar3.getMessagesController();
                            long j16 = jrVar3.J;
                            MessagesController messagesController2 = jrVar3.getMessagesController();
                            long j17 = j14;
                            messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                            jrVar3.u0(j17);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            jrVar = this;
            if (i15 == 0 && ChatObject.canBlockUsers(jrVar.f39595r)) {
                if (ChatObject.canAddUsers(jrVar.f39595r) && i14 > 0 && !ChatObject.isCommunity(jrVar.f39595r)) {
                    int i18 = R.drawable.msg_contact_add;
                    if (z21) {
                        i11 = R.string.ChannelAddToChannel;
                    } else {
                        i11 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i18, LocaleController.getString(i11), new Runnable(jrVar) {
                        public final jr f37581b;

                        {
                            this.f37581b = jrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f37581b.h0(j14);
                                    return;
                                case 1:
                                    jr jrVar2 = this.f37581b;
                                    long j15 = j14;
                                    jrVar2.h0(j15);
                                    jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                                    return;
                                case 2:
                                    this.f37581b.h0(j14);
                                    return;
                                default:
                                    jr jrVar3 = this.f37581b;
                                    MessagesController messagesController = jrVar3.getMessagesController();
                                    long j16 = jrVar3.J;
                                    MessagesController messagesController2 = jrVar3.getMessagesController();
                                    long j17 = j14;
                                    messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                    jrVar3.u0(j17);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(jrVar) {
                    public final jr f37581b;

                    {
                        this.f37581b = jrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f37581b.h0(j14);
                                return;
                            case 1:
                                jr jrVar2 = this.f37581b;
                                long j15 = j14;
                                jrVar2.h0(j15);
                                jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                                return;
                            case 2:
                                this.f37581b.h0(j14);
                                return;
                            default:
                                jr jrVar3 = this.f37581b;
                                MessagesController messagesController = jrVar3.getMessagesController();
                                long j16 = jrVar3.J;
                                MessagesController messagesController2 = jrVar3.getMessagesController();
                                long j17 = j14;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                jrVar3.u0(j17);
                                return;
                        }
                    }
                }, true);
            } else if (i15 == 1 && ChatObject.canAddAdmins(jrVar.f39595r) && z11) {
                if (!jrVar.f39595r.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j11 = j14;
                } else {
                    j11 = j14;
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new fh.m1(jrVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(jrVar) {
                    public final jr f37581b;

                    {
                        this.f37581b = jrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f37581b.h0(j11);
                                return;
                            case 1:
                                jr jrVar2 = this.f37581b;
                                long j15 = j11;
                                jrVar2.h0(j15);
                                jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                                return;
                            case 2:
                                this.f37581b.h0(j11);
                                return;
                            default:
                                jr jrVar3 = this.f37581b;
                                MessagesController messagesController = jrVar3.getMessagesController();
                                long j16 = jrVar3.J;
                                MessagesController messagesController2 = jrVar3.getMessagesController();
                                long j17 = j11;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                jrVar3.u0(j17);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(jrVar.f39563c.V0(view, false));
        H2.S = 190;
        if (H2.x() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 && z12) {
            H2.Z();
            return true;
        }
        return z12;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i9 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        int i12 = org.telegram.ui.ActionBar.f6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39586n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Components.gw0.class}, new String[]{"title"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Components.gw0.class}, new String[]{"subtitle"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39560b.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39560b.f28885e, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39563c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    public final void h0(long j10) {
        if (this.f39607w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.J);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new a5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.J);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new m(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        TLRPC.ChatFull chatFull = this.f39598s;
        if (chatFull != null) {
            int i9 = chatFull.slowmode_seconds;
            if (i9 == 5) {
                return 1;
            }
            if (i9 == 10) {
                return 2;
            }
            if (i9 == 30) {
                return 3;
            }
            if (i9 == 60) {
                return 4;
            }
            if (i9 == 300) {
                return 5;
            }
            if (i9 == 900) {
                return 6;
            }
            if (i9 == 3600) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    public final int k0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f39598s;
        if (chatFull == null) {
            return 0;
        }
        int i9 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            return Math.max(i9, arrayList.size());
        }
        return i9;
    }

    public final boolean n0() {
        boolean z10;
        if (this.f39588n1 && p0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f39598s;
        if (chatFull != null) {
            int i9 = chatFull.boosts_unrestrict;
            int i10 = this.f39590o1;
            if (i9 != i10 || ((z10 && i10 == 0) || (!z10 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0(int i9) {
        if (i9 != this.R && i9 != this.S && i9 != this.T && i9 != this.U && i9 != this.V && i9 != this.W && i9 != this.f39574g0 && i9 != this.X && i9 != this.Y && i9 != this.Z) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return f0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f39586n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        q0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f39563c.setPadding(0, 0, 0, i12);
        this.f39563c.setClipToPadding(false);
        this.f39586n.setTranslationY(-i12);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f39586n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        er erVar = this.f39557a;
        if (erVar != null) {
            erVar.l();
        }
        org.telegram.ui.Components.gw0 gw0Var = this.f39560b;
        if (gw0Var != null) {
            gw0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f39612x1 = true;
        }
        if (z10 && !z11 && this.f39581j1) {
            this.f39571f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f39571f.getSearchField());
            this.f39571f.setVisibility(8);
        }
    }

    public final boolean p0() {
        TLRPC.Chat chat = this.f39595r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.l1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.A;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void q0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.M) {
            int i9 = 0;
            this.F = false;
            this.E = false;
            boolean z10 = this.f39607w;
            int i10 = this.K;
            a0.h hVar = this.H;
            ArrayList arrayList = this.C;
            a0.h hVar2 = this.I;
            ArrayList arrayList2 = this.D;
            a0.h hVar3 = this.G;
            ArrayList arrayList3 = this.B;
            if (z10 && i10 == 2) {
                this.M = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
                ArrayList<String> arrayList4 = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    String str = arrayList4.get(i11);
                    i11++;
                    ArrayList<TLRPC.TL_contact> arrayList5 = hashMap.get(str);
                    int size2 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        TLRPC.TL_contact tL_contact = arrayList5.get(i12);
                        i12++;
                        arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                    }
                }
                A0();
                er erVar = this.f39557a;
                if (erVar != null) {
                    erVar.l();
                }
            } else if (!ChatObject.isChannel(this.f39595r)) {
                this.M = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i10 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f39598s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i9 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f39598s.participants.participants.get(i9);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i9++;
                        }
                    }
                } else if (i10 == 2 && (chatFull = this.f39598s) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f39598s.participants.participants.size();
                    while (i9 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f39598s.participants.participants.get(i9);
                        int i13 = this.f39559a1;
                        if (i13 == 0 || chatParticipant2.user_id != j10) {
                            if (i13 == 1) {
                                if (getContactsController().isContact(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    hVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                hVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                                if (user != null && user.bot) {
                                    arrayList.add(chatParticipant2);
                                    hVar.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i9++;
                    }
                }
                er erVar2 = this.f39557a;
                if (erVar2 != null) {
                    erVar2.l();
                }
                A0();
                er erVar3 = this.f39557a;
                if (erVar3 != null) {
                    erVar3.l();
                }
            } else {
                this.M = true;
                org.telegram.ui.Components.gw0 gw0Var = this.f39560b;
                if (gw0Var != null) {
                    gw0Var.e(true, false);
                }
                er erVar4 = this.f39557a;
                if (erVar4 != null) {
                    erVar4.l();
                }
                ArrayList r02 = r0();
                ArrayList arrayList6 = new ArrayList();
                jq jqVar = new jq(this, r02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i14 = 0; i14 < r02.size(); i14++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) r02.get(i14), new ff.j0(arrayList6, i14, atomicInteger, r02, jqVar, 7)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList r0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.J);
        int i9 = this.K;
        if (i9 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i9 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i9 == 2) {
            TLRPC.ChatFull chatFull = this.f39598s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f39595r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f39559a1 == 1) {
                if (!this.F) {
                    this.f39575g1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.F = true;
                    arrayList.addAll(r0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.F) {
                this.f39575g1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.F = true;
                arrayList.addAll(r0());
            } else if (!this.E) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.E = true;
                arrayList.addAll(r0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i9 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f22379q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void s0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i9, boolean z11) {
        boolean z12;
        long j11 = this.J;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.A;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        bq bqVar = new bq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i9, z10, z12, null);
        bqVar.T0 = new qq(this, tLObject, j10, z11);
        presentFragment(bqVar, z11);
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.t0():void");
    }

    public final void u0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        cr v02 = v0();
        boolean z10 = false;
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == 0) {
                hVar = this.I;
                arrayList = this.D;
            } else if (i9 == 1) {
                hVar = this.H;
                arrayList = this.C;
            } else {
                hVar = this.G;
                arrayList = this.B;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.K == 0 && (chatFull = this.f39598s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            z0(v02);
        }
        f2.r0 adapter = this.f39563c.getAdapter();
        ir irVar = this.f39568e;
        if (adapter == irVar) {
            of.v1 v1Var = irVar.h;
            Object f10 = v1Var.f19528f.f(j10);
            if (f10 != null) {
                v1Var.f19527e.remove(f10);
            }
            Object f11 = v1Var.h.f(j10);
            if (f11 != null) {
                v1Var.f19529g.remove(f11);
            }
            Object f12 = irVar.f39257e.f(j10);
            if (f12 != null) {
                irVar.d.remove(f12);
            }
            irVar.l();
        }
    }

    public final cr v0() {
        cr crVar = new cr(this);
        crVar.f37293b = this.Z0;
        crVar.f37298i = this.T0;
        crVar.f37299j = this.U0;
        crVar.f37301l.clear();
        crVar.f37301l.addAll(this.C);
        crVar.h = this.R0;
        crVar.f37297g = this.Q0;
        crVar.f37302m.clear();
        crVar.f37302m.addAll(this.D);
        crVar.f37295e = this.A0;
        crVar.f37296f = this.B0;
        crVar.f37300k.clear();
        crVar.f37300k.addAll(this.B);
        crVar.f(crVar.f37294c);
        return crVar;
    }

    public final void w0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j10;
        this.f39598s = chatFull;
        if (chatFull != null) {
            int j02 = j0();
            this.f39585m1 = j02;
            this.l1 = j02;
            int i9 = this.f39598s.boosts_unrestrict;
            boolean z11 = false;
            if (i9 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39588n1 = z10;
            this.f39590o1 = i9;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
            if (chat == null) {
                j10 = 0;
            } else {
                j10 = chat.send_paid_messages_stars;
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                z11 = true;
            }
            this.f39604u1 = z11;
            this.f39602t1 = z11;
            if (i10 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f39609w1 = clamp;
            this.f39606v1 = clamp;
        }
    }

    public final void x0(int i9) {
        if (!this.isPaused && this.f39612x1) {
            if (this.f39563c.getAdapter() != this.f39557a || !this.N) {
                org.telegram.ui.Components.e00 e00Var = null;
                for (int i10 = 0; i10 < this.f39563c.getChildCount(); i10++) {
                    View childAt = this.f39563c.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.e00) {
                        e00Var = childAt;
                    }
                }
                if (e00Var != null) {
                    this.f39563c.removeView(e00Var);
                    i9--;
                }
                this.f39563c.getViewTreeObserver().addOnPreDrawListener(new nq(this, e00Var, i9, 0));
            }
        }
    }

    public final void y0(ArrayList arrayList) {
        Collections.sort(arrayList, new kq(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void z0(cr crVar) {
        View view;
        if (this.f39557a == null) {
            A0();
            return;
        }
        A0();
        crVar.f(crVar.d);
        f2.s.c(crVar, true).b(this.f39557a);
        gh.f1 f1Var = this.f39563c;
        if (f1Var != null && this.d != null && f1Var.getChildCount() > 0) {
            int i9 = 0;
            int i10 = -1;
            while (true) {
                if (i9 < this.f39563c.getChildCount()) {
                    i10 = RecyclerView.R(this.f39563c.getChildAt(i9));
                    if (i10 != -1) {
                        view = this.f39563c.getChildAt(i9);
                        break;
                    }
                    i9++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i10, view.getTop() - this.f39563c.getPaddingTop());
            }
        }
    }
}
