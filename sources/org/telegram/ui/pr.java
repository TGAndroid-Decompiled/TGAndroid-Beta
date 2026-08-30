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
public final class pr extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public RadialProgressView A1;
    public TLRPC.TL_chatBannedRights B;
    public int B0;
    public final ArrayList C;
    public int C0;
    public final ArrayList D;
    public int D0;
    public final ArrayList E;
    public int E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public int G0;
    public final a0.h H;
    public int H0;
    public final a0.h I;
    public int I0;
    public final a0.h J;
    public int J0;
    public long K;
    public int K0;
    public final int L;
    public int L0;
    public final boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
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
    public lr f37444a;
    public int f37445a0;
    public int f37446a1;
    public org.telegram.ui.Components.zw0 f37447b;
    public int f37448b0;
    public final int f37449b1;
    public lh.e1 f37450c;
    public int f37451c0;
    public int f37452c1;
    public br d;
    public int f37453d0;
    public int f37454d1;
    public or e;
    public int f37455e0;
    public int f37456e1;
    public org.telegram.ui.ActionBar.w0 f37457f;
    public int f37458f0;
    public int f37459f1;
    public int f37460g0;
    public int f37461g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int f37462h0;
    public int f37463h1;
    public int f37464i0;
    public boolean f37465i1;
    public int f37466j0;
    public ir f37467j1;
    public int f37468k0;
    public final boolean f37469k1;
    public int f37470l0;
    public boolean l1;
    public int m0;
    public int f37471m1;
    public UndoView f37472n;
    public int f37473n0;
    public int f37474n1;
    public int f37475o0;
    public boolean f37476o1;
    public int f37477p0;
    public int f37478p1;
    public int f37479q0;
    public final boolean f37480q1;
    public TLRPC.Chat f37481r;
    public int f37482r0;
    public final boolean f37483r1;
    public TLRPC.ChatFull f37484s;
    public int f37485s0;
    public boolean f37486s1;
    public boolean f37487t0;
    public boolean f37488t1;
    public int f37489u0;
    public boolean f37490u1;
    public final boolean v;
    public int f37491v0;
    public boolean f37492v1;
    public final boolean f37493w;
    public int f37494w0;
    public long f37495w1;
    public final boolean f37496x;
    public int f37497x0;
    public long f37498x1;
    public final String f37499y;
    public int f37500y0;
    public boolean f37501y1;
    public int f37502z0;
    public org.telegram.ui.Components.t00 f37503z1;

    public pr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.B = new TLRPC.TL_chatBannedRights();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.H = new a0.h();
        this.I = new a0.h();
        this.J = new a0.h();
        this.f37495w1 = 10L;
        this.f37498x1 = 10L;
        this.K = this.arguments.getLong("chat_id");
        this.L = this.arguments.getInt("type");
        this.M = this.arguments.getBoolean("transfer");
        this.f37469k1 = this.arguments.getBoolean("open_search");
        this.f37449b1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
        this.f37481r = chat;
        boolean z4 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.B;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z10 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z10;
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
            boolean z11 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z11;
            boolean z12 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z12;
            boolean z13 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z13;
            boolean z14 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z14;
            boolean z15 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z15;
            boolean z16 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z16;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z10 && z16 && z15 && z14 && z13 && z12 && z11) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.f37499y = ChatObject.getBannedRightsString(this.B);
        boolean isCommunity = ChatObject.isCommunity(this.f37481r);
        this.f37493w = isCommunity;
        if (ChatObject.isChannel(this.f37481r) && !this.f37481r.megagroup && !isCommunity) {
            z4 = true;
        }
        this.v = z4;
        this.f37496x = ChatObject.isForum(this.f37481r);
        TLRPC.Chat chat2 = this.f37481r;
        if (chat2 != null) {
            boolean z17 = chat2.signatures;
            this.f37486s1 = z17;
            this.f37480q1 = z17;
            boolean z18 = chat2.signature_profiles;
            this.f37488t1 = z18;
            this.f37483r1 = z18;
        }
    }

    public static void U(pr prVar, long j10) {
        if (j10 != 0) {
            prVar.K = j10;
            prVar.f37481r = MessagesController.getInstance(prVar.currentAccount).getChat(Long.valueOf(j10));
            prVar.u0();
        }
    }

    public static void V(org.telegram.ui.pr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.V(org.telegram.ui.pr, android.view.View, int):void");
    }

    public static void W(pr prVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = prVar.J;
            } else if (i10 == 1) {
                hVar = prVar.I;
            } else {
                hVar = prVar.H;
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

    public static org.telegram.ui.ActionBar.e5 X(pr prVar) {
        return prVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Y(pr prVar) {
        return prVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Z(pr prVar) {
        return prVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 a0(pr prVar) {
        return prVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 b0(pr prVar) {
        return prVar.parentLayout;
    }

    public static void c0(pr prVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        a0.h hVar2 = prVar.H;
        ArrayList arrayList2 = prVar.C;
        UndoView undoView = prVar.f37472n;
        long j10 = -prVar.K;
        boolean z11 = prVar.v;
        if (z11) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        prVar.f37481r.creator = false;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < 3) {
            boolean z13 = true;
            if (i11 == 0) {
                hVar = prVar.J;
                arrayList = prVar.E;
            } else if (i11 == 1) {
                hVar = prVar.I;
                arrayList = prVar.D;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f19331id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f19331id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z12 = true;
                z4 = true;
            } else {
                z4 = false;
            }
            long clientUserId = prVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z10 = z12;
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
                if (!z11) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z10 = z12;
                z13 = z4;
            }
            if (z13) {
                Collections.sort(arrayList, new nh.e4(16));
            }
            i11++;
            z12 = z10;
        }
        if (!z12) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f19331id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new nh.e4(15));
            prVar.B0();
        }
        prVar.f37444a.l();
        ir irVar = prVar.f37467j1;
        if (irVar != null) {
            irVar.a(user);
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

    public final void A0(jr jrVar) {
        View view;
        if (this.f37444a == null) {
            B0();
            return;
        }
        B0();
        jrVar.f(jrVar.d);
        f2.q.c(jrVar, true).b(this.f37444a);
        lh.e1 e1Var = this.f37450c;
        if (e1Var != null && this.d != null && e1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f37450c.getChildCount()) {
                    i11 = RecyclerView.R(this.f37450c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f37450c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f37450c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.B0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.l1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37449b1;
        int i12 = this.L;
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
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 22));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f37481r) && ChatObject.hasAdminRights(this.f37481r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.e = new or(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new fb(this, 2);
            this.f37457f = a2;
            if (i12 == 0 && !this.O) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f37457f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f37457f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f37481r) && !this.f37481r.creator) {
                this.f37457f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.f37503z1 = t00Var;
        t00Var.setViewType(6);
        org.telegram.ui.Components.t00 t00Var2 = this.f37503z1;
        t00Var2.f28855w = false;
        t00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.t00 t00Var3 = this.f37503z1;
        int i13 = org.telegram.ui.ActionBar.j6.G8;
        int i14 = org.telegram.ui.ActionBar.j6.f19996i6;
        t00Var3.f(i13, i14, i14);
        frameLayout3.addView(this.f37503z1, k7.b6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A1 = radialProgressView;
        frameLayout3.addView(radialProgressView, k7.b6.e(-2, -2, 17));
        this.f37503z1.setVisibility(8);
        this.A1.setVisibility(8);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, frameLayout3, 1, null);
        this.f37447b = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f37447b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f37447b.setVisibility(8);
        this.f37447b.setAnimateLayoutChange(true);
        this.f37447b.e(true, false);
        frameLayout2.addView(this.f37447b, k7.b6.c(-1.0f, -1));
        this.f37447b.addView(frameLayout3, 0);
        lh.e1 e1Var = new lh.e1(this, context, 7);
        this.f37450c = e1Var;
        e1Var.p1();
        lh.e1 e1Var2 = this.f37450c;
        br brVar = new br(this);
        this.d = brVar;
        e1Var2.setLayoutManager(brVar);
        cr crVar = new cr(this);
        crVar.n(420L);
        crVar.o(org.telegram.ui.Components.nr.h);
        crVar.C = false;
        crVar.f5818m = false;
        this.f37450c.setItemAnimator(crVar);
        lh.e1 e1Var3 = this.f37450c;
        e1Var3.V1 = true;
        e1Var3.W1 = 0;
        lr lrVar = new lr(this, context);
        this.f37444a = lrVar;
        e1Var3.setAdapter(lrVar);
        lh.e1 e1Var4 = this.f37450c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        e1Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f37450c, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f37450c);
        this.f37450c.setOnItemClickListener(new mq(this, 3));
        this.f37450c.setOnItemLongClickListener(new mq(this, 4));
        if (this.f37457f != null) {
            this.f37450c.setOnScrollListener(new l3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f37472n = undoView;
        frameLayout2.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.f37450c.setEmptyView(this.f37447b);
        lh.e1 e1Var5 = this.f37450c;
        e1Var5.V1 = false;
        e1Var5.W1 = 0;
        if (this.f37469k1) {
            this.f37457f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        boolean z10;
        long j10;
        boolean z11 = false;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f19185id == this.K) {
                if (!booleanValue || !ChatObject.isChannel(this.f37481r)) {
                    if (this.f37484s != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f37484s = chatFull;
                    if (!z4) {
                        int k02 = k0();
                        this.f37474n1 = k02;
                        this.f37471m1 = k02;
                        int i12 = this.f37484s.boosts_unrestrict;
                        if (i12 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f37476o1 = z10;
                        this.f37478p1 = i12;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
                        if (chat == null) {
                            j10 = 0;
                        } else {
                            j10 = chat.send_paid_messages_stars;
                        }
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z11 = true;
                        }
                        this.f37492v1 = z11;
                        this.f37490u1 = z11;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.f37498x1 = clamp;
                        this.f37495w1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new kq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.K)) {
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var != null && e5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i10 = org.telegram.ui.ActionBar.j6.f19871b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19943f7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20281y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i13 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37472n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20207u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20225v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Components.zw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Components.zw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37447b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37447b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37450c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z4, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10;
        int i11;
        pr prVar;
        final long j11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        boolean z18;
        String str2;
        int i14;
        if (tLObject == null || (i10 = this.f37449b1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z19 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z10 = z19;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z10 = ChatObject.canAddAdmins(this.f37481r);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z10 = false;
                i11 = 0;
            }
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z20 = this.v;
        int i16 = this.L;
        if (i16 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (ChatObject.canAddAdmins(this.f37481r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z10)) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z21 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z21 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z10) {
                z13 = z12;
                j12 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z14 = true;
            } else {
                z13 = z12;
                j12 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z14 = false;
            }
            if (!z21 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (ChatObject.canBlockUsers(this.f37481r) && z14 && !z20 && ChatObject.isChannel(this.f37481r) && !this.f37481r.gigagroup) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i10 == 0) {
                z13 = (!UserObject.isDeleted(user)) & z13;
            }
            if (!z13 && (!ChatObject.canBlockUsers(this.f37481r) || !z14)) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!z4 && z17) {
                boolean z22 = z16;
                tq tqVar = new tq(this, j12, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z14);
                long j13 = j12;
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
                H.W(this.f37450c.V0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z15) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new zi(tqVar, 11), z13);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new ih((Object) this, (Object) tLObject, (Object) user, (Object) tqVar, 4), z22);
                if (ChatObject.canBlockUsers(this.f37481r) && z14) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                int i18 = R.drawable.msg_remove;
                if (z20) {
                    str2 = "ChannelRemoveUser";
                    i14 = R.string.ChannelRemoveUser;
                } else {
                    str2 = "KickFromGroup";
                    i14 = R.string.KickFromGroup;
                }
                H.m(z18, i18, LocaleController.getString(str2, i14), true, new i5.v(this, user, j13, 17));
                H.S = 190;
                H.Z();
                return true;
            }
            return z17;
        }
        final long j14 = j10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        org.telegram.ui.Components.o70 H2 = org.telegram.ui.Components.o70.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f37481r)) {
            prVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new kh.g1(prVar, j14, tL_chatBannedRights, str, tLObject, 9), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(prVar) {
                public final pr f36123b;

                {
                    this.f36123b = prVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f36123b.i0(j14);
                            return;
                        case 1:
                            pr prVar2 = this.f36123b;
                            long j15 = j14;
                            prVar2.i0(j15);
                            prVar2.getMessagesController().addUserToChat(prVar2.K, prVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, prVar2, null);
                            return;
                        case 2:
                            this.f36123b.i0(j14);
                            return;
                        default:
                            pr prVar3 = this.f36123b;
                            MessagesController messagesController = prVar3.getMessagesController();
                            long j16 = prVar3.K;
                            MessagesController messagesController2 = prVar3.getMessagesController();
                            long j17 = j14;
                            messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !prVar3.v, prVar3, false, false, null, null);
                            prVar3.v0(j17);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            prVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(prVar.f37481r)) {
                if (ChatObject.canAddUsers(prVar.f37481r) && i15 > 0 && !ChatObject.isCommunity(prVar.f37481r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z20) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(prVar) {
                        public final pr f36123b;

                        {
                            this.f36123b = prVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f36123b.i0(j14);
                                    return;
                                case 1:
                                    pr prVar2 = this.f36123b;
                                    long j15 = j14;
                                    prVar2.i0(j15);
                                    prVar2.getMessagesController().addUserToChat(prVar2.K, prVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, prVar2, null);
                                    return;
                                case 2:
                                    this.f36123b.i0(j14);
                                    return;
                                default:
                                    pr prVar3 = this.f36123b;
                                    MessagesController messagesController = prVar3.getMessagesController();
                                    long j16 = prVar3.K;
                                    MessagesController messagesController2 = prVar3.getMessagesController();
                                    long j17 = j14;
                                    messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !prVar3.v, prVar3, false, false, null, null);
                                    prVar3.v0(j17);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(prVar) {
                    public final pr f36123b;

                    {
                        this.f36123b = prVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f36123b.i0(j14);
                                return;
                            case 1:
                                pr prVar2 = this.f36123b;
                                long j15 = j14;
                                prVar2.i0(j15);
                                prVar2.getMessagesController().addUserToChat(prVar2.K, prVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, prVar2, null);
                                return;
                            case 2:
                                this.f36123b.i0(j14);
                                return;
                            default:
                                pr prVar3 = this.f36123b;
                                MessagesController messagesController = prVar3.getMessagesController();
                                long j16 = prVar3.K;
                                MessagesController messagesController2 = prVar3.getMessagesController();
                                long j17 = j14;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !prVar3.v, prVar3, false, false, null, null);
                                prVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(prVar.f37481r) && z10) {
                if (!prVar.f37481r.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j11 = j14;
                } else {
                    j11 = j14;
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new kh.g1(prVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(prVar) {
                    public final pr f36123b;

                    {
                        this.f36123b = prVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f36123b.i0(j11);
                                return;
                            case 1:
                                pr prVar2 = this.f36123b;
                                long j15 = j11;
                                prVar2.i0(j15);
                                prVar2.getMessagesController().addUserToChat(prVar2.K, prVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, prVar2, null);
                                return;
                            case 2:
                                this.f36123b.i0(j11);
                                return;
                            default:
                                pr prVar3 = this.f36123b;
                                MessagesController messagesController = prVar3.getMessagesController();
                                long j16 = prVar3.K;
                                MessagesController messagesController2 = prVar3.getMessagesController();
                                long j17 = j11;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !prVar3.v, prVar3, false, false, null, null);
                                prVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(prVar.f37450c.V0(view, false));
        H2.S = 190;
        if (H2.x() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z4 && z11) {
            H2.Z();
            return true;
        }
        return z11;
    }

    public final void i0(long j10) {
        if (this.f37493w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.K);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new d5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.K);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new o(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.f37484s;
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
        TLRPC.ChatFull chatFull = this.f37484s;
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
        boolean z4;
        if (this.f37476o1 && q0()) {
            z4 = true;
        } else {
            z4 = false;
        }
        TLRPC.ChatFull chatFull = this.f37484s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f37478p1;
            if (i10 != i11 || ((z4 && i11 == 0) || (!z4 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        return g0(z4);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f37472n;
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
        this.f37450c.setPadding(0, 0, 0, i13);
        this.f37450c.setClipToPadding(false);
        this.f37472n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f37472n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        lr lrVar = this.f37444a;
        if (lrVar != null) {
            lrVar.l();
        }
        org.telegram.ui.Components.zw0 zw0Var = this.f37447b;
        if (zw0Var != null) {
            zw0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.f37501y1 = true;
        }
        if (z4 && !z10 && this.f37469k1) {
            this.f37457f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f37457f.getSearchField());
            this.f37457f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.S && i10 != this.T && i10 != this.U && i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.f37462h0 && i10 != this.Y && i10 != this.Z && i10 != this.f37445a0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f37481r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f37471m1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.B;
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
        if (!this.N) {
            int i10 = 0;
            this.G = false;
            this.F = false;
            boolean z4 = this.f37493w;
            int i11 = this.L;
            a0.h hVar = this.I;
            ArrayList arrayList = this.D;
            a0.h hVar2 = this.J;
            ArrayList arrayList2 = this.E;
            a0.h hVar3 = this.H;
            ArrayList arrayList3 = this.C;
            if (z4 && i11 == 2) {
                this.N = false;
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
                lr lrVar = this.f37444a;
                if (lrVar != null) {
                    lrVar.l();
                }
            } else if (!ChatObject.isChannel(this.f37481r)) {
                this.N = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f37484s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f37484s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f37484s) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f37484s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f37484s.participants.participants.get(i10);
                        int i14 = this.f37449b1;
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
                lr lrVar2 = this.f37444a;
                if (lrVar2 != null) {
                    lrVar2.l();
                }
                B0();
                lr lrVar3 = this.f37444a;
                if (lrVar3 != null) {
                    lrVar3.l();
                }
            } else {
                this.N = true;
                org.telegram.ui.Components.zw0 zw0Var = this.f37447b;
                if (zw0Var != null) {
                    zw0Var.e(true, false);
                }
                lr lrVar4 = this.f37444a;
                if (lrVar4 != null) {
                    lrVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                rq rqVar = new rq(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new lf.i0(arrayList6, i15, atomicInteger, s02, rqVar, 6)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.K);
        int i10 = this.L;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.f37484s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f37481r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f37449b1 == 1) {
                if (!this.G) {
                    this.f37463h1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.G = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.G) {
                this.f37463h1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.G = true;
                arrayList.addAll(s0());
            } else if (!this.F) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.F = true;
                arrayList.addAll(s0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f19183q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, int i10, boolean z10) {
        boolean z11;
        long j11 = this.K;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.B;
        if (tLObject == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        jq jqVar = new jq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z4, z11, null);
        jqVar.U0 = new yq(this, tLObject, j10, z10);
        presentFragment(jqVar, z10);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.u0():void");
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        jr w02 = w0();
        boolean z4 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.J;
                arrayList = this.E;
            } else if (i10 == 1) {
                hVar = this.I;
                arrayList = this.D;
            } else {
                hVar = this.H;
                arrayList = this.C;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.L == 0 && (chatFull = this.f37484s) != null) {
                    chatFull.kicked_count--;
                }
                z4 = true;
            }
        }
        if (z4) {
            A0(w02);
        }
        f2.o0 adapter = this.f37450c.getAdapter();
        or orVar = this.e;
        if (adapter == orVar) {
            tf.k1 k1Var = orVar.h;
            Object f10 = k1Var.f44772f.f(j10);
            if (f10 != null) {
                k1Var.e.remove(f10);
            }
            Object f11 = k1Var.h.f(j10);
            if (f11 != null) {
                k1Var.f44773g.remove(f11);
            }
            Object f12 = orVar.e.f(j10);
            if (f12 != null) {
                orVar.d.remove(f12);
            }
            orVar.l();
        }
    }

    public final jr w0() {
        jr jrVar = new jr(this);
        jrVar.f35467b = this.f37446a1;
        jrVar.f35471i = this.U0;
        jrVar.f35472j = this.V0;
        jrVar.f35474l.clear();
        jrVar.f35474l.addAll(this.D);
        jrVar.h = this.S0;
        jrVar.f35470g = this.R0;
        jrVar.f35475m.clear();
        jrVar.f35475m.addAll(this.E);
        jrVar.e = this.B0;
        jrVar.f35469f = this.C0;
        jrVar.f35473k.clear();
        jrVar.f35473k.addAll(this.C);
        jrVar.f(jrVar.f35468c);
        return jrVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z4;
        long j10;
        this.f37484s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f37474n1 = k02;
            this.f37471m1 = k02;
            int i10 = this.f37484s.boosts_unrestrict;
            boolean z10 = false;
            if (i10 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f37476o1 = z4;
            this.f37478p1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
            if (chat == null) {
                j10 = 0;
            } else {
                j10 = chat.send_paid_messages_stars;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                z10 = true;
            }
            this.f37492v1 = z10;
            this.f37490u1 = z10;
            if (i11 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f37498x1 = clamp;
            this.f37495w1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.f37501y1) {
            if (this.f37450c.getAdapter() != this.f37444a || !this.O) {
                org.telegram.ui.Components.t00 t00Var = null;
                for (int i11 = 0; i11 < this.f37450c.getChildCount(); i11++) {
                    View childAt = this.f37450c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.t00) {
                        t00Var = childAt;
                    }
                }
                if (t00Var != null) {
                    this.f37450c.removeView(t00Var);
                    i10--;
                }
                this.f37450c.getViewTreeObserver().addOnPreDrawListener(new vq(this, t00Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new sq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
