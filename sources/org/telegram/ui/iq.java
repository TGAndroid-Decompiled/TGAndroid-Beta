package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class iq extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public boolean A0;
    public int B0;
    public int C0;
    public final int D;
    public int D0;
    public final boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public float J;
    public int J0;
    public boolean K;
    public int K0;
    public final boolean L;
    public int L0;
    public final TLRPC.TL_chatAdminRights M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public TLRPC.TL_chatBannedRights O;
    public boolean O0;
    public final TLRPC.TL_chatBannedRights P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final String R;
    public int R0;
    public String S;
    public int S0;
    public final String T;
    public boolean T0;
    public final boolean U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public fq X0;
    public int Y;
    public final String Y0;
    public int Z;
    public final boolean Z0;
    public hq f38119a;
    public int f38120a0;
    public final boolean f38121a1;
    public ag.b1 f38122b;
    public int f38123b0;
    public ValueAnimator f38124b1;
    public dh.f f38125c;
    public int f38126c0;
    public FrameLayout d;
    public int f38127d0;
    public FrameLayout e;
    public int f38128e0;
    public org.telegram.ui.Components.f6 f38129f;
    public int f38130f0;
    public int f38131g0;
    public org.telegram.ui.ActionBar.l5 h;
    public int f38132h0;
    public int f38133i0;
    public int f38134j0;
    public int f38135k0;
    public int f38136l0;
    public int m0;
    public long f38137n;
    public int f38138n0;
    public int f38139o0;
    public int f38140p0;
    public int f38141q0;
    public boolean f38142r;
    public int f38143r0;
    public long f38144s;
    public int f38145s0;
    public int f38146t0;
    public int f38147u0;
    public int f38148v0;
    public final TLRPC.User f38149w;
    public int f38150w0;
    public TLRPC.Chat f38151x;
    public int f38152x0;
    public TLRPC.ChatFull f38153y;
    public int f38154y0;
    public int f38155z0;

    public iq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f7;
        boolean z15;
        boolean z16;
        TLRPC.UserFull a2;
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
        this.H = false;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.R = "";
        this.Z0 = z11;
        this.f38144s = j11;
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(j10));
        this.f38149w = Z1;
        this.D = i10;
        this.I = z10;
        boolean z37 = true;
        boolean z38 = !z10;
        this.T0 = z38;
        this.O0 = z38;
        this.Y0 = str2;
        this.f38151x = getMessagesController().L0(Long.valueOf(this.f38144s));
        this.f38153y = getMessagesController().M0(this.f38144s);
        if (Z1 != null && Z1.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.U = z12;
        String str3 = str != null ? str : "";
        this.S = str3;
        this.T = str3;
        this.F = org.telegram.messenger.w3.Y(this.f38151x);
        TLRPC.Chat chat2 = this.f38151x;
        if (chat2 != null) {
            if (org.telegram.messenger.w3.T(chat2) && !this.f38151x.megagroup) {
                z36 = true;
            } else {
                z36 = false;
            }
            this.E = z36;
            this.G = org.telegram.messenger.w3.c0(this.f38151x);
            this.N = this.f38151x.admin_rights;
        }
        if (this.N == null) {
            if (i10 == 2 && ((chat = this.f38151x) == null || !chat.creator)) {
                z35 = false;
            } else {
                z35 = true;
            }
            this.N = t0(z35);
        }
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.P = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    this.P = tL_chatBannedRights3;
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
                this.O = tL_chatBannedRights4;
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
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.O;
                    tL_chatBannedRights5.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights5.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights5.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.P;
                if (tL_chatBannedRights6.view_messages) {
                    this.O.view_messages = true;
                }
                if (tL_chatBannedRights6.send_messages) {
                    this.O.send_messages = true;
                }
                if (tL_chatBannedRights6.send_media) {
                    this.O.send_media = true;
                }
                if (tL_chatBannedRights6.send_stickers) {
                    this.O.send_stickers = true;
                }
                if (tL_chatBannedRights6.send_gifs) {
                    this.O.send_gifs = true;
                }
                if (tL_chatBannedRights6.send_games) {
                    this.O.send_games = true;
                }
                if (tL_chatBannedRights6.send_inline) {
                    this.O.send_inline = true;
                }
                if (tL_chatBannedRights6.embed_links) {
                    this.O.embed_links = true;
                }
                if (tL_chatBannedRights6.send_polls) {
                    this.O.send_polls = true;
                }
                if (tL_chatBannedRights6.invite_users) {
                    this.O.invite_users = true;
                }
                if (tL_chatBannedRights6.change_info) {
                    this.O.change_info = true;
                }
                if (tL_chatBannedRights6.pin_messages) {
                    this.O.pin_messages = true;
                }
                if (tL_chatBannedRights6.edit_rank) {
                    this.O.edit_rank = true;
                }
                if (tL_chatBannedRights6.send_reactions) {
                    this.O.send_reactions = true;
                }
                if (tL_chatBannedRights6.manage_topics) {
                    this.O.manage_topics = true;
                }
                if (tL_chatBannedRights6.send_photos) {
                    this.O.send_photos = true;
                }
                if (tL_chatBannedRights6.send_videos) {
                    this.O.send_videos = true;
                }
                if (tL_chatBannedRights6.send_audios) {
                    this.O.send_audios = true;
                }
                if (tL_chatBannedRights6.send_docs) {
                    this.O.send_docs = true;
                }
                if (tL_chatBannedRights6.send_voices) {
                    this.O.send_voices = true;
                }
                if (tL_chatBannedRights6.send_roundvideos) {
                    this.O.send_roundvideos = true;
                }
                if (tL_chatBannedRights6.send_plain) {
                    this.O.send_plain = true;
                }
                this.R = org.telegram.messenger.w3.D(this.O);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z37 = false;
                }
                this.f38121a1 = z37;
            }
            z16 = false;
        } else {
            if (i10 == 2 && (a2 = getMessagesController().a2(j10)) != null) {
                if (this.E) {
                    tL_chatAdminRights2 = a2.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = a2.bot_group_admin_rights;
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
                this.L = false;
                if (i10 == 2) {
                    this.M = t0(false);
                    boolean z39 = this.E;
                    this.K = z39;
                    this.J = z39 ? 1.0f : 0.0f;
                    this.f38121a1 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.M = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.N;
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
                    this.f38121a1 = false;
                }
            } else {
                this.L = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.M = tL_chatAdminRights6;
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
                this.f38121a1 = z13;
                if (i10 == 2) {
                    if (!this.E && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.K = z14;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    this.J = f7;
                    this.f38121a1 = false;
                }
            }
            TLRPC.Chat chat3 = this.f38151x;
            if (chat3 != null) {
                this.P = chat3.default_banned_rights;
            }
            if (this.P == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights7;
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
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.P;
            if (!tL_chatBannedRights8.change_info && !this.E) {
                z15 = true;
                this.M.change_info = true;
            } else {
                z15 = true;
            }
            if (!tL_chatBannedRights8.pin_messages) {
                this.M.pin_messages = z15;
            }
            z16 = false;
        }
        z0(z16);
    }

    public static void Z(iq iqVar, long j10) {
        if (j10 != 0) {
            iqVar.f38144s = j10;
            iqVar.f38151x = org.telegram.messenger.wp.r1(iqVar.currentAccount).L0(Long.valueOf(j10));
            iqVar.w0(true);
        }
    }

    public static void a0(iq iqVar, l2.f fVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(iqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                                        final iq iqVar2 = iq.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i10, i11, i12);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(iqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                                    iq iqVar3 = iq.this;
                                                    iqVar3.O.until_date = (i14 * 60) + (i13 * 3600) + time;
                                                    iqVar3.f38119a.g(iqVar3.M0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, org.telegram.messenger.dd.L0(2131745567, null), timePickerDialog);
                                            timePickerDialog.setButton(-2, org.telegram.messenger.dd.L0(2131752589, null), (DialogInterface.OnClickListener) new Object());
                                            iqVar2.showDialog(timePickerDialog);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
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
                                datePickerDialog.setButton(-1, org.telegram.messenger.dd.L0(2131745567, null), datePickerDialog);
                                datePickerDialog.setButton(-2, org.telegram.messenger.dd.L0(2131752589, null), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new dq(0, datePicker));
                                iqVar.showDialog(datePickerDialog);
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                        }
                    } else {
                        iqVar.O.until_date = ConnectionsManager.getInstance(iqVar.currentAccount).getCurrentTime() + 2592000;
                        iqVar.f38119a.g(iqVar.M0);
                    }
                } else {
                    iqVar.O.until_date = ConnectionsManager.getInstance(iqVar.currentAccount).getCurrentTime() + 604800;
                    iqVar.f38119a.g(iqVar.M0);
                }
            } else {
                iqVar.O.until_date = ConnectionsManager.getInstance(iqVar.currentAccount).getCurrentTime() + 86400;
                iqVar.f38119a.g(iqVar.M0);
            }
        } else {
            iqVar.O.until_date = 0;
            iqVar.f38119a.g(iqVar.M0);
        }
        ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21622x0.run();
    }

    public static boolean b0(iq iqVar, TLRPC.TL_error tL_error) {
        iqVar.y0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!org.telegram.messenger.w3.T(iqVar.f38151x)) {
                kg.q0 q0Var = new kg.q0(11, iqVar.currentAccount, iqVar.getParentActivity(), iqVar, iqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(iqVar.f38149w);
                q0Var.C1(iqVar.f38151x, arrayList, null, null, null);
                q0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void c0(org.telegram.ui.iq r25, android.content.Context r26, android.view.View r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iq.c0(org.telegram.ui.iq, android.content.Context, android.view.View, int):void");
    }

    public static void d0(iq iqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        int L2;
        int i14;
        int i15;
        int i16;
        boolean z10 = iqVar.E;
        TLRPC.User user = iqVar.f38149w;
        if (tL_error != null) {
            if (iqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar.getParentActivity());
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        if (z10) {
                            x1Var.R = org.telegram.messenger.dd.L0(2131751323, null);
                        } else {
                            x1Var.R = org.telegram.messenger.dd.L0(2131751316, null);
                        }
                        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131751294, iqVar.f38151x.title, org.telegram.messenger.i20.j(user, true)));
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751297, null), new yp(iqVar, 5));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        iqVar.showDialog(x1Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(iqVar.currentAccount).sendRequest(new TL_account.getPassword(), new ag.k0(22, iqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (iqVar.getParentActivity() != null && !org.telegram.messenger.e20.i(org.telegram.messenger.c.a(iqVar.currentAccount).f15043a).q()) {
                            iqVar.showDialog(new kg.q0(5, iqVar.currentAccount, iqVar.getParentActivity(), iqVar, null));
                        } else {
                            iqVar.presentFragment(new ca1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.s4.g0(tL_error, iqVar, z10, iqVar.F, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(iqVar.getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131751298, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.R = L0;
                    LinearLayout linearLayout = new LinearLayout(iqVar.getParentActivity());
                    linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(iqVar.getParentActivity());
                    int i17 = org.telegram.ui.ActionBar.t6.f21038j5;
                    org.telegram.ui.ActionBar.a7.V(textView, i17, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.dd.X) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (z10) {
                        org.telegram.messenger.m5.q("EditChannelAdminTransferAlertText", null, 2131751284, new Object[]{org.telegram.messenger.i20.j(user, true)}, textView);
                    } else {
                        org.telegram.messenger.m5.q("EditAdminTransferAlertText", null, 2131751302, new Object[]{org.telegram.messenger.i20.j(user, true)}, textView);
                    }
                    linearLayout.addView(textView, w7.b6.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(iqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(iqVar.getParentActivity());
                    imageView.setImageResource(2131231624);
                    if (org.telegram.messenger.dd.X) {
                        i11 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int L3 = org.telegram.messenger.i0.L(9.0f);
                    if (org.telegram.messenger.dd.X) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.i0.L(11.0f);
                    }
                    imageView.setPadding(i11, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.a7.t(imageView, i17, null, mode);
                    TextView textView2 = new TextView(iqVar.getParentActivity());
                    org.telegram.ui.ActionBar.a7.V(textView2, i17, null);
                    textView2.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.dd.X) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131751301, null)));
                    if (org.telegram.messenger.dd.X) {
                        linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                        linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                        linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(iqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(iqVar.getParentActivity());
                    imageView2.setImageResource(2131231624);
                    if (org.telegram.messenger.dd.X) {
                        i13 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int L4 = org.telegram.messenger.i0.L(9.0f);
                    if (org.telegram.messenger.dd.X) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.i0.L(11.0f);
                    }
                    imageView2.setPadding(i13, L4, L2, 0);
                    org.telegram.ui.ActionBar.a7.t(imageView2, i17, null, mode);
                    TextView textView3 = new TextView(iqVar.getParentActivity());
                    org.telegram.ui.ActionBar.a7.V(textView3, i17, null);
                    textView3.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.dd.X) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    textView3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131751300, null)));
                    if (org.telegram.messenger.dd.X) {
                        linearLayout3.addView(textView3, w7.b6.o(-1, -2));
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
                    } else {
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
                        linearLayout3.addView(textView3, w7.b6.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131751292, null), new yp(iqVar, 6));
                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(iqVar.getParentActivity());
                        org.telegram.ui.ActionBar.a7.V(textView4, i17, null);
                        textView4.setTextSize(1, 16.0f);
                        if (org.telegram.messenger.dd.X) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        org.telegram.messenger.m5.l(textView4, i16 | 48, null, 2131751299);
                        linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131747847, null), null);
                    }
                    iqVar.showDialog(x1Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            iqVar.X0.a(user);
            iqVar.removeSelfFromStack();
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void e0(iq iqVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = iqVar.f38153y;
        if (chatFull != null) {
            j11 = chatFull.guard_bot_id;
        } else {
            j11 = 0;
        }
        if (j11 != 0) {
            user = iqVar.getMessagesController().Z1(Long.valueOf(j11));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j10 != 0 && user2.f19943id != j10) {
            new org.telegram.ui.Components.e30(iqVar.getParentActivity(), iqVar.resourceProvider, user2, iqVar.f38149w, new zp(iqVar, j10, 0)).show();
            return;
        }
        iqVar.f38137n = j10;
        iqVar.f38142r = true;
        iqVar.s0();
    }

    public static void f0(iq iqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            iqVar.f38144s = j10;
            iqVar.f38151x = org.telegram.messenger.wp.r1(iqVar.currentAccount).L0(Long.valueOf(j10));
            iqVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(iq iqVar, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.p4) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            String str = iqVar.S;
            if (str != null) {
                i10 = str.codePointCount(0, str.length());
            } else {
                i10 = 0;
            }
            int i12 = 16 - i10;
            if (i12 <= 4.8f) {
                p4Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.u5 textView2 = p4Var.getTextView2();
                if (i12 < 0) {
                    i11 = org.telegram.ui.ActionBar.t6.f21154p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.A6;
                }
                org.telegram.ui.ActionBar.a7.Y(textView2, i11, null);
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            p4Var.setText2("");
        }
    }

    public static boolean q0(iq iqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = iqVar.P;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_chatAdminRights t0(boolean z10) {
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

    public static TLRPC.TL_chatAdminRights x0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = 2;
        int i11 = this.D;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751333, null));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131754463, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131743753, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 29));
        if (this.I || (!this.E && this.f38151x.creator && org.telegram.messenger.i20.B(this.f38149w))) {
            this.h = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setFocusableInTouchMode(true);
        ag.b1 b1Var = new ag.b1(this, context, 6);
        this.f38122b = b1Var;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.setClipChildren(z10);
        dh.f fVar = new dh.f(1, false, 4);
        this.f38125c = fVar;
        fVar.E = 100;
        this.f38122b.setLayoutManager(fVar);
        ag.b1 b1Var2 = this.f38122b;
        hq hqVar = new hq(this, context);
        this.f38119a = hqVar;
        b1Var2.setAdapter(hqVar);
        s4.j jVar = new s4.j();
        if (i11 == 2) {
            this.f38122b.setResetSelectorOnChanged(false);
        }
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.f38122b.setItemAnimator(jVar);
        ag.b1 b1Var3 = this.f38122b;
        if (org.telegram.messenger.dd.X) {
            i10 = 1;
        }
        b1Var3.setVerticalScrollbarPosition(i10);
        w7Var.addView(this.f38122b, w7.b6.c(-1.0f, -1));
        this.f38122b.r1();
        this.f38122b.setOnScrollListener(new h3(this, 7));
        this.f38122b.setSectionsDrawBackground(true);
        this.f38122b.setOnItemClickListener(new mg.q0(6, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f38151x;
            if (chat != null && chatFull.f19795id == chat.f19794id) {
                this.f38153y = chatFull;
                s0();
            }
        } else if (i10 == org.telegram.messenger.at.f14822y1) {
            if ((-this.f38144s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var != null && z4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f38122b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38122b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38122b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38122b, 262144, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38122b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21312y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38122b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21170q5));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return r0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.f14822y1);
        getNotificationCenter().c(this, org.telegram.messenger.at.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
        getNotificationCenter().n(this, org.telegram.messenger.at.T);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        hq hqVar = this.f38119a;
        if (hqVar != null) {
            hqVar.f();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final boolean r0(boolean z10) {
        boolean equals;
        int i10 = this.D;
        if (i10 != 2) {
            if (i10 == 1) {
                equals = this.R.equals(org.telegram.messenger.w3.D(this.O));
            } else {
                equals = this.T.equals(this.S);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131743752, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("UserRestrictionsApplyChangesText", null, 2131743751, org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(this.f38144s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new yp(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747596, null), new yp(this, 4));
                    showDialog(x1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void s0() {
        boolean z10;
        TLRPC.User user;
        long j10;
        int i10 = this.f38135k0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.f38125c.m(i10);
            if (s8Var != null) {
                TLRPC.ChatFull chatFull = this.f38153y;
                if (chatFull != null && (user = this.f38149w) != null) {
                    if (this.f38142r) {
                        j10 = this.f38137n;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f19943id) {
                        z10 = true;
                        s8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                s8Var.setChecked(z10);
                return;
            }
            this.f38119a.g(this.f38135k0);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.w3.T(this.f38151x)) {
            org.telegram.messenger.wp.r1(this.currentAccount).T(getParentActivity(), this.f38144s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.w3.T(this.f38151x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f38151x;
            tL_inputChannel.channel_id = chat.f19794id;
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
        tL_channels_editCreator.user_id = getMessagesController().p1(this.f38149w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new mb(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 2));
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.G;
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

    public final void w0(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iq.w0(boolean):void");
    }

    public final void y0(boolean z10) {
        this.H = z10;
        this.simpleActionBar.getBackButton().setEnabled(!this.H);
        org.telegram.ui.ActionBar.l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b(this.H);
        }
    }

    public final void z0(boolean z10) {
        int i10;
        int min = Math.min(this.f38145s0, this.f38146t0);
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f38120a0 = -1;
        this.f38123b0 = -1;
        this.f38126c0 = -1;
        this.f38127d0 = -1;
        this.f38128e0 = -1;
        this.f38130f0 = -1;
        this.f38131g0 = -1;
        this.f38132h0 = -1;
        this.f38133i0 = -1;
        this.f38134j0 = -1;
        this.f38135k0 = -1;
        this.f38136l0 = -1;
        this.f38139o0 = -1;
        this.f38140p0 = -1;
        this.f38141q0 = -1;
        this.f38143r0 = -1;
        this.f38145s0 = -1;
        this.f38146t0 = -1;
        this.f38147u0 = -1;
        this.f38148v0 = -1;
        this.f38150w0 = -1;
        this.f38154y0 = -1;
        this.f38155z0 = -1;
        this.N0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.B0 = -1;
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
        this.f38152x0 = -1;
        this.m0 = -1;
        this.f38138n0 = -1;
        this.V = 3;
        boolean z11 = this.F;
        boolean z12 = this.E;
        boolean z13 = this.G;
        int i11 = this.D;
        if (i11 != 0 && i11 != 2) {
            if (i11 == 1) {
                this.f38154y0 = 3;
                this.V = 5;
                this.f38155z0 = 4;
                if (this.A0) {
                    this.B0 = 5;
                    this.C0 = 6;
                    this.E0 = 7;
                    this.D0 = 8;
                    this.F0 = 9;
                    this.G0 = 10;
                    this.H0 = 11;
                    this.I0 = 12;
                    this.J0 = 13;
                    this.V = 15;
                    this.f38134j0 = 14;
                }
                int i12 = this.V;
                this.f38131g0 = i12;
                this.f38132h0 = i12 + 1;
                this.f38133i0 = i12 + 2;
                int i13 = i12 + 4;
                this.V = i13;
                this.X = i12 + 3;
                if (z13) {
                    this.V = i12 + 5;
                    this.m0 = i13;
                }
                int i14 = this.V;
                this.L0 = i14;
                this.V = i14 + 2;
                this.M0 = i14 + 1;
            }
        } else if (z11) {
            this.X = 3;
            this.f38138n0 = 4;
            this.f38127d0 = 5;
            this.V = 7;
            this.f38130f0 = 6;
        } else if (z12) {
            this.X = 3;
            this.V = 5;
            this.N0 = 4;
            if (this.O0) {
                this.P0 = 5;
                this.Q0 = 6;
                this.V = 8;
                this.R0 = 7;
            }
            int i15 = this.V;
            int i16 = i15 + 1;
            this.V = i16;
            this.S0 = i15;
            if (this.T0) {
                this.U0 = i16;
                this.V0 = i15 + 2;
                this.V = i15 + 4;
                this.W0 = i15 + 3;
            }
            int i17 = this.V;
            this.Z = i17;
            this.f38120a0 = i17 + 1;
            this.f38131g0 = i17 + 2;
            this.K0 = i17 + 3;
            this.f38127d0 = i17 + 4;
            this.V = i17 + 6;
            this.f38130f0 = i17 + 5;
        } else {
            if (i11 == 2) {
                this.V = 4;
                this.W = 3;
            }
            int i18 = this.V;
            this.X = i18;
            this.f38126c0 = i18 + 1;
            this.f38130f0 = i18 + 2;
            this.f38131g0 = i18 + 3;
            int i19 = i18 + 5;
            this.V = i19;
            this.f38132h0 = i18 + 4;
            if (i11 != 2) {
                this.V = i18 + 6;
                this.f38133i0 = i19;
            }
            if (org.telegram.messenger.w3.T(this.f38151x)) {
                int i20 = this.V;
                int i21 = i20 + 1;
                this.V = i21;
                this.S0 = i20;
                if (this.T0) {
                    this.U0 = i21;
                    this.V0 = i20 + 2;
                    this.V = i20 + 4;
                    this.W0 = i20 + 3;
                }
            }
            int i22 = this.V;
            this.f38120a0 = i22;
            this.K0 = i22 + 1;
            this.f38127d0 = i22 + 2;
            int i23 = i22 + 4;
            this.V = i23;
            this.f38128e0 = i22 + 3;
            if (z13) {
                this.V = i22 + 5;
                this.m0 = i23;
            }
            if (this.U) {
                int i24 = this.V;
                this.f38135k0 = i24;
                this.V = i24 + 2;
                this.f38136l0 = i24 + 1;
            }
        }
        boolean z14 = this.I;
        TLRPC.User user = this.f38149w;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.K) || i11 == 1))) {
                int i25 = this.V;
                this.f38139o0 = i25;
                this.f38148v0 = i25 + 1;
                this.V = i25 + 3;
                this.f38150w0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f38151x;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.f38139o0;
                        if (i26 == -1) {
                            int i27 = this.V;
                            this.V = i27 + 1;
                            this.f38145s0 = i27;
                        }
                        int i28 = this.V;
                        int i29 = i28 + 1;
                        this.V = i29;
                        this.f38146t0 = i28;
                        if (i26 != -1) {
                            this.V = i28 + 2;
                            this.f38145s0 = i29;
                        }
                    }
                }
            }
            if (this.f38121a1) {
                if (this.f38139o0 == -1) {
                    int i30 = this.V;
                    this.V = i30 + 1;
                    this.f38139o0 = i30;
                }
                int i31 = this.V;
                this.f38140p0 = i31;
                this.V = i31 + 2;
                this.f38141q0 = i31 + 1;
            }
        } else if (i11 == 0) {
            if (!z12 && (!this.S.isEmpty() || (this.f38151x.creator && org.telegram.messenger.i20.B(user)))) {
                int i32 = this.V;
                this.f38139o0 = i32;
                this.V = i32 + 2;
                this.f38148v0 = i32 + 1;
                if (this.f38151x.creator && org.telegram.messenger.i20.B(user)) {
                    int i33 = this.V;
                    this.V = i33 + 1;
                    this.f38150w0 = i33;
                } else {
                    int i34 = this.V;
                    this.V = i34 + 1;
                    this.f38143r0 = i34;
                }
            } else {
                int i35 = this.V;
                this.V = i35 + 1;
                this.f38143r0 = i35;
            }
        } else {
            int i36 = this.V;
            this.V = i36 + 1;
            this.f38139o0 = i36;
        }
        if (i11 == 2) {
            int i37 = this.V;
            this.V = i37 + 1;
            this.f38152x0 = i37;
        }
        if (z10) {
            if (min == -1 && (i10 = this.f38145s0) != -1) {
                this.f38119a.o(Math.min(i10, this.f38146t0), 2);
            } else if (min != -1 && this.f38145s0 == -1) {
                this.f38119a.p(min, 2);
            }
        }
    }
}
