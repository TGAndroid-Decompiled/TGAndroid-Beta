package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

public class dq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public int A0;
    public final boolean B;
    public int B0;
    public final boolean C;
    public int C0;
    public boolean D;
    public int D0;
    public final boolean E;
    public int E0;
    public float F;
    public int F0;
    public boolean G;
    public int G0;
    public final boolean H;
    public int H0;
    public final TLRPC.TL_chatAdminRights I;
    public int I0;
    public final TLRPC.TL_chatAdminRights J;
    public int J0;
    public TLRPC.TL_chatBannedRights K;
    public boolean K0;
    public final TLRPC.TL_chatBannedRights L;
    public int L0;
    public boolean M;
    public int M0;
    public final String N;
    public int N0;
    public String O;
    public int O0;
    public final String P;
    public boolean P0;
    public final boolean Q;
    public int Q0;
    public int R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public aq T0;
    public int U;
    public final String U0;
    public int V;
    public final boolean V0;
    public int W;
    public final boolean W0;
    public int X;
    public ValueAnimator X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;

    public cq f37490a;

    public int f37491a0;

    public hh.f1 f37492b;

    public int f37493b0;

    public j f37494c;

    public int f37495c0;
    public FrameLayout d;

    public int f37496d0;

    public FrameLayout f37497e;

    public int f37498e0;

    public org.telegram.ui.Components.j6 f37499f;

    public int f37500f0;

    public int f37501g0;
    public org.telegram.ui.Components.dr h;

    public int f37502h0;

    public int f37503i0;

    public int f37504j0;

    public int f37505k0;

    public int f37506l0;
    public int m0;

    public long f37507n;

    public int f37508n0;

    public int f37509o0;

    public int f37510p0;

    public int f37511q0;

    public boolean f37512r;

    public int f37513r0;

    public long f37514s;

    public int f37515s0;

    public int f37516t0;

    public int f37517u0;
    public final TLRPC.User v;

    public int f37518v0;

    public TLRPC.Chat f37519w;

    public boolean f37520w0;

    public TLRPC.ChatFull f37521x;

    public int f37522x0;

    public final int f37523y;

    public int f37524y0;

    public int f37525z0;

    public dq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        boolean z12;
        TLRPC.UserFull userFull;
        TLRPC.Chat chat;
        super(null);
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.D = false;
        this.F = 0.0f;
        this.G = false;
        this.H = false;
        this.N = "";
        this.V0 = z11;
        this.f37514s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.f37523y = i10;
        this.E = z10;
        boolean z13 = true;
        boolean z14 = !z10;
        this.P0 = z14;
        this.K0 = z14;
        this.U0 = str2;
        this.f37519w = getMessagesController().getChat(Long.valueOf(this.f37514s));
        this.f37521x = getMessagesController().getChatFull(this.f37514s);
        this.Q = user != null && user.bot_guard;
        String str3 = str != null ? str : "";
        this.O = str3;
        this.P = str3;
        this.B = ChatObject.isCommunity(this.f37519w);
        TLRPC.Chat chat2 = this.f37519w;
        if (chat2 != null) {
            this.A = ChatObject.isChannel(chat2) && !this.f37519w.megagroup;
            this.C = ChatObject.isForum(this.f37519w);
            this.J = this.f37519w.admin_rights;
        }
        if (this.J == null) {
            this.J = o0(i10 != 2 || ((chat = this.f37519w) != null && chat.creator));
        }
        if (i10 == 0 || i10 == 2) {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.A ? userFull.bot_broadcast_admin_rights : userFull.bot_group_admin_rights;
                if (tL_chatAdminRights3 != null) {
                    if (tL_chatAdminRights2 == null) {
                        tL_chatAdminRights2 = tL_chatAdminRights3;
                    } else {
                        tL_chatAdminRights2.ban_users = tL_chatAdminRights2.ban_users || tL_chatAdminRights3.ban_users;
                        tL_chatAdminRights2.add_admins = tL_chatAdminRights2.add_admins || tL_chatAdminRights3.add_admins;
                        tL_chatAdminRights2.post_messages = tL_chatAdminRights2.post_messages || tL_chatAdminRights3.post_messages;
                        tL_chatAdminRights2.pin_messages = tL_chatAdminRights2.pin_messages || tL_chatAdminRights3.pin_messages;
                        tL_chatAdminRights2.manage_ranks = tL_chatAdminRights2.manage_ranks || tL_chatAdminRights3.manage_ranks;
                        tL_chatAdminRights2.delete_messages = tL_chatAdminRights2.delete_messages || tL_chatAdminRights3.delete_messages;
                        tL_chatAdminRights2.change_info = tL_chatAdminRights2.change_info || tL_chatAdminRights3.change_info;
                        tL_chatAdminRights2.anonymous = tL_chatAdminRights2.anonymous || tL_chatAdminRights3.anonymous;
                        tL_chatAdminRights2.edit_messages = tL_chatAdminRights2.edit_messages || tL_chatAdminRights3.edit_messages;
                        tL_chatAdminRights2.manage_call = tL_chatAdminRights2.manage_call || tL_chatAdminRights3.manage_call;
                        tL_chatAdminRights2.manage_topics = tL_chatAdminRights2.manage_topics || tL_chatAdminRights3.manage_topics;
                        tL_chatAdminRights2.post_stories = tL_chatAdminRights2.post_stories || tL_chatAdminRights3.post_stories;
                        tL_chatAdminRights2.edit_stories = tL_chatAdminRights2.edit_stories || tL_chatAdminRights3.edit_stories;
                        tL_chatAdminRights2.delete_stories = tL_chatAdminRights2.delete_stories || tL_chatAdminRights3.delete_stories;
                        tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights2.manage_direct_messages || tL_chatAdminRights3.manage_direct_messages;
                        tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights2.manage_welcome_messages || tL_chatAdminRights3.manage_welcome_messages;
                        tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights2.manage_linked_peers || tL_chatAdminRights3.manage_linked_peers;
                        tL_chatAdminRights2.other = tL_chatAdminRights2.other || tL_chatAdminRights3.other;
                    }
                }
            }
            if (tL_chatAdminRights2 == null) {
                this.H = false;
                if (i10 == 2) {
                    this.I = o0(false);
                    boolean z15 = this.A;
                    this.G = z15;
                    this.F = z15 ? 1.0f : 0.0f;
                    this.W0 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.I = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.J;
                    tL_chatAdminRights4.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights4.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights4.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights4.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights4.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights4.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights4.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights4.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights4.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights4.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights4.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights4.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights4.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights4.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights4.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights4.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights4.other = tL_chatAdminRights5.other;
                    this.W0 = false;
                }
            } else {
                this.H = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.I = tL_chatAdminRights6;
                boolean z16 = tL_chatAdminRights2.change_info;
                tL_chatAdminRights6.change_info = z16;
                boolean z17 = tL_chatAdminRights2.post_messages;
                tL_chatAdminRights6.post_messages = z17;
                boolean z18 = tL_chatAdminRights2.edit_messages;
                tL_chatAdminRights6.edit_messages = z18;
                boolean z19 = tL_chatAdminRights2.delete_messages;
                tL_chatAdminRights6.delete_messages = z19;
                boolean z20 = tL_chatAdminRights2.manage_call;
                tL_chatAdminRights6.manage_call = z20;
                boolean z21 = tL_chatAdminRights2.ban_users;
                tL_chatAdminRights6.ban_users = z21;
                boolean z22 = tL_chatAdminRights2.invite_users;
                tL_chatAdminRights6.invite_users = z22;
                boolean z23 = tL_chatAdminRights2.pin_messages;
                tL_chatAdminRights6.pin_messages = z23;
                boolean z24 = tL_chatAdminRights2.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z24;
                boolean z25 = tL_chatAdminRights2.manage_topics;
                tL_chatAdminRights6.manage_topics = z25;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights2.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights2.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights2.delete_stories;
                boolean z26 = tL_chatAdminRights2.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z26;
                boolean z27 = tL_chatAdminRights2.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z27;
                boolean z28 = tL_chatAdminRights2.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z28;
                boolean z29 = tL_chatAdminRights2.add_admins;
                tL_chatAdminRights6.add_admins = z29;
                boolean z30 = tL_chatAdminRights2.anonymous;
                tL_chatAdminRights6.anonymous = z30;
                boolean z31 = tL_chatAdminRights2.other;
                tL_chatAdminRights6.other = z31;
                boolean z32 = z16 || z17 || z26 || z27 || z18 || z19 || z21 || z22 || z28 || z23 || z24 || z29 || z20 || z30 || z25 || z31;
                this.W0 = z32;
                if (i10 == 2) {
                    boolean z33 = this.A || z32;
                    this.G = z33;
                    this.F = z33 ? 1.0f : 0.0f;
                    this.W0 = false;
                }
            }
            TLRPC.Chat chat3 = this.f37519w;
            if (chat3 != null) {
                this.L = chat3.default_banned_rights;
            }
            if (this.L == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.L = tL_chatBannedRights3;
                tL_chatBannedRights3.view_messages = false;
                tL_chatBannedRights3.send_media = false;
                tL_chatBannedRights3.send_messages = false;
                tL_chatBannedRights3.embed_links = false;
                tL_chatBannedRights3.send_stickers = false;
                tL_chatBannedRights3.send_gifs = false;
                tL_chatBannedRights3.send_games = false;
                tL_chatBannedRights3.send_inline = false;
                tL_chatBannedRights3.send_polls = false;
                tL_chatBannedRights3.invite_users = false;
                tL_chatBannedRights3.change_info = false;
                tL_chatBannedRights3.pin_messages = false;
                tL_chatBannedRights3.manage_topics = false;
                tL_chatBannedRights3.send_plain = false;
                tL_chatBannedRights3.send_videos = false;
                tL_chatBannedRights3.send_photos = false;
                tL_chatBannedRights3.send_audios = false;
                tL_chatBannedRights3.send_docs = false;
                tL_chatBannedRights3.send_voices = false;
                tL_chatBannedRights3.send_roundvideos = false;
                tL_chatBannedRights3.edit_rank = false;
                tL_chatBannedRights3.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.L;
            if (tL_chatBannedRights4.change_info || this.A) {
                z12 = true;
            } else {
                z12 = true;
                this.I.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.I.pin_messages = z12;
            }
        } else if (i10 == 1) {
            this.L = tL_chatBannedRights;
            if (tL_chatBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                this.L = tL_chatBannedRights5;
                tL_chatBannedRights5.view_messages = false;
                tL_chatBannedRights5.send_media = false;
                tL_chatBannedRights5.send_messages = false;
                tL_chatBannedRights5.embed_links = false;
                tL_chatBannedRights5.send_stickers = false;
                tL_chatBannedRights5.send_gifs = false;
                tL_chatBannedRights5.send_games = false;
                tL_chatBannedRights5.send_inline = false;
                tL_chatBannedRights5.send_polls = false;
                tL_chatBannedRights5.invite_users = false;
                tL_chatBannedRights5.change_info = false;
                tL_chatBannedRights5.pin_messages = false;
                tL_chatBannedRights5.manage_topics = false;
                tL_chatBannedRights5.send_plain = false;
                tL_chatBannedRights5.send_videos = false;
                tL_chatBannedRights5.send_photos = false;
                tL_chatBannedRights5.send_audios = false;
                tL_chatBannedRights5.send_docs = false;
                tL_chatBannedRights5.send_voices = false;
                tL_chatBannedRights5.send_roundvideos = false;
                tL_chatBannedRights5.edit_rank = false;
                tL_chatBannedRights5.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = new TLRPC.TL_chatBannedRights();
            this.K = tL_chatBannedRights6;
            if (tL_chatBannedRights2 == null) {
                tL_chatBannedRights6.view_messages = false;
                tL_chatBannedRights6.send_media = false;
                tL_chatBannedRights6.send_messages = false;
                tL_chatBannedRights6.embed_links = false;
                tL_chatBannedRights6.send_stickers = false;
                tL_chatBannedRights6.send_gifs = false;
                tL_chatBannedRights6.send_games = false;
                tL_chatBannedRights6.send_inline = false;
                tL_chatBannedRights6.send_polls = false;
                tL_chatBannedRights6.invite_users = false;
                tL_chatBannedRights6.change_info = false;
                tL_chatBannedRights6.pin_messages = false;
                tL_chatBannedRights6.manage_topics = false;
                tL_chatBannedRights6.edit_rank = false;
                tL_chatBannedRights6.send_reactions = false;
            } else {
                tL_chatBannedRights6.view_messages = tL_chatBannedRights2.view_messages;
                tL_chatBannedRights6.send_messages = tL_chatBannedRights2.send_messages;
                tL_chatBannedRights6.send_media = tL_chatBannedRights2.send_media;
                tL_chatBannedRights6.send_stickers = tL_chatBannedRights2.send_stickers;
                tL_chatBannedRights6.send_gifs = tL_chatBannedRights2.send_gifs;
                tL_chatBannedRights6.send_games = tL_chatBannedRights2.send_games;
                tL_chatBannedRights6.send_inline = tL_chatBannedRights2.send_inline;
                tL_chatBannedRights6.embed_links = tL_chatBannedRights2.embed_links;
                tL_chatBannedRights6.send_polls = tL_chatBannedRights2.send_polls;
                tL_chatBannedRights6.invite_users = tL_chatBannedRights2.invite_users;
                tL_chatBannedRights6.change_info = tL_chatBannedRights2.change_info;
                tL_chatBannedRights6.pin_messages = tL_chatBannedRights2.pin_messages;
                tL_chatBannedRights6.until_date = tL_chatBannedRights2.until_date;
                tL_chatBannedRights6.manage_topics = tL_chatBannedRights2.manage_topics;
                tL_chatBannedRights6.send_photos = tL_chatBannedRights2.send_photos;
                tL_chatBannedRights6.send_videos = tL_chatBannedRights2.send_videos;
                tL_chatBannedRights6.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                tL_chatBannedRights6.send_audios = tL_chatBannedRights2.send_audios;
                tL_chatBannedRights6.send_voices = tL_chatBannedRights2.send_voices;
                tL_chatBannedRights6.send_docs = tL_chatBannedRights2.send_docs;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.K;
                tL_chatBannedRights7.send_plain = tL_chatBannedRights2.send_plain;
                tL_chatBannedRights7.edit_rank = tL_chatBannedRights2.edit_rank;
                tL_chatBannedRights7.send_reactions = tL_chatBannedRights2.send_reactions;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.L;
            if (tL_chatBannedRights8.view_messages) {
                this.K.view_messages = true;
            }
            if (tL_chatBannedRights8.send_messages) {
                this.K.send_messages = true;
            }
            if (tL_chatBannedRights8.send_media) {
                this.K.send_media = true;
            }
            if (tL_chatBannedRights8.send_stickers) {
                this.K.send_stickers = true;
            }
            if (tL_chatBannedRights8.send_gifs) {
                this.K.send_gifs = true;
            }
            if (tL_chatBannedRights8.send_games) {
                this.K.send_games = true;
            }
            if (tL_chatBannedRights8.send_inline) {
                this.K.send_inline = true;
            }
            if (tL_chatBannedRights8.embed_links) {
                this.K.embed_links = true;
            }
            if (tL_chatBannedRights8.send_polls) {
                this.K.send_polls = true;
            }
            if (tL_chatBannedRights8.invite_users) {
                this.K.invite_users = true;
            }
            if (tL_chatBannedRights8.change_info) {
                this.K.change_info = true;
            }
            if (tL_chatBannedRights8.pin_messages) {
                this.K.pin_messages = true;
            }
            if (tL_chatBannedRights8.edit_rank) {
                this.K.edit_rank = true;
            }
            if (tL_chatBannedRights8.send_reactions) {
                this.K.send_reactions = true;
            }
            if (tL_chatBannedRights8.manage_topics) {
                this.K.manage_topics = true;
            }
            if (tL_chatBannedRights8.send_photos) {
                this.K.send_photos = true;
            }
            if (tL_chatBannedRights8.send_videos) {
                this.K.send_videos = true;
            }
            if (tL_chatBannedRights8.send_audios) {
                this.K.send_audios = true;
            }
            if (tL_chatBannedRights8.send_docs) {
                this.K.send_docs = true;
            }
            if (tL_chatBannedRights8.send_voices) {
                this.K.send_voices = true;
            }
            if (tL_chatBannedRights8.send_roundvideos) {
                this.K.send_roundvideos = true;
            }
            if (tL_chatBannedRights8.send_plain) {
                this.K.send_plain = true;
            }
            this.N = ChatObject.getBannedRightsString(this.K);
            if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                z13 = false;
            }
            this.W0 = z13;
        }
        u0(false);
    }

    public static void U(dq dqVar, long j10) {
        if (j10 != 0) {
            dqVar.f37514s = j10;
            dqVar.f37519w = MessagesController.getInstance(dqVar.currentAccount).getChat(Long.valueOf(j10));
            dqVar.r0(true);
        }
    }

    public static void V(final dq dqVar, org.telegram.ui.ActionBar.z2 z2Var, View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (iIntValue == 0) {
            dqVar.K.until_date = 0;
            dqVar.f37490a.m(dqVar.I0);
        } else if (iIntValue == 1) {
            dqVar.K.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 86400;
            dqVar.f37490a.m(dqVar.I0);
        } else if (iIntValue == 2) {
            dqVar.K.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 604800;
            dqVar.f37490a.m(dqVar.I0);
        } else if (iIntValue == 3) {
            dqVar.K.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 2592000;
            dqVar.f37490a.m(dqVar.I0);
        } else if (iIntValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(dqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                        final dq dqVar2 = this.f43512a;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i10, i11, i12);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(dqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                @Override
                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                    dq dqVar3 = dqVar2;
                                    dqVar3.K.until_date = (i14 * 60) + (i13 * 3600) + time;
                                    dqVar3.f37490a.m(dqVar3.I0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new wp());
                            dqVar2.showDialog(timePickerDialog);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                }, calendar.get(1), calendar.get(2), calendar.get(5));
                DatePicker datePicker = datePickerDialog.getDatePicker();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.set(11, calendar2.getMinimum(11));
                calendar2.set(12, calendar2.getMinimum(12));
                calendar2.set(13, calendar2.getMinimum(13));
                calendar2.set(14, calendar2.getMinimum(14));
                datePicker.setMinDate(calendar2.getTimeInMillis());
                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                calendar2.set(11, calendar2.getMaximum(11));
                calendar2.set(12, calendar2.getMaximum(12));
                calendar2.set(13, calendar2.getMaximum(13));
                calendar2.set(14, calendar2.getMaximum(14));
                datePicker.setMaxDate(calendar2.getTimeInMillis());
                datePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), datePickerDialog);
                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new wp());
                datePickerDialog.setOnShowListener(new xp(0, datePicker));
                dqVar.showDialog(datePickerDialog);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        z2Var.f23994a.dismissRunnable.run();
    }

    public static boolean W(dq dqVar, TLRPC.TL_error tL_error) {
        dqVar.t0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!ChatObject.isChannel(dqVar.f37519w)) {
            ag.i1 i1Var = new ag.i1(11, dqVar.currentAccount, dqVar.getParentActivity(), dqVar, dqVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(dqVar.v);
            i1Var.I1(dqVar.f37519w, arrayList, null, null, null);
            i1Var.show();
        }
        return false;
    }

    public static void X(dq dqVar, Context context, View view, int i10) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z13;
        boolean z14;
        View viewM;
        String string;
        boolean z15 = dqVar.A;
        TLRPC.User user = dqVar.v;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = dqVar.L;
        int i11 = dqVar.f37523y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.I;
        if (dqVar.E || (dqVar.f37519w.creator && i11 == 0 && i10 == dqVar.f37491a0)) {
            boolean z16 = false;
            if (i10 == dqVar.f37518v0) {
                if (!(view instanceof org.telegram.ui.Cells.o8) || ((org.telegram.ui.Cells.o8) view).isEnabled()) {
                    dqVar.f37520w0 = !dqVar.f37520w0;
                    dqVar.u0(false);
                    dqVar.f37490a.m(dqVar.f37518v0);
                    if (dqVar.f37520w0) {
                        dqVar.f37490a.s(dqVar.f37518v0 + 1, 10);
                        return;
                    } else {
                        dqVar.f37490a.t(dqVar.f37518v0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i12 = dqVar.J0;
            if (i10 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.o8) || ((org.telegram.ui.Cells.o8) view).isEnabled()) {
                    dqVar.K0 = !dqVar.K0;
                    dqVar.u0(false);
                    dqVar.f37490a.m(dqVar.J0);
                    if (dqVar.K0) {
                        dqVar.f37490a.s(dqVar.J0 + 1, 3);
                        return;
                    } else {
                        dqVar.f37490a.t(dqVar.J0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i13 = dqVar.O0;
            if (i10 == i13) {
                if (!(view instanceof org.telegram.ui.Cells.o8) || ((org.telegram.ui.Cells.o8) view).isEnabled()) {
                    dqVar.P0 = !dqVar.P0;
                    dqVar.u0(false);
                    dqVar.f37490a.m(dqVar.O0);
                    if (dqVar.P0) {
                        dqVar.f37490a.s(dqVar.O0 + 1, 3);
                        return;
                    } else {
                        dqVar.f37490a.t(dqVar.O0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i10 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f22527id);
                dqVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i10 == dqVar.f37506l0) {
                if (i11 == 0) {
                    MessagesController.getInstance(dqVar.currentAccount).setUserAdminRole(dqVar.f37514s, dqVar.v, new TLRPC.TL_chatAdminRights(), dqVar.O, dqVar.A, dqVar.getFragmentForAlert(0), dqVar.V0, false, null, null);
                    aq aqVar = dqVar.T0;
                    if (aqVar != null) {
                        aqVar.b(0, tL_chatAdminRights, dqVar.K, dqVar.O);
                    }
                    dqVar.finishFragment();
                    return;
                }
                if (i11 == 1) {
                    dqVar.M = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    dqVar.K = tL_chatBannedRights3;
                    tL_chatBannedRights3.view_messages = true;
                    tL_chatBannedRights3.send_media = true;
                    tL_chatBannedRights3.send_messages = true;
                    tL_chatBannedRights3.send_stickers = true;
                    tL_chatBannedRights3.send_gifs = true;
                    tL_chatBannedRights3.send_games = true;
                    tL_chatBannedRights3.send_inline = true;
                    tL_chatBannedRights3.embed_links = true;
                    tL_chatBannedRights3.pin_messages = true;
                    tL_chatBannedRights3.edit_rank = true;
                    tL_chatBannedRights3.send_reactions = true;
                    tL_chatBannedRights3.send_polls = true;
                    tL_chatBannedRights3.invite_users = true;
                    tL_chatBannedRights3.change_info = true;
                    tL_chatBannedRights3.manage_topics = true;
                    tL_chatBannedRights3.until_date = 0;
                    dqVar.r0(true);
                    return;
                }
                return;
            }
            if (i10 == dqVar.f37510p0) {
                dqVar.p0(null, null);
                return;
            }
            if (i10 == dqVar.I0) {
                if (dqVar.getParentActivity() == null) {
                    return;
                }
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, org.telegram.ui.ActionBar.g6.f23233n5, 23, 15, false, null);
                j4Var.setHeight(47);
                j4Var.setText(LocaleController.getString(R.string.UserRestrictionsDuration));
                linearLayout.addView(j4Var);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                int i14 = -2;
                linearLayout.addView(linearLayout2, h7.z5.n(-1, -2));
                org.telegram.ui.ActionBar.x2[] x2VarArr = new org.telegram.ui.ActionBar.x2[5];
                int i15 = 0;
                for (int i16 = 5; i15 < i16; i16 = 5) {
                    org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(context, 0, null);
                    x2VarArr[i15] = x2Var;
                    x2Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    x2VarArr[i15].setTag(Integer.valueOf(i15));
                    x2VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    if (i15 == 0) {
                        string = LocaleController.getString(R.string.UserRestrictionsUntilForever);
                    } else if (i15 == 1) {
                        string = LocaleController.formatPluralString("Days", 1, new Object[0]);
                    } else if (i15 != 2) {
                        string = i15 != 3 ? LocaleController.getString(R.string.UserRestrictionsCustom) : LocaleController.formatPluralString("Months", 1, new Object[0]);
                    } else {
                        string = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
                    }
                    x2VarArr[i15].a(string, 0, null, false);
                    linearLayout2.addView(x2VarArr[i15], h7.z5.n(-1, i14));
                    x2VarArr[i15].setOnClickListener(new nh.x1(25, dqVar, z2Var));
                    i15++;
                    i14 = -2;
                }
                z2Var.b(linearLayout);
                dqVar.showDialog(e3Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.y1) {
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                int i17 = dqVar.L0;
                if (i10 == i17 || i10 == dqVar.M0 || i10 == dqVar.N0) {
                    if (i10 == i17) {
                        z13 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z13;
                    } else if (i10 == dqVar.M0) {
                        z13 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z13;
                    }
                    dqVar.f37490a.m(i12);
                    y1Var.c(z13, true);
                    return;
                }
                int i18 = dqVar.Q0;
                if (i10 == i18 || i10 == dqVar.R0 || i10 == dqVar.S0) {
                    if (i10 == i18) {
                        z14 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z14;
                    } else if (i10 == dqVar.R0) {
                        z14 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z14;
                    } else {
                        z14 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z14;
                    }
                    dqVar.f37490a.m(i13);
                    y1Var.c(z14, true);
                    return;
                }
                if (i11 != 1 || dqVar.K == null) {
                    return;
                }
                y1Var.b();
                if (y1Var.f25981r.f27189b != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar.getParentActivity());
                        String string2 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string2;
                        b2Var.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        b2Var.show();
                        return;
                    }
                    return;
                }
                if (i10 == dqVar.f37522x0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = dqVar.K;
                    z16 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z16;
                } else if (i10 == dqVar.f37524y0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = dqVar.K;
                    z16 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z16;
                } else if (i10 == dqVar.f37525z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = dqVar.K;
                    z16 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z16;
                } else if (i10 == dqVar.f37500f0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = dqVar.K;
                    z16 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z16;
                } else if (i10 == dqVar.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = dqVar.K;
                    z16 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z16;
                } else if (i10 == dqVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = dqVar.K;
                    z16 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z16;
                } else if (i10 == dqVar.B0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = dqVar.K;
                    z16 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z16;
                } else if (i10 == dqVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = dqVar.K;
                    z16 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z16;
                    tL_chatBannedRights11.send_gifs = z16;
                    tL_chatBannedRights11.send_games = z16;
                    tL_chatBannedRights11.send_stickers = z16;
                } else if (i10 == dqVar.F0) {
                    if ((dqVar.K.send_plain || tL_chatBannedRights2.send_plain) && (viewM = dqVar.f37494c.m(dqVar.f37517u0)) != null) {
                        AndroidUtilities.shakeViewSpring(viewM);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = dqVar.K;
                        z16 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z16;
                    }
                } else if (i10 == dqVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = dqVar.K;
                    z16 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z16;
                }
                dqVar.f37490a.m(dqVar.f37518v0);
                y1Var.c(!z16, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.o8) {
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                Switch r10 = o8Var.d;
                if (r10.B != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dqVar.getParentActivity());
                        String string3 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                        b2Var2.N = string3;
                        b2Var2.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        b2Var2.show();
                        return;
                    }
                    return;
                }
                if (!o8Var.isEnabled()) {
                    if (i11 == 2 || i11 == 0) {
                        if ((i10 != dqVar.T || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i10 != dqVar.f37496d0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i10 != dqVar.f37498e0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dqVar.getParentActivity());
                        String string4 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                        b2Var3.N = string4;
                        b2Var3.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.OK), null);
                        b2Var3.show();
                        return;
                    }
                    return;
                }
                if (i11 != 2 && i10 != dqVar.f37501g0) {
                    o8Var.setChecked(!r10.h);
                }
                boolean z17 = r10.h;
                if (i10 == dqVar.S) {
                    z17 = !dqVar.G;
                    dqVar.G = z17;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = dqVar.J;
                    FrameLayout frameLayout = dqVar.f37497e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = dqVar.f37492b.getChildCount();
                    int i19 = 0;
                    while (i19 < childCount) {
                        View childAt = dqVar.f37492b.getChildAt(i19);
                        dqVar.f37492b.getClass();
                        int iR = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.o8) {
                            boolean z18 = dqVar.G;
                            if (z18) {
                                if (iR == dqVar.S) {
                                    if (tL_chatAdminRights2.add_admins || ((chat2 = dqVar.f37519w) != null && chat2.creator)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                } else if (iR == dqVar.T) {
                                    z18 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info && tL_chatBannedRights2.change_info) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                } else if (iR == dqVar.U) {
                                    z18 = tL_chatAdminRights.post_messages;
                                    z12 = tL_chatAdminRights2.post_messages;
                                } else if (iR == dqVar.V) {
                                    z18 = tL_chatAdminRights.manage_direct_messages;
                                    z12 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (iR == dqVar.W) {
                                    z18 = tL_chatAdminRights.manage_welcome_messages;
                                    z12 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (iR == dqVar.X) {
                                    z18 = tL_chatAdminRights.edit_messages;
                                    z12 = tL_chatAdminRights2.edit_messages;
                                } else if (iR == dqVar.Y) {
                                    z18 = tL_chatAdminRights.delete_messages;
                                    z12 = tL_chatAdminRights2.delete_messages;
                                } else if (iR == dqVar.f37493b0) {
                                    z18 = tL_chatAdminRights.ban_users;
                                    z12 = tL_chatAdminRights2.ban_users;
                                } else if (iR == dqVar.f37495c0) {
                                    z18 = tL_chatAdminRights.invite_users;
                                    z12 = tL_chatAdminRights2.invite_users;
                                } else if (iR == dqVar.f37496d0) {
                                    z18 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages && tL_chatBannedRights2.pin_messages) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                } else if (iR == dqVar.f37498e0) {
                                    z18 = tL_chatAdminRights.manage_ranks;
                                    z12 = tL_chatAdminRights2.manage_ranks;
                                } else if (iR == dqVar.G0) {
                                    z18 = tL_chatAdminRights.manage_call;
                                    z12 = tL_chatAdminRights2.manage_call;
                                } else if (iR == dqVar.Z) {
                                    z18 = tL_chatAdminRights.add_admins;
                                    z12 = tL_chatAdminRights2.add_admins;
                                } else if (iR == dqVar.f37491a0) {
                                    z18 = tL_chatAdminRights.anonymous;
                                    if (tL_chatAdminRights2.anonymous || ((chat = dqVar.f37519w) != null && chat.creator)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                } else if (iR == dqVar.f37503i0) {
                                    z18 = tL_chatAdminRights.manage_topics;
                                    z12 = tL_chatAdminRights2.manage_topics;
                                } else if (iR == dqVar.f37504j0) {
                                    z18 = tL_chatAdminRights.manage_linked_peers;
                                    z12 = tL_chatAdminRights2.manage_linked_peers;
                                } else {
                                    z12 = false;
                                    z18 = false;
                                }
                                org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) childAt;
                                o8Var2.setChecked(z18);
                                o8Var2.b(z12, true);
                            } else if ((iR != dqVar.T || tL_chatBannedRights2.change_info) && ((iR != dqVar.f37496d0 || tL_chatBannedRights2.pin_messages) && (iR != dqVar.f37498e0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.o8 o8Var3 = (org.telegram.ui.Cells.o8) childAt;
                                o8Var3.setChecked(z16);
                                o8Var3.b(iR == dqVar.S, true);
                            } else {
                                org.telegram.ui.Cells.o8 o8Var4 = (org.telegram.ui.Cells.o8) childAt;
                                o8Var4.setChecked(true);
                                o8Var4.b(z16, z16);
                            }
                        }
                        i19++;
                        z16 = false;
                    }
                    dqVar.f37490a.l();
                    org.telegram.ui.Components.j6 j6Var = dqVar.f37499f;
                    if (j6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.rl.j(R.string.AddBotButton, " ", sb2);
                        sb2.append(LocaleController.getString(dqVar.G ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                        j6Var.c(sb2.toString(), true, dqVar.G);
                    }
                    ValueAnimator valueAnimator = dqVar.Y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        dqVar.Y0 = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dqVar.F, dqVar.G ? 1.0f : 0.0f);
                    dqVar.Y0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new tp(dqVar, 1));
                    dqVar.Y0.setDuration((long) (Math.abs(dqVar.F - (dqVar.G ? 1.0f : 0.0f)) * 200.0f));
                    dqVar.Y0.start();
                } else if (i10 == dqVar.T) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = dqVar.K;
                        z17 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z17;
                    }
                } else if (i10 == dqVar.U) {
                    z17 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z17;
                } else if (i10 == dqVar.f37501g0) {
                    String shortName = DialogObject.getShortName(user);
                    org.telegram.ui.Components.y4.v0(dqVar, LocaleController.getString(R.string.ApproveNewMembersTitle), AndroidUtilities.replaceTags(LocaleController.formatString(z17 ? z15 ? R.string.ApproveNewMembersDisabledMessageChannel : R.string.ApproveNewMembersDisabledMessageGroup : z15 ? R.string.ApproveNewMembersMessageChannel : R.string.ApproveNewMembersMessageGroup, shortName)), LocaleController.getString(!z17 ? R.string.ApproveNewMembersEnable : R.string.ApproveNewMembersDisable), false, new sp(dqVar, !z17 ? user.f22527id : 0L, 1));
                } else if (i10 == dqVar.W) {
                    z17 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z17;
                } else if (i10 == dqVar.V) {
                    z17 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z17;
                } else if (i10 == dqVar.X) {
                    z17 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z17;
                } else if (i10 == dqVar.Y) {
                    z17 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z17;
                } else if (i10 == dqVar.Z) {
                    z17 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z17;
                } else if (i10 == dqVar.f37491a0) {
                    z17 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z17;
                } else if (i10 == dqVar.f37493b0) {
                    z17 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z17;
                } else if (i10 == dqVar.G0) {
                    z17 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z17;
                } else if (i10 == dqVar.f37503i0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = dqVar.K;
                        z17 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z17;
                    }
                } else if (i10 == dqVar.f37504j0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = dqVar.K;
                        z17 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z17;
                    }
                } else if (i10 == dqVar.f37495c0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = dqVar.K;
                        z17 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z17;
                    }
                } else if (i10 != dqVar.f37496d0) {
                    if (i10 != dqVar.f37498e0) {
                        if (i11 == 1 && (tL_chatBannedRights = dqVar.K) != null) {
                            if (i10 == dqVar.f37517u0) {
                                z10 = !tL_chatBannedRights.send_plain;
                                tL_chatBannedRights.send_plain = z10;
                            } else {
                                z10 = z17;
                            }
                            if (z17 && ((!tL_chatBannedRights.send_plain || !tL_chatBannedRights.embed_links || !tL_chatBannedRights.send_inline || !tL_chatBannedRights.send_photos || !tL_chatBannedRights.send_videos || !tL_chatBannedRights.send_audios || !tL_chatBannedRights.send_docs || !tL_chatBannedRights.send_voices || !tL_chatBannedRights.send_roundvideos || !tL_chatBannedRights.send_polls || !tL_chatBannedRights.send_reactions) && tL_chatBannedRights.view_messages)) {
                                tL_chatBannedRights.view_messages = false;
                            }
                            int i20 = dqVar.F0;
                            if (i20 >= 0) {
                                dqVar.f37490a.m(i20);
                            }
                            int i21 = dqVar.f37518v0;
                            if (i21 >= 0) {
                                dqVar.f37490a.m(i21);
                            }
                            z17 = z10;
                        }
                        if (i11 == 2) {
                            if (dqVar.G || !z17) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            o8Var.setChecked(z11);
                        }
                        dqVar.u0(true);
                    }
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = dqVar.K;
                        z17 = !tL_chatBannedRights18.edit_rank;
                        tL_chatBannedRights18.edit_rank = z17;
                    }
                } else if (i11 == 0 || i11 == 2) {
                    z17 = !tL_chatAdminRights.pin_messages;
                    tL_chatAdminRights.pin_messages = z17;
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights19 = dqVar.K;
                    z17 = !tL_chatBannedRights19.pin_messages;
                    tL_chatBannedRights19.pin_messages = z17;
                }
                if (i11 == 2) {
                    if (dqVar.G) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    o8Var.setChecked(z11);
                }
                dqVar.u0(true);
            }
        }
    }

    public static void Y(dq dqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        boolean z10 = dqVar.A;
        TLRPC.User user = dqVar.v;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                dqVar.T0.a(user);
                dqVar.removeSelfFromStack();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (dqVar.getParentActivity() == null) {
            return;
        }
        int i10 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                if (z10) {
                    b2Var.N = LocaleController.getString(R.string.EditAdminChannelTransfer);
                } else {
                    b2Var.N = LocaleController.getString(R.string.EditAdminGroupTransfer);
                }
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, dqVar.f37519w.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new rp(dqVar, i10));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                dqVar.showDialog(b2Var);
                return;
            }
            return;
        }
        int i11 = 6;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(dqVar.currentAccount).sendRequest(new TL_account.getPassword(), new gg(i11, dqVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.y4.h0(tL_error, dqVar, z10, dqVar.B, tL_channels_editCreator);
                return;
            }
            if (dqVar.getParentActivity() == null || AccountInstance.getInstance(dqVar.currentAccount).getUserConfig().isPremium()) {
                dqVar.presentFragment(new ld1(1));
                return;
            } else {
                dqVar.showDialog(new ag.i1(5, dqVar.currentAccount, dqVar.getParentActivity(), dqVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dqVar.getParentActivity());
        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
        b2Var2.N = string;
        LinearLayout linearLayout = new LinearLayout(dqVar.getParentActivity());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(dqVar.getParentActivity());
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
        }
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(dqVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(dqVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        TextView textView2 = new TextView(dqVar.getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
            linearLayout2.addView(imageView, h7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, h7.z5.n(-2, -2));
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(dqVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(dqVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false), mode));
        TextView textView3 = new TextView(dqVar.getParentActivity());
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, h7.z5.n(-1, -2));
            linearLayout3.addView(imageView2, h7.z5.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, h7.z5.n(-2, -2));
            linearLayout3.addView(textView3, h7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new rp(dqVar, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(dqVar.getParentActivity());
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        }
        dqVar.showDialog(b2Var2);
    }

    public static void Z(dq dqVar, long j10) {
        TLRPC.ChatFull chatFull = dqVar.f37521x;
        long j11 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User user = j11 != 0 ? dqVar.getMessagesController().getUser(Long.valueOf(j11)) : null;
        if (user != null && j10 != 0 && user.f22527id != j10) {
            new org.telegram.ui.Components.l30(dqVar.getParentActivity(), dqVar.resourceProvider, user, dqVar.v, new sp(dqVar, j10, 0)).show();
            return;
        }
        dqVar.f37507n = j10;
        dqVar.f37512r = true;
        dqVar.n0();
    }

    public static void a0(dq dqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            dqVar.f37514s = j10;
            dqVar.f37519w = MessagesController.getInstance(dqVar.currentAccount).getChat(Long.valueOf(j10));
            dqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(dq dqVar, View view) {
        if (view instanceof org.telegram.ui.Cells.j4) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            String str = dqVar.O;
            int iCodePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (iCodePointCount > 4.8f) {
                j4Var.setText2("");
                return;
            }
            j4Var.setText2(String.format("%d", Integer.valueOf(iCodePointCount)));
            org.telegram.ui.ActionBar.h5 textView2 = j4Var.getTextView2();
            int i10 = iCodePointCount < 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            textView2.setTag(Integer.valueOf(i10));
        }
    }

    public static boolean l0(dq dqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.L;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights o0(boolean z10) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z10;
        tL_chatAdminRights.manage_ranks = z10;
        tL_chatAdminRights.manage_welcome_messages = z10;
        tL_chatAdminRights.manage_direct_messages = z10;
        tL_chatAdminRights.delete_stories = z10;
        tL_chatAdminRights.edit_stories = z10;
        tL_chatAdminRights.post_stories = z10;
        tL_chatAdminRights.manage_topics = z10;
        tL_chatAdminRights.manage_call = z10;
        tL_chatAdminRights.add_admins = z10;
        tL_chatAdminRights.pin_messages = z10;
        tL_chatAdminRights.invite_users = z10;
        tL_chatAdminRights.ban_users = z10;
        tL_chatAdminRights.delete_messages = z10;
        tL_chatAdminRights.edit_messages = z10;
        tL_chatAdminRights.post_messages = z10;
        tL_chatAdminRights.change_info = z10;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights s0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z10 = true;
        tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights2.change_info;
        tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights2.post_messages;
        tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights2.edit_messages;
        tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights2.delete_messages;
        tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights2.ban_users;
        tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights2.invite_users;
        tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights2.pin_messages;
        tL_chatAdminRights3.manage_ranks = tL_chatAdminRights.manage_ranks || tL_chatAdminRights2.manage_ranks;
        tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights2.add_admins;
        tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights2.manage_call;
        tL_chatAdminRights3.manage_topics = tL_chatAdminRights.manage_topics || tL_chatAdminRights2.manage_topics;
        tL_chatAdminRights3.post_stories = tL_chatAdminRights.post_stories || tL_chatAdminRights2.post_stories;
        tL_chatAdminRights3.edit_stories = tL_chatAdminRights.edit_stories || tL_chatAdminRights2.edit_stories;
        tL_chatAdminRights3.delete_stories = tL_chatAdminRights.delete_stories || tL_chatAdminRights2.delete_stories;
        tL_chatAdminRights3.manage_direct_messages = tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights2.manage_direct_messages;
        tL_chatAdminRights3.manage_welcome_messages = tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights2.manage_welcome_messages;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z10 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z10;
        return tL_chatAdminRights3;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37523y;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        Object[] objArr = 0;
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 0));
        if (this.E || (!this.A && this.f37519w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i12 = org.telegram.ui.ActionBar.g6.f23375v8;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
            zVarN.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            zVarN.k(1).setIcon(this.h);
        }
        u7 u7Var = new u7(this, context, 1);
        this.fragmentView = u7Var;
        u7Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        hh.f1 f1Var = new hh.f1(this, context, 8);
        this.f37492b = f1Var;
        f1Var.setClipChildren(i11 != 2);
        j jVar = new j(i10, objArr == true ? 1 : 0, 3);
        this.f37494c = jVar;
        jVar.E = 100;
        this.f37492b.setLayoutManager(jVar);
        hh.f1 f1Var2 = this.f37492b;
        cq cqVar = new cq(this, context);
        this.f37490a = cqVar;
        f1Var2.setAdapter(cqVar);
        f2.l lVar = new f2.l();
        if (i11 == 2) {
            this.f37492b.setResetSelectorOnChanged(false);
        }
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.n(350L);
        this.f37492b.setItemAnimator(lVar);
        this.f37492b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.f37492b, h7.z5.c(-1.0f, -1));
        this.f37492b.p1();
        this.actionBar.setAdaptiveBackground(this.f37492b);
        this.f37492b.setOnScrollListener(new m3(this, 6));
        this.f37492b.setOnItemClickListener(new cg.x0(9, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f37519w;
            if (chat == null || chatFull.f22381id != chat.f22380id) {
                return;
            }
            this.f37521x = chatFull;
            n0();
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.f37514s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 16, new Class[]{org.telegram.ui.Cells.ra.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.z5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.f23269p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 262144, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 4, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 8388608, new Class[]{org.telegram.ui.Cells.z5.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37492b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23161j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23283q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z10) {
        int i10 = this.f37523y;
        if (i10 != 2) {
            if (!(i10 == 1 ? this.N.equals(ChatObject.getBannedRightsString(this.K)) : this.P.equals(this.O))) {
                int i11 = 0;
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f37514s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new rp(this, i11));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new rp(this, 4));
                    showDialog(b2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f37501g0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.f37494c.m(i10);
            if (o8Var == null) {
                this.f37490a.m(this.f37501g0);
                return;
            }
            TLRPC.ChatFull chatFull = this.f37521x;
            if (chatFull == null || (user = this.v) == null) {
                z10 = false;
            } else {
                if ((this.f37512r ? this.f37507n : chatFull.guard_bot_id) == user.f22527id) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            o8Var.setChecked(z10);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return m0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        cq cqVar = this.f37490a;
        if (cqVar != null) {
            cqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f37519w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.f37514s, this, new b7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f37519w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f37519w;
            tL_inputChannel.channel_id = chat.f22380id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.v);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new gh.f1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 10));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.C;
        if (z10 && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z11 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z10 || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z11 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    public final void r0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq.r0(boolean):void");
    }

    public final void t0(boolean z10) {
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = z10;
        this.actionBar.getBackButton().setEnabled(!this.D);
        org.telegram.ui.Components.dr drVar = this.h;
        if (drVar != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(drVar.f27834c, this.D ? 1.0f : 0.0f);
            this.X0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new tp(this, 0));
            this.X0.addListener(new am(this, 2));
            this.X0.setDuration((long) (Math.abs(this.h.f27834c - (this.D ? 1.0f : 0.0f)) * 150.0f));
            this.X0.start();
        }
    }

    public final void u0(boolean z10) {
        int i10;
        int iMin = Math.min(this.f37509o0, this.f37510p0);
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f37491a0 = -1;
        this.f37493b0 = -1;
        this.f37495c0 = -1;
        this.f37496d0 = -1;
        this.f37498e0 = -1;
        this.f37500f0 = -1;
        this.f37501g0 = -1;
        this.f37502h0 = -1;
        this.f37505k0 = -1;
        this.f37506l0 = -1;
        this.m0 = -1;
        this.f37508n0 = -1;
        this.f37509o0 = -1;
        this.f37510p0 = -1;
        this.f37511q0 = -1;
        this.f37513r0 = -1;
        this.f37515s0 = -1;
        this.f37517u0 = -1;
        this.f37518v0 = -1;
        this.J0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.f37522x0 = -1;
        this.f37524y0 = -1;
        this.f37525z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.f37516t0 = -1;
        this.f37503i0 = -1;
        this.f37504j0 = -1;
        this.R = 3;
        boolean z11 = this.B;
        boolean z12 = this.A;
        boolean z13 = this.C;
        int i11 = this.f37523y;
        if (i11 == 0 || i11 == 2) {
            if (z11) {
                this.T = 3;
                this.f37504j0 = 4;
                this.Z = 5;
                this.R = 7;
                this.f37493b0 = 6;
            } else if (z12) {
                this.T = 3;
                this.R = 5;
                this.J0 = 4;
                if (this.K0) {
                    this.L0 = 5;
                    this.M0 = 6;
                    this.R = 8;
                    this.N0 = 7;
                }
                int i12 = this.R;
                int i13 = i12 + 1;
                this.R = i13;
                this.O0 = i12;
                if (this.P0) {
                    this.Q0 = i13;
                    this.R0 = i12 + 2;
                    this.R = i12 + 4;
                    this.S0 = i12 + 3;
                }
                int i14 = this.R;
                this.V = i14;
                this.W = i14 + 1;
                this.f37495c0 = i14 + 2;
                this.G0 = i14 + 3;
                this.Z = i14 + 4;
                this.R = i14 + 6;
                this.f37493b0 = i14 + 5;
            } else {
                if (i11 == 2) {
                    this.R = 4;
                    this.S = 3;
                }
                int i15 = this.R;
                this.T = i15;
                this.Y = i15 + 1;
                this.f37493b0 = i15 + 2;
                this.f37495c0 = i15 + 3;
                int i16 = i15 + 5;
                this.R = i16;
                this.f37496d0 = i15 + 4;
                if (i11 != 2) {
                    this.R = i15 + 6;
                    this.f37498e0 = i16;
                }
                if (ChatObject.isChannel(this.f37519w)) {
                    int i17 = this.R;
                    int i18 = i17 + 1;
                    this.R = i18;
                    this.O0 = i17;
                    if (this.P0) {
                        this.Q0 = i18;
                        this.R0 = i17 + 2;
                        this.R = i17 + 4;
                        this.S0 = i17 + 3;
                    }
                }
                int i19 = this.R;
                this.W = i19;
                this.G0 = i19 + 1;
                this.Z = i19 + 2;
                int i20 = i19 + 4;
                this.R = i20;
                this.f37491a0 = i19 + 3;
                if (z13) {
                    this.R = i19 + 5;
                    this.f37503i0 = i20;
                }
                if (this.Q) {
                    int i21 = this.R;
                    this.f37501g0 = i21;
                    this.R = i21 + 2;
                    this.f37502h0 = i21 + 1;
                }
            }
        } else if (i11 == 1) {
            this.f37517u0 = 3;
            this.R = 5;
            this.f37518v0 = 4;
            if (this.f37520w0) {
                this.f37522x0 = 5;
                this.f37524y0 = 6;
                this.A0 = 7;
                this.f37525z0 = 8;
                this.B0 = 9;
                this.C0 = 10;
                this.D0 = 11;
                this.E0 = 12;
                this.F0 = 13;
                this.R = 15;
                this.f37500f0 = 14;
            }
            int i22 = this.R;
            this.f37495c0 = i22;
            this.f37496d0 = i22 + 1;
            this.f37498e0 = i22 + 2;
            int i23 = i22 + 4;
            this.R = i23;
            this.T = i22 + 3;
            if (z13) {
                this.R = i22 + 5;
                this.f37503i0 = i23;
            }
            int i24 = this.R;
            this.H0 = i24;
            this.R = i24 + 2;
            this.I0 = i24 + 1;
        }
        int i25 = this.R;
        boolean z14 = this.E;
        TLRPC.User user = this.v;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.G) || i11 == 1))) {
                this.f37505k0 = i25;
                this.f37513r0 = i25 + 1;
                this.R = i25 + 3;
                this.f37515s0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f37519w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.f37505k0;
                        if (i26 == -1) {
                            int i27 = this.R;
                            this.R = i27 + 1;
                            this.f37509o0 = i27;
                        }
                        int i28 = this.R;
                        int i29 = i28 + 1;
                        this.R = i29;
                        this.f37510p0 = i28;
                        if (i26 != -1) {
                            this.R = i28 + 2;
                            this.f37509o0 = i29;
                        }
                    }
                }
            }
            if (this.W0) {
                if (this.f37505k0 == -1) {
                    int i30 = this.R;
                    this.R = i30 + 1;
                    this.f37505k0 = i30;
                }
                int i31 = this.R;
                this.f37506l0 = i31;
                this.R = i31 + 2;
                this.m0 = i31 + 1;
            }
        } else if (i11 != 0) {
            this.R = i25 + 1;
            this.f37505k0 = i25;
        } else if (z12 || (this.O.isEmpty() && !(this.f37519w.creator && UserObject.isUserSelf(user)))) {
            int i32 = this.R;
            this.R = i32 + 1;
            this.f37508n0 = i32;
        } else {
            int i33 = this.R;
            this.f37505k0 = i33;
            this.R = i33 + 2;
            this.f37513r0 = i33 + 1;
            if (this.f37519w.creator && UserObject.isUserSelf(user)) {
                int i34 = this.R;
                this.R = i34 + 1;
                this.f37515s0 = i34;
            } else {
                int i35 = this.R;
                this.R = i35 + 1;
                this.f37508n0 = i35;
            }
        }
        if (i11 == 2) {
            int i36 = this.R;
            this.R = i36 + 1;
            this.f37516t0 = i36;
        }
        if (z10) {
            if (iMin == -1 && (i10 = this.f37509o0) != -1) {
                this.f37490a.s(Math.min(i10, this.f37510p0), 2);
            } else {
                if (iMin == -1 || this.f37509o0 != -1) {
                    return;
                }
                this.f37490a.t(iMin, 2);
            }
        }
    }
}
