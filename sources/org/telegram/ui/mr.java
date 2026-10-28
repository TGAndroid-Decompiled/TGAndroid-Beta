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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
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
public final class mr extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.c10 B1;
    public int C0;
    public RadialProgressView C1;
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
    public ir f41502a;
    public int f41503a0;
    public int f41504a1;
    public org.telegram.ui.Components.fy0 f41505b;
    public int f41506b0;
    public int f41507b1;
    public bi.r1 f41508c;
    public int f41509c0;
    public int f41510c1;
    public ig.j0 d;
    public int f41511d0;
    public final int f41512d1;
    public lr e;
    public int f41513e0;
    public int f41514e1;
    public org.telegram.ui.ActionBar.y5 f41515f;
    public int f41516f0;
    public int f41517f1;
    public int f41518g0;
    public int f41519g1;
    public UndoView h;
    public int f41520h0;
    public int f41521h1;
    public int f41522i0;
    public int f41523i1;
    public int f41524j0;
    public int f41525j1;
    public int f41526k0;
    public boolean f41527k1;
    public int f41528l0;
    public fr l1;
    public int m0;
    public final boolean f41529m1;
    public TLRPC.Chat f41530n;
    public int f41531n0;
    public boolean f41532n1;
    public int f41533o0;
    public int f41534o1;
    public int f41535p0;
    public int f41536p1;
    public int f41537q0;
    public boolean f41538q1;
    public TLRPC.ChatFull f41539r;
    public int f41540r0;
    public int f41541r1;
    public final boolean f41542s;
    public int f41543s0;
    public final boolean f41544s1;
    public int f41545t0;
    public final boolean f41546t1;
    public int f41547u0;
    public boolean f41548u1;
    public final boolean v;
    public boolean f41549v0;
    public boolean f41550v1;
    public final boolean f41551w;
    public int f41552w0;
    public boolean f41553w1;
    public final String f41554x;
    public int f41555x0;
    public boolean f41556x1;
    public TLRPC.TL_chatBannedRights f41557y;
    public int f41558y0;
    public long f41559y1;
    public int f41560z0;
    public long f41561z1;

    public mr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f41557y = new TLRPC.TL_chatBannedRights();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new a0.h();
        this.f41559y1 = 10L;
        this.f41561z1 = 10L;
        this.M = this.arguments.getLong("chat_id");
        this.N = this.arguments.getInt("type");
        this.O = this.arguments.getBoolean("transfer");
        this.f41529m1 = this.arguments.getBoolean("open_search");
        this.f41512d1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.M));
        this.f41530n = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f41557y;
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
        this.f41554x = ChatObject.getBannedRightsString(this.f41557y);
        boolean isCommunity = ChatObject.isCommunity(this.f41530n);
        this.v = isCommunity;
        if (ChatObject.isChannel(this.f41530n) && !this.f41530n.megagroup && !isCommunity) {
            z10 = true;
        }
        this.f41542s = z10;
        this.f41551w = ChatObject.isForum(this.f41530n);
        TLRPC.Chat chat2 = this.f41530n;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f41548u1 = z18;
            this.f41544s1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f41550v1 = z19;
            this.f41546t1 = z19;
        }
    }

    public static void V(mr mrVar, long j10) {
        if (j10 != 0) {
            mrVar.M = j10;
            mrVar.f41530n = MessagesController.getInstance(mrVar.currentAccount).getChat(Long.valueOf(j10));
            mrVar.v0();
        }
    }

    public static void W(org.telegram.ui.mr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.W(org.telegram.ui.mr, android.view.View, int):void");
    }

    public static void X(mr mrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = mrVar.L;
            } else if (i10 == 1) {
                hVar = mrVar.K;
            } else {
                hVar = mrVar.J;
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

    public static org.telegram.ui.ActionBar.j5 Y(mr mrVar) {
        return mrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 Z(mr mrVar) {
        return mrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 a0(mr mrVar) {
        return mrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 b0(mr mrVar) {
        return mrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 c0(mr mrVar) {
        return mrVar.parentLayout;
    }

    public static void d0(mr mrVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = mrVar.J;
        ArrayList arrayList2 = mrVar.E;
        UndoView undoView = mrVar.h;
        long j10 = -mrVar.M;
        boolean z12 = mrVar.f41542s;
        if (z12) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        boolean z13 = false;
        mrVar.f41530n.creator = false;
        int i11 = 0;
        boolean z14 = false;
        while (i11 < 3) {
            boolean z15 = true;
            if (i11 == 0) {
                hVar = mrVar.L;
                arrayList = mrVar.G;
            } else if (i11 == 1) {
                hVar = mrVar.K;
                arrayList = mrVar.F;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f22177id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f22177id;
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
            long clientUserId = mrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
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
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(12));
            }
            i11++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f22177id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(11));
            mrVar.C0();
        }
        mrVar.f41502a.l();
        fr frVar = mrVar.l1;
        if (frVar != null) {
            frVar.a(user);
        }
    }

    public static int k0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int n0(int i10) {
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

    public static int o0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
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

    public final void A0(ArrayList arrayList) {
        Collections.sort(arrayList, new qq(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void B0(gr grVar) {
        View view;
        if (this.f41502a == null) {
            C0();
            return;
        }
        C0();
        grVar.f(grVar.d);
        s4.p.c(grVar, true).c(this.f41502a);
        bi.r1 r1Var = this.f41508c;
        if (r1Var != null && this.d != null && r1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f41508c.getChildCount()) {
                    i11 = RecyclerView.R(this.f41508c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f41508c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f41508c.getPaddingTop());
            }
        }
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.C0():void");
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f41508c != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23541n6, false);
                if (x02 != this.D1 || x03 != this.E1) {
                    this.D1 = x02;
                    this.E1 = x03;
                    for (int i10 = 1; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f41508c.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f41508c.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f41508c.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f41508c.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f41508c.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f41508c.V(i11);
                            } else if (i10 == 2) {
                                O = this.f41508c.P(i11);
                            } else {
                                O = this.f41508c.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.f5) {
                                ((org.telegram.ui.Cells.f5) O).updateColors();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23693v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23674u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.f41532n1 = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.f41512d1;
        int i12 = this.N;
        if (i12 == 3) {
            this.simpleActionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i12 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i12 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i12 == 2) {
            if (i11 == 0) {
                if (this.f41542s) {
                    this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.simpleActionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i11 == 1) {
                this.simpleActionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i11 == 3) {
                this.simpleActionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 8));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f41530n) && ChatObject.hasAdminRights(this.f41530n)) {
                this.simpleActionBar.i(LocaleController.getString(R.string.Save));
            }
        } else {
            this.e = new lr(this, context);
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.f23292z0 = new jg.e2(this, 3);
            this.f41515f = a2;
            if (i12 == 0 && !this.Q) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f41515f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f41515f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f41530n) && !this.f41530n.creator) {
                this.f41515f.setVisibility(8);
            }
            if (i12 == 3) {
                this.simpleActionBar.i(LocaleController.getString(R.string.Save));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.B1 = c10Var;
        c10Var.setViewType(6);
        org.telegram.ui.Components.c10 c10Var2 = this.B1;
        c10Var2.f27026w = false;
        c10Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.c10 c10Var3 = this.B1;
        int i13 = org.telegram.ui.ActionBar.y6.G8;
        int i14 = org.telegram.ui.ActionBar.y6.f23449i6;
        c10Var3.e(i13, i14, i14);
        frameLayout2.addView(this.B1, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, frameLayout2, 1, null);
        this.f41505b = fy0Var;
        fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f41505b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f41505b.setVisibility(8);
        this.f41505b.setAnimateLayoutChange(true);
        this.f41505b.e(true, false);
        this.f41505b.addView(frameLayout2, 0);
        bi.r1 r1Var = new bi.r1(this, context, 10);
        this.f41508c = r1Var;
        r1Var.u1();
        this.f41508c.setSectionsDrawBackground(true);
        bi.r1 r1Var2 = this.f41508c;
        ig.j0 j0Var = new ig.j0(1, this, false);
        this.d = j0Var;
        r1Var2.setLayoutManager(j0Var);
        zq zqVar = new zq(this);
        zqVar.n(420L);
        zqVar.o(org.telegram.ui.Components.ds.h);
        zqVar.C = false;
        zqVar.f47798m = false;
        this.f41508c.setItemAnimator(zqVar);
        bi.r1 r1Var3 = this.f41508c;
        r1Var3.W1 = true;
        r1Var3.X1 = 0;
        ir irVar = new ir(this, context);
        this.f41502a = irVar;
        r1Var3.setAdapter(irVar);
        bi.r1 r1Var4 = this.f41508c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        r1Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f41508c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.f41505b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f41508c.setOnItemClickListener(new lq(this, 3));
        this.f41508c.setOnItemLongClickListener(new lq(this, 4));
        if (this.f41515f != null) {
            this.f41508c.setOnScrollListener(new i3(this, 8));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        C0();
        this.f41508c.setEmptyView(this.f41505b);
        bi.r1 r1Var5 = this.f41508c;
        r1Var5.W1 = false;
        r1Var5.X1 = 0;
        if (this.f41529m1) {
            this.f41515f.F(false);
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
            if (chatFull.f22029id == this.M) {
                if (!booleanValue || !ChatObject.isChannel(this.f41530n)) {
                    if (this.f41539r != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f41539r = chatFull;
                    if (!z10) {
                        int l02 = l0();
                        this.f41536p1 = l02;
                        this.f41534o1 = l02;
                        int i12 = this.f41539r.boosts_unrestrict;
                        if (i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f41538q1 = z11;
                        this.f41541r1 = i12;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.M));
                        if (chat == null) {
                            j10 = 0;
                        } else {
                            j10 = chat.send_paid_messages_stars;
                        }
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z12 = true;
                        }
                        this.f41556x1 = z12;
                        this.f41553w1 = z12;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.f41561z1 = clamp;
                        this.f41559y1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new jq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var != null && j5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f41508c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41508c, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.f5.class, org.telegram.ui.Cells.c5.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.ax0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41508c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41508c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.V6));
        int i10 = org.telegram.ui.ActionBar.y6.f23749y6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41508c, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41508c, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23541n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41505b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41505b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    public final boolean h0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.h0(boolean):boolean");
    }

    public final boolean i0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        mr mrVar;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        String str2;
        int i14;
        if (tLObject == null || (i10 = this.f41512d1) != 0) {
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
                z11 = ChatObject.canAddAdmins(this.f41530n);
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
        boolean z21 = this.f41542s;
        int i16 = this.N;
        if (i16 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (ChatObject.canAddAdmins(this.f41530n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11)) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z22 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11) {
                z14 = z13;
                j11 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = true;
            } else {
                z14 = z13;
                j11 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = false;
            }
            if (!z22 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (ChatObject.canBlockUsers(this.f41530n) && z15 && !z21 && ChatObject.isChannel(this.f41530n) && !this.f41530n.gigagroup) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i10 == 0) {
                z14 = (!UserObject.isDeleted(user)) & z14;
            }
            if (!z14 && (!ChatObject.canBlockUsers(this.f41530n) || !z15)) {
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z10 && z18) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                boolean z23 = z17;
                rq rqVar = new rq(this, j11, i11, tLObject, tL_chatAdminRights2, tL_chatBannedRights2, str, z15);
                long j12 = j11;
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
                H.W(this.f41508c.V0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z16) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new xi(rqVar, 12), z14);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new m4.v0(this, tLObject, user, rqVar, 20), z23);
                if (ChatObject.canBlockUsers(this.f41530n) && z15) {
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
                H.m(i18, new a3.i0(this, user, j12, 18), LocaleController.getString(str2, i14), z19, true);
                H.S = 190;
                H.Z();
                return true;
            }
            return z18;
        }
        boolean z24 = z11;
        final long j13 = j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        org.telegram.ui.Components.l80 H2 = org.telegram.ui.Components.l80.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f41530n)) {
            mrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new bi.a0(mrVar, j13, tL_chatBannedRights3, str, tLObject, 9), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(mrVar) {
                public final mr f40904b;

                {
                    this.f40904b = mrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f40904b.j0(j13);
                            return;
                        case 1:
                            mr mrVar2 = this.f40904b;
                            long j14 = j13;
                            mrVar2.j0(j14);
                            mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, mrVar2, null);
                            return;
                        case 2:
                            this.f40904b.j0(j13);
                            return;
                        default:
                            mr mrVar3 = this.f40904b;
                            MessagesController messagesController = mrVar3.getMessagesController();
                            long j15 = mrVar3.M;
                            MessagesController messagesController2 = mrVar3.getMessagesController();
                            long j16 = j13;
                            messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.f41542s, mrVar3, false, false, null, null);
                            mrVar3.w0(j16);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            mrVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(mrVar.f41530n)) {
                if (ChatObject.canAddUsers(mrVar.f41530n) && i15 > 0 && !ChatObject.isCommunity(mrVar.f41530n)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z21) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(mrVar) {
                        public final mr f40904b;

                        {
                            this.f40904b = mrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f40904b.j0(j13);
                                    return;
                                case 1:
                                    mr mrVar2 = this.f40904b;
                                    long j14 = j13;
                                    mrVar2.j0(j14);
                                    mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, mrVar2, null);
                                    return;
                                case 2:
                                    this.f40904b.j0(j13);
                                    return;
                                default:
                                    mr mrVar3 = this.f40904b;
                                    MessagesController messagesController = mrVar3.getMessagesController();
                                    long j15 = mrVar3.M;
                                    MessagesController messagesController2 = mrVar3.getMessagesController();
                                    long j16 = j13;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.f41542s, mrVar3, false, false, null, null);
                                    mrVar3.w0(j16);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(mrVar) {
                    public final mr f40904b;

                    {
                        this.f40904b = mrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f40904b.j0(j13);
                                return;
                            case 1:
                                mr mrVar2 = this.f40904b;
                                long j14 = j13;
                                mrVar2.j0(j14);
                                mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, mrVar2, null);
                                return;
                            case 2:
                                this.f40904b.j0(j13);
                                return;
                            default:
                                mr mrVar3 = this.f40904b;
                                MessagesController messagesController = mrVar3.getMessagesController();
                                long j15 = mrVar3.M;
                                MessagesController messagesController2 = mrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.f41542s, mrVar3, false, false, null, null);
                                mrVar3.w0(j16);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(mrVar.f41530n) && z24) {
                if (mrVar.f41530n.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new bi.a0(mrVar, j13, tL_chatAdminRights3, str3, tLObject, 10), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(mrVar) {
                    public final mr f40904b;

                    {
                        this.f40904b = mrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f40904b.j0(j13);
                                return;
                            case 1:
                                mr mrVar2 = this.f40904b;
                                long j14 = j13;
                                mrVar2.j0(j14);
                                mrVar2.getMessagesController().addUserToChat(mrVar2.M, mrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, mrVar2, null);
                                return;
                            case 2:
                                this.f40904b.j0(j13);
                                return;
                            default:
                                mr mrVar3 = this.f40904b;
                                MessagesController messagesController = mrVar3.getMessagesController();
                                long j15 = mrVar3.M;
                                MessagesController messagesController2 = mrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !mrVar3.f41542s, mrVar3, false, false, null, null);
                                mrVar3.w0(j16);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(mrVar.f41508c.V0(view, false));
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(long j10) {
        if (this.v) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new e5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    public final int l0() {
        TLRPC.ChatFull chatFull = this.f41539r;
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

    public final int m0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f41539r;
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        return h0(z10);
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
        getNotificationCenter().addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogDeleted);
        s0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
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
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ir irVar = this.f41502a;
        if (irVar != null) {
            irVar.l();
        }
        org.telegram.ui.Components.fy0 fy0Var = this.f41505b;
        if (fy0Var != null) {
            fy0Var.requestLayout();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            D0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.A1 = true;
        }
        if (z10 && !z11 && this.f41529m1) {
            this.f41515f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f41515f.getSearchField());
            this.f41515f.setVisibility(8);
        }
    }

    public final boolean p0() {
        boolean z10;
        if (this.f41538q1 && r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f41539r;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f41541r1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean q0(int i10) {
        if (i10 != this.U && i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.Y && i10 != this.Z && i10 != this.f41524j0 && i10 != this.f41503a0 && i10 != this.f41506b0 && i10 != this.f41509c0) {
            return false;
        }
        return true;
    }

    public final boolean r0() {
        TLRPC.Chat chat = this.f41530n;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f41534o1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f41557y;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void s0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.P) {
            int i10 = 0;
            this.I = false;
            this.H = false;
            boolean z10 = this.v;
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
                C0();
                ir irVar = this.f41502a;
                if (irVar != null) {
                    irVar.l();
                }
            } else if (!ChatObject.isChannel(this.f41530n)) {
                this.P = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f41539r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f41539r.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f41539r) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f41539r.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f41539r.participants.participants.get(i10);
                        int i14 = this.f41512d1;
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
                ir irVar2 = this.f41502a;
                if (irVar2 != null) {
                    irVar2.l();
                }
                C0();
                ir irVar3 = this.f41502a;
                if (irVar3 != null) {
                    irVar3.l();
                }
            } else {
                this.P = true;
                org.telegram.ui.Components.fy0 fy0Var = this.f41505b;
                if (fy0Var != null) {
                    fy0Var.e(true, false);
                }
                ir irVar4 = this.f41502a;
                if (irVar4 != null) {
                    irVar4.l();
                }
                ArrayList t02 = t0();
                ArrayList arrayList6 = new ArrayList();
                pq pqVar = new pq(this, t02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < t02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) t02.get(i15), new ag.p0(arrayList6, i15, atomicInteger, t02, pqVar, 7)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList t0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.M);
        int i10 = this.N;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.f41539r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f41530n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f41512d1 == 1) {
                if (!this.I) {
                    this.f41525j1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.I = true;
                    arrayList.addAll(t0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.I) {
                this.f41525j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(t0());
            } else if (!this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(t0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f22027q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void u0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        boolean z12;
        long j11 = this.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f41557y;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        iq iqVar = new iq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z10, z12, null);
        iqVar.X0 = new wq(this, tLObject, j10, z11);
        presentFragment(iqVar, z11);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.v0():void");
    }

    public final void w0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        gr x02 = x0();
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
                if (this.N == 0 && (chatFull = this.f41539r) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            B0(x02);
        }
        s4.h0 adapter = this.f41508c.getAdapter();
        lr lrVar = this.e;
        if (adapter == lrVar) {
            ig.a2 a2Var = lrVar.h;
            Object f7 = a2Var.f13990f.f(j10);
            if (f7 != null) {
                a2Var.e.remove(f7);
            }
            Object f10 = a2Var.h.f(j10);
            if (f10 != null) {
                a2Var.f13991g.remove(f10);
            }
            Object f11 = lrVar.e.f(j10);
            if (f11 != null) {
                lrVar.d.remove(f11);
            }
            lrVar.l();
        }
    }

    public final gr x0() {
        gr grVar = new gr(this);
        grVar.f39671b = this.f41510c1;
        grVar.f39675i = this.W0;
        grVar.f39676j = this.X0;
        grVar.f39678l.clear();
        grVar.f39678l.addAll(this.F);
        grVar.h = this.U0;
        grVar.f39674g = this.T0;
        grVar.f39679m.clear();
        grVar.f39679m.addAll(this.G);
        grVar.e = this.D0;
        grVar.f39673f = this.E0;
        grVar.f39677k.clear();
        grVar.f39677k.addAll(this.E);
        grVar.f(grVar.f39672c);
        return grVar;
    }

    public final void y0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j10;
        this.f41539r = chatFull;
        if (chatFull != null) {
            int l02 = l0();
            this.f41536p1 = l02;
            this.f41534o1 = l02;
            int i10 = this.f41539r.boosts_unrestrict;
            boolean z11 = false;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41538q1 = z10;
            this.f41541r1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.M));
            if (chat == null) {
                j10 = 0;
            } else {
                j10 = chat.send_paid_messages_stars;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                z11 = true;
            }
            this.f41556x1 = z11;
            this.f41553w1 = z11;
            if (i11 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f41561z1 = clamp;
            this.f41559y1 = clamp;
        }
    }

    public final void z0(int i10) {
        if (!this.isPaused && this.A1) {
            if (this.f41508c.getAdapter() != this.f41502a || !this.Q) {
                org.telegram.ui.Components.c10 c10Var = null;
                for (int i11 = 0; i11 < this.f41508c.getChildCount(); i11++) {
                    View childAt = this.f41508c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.c10) {
                        c10Var = childAt;
                    }
                }
                if (c10Var != null) {
                    this.f41508c.removeView(c10Var);
                    i10--;
                }
                this.f41508c.getViewTreeObserver().addOnPreDrawListener(new tq(this, c10Var, i10, 0));
            }
        }
    }
}
