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
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

public final class lr extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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

    public hr f40179a;

    public int f40180a0;

    public final int f40181a1;

    public org.telegram.ui.Components.iw0 f40182b;

    public int f40183b0;

    public int f40184b1;

    public hh.f1 f40185c;

    public int f40186c0;

    public int f40187c1;
    public vq d;

    public int f40188d0;

    public int f40189d1;

    public kr f40190e;

    public int f40191e0;

    public int f40192e1;

    public org.telegram.ui.ActionBar.v0 f40193f;

    public int f40194f0;

    public int f40195f1;

    public int f40196g0;

    public int f40197g1;
    public org.telegram.ui.ActionBar.v0 h;

    public int f40198h0;

    public boolean f40199h1;

    public int f40200i0;

    public dr f40201i1;

    public int f40202j0;

    public final boolean f40203j1;

    public int f40204k0;

    public boolean f40205k1;

    public int f40206l0;
    public int l1;
    public int m0;

    public int f40207m1;

    public UndoView f40208n;

    public int f40209n0;

    public boolean f40210n1;

    public int f40211o0;

    public int f40212o1;

    public int f40213p0;

    public final boolean f40214p1;

    public int f40215q0;

    public final boolean f40216q1;

    public TLRPC.Chat f40217r;

    public int f40218r0;

    public boolean f40219r1;

    public TLRPC.ChatFull f40220s;

    public boolean f40221s0;

    public boolean f40222s1;

    public int f40223t0;

    public boolean f40224t1;

    public int f40225u0;

    public boolean f40226u1;
    public final boolean v;

    public int f40227v0;

    public long f40228v1;

    public final boolean f40229w;

    public int f40230w0;

    public long f40231w1;

    public final boolean f40232x;

    public int f40233x0;

    public boolean f40234x1;

    public final String f40235y;

    public int f40236y0;

    public org.telegram.ui.Components.h00 f40237y1;

    public int f40238z0;

    public RadialProgressView f40239z1;

    public lr(Bundle bundle) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        super(bundle);
        this.A = new TLRPC.TL_chatBannedRights();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.G = new a0.h();
        this.H = new a0.h();
        this.I = new a0.h();
        this.f40228v1 = 10L;
        this.f40231w1 = 10L;
        this.J = this.arguments.getLong("chat_id");
        this.K = this.arguments.getInt("type");
        this.L = this.arguments.getBoolean("transfer");
        this.f40203j1 = this.arguments.getBoolean("open_search");
        this.f40181a1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
        this.f40217r = chat;
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
        this.f40235y = ChatObject.getBannedRightsString(this.A);
        boolean zIsCommunity = ChatObject.isCommunity(this.f40217r);
        this.f40229w = zIsCommunity;
        if (ChatObject.isChannel(this.f40217r) && !this.f40217r.megagroup && !zIsCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.f40232x = ChatObject.isForum(this.f40217r);
        TLRPC.Chat chat2 = this.f40217r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f40219r1 = z18;
            this.f40214p1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f40222s1 = z19;
            this.f40216q1 = z19;
        }
    }

    public static void U(lr lrVar, long j10) {
        if (j10 != 0) {
            lrVar.J = j10;
            lrVar.f40217r = MessagesController.getInstance(lrVar.currentAccount).getChat(Long.valueOf(j10));
            lrVar.u0();
        }
    }

    public static void V(final lr lrVar, View view, int i10) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View viewM;
        String str;
        TLObject tLObjectE;
        long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long peerId;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLObject tLObjectE2;
        boolean z10;
        long j11;
        int i11;
        TLObject tLObject;
        a0.h hVar;
        long j12;
        boolean zCanBlockUsers;
        boolean z11;
        Bundle bundle;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        int i15 = lrVar.f40181a1;
        a0.h hVar2 = lrVar.G;
        a0.h hVar3 = lrVar.I;
        boolean z12 = lrVar.v;
        int i16 = lrVar.K;
        final int i17 = 0;
        i17 = 0;
        i17 = 0;
        final int i18 = 1;
        boolean z13 = lrVar.f40185c.getAdapter() == lrVar.f40179a;
        if (i10 == lrVar.f40189d1) {
            boolean z14 = !lrVar.f40219r1;
            lrVar.f40219r1 = z14;
            ((org.telegram.ui.Cells.p8) view).setChecked(z14);
            AndroidUtilities.updateVisibleRows(lrVar.f40185c);
            er erVarW0 = lrVar.w0();
            lrVar.B0();
            lrVar.A0(erVarW0);
            lrVar.f40179a.m(lrVar.f40195f1);
        } else if (i10 == lrVar.f40192e1) {
            boolean z15 = !lrVar.f40222s1;
            lrVar.f40222s1 = z15;
            ((org.telegram.ui.Cells.p8) view).setChecked(z15);
            AndroidUtilities.updateVisibleRows(lrVar.f40185c);
            er erVarW1 = lrVar.w0();
            lrVar.B0();
            lrVar.A0(erVarW1);
            lrVar.f40179a.m(lrVar.f40195f1);
        } else {
            if (i10 != lrVar.f40202j0) {
                if (z13) {
                    if (lrVar.p0(i10)) {
                        org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                        if (i10 == lrVar.R) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lrVar.A;
                            tL_chatBannedRights2.send_photos = !tL_chatBannedRights2.send_photos;
                        } else if (i10 == lrVar.S) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = lrVar.A;
                            tL_chatBannedRights3.send_videos = !tL_chatBannedRights3.send_videos;
                        } else if (i10 == lrVar.T) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = lrVar.A;
                            boolean z16 = !tL_chatBannedRights4.send_stickers;
                            tL_chatBannedRights4.send_inline = z16;
                            tL_chatBannedRights4.send_gifs = z16;
                            tL_chatBannedRights4.send_games = z16;
                            tL_chatBannedRights4.send_stickers = z16;
                        } else if (i10 == lrVar.U) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = lrVar.A;
                            tL_chatBannedRights5.send_audios = !tL_chatBannedRights5.send_audios;
                        } else if (i10 == lrVar.V) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = lrVar.A;
                            tL_chatBannedRights6.send_docs = !tL_chatBannedRights6.send_docs;
                        } else if (i10 == lrVar.W) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights7 = lrVar.A;
                            tL_chatBannedRights7.send_voices = !tL_chatBannedRights7.send_voices;
                        } else if (i10 == lrVar.X) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = lrVar.A;
                            tL_chatBannedRights8.send_roundvideos = !tL_chatBannedRights8.send_roundvideos;
                        } else if (i10 == lrVar.Y) {
                            if (lrVar.A.send_plain && (viewM = lrVar.d.m(lrVar.P)) != null) {
                                AndroidUtilities.shakeViewSpring(viewM);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                return;
                            } else {
                                TLRPC.TL_chatBannedRights tL_chatBannedRights9 = lrVar.A;
                                tL_chatBannedRights9.embed_links = !tL_chatBannedRights9.embed_links;
                            }
                        } else if (i10 == lrVar.Z) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights10 = lrVar.A;
                            tL_chatBannedRights10.send_polls = !tL_chatBannedRights10.send_polls;
                        } else if (i10 == lrVar.f40196g0) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights11 = lrVar.A;
                            tL_chatBannedRights11.send_reactions = !tL_chatBannedRights11.send_reactions;
                        }
                        y1Var.c(!y1Var.b(), true);
                        AndroidUtilities.updateVisibleRows(lrVar.f40185c);
                        er erVarW2 = lrVar.w0();
                        lrVar.B0();
                        lrVar.A0(erVarW2);
                    } else if (i10 == lrVar.M0) {
                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                        boolean z17 = !o8Var.d.h;
                        lrVar.f40210n1 = z17;
                        o8Var.setChecked(z17);
                        AndroidUtilities.updateVisibleRows(lrVar.f40185c);
                        er erVarW3 = lrVar.w0();
                        lrVar.B0();
                        lrVar.A0(erVarW3);
                    } else {
                        if (i10 == lrVar.f40227v0) {
                            if (i16 == 0 || i16 == 3) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lrVar.J);
                                bundle2.putInt("type", 2);
                                bundle2.putInt("selectType", i16 == 0 ? 2 : 3);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(lrVar.f40220s);
                                TLRPC.TL_chatBannedRights tL_chatBannedRights12 = lrVar.A;
                                if (tL_chatBannedRights12 != null) {
                                    lrVar2.A = tL_chatBannedRights12;
                                }
                                lrVar2.f40201i1 = new xq(lrVar);
                                lrVar.presentFragment(lrVar2);
                                return;
                            }
                            if (i16 == 1) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("chat_id", lrVar.J);
                                bundle3.putInt("type", 2);
                                bundle3.putInt("selectType", 1);
                                lr lrVar3 = new lr(bundle3);
                                lrVar3.f40201i1 = new zq(lrVar);
                                lrVar3.x0(lrVar.f40220s);
                                lrVar.presentFragment(lrVar3);
                                return;
                            }
                            if (i16 == 2) {
                                Bundle bundleH = a9.p.h("addToGroup", true);
                                bundleH.putLong(z12 ? "channelId" : "chatId", lrVar.f40217r.f22380id);
                                o60 o60Var = new o60(bundleH);
                                o60Var.E = lrVar.f40220s;
                                if (hVar3 != null && hVar3.m() != 0) {
                                    hVar2 = hVar3;
                                }
                                o60Var.F = hVar2;
                                o60Var.f41018x = new br(lrVar, o60Var);
                                lrVar.presentFragment(o60Var);
                                return;
                            }
                            return;
                        }
                        if (i10 == lrVar.f40218r0) {
                            lrVar.presentFragment(new qb(lrVar.f40217r));
                            return;
                        }
                        if (i10 == lrVar.f40223t0) {
                            final org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                            TLRPC.ChatFull chatFull3 = lrVar.f40220s;
                            if (chatFull3 != null && !chatFull3.antispam && lrVar.l0() < lrVar.getMessagesController().telegramAntispamGroupSizeMin) {
                                org.telegram.ui.Components.mc.a0(lrVar).Q(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", lrVar.getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).j();
                                return;
                            }
                            if (lrVar.f40220s == null || !ChatObject.canUserDoAdminAction(lrVar.f40217r, 13) || lrVar.f40221s0) {
                                return;
                            }
                            lrVar.f40221s0 = true;
                            final boolean z18 = lrVar.f40220s.antispam;
                            TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                            tL_channels_toggleAntiSpam.channel = lrVar.getMessagesController().getInputChannel(lrVar.J);
                            TLRPC.ChatFull chatFull4 = lrVar.f40220s;
                            boolean z19 = !chatFull4.antispam;
                            chatFull4.antispam = z19;
                            tL_channels_toggleAntiSpam.enabled = z19;
                            l8Var.setChecked(z19);
                            l8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(lrVar.f40217r, 13) && ((chatFull2 = lrVar.f40220s) == null || chatFull2.antispam || lrVar.l0() >= lrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                            lrVar.getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(lrVar) {

                                public final lr f38881b;

                                {
                                    this.f38881b = lrVar;
                                }

                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i17) {
                                        case 0:
                                            final lr lrVar4 = this.f38881b;
                                            if (tLObject2 != null) {
                                                lrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject2, false);
                                                lrVar4.getMessagesController().putChatFull(lrVar4.f40220s);
                                            }
                                            if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                                final int i19 = 0;
                                                final org.telegram.ui.Cells.l8 l8Var2 = l8Var;
                                                final boolean z20 = z18;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLRPC.ChatFull chatFull5;
                                                        TLRPC.ChatFull chatFull6;
                                                        switch (i19) {
                                                            case 0:
                                                                lr lrVar5 = lrVar4;
                                                                if (lrVar5.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull7 = lrVar5.f40220s;
                                                                    boolean z21 = z20;
                                                                    chatFull7.antispam = z21;
                                                                    org.telegram.ui.Cells.l8 l8Var3 = l8Var2;
                                                                    l8Var3.setChecked(z21);
                                                                    l8Var3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar5.f40217r, 13) || ((chatFull5 = lrVar5.f40220s) != null && chatFull5.antispam && lrVar5.l0() < lrVar5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar5).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                lr lrVar6 = lrVar4;
                                                                if (lrVar6.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull8 = lrVar6.f40220s;
                                                                    boolean z22 = z20;
                                                                    chatFull8.participants_hidden = z22;
                                                                    org.telegram.ui.Cells.l8 l8Var4 = l8Var2;
                                                                    l8Var4.setChecked(z22);
                                                                    l8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar6.f40217r, 2) || ((chatFull6 = lrVar6.f40220s) != null && chatFull6.participants_hidden && lrVar6.l0() < lrVar6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            lrVar4.f40221s0 = false;
                                            break;
                                        default:
                                            final lr lrVar5 = this.f38881b;
                                            if (tLObject2 != null) {
                                                lrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject2, false);
                                                lrVar5.getMessagesController().putChatFull(lrVar5.f40220s);
                                            }
                                            if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                                final int i20 = 1;
                                                final org.telegram.ui.Cells.l8 l8Var3 = l8Var;
                                                final boolean z21 = z18;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLRPC.ChatFull chatFull5;
                                                        TLRPC.ChatFull chatFull6;
                                                        switch (i20) {
                                                            case 0:
                                                                lr lrVar6 = lrVar5;
                                                                if (lrVar6.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull7 = lrVar6.f40220s;
                                                                    boolean z22 = z21;
                                                                    chatFull7.antispam = z22;
                                                                    org.telegram.ui.Cells.l8 l8Var4 = l8Var3;
                                                                    l8Var4.setChecked(z22);
                                                                    l8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar6.f40217r, 13) || ((chatFull5 = lrVar6.f40220s) != null && chatFull5.antispam && lrVar6.l0() < lrVar6.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                lr lrVar7 = lrVar5;
                                                                if (lrVar7.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull8 = lrVar7.f40220s;
                                                                    boolean z23 = z21;
                                                                    chatFull8.participants_hidden = z23;
                                                                    org.telegram.ui.Cells.l8 l8Var5 = l8Var3;
                                                                    l8Var5.setChecked(z23);
                                                                    l8Var5.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar7.f40217r, 2) || ((chatFull6 = lrVar7.f40220s) != null && chatFull6.participants_hidden && lrVar7.l0() < lrVar7.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar7).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            lrVar5.E0 = false;
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (i10 == lrVar.F0) {
                            final org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                            if (lrVar.l0() < lrVar.getMessagesController().hiddenMembersGroupSizeMin) {
                                org.telegram.ui.Components.mc.a0(lrVar).Q(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", lrVar.getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).j();
                                return;
                            }
                            if (lrVar.f40220s == null || !ChatObject.canUserDoAdminAction(lrVar.f40217r, 2) || lrVar.E0) {
                                return;
                            }
                            lrVar.E0 = true;
                            final boolean z20 = lrVar.f40220s.participants_hidden;
                            TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                            tL_channels_toggleParticipantsHidden.channel = lrVar.getMessagesController().getInputChannel(lrVar.J);
                            TLRPC.ChatFull chatFull5 = lrVar.f40220s;
                            boolean z21 = !chatFull5.participants_hidden;
                            chatFull5.participants_hidden = z21;
                            tL_channels_toggleParticipantsHidden.enabled = z21;
                            l8Var2.setChecked(z21);
                            Switch checkBox = l8Var2.getCheckBox();
                            if (!ChatObject.canUserDoAdminAction(lrVar.f40217r, 2) || ((chatFull = lrVar.f40220s) != null && !chatFull.participants_hidden && lrVar.l0() < lrVar.getMessagesController().hiddenMembersGroupSizeMin)) {
                                i17 = R.drawable.permission_locked;
                            }
                            checkBox.setIcon(i17);
                            lrVar.getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(lrVar) {

                                public final lr f38881b;

                                {
                                    this.f38881b = lrVar;
                                }

                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    switch (i18) {
                                        case 0:
                                            final lr lrVar4 = this.f38881b;
                                            if (tLObject2 != null) {
                                                lrVar4.getMessagesController().processUpdates((TLRPC.Updates) tLObject2, false);
                                                lrVar4.getMessagesController().putChatFull(lrVar4.f40220s);
                                            }
                                            if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                                final int i19 = 0;
                                                final org.telegram.ui.Cells.l8 l8Var3 = l8Var2;
                                                final boolean z22 = z20;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLRPC.ChatFull chatFull6;
                                                        TLRPC.ChatFull chatFull7;
                                                        switch (i19) {
                                                            case 0:
                                                                lr lrVar6 = lrVar4;
                                                                if (lrVar6.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull8 = lrVar6.f40220s;
                                                                    boolean z23 = z22;
                                                                    chatFull8.antispam = z23;
                                                                    org.telegram.ui.Cells.l8 l8Var4 = l8Var3;
                                                                    l8Var4.setChecked(z23);
                                                                    l8Var4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar6.f40217r, 13) || ((chatFull6 = lrVar6.f40220s) != null && chatFull6.antispam && lrVar6.l0() < lrVar6.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                lr lrVar7 = lrVar4;
                                                                if (lrVar7.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull9 = lrVar7.f40220s;
                                                                    boolean z24 = z22;
                                                                    chatFull9.participants_hidden = z24;
                                                                    org.telegram.ui.Cells.l8 l8Var5 = l8Var3;
                                                                    l8Var5.setChecked(z24);
                                                                    l8Var5.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar7.f40217r, 2) || ((chatFull7 = lrVar7.f40220s) != null && chatFull7.participants_hidden && lrVar7.l0() < lrVar7.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar7).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            lrVar4.f40221s0 = false;
                                            break;
                                        default:
                                            final lr lrVar5 = this.f38881b;
                                            if (tLObject2 != null) {
                                                lrVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject2, false);
                                                lrVar5.getMessagesController().putChatFull(lrVar5.f40220s);
                                            }
                                            if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                                final int i20 = 1;
                                                final org.telegram.ui.Cells.l8 l8Var4 = l8Var2;
                                                final boolean z23 = z20;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLRPC.ChatFull chatFull6;
                                                        TLRPC.ChatFull chatFull7;
                                                        switch (i20) {
                                                            case 0:
                                                                lr lrVar6 = lrVar5;
                                                                if (lrVar6.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull8 = lrVar6.f40220s;
                                                                    boolean z24 = z23;
                                                                    chatFull8.antispam = z24;
                                                                    org.telegram.ui.Cells.l8 l8Var5 = l8Var4;
                                                                    l8Var5.setChecked(z24);
                                                                    l8Var5.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar6.f40217r, 13) || ((chatFull6 = lrVar6.f40220s) != null && chatFull6.antispam && lrVar6.l0() < lrVar6.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar6).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                lr lrVar7 = lrVar5;
                                                                if (lrVar7.getParentActivity() != null) {
                                                                    TLRPC.ChatFull chatFull9 = lrVar7.f40220s;
                                                                    boolean z25 = z23;
                                                                    chatFull9.participants_hidden = z25;
                                                                    org.telegram.ui.Cells.l8 l8Var6 = l8Var4;
                                                                    l8Var6.setChecked(z25);
                                                                    l8Var6.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(lrVar7.f40217r, 2) || ((chatFull7 = lrVar7.f40220s) != null && chatFull7.participants_hidden && lrVar7.l0() < lrVar7.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                    org.telegram.ui.Components.mc.a0(lrVar7).Q(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).j();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                            lrVar5.E0 = false;
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        if (i10 == lrVar.H0) {
                            if (lrVar.f40217r == null) {
                                return;
                            }
                            final org.telegram.ui.Cells.l8 l8Var3 = (org.telegram.ui.Cells.l8) view;
                            final boolean zB = l8Var3.b();
                            l8Var3.setChecked(!l8Var3.b());
                            TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                            tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(lrVar.f40217r);
                            TLRPC.Chat chat = lrVar.f40217r;
                            if (chat.default_banned_rights == null) {
                                chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                            }
                            TLRPC.TL_chatBannedRights tL_chatBannedRights13 = lrVar.f40217r.default_banned_rights;
                            tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights13;
                            tL_chatBannedRights13.edit_rank = !l8Var3.b();
                            lrVar.getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new org.telegram.messenger.a(), new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.Updates updates = (TLRPC.Updates) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    lr lrVar4 = this.f39148a;
                                    if (updates != null) {
                                        lrVar4.getMessagesController().processUpdates(updates, false);
                                        return;
                                    }
                                    lrVar4.getClass();
                                    if (tL_error != null) {
                                        l8Var3.setChecked(zB);
                                        org.telegram.ui.Components.mc.a0(lrVar4).d0(tL_error, false);
                                    }
                                }
                            });
                        } else {
                            if (i10 == lrVar.f40233x0) {
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lrVar.J);
                                bundle4.putInt("type", 0);
                                lr lrVar4 = new lr(bundle4);
                                lrVar4.x0(lrVar.f40220s);
                                lrVar.presentFragment(lrVar4);
                                return;
                            }
                            if (i10 == lrVar.f40213p0) {
                                lrVar.showDialog(new cr(lrVar, lrVar.getParentActivity(), lrVar));
                            } else {
                                if (i10 == lrVar.f40230w0) {
                                    if (lrVar.f40220s != null) {
                                        kh0 kh0Var = new kh0(lrVar.J, 0L, 0);
                                        TLRPC.ChatFull chatFull6 = lrVar.f40220s;
                                        kh0Var.g0(chatFull6, chatFull6.exported_invite);
                                        lrVar.presentFragment(kh0Var);
                                        return;
                                    }
                                    return;
                                }
                                if ((i10 > lrVar.O && i10 <= Math.max(lrVar.f40198h0, lrVar.f40186c0)) || i10 == lrVar.f40200i0) {
                                    org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) view;
                                    boolean zIsEnabled = o8Var2.isEnabled();
                                    Switch r10 = o8Var2.d;
                                    if (zIsEnabled) {
                                        if (r10.B != null) {
                                            if (ChatObject.isPublic(lrVar.f40217r) && (i10 == lrVar.f40191e0 || i10 == lrVar.f40186c0)) {
                                                org.telegram.messenger.y1.r(R.string.EditCantEditPermissionsPublic, org.telegram.ui.Components.mc.a0(lrVar), null);
                                                return;
                                            } else if (ChatObject.isDiscussionGroup(lrVar.currentAccount, lrVar.J) && (i10 == lrVar.f40191e0 || i10 == lrVar.f40186c0)) {
                                                org.telegram.messenger.y1.r(R.string.EditCantEditPermissionsDiscussion, org.telegram.ui.Components.mc.a0(lrVar), null);
                                                return;
                                            } else {
                                                org.telegram.ui.Components.mc.a0(lrVar).t(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).j();
                                                return;
                                            }
                                        }
                                        if (i10 == lrVar.Q) {
                                            er erVarW4 = lrVar.w0();
                                            lrVar.f40199h1 = !lrVar.f40199h1;
                                            AndroidUtilities.updateVisibleRows(lrVar.f40185c);
                                            lrVar.A0(erVarW4);
                                            return;
                                        }
                                        o8Var2.setChecked(!r10.h);
                                        if (i10 == lrVar.f40186c0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights14 = lrVar.A;
                                            tL_chatBannedRights14.change_info = !tL_chatBannedRights14.change_info;
                                            return;
                                        }
                                        if (i10 == lrVar.f40200i0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights15 = lrVar.A;
                                            tL_chatBannedRights15.manage_linked_peers = !tL_chatBannedRights15.manage_linked_peers;
                                            return;
                                        }
                                        if (i10 == lrVar.f40188d0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights16 = lrVar.A;
                                            tL_chatBannedRights16.invite_users = !tL_chatBannedRights16.invite_users;
                                            return;
                                        }
                                        if (i10 == lrVar.f40198h0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights17 = lrVar.A;
                                            tL_chatBannedRights17.manage_topics = !tL_chatBannedRights17.manage_topics;
                                            return;
                                        }
                                        if (i10 == lrVar.f40191e0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights18 = lrVar.A;
                                            tL_chatBannedRights18.pin_messages = !tL_chatBannedRights18.pin_messages;
                                            return;
                                        }
                                        if (i10 == lrVar.f40194f0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights19 = lrVar.A;
                                            tL_chatBannedRights19.edit_rank = !tL_chatBannedRights19.edit_rank;
                                            return;
                                        }
                                        if (i10 == lrVar.P) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights20 = lrVar.A;
                                            tL_chatBannedRights20.send_plain = !tL_chatBannedRights20.send_plain;
                                            int i19 = lrVar.Y;
                                            if (i19 >= 0) {
                                                lrVar.f40179a.m(i19);
                                            }
                                            int i20 = lrVar.Q;
                                            if (i20 >= 0) {
                                                lrVar.f40179a.m(i20);
                                            }
                                            er erVarW5 = lrVar.w0();
                                            lrVar.B0();
                                            lrVar.A0(erVarW5);
                                            return;
                                        }
                                        if (i10 == lrVar.Q) {
                                            er erVarW6 = lrVar.w0();
                                            lrVar.f40199h1 = !lrVar.f40199h1;
                                            AndroidUtilities.updateVisibleRows(lrVar.f40185c);
                                            lrVar.A0(erVarW6);
                                            return;
                                        }
                                        if (i10 == lrVar.f40180a0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights21 = lrVar.A;
                                            boolean z22 = !tL_chatBannedRights21.send_stickers;
                                            tL_chatBannedRights21.send_inline = z22;
                                            tL_chatBannedRights21.send_gifs = z22;
                                            tL_chatBannedRights21.send_games = z22;
                                            tL_chatBannedRights21.send_stickers = z22;
                                            return;
                                        }
                                        if (i10 == lrVar.f40183b0) {
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights22 = lrVar.A;
                                            tL_chatBannedRights22.embed_links = !tL_chatBannedRights22.embed_links;
                                            return;
                                        } else {
                                            if (i10 == lrVar.Z) {
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights23 = lrVar.A;
                                                tL_chatBannedRights23.send_polls = !tL_chatBannedRights23.send_polls;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
                str = "";
                if (z13) {
                    tLObjectE2 = lrVar.f40179a.E(i10);
                    if (tLObjectE2 instanceof TLRPC.User) {
                        z12 = z12;
                        str = "";
                        tL_chatBannedRights = null;
                        peerId = ((TLRPC.User) tLObjectE2).f22527id;
                        tL_chatAdminRights = null;
                        tLObjectE2 = tLObjectE2;
                        z10 = true;
                    } else if (tLObjectE2 instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObjectE2;
                        peerId = MessageObject.getPeerId(channelParticipant.peer);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights24 = channelParticipant.banned_rights;
                        tL_chatAdminRights3 = channelParticipant.admin_rights;
                        String str2 = channelParticipant.rank;
                        boolean z23 = ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                        if ((tLObjectE2 instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights3 = ((TLRPC.TL_channelParticipantCreator) tLObjectE2).admin_rights) == null) {
                            tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                            tL_chatAdminRights3.manage_ranks = true;
                            tL_chatAdminRights3.add_admins = true;
                            tL_chatAdminRights3.pin_messages = true;
                            tL_chatAdminRights3.manage_topics = true;
                            tL_chatAdminRights3.invite_users = true;
                            tL_chatAdminRights3.ban_users = true;
                            tL_chatAdminRights3.delete_messages = true;
                            tL_chatAdminRights3.edit_messages = true;
                            tL_chatAdminRights3.post_messages = true;
                            tL_chatAdminRights3.change_info = true;
                            if (!z12) {
                                tL_chatAdminRights3.manage_call = true;
                            }
                        }
                        boolean z24 = z23;
                        tLObjectE2 = tLObjectE2;
                        z10 = z24;
                        tL_chatBannedRights = tL_chatBannedRights24;
                        tL_chatAdminRights = tL_chatAdminRights3;
                        z12 = z12;
                        str = str2;
                    } else {
                        if (tLObjectE2 instanceof TLRPC.ChatParticipant) {
                            long j13 = ((TLRPC.ChatParticipant) tLObjectE2).user_id;
                            boolean z25 = lrVar.f40217r.creator;
                            if (tLObjectE2 instanceof TLRPC.TL_chatParticipantCreator) {
                                tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                                tL_chatAdminRights2.manage_ranks = true;
                                tL_chatAdminRights2.add_admins = true;
                                tL_chatAdminRights2.pin_messages = true;
                                tL_chatAdminRights2.manage_topics = true;
                                tL_chatAdminRights2.invite_users = true;
                                tL_chatAdminRights2.ban_users = true;
                                tL_chatAdminRights2.delete_messages = true;
                                tL_chatAdminRights2.edit_messages = true;
                                tL_chatAdminRights2.post_messages = true;
                                tL_chatAdminRights2.change_info = true;
                                if (!z12) {
                                    tL_chatAdminRights2.manage_call = true;
                                }
                            } else {
                                tL_chatAdminRights2 = null;
                            }
                            z10 = z25;
                            tL_chatAdminRights = tL_chatAdminRights2;
                            peerId = j13;
                        } else {
                            peerId = 0;
                            z10 = false;
                            tL_chatAdminRights = null;
                        }
                        tL_chatBannedRights = null;
                    }
                } else {
                    tLObjectE = lrVar.f40190e.E(i10);
                    if (tLObjectE instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObjectE;
                        lrVar.getMessagesController().putUser(user, false);
                        j11 = user.f22527id;
                        i11 = 0;
                        while (true) {
                            if (i11 < 3) {
                                tLObject = null;
                                break;
                            }
                            if (i11 == 0) {
                                hVar = hVar3;
                            } else if (i11 == 1) {
                                hVar = lrVar.H;
                            } else {
                                hVar = hVar2;
                            }
                            tLObject = (TLObject) hVar.f(j11);
                            if (tLObject != null) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        tLObjectE = tLObject;
                        j10 = j11;
                    } else if (!(tLObjectE instanceof TLRPC.ChannelParticipant) || (tLObjectE instanceof TLRPC.ChatParticipant)) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        tLObjectE = null;
                    }
                    if (tLObjectE instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObjectE;
                        peerId = MessageObject.getPeerId(channelParticipant2.peer);
                        boolean z26 = ((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights25 = channelParticipant2.banned_rights;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                        z12 = z12;
                        tL_chatBannedRights = tL_chatBannedRights25;
                        str = channelParticipant2.rank;
                        tLObjectE2 = tLObjectE;
                        z10 = z26;
                        tL_chatAdminRights = tL_chatAdminRights4;
                    } else if (tLObjectE instanceof TLRPC.ChatParticipant) {
                        long j14 = ((TLRPC.ChatParticipant) tLObjectE).user_id;
                        z12 = z12;
                        str = "";
                        tL_chatBannedRights = null;
                        tLObjectE2 = tLObjectE;
                        z10 = lrVar.f40217r.creator;
                        tL_chatAdminRights = null;
                        peerId = j14;
                    } else {
                        z12 = z12;
                        str = "";
                        tL_chatBannedRights = null;
                        peerId = j10;
                        tL_chatAdminRights = null;
                        tLObjectE2 = tLObjectE;
                        if (tLObjectE == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                }
                if (peerId != 0) {
                    if (i15 == 0) {
                        i13 = 1;
                        if (i15 == 3 && i15 != 1) {
                            if (ChatObject.isChannel(lrVar.f40217r)) {
                                lrVar.getMessagesController().deleteParticipantFromChat(lrVar.J, lrVar.getMessagesController().getUser(Long.valueOf(peerId)));
                                dr drVar = lrVar.f40201i1;
                                if (drVar != null) {
                                    drVar.d(peerId);
                                }
                                lrVar.finishFragment();
                                return;
                            }
                            return;
                        }
                        if (i15 == 1) {
                            if (!z10) {
                                peerId = peerId;
                                str = str;
                                i13 = 1;
                            } else {
                                if (!(tLObjectE2 instanceof TLRPC.TL_channelParticipantAdmin) || (tLObjectE2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                                    TLRPC.User user2 = lrVar.getMessagesController().getUser(Long.valueOf(peerId));
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getParentActivity());
                                    String string = LocaleController.getString("AppName", R.string.AppName);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                    b2Var.N = string;
                                    b2Var.P = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new jq(lrVar, user2, tLObjectE2, tL_chatAdminRights, tL_chatBannedRights, str, z10));
                                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                    lrVar.showDialog(b2Var);
                                    return;
                                }
                                i13 = 1;
                            }
                            if (i15 == i13) {
                                i14 = 0;
                            } else {
                                i14 = 1;
                            }
                            lrVar.t0(peerId, tLObjectE2, tL_chatAdminRights, tL_chatBannedRights, str, z10, i14, i15 != i13 || i15 == 3);
                        }
                        if (i15 == i13) {
                            i14 = 0;
                        } else {
                            i14 = 1;
                        }
                        lrVar.t0(peerId, tLObjectE2, tL_chatAdminRights, tL_chatBannedRights, str, z10, i14, i15 != i13 || i15 == 3);
                    }
                    j12 = peerId;
                    boolean z27 = z10;
                    if (i16 == 1) {
                        if (i16 != 0 || i16 == 3) {
                            zCanBlockUsers = ChatObject.canBlockUsers(lrVar.f40217r);
                        } else {
                            z11 = false;
                        }
                        if (i16 != 0 || ((i16 != 1 && z12) || (i16 == 2 && i15 == 0))) {
                            if (j12 == lrVar.getUserConfig().getClientUserId()) {
                                return;
                            }
                            bundle = new Bundle();
                            if (peerId > 0) {
                                bundle.putLong("user_id", j12);
                            } else {
                                bundle.putLong("chat_id", -j12);
                            }
                            lrVar.presentFragment(new ProfileActivity(bundle, null));
                            return;
                        }
                        if (tL_chatBannedRights == null) {
                            tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                            i12 = 1;
                            tL_chatBannedRights.view_messages = true;
                            tL_chatBannedRights.send_stickers = true;
                            tL_chatBannedRights.send_media = true;
                            tL_chatBannedRights.send_photos = true;
                            tL_chatBannedRights.send_videos = true;
                            tL_chatBannedRights.send_roundvideos = true;
                            tL_chatBannedRights.send_audios = true;
                            tL_chatBannedRights.send_voices = true;
                            tL_chatBannedRights.send_docs = true;
                            tL_chatBannedRights.embed_links = true;
                            tL_chatBannedRights.send_plain = true;
                            tL_chatBannedRights.send_messages = true;
                            tL_chatBannedRights.send_games = true;
                            tL_chatBannedRights.send_inline = true;
                            tL_chatBannedRights.send_gifs = true;
                            tL_chatBannedRights.pin_messages = true;
                            tL_chatBannedRights.edit_rank = true;
                            tL_chatBannedRights.send_reactions = true;
                            tL_chatBannedRights.send_polls = true;
                            tL_chatBannedRights.invite_users = true;
                            tL_chatBannedRights.manage_topics = true;
                            tL_chatBannedRights.change_info = true;
                        } else {
                            i12 = 1;
                        }
                        dq dqVar = new dq(j12, lrVar.J, tL_chatAdminRights, lrVar.A, tL_chatBannedRights, str, i16 == i12 ? 0 : 1, z11, tLObjectE2 == null, null);
                        dqVar.T0 = new oq(lrVar, tLObjectE2);
                        lrVar.presentFragment(dqVar);
                        return;
                    }
                    if (j12 == lrVar.getUserConfig().getClientUserId() && (lrVar.f40217r.creator || z27)) {
                        zCanBlockUsers = true;
                    } else {
                        zCanBlockUsers = false;
                    }
                    z11 = zCanBlockUsers;
                    if (i16 != 0) {
                    }
                    if (j12 == lrVar.getUserConfig().getClientUserId()) {
                        return;
                    }
                    bundle = new Bundle();
                    if (peerId > 0) {
                        bundle.putLong("user_id", j12);
                    } else {
                        bundle.putLong("chat_id", -j12);
                    }
                    lrVar.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
            }
            boolean z28 = !lrVar.f40226u1;
            lrVar.f40226u1 = z28;
            ((org.telegram.ui.Cells.p8) view).setChecked(z28);
            AndroidUtilities.updateVisibleRows(lrVar.f40185c);
            er erVarW7 = lrVar.w0();
            lrVar.B0();
            lrVar.A0(erVarW7);
            lrVar.f40179a.m(lrVar.f40202j0);
        }
        str = "";
        if (z13) {
            tLObjectE2 = lrVar.f40179a.E(i10);
            if (tLObjectE2 instanceof TLRPC.User) {
                z12 = z12;
                str = "";
                tL_chatBannedRights = null;
                peerId = ((TLRPC.User) tLObjectE2).f22527id;
                tL_chatAdminRights = null;
                tLObjectE2 = tLObjectE2;
                z10 = true;
            } else if (tLObjectE2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant3 = (TLRPC.ChannelParticipant) tLObjectE2;
                peerId = MessageObject.getPeerId(channelParticipant3.peer);
                TLRPC.TL_chatBannedRights tL_chatBannedRights26 = channelParticipant3.banned_rights;
                tL_chatAdminRights3 = channelParticipant3.admin_rights;
                String str3 = channelParticipant3.rank;
                if (channelParticipant3 instanceof TLRPC.TL_channelParticipantAdmin) {
                }
                if (tLObjectE2 instanceof TLRPC.TL_channelParticipantCreator) {
                    tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                    tL_chatAdminRights3.manage_ranks = true;
                    tL_chatAdminRights3.add_admins = true;
                    tL_chatAdminRights3.pin_messages = true;
                    tL_chatAdminRights3.manage_topics = true;
                    tL_chatAdminRights3.invite_users = true;
                    tL_chatAdminRights3.ban_users = true;
                    tL_chatAdminRights3.delete_messages = true;
                    tL_chatAdminRights3.edit_messages = true;
                    tL_chatAdminRights3.post_messages = true;
                    tL_chatAdminRights3.change_info = true;
                    if (!z12) {
                        tL_chatAdminRights3.manage_call = true;
                    }
                }
                boolean z29 = z23;
                tLObjectE2 = tLObjectE2;
                z10 = z29;
                tL_chatBannedRights = tL_chatBannedRights26;
                tL_chatAdminRights = tL_chatAdminRights3;
                z12 = z12;
                str = str3;
            } else {
                if (tLObjectE2 instanceof TLRPC.ChatParticipant) {
                    long j15 = ((TLRPC.ChatParticipant) tLObjectE2).user_id;
                    boolean z210 = lrVar.f40217r.creator;
                    if (tLObjectE2 instanceof TLRPC.TL_chatParticipantCreator) {
                        tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                        tL_chatAdminRights2.manage_ranks = true;
                        tL_chatAdminRights2.add_admins = true;
                        tL_chatAdminRights2.pin_messages = true;
                        tL_chatAdminRights2.manage_topics = true;
                        tL_chatAdminRights2.invite_users = true;
                        tL_chatAdminRights2.ban_users = true;
                        tL_chatAdminRights2.delete_messages = true;
                        tL_chatAdminRights2.edit_messages = true;
                        tL_chatAdminRights2.post_messages = true;
                        tL_chatAdminRights2.change_info = true;
                        if (!z12) {
                            tL_chatAdminRights2.manage_call = true;
                        }
                    } else {
                        tL_chatAdminRights2 = null;
                    }
                    z10 = z210;
                    tL_chatAdminRights = tL_chatAdminRights2;
                    peerId = j15;
                } else {
                    peerId = 0;
                    z10 = false;
                    tL_chatAdminRights = null;
                }
                tL_chatBannedRights = null;
            }
        } else {
            tLObjectE = lrVar.f40190e.E(i10);
            if (tLObjectE instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObjectE;
                lrVar.getMessagesController().putUser(user3, false);
                j11 = user3.f22527id;
                i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        tLObject = null;
                        break;
                    }
                    if (i11 == 0) {
                        hVar = hVar3;
                    } else if (i11 == 1) {
                        hVar = lrVar.H;
                    } else {
                        hVar = hVar2;
                    }
                    tLObject = (TLObject) hVar.f(j11);
                    if (tLObject != null) {
                        break;
                        break;
                    }
                    i11++;
                }
                tLObjectE = tLObject;
                j10 = j11;
            } else if (tLObjectE instanceof TLRPC.ChannelParticipant) {
                j10 = 0;
            } else {
                j10 = 0;
            }
            if (tLObjectE instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant4 = (TLRPC.ChannelParticipant) tLObjectE;
                peerId = MessageObject.getPeerId(channelParticipant4.peer);
                if (channelParticipant4 instanceof TLRPC.TL_channelParticipantAdmin) {
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights27 = channelParticipant4.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights5 = channelParticipant4.admin_rights;
                z12 = z12;
                tL_chatBannedRights = tL_chatBannedRights27;
                str = channelParticipant4.rank;
                tLObjectE2 = tLObjectE;
                z10 = z26;
                tL_chatAdminRights = tL_chatAdminRights5;
            } else if (tLObjectE instanceof TLRPC.ChatParticipant) {
                long j16 = ((TLRPC.ChatParticipant) tLObjectE).user_id;
                z12 = z12;
                str = "";
                tL_chatBannedRights = null;
                tLObjectE2 = tLObjectE;
                z10 = lrVar.f40217r.creator;
                tL_chatAdminRights = null;
                peerId = j16;
            } else {
                z12 = z12;
                str = "";
                tL_chatBannedRights = null;
                peerId = j10;
                tL_chatAdminRights = null;
                tLObjectE2 = tLObjectE;
                if (tLObjectE == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (peerId != 0) {
            if (i15 == 0) {
                j12 = peerId;
                boolean z211 = z10;
                if (i16 == 1) {
                    if (i16 != 0) {
                    }
                    zCanBlockUsers = ChatObject.canBlockUsers(lrVar.f40217r);
                } else if (j12 == lrVar.getUserConfig().getClientUserId()) {
                    zCanBlockUsers = false;
                } else {
                    zCanBlockUsers = false;
                }
                z11 = zCanBlockUsers;
                if (i16 != 0) {
                }
                if (j12 == lrVar.getUserConfig().getClientUserId()) {
                    return;
                }
                bundle = new Bundle();
                if (peerId > 0) {
                    bundle.putLong("user_id", j12);
                } else {
                    bundle.putLong("chat_id", -j12);
                }
                lrVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            i13 = 1;
            if (i15 == 3) {
            }
            if (i15 == 1) {
                if (!z10) {
                    if (tLObjectE2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    }
                    TLRPC.User user4 = lrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lrVar.getParentActivity());
                    String string2 = LocaleController.getString("AppName", R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                    b2Var2.N = string2;
                    b2Var2.P = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user4));
                    alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new jq(lrVar, user4, tLObjectE2, tL_chatAdminRights, tL_chatBannedRights, str, z10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    lrVar.showDialog(b2Var2);
                    return;
                }
                peerId = peerId;
                str = str;
                i13 = 1;
                if (i15 == i13) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                lrVar.t0(peerId, tLObjectE2, tL_chatAdminRights, tL_chatBannedRights, str, z10, i14, i15 != i13 || i15 == 3);
            }
            if (i15 == i13) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            lrVar.t0(peerId, tLObjectE2, tL_chatAdminRights, tL_chatBannedRights, str, z10, i14, i15 != i13 || i15 == 3);
        }
    }

    public static void W(lr lrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 0) {
                hVar = lrVar.I;
            } else {
                hVar = i10 == 1 ? lrVar.H : lrVar.G;
            }
            TLObject tLObject = (TLObject) hVar.f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i10++;
        }
    }

    public static void c0(lr lrVar, TLRPC.User user) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = lrVar.G;
        ArrayList arrayList2 = lrVar.B;
        UndoView undoView = lrVar.f40208n;
        long j10 = -lrVar.J;
        boolean z12 = lrVar.v;
        undoView.m(j10, user, z12 ? 9 : 10);
        lrVar.f40217r.creator = false;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < 3) {
            boolean z14 = true;
            if (i10 == 0) {
                hVar = lrVar.I;
                arrayList = lrVar.D;
            } else if (i10 == 1) {
                hVar = lrVar.H;
                arrayList = lrVar.C;
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
                int iIndexOf = arrayList.indexOf(tLObject);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z10 = true;
            } else {
                z10 = false;
            }
            long clientUserId = lrVar.getUserConfig().getClientUserId();
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
                int iIndexOf2 = arrayList.indexOf(tLObject2);
                if (iIndexOf2 >= 0) {
                    arrayList.set(iIndexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z13;
                z14 = z10;
            }
            if (z14) {
                Collections.sort(arrayList, new k9.a(19));
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
            Collections.sort(arrayList2, new k9.a(18));
            lrVar.B0();
        }
        lrVar.f40179a.l();
        dr drVar = lrVar.f40201i1;
        if (drVar != null) {
            drVar.a(user);
        }
    }

    public static int j0(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
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
        return i10 == 7 ? 3600 : 0;
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
        return !tL_chatBannedRights.send_reactions ? i10 + 1 : i10;
    }

    public final void A0(er erVar) {
        View childAt;
        if (this.f40179a == null) {
            B0();
            return;
        }
        B0();
        erVar.f(erVar.d);
        f2.q.c(erVar, true).b(this.f40179a);
        hh.f1 f1Var = this.f40185c;
        if (f1Var == null || this.d == null || f1Var.getChildCount() <= 0) {
            return;
        }
        int i10 = 0;
        int iR = -1;
        while (true) {
            if (i10 >= this.f40185c.getChildCount()) {
                childAt = null;
                break;
            }
            iR = RecyclerView.R(this.f40185c.getChildAt(i10));
            if (iR != -1) {
                childAt = this.f40185c.getChildAt(i10);
                break;
            }
            i10++;
        }
        if (childAt != null) {
            this.d.h1(iR, childAt.getTop() - this.f40185c.getPaddingTop());
        }
    }

    public final void B0() {
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.J));
        this.f40217r = chat2;
        if (chat2 == null) {
            return;
        }
        this.f40218r0 = -1;
        this.f40223t0 = -1;
        this.f40225u0 = -1;
        this.f40227v0 = -1;
        this.f40230w0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.f40236y0 = -1;
        this.f40238z0 = -1;
        this.A0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.f40215q0 = -1;
        this.f40213p0 = -1;
        this.f40211o0 = -1;
        this.B0 = -1;
        this.X0 = -1;
        this.f40189d1 = -1;
        this.f40192e1 = -1;
        this.f40195f1 = -1;
        this.Y0 = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.f40180a0 = -1;
        this.Z = -1;
        this.f40183b0 = -1;
        this.f40188d0 = -1;
        this.f40200i0 = -1;
        this.f40198h0 = -1;
        this.f40191e0 = -1;
        this.f40194f0 = -1;
        this.f40196g0 = -1;
        this.f40186c0 = -1;
        this.f40233x0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.W0 = -1;
        this.f40184b1 = -1;
        this.f40187c1 = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.f40202j0 = -1;
        this.f40204k0 = -1;
        this.f40206l0 = -1;
        this.m0 = -1;
        this.f40209n0 = -1;
        int i10 = 0;
        this.Z0 = 0;
        ArrayList arrayList = this.B;
        boolean z14 = this.f40229w;
        int i11 = 1;
        int i12 = this.K;
        if (i12 == 3) {
            int i13 = this.Z0;
            int i14 = i13 + 1;
            this.Z0 = i14;
            this.O = i13;
            if (!z14) {
                this.P = i14;
                int i15 = i13 + 3;
                this.Z0 = i15;
                this.Q = i13 + 2;
                if (this.f40199h1) {
                    this.R = i15;
                    this.S = i13 + 4;
                    this.T = i13 + 5;
                    this.U = i13 + 6;
                    this.V = i13 + 7;
                    this.W = i13 + 8;
                    this.X = i13 + 9;
                    this.Y = i13 + 10;
                    this.Z = i13 + 11;
                    this.Z0 = i13 + 13;
                    this.f40196g0 = i13 + 12;
                }
                int i16 = this.Z0;
                this.f40188d0 = i16;
                this.f40191e0 = i16 + 1;
                this.Z0 = i16 + 3;
                this.f40194f0 = i16 + 2;
            }
            int i17 = this.Z0;
            int i18 = i17 + 1;
            this.Z0 = i18;
            this.f40186c0 = i17;
            if (z14) {
                this.Z0 = i17 + 2;
                this.f40200i0 = i18;
            } else if (this.f40232x) {
                this.Z0 = i17 + 2;
                this.f40198h0 = i18;
            }
            if (ChatObject.isChannel(this.f40217r)) {
                TLRPC.Chat chat3 = this.f40217r;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z14) {
                    int i19 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.f40220s;
                    if (Math.max(i19, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i20 = this.Z0;
                        this.D0 = i20;
                        this.f40211o0 = i20 + 1;
                        this.f40213p0 = i20 + 2;
                        this.Z0 = i20 + 4;
                        this.f40215q0 = i20 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.f40220s;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z14 && ChatObject.canUserDoAction(this.f40217r, 2) && (ChatObject.isChannel(this.f40217r) || ((chat = this.f40217r) != null && chat.creator))) {
                if (this.D0 == -1) {
                    int i21 = this.Z0;
                    this.Z0 = i21 + 1;
                    this.D0 = i21;
                }
                int i22 = this.Z0;
                this.f40202j0 = i22;
                int i23 = i22 + 2;
                this.Z0 = i23;
                this.f40204k0 = i22 + 1;
                if (this.f40226u1) {
                    this.f40206l0 = i23;
                    this.m0 = i22 + 3;
                    this.Z0 = i22 + 5;
                    this.f40209n0 = i22 + 4;
                }
            }
            if (!z14) {
                if (ChatObject.isChannel(this.f40217r) || !this.f40217r.creator) {
                    TLRPC.Chat chat4 = this.f40217r;
                    if (chat4.megagroup && !chat4.gigagroup && ChatObject.canBlockUsers(chat4)) {
                        if (this.D0 == -1) {
                            int i24 = this.Z0;
                            this.Z0 = i24 + 1;
                            this.D0 = i24;
                        }
                        int i25 = this.Z0;
                        this.J0 = i25;
                        this.K0 = i25 + 1;
                        this.Z0 = i25 + 3;
                        this.L0 = i25 + 2;
                    }
                } else {
                    if (this.D0 == -1) {
                        int i26 = this.Z0;
                        this.Z0 = i26 + 1;
                        this.D0 = i26;
                    }
                    int i27 = this.Z0;
                    this.J0 = i27;
                    this.K0 = i27 + 1;
                    this.Z0 = i27 + 3;
                    this.L0 = i27 + 2;
                }
            }
            if (q0() && !z14) {
                if (this.D0 == -1) {
                    int i28 = this.Z0;
                    this.Z0 = i28 + 1;
                    this.D0 = i28;
                }
                int i29 = this.Z0;
                int i30 = i29 + 1;
                this.Z0 = i30;
                this.M0 = i29;
                if (this.f40210n1) {
                    this.Z0 = i29 + 2;
                    this.O0 = i30;
                }
                int i31 = this.Z0;
                this.Z0 = i31 + 1;
                this.N0 = i31;
            }
            if (ChatObject.isChannel(this.f40217r) && !z14) {
                if (this.D0 == -1) {
                    int i32 = this.Z0;
                    this.Z0 = i32 + 1;
                    this.D0 = i32;
                }
                int i33 = this.Z0;
                this.Z0 = i33 + 1;
                this.f40233x0 = i33;
            }
            if ((this.L0 == -1 && this.f40211o0 == -1) || this.f40233x0 != -1) {
                int i34 = this.Z0;
                this.Z0 = i34 + 1;
                this.C0 = i34;
            }
            if (ChatObject.canBlockUsers(this.f40217r) && !z14 && l0() > 1 && (ChatObject.isChannel(this.f40217r) || this.f40217r.creator)) {
                int i35 = this.Z0;
                this.Z0 = i35 + 1;
                this.f40227v0 = i35;
            }
            if (this.M && !(z13 = this.N)) {
                if (z13 || (chatFull3 = this.f40220s) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i36 = this.Z0;
                this.Z0 = i36 + 1;
                this.f40184b1 = i36;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i37 = this.Z0;
                this.A0 = i37;
                int size = arrayList.size() + i37;
                this.Z0 = size;
                this.B0 = size;
            }
            if (this.f40227v0 == -1 && this.A0 == -1) {
                return;
            }
            int i38 = this.Z0;
            this.Z0 = i38 + 1;
            this.f40236y0 = i38;
            return;
        }
        if (i12 == 0) {
            if (ChatObject.canBlockUsers(this.f40217r)) {
                int i39 = this.Z0;
                this.Z0 = i39 + 1;
                this.f40227v0 = i39;
                if (!arrayList.isEmpty() || (this.M && !this.N && (chatFull2 = this.f40220s) != null && chatFull2.kicked_count > 0)) {
                    int i40 = this.Z0;
                    this.Z0 = i40 + 1;
                    this.X0 = i40;
                }
            }
            if (this.M && !(z12 = this.N)) {
                if (z12) {
                    return;
                }
                int i41 = this.Z0;
                this.f40238z0 = i41;
                this.Z0 = i41 + 2;
                this.f40184b1 = i41 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i42 = this.Z0;
                int i43 = i42 + 1;
                this.Z0 = i43;
                this.f40238z0 = i42;
                this.A0 = i43;
                int size2 = arrayList.size() + i43;
                this.Z0 = size2;
                this.B0 = size2;
            }
            if (this.A0 == -1) {
                int i44 = this.Z0;
                this.Z0 = i44 + 1;
                this.Y0 = i44;
                return;
            } else if (this.X0 == -1) {
                int i45 = this.Z0;
                this.Z0 = i45 + 1;
                this.X0 = i45;
                return;
            } else {
                int i46 = this.Z0;
                this.Z0 = i46 + 1;
                this.f40236y0 = i46;
                return;
            }
        }
        if (i12 == 1) {
            boolean z15 = this.L;
            if (!z15 && ChatObject.isChannel(this.f40217r)) {
                TLRPC.Chat chat5 = this.f40217r;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.f40220s) == null || chatFull.participants_count <= 200 || (!this.v && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i47 = this.Z0;
                        this.f40223t0 = i47;
                        this.Z0 = i47 + 2;
                        this.f40225u0 = i47 + 1;
                    } else {
                        int i48 = this.Z0;
                        this.Z0 = i48 + 1;
                        this.f40236y0 = i48;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.f40217r)) {
                int i49 = this.Z0;
                this.Z0 = i49 + 1;
                this.f40227v0 = i49;
            }
            if (!this.M || (z11 = this.N)) {
                if (!arrayList.isEmpty()) {
                    int i50 = this.Z0;
                    this.A0 = i50;
                    int size3 = arrayList.size() + i50;
                    this.Z0 = size3;
                    this.B0 = size3;
                }
                if (!z14) {
                    int i51 = this.Z0;
                    this.Z0 = i51 + 1;
                    this.X0 = i51;
                }
            } else if (!z11) {
                int i52 = this.Z0;
                this.Z0 = i52 + 1;
                this.f40184b1 = i52;
            }
            if (z15 || !ChatObject.isChannelAndNotMegaGroup(this.f40217r) || !ChatObject.hasAdminRights(this.f40217r) || z14) {
                return;
            }
            int i53 = this.Z0;
            int i54 = i53 + 1;
            this.Z0 = i54;
            this.f40189d1 = i53;
            if (!this.f40219r1) {
                this.Z0 = i53 + 2;
                this.f40195f1 = i54;
                return;
            } else {
                this.f40192e1 = i54;
                this.Z0 = i53 + 3;
                this.f40195f1 = i53 + 2;
                return;
            }
        }
        if (i12 == 2) {
            if (ChatObject.isChannel(this.f40217r) && !ChatObject.isChannelAndNotMegaGroup(this.f40217r) && !this.f40203j1) {
                int i55 = this.Z0;
                this.F0 = i55;
                this.Z0 = i55 + 2;
                this.G0 = i55 + 1;
            }
            int i56 = this.f40181a1;
            if (i56 == 0 && ChatObject.canAddUsers(this.f40217r)) {
                int i57 = this.Z0;
                this.Z0 = i57 + 1;
                this.f40227v0 = i57;
            }
            if (i56 == 0 && ChatObject.canUserDoAdminAction(this.f40217r, 3)) {
                int i58 = this.Z0;
                this.Z0 = i58 + 1;
                this.f40230w0 = i58;
            }
            if (this.M && !(z10 = this.N)) {
                if (z10) {
                    return;
                }
                if (i56 == 0) {
                    int i59 = this.Z0;
                    this.Z0 = i59 + 1;
                    this.f40187c1 = i59;
                }
                int i60 = this.Z0;
                this.Z0 = i60 + 1;
                this.f40184b1 = i60;
                return;
            }
            ArrayList arrayList2 = this.D;
            if (!arrayList2.isEmpty()) {
                int i61 = this.Z0;
                int i62 = i61 + 1;
                this.Z0 = i62;
                this.P0 = i61;
                this.Q0 = i62;
                int size4 = arrayList2.size() + i62;
                this.Z0 = size4;
                this.R0 = size4;
                i10 = 1;
            }
            ArrayList arrayList3 = this.C;
            if (arrayList3.isEmpty()) {
                i11 = i10;
            } else {
                int i63 = this.Z0;
                int i64 = i63 + 1;
                this.Z0 = i64;
                this.S0 = i63;
                this.T0 = i64;
                int size5 = arrayList3.size() + i64;
                this.Z0 = size5;
                this.U0 = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i11 != 0) {
                    int i65 = this.Z0;
                    this.Z0 = i65 + 1;
                    this.V0 = i65;
                }
                int i66 = this.Z0;
                this.A0 = i66;
                int size6 = arrayList.size() + i66;
                this.Z0 = size6;
                this.B0 = size6;
            }
            int i67 = this.Z0;
            if (i67 != 0) {
                this.Z0 = i67 + 1;
                this.X0 = i67;
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.f40205k1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f40181a1;
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
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 1));
        if (i10 != 0 || i11 == 2 || i11 == 0 || i11 == 3) {
            this.f40190e = new kr(this, context);
            org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
            org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.outline_header_search);
            v0VarA.F();
            v0VarA.D = new db(this, 2);
            this.f40193f = v0VarA;
            if (i11 == 0 && !this.N) {
                v0VarA.setVisibility(8);
            }
            if (i11 == 3) {
                this.f40193f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f40193f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f40217r) && !this.f40217r.creator) {
                this.f40193f.setVisibility(8);
            }
            if (i11 == 3) {
                this.h = zVarN.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else if (i11 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f40217r) && ChatObject.hasAdminRights(this.f40217r)) {
            this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        this.f40237y1 = h00Var;
        h00Var.setViewType(6);
        org.telegram.ui.Components.h00 h00Var2 = this.f40237y1;
        h00Var2.f28887w = false;
        h00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.h00 h00Var3 = this.f40237y1;
        int i12 = org.telegram.ui.ActionBar.g6.G8;
        int i13 = org.telegram.ui.ActionBar.g6.f23144i6;
        h00Var3.f(i12, i13, i13);
        frameLayout3.addView(this.f40237y1, h7.z5.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f40239z1 = radialProgressView;
        frameLayout3.addView(radialProgressView, h7.z5.e(-2, -2, 17));
        this.f40237y1.setVisibility(8);
        this.f40239z1.setVisibility(8);
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, frameLayout3, 1, null);
        this.f40182b = iw0Var;
        iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f40182b.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f40182b.setVisibility(8);
        this.f40182b.setAnimateLayoutChange(true);
        this.f40182b.e(true, false);
        frameLayout2.addView(this.f40182b, h7.z5.c(-1.0f, -1));
        this.f40182b.addView(frameLayout3, 0);
        hh.f1 f1Var = new hh.f1(this, context, 9);
        this.f40185c = f1Var;
        f1Var.p1();
        hh.f1 f1Var2 = this.f40185c;
        vq vqVar = new vq(this);
        this.d = vqVar;
        f1Var2.setLayoutManager(vqVar);
        wq wqVar = new wq(this);
        wqVar.n(420L);
        wqVar.o(org.telegram.ui.Components.er.h);
        wqVar.C = false;
        wqVar.f5819m = false;
        this.f40185c.setItemAnimator(wqVar);
        hh.f1 f1Var3 = this.f40185c;
        f1Var3.U1 = true;
        f1Var3.V1 = 0;
        hr hrVar = new hr(this, context);
        this.f40179a = hrVar;
        f1Var3.setAdapter(hrVar);
        this.f40185c.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.f40185c, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f40185c);
        this.f40185c.setOnItemClickListener(new gq(this, 3));
        this.f40185c.setOnItemLongClickListener(new gq(this, 4));
        if (this.f40193f != null) {
            this.f40185c.setOnScrollListener(new m3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f40208n = undoView;
        frameLayout2.addView(undoView, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.f40185c.setEmptyView(this.f40182b);
        hh.f1 f1Var4 = this.f40185c;
        f1Var4.U1 = false;
        f1Var4.V1 = 0;
        if (this.f40203j1) {
            this.f40193f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.J)) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        if (chatFull.f22381id == this.J) {
            if (zBooleanValue && ChatObject.isChannel(this.f40217r)) {
                return;
            }
            boolean z10 = this.f40220s != null;
            this.f40220s = chatFull;
            if (!z10) {
                int iK0 = k0();
                this.f40207m1 = iK0;
                this.l1 = iK0;
                int i12 = this.f40220s.boosts_unrestrict;
                this.f40210n1 = i12 > 0;
                this.f40212o1 = i12;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
                long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z11 = j10 > 0;
                this.f40226u1 = z11;
                this.f40224t1 = z11;
                if (j10 <= 0) {
                    j10 = 10;
                }
                long jClamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.f40231w1 = jClamp;
                this.f40228v1 = jClamp;
            }
            AndroidUtilities.runOnUIThread(new eq(this, 0));
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.v4.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.dv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        int i10 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i13 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40208n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Components.iw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Components.iw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40182b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40182b.f29506e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40185c, 0, new Class[]{org.telegram.ui.Cells.y4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long peerId;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean zCanAddAdmins;
        int i11;
        final lr lrVar;
        final long j10;
        long j11;
        int i12;
        String str2;
        int i13;
        if (tLObject == null || (i10 = this.f40181a1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            peerId = MessageObject.getPeerId(channelParticipant.peer);
            boolean z11 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            zCanAddAdmins = z11;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                peerId = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                zCanAddAdmins = ChatObject.canAddAdmins(this.f40217r);
                tL_chatAdminRights = null;
            } else {
                peerId = 0;
                str = null;
                tL_chatAdminRights = null;
                zCanAddAdmins = false;
                i11 = 0;
            }
        }
        if (peerId == 0 || peerId == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z12 = this.v;
        int i14 = this.K;
        if (i14 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerId));
            boolean z13 = ChatObject.canAddAdmins(this.f40217r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || zCanAddAdmins);
            boolean z14 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            boolean z15 = !(z14 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || zCanAddAdmins;
            boolean z16 = z14 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
            boolean z17 = ChatObject.canBlockUsers(this.f40217r) && z15 && !z12 && ChatObject.isChannel(this.f40217r) && !this.f40217r.gigagroup;
            if (i10 == 0) {
                z13 = (!UserObject.isDeleted(user)) & z13;
            }
            boolean z18 = z13 || (ChatObject.canBlockUsers(this.f40217r) && z15);
            if (z10 || !z18) {
                return z18;
            }
            boolean z19 = z17;
            nq nqVar = new nq(this, peerId, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z15);
            org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
            b70VarH.W(this.f40185c.V0(view, false));
            int i15 = R.drawable.msg_admins;
            if (z16) {
                j11 = peerId;
                i12 = R.string.EditAdminRights;
            } else {
                j11 = peerId;
                i12 = R.string.SetAsAdmin;
            }
            b70VarH.l(i15, LocaleController.getString(i12), new ti(nqVar, 11), z13);
            b70VarH.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new yf(this, tLObject, user, nqVar, 8), z19);
            boolean z20 = ChatObject.canBlockUsers(this.f40217r) && z15;
            int i16 = R.drawable.msg_remove;
            if (z12) {
                str2 = "ChannelRemoveUser";
                i13 = R.string.ChannelRemoveUser;
            } else {
                str2 = "KickFromGroup";
                i13 = R.string.KickFromGroup;
            }
            b70VarH.m(z20, i16, LocaleController.getString(str2, i13), true, new e5.u(this, user, j11, 19));
            b70VarH.S = 190;
            b70VarH.Z();
            return true;
        }
        final long j12 = peerId;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        org.telegram.ui.Components.b70 b70VarH2 = org.telegram.ui.Components.b70.H(this, view);
        if (i14 == 3 && ChatObject.canBlockUsers(this.f40217r)) {
            lrVar = this;
            b70VarH2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new gh.k1(lrVar, j12, tL_chatBannedRights, str, tLObject, 9), false);
            final int i17 = 0;
            b70VarH2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(lrVar) {

                public final lr f38182b;

                {
                    this.f38182b = lrVar;
                }

                @Override
                public final void run() {
                    switch (i17) {
                        case 0:
                            this.f38182b.i0(j12);
                            break;
                        case 1:
                            lr lrVar2 = this.f38182b;
                            long j13 = j12;
                            lrVar2.i0(j13);
                            lrVar2.getMessagesController().addUserToChat(lrVar2.J, lrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, lrVar2, null);
                            break;
                        case 2:
                            this.f38182b.i0(j12);
                            break;
                        default:
                            lr lrVar3 = this.f38182b;
                            MessagesController messagesController = lrVar3.getMessagesController();
                            long j14 = lrVar3.J;
                            MessagesController messagesController2 = lrVar3.getMessagesController();
                            long j15 = j12;
                            messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !lrVar3.v, lrVar3, false, false, null, null);
                            lrVar3.v0(j15);
                            break;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            lrVar = this;
            if (i14 == 0 && ChatObject.canBlockUsers(lrVar.f40217r)) {
                if (ChatObject.canAddUsers(lrVar.f40217r) && peerId > 0 && !ChatObject.isCommunity(lrVar.f40217r)) {
                    final int i18 = 1;
                    b70VarH2.c(R.drawable.msg_contact_add, LocaleController.getString(z12 ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup), new Runnable(lrVar) {

                        public final lr f38182b;

                        {
                            this.f38182b = lrVar;
                        }

                        @Override
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    this.f38182b.i0(j12);
                                    break;
                                case 1:
                                    lr lrVar2 = this.f38182b;
                                    long j13 = j12;
                                    lrVar2.i0(j13);
                                    lrVar2.getMessagesController().addUserToChat(lrVar2.J, lrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, lrVar2, null);
                                    break;
                                case 2:
                                    this.f38182b.i0(j12);
                                    break;
                                default:
                                    lr lrVar3 = this.f38182b;
                                    MessagesController messagesController = lrVar3.getMessagesController();
                                    long j14 = lrVar3.J;
                                    MessagesController messagesController2 = lrVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !lrVar3.v, lrVar3, false, false, null, null);
                                    lrVar3.v0(j15);
                                    break;
                            }
                        }
                    }, false);
                }
                final int i19 = 2;
                b70VarH2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(lrVar) {

                    public final lr f38182b;

                    {
                        this.f38182b = lrVar;
                    }

                    @Override
                    public final void run() {
                        switch (i19) {
                            case 0:
                                this.f38182b.i0(j12);
                                break;
                            case 1:
                                lr lrVar2 = this.f38182b;
                                long j13 = j12;
                                lrVar2.i0(j13);
                                lrVar2.getMessagesController().addUserToChat(lrVar2.J, lrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, lrVar2, null);
                                break;
                            case 2:
                                this.f38182b.i0(j12);
                                break;
                            default:
                                lr lrVar3 = this.f38182b;
                                MessagesController messagesController = lrVar3.getMessagesController();
                                long j14 = lrVar3.J;
                                MessagesController messagesController2 = lrVar3.getMessagesController();
                                long j15 = j12;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !lrVar3.v, lrVar3, false, false, null, null);
                                lrVar3.v0(j15);
                                break;
                        }
                    }
                }, true);
            } else if (i14 == 1 && ChatObject.canAddAdmins(lrVar.f40217r) && zCanAddAdmins) {
                if (lrVar.f40217r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j10 = j12;
                    b70VarH2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new gh.k1(lrVar, j10, tL_chatAdminRights2, str3, tLObject, 10), false);
                } else {
                    j10 = j12;
                }
                final int i20 = 3;
                b70VarH2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(lrVar) {

                    public final lr f38182b;

                    {
                        this.f38182b = lrVar;
                    }

                    @Override
                    public final void run() {
                        switch (i20) {
                            case 0:
                                this.f38182b.i0(j10);
                                break;
                            case 1:
                                lr lrVar2 = this.f38182b;
                                long j13 = j10;
                                lrVar2.i0(j13);
                                lrVar2.getMessagesController().addUserToChat(lrVar2.J, lrVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, lrVar2, null);
                                break;
                            case 2:
                                this.f38182b.i0(j10);
                                break;
                            default:
                                lr lrVar3 = this.f38182b;
                                MessagesController messagesController = lrVar3.getMessagesController();
                                long j14 = lrVar3.J;
                                MessagesController messagesController2 = lrVar3.getMessagesController();
                                long j15 = j10;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !lrVar3.v, lrVar3, false, false, null, null);
                                lrVar3.v0(j15);
                                break;
                        }
                    }
                }, true);
            }
        }
        b70VarH2.W(lrVar.f40185c.V0(view, false));
        b70VarH2.S = 190;
        boolean z21 = b70VarH2.x() > 0;
        if (z10 || !z21) {
            return z21;
        }
        b70VarH2.Z();
        return true;
    }

    public final void i0(long j10) {
        if (this.f40229w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.J);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new org.telegram.messenger.a(), new b5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.J);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new n(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.f40220s;
        if (chatFull == null) {
            return 0;
        }
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
        return i10 == 3600 ? 7 : 0;
    }

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f40220s;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i10 : Math.max(i10, arrayList.size());
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z10 = this.f40210n1 && q0();
        TLRPC.ChatFull chatFull = this.f40220s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f40212o1;
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
        UndoView undoView = this.f40208n;
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
        this.f40185c.setPadding(0, 0, 0, i13);
        this.f40185c.setClipToPadding(false);
        this.f40208n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f40208n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        hr hrVar = this.f40179a;
        if (hrVar != null) {
            hrVar.l();
        }
        org.telegram.ui.Components.iw0 iw0Var = this.f40182b;
        if (iw0Var != null) {
            iw0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.f40234x1 = true;
        }
        if (z10 && !z11 && this.f40203j1) {
            this.f40193f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f40193f.getSearchField());
            this.f40193f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        return i10 == this.R || i10 == this.S || i10 == this.T || i10 == this.U || i10 == this.V || i10 == this.W || i10 == this.f40196g0 || i10 == this.X || i10 == this.Y || i10 == this.Z;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f40217r;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.l1 > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.A;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.M) {
            return;
        }
        int i10 = 0;
        this.F = false;
        this.E = false;
        boolean z10 = this.f40229w;
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
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
            ArrayList<String> arrayList4 = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                String str = arrayList4.get(i12);
                i12++;
                ArrayList<TLRPC.TL_contact> arrayList5 = map.get(str);
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.TL_contact tL_contact = arrayList5.get(i13);
                    i13++;
                    arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                }
            }
            B0();
            hr hrVar = this.f40179a;
            if (hrVar != null) {
                hrVar.l();
                return;
            }
            return;
        }
        if (ChatObject.isChannel(this.f40217r)) {
            this.M = true;
            org.telegram.ui.Components.iw0 iw0Var = this.f40182b;
            if (iw0Var != null) {
                iw0Var.e(true, false);
            }
            hr hrVar2 = this.f40179a;
            if (hrVar2 != null) {
                hrVar2.l();
            }
            ArrayList arrayListS0 = s0();
            ArrayList arrayList6 = new ArrayList();
            lq lqVar = new lq(this, arrayListS0, arrayList6, 0);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i14 = 0; i14 < arrayListS0.size(); i14++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) arrayListS0.get(i14), new gf.j0(arrayList6, i14, atomicInteger, arrayListS0, lqVar, 6)), this.classGuid);
            }
            return;
        }
        this.M = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        hVar3.b();
        hVar2.b();
        hVar.b();
        if (i11 == 1) {
            TLRPC.ChatFull chatFull2 = this.f40220s;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i10 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.f40220s.participants.participants.get(i10);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    hVar3.k(chatParticipant, chatParticipant.user_id);
                    i10++;
                }
            }
        } else if (i11 == 2 && (chatFull = this.f40220s) != null && chatFull.participants != null) {
            long j10 = getUserConfig().clientUserId;
            int size4 = this.f40220s.participants.participants.size();
            while (i10 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.f40220s.participants.participants.get(i10);
                int i15 = this.f40181a1;
                if (i15 == 0 || chatParticipant2.user_id != j10) {
                    if (i15 == 1) {
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
                        if (user == null || !user.bot) {
                            arrayList3.add(chatParticipant2);
                            hVar3.k(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            hVar.k(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i10++;
            }
        }
        hr hrVar3 = this.f40179a;
        if (hrVar3 != null) {
            hrVar3.l();
        }
        B0();
        hr hrVar4 = this.f40179a;
        if (hrVar4 != null) {
            hrVar4.l();
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
            TLRPC.ChatFull chatFull = this.f40220s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f40217r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f40181a1 == 1) {
                if (this.F) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.f40197g1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.F = true;
                    arrayList.addAll(s0());
                }
            } else if (!this.F) {
                this.f40197g1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.F = true;
                arrayList.addAll(s0());
            } else if (this.E) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.E = true;
                arrayList.addAll(s0());
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f22379q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        dq dqVar = new dq(j10, this.J, tL_chatAdminRights, this.A, tL_chatBannedRights, str, i10, z10, tLObject == null, null);
        dqVar.T0 = new sq(this, tLObject, j10, z11);
        presentFragment(dqVar, z11);
    }

    public final void u0() {
        boolean z10;
        TLRPC.ChatFull chatFull;
        boolean z11 = false;
        int i10 = this.K;
        if (i10 == 3) {
            TLRPC.Chat chat = this.f40217r;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.l1 != this.f40207m1 || this.f40226u1) && this.f40220s != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.J, this, new gq(this, 0));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.A).equals(this.f40235y)) {
                getMessagesController().setDefaultBannedRole(this.J, this.A, ChatObject.isChannel(this.f40217r), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.J));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.A;
                }
            }
            int i11 = this.l1;
            if (i11 != this.f40207m1 && (chatFull = this.f40220s) != null) {
                chatFull.slowmode_seconds = m0(i11);
                this.f40220s.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.J, this.f40220s.slowmode_seconds);
            }
            boolean z12 = this.f40226u1;
            if (z12 != this.f40224t1 || (z12 && this.f40228v1 != this.f40231w1)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.J);
                updatepaidmessagesprice.send_paid_messages_stars = this.f40226u1 ? this.f40231w1 : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new jh.m5(8));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.J));
                if (chat3 != null) {
                    if (this.f40226u1) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.f40231w1;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (o0()) {
                boolean z13 = this.f40210n1 && q0();
                if (z13 && this.f40212o1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.J, 1);
                } else if (z13 || this.f40212o1 == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.J, this.f40212o1);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.J, 0);
                }
            }
        } else if (i10 == 1) {
            boolean z14 = this.f40219r1;
            if (z14 != this.f40214p1) {
                MessagesController messagesController = getMessagesController();
                long j10 = this.J;
                z10 = this.f40219r1;
                if (z10 && this.f40222s1) {
                    z11 = true;
                }
                messagesController.toggleChannelSignatures(j10, z10, z11);
            } else {
                if ((z14 && this.f40222s1) != this.f40216q1) {
                    MessagesController messagesController2 = getMessagesController();
                    long j11 = this.J;
                    z10 = this.f40219r1;
                    if (z10) {
                        z11 = true;
                    }
                    messagesController2.toggleChannelSignatures(j11, z10, z11);
                }
            }
        }
        finishFragment();
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        er erVarW0 = w0();
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
                if (this.K == 0 && (chatFull = this.f40220s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(erVarW0);
        }
        f2.q0 adapter = this.f40185c.getAdapter();
        kr krVar = this.f40190e;
        if (adapter == krVar) {
            pf.j1 j1Var = krVar.h;
            Object objF = j1Var.f45840f.f(j10);
            if (objF != null) {
                j1Var.f45839e.remove(objF);
            }
            Object objF2 = j1Var.h.f(j10);
            if (objF2 != null) {
                j1Var.f45841g.remove(objF2);
            }
            Object objF3 = krVar.f39838e.f(j10);
            if (objF3 != null) {
                krVar.d.remove(objF3);
            }
            krVar.l();
        }
    }

    public final er w0() {
        er erVar = new er(this);
        erVar.f37811b = this.Z0;
        erVar.f37816i = this.T0;
        erVar.f37817j = this.U0;
        erVar.f37819l.clear();
        erVar.f37819l.addAll(this.C);
        erVar.h = this.R0;
        erVar.f37815g = this.Q0;
        erVar.f37820m.clear();
        erVar.f37820m.addAll(this.D);
        erVar.f37813e = this.A0;
        erVar.f37814f = this.B0;
        erVar.f37818k.clear();
        erVar.f37818k.addAll(this.B);
        erVar.f(erVar.f37812c);
        return erVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        this.f40220s = chatFull;
        if (chatFull != null) {
            int iK0 = k0();
            this.f40207m1 = iK0;
            this.l1 = iK0;
            int i10 = this.f40220s.boosts_unrestrict;
            this.f40210n1 = i10 > 0;
            this.f40212o1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.J));
            long j10 = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z10 = j10 > 0;
            this.f40226u1 = z10;
            this.f40224t1 = z10;
            if (j10 <= 0) {
                j10 = 10;
            }
            long jClamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f40231w1 = jClamp;
            this.f40228v1 = jClamp;
        }
    }

    public final void y0(int i10) {
        if (this.isPaused || !this.f40234x1) {
            return;
        }
        if (this.f40185c.getAdapter() == this.f40179a && this.N) {
            return;
        }
        View view = null;
        for (int i11 = 0; i11 < this.f40185c.getChildCount(); i11++) {
            View childAt = this.f40185c.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.h00) {
                view = childAt;
            }
        }
        if (view != null) {
            this.f40185c.removeView(view);
            i10--;
        }
        this.f40185c.getViewTreeObserver().addOnPreDrawListener(new pq(this, (org.telegram.ui.Components.h00) view, i10, 0));
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new mq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
