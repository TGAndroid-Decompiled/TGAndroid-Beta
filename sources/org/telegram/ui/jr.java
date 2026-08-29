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
    public fr f39618a;
    public int f39619a0;
    public final int f39620a1;
    public org.telegram.ui.Components.qw0 f39621b;
    public int f39622b0;
    public int f39623b1;
    public jh.e1 f39624c;
    public int f39625c0;
    public int f39626c1;
    public vq d;
    public int f39627d0;
    public int f39628d1;
    public ir f39629e;
    public int f39630e0;
    public int f39631e1;
    public org.telegram.ui.ActionBar.w0 f39632f;
    public int f39633f0;
    public int f39634f1;
    public int f39635g0;
    public int f39636g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int f39637h0;
    public boolean f39638h1;
    public int f39639i0;
    public cr f39640i1;
    public int f39641j0;
    public final boolean f39642j1;
    public int f39643k0;
    public boolean f39644k1;
    public int f39645l0;
    public int l1;
    public int m0;
    public int f39646m1;
    public UndoView f39647n;
    public int f39648n0;
    public boolean f39649n1;
    public int f39650o0;
    public int f39651o1;
    public int f39652p0;
    public final boolean f39653p1;
    public int f39654q0;
    public final boolean f39655q1;
    public TLRPC.Chat f39656r;
    public int f39657r0;
    public boolean f39658r1;
    public TLRPC.ChatFull f39659s;
    public boolean f39660s0;
    public boolean f39661s1;
    public int f39662t0;
    public boolean f39663t1;
    public int f39664u0;
    public boolean f39665u1;
    public final boolean v;
    public int f39666v0;
    public long f39667v1;
    public final boolean f39668w;
    public int f39669w0;
    public long f39670w1;
    public final boolean f39671x;
    public int f39672x0;
    public boolean f39673x1;
    public final String f39674y;
    public int f39675y0;
    public org.telegram.ui.Components.p00 f39676y1;
    public int f39677z0;
    public RadialProgressView f39678z1;

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
        this.f39667v1 = 10L;
        this.f39670w1 = 10L;
        this.J = this.arguments.getLong("chat_id");
        this.K = this.arguments.getInt("type");
        this.L = this.arguments.getBoolean("transfer");
        this.f39642j1 = this.arguments.getBoolean("open_search");
        this.f39620a1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
        this.f39656r = chat;
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
        this.f39674y = ChatObject.getBannedRightsString(this.A);
        boolean isCommunity = ChatObject.isCommunity(this.f39656r);
        this.f39668w = isCommunity;
        if (ChatObject.isChannel(this.f39656r) && !this.f39656r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.f39671x = ChatObject.isForum(this.f39656r);
        TLRPC.Chat chat2 = this.f39656r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f39658r1 = z18;
            this.f39653p1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f39661s1 = z19;
            this.f39655q1 = z19;
        }
    }

    public static void U(jr jrVar, long j10) {
        if (j10 != 0) {
            jrVar.J = j10;
            jrVar.f39656r = MessagesController.getInstance(jrVar.currentAccount).getChat(Long.valueOf(j10));
            jrVar.u0();
        }
    }

    public static void V(org.telegram.ui.jr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.V(org.telegram.ui.jr, android.view.View, int):void");
    }

    public static void W(jr jrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = jrVar.I;
            } else if (i10 == 1) {
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

    public static org.telegram.ui.ActionBar.b5 b0(jr jrVar) {
        return jrVar.parentLayout;
    }

    public static void c0(jr jrVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = jrVar.G;
        ArrayList arrayList2 = jrVar.B;
        UndoView undoView = jrVar.f39647n;
        long j10 = -jrVar.J;
        boolean z12 = jrVar.v;
        if (z12) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        jrVar.f39656r.creator = false;
        int i11 = 0;
        boolean z13 = false;
        while (i11 < 3) {
            boolean z14 = true;
            if (i11 == 0) {
                hVar = jrVar.I;
                arrayList = jrVar.D;
            } else if (i11 == 1) {
                hVar = jrVar.H;
                arrayList = jrVar.C;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f22539id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f22539id;
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
                Collections.sort(arrayList, new lh.e4(19));
            }
            i11++;
            z13 = z11;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f22539id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new lh.e4(18));
            jrVar.B0();
        }
        jrVar.f39618a.l();
        cr crVar = jrVar.f39640i1;
        if (crVar != null) {
            crVar.a(user);
        }
    }

    public static int j0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int m0(int i10) {
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

    public static int n0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
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

    public final void A0(dr drVar) {
        View view;
        if (this.f39618a == null) {
            B0();
            return;
        }
        B0();
        drVar.f(drVar.d);
        f2.q.c(drVar, true).b(this.f39618a);
        jh.e1 e1Var = this.f39624c;
        if (e1Var != null && this.d != null && e1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f39624c.getChildCount()) {
                    i11 = RecyclerView.R(this.f39624c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f39624c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f39624c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.B0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.f39644k1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f39620a1;
        int i12 = this.K;
        if (i12 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i12 == 2) {
            if (i11 == 0) {
                if (this.v) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i11 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 22));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f39656r) && ChatObject.hasAdminRights(this.f39656r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.f39629e = new ir(this, context);
            org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new bb(this, 2);
            this.f39632f = a2;
            if (i12 == 0 && !this.N) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f39632f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f39632f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f39656r) && !this.f39656r.creator) {
                this.f39632f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.f39676y1 = p00Var;
        p00Var.setViewType(6);
        org.telegram.ui.Components.p00 p00Var2 = this.f39676y1;
        p00Var2.f31529w = false;
        p00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.p00 p00Var3 = this.f39676y1;
        int i13 = org.telegram.ui.ActionBar.g6.G8;
        int i14 = org.telegram.ui.ActionBar.g6.f23152i6;
        p00Var3.f(i13, i14, i14);
        frameLayout3.addView(this.f39676y1, i7.f6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39678z1 = radialProgressView;
        frameLayout3.addView(radialProgressView, i7.f6.e(-2, -2, 17));
        this.f39676y1.setVisibility(8);
        this.f39678z1.setVisibility(8);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, frameLayout3, 1, null);
        this.f39621b = qw0Var;
        qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f39621b.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f39621b.setVisibility(8);
        this.f39621b.setAnimateLayoutChange(true);
        this.f39621b.e(true, false);
        frameLayout2.addView(this.f39621b, i7.f6.c(-1.0f, -1));
        this.f39621b.addView(frameLayout3, 0);
        jh.e1 e1Var = new jh.e1(this, context, 8);
        this.f39624c = e1Var;
        e1Var.p1();
        jh.e1 e1Var2 = this.f39624c;
        vq vqVar = new vq(this);
        this.d = vqVar;
        e1Var2.setLayoutManager(vqVar);
        wq wqVar = new wq(this);
        wqVar.n(420L);
        wqVar.o(org.telegram.ui.Components.jr.h);
        wqVar.C = false;
        wqVar.f6463m = false;
        this.f39624c.setItemAnimator(wqVar);
        jh.e1 e1Var3 = this.f39624c;
        e1Var3.U1 = true;
        e1Var3.V1 = 0;
        fr frVar = new fr(this, context);
        this.f39618a = frVar;
        e1Var3.setAdapter(frVar);
        jh.e1 e1Var4 = this.f39624c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        e1Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f39624c, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f39624c);
        this.f39624c.setOnItemClickListener(new gq(this, 3));
        this.f39624c.setOnItemLongClickListener(new gq(this, 4));
        if (this.f39632f != null) {
            this.f39624c.setOnScrollListener(new m3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f39647n = undoView;
        frameLayout2.addView(undoView, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.f39624c.setEmptyView(this.f39621b);
        jh.e1 e1Var5 = this.f39624c;
        e1Var5.U1 = false;
        e1Var5.V1 = 0;
        if (this.f39642j1) {
            this.f39632f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = false;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f22393id == this.J) {
                if (!booleanValue || !ChatObject.isChannel(this.f39656r)) {
                    if (this.f39659s != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f39659s = chatFull;
                    if (!z10) {
                        int k02 = k0();
                        this.f39646m1 = k02;
                        this.l1 = k02;
                        int i12 = this.f39659s.boosts_unrestrict;
                        if (i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f39649n1 = z11;
                        this.f39651o1 = i12;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
                        if (chat == null) {
                            j10 = 0;
                        } else {
                            j10 = chat.send_paid_messages_stars;
                        }
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z12 = true;
                        }
                        this.f39665u1 = z12;
                        this.f39663t1 = z12;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.f39670w1 = clamp;
                        this.f39667v1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new eq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.J)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.z4.class, org.telegram.ui.Cells.w4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.y9.class, org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        int i10 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i13 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39647n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Components.qw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Components.qw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39621b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39621b.f32122e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39624c, 0, new Class[]{org.telegram.ui.Cells.z4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        jr jrVar;
        final long j11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        String str2;
        int i14;
        if (tLObject == null || (i10 = this.f39620a1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z20 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z11 = z20;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z11 = ChatObject.canAddAdmins(this.f39656r);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z11 = false;
                i11 = 0;
            }
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z21 = this.v;
        int i16 = this.K;
        if (i16 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (ChatObject.canAddAdmins(this.f39656r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11)) {
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
            if (ChatObject.canBlockUsers(this.f39656r) && z15 && !z21 && ChatObject.isChannel(this.f39656r) && !this.f39656r.gigagroup) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i10 == 0) {
                z14 = (!UserObject.isDeleted(user)) & z14;
            }
            if (!z14 && (!ChatObject.canBlockUsers(this.f39656r) || !z15)) {
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z10 && z18) {
                boolean z23 = z17;
                nq nqVar = new nq(this, j12, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z15);
                long j13 = j12;
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
                H.W(this.f39624c.V0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z16) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new ui(nqVar, 11), z14);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new gg(this, tLObject, user, nqVar, 6), z23);
                if (ChatObject.canBlockUsers(this.f39656r) && z15) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i18 = R.drawable.msg_remove;
                if (z21) {
                    str2 = "ChannelRemoveUser";
                    i14 = R.string.ChannelRemoveUser;
                } else {
                    str2 = "KickFromGroup";
                    i14 = R.string.KickFromGroup;
                }
                H.m(z19, i18, LocaleController.getString(str2, i14), true, new g5.v(this, user, j13, 18));
                H.S = 190;
                H.Z();
                return true;
            }
            return z18;
        }
        final long j14 = j10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        org.telegram.ui.Components.j70 H2 = org.telegram.ui.Components.j70.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f39656r)) {
            jrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new ih.h1(jrVar, j14, tL_chatBannedRights, str, tLObject, 9), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(jrVar) {
                public final jr f38223b;

                {
                    this.f38223b = jrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f38223b.i0(j14);
                            return;
                        case 1:
                            jr jrVar2 = this.f38223b;
                            long j15 = j14;
                            jrVar2.i0(j15);
                            jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                            return;
                        case 2:
                            this.f38223b.i0(j14);
                            return;
                        default:
                            jr jrVar3 = this.f38223b;
                            MessagesController messagesController = jrVar3.getMessagesController();
                            long j16 = jrVar3.J;
                            MessagesController messagesController2 = jrVar3.getMessagesController();
                            long j17 = j14;
                            messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                            jrVar3.v0(j17);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            jrVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(jrVar.f39656r)) {
                if (ChatObject.canAddUsers(jrVar.f39656r) && i15 > 0 && !ChatObject.isCommunity(jrVar.f39656r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z21) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(jrVar) {
                        public final jr f38223b;

                        {
                            this.f38223b = jrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f38223b.i0(j14);
                                    return;
                                case 1:
                                    jr jrVar2 = this.f38223b;
                                    long j15 = j14;
                                    jrVar2.i0(j15);
                                    jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                                    return;
                                case 2:
                                    this.f38223b.i0(j14);
                                    return;
                                default:
                                    jr jrVar3 = this.f38223b;
                                    MessagesController messagesController = jrVar3.getMessagesController();
                                    long j16 = jrVar3.J;
                                    MessagesController messagesController2 = jrVar3.getMessagesController();
                                    long j17 = j14;
                                    messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                    jrVar3.v0(j17);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(jrVar) {
                    public final jr f38223b;

                    {
                        this.f38223b = jrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f38223b.i0(j14);
                                return;
                            case 1:
                                jr jrVar2 = this.f38223b;
                                long j15 = j14;
                                jrVar2.i0(j15);
                                jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                                return;
                            case 2:
                                this.f38223b.i0(j14);
                                return;
                            default:
                                jr jrVar3 = this.f38223b;
                                MessagesController messagesController = jrVar3.getMessagesController();
                                long j16 = jrVar3.J;
                                MessagesController messagesController2 = jrVar3.getMessagesController();
                                long j17 = j14;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                jrVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(jrVar.f39656r) && z11) {
                if (!jrVar.f39656r.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j11 = j14;
                } else {
                    j11 = j14;
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new ih.h1(jrVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(jrVar) {
                    public final jr f38223b;

                    {
                        this.f38223b = jrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f38223b.i0(j11);
                                return;
                            case 1:
                                jr jrVar2 = this.f38223b;
                                long j15 = j11;
                                jrVar2.i0(j15);
                                jrVar2.getMessagesController().addUserToChat(jrVar2.J, jrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, jrVar2, null);
                                return;
                            case 2:
                                this.f38223b.i0(j11);
                                return;
                            default:
                                jr jrVar3 = this.f38223b;
                                MessagesController messagesController = jrVar3.getMessagesController();
                                long j16 = jrVar3.J;
                                MessagesController messagesController2 = jrVar3.getMessagesController();
                                long j17 = j11;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !jrVar3.v, jrVar3, false, false, null, null);
                                jrVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(jrVar.f39624c.V0(view, false));
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

    public final void i0(long j10) {
        if (this.f39668w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.J);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new b5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.J);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new o(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.f39659s;
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

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f39659s;
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

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z10;
        if (this.f39649n1 && q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f39659s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f39651o1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return g0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f39647n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        r0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39624c.setPadding(0, 0, 0, i13);
        this.f39624c.setClipToPadding(false);
        this.f39647n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f39647n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        fr frVar = this.f39618a;
        if (frVar != null) {
            frVar.l();
        }
        org.telegram.ui.Components.qw0 qw0Var = this.f39621b;
        if (qw0Var != null) {
            qw0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f39673x1 = true;
        }
        if (z10 && !z11 && this.f39642j1) {
            this.f39632f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f39632f.getSearchField());
            this.f39632f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.R && i10 != this.S && i10 != this.T && i10 != this.U && i10 != this.V && i10 != this.W && i10 != this.f39635g0 && i10 != this.X && i10 != this.Y && i10 != this.Z) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f39656r;
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

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.M) {
            int i10 = 0;
            this.F = false;
            this.E = false;
            boolean z10 = this.f39668w;
            int i11 = this.K;
            a0.h hVar = this.H;
            ArrayList arrayList = this.C;
            a0.h hVar2 = this.I;
            ArrayList arrayList2 = this.D;
            a0.h hVar3 = this.G;
            ArrayList arrayList3 = this.B;
            if (z10 && i11 == 2) {
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
                int i12 = 0;
                while (i12 < size) {
                    String str = arrayList4.get(i12);
                    i12++;
                    ArrayList<TLRPC.TL_contact> arrayList5 = hashMap.get(str);
                    int size2 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.TL_contact tL_contact = arrayList5.get(i13);
                        i13++;
                        arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                    }
                }
                B0();
                fr frVar = this.f39618a;
                if (frVar != null) {
                    frVar.l();
                }
            } else if (!ChatObject.isChannel(this.f39656r)) {
                this.M = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f39659s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f39659s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f39659s) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f39659s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f39659s.participants.participants.get(i10);
                        int i14 = this.f39620a1;
                        if (i14 == 0 || chatParticipant2.user_id != j10) {
                            if (i14 == 1) {
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
                        i10++;
                    }
                }
                fr frVar2 = this.f39618a;
                if (frVar2 != null) {
                    frVar2.l();
                }
                B0();
                fr frVar3 = this.f39618a;
                if (frVar3 != null) {
                    frVar3.l();
                }
            } else {
                this.M = true;
                org.telegram.ui.Components.qw0 qw0Var = this.f39621b;
                if (qw0Var != null) {
                    qw0Var.e(true, false);
                }
                fr frVar4 = this.f39618a;
                if (frVar4 != null) {
                    frVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                lq lqVar = new lq(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new jf.i0(arrayList6, i15, atomicInteger, s02, lqVar, 6)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.J);
        int i10 = this.K;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.f39659s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f39656r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f39620a1 == 1) {
                if (!this.F) {
                    this.f39636g1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.F = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.F) {
                this.f39636g1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.F = true;
                arrayList.addAll(s0());
            } else if (!this.E) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.E = true;
                arrayList.addAll(s0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f22391q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        boolean z12;
        long j11 = this.J;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.A;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        dq dqVar = new dq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z10, z12, null);
        dqVar.T0 = new sq(this, tLObject, j10, z11);
        presentFragment(dqVar, z11);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.u0():void");
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        dr w02 = w0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.I;
                arrayList = this.D;
            } else if (i10 == 1) {
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
                if (this.K == 0 && (chatFull = this.f39659s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        f2.p0 adapter = this.f39624c.getAdapter();
        ir irVar = this.f39629e;
        if (adapter == irVar) {
            rf.k1 k1Var = irVar.h;
            Object f9 = k1Var.f47281f.f(j10);
            if (f9 != null) {
                k1Var.f47280e.remove(f9);
            }
            Object f10 = k1Var.h.f(j10);
            if (f10 != null) {
                k1Var.f47282g.remove(f10);
            }
            Object f11 = irVar.f39322e.f(j10);
            if (f11 != null) {
                irVar.d.remove(f11);
            }
            irVar.l();
        }
    }

    public final dr w0() {
        dr drVar = new dr(this);
        drVar.f37611b = this.Z0;
        drVar.f37616i = this.T0;
        drVar.f37617j = this.U0;
        drVar.f37619l.clear();
        drVar.f37619l.addAll(this.C);
        drVar.h = this.R0;
        drVar.f37615g = this.Q0;
        drVar.f37620m.clear();
        drVar.f37620m.addAll(this.D);
        drVar.f37613e = this.A0;
        drVar.f37614f = this.B0;
        drVar.f37618k.clear();
        drVar.f37618k.addAll(this.B);
        drVar.f(drVar.f37612c);
        return drVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j10;
        this.f39659s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f39646m1 = k02;
            this.l1 = k02;
            int i10 = this.f39659s.boosts_unrestrict;
            boolean z11 = false;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39649n1 = z10;
            this.f39651o1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
            if (chat == null) {
                j10 = 0;
            } else {
                j10 = chat.send_paid_messages_stars;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                z11 = true;
            }
            this.f39665u1 = z11;
            this.f39663t1 = z11;
            if (i11 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f39670w1 = clamp;
            this.f39667v1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.f39673x1) {
            if (this.f39624c.getAdapter() != this.f39618a || !this.N) {
                org.telegram.ui.Components.p00 p00Var = null;
                for (int i11 = 0; i11 < this.f39624c.getChildCount(); i11++) {
                    View childAt = this.f39624c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.p00) {
                        p00Var = childAt;
                    }
                }
                if (p00Var != null) {
                    this.f39624c.removeView(p00Var);
                    i10--;
                }
                this.f39624c.getViewTreeObserver().addOnPreDrawListener(new pq(this, p00Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new mq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
