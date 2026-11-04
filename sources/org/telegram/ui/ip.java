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
public class ip extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public fp Y0;
    public int Z;
    public final String Z0;
    public hp f46323a;
    public int f46324a0;
    public final boolean f46325a1;
    public ci.j1 f46326b;
    public int f46327b0;
    public final boolean f46328b1;
    public kg.y f46329c;
    public int f46330c0;
    public ValueAnimator f46331c1;
    public FrameLayout d;
    public int f46332d0;
    public FrameLayout f46333e;
    public int f46334e0;
    public org.telegram.ui.Components.h6 f46335f;
    public int f46336f0;
    public int f46337g0;
    public org.telegram.ui.ActionBar.b5 h;
    public int f46338h0;
    public int f46339i0;
    public int f46340j0;
    public int f46341k0;
    public int f46342l0;
    public int m0;
    public long f46343n;
    public int f46344n0;
    public int f46345o0;
    public int f46346p0;
    public int f46347q0;
    public boolean f46348r;
    public int f46349r0;
    public long f46350s;
    public int f46351s0;
    public int f46352t0;
    public int f46353u0;
    public int f46354v0;
    public final TLRPC.User f46355w;
    public int f46356w0;
    public TLRPC.Chat f46357x;
    public int f46358x0;
    public TLRPC.ChatFull f46359y;
    public int f46360y0;
    public int f46361z0;

    public ip(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i3, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f10;
        boolean z15;
        boolean z16;
        TLRPC.UserFull b22;
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
        this.f46325a1 = z11;
        this.f46350s = j11;
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(j10));
        this.f46355w = a22;
        this.E = i3;
        this.J = z10;
        boolean z37 = true;
        boolean z38 = !z10;
        this.U0 = z38;
        this.P0 = z38;
        this.Z0 = str2;
        this.f46357x = getMessagesController().M0(Long.valueOf(this.f46350s));
        this.f46359y = getMessagesController().N0(this.f46350s);
        if (a22 != null && a22.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.V = z12;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = org.telegram.messenger.t3.Y(this.f46357x);
        TLRPC.Chat chat2 = this.f46357x;
        if (chat2 != null) {
            if (org.telegram.messenger.t3.T(chat2) && !this.f46357x.megagroup) {
                z36 = true;
            } else {
                z36 = false;
            }
            this.F = z36;
            this.H = org.telegram.messenger.t3.c0(this.f46357x);
            this.O = this.f46357x.admin_rights;
        }
        if (this.O == null) {
            if (i3 == 2 && ((chat = this.f46357x) == null || !chat.creator)) {
                z35 = false;
            } else {
                z35 = true;
            }
            this.O = t0(z35);
        }
        if (i3 != 0 && i3 != 2) {
            if (i3 == 1) {
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
                this.S = org.telegram.messenger.t3.D(this.P);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z37 = false;
                }
                this.f46328b1 = z37;
            }
            z16 = false;
        } else {
            if (i3 == 2 && (b22 = getMessagesController().b2(j10)) != null) {
                if (this.F) {
                    tL_chatAdminRights2 = b22.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = b22.bot_group_admin_rights;
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
                if (i3 == 2) {
                    this.N = t0(false);
                    boolean z39 = this.F;
                    this.L = z39;
                    this.K = z39 ? 1.0f : 0.0f;
                    this.f46328b1 = false;
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
                    this.f46328b1 = false;
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
                this.f46328b1 = z13;
                if (i3 == 2) {
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
                    this.f46328b1 = false;
                }
            }
            TLRPC.Chat chat3 = this.f46357x;
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

    public static void Z(ip ipVar, long j10) {
        if (j10 != 0) {
            ipVar.f46350s = j10;
            ipVar.f46357x = org.telegram.messenger.hp.s1(ipVar.currentAccount).M0(Long.valueOf(j10));
            ipVar.w0(true);
        }
    }

    public static void a0(ip ipVar, hi.d dVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(ipVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i3, int i10, int i11) {
                                        final ip ipVar2 = ip.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i3, i10, i11);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(ipVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i12, int i13) {
                                                    ip ipVar3 = ip.this;
                                                    ipVar3.P.until_date = (i13 * 60) + (i12 * 3600) + time;
                                                    ipVar3.f46323a.g(ipVar3.N0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, org.telegram.messenger.bd.M0(2131745560, null), timePickerDialog);
                                            timePickerDialog.setButton(-2, org.telegram.messenger.bd.M0(2131752589, null), (DialogInterface.OnClickListener) new Object());
                                            ipVar2.showDialog(timePickerDialog);
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
                                datePickerDialog.setButton(-1, org.telegram.messenger.bd.M0(2131745560, null), datePickerDialog);
                                datePickerDialog.setButton(-2, org.telegram.messenger.bd.M0(2131752589, null), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new dp(0, datePicker));
                                ipVar.showDialog(datePickerDialog);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                    } else {
                        ipVar.P.until_date = ConnectionsManager.getInstance(ipVar.currentAccount).getCurrentTime() + 2592000;
                        ipVar.f46323a.g(ipVar.N0);
                    }
                } else {
                    ipVar.P.until_date = ConnectionsManager.getInstance(ipVar.currentAccount).getCurrentTime() + 604800;
                    ipVar.f46323a.g(ipVar.N0);
                }
            } else {
                ipVar.P.until_date = ConnectionsManager.getInstance(ipVar.currentAccount).getCurrentTime() + 86400;
                ipVar.f46323a.g(ipVar.N0);
            }
        } else {
            ipVar.P.until_date = 0;
            ipVar.f46323a.g(ipVar.N0);
        }
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
    }

    public static boolean b0(ip ipVar, TLRPC.TL_error tL_error) {
        ipVar.y0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!org.telegram.messenger.t3.T(ipVar.f46357x)) {
                vg.i0 i0Var = new vg.i0(11, ipVar.currentAccount, ipVar.getParentActivity(), ipVar, ipVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(ipVar.f46355w);
                i0Var.C1(ipVar.f46357x, arrayList, null, null, null);
                i0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void c0(org.telegram.ui.ip r25, android.content.Context r26, android.view.View r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip.c0(org.telegram.ui.ip, android.content.Context, android.view.View, int):void");
    }

    public static void d0(ip ipVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i3;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        boolean z10 = ipVar.F;
        TLRPC.User user = ipVar.f46355w;
        if (tL_error != null) {
            if (ipVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        if (z10) {
                            s1Var.S = org.telegram.messenger.bd.M0(2131751323, null);
                        } else {
                            s1Var.S = org.telegram.messenger.bd.M0(2131751316, null);
                        }
                        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751294, ipVar.f46357x.title, org.telegram.messenger.l10.j(user, true)));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751297, null), new yo(ipVar, 5));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        ipVar.showDialog(s1Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(ipVar.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.ui.ActionBar.h6(11, ipVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (ipVar.getParentActivity() != null && !org.telegram.messenger.h10.i(org.telegram.messenger.c.a(ipVar.currentAccount).f21919a).q()) {
                            ipVar.showDialog(new vg.i0(5, ipVar.currentAccount, ipVar.getParentActivity(), ipVar, null));
                        } else {
                            ipVar.presentFragment(new d81(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.t4.g0(tL_error, ipVar, z10, ipVar.G, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ipVar.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131751298, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = M0;
                    LinearLayout linearLayout = new LinearLayout(ipVar.getParentActivity());
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(ipVar.getParentActivity());
                    int i16 = org.telegram.ui.ActionBar.k6.f27988j5;
                    org.telegram.ui.ActionBar.r6.V(textView, i16, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 48);
                    if (z10) {
                        org.telegram.messenger.k5.r("EditChannelAdminTransferAlertText", null, 2131751284, new Object[]{org.telegram.messenger.l10.j(user, true)}, textView);
                    } else {
                        org.telegram.messenger.k5.r("EditAdminTransferAlertText", null, 2131751302, new Object[]{org.telegram.messenger.l10.j(user, true)}, textView);
                    }
                    linearLayout.addView(textView, b8.mf.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(ipVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(ipVar.getParentActivity());
                    imageView.setImageResource(2131231623);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView.setPadding(i10, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.t(imageView, i16, null, mode);
                    TextView textView2 = new TextView(ipVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.V(textView2, i16, null);
                    textView2.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751301, null)));
                    if (org.telegram.messenger.bd.f21784a0) {
                        linearLayout2.addView(textView2, b8.mf.o(-1, -2));
                        linearLayout2.addView(imageView, b8.mf.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, b8.mf.o(-2, -2));
                        linearLayout2.addView(textView2, b8.mf.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(ipVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(ipVar.getParentActivity());
                    imageView2.setImageResource(2131231623);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
                    TextView textView3 = new TextView(ipVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.V(textView3, i16, null);
                    textView3.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751300, null)));
                    if (org.telegram.messenger.bd.f21784a0) {
                        linearLayout3.addView(textView3, b8.mf.o(-1, -2));
                        i14 = 5;
                        linearLayout3.addView(imageView2, b8.mf.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        linearLayout3.addView(imageView2, b8.mf.o(-2, -2));
                        linearLayout3.addView(textView3, b8.mf.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751292, null), new yo(ipVar, 6));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(ipVar.getParentActivity());
                        org.telegram.ui.ActionBar.r6.V(textView4, i16, null);
                        textView4.setTextSize(1, 16.0f);
                        if (org.telegram.messenger.bd.f21784a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131751299);
                        linearLayout.addView(textView4, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                    }
                    ipVar.showDialog(s1Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            ipVar.Y0.a(user);
            ipVar.removeSelfFromStack();
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void e0(ip ipVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = ipVar.f46359y;
        if (chatFull != null) {
            j11 = chatFull.guard_bot_id;
        } else {
            j11 = 0;
        }
        if (j11 != 0) {
            user = ipVar.getMessagesController().a2(Long.valueOf(j11));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j10 != 0 && user2.f27150id != j10) {
            new org.telegram.ui.Components.i20(ipVar.getParentActivity(), ipVar.resourceProvider, user2, ipVar.f46355w, new zo(ipVar, j10, 0)).show();
            return;
        }
        ipVar.f46343n = j10;
        ipVar.f46348r = true;
        ipVar.s0();
    }

    public static void f0(ip ipVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            ipVar.f46350s = j10;
            ipVar.f46357x = org.telegram.messenger.hp.s1(ipVar.currentAccount).M0(Long.valueOf(j10));
            ipVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(ip ipVar, View view) {
        int i3;
        int i10;
        if (view instanceof org.telegram.ui.Cells.n4) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            String str = ipVar.T;
            if (str != null) {
                i3 = str.codePointCount(0, str.length());
            } else {
                i3 = 0;
            }
            int i11 = 16 - i3;
            if (i11 <= 4.8f) {
                n4Var.setText2(String.format("%d", Integer.valueOf(i11)));
                org.telegram.ui.ActionBar.k5 textView2 = n4Var.getTextView2();
                if (i11 < 0) {
                    i10 = org.telegram.ui.ActionBar.k6.f28102p7;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.A6;
                }
                org.telegram.ui.ActionBar.r6.Y(textView2, i10, null);
                textView2.setTag(Integer.valueOf(i10));
                return;
            }
            n4Var.setText2("");
        }
    }

    public static boolean q0(ip ipVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = ipVar.Q;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i3 = 2;
        int i10 = this.E;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751333, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754463, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743737, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 9));
        if (this.J || (!this.F && this.f46357x.creator && org.telegram.messenger.l10.B(this.f46355w))) {
            this.h = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        }
        x7 x7Var = new x7(this, context, 1);
        this.fragmentView = x7Var;
        x7Var.setFocusableInTouchMode(true);
        ci.j1 j1Var = new ci.j1(11, context, this);
        this.f46326b = j1Var;
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        j1Var.setClipChildren(z10);
        kg.y yVar = new kg.y(1, false, 5);
        this.f46329c = yVar;
        yVar.E = 100;
        this.f46326b.setLayoutManager(yVar);
        ci.j1 j1Var2 = this.f46326b;
        hp hpVar = new hp(this, context);
        this.f46323a = hpVar;
        j1Var2.setAdapter(hpVar);
        u4.k kVar = new u4.k();
        if (i10 == 2) {
            this.f46326b.setResetSelectorOnChanged(false);
        }
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        this.f46326b.setItemAnimator(kVar);
        ci.j1 j1Var3 = this.f46326b;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 1;
        }
        j1Var3.setVerticalScrollbarPosition(i3);
        x7Var.addView(this.f46326b, b8.mf.c(-1.0f, -1));
        this.f46326b.r1();
        this.f46326b.setOnScrollListener(new h3(this, 7));
        this.f46326b.setSectionsDrawBackground(true);
        this.f46326b.setOnItemClickListener(new ei.q4(7, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f46357x;
            if (chat != null && chatFull.f27002id == chat.f27001id) {
                this.f46359y = chatFull;
                s0();
            }
        } else if (i3 == org.telegram.messenger.hs.f23341y1) {
            if ((-this.f46350s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f46326b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46326b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46326b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46326b, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46326b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28273y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46326b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28120q5));
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
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23341y1);
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        hp hpVar = this.f46323a;
        if (hpVar != null) {
            hpVar.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
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
        int i3 = this.E;
        if (i3 != 2) {
            if (i3 == 1) {
                equals = this.S.equals(org.telegram.messenger.t3.D(this.P));
            } else {
                equals = this.U.equals(this.T);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131743736, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("UserRestrictionsApplyChangesText", null, 2131743735, org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(this.f46350s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new yo(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new yo(this, 4));
                    showDialog(s1Var);
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
        int i3 = this.f46342l0;
        if (i3 >= 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) this.f46329c.m(i3);
            if (p8Var != null) {
                TLRPC.ChatFull chatFull = this.f46359y;
                if (chatFull != null && (user = this.f46355w) != null) {
                    if (this.f46348r) {
                        j10 = this.f46343n;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f27150id) {
                        z10 = true;
                        p8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                p8Var.setChecked(z10);
                return;
            }
            this.f46323a.g(this.f46342l0);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.f46357x)) {
            org.telegram.messenger.hp.s1(this.currentAccount).T(getParentActivity(), this.f46350s, this, new b7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.t3.T(this.f46357x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f46357x;
            tL_inputChannel.channel_id = chat.f27001id;
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
        tL_channels_editCreator.user_id = getMessagesController().q1(this.f46355w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new ai.q1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 12));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip.w0(boolean):void");
    }

    public final void y0(boolean z10) {
        this.I = z10;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        if (b5Var != null) {
            b5Var.b(this.I);
        }
    }

    public final void z0(boolean z10) {
        int i3;
        int min = Math.min(this.f46352t0, this.f46353u0);
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f46324a0 = -1;
        this.f46327b0 = -1;
        this.f46330c0 = -1;
        this.f46332d0 = -1;
        this.f46334e0 = -1;
        this.f46336f0 = -1;
        this.f46337g0 = -1;
        this.f46338h0 = -1;
        this.f46339i0 = -1;
        this.f46340j0 = -1;
        this.f46341k0 = -1;
        this.f46342l0 = -1;
        this.m0 = -1;
        this.f46346p0 = -1;
        this.f46347q0 = -1;
        this.f46349r0 = -1;
        this.f46351s0 = -1;
        this.f46352t0 = -1;
        this.f46353u0 = -1;
        this.f46354v0 = -1;
        this.f46356w0 = -1;
        this.f46358x0 = -1;
        this.f46361z0 = -1;
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
        this.f46360y0 = -1;
        this.f46344n0 = -1;
        this.f46345o0 = -1;
        this.W = 3;
        boolean z11 = this.G;
        boolean z12 = this.F;
        boolean z13 = this.H;
        int i10 = this.E;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.f46361z0 = 3;
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
                    this.f46341k0 = 14;
                }
                int i11 = this.W;
                this.f46338h0 = i11;
                this.f46339i0 = i11 + 1;
                this.f46340j0 = i11 + 2;
                int i12 = i11 + 4;
                this.W = i12;
                this.Y = i11 + 3;
                if (z13) {
                    this.W = i11 + 5;
                    this.f46344n0 = i12;
                }
                int i13 = this.W;
                this.M0 = i13;
                this.W = i13 + 2;
                this.N0 = i13 + 1;
            }
        } else if (z11) {
            this.Y = 3;
            this.f46345o0 = 4;
            this.f46334e0 = 5;
            this.W = 7;
            this.f46337g0 = 6;
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
            this.f46324a0 = i16;
            this.f46327b0 = i16 + 1;
            this.f46338h0 = i16 + 2;
            this.L0 = i16 + 3;
            this.f46334e0 = i16 + 4;
            this.W = i16 + 6;
            this.f46337g0 = i16 + 5;
        } else {
            if (i10 == 2) {
                this.W = 4;
                this.X = 3;
            }
            int i17 = this.W;
            this.Y = i17;
            this.f46332d0 = i17 + 1;
            this.f46337g0 = i17 + 2;
            this.f46338h0 = i17 + 3;
            int i18 = i17 + 5;
            this.W = i18;
            this.f46339i0 = i17 + 4;
            if (i10 != 2) {
                this.W = i17 + 6;
                this.f46340j0 = i18;
            }
            if (org.telegram.messenger.t3.T(this.f46357x)) {
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
            this.f46327b0 = i21;
            this.L0 = i21 + 1;
            this.f46334e0 = i21 + 2;
            int i22 = i21 + 4;
            this.W = i22;
            this.f46336f0 = i21 + 3;
            if (z13) {
                this.W = i21 + 5;
                this.f46344n0 = i22;
            }
            if (this.V) {
                int i23 = this.W;
                this.f46342l0 = i23;
                this.W = i23 + 2;
                this.m0 = i23 + 1;
            }
        }
        boolean z14 = this.J;
        TLRPC.User user = this.f46355w;
        if (z14) {
            if (!z12 && (i10 == 0 || ((i10 == 2 && this.L) || i10 == 1))) {
                int i24 = this.W;
                this.f46346p0 = i24;
                this.f46356w0 = i24 + 1;
                this.W = i24 + 3;
                this.f46358x0 = i24 + 2;
            }
            TLRPC.Chat chat = this.f46357x;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i25 = this.f46346p0;
                        if (i25 == -1) {
                            int i26 = this.W;
                            this.W = i26 + 1;
                            this.f46352t0 = i26;
                        }
                        int i27 = this.W;
                        int i28 = i27 + 1;
                        this.W = i28;
                        this.f46353u0 = i27;
                        if (i25 != -1) {
                            this.W = i27 + 2;
                            this.f46352t0 = i28;
                        }
                    }
                }
            }
            if (this.f46328b1) {
                if (this.f46346p0 == -1) {
                    int i29 = this.W;
                    this.W = i29 + 1;
                    this.f46346p0 = i29;
                }
                int i30 = this.W;
                this.f46347q0 = i30;
                this.W = i30 + 2;
                this.f46349r0 = i30 + 1;
            }
        } else if (i10 == 0) {
            if (!z12 && (!this.T.isEmpty() || (this.f46357x.creator && org.telegram.messenger.l10.B(user)))) {
                int i31 = this.W;
                this.f46346p0 = i31;
                this.W = i31 + 2;
                this.f46356w0 = i31 + 1;
                if (this.f46357x.creator && org.telegram.messenger.l10.B(user)) {
                    int i32 = this.W;
                    this.W = i32 + 1;
                    this.f46358x0 = i32;
                } else {
                    int i33 = this.W;
                    this.W = i33 + 1;
                    this.f46351s0 = i33;
                }
            } else {
                int i34 = this.W;
                this.W = i34 + 1;
                this.f46351s0 = i34;
            }
        } else {
            int i35 = this.W;
            this.W = i35 + 1;
            this.f46346p0 = i35;
        }
        if (i10 == 2) {
            int i36 = this.W;
            this.W = i36 + 1;
            this.f46360y0 = i36;
        }
        if (z10) {
            if (min == -1 && (i3 = this.f46352t0) != -1) {
                this.f46323a.o(Math.min(i3, this.f46353u0), 2);
            } else if (min != -1 && this.f46352t0 == -1) {
                this.f46323a.p(min, 2);
            }
        }
    }
}
