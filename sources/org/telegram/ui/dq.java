package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
public class dq extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public final int E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public final boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public float K;
    public int K0;
    public boolean L;
    public int L0;
    public final boolean M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public final TLRPC.TL_chatAdminRights O;
    public int O0;
    public TLRPC.TL_chatBannedRights P;
    public boolean P0;
    public final TLRPC.TL_chatBannedRights Q;
    public int Q0;
    public boolean R;
    public int R0;
    public final String S;
    public int S0;
    public String T;
    public int T0;
    public final String U;
    public boolean U0;
    public final boolean V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public aq Y0;
    public int Z;
    public final String Z0;
    public cq f36663a;
    public int f36664a0;
    public final boolean f36665a1;
    public ai.u1 f36666b;
    public int f36667b0;
    public final boolean f36668b1;
    public hg.a0 f36669c;
    public int f36670c0;
    public ValueAnimator f36671c1;
    public FrameLayout d;
    public int f36672d0;
    public ValueAnimator f36673d1;
    public FrameLayout e;
    public int f36674e0;
    public org.telegram.ui.Components.o6 f36675f;
    public int f36676f0;
    public int f36677g0;
    public org.telegram.ui.Components.yr h;
    public int f36678h0;
    public int f36679i0;
    public int f36680j0;
    public int f36681k0;
    public int f36682l0;
    public int m0;
    public org.telegram.ui.Components.cq f36683n;
    public int f36684n0;
    public int f36685o0;
    public int f36686p0;
    public int f36687q0;
    public long f36688r;
    public int f36689r0;
    public boolean f36690s;
    public int f36691s0;
    public int f36692t0;
    public int f36693u0;
    public long v;
    public int f36694v0;
    public final TLRPC.User f36695w;
    public int f36696w0;
    public TLRPC.Chat f36697x;
    public int f36698x0;
    public TLRPC.ChatFull f36699y;
    public int f36700y0;
    public int f36701z0;

    public dq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f7;
        boolean z15;
        boolean z16;
        TLRPC.UserFull userFull;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        TLRPC.Chat chat;
        boolean z36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        this.I = false;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.S = "";
        this.f36665a1 = z11;
        this.v = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.f36695w = user;
        this.E = i10;
        this.J = z10;
        boolean z37 = true;
        boolean z38 = !z10;
        this.U0 = z38;
        this.P0 = z38;
        this.Z0 = str2;
        this.f36697x = getMessagesController().getChat(Long.valueOf(this.v));
        this.f36699y = getMessagesController().getChatFull(this.v);
        if (user != null && user.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = z12;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = ChatObject.isCommunity(this.f36697x);
        TLRPC.Chat chat2 = this.f36697x;
        if (chat2 != null) {
            if (ChatObject.isChannel(chat2) && !this.f36697x.megagroup) {
                z36 = true;
            } else {
                z36 = false;
            }
            this.F = z36;
            this.H = ChatObject.isForum(this.f36697x);
            this.O = this.f36697x.admin_rights;
        }
        if (this.O == null) {
            if (i10 == 2 && ((chat = this.f36697x) == null || !chat.creator)) {
                z35 = false;
            } else {
                z35 = true;
            }
            this.O = o0(z35);
        }
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.Q = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    this.Q = tL_chatBannedRights3;
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
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights4;
                if (tL_chatBannedRights2 == null) {
                    tL_chatBannedRights4.view_messages = false;
                    tL_chatBannedRights4.send_media = false;
                    tL_chatBannedRights4.send_messages = false;
                    tL_chatBannedRights4.embed_links = false;
                    tL_chatBannedRights4.send_stickers = false;
                    tL_chatBannedRights4.send_gifs = false;
                    tL_chatBannedRights4.send_games = false;
                    tL_chatBannedRights4.send_inline = false;
                    tL_chatBannedRights4.send_polls = false;
                    tL_chatBannedRights4.invite_users = false;
                    tL_chatBannedRights4.change_info = false;
                    tL_chatBannedRights4.pin_messages = false;
                    tL_chatBannedRights4.manage_topics = false;
                    tL_chatBannedRights4.edit_rank = false;
                    tL_chatBannedRights4.send_reactions = false;
                } else {
                    tL_chatBannedRights4.view_messages = tL_chatBannedRights2.view_messages;
                    tL_chatBannedRights4.send_messages = tL_chatBannedRights2.send_messages;
                    tL_chatBannedRights4.send_media = tL_chatBannedRights2.send_media;
                    tL_chatBannedRights4.send_stickers = tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights4.send_gifs = tL_chatBannedRights2.send_gifs;
                    tL_chatBannedRights4.send_games = tL_chatBannedRights2.send_games;
                    tL_chatBannedRights4.send_inline = tL_chatBannedRights2.send_inline;
                    tL_chatBannedRights4.embed_links = tL_chatBannedRights2.embed_links;
                    tL_chatBannedRights4.send_polls = tL_chatBannedRights2.send_polls;
                    tL_chatBannedRights4.invite_users = tL_chatBannedRights2.invite_users;
                    tL_chatBannedRights4.change_info = tL_chatBannedRights2.change_info;
                    tL_chatBannedRights4.pin_messages = tL_chatBannedRights2.pin_messages;
                    tL_chatBannedRights4.until_date = tL_chatBannedRights2.until_date;
                    tL_chatBannedRights4.manage_topics = tL_chatBannedRights2.manage_topics;
                    tL_chatBannedRights4.send_photos = tL_chatBannedRights2.send_photos;
                    tL_chatBannedRights4.send_videos = tL_chatBannedRights2.send_videos;
                    tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                    tL_chatBannedRights4.send_audios = tL_chatBannedRights2.send_audios;
                    tL_chatBannedRights4.send_voices = tL_chatBannedRights2.send_voices;
                    tL_chatBannedRights4.send_docs = tL_chatBannedRights2.send_docs;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.P;
                    tL_chatBannedRights5.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights5.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights5.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.Q;
                if (tL_chatBannedRights6.view_messages) {
                    this.P.view_messages = true;
                }
                if (tL_chatBannedRights6.send_messages) {
                    this.P.send_messages = true;
                }
                if (tL_chatBannedRights6.send_media) {
                    this.P.send_media = true;
                }
                if (tL_chatBannedRights6.send_stickers) {
                    this.P.send_stickers = true;
                }
                if (tL_chatBannedRights6.send_gifs) {
                    this.P.send_gifs = true;
                }
                if (tL_chatBannedRights6.send_games) {
                    this.P.send_games = true;
                }
                if (tL_chatBannedRights6.send_inline) {
                    this.P.send_inline = true;
                }
                if (tL_chatBannedRights6.embed_links) {
                    this.P.embed_links = true;
                }
                if (tL_chatBannedRights6.send_polls) {
                    this.P.send_polls = true;
                }
                if (tL_chatBannedRights6.invite_users) {
                    this.P.invite_users = true;
                }
                if (tL_chatBannedRights6.change_info) {
                    this.P.change_info = true;
                }
                if (tL_chatBannedRights6.pin_messages) {
                    this.P.pin_messages = true;
                }
                if (tL_chatBannedRights6.edit_rank) {
                    this.P.edit_rank = true;
                }
                if (tL_chatBannedRights6.send_reactions) {
                    this.P.send_reactions = true;
                }
                if (tL_chatBannedRights6.manage_topics) {
                    this.P.manage_topics = true;
                }
                if (tL_chatBannedRights6.send_photos) {
                    this.P.send_photos = true;
                }
                if (tL_chatBannedRights6.send_videos) {
                    this.P.send_videos = true;
                }
                if (tL_chatBannedRights6.send_audios) {
                    this.P.send_audios = true;
                }
                if (tL_chatBannedRights6.send_docs) {
                    this.P.send_docs = true;
                }
                if (tL_chatBannedRights6.send_voices) {
                    this.P.send_voices = true;
                }
                if (tL_chatBannedRights6.send_roundvideos) {
                    this.P.send_roundvideos = true;
                }
                if (tL_chatBannedRights6.send_plain) {
                    this.P.send_plain = true;
                }
                this.S = ChatObject.getBannedRightsString(this.P);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z37 = false;
                }
                this.f36668b1 = z37;
            }
            z16 = false;
        } else {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
                if (this.F) {
                    tL_chatAdminRights2 = userFull.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = userFull.bot_group_admin_rights;
                }
                if (tL_chatAdminRights2 != null) {
                    if (tL_chatAdminRights3 == null) {
                        tL_chatAdminRights3 = tL_chatAdminRights2;
                    } else {
                        if (!tL_chatAdminRights3.ban_users && !tL_chatAdminRights2.ban_users) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights3.ban_users = z17;
                        if (!tL_chatAdminRights3.add_admins && !tL_chatAdminRights2.add_admins) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights3.add_admins = z18;
                        if (!tL_chatAdminRights3.post_messages && !tL_chatAdminRights2.post_messages) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights3.post_messages = z19;
                        if (!tL_chatAdminRights3.pin_messages && !tL_chatAdminRights2.pin_messages) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        tL_chatAdminRights3.pin_messages = z20;
                        if (!tL_chatAdminRights3.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        tL_chatAdminRights3.manage_ranks = z21;
                        if (!tL_chatAdminRights3.delete_messages && !tL_chatAdminRights2.delete_messages) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        tL_chatAdminRights3.delete_messages = z22;
                        if (!tL_chatAdminRights3.change_info && !tL_chatAdminRights2.change_info) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        tL_chatAdminRights3.change_info = z23;
                        if (!tL_chatAdminRights3.anonymous && !tL_chatAdminRights2.anonymous) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        tL_chatAdminRights3.anonymous = z24;
                        if (!tL_chatAdminRights3.edit_messages && !tL_chatAdminRights2.edit_messages) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        tL_chatAdminRights3.edit_messages = z25;
                        if (!tL_chatAdminRights3.manage_call && !tL_chatAdminRights2.manage_call) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        tL_chatAdminRights3.manage_call = z26;
                        if (!tL_chatAdminRights3.manage_topics && !tL_chatAdminRights2.manage_topics) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        tL_chatAdminRights3.manage_topics = z27;
                        if (!tL_chatAdminRights3.post_stories && !tL_chatAdminRights2.post_stories) {
                            z28 = false;
                        } else {
                            z28 = true;
                        }
                        tL_chatAdminRights3.post_stories = z28;
                        if (!tL_chatAdminRights3.edit_stories && !tL_chatAdminRights2.edit_stories) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        tL_chatAdminRights3.edit_stories = z29;
                        if (!tL_chatAdminRights3.delete_stories && !tL_chatAdminRights2.delete_stories) {
                            z30 = false;
                        } else {
                            z30 = true;
                        }
                        tL_chatAdminRights3.delete_stories = z30;
                        if (!tL_chatAdminRights3.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
                            z31 = false;
                        } else {
                            z31 = true;
                        }
                        tL_chatAdminRights3.manage_direct_messages = z31;
                        if (!tL_chatAdminRights3.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
                            z32 = false;
                        } else {
                            z32 = true;
                        }
                        tL_chatAdminRights3.manage_welcome_messages = z32;
                        if (!tL_chatAdminRights3.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
                            z33 = false;
                        } else {
                            z33 = true;
                        }
                        tL_chatAdminRights3.manage_linked_peers = z33;
                        if (!tL_chatAdminRights3.other && !tL_chatAdminRights2.other) {
                            z34 = false;
                        } else {
                            z34 = true;
                        }
                        tL_chatAdminRights3.other = z34;
                    }
                }
            }
            if (tL_chatAdminRights3 == null) {
                this.M = false;
                if (i10 == 2) {
                    this.N = o0(false);
                    boolean z39 = this.F;
                    this.L = z39;
                    this.K = z39 ? 1.0f : 0.0f;
                    this.f36668b1 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.N = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.O;
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
                    this.f36668b1 = false;
                }
            } else {
                this.M = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.N = tL_chatAdminRights6;
                boolean z40 = tL_chatAdminRights3.change_info;
                tL_chatAdminRights6.change_info = z40;
                boolean z41 = tL_chatAdminRights3.post_messages;
                tL_chatAdminRights6.post_messages = z41;
                boolean z42 = tL_chatAdminRights3.edit_messages;
                tL_chatAdminRights6.edit_messages = z42;
                boolean z43 = tL_chatAdminRights3.delete_messages;
                tL_chatAdminRights6.delete_messages = z43;
                boolean z44 = tL_chatAdminRights3.manage_call;
                tL_chatAdminRights6.manage_call = z44;
                boolean z45 = tL_chatAdminRights3.ban_users;
                tL_chatAdminRights6.ban_users = z45;
                boolean z46 = tL_chatAdminRights3.invite_users;
                tL_chatAdminRights6.invite_users = z46;
                boolean z47 = tL_chatAdminRights3.pin_messages;
                tL_chatAdminRights6.pin_messages = z47;
                boolean z48 = tL_chatAdminRights3.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z48;
                boolean z49 = tL_chatAdminRights3.manage_topics;
                tL_chatAdminRights6.manage_topics = z49;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights3.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights3.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights3.delete_stories;
                boolean z50 = tL_chatAdminRights3.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z50;
                boolean z51 = tL_chatAdminRights3.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z51;
                boolean z52 = tL_chatAdminRights3.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z52;
                boolean z53 = tL_chatAdminRights3.add_admins;
                tL_chatAdminRights6.add_admins = z53;
                boolean z54 = tL_chatAdminRights3.anonymous;
                tL_chatAdminRights6.anonymous = z54;
                boolean z55 = tL_chatAdminRights3.other;
                tL_chatAdminRights6.other = z55;
                if (!z40 && !z41 && !z50 && !z51 && !z42 && !z43 && !z45 && !z46 && !z52 && !z47 && !z48 && !z53 && !z44 && !z54 && !z49 && !z55) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f36668b1 = z13;
                if (i10 == 2) {
                    if (!this.F && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.L = z14;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    this.K = f7;
                    this.f36668b1 = false;
                }
            }
            TLRPC.Chat chat3 = this.f36697x;
            if (chat3 != null) {
                this.Q = chat3.default_banned_rights;
            }
            if (this.Q == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = new TLRPC.TL_chatBannedRights();
                this.Q = tL_chatBannedRights7;
                tL_chatBannedRights7.view_messages = false;
                tL_chatBannedRights7.send_media = false;
                tL_chatBannedRights7.send_messages = false;
                tL_chatBannedRights7.embed_links = false;
                tL_chatBannedRights7.send_stickers = false;
                tL_chatBannedRights7.send_gifs = false;
                tL_chatBannedRights7.send_games = false;
                tL_chatBannedRights7.send_inline = false;
                tL_chatBannedRights7.send_polls = false;
                tL_chatBannedRights7.invite_users = false;
                tL_chatBannedRights7.change_info = false;
                tL_chatBannedRights7.pin_messages = false;
                tL_chatBannedRights7.manage_topics = false;
                tL_chatBannedRights7.send_plain = false;
                tL_chatBannedRights7.send_videos = false;
                tL_chatBannedRights7.send_photos = false;
                tL_chatBannedRights7.send_audios = false;
                tL_chatBannedRights7.send_docs = false;
                tL_chatBannedRights7.send_voices = false;
                tL_chatBannedRights7.send_roundvideos = false;
                tL_chatBannedRights7.edit_rank = false;
                tL_chatBannedRights7.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.Q;
            if (!tL_chatBannedRights8.change_info && !this.F) {
                z15 = true;
                this.N.change_info = true;
            } else {
                z15 = true;
            }
            if (!tL_chatBannedRights8.pin_messages) {
                this.N.pin_messages = z15;
            }
            z16 = false;
        }
        u0(z16);
    }

    public static void U(dq dqVar, long j10) {
        if (j10 != 0) {
            dqVar.v = j10;
            dqVar.f36697x = MessagesController.getInstance(dqVar.currentAccount).getChat(Long.valueOf(j10));
            dqVar.r0(true);
        }
    }

    public static void V(dq dqVar, org.telegram.ui.ActionBar.b3 b3Var, View view) {
        Runnable runnable;
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(dqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                                        final dq dqVar2 = dq.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i10, i11, i12);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(dqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                                    dq dqVar3 = dq.this;
                                                    dqVar3.P.until_date = (i14 * 60) + (i13 * 3600) + time;
                                                    dqVar3.f36663a.m(dqVar3.N0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                            dqVar2.showDialog(timePickerDialog);
                                        } catch (Exception e) {
                                            FileLog.e(e);
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
                                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new yp(0, datePicker));
                                dqVar.showDialog(datePickerDialog);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    } else {
                        dqVar.P.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 2592000;
                        dqVar.f36663a.m(dqVar.N0);
                    }
                } else {
                    dqVar.P.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 604800;
                    dqVar.f36663a.m(dqVar.N0);
                }
            } else {
                dqVar.P.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 86400;
                dqVar.f36663a.m(dqVar.N0);
            }
        } else {
            dqVar.P.until_date = 0;
            dqVar.f36663a.m(dqVar.N0);
        }
        runnable = b3Var.f20729a.dismissRunnable;
        runnable.run();
    }

    public static boolean W(dq dqVar, TLRPC.TL_error tL_error) {
        dqVar.t0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!ChatObject.isChannel(dqVar.f36697x)) {
                sg.j0 j0Var = new sg.j0(11, dqVar.currentAccount, dqVar.getParentActivity(), dqVar, dqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(dqVar.f36695w);
                j0Var.M1(dqVar.f36697x, arrayList, null, null, null);
                j0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void X(org.telegram.ui.dq r23, android.content.Context r24, android.view.View r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq.X(org.telegram.ui.dq, android.content.Context, android.view.View, int):void");
    }

    public static void Y(dq dqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        boolean z10 = dqVar.F;
        TLRPC.User user = dqVar.f36695w;
        if (tL_error != null) {
            if (dqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar.getParentActivity());
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        if (z10) {
                            c2Var.R = LocaleController.getString(R.string.EditAdminChannelTransfer);
                        } else {
                            c2Var.R = LocaleController.getString(R.string.EditAdminGroupTransfer);
                        }
                        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, dqVar.f36697x.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new sp(dqVar, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        dqVar.showDialog(c2Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(dqVar.currentAccount).sendRequest(new TL_account.getPassword(), new vc(9, dqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (dqVar.getParentActivity() != null && !AccountInstance.getInstance(dqVar.currentAccount).getUserConfig().isPremium()) {
                            dqVar.showDialog(new sg.j0(5, dqVar.currentAccount, dqVar.getParentActivity(), dqVar, null));
                        } else {
                            dqVar.presentFragment(new ld1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.d5.g0(tL_error, dqVar, z10, dqVar.G, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dqVar.getParentActivity());
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                    c2Var2.R = string;
                    LinearLayout linearLayout = new LinearLayout(dqVar.getParentActivity());
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(dqVar.getParentActivity());
                    int i17 = org.telegram.ui.ActionBar.k6.f21290j5;
                    org.telegram.ui.ActionBar.r6.W(textView, i17, null);
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (z10) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
                    } else {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
                    }
                    linearLayout.addView(textView, w7.z5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(dqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(dqVar.getParentActivity());
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i11, dp3, dp, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.t(imageView, i17, null, mode);
                    TextView textView2 = new TextView(dqVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.W(textView2, i17, null);
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(dqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(dqVar.getParentActivity());
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i13 = AndroidUtilities.dp(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i13, dp4, dp2, 0);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i17, null, mode);
                    TextView textView3 = new TextView(dqVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.W(textView3, i17, null);
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.v0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
                        linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new sp(dqVar, 6));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(dqVar.getParentActivity());
                        org.telegram.ui.ActionBar.r6.W(textView4, i17, null);
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    }
                    dqVar.showDialog(c2Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            dqVar.Y0.a(user);
            dqVar.removeSelfFromStack();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Z(dq dqVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = dqVar.f36699y;
        if (chatFull != null) {
            j11 = chatFull.guard_bot_id;
        } else {
            j11 = 0;
        }
        if (j11 != 0) {
            user = dqVar.getMessagesController().getUser(Long.valueOf(j11));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j10 != 0 && user2.f20491id != j10) {
            new org.telegram.ui.Components.d40(dqVar.getParentActivity(), dqVar.resourceProvider, user2, dqVar.f36695w, new tp(dqVar, j10, 0)).show();
            return;
        }
        dqVar.f36688r = j10;
        dqVar.f36690s = true;
        dqVar.n0();
    }

    public static void a0(dq dqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            dqVar.v = j10;
            dqVar.f36697x = MessagesController.getInstance(dqVar.currentAccount).getChat(Long.valueOf(j10));
            dqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(dq dqVar, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.l4) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            String str = dqVar.T;
            if (str != null) {
                i10 = str.codePointCount(0, str.length());
            } else {
                i10 = 0;
            }
            int i12 = 16 - i10;
            if (i12 <= 4.8f) {
                l4Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.n5 textView2 = l4Var.getTextView2();
                if (i12 < 0) {
                    i11 = org.telegram.ui.ActionBar.k6.f21405p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.A6;
                }
                org.telegram.ui.ActionBar.r6.Z(textView2, i11, null);
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            l4Var.setText2("");
        }
    }

    public static boolean l0(dq dqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.Q;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z26 = true;
        if (!tL_chatAdminRights.change_info && !tL_chatAdminRights2.change_info) {
            z10 = false;
        } else {
            z10 = true;
        }
        tL_chatAdminRights3.change_info = z10;
        if (!tL_chatAdminRights.post_messages && !tL_chatAdminRights2.post_messages) {
            z11 = false;
        } else {
            z11 = true;
        }
        tL_chatAdminRights3.post_messages = z11;
        if (!tL_chatAdminRights.edit_messages && !tL_chatAdminRights2.edit_messages) {
            z12 = false;
        } else {
            z12 = true;
        }
        tL_chatAdminRights3.edit_messages = z12;
        if (!tL_chatAdminRights.delete_messages && !tL_chatAdminRights2.delete_messages) {
            z13 = false;
        } else {
            z13 = true;
        }
        tL_chatAdminRights3.delete_messages = z13;
        if (!tL_chatAdminRights.ban_users && !tL_chatAdminRights2.ban_users) {
            z14 = false;
        } else {
            z14 = true;
        }
        tL_chatAdminRights3.ban_users = z14;
        if (!tL_chatAdminRights.invite_users && !tL_chatAdminRights2.invite_users) {
            z15 = false;
        } else {
            z15 = true;
        }
        tL_chatAdminRights3.invite_users = z15;
        if (!tL_chatAdminRights.pin_messages && !tL_chatAdminRights2.pin_messages) {
            z16 = false;
        } else {
            z16 = true;
        }
        tL_chatAdminRights3.pin_messages = z16;
        if (!tL_chatAdminRights.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
            z17 = false;
        } else {
            z17 = true;
        }
        tL_chatAdminRights3.manage_ranks = z17;
        if (!tL_chatAdminRights.add_admins && !tL_chatAdminRights2.add_admins) {
            z18 = false;
        } else {
            z18 = true;
        }
        tL_chatAdminRights3.add_admins = z18;
        if (!tL_chatAdminRights.manage_call && !tL_chatAdminRights2.manage_call) {
            z19 = false;
        } else {
            z19 = true;
        }
        tL_chatAdminRights3.manage_call = z19;
        if (!tL_chatAdminRights.manage_topics && !tL_chatAdminRights2.manage_topics) {
            z20 = false;
        } else {
            z20 = true;
        }
        tL_chatAdminRights3.manage_topics = z20;
        if (!tL_chatAdminRights.post_stories && !tL_chatAdminRights2.post_stories) {
            z21 = false;
        } else {
            z21 = true;
        }
        tL_chatAdminRights3.post_stories = z21;
        if (!tL_chatAdminRights.edit_stories && !tL_chatAdminRights2.edit_stories) {
            z22 = false;
        } else {
            z22 = true;
        }
        tL_chatAdminRights3.edit_stories = z22;
        if (!tL_chatAdminRights.delete_stories && !tL_chatAdminRights2.delete_stories) {
            z23 = false;
        } else {
            z23 = true;
        }
        tL_chatAdminRights3.delete_stories = z23;
        if (!tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
            z24 = false;
        } else {
            z24 = true;
        }
        tL_chatAdminRights3.manage_direct_messages = z24;
        if (!tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
            z25 = false;
        } else {
            z25 = true;
        }
        tL_chatAdminRights3.manage_welcome_messages = z25;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z26 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z26;
        return tL_chatAdminRights3;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21405p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.E;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 7));
        if (this.J || (!this.F && this.f36697x.creator && UserObject.isUserSelf(this.f36695w))) {
            org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.f21519v8;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            this.f36683n = cqVar;
            this.h = new org.telegram.ui.Components.yr(mutate, cqVar);
            m10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            m10.k(1).setIcon(this.h);
            if (m10.k(1) != null) {
                org.telegram.ui.ActionBar.r6.z(m10.k(1), mutate, i12, null, mode);
            }
        }
        x7 x7Var = new x7(this, context, 1);
        this.fragmentView = x7Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, x7Var, null);
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        ai.u1 u1Var = new ai.u1(this, context, 9);
        this.f36666b = u1Var;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1Var.setClipChildren(z10);
        hg.a0 a0Var = new hg.a0(1, false, 5);
        this.f36669c = a0Var;
        a0Var.E = 100;
        this.f36666b.setLayoutManager(a0Var);
        ai.u1 u1Var2 = this.f36666b;
        cq cqVar2 = new cq(this, context);
        this.f36663a = cqVar2;
        u1Var2.setAdapter(cqVar2);
        s4.k kVar = new s4.k();
        if (i11 == 2) {
            this.f36666b.setResetSelectorOnChanged(false);
        }
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.zr.h);
        kVar.n(350L);
        this.f36666b.setItemAnimator(kVar);
        ai.u1 u1Var3 = this.f36666b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        u1Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f36666b, w7.z5.c(-1.0f, -1));
        this.f36666b.t1();
        this.actionBar.setAdaptiveBackground(this.f36666b);
        this.f36666b.setOnScrollListener(new j3(this, 6));
        this.f36666b.setOnItemClickListener(new ci.x4(7, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f36697x;
            if (chat != null && chatFull.f20345id == chat.f20344id) {
                this.f36699y = chatFull;
                n0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.v) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                if (h5Var != null && h5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36666b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36666b, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36666b, 262144, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21405p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36666b, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21572y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36666b, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21421q5));
        return arrayList;
    }

    public final boolean m0(boolean z10) {
        boolean equals;
        int i10 = this.E;
        if (i10 != 2) {
            if (i10 == 1) {
                equals = this.S.equals(ChatObject.getBannedRightsString(this.P));
            } else {
                equals = this.U.equals(this.T);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.R = string;
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.v)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new sp(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new sp(this, 4));
                    showDialog(c2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        boolean z10;
        TLRPC.User user;
        long j10;
        int i10 = this.f36682l0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) this.f36669c.m(i10);
            if (v8Var != null) {
                TLRPC.ChatFull chatFull = this.f36699y;
                if (chatFull != null && (user = this.f36695w) != null) {
                    if (this.f36690s) {
                        j10 = this.f36688r;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f20491id) {
                        z10 = true;
                        v8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                v8Var.setChecked(z10);
                return;
            }
            this.f36663a.m(this.f36682l0);
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
        cq cqVar = this.f36663a;
        if (cqVar != null) {
            cqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.cq cqVar = this.f36683n;
            if (cqVar != null) {
                cqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21519v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f36697x)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.v, this, new e7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f36697x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f36697x;
            tL_inputChannel.channel_id = chat.f20344id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        if (inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.f36695w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new ai.k2(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 11));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.H;
        if (!z10 || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || ((z11 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous)) {
            if (!z10 && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks) {
                if ((!z11 || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void r0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq.r0(boolean):void");
    }

    public final void t0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f36671c1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = z10;
        this.actionBar.getBackButton().setEnabled(!this.I);
        org.telegram.ui.Components.yr yrVar = this.h;
        if (yrVar != null) {
            float f10 = yrVar.f33027c;
            if (this.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f36671c1 = ofFloat;
            ofFloat.addUpdateListener(new up(this, 0));
            this.f36671c1.addListener(new m.a(this, 29));
            this.f36671c1.setDuration(Math.abs(this.h.f33027c - (this.I ? 1.0f : 0.0f)) * 150.0f);
            this.f36671c1.start();
        }
    }

    public final void u0(boolean z10) {
        int i10;
        int min = Math.min(this.f36692t0, this.f36693u0);
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f36664a0 = -1;
        this.f36667b0 = -1;
        this.f36670c0 = -1;
        this.f36672d0 = -1;
        this.f36674e0 = -1;
        this.f36676f0 = -1;
        this.f36677g0 = -1;
        this.f36678h0 = -1;
        this.f36679i0 = -1;
        this.f36680j0 = -1;
        this.f36681k0 = -1;
        this.f36682l0 = -1;
        this.m0 = -1;
        this.f36686p0 = -1;
        this.f36687q0 = -1;
        this.f36689r0 = -1;
        this.f36691s0 = -1;
        this.f36692t0 = -1;
        this.f36693u0 = -1;
        this.f36694v0 = -1;
        this.f36696w0 = -1;
        this.f36698x0 = -1;
        this.f36701z0 = -1;
        this.A0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.f36700y0 = -1;
        this.f36684n0 = -1;
        this.f36685o0 = -1;
        this.W = 3;
        boolean z11 = this.G;
        boolean z12 = this.F;
        boolean z13 = this.H;
        int i11 = this.E;
        if (i11 != 0 && i11 != 2) {
            if (i11 == 1) {
                this.f36701z0 = 3;
                this.W = 5;
                this.A0 = 4;
                if (this.B0) {
                    this.C0 = 5;
                    this.D0 = 6;
                    this.F0 = 7;
                    this.E0 = 8;
                    this.G0 = 9;
                    this.H0 = 10;
                    this.I0 = 11;
                    this.J0 = 12;
                    this.K0 = 13;
                    this.W = 15;
                    this.f36681k0 = 14;
                }
                int i12 = this.W;
                this.f36678h0 = i12;
                this.f36679i0 = i12 + 1;
                this.f36680j0 = i12 + 2;
                int i13 = i12 + 4;
                this.W = i13;
                this.Y = i12 + 3;
                if (z13) {
                    this.W = i12 + 5;
                    this.f36684n0 = i13;
                }
                int i14 = this.W;
                this.M0 = i14;
                this.W = i14 + 2;
                this.N0 = i14 + 1;
            }
        } else if (z11) {
            this.Y = 3;
            this.f36685o0 = 4;
            this.f36674e0 = 5;
            this.W = 7;
            this.f36677g0 = 6;
        } else if (z12) {
            this.Y = 3;
            this.W = 5;
            this.O0 = 4;
            if (this.P0) {
                this.Q0 = 5;
                this.R0 = 6;
                this.W = 8;
                this.S0 = 7;
            }
            int i15 = this.W;
            int i16 = i15 + 1;
            this.W = i16;
            this.T0 = i15;
            if (this.U0) {
                this.V0 = i16;
                this.W0 = i15 + 2;
                this.W = i15 + 4;
                this.X0 = i15 + 3;
            }
            int i17 = this.W;
            this.f36664a0 = i17;
            this.f36667b0 = i17 + 1;
            this.f36678h0 = i17 + 2;
            this.L0 = i17 + 3;
            this.f36674e0 = i17 + 4;
            this.W = i17 + 6;
            this.f36677g0 = i17 + 5;
        } else {
            if (i11 == 2) {
                this.W = 4;
                this.X = 3;
            }
            int i18 = this.W;
            this.Y = i18;
            this.f36672d0 = i18 + 1;
            this.f36677g0 = i18 + 2;
            this.f36678h0 = i18 + 3;
            int i19 = i18 + 5;
            this.W = i19;
            this.f36679i0 = i18 + 4;
            if (i11 != 2) {
                this.W = i18 + 6;
                this.f36680j0 = i19;
            }
            if (ChatObject.isChannel(this.f36697x)) {
                int i20 = this.W;
                int i21 = i20 + 1;
                this.W = i21;
                this.T0 = i20;
                if (this.U0) {
                    this.V0 = i21;
                    this.W0 = i20 + 2;
                    this.W = i20 + 4;
                    this.X0 = i20 + 3;
                }
            }
            int i22 = this.W;
            this.f36667b0 = i22;
            this.L0 = i22 + 1;
            this.f36674e0 = i22 + 2;
            int i23 = i22 + 4;
            this.W = i23;
            this.f36676f0 = i22 + 3;
            if (z13) {
                this.W = i22 + 5;
                this.f36684n0 = i23;
            }
            if (this.V) {
                int i24 = this.W;
                this.f36682l0 = i24;
                this.W = i24 + 2;
                this.m0 = i24 + 1;
            }
        }
        boolean z14 = this.J;
        TLRPC.User user = this.f36695w;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.L) || i11 == 1))) {
                int i25 = this.W;
                this.f36686p0 = i25;
                this.f36696w0 = i25 + 1;
                this.W = i25 + 3;
                this.f36698x0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f36697x;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.f36686p0;
                        if (i26 == -1) {
                            int i27 = this.W;
                            this.W = i27 + 1;
                            this.f36692t0 = i27;
                        }
                        int i28 = this.W;
                        int i29 = i28 + 1;
                        this.W = i29;
                        this.f36693u0 = i28;
                        if (i26 != -1) {
                            this.W = i28 + 2;
                            this.f36692t0 = i29;
                        }
                    }
                }
            }
            if (this.f36668b1) {
                if (this.f36686p0 == -1) {
                    int i30 = this.W;
                    this.W = i30 + 1;
                    this.f36686p0 = i30;
                }
                int i31 = this.W;
                this.f36687q0 = i31;
                this.W = i31 + 2;
                this.f36689r0 = i31 + 1;
            }
        } else if (i11 == 0) {
            if (!z12 && (!this.T.isEmpty() || (this.f36697x.creator && UserObject.isUserSelf(user)))) {
                int i32 = this.W;
                this.f36686p0 = i32;
                this.W = i32 + 2;
                this.f36696w0 = i32 + 1;
                if (this.f36697x.creator && UserObject.isUserSelf(user)) {
                    int i33 = this.W;
                    this.W = i33 + 1;
                    this.f36698x0 = i33;
                } else {
                    int i34 = this.W;
                    this.W = i34 + 1;
                    this.f36691s0 = i34;
                }
            } else {
                int i35 = this.W;
                this.W = i35 + 1;
                this.f36691s0 = i35;
            }
        } else {
            int i36 = this.W;
            this.W = i36 + 1;
            this.f36686p0 = i36;
        }
        if (i11 == 2) {
            int i37 = this.W;
            this.W = i37 + 1;
            this.f36700y0 = i37;
        }
        if (z10) {
            if (min == -1 && (i10 = this.f36692t0) != -1) {
                this.f36663a.s(Math.min(i10, this.f36693u0), 2);
            } else if (min != -1 && this.f36692t0 == -1) {
                this.f36663a.t(min, 2);
            }
        }
    }
}
