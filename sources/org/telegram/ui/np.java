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
public class np extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public kp Y0;
    public int Z;
    public final String Z0;
    public mp f50234a;
    public int f50235a0;
    public final boolean f50236a1;
    public di.b1 f50237b;
    public int f50238b0;
    public final boolean f50239b1;
    public jg.b0 f50240c;
    public int f50241c0;
    public ValueAnimator f50242c1;
    public FrameLayout d;
    public int f50243d0;
    public FrameLayout f50244e;
    public int f50245e0;
    public org.telegram.ui.Components.o6 f50246f;
    public int f50247f0;
    public int f50248g0;
    public org.telegram.ui.ActionBar.c5 h;
    public int f50249h0;
    public int f50250i0;
    public int f50251j0;
    public int f50252k0;
    public int f50253l0;
    public int m0;
    public long f50254n;
    public int f50255n0;
    public int f50256o0;
    public int f50257p0;
    public int f50258q0;
    public boolean f50259r;
    public int f50260r0;
    public long f50261s;
    public int f50262s0;
    public int f50263t0;
    public int f50264u0;
    public int f50265v0;
    public final TLRPC.User f50266w;
    public int f50267w0;
    public TLRPC.Chat f50268x;
    public int f50269x0;
    public TLRPC.ChatFull f50270y;
    public int f50271y0;
    public int f50272z0;

    public np(long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f10;
        boolean z15;
        boolean z16;
        TLRPC.UserFull d2;
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
        this.f50236a1 = z11;
        this.f50261s = j10;
        TLRPC.User c22 = org.telegram.messenger.np.u1(this.currentAccount).c2(Long.valueOf(j3));
        this.f50266w = c22;
        this.E = i7;
        this.J = z10;
        boolean z37 = true;
        boolean z38 = !z10;
        this.U0 = z38;
        this.P0 = z38;
        this.Z0 = str2;
        this.f50268x = getMessagesController().O0(Long.valueOf(this.f50261s));
        this.f50270y = getMessagesController().P0(this.f50261s);
        if (c22 != null && c22.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = z12;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = org.telegram.messenger.v3.Y(this.f50268x);
        TLRPC.Chat chat2 = this.f50268x;
        if (chat2 != null) {
            if (org.telegram.messenger.v3.T(chat2) && !this.f50268x.megagroup) {
                z36 = true;
            } else {
                z36 = false;
            }
            this.F = z36;
            this.H = org.telegram.messenger.v3.c0(this.f50268x);
            this.O = this.f50268x.admin_rights;
        }
        if (this.O == null) {
            if (i7 == 2 && ((chat = this.f50268x) == null || !chat.creator)) {
                z35 = false;
            } else {
                z35 = true;
            }
            this.O = t0(z35);
        }
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
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
                this.S = org.telegram.messenger.v3.D(this.P);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z37 = false;
                }
                this.f50239b1 = z37;
            }
            z16 = false;
        } else {
            if (i7 == 2 && (d2 = getMessagesController().d2(j3)) != null) {
                if (this.F) {
                    tL_chatAdminRights2 = d2.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = d2.bot_group_admin_rights;
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
                if (i7 == 2) {
                    this.N = t0(false);
                    boolean z39 = this.F;
                    this.L = z39;
                    this.K = z39 ? 1.0f : 0.0f;
                    this.f50239b1 = false;
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
                    this.f50239b1 = false;
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
                this.f50239b1 = z13;
                if (i7 == 2) {
                    if (!this.F && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.L = z14;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.K = f10;
                    this.f50239b1 = false;
                }
            }
            TLRPC.Chat chat3 = this.f50268x;
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
        z0(z16);
    }

    public static void Z(np npVar, long j3) {
        if (j3 != 0) {
            npVar.f50261s = j3;
            npVar.f50268x = org.telegram.messenger.np.u1(npVar.currentAccount).O0(Long.valueOf(j3));
            npVar.w0(true);
        }
    }

    public static void a0(np npVar, hi.w4 w4Var, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(npVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i7, int i10, int i11) {
                                        final np npVar2 = np.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i7, i10, i11);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(npVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i12, int i13) {
                                                    np npVar3 = np.this;
                                                    npVar3.P.until_date = (i13 * 60) + (i12 * 3600) + time;
                                                    npVar3.f50234a.g(npVar3.N0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, org.telegram.messenger.hd.N0(2131745354, null), timePickerDialog);
                                            timePickerDialog.setButton(-2, org.telegram.messenger.hd.N0(2131752577, null), (DialogInterface.OnClickListener) new Object());
                                            npVar2.showDialog(timePickerDialog);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
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
                                datePickerDialog.setButton(-1, org.telegram.messenger.hd.N0(2131745354, null), datePickerDialog);
                                datePickerDialog.setButton(-2, org.telegram.messenger.hd.N0(2131752577, null), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new ip(0, datePicker));
                                npVar.showDialog(datePickerDialog);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                    } else {
                        npVar.P.until_date = ConnectionsManager.getInstance(npVar.currentAccount).getCurrentTime() + 2592000;
                        npVar.f50234a.g(npVar.N0);
                    }
                } else {
                    npVar.P.until_date = ConnectionsManager.getInstance(npVar.currentAccount).getCurrentTime() + 604800;
                    npVar.f50234a.g(npVar.N0);
                }
            } else {
                npVar.P.until_date = ConnectionsManager.getInstance(npVar.currentAccount).getCurrentTime() + 86400;
                npVar.f50234a.g(npVar.N0);
            }
        } else {
            npVar.P.until_date = 0;
            npVar.f50234a.g(npVar.N0);
        }
        ((org.telegram.ui.ActionBar.w2) w4Var.f15708b).f30218y0.run();
    }

    public static boolean b0(np npVar, TLRPC.TL_error tL_error) {
        npVar.y0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!org.telegram.messenger.v3.T(npVar.f50268x)) {
                ug.k0 k0Var = new ug.k0(11, npVar.currentAccount, npVar.getParentActivity(), npVar, npVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(npVar.f50266w);
                k0Var.D1(npVar.f50268x, arrayList, null, null, null);
                k0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void c0(org.telegram.ui.np r25, android.content.Context r26, android.view.View r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np.c0(org.telegram.ui.np, android.content.Context, android.view.View, int):void");
    }

    public static void d0(np npVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i7;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        boolean z10 = npVar.F;
        TLRPC.User user = npVar.f50266w;
        if (tL_error != null) {
            if (npVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        if (z10) {
                            t1Var.S = org.telegram.messenger.hd.N0(2131751310, null);
                        } else {
                            t1Var.S = org.telegram.messenger.hd.N0(2131751303, null);
                        }
                        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131751281, npVar.f50268x.title, org.telegram.messenger.p10.k(user, true)));
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751284, null), new dp(npVar, 5));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        npVar.showDialog(t1Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(npVar.currentAccount).sendRequest(new TL_account.getPassword(), new u7(10, npVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (npVar.getParentActivity() != null && !org.telegram.messenger.k10.i(org.telegram.messenger.c.a(npVar.currentAccount).f23202a).q()) {
                            npVar.showDialog(new ug.k0(5, npVar.currentAccount, npVar.getParentActivity(), npVar, null));
                        } else {
                            npVar.presentFragment(new p81(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.c5.e0(tL_error, npVar, z10, npVar.G, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(npVar.getParentActivity());
                    String N0 = org.telegram.messenger.hd.N0(2131751285, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    t1Var2.S = N0;
                    LinearLayout linearLayout = new LinearLayout(npVar.getParentActivity());
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(npVar.getParentActivity());
                    int i16 = org.telegram.ui.ActionBar.m6.f29489j5;
                    org.telegram.ui.ActionBar.t6.U(textView, i16, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    if (z10) {
                        org.telegram.messenger.f3.q("EditChannelAdminTransferAlertText", null, 2131751271, new Object[]{org.telegram.messenger.p10.k(user, true)}, textView);
                    } else {
                        org.telegram.messenger.f3.q("EditAdminTransferAlertText", null, 2131751289, new Object[]{org.telegram.messenger.p10.k(user, true)}, textView);
                    }
                    linearLayout.addView(textView, c8.ma.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(npVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(npVar.getParentActivity());
                    imageView.setImageResource(2131231624);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.hd.f24444a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView.setPadding(i10, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.t6.s(imageView, i16, null, mode);
                    TextView textView2 = new TextView(npVar.getParentActivity());
                    org.telegram.ui.ActionBar.t6.U(textView2, i16, null);
                    textView2.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751288, null)));
                    if (org.telegram.messenger.hd.f24444a0) {
                        linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                        linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c8.ma.o(-2, -2));
                        linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(npVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(npVar.getParentActivity());
                    imageView2.setImageResource(2131231624);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.hd.f24444a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.t6.s(imageView2, i16, null, mode);
                    TextView textView3 = new TextView(npVar.getParentActivity());
                    org.telegram.ui.ActionBar.t6.U(textView3, i16, null);
                    textView3.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131751287, null)));
                    if (org.telegram.messenger.hd.f24444a0) {
                        linearLayout3.addView(textView3, c8.ma.o(-1, -2));
                        i14 = 5;
                        linearLayout3.addView(imageView2, c8.ma.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        linearLayout3.addView(imageView2, c8.ma.o(-2, -2));
                        linearLayout3.addView(textView3, c8.ma.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131751279, null), new dp(npVar, 6));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    } else {
                        TextView textView4 = new TextView(npVar.getParentActivity());
                        org.telegram.ui.ActionBar.t6.U(textView4, i16, null);
                        textView4.setTextSize(1, 16.0f);
                        if (org.telegram.messenger.hd.f24444a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.f3.k(textView4, i15 | 48, null, 2131751286);
                        linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747637, null), null);
                    }
                    npVar.showDialog(t1Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            npVar.Y0.a(user);
            npVar.removeSelfFromStack();
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void e0(np npVar, long j3) {
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = npVar.f50270y;
        if (chatFull != null) {
            j10 = chatFull.guard_bot_id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            user = npVar.getMessagesController().c2(Long.valueOf(j10));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j3 != 0 && user2.f28583id != j3) {
            new org.telegram.ui.Components.a30(npVar.getParentActivity(), npVar.resourceProvider, user2, npVar.f50266w, new ep(npVar, j3, 0)).show();
            return;
        }
        npVar.f50254n = j3;
        npVar.f50259r = true;
        npVar.s0();
    }

    public static void f0(np npVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            npVar.f50261s = j3;
            npVar.f50268x = org.telegram.messenger.np.u1(npVar.currentAccount).O0(Long.valueOf(j3));
            npVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(np npVar, View view) {
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.o4) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            String str = npVar.T;
            if (str != null) {
                i7 = str.codePointCount(0, str.length());
            } else {
                i7 = 0;
            }
            int i11 = 16 - i7;
            if (i11 <= 4.8f) {
                o4Var.setText2(String.format("%d", Integer.valueOf(i11)));
                org.telegram.ui.ActionBar.m5 textView2 = o4Var.getTextView2();
                if (i11 < 0) {
                    i10 = org.telegram.ui.ActionBar.m6.f29602p7;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.A6;
                }
                org.telegram.ui.ActionBar.t6.X(textView2, i10, null);
                textView2.setTag(Integer.valueOf(i10));
                return;
            }
            o4Var.setText2("");
        }
    }

    public static boolean q0(np npVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = npVar.Q;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.D5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29602p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.E;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131751320, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131754460, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131743482, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 11));
        if (this.J || (!this.F && this.f50268x.creator && org.telegram.messenger.p10.C(this.f50266w))) {
            this.h = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setFocusableInTouchMode(true);
        di.b1 b1Var = new di.b1(11, context, this);
        this.f50237b = b1Var;
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.setClipChildren(z10);
        jg.b0 b0Var = new jg.b0(1, false, 5);
        this.f50240c = b0Var;
        b0Var.E = 100;
        this.f50237b.setLayoutManager(b0Var);
        di.b1 b1Var2 = this.f50237b;
        mp mpVar = new mp(this, context);
        this.f50234a = mpVar;
        b1Var2.setAdapter(mpVar);
        v4.k kVar = new v4.k();
        if (i10 == 2) {
            this.f50237b.setResetSelectorOnChanged(false);
        }
        kVar.f59194m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.n(350L);
        this.f50237b.setItemAnimator(kVar);
        di.b1 b1Var3 = this.f50237b;
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 1;
        }
        b1Var3.setVerticalScrollbarPosition(i7);
        w7Var.addView(this.f50237b, c8.ma.c(-1.0f, -1));
        this.f50237b.r1();
        this.f50237b.setOnScrollListener(new g3(this, 7));
        this.f50237b.setSectionsDrawBackground(true);
        this.f50237b.setOnItemClickListener(new fi.g4(7, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f50268x;
            if (chat != null && chatFull.f28435id == chat.f28434id) {
                this.f50270y = chatFull;
                s0();
            }
        } else if (i7 == org.telegram.messenger.ls.f25420y1) {
            if ((-this.f50261s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f50237b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50237b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50237b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50237b, 262144, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29602p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50237b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29773y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50237b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29563n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, new Class[]{org.telegram.ui.Cells.w2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29620q5));
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
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25420y1);
        getNotificationCenter().c(this, org.telegram.messenger.ls.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25420y1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.T);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        mp mpVar = this.f50234a;
        if (mpVar != null) {
            mpVar.f();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean r0(boolean z10) {
        boolean equals;
        int i7 = this.E;
        if (i7 != 2) {
            if (i7 == 1) {
                equals = this.S.equals(org.telegram.messenger.v3.D(this.P));
            } else {
                equals = this.U.equals(this.T);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String N0 = org.telegram.messenger.hd.N0(2131743481, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("UserRestrictionsApplyChangesText", null, 2131743480, org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(this.f50261s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new dp(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747386, null), new dp(this, 4));
                    showDialog(t1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void s0() {
        boolean z10;
        TLRPC.User user;
        long j3;
        int i7 = this.f50253l0;
        if (i7 >= 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.f50240c.m(i7);
            if (r8Var != null) {
                TLRPC.ChatFull chatFull = this.f50270y;
                if (chatFull != null && (user = this.f50266w) != null) {
                    if (this.f50259r) {
                        j3 = this.f50254n;
                    } else {
                        j3 = chatFull.guard_bot_id;
                    }
                    if (j3 == user.f28583id) {
                        z10 = true;
                        r8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                r8Var.setChecked(z10);
                return;
            }
            this.f50234a.g(this.f50253l0);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.v3.T(this.f50268x)) {
            org.telegram.messenger.np.u1(this.currentAccount).T(getParentActivity(), this.f50261s, this, new z6(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.v3.T(this.f50268x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f50268x;
            tL_inputChannel.channel_id = chat.f28434id;
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
        tL_channels_editCreator.user_id = getMessagesController().s1(this.f50266w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new bi.k2(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
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

    public final void w0(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np.w0(boolean):void");
    }

    public final void y0(boolean z10) {
        this.I = z10;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        org.telegram.ui.ActionBar.c5 c5Var = this.h;
        if (c5Var != null) {
            c5Var.b(this.I);
        }
    }

    public final void z0(boolean z10) {
        int i7;
        int min = Math.min(this.f50263t0, this.f50264u0);
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f50235a0 = -1;
        this.f50238b0 = -1;
        this.f50241c0 = -1;
        this.f50243d0 = -1;
        this.f50245e0 = -1;
        this.f50247f0 = -1;
        this.f50248g0 = -1;
        this.f50249h0 = -1;
        this.f50250i0 = -1;
        this.f50251j0 = -1;
        this.f50252k0 = -1;
        this.f50253l0 = -1;
        this.m0 = -1;
        this.f50257p0 = -1;
        this.f50258q0 = -1;
        this.f50260r0 = -1;
        this.f50262s0 = -1;
        this.f50263t0 = -1;
        this.f50264u0 = -1;
        this.f50265v0 = -1;
        this.f50267w0 = -1;
        this.f50269x0 = -1;
        this.f50272z0 = -1;
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
        this.f50271y0 = -1;
        this.f50255n0 = -1;
        this.f50256o0 = -1;
        this.W = 3;
        boolean z11 = this.G;
        boolean z12 = this.F;
        boolean z13 = this.H;
        int i10 = this.E;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.f50272z0 = 3;
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
                    this.f50252k0 = 14;
                }
                int i11 = this.W;
                this.f50249h0 = i11;
                this.f50250i0 = i11 + 1;
                this.f50251j0 = i11 + 2;
                int i12 = i11 + 4;
                this.W = i12;
                this.Y = i11 + 3;
                if (z13) {
                    this.W = i11 + 5;
                    this.f50255n0 = i12;
                }
                int i13 = this.W;
                this.M0 = i13;
                this.W = i13 + 2;
                this.N0 = i13 + 1;
            }
        } else if (z11) {
            this.Y = 3;
            this.f50256o0 = 4;
            this.f50245e0 = 5;
            this.W = 7;
            this.f50248g0 = 6;
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
            int i14 = this.W;
            int i15 = i14 + 1;
            this.W = i15;
            this.T0 = i14;
            if (this.U0) {
                this.V0 = i15;
                this.W0 = i14 + 2;
                this.W = i14 + 4;
                this.X0 = i14 + 3;
            }
            int i16 = this.W;
            this.f50235a0 = i16;
            this.f50238b0 = i16 + 1;
            this.f50249h0 = i16 + 2;
            this.L0 = i16 + 3;
            this.f50245e0 = i16 + 4;
            this.W = i16 + 6;
            this.f50248g0 = i16 + 5;
        } else {
            if (i10 == 2) {
                this.W = 4;
                this.X = 3;
            }
            int i17 = this.W;
            this.Y = i17;
            this.f50243d0 = i17 + 1;
            this.f50248g0 = i17 + 2;
            this.f50249h0 = i17 + 3;
            int i18 = i17 + 5;
            this.W = i18;
            this.f50250i0 = i17 + 4;
            if (i10 != 2) {
                this.W = i17 + 6;
                this.f50251j0 = i18;
            }
            if (org.telegram.messenger.v3.T(this.f50268x)) {
                int i19 = this.W;
                int i20 = i19 + 1;
                this.W = i20;
                this.T0 = i19;
                if (this.U0) {
                    this.V0 = i20;
                    this.W0 = i19 + 2;
                    this.W = i19 + 4;
                    this.X0 = i19 + 3;
                }
            }
            int i21 = this.W;
            this.f50238b0 = i21;
            this.L0 = i21 + 1;
            this.f50245e0 = i21 + 2;
            int i22 = i21 + 4;
            this.W = i22;
            this.f50247f0 = i21 + 3;
            if (z13) {
                this.W = i21 + 5;
                this.f50255n0 = i22;
            }
            if (this.V) {
                int i23 = this.W;
                this.f50253l0 = i23;
                this.W = i23 + 2;
                this.m0 = i23 + 1;
            }
        }
        boolean z14 = this.J;
        TLRPC.User user = this.f50266w;
        if (z14) {
            if (!z12 && (i10 == 0 || ((i10 == 2 && this.L) || i10 == 1))) {
                int i24 = this.W;
                this.f50257p0 = i24;
                this.f50267w0 = i24 + 1;
                this.W = i24 + 3;
                this.f50269x0 = i24 + 2;
            }
            TLRPC.Chat chat = this.f50268x;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i25 = this.f50257p0;
                        if (i25 == -1) {
                            int i26 = this.W;
                            this.W = i26 + 1;
                            this.f50263t0 = i26;
                        }
                        int i27 = this.W;
                        int i28 = i27 + 1;
                        this.W = i28;
                        this.f50264u0 = i27;
                        if (i25 != -1) {
                            this.W = i27 + 2;
                            this.f50263t0 = i28;
                        }
                    }
                }
            }
            if (this.f50239b1) {
                if (this.f50257p0 == -1) {
                    int i29 = this.W;
                    this.W = i29 + 1;
                    this.f50257p0 = i29;
                }
                int i30 = this.W;
                this.f50258q0 = i30;
                this.W = i30 + 2;
                this.f50260r0 = i30 + 1;
            }
        } else if (i10 == 0) {
            if (!z12 && (!this.T.isEmpty() || (this.f50268x.creator && org.telegram.messenger.p10.C(user)))) {
                int i31 = this.W;
                this.f50257p0 = i31;
                this.W = i31 + 2;
                this.f50267w0 = i31 + 1;
                if (this.f50268x.creator && org.telegram.messenger.p10.C(user)) {
                    int i32 = this.W;
                    this.W = i32 + 1;
                    this.f50269x0 = i32;
                } else {
                    int i33 = this.W;
                    this.W = i33 + 1;
                    this.f50262s0 = i33;
                }
            } else {
                int i34 = this.W;
                this.W = i34 + 1;
                this.f50262s0 = i34;
            }
        } else {
            int i35 = this.W;
            this.W = i35 + 1;
            this.f50257p0 = i35;
        }
        if (i10 == 2) {
            int i36 = this.W;
            this.W = i36 + 1;
            this.f50271y0 = i36;
        }
        if (z10) {
            if (min == -1 && (i7 = this.f50263t0) != -1) {
                this.f50234a.o(Math.min(i7, this.f50264u0), 2);
            } else if (min != -1 && this.f50263t0 == -1) {
                this.f50234a.p(min, 2);
            }
        }
    }
}
