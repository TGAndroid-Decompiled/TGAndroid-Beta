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
public class mp extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public jp X0;
    public int Y;
    public final String Y0;
    public int Z;
    public final boolean Z0;
    public lp f48000a;
    public int f48001a0;
    public final boolean f48002a1;
    public bi.q1 f48003b;
    public int f48004b0;
    public ValueAnimator f48005b1;
    public jg.b0 f48006c;
    public int f48007c0;
    public FrameLayout d;
    public int f48008d0;
    public FrameLayout f48009e;
    public int f48010e0;
    public org.telegram.ui.Components.i6 f48011f;
    public int f48012f0;
    public int f48013g0;
    public org.telegram.ui.ActionBar.c5 h;
    public int f48014h0;
    public int f48015i0;
    public int f48016j0;
    public int f48017k0;
    public int f48018l0;
    public int m0;
    public long f48019n;
    public int f48020n0;
    public int f48021o0;
    public int f48022p0;
    public int f48023q0;
    public boolean f48024r;
    public int f48025r0;
    public long f48026s;
    public int f48027s0;
    public int f48028t0;
    public int f48029u0;
    public int f48030v0;
    public final TLRPC.User f48031w;
    public int f48032w0;
    public TLRPC.Chat f48033x;
    public int f48034x0;
    public TLRPC.ChatFull f48035y;
    public int f48036y0;
    public int f48037z0;

    public mp(long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean z9, boolean z10, String str2) {
        super(null);
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        boolean z14;
        boolean z15;
        TLRPC.UserFull b22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
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
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        TLRPC.Chat chat;
        boolean z35;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        this.H = false;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.R = "";
        this.Z0 = z10;
        this.f48026s = j10;
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3));
        this.f48031w = a22;
        this.D = i7;
        this.I = z9;
        boolean z36 = true;
        boolean z37 = !z9;
        this.T0 = z37;
        this.O0 = z37;
        this.Y0 = str2;
        this.f48033x = getMessagesController().M0(Long.valueOf(this.f48026s));
        this.f48035y = getMessagesController().N0(this.f48026s);
        if (a22 != null && a22.bot_guard) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.U = z11;
        String str3 = str != null ? str : "";
        this.S = str3;
        this.T = str3;
        this.F = org.telegram.messenger.t3.Y(this.f48033x);
        TLRPC.Chat chat2 = this.f48033x;
        if (chat2 != null) {
            if (org.telegram.messenger.t3.T(chat2) && !this.f48033x.megagroup) {
                z35 = true;
            } else {
                z35 = false;
            }
            this.E = z35;
            this.G = org.telegram.messenger.t3.c0(this.f48033x);
            this.N = this.f48033x.admin_rights;
        }
        if (this.N == null) {
            if (i7 == 2 && ((chat = this.f48033x) == null || !chat.creator)) {
                z34 = false;
            } else {
                z34 = true;
            }
            this.N = t0(z34);
        }
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
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
                this.R = org.telegram.messenger.t3.D(this.O);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z36 = false;
                }
                this.f48002a1 = z36;
            }
            z15 = false;
        } else {
            if (i7 == 2 && (b22 = getMessagesController().b2(j3)) != null) {
                if (this.E) {
                    tL_chatAdminRights2 = b22.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = b22.bot_group_admin_rights;
                }
                if (tL_chatAdminRights2 != null) {
                    if (tL_chatAdminRights3 == null) {
                        tL_chatAdminRights3 = tL_chatAdminRights2;
                    } else {
                        if (!tL_chatAdminRights3.ban_users && !tL_chatAdminRights2.ban_users) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        tL_chatAdminRights3.ban_users = z16;
                        if (!tL_chatAdminRights3.add_admins && !tL_chatAdminRights2.add_admins) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights3.add_admins = z17;
                        if (!tL_chatAdminRights3.post_messages && !tL_chatAdminRights2.post_messages) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights3.post_messages = z18;
                        if (!tL_chatAdminRights3.pin_messages && !tL_chatAdminRights2.pin_messages) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights3.pin_messages = z19;
                        if (!tL_chatAdminRights3.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        tL_chatAdminRights3.manage_ranks = z20;
                        if (!tL_chatAdminRights3.delete_messages && !tL_chatAdminRights2.delete_messages) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        tL_chatAdminRights3.delete_messages = z21;
                        if (!tL_chatAdminRights3.change_info && !tL_chatAdminRights2.change_info) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        tL_chatAdminRights3.change_info = z22;
                        if (!tL_chatAdminRights3.anonymous && !tL_chatAdminRights2.anonymous) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        tL_chatAdminRights3.anonymous = z23;
                        if (!tL_chatAdminRights3.edit_messages && !tL_chatAdminRights2.edit_messages) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        tL_chatAdminRights3.edit_messages = z24;
                        if (!tL_chatAdminRights3.manage_call && !tL_chatAdminRights2.manage_call) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        tL_chatAdminRights3.manage_call = z25;
                        if (!tL_chatAdminRights3.manage_topics && !tL_chatAdminRights2.manage_topics) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        tL_chatAdminRights3.manage_topics = z26;
                        if (!tL_chatAdminRights3.post_stories && !tL_chatAdminRights2.post_stories) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        tL_chatAdminRights3.post_stories = z27;
                        if (!tL_chatAdminRights3.edit_stories && !tL_chatAdminRights2.edit_stories) {
                            z28 = false;
                        } else {
                            z28 = true;
                        }
                        tL_chatAdminRights3.edit_stories = z28;
                        if (!tL_chatAdminRights3.delete_stories && !tL_chatAdminRights2.delete_stories) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        tL_chatAdminRights3.delete_stories = z29;
                        if (!tL_chatAdminRights3.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
                            z30 = false;
                        } else {
                            z30 = true;
                        }
                        tL_chatAdminRights3.manage_direct_messages = z30;
                        if (!tL_chatAdminRights3.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
                            z31 = false;
                        } else {
                            z31 = true;
                        }
                        tL_chatAdminRights3.manage_welcome_messages = z31;
                        if (!tL_chatAdminRights3.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
                            z32 = false;
                        } else {
                            z32 = true;
                        }
                        tL_chatAdminRights3.manage_linked_peers = z32;
                        if (!tL_chatAdminRights3.other && !tL_chatAdminRights2.other) {
                            z33 = false;
                        } else {
                            z33 = true;
                        }
                        tL_chatAdminRights3.other = z33;
                    }
                }
            }
            if (tL_chatAdminRights3 == null) {
                this.L = false;
                if (i7 == 2) {
                    this.M = t0(false);
                    boolean z38 = this.E;
                    this.K = z38;
                    this.J = z38 ? 1.0f : 0.0f;
                    this.f48002a1 = false;
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
                    this.f48002a1 = false;
                }
            } else {
                this.L = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.M = tL_chatAdminRights6;
                boolean z39 = tL_chatAdminRights3.change_info;
                tL_chatAdminRights6.change_info = z39;
                boolean z40 = tL_chatAdminRights3.post_messages;
                tL_chatAdminRights6.post_messages = z40;
                boolean z41 = tL_chatAdminRights3.edit_messages;
                tL_chatAdminRights6.edit_messages = z41;
                boolean z42 = tL_chatAdminRights3.delete_messages;
                tL_chatAdminRights6.delete_messages = z42;
                boolean z43 = tL_chatAdminRights3.manage_call;
                tL_chatAdminRights6.manage_call = z43;
                boolean z44 = tL_chatAdminRights3.ban_users;
                tL_chatAdminRights6.ban_users = z44;
                boolean z45 = tL_chatAdminRights3.invite_users;
                tL_chatAdminRights6.invite_users = z45;
                boolean z46 = tL_chatAdminRights3.pin_messages;
                tL_chatAdminRights6.pin_messages = z46;
                boolean z47 = tL_chatAdminRights3.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z47;
                boolean z48 = tL_chatAdminRights3.manage_topics;
                tL_chatAdminRights6.manage_topics = z48;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights3.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights3.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights3.delete_stories;
                boolean z49 = tL_chatAdminRights3.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z49;
                boolean z50 = tL_chatAdminRights3.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z50;
                boolean z51 = tL_chatAdminRights3.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z51;
                boolean z52 = tL_chatAdminRights3.add_admins;
                tL_chatAdminRights6.add_admins = z52;
                boolean z53 = tL_chatAdminRights3.anonymous;
                tL_chatAdminRights6.anonymous = z53;
                boolean z54 = tL_chatAdminRights3.other;
                tL_chatAdminRights6.other = z54;
                if (!z39 && !z40 && !z49 && !z50 && !z41 && !z42 && !z44 && !z45 && !z51 && !z46 && !z47 && !z52 && !z43 && !z53 && !z48 && !z54) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.f48002a1 = z12;
                if (i7 == 2) {
                    if (!this.E && !z12) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    this.K = z13;
                    if (z13) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.J = f10;
                    this.f48002a1 = false;
                }
            }
            TLRPC.Chat chat3 = this.f48033x;
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
                z14 = true;
                this.M.change_info = true;
            } else {
                z14 = true;
            }
            if (!tL_chatBannedRights8.pin_messages) {
                this.M.pin_messages = z14;
            }
            z15 = false;
        }
        z0(z15);
    }

    public static void Z(mp mpVar, long j3) {
        if (j3 != 0) {
            mpVar.f48026s = j3;
            mpVar.f48033x = org.telegram.messenger.qp.s1(mpVar.currentAccount).M0(Long.valueOf(j3));
            mpVar.w0(true);
        }
    }

    public static void a0(mp mpVar, h9.f1 f1Var, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(mpVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i7, int i10, int i11) {
                                        final mp mpVar2 = mp.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i7, i10, i11);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(mpVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i12, int i13) {
                                                    mp mpVar3 = mp.this;
                                                    mpVar3.O.until_date = (i13 * 60) + (i12 * 3600) + time;
                                                    mpVar3.f48000a.g(mpVar3.M0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, org.telegram.messenger.id.M0(2131745550, null), timePickerDialog);
                                            timePickerDialog.setButton(-2, org.telegram.messenger.id.M0(2131752589, null), (DialogInterface.OnClickListener) new Object());
                                            mpVar2.showDialog(timePickerDialog);
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
                                datePickerDialog.setButton(-1, org.telegram.messenger.id.M0(2131745550, null), datePickerDialog);
                                datePickerDialog.setButton(-2, org.telegram.messenger.id.M0(2131752589, null), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new hp(0, datePicker));
                                mpVar.showDialog(datePickerDialog);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                    } else {
                        mpVar.O.until_date = ConnectionsManager.getInstance(mpVar.currentAccount).getCurrentTime() + 2592000;
                        mpVar.f48000a.g(mpVar.M0);
                    }
                } else {
                    mpVar.O.until_date = ConnectionsManager.getInstance(mpVar.currentAccount).getCurrentTime() + 604800;
                    mpVar.f48000a.g(mpVar.M0);
                }
            } else {
                mpVar.O.until_date = ConnectionsManager.getInstance(mpVar.currentAccount).getCurrentTime() + 86400;
                mpVar.f48000a.g(mpVar.M0);
            }
        } else {
            mpVar.O.until_date = 0;
            mpVar.f48000a.g(mpVar.M0);
        }
        ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28711x0.run();
    }

    public static boolean b0(mp mpVar, TLRPC.TL_error tL_error) {
        mpVar.y0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!org.telegram.messenger.t3.T(mpVar.f48033x)) {
                ug.i0 i0Var = new ug.i0(11, mpVar.currentAccount, mpVar.getParentActivity(), mpVar, mpVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(mpVar.f48031w);
                i0Var.C1(mpVar.f48033x, arrayList, null, null, null);
                i0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void c0(org.telegram.ui.mp r25, android.content.Context r26, android.view.View r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mp.c0(org.telegram.ui.mp, android.content.Context, android.view.View, int):void");
    }

    public static void d0(mp mpVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i7;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        boolean z9 = mpVar.E;
        TLRPC.User user = mpVar.f48031w;
        if (tL_error != null) {
            if (mpVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getParentActivity());
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        if (z9) {
                            u1Var.R = org.telegram.messenger.id.M0(2131751322, null);
                        } else {
                            u1Var.R = org.telegram.messenger.id.M0(2131751315, null);
                        }
                        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751293, mpVar.f48033x.title, org.telegram.messenger.t10.j(user, true)));
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751296, null), new cp(mpVar, 5));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        mpVar.showDialog(u1Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(mpVar.currentAccount).sendRequest(new TL_account.getPassword(), new ld(8, mpVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (mpVar.getParentActivity() != null && !org.telegram.messenger.p10.i(org.telegram.messenger.c.a(mpVar.currentAccount).f21770a).q()) {
                            mpVar.showDialog(new ug.i0(5, mpVar.currentAccount, mpVar.getParentActivity(), mpVar, null));
                        } else {
                            mpVar.presentFragment(new p81(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.u4.e0(tL_error, mpVar, z9, mpVar.F, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mpVar.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131751297, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.R = M0;
                    LinearLayout linearLayout = new LinearLayout(mpVar.getParentActivity());
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.o(linearLayout);
                    TextView textView = new TextView(mpVar.getParentActivity());
                    int i16 = org.telegram.ui.ActionBar.m6.f27998j5;
                    org.telegram.ui.ActionBar.t6.U(textView, i16, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.id.f23161a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    if (z9) {
                        org.telegram.messenger.k5.r("EditChannelAdminTransferAlertText", null, 2131751283, new Object[]{org.telegram.messenger.t10.j(user, true)}, textView);
                    } else {
                        org.telegram.messenger.k5.r("EditAdminTransferAlertText", null, 2131751301, new Object[]{org.telegram.messenger.t10.j(user, true)}, textView);
                    }
                    linearLayout.addView(textView, c8.ha.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(mpVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(mpVar.getParentActivity());
                    imageView.setImageResource(2131231623);
                    if (org.telegram.messenger.id.f23161a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.id.f23161a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView.setPadding(i10, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.t6.s(imageView, i16, null, mode);
                    TextView textView2 = new TextView(mpVar.getParentActivity());
                    org.telegram.ui.ActionBar.t6.U(textView2, i16, null);
                    textView2.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.id.f23161a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751300, null)));
                    if (org.telegram.messenger.id.f23161a0) {
                        linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                        linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                        linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(mpVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(mpVar.getParentActivity());
                    imageView2.setImageResource(2131231623);
                    if (org.telegram.messenger.id.f23161a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.id.f23161a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.t6.s(imageView2, i16, null, mode);
                    TextView textView3 = new TextView(mpVar.getParentActivity());
                    org.telegram.ui.ActionBar.t6.U(textView3, i16, null);
                    textView3.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.id.f23161a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751299, null)));
                    if (org.telegram.messenger.id.f23161a0) {
                        linearLayout3.addView(textView3, c8.ha.o(-1, -2));
                        i14 = 5;
                        linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
                        linearLayout3.addView(textView3, c8.ha.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751291, null), new cp(mpVar, 6));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(mpVar.getParentActivity());
                        org.telegram.ui.ActionBar.t6.U(textView4, i16, null);
                        textView4.setTextSize(1, 16.0f);
                        if (org.telegram.messenger.id.f23161a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131751298);
                        linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747831, null), null);
                    }
                    mpVar.showDialog(u1Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            mpVar.X0.a(user);
            mpVar.removeSelfFromStack();
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void e0(mp mpVar, long j3) {
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = mpVar.f48035y;
        if (chatFull != null) {
            j10 = chatFull.guard_bot_id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            user = mpVar.getMessagesController().a2(Long.valueOf(j10));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j3 != 0 && user2.f27109id != j3) {
            new org.telegram.ui.Components.m20(mpVar.getParentActivity(), mpVar.resourceProvider, user2, mpVar.f48031w, new dp(mpVar, j3, 0)).show();
            return;
        }
        mpVar.f48019n = j3;
        mpVar.f48024r = true;
        mpVar.s0();
    }

    public static void f0(mp mpVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            mpVar.f48026s = j3;
            mpVar.f48033x = org.telegram.messenger.qp.s1(mpVar.currentAccount).M0(Long.valueOf(j3));
            mpVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(mp mpVar, View view) {
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.n4) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            String str = mpVar.S;
            if (str != null) {
                i7 = str.codePointCount(0, str.length());
            } else {
                i7 = 0;
            }
            int i11 = 16 - i7;
            if (i11 <= 4.8f) {
                n4Var.setText2(String.format("%d", Integer.valueOf(i11)));
                org.telegram.ui.ActionBar.m5 textView2 = n4Var.getTextView2();
                if (i11 < 0) {
                    i10 = org.telegram.ui.ActionBar.m6.f28111p7;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.A6;
                }
                org.telegram.ui.ActionBar.t6.X(textView2, i10, null);
                textView2.setTag(Integer.valueOf(i10));
                return;
            }
            n4Var.setText2("");
        }
    }

    public static boolean q0(mp mpVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = mpVar.P;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_chatAdminRights t0(boolean z9) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z9;
        tL_chatAdminRights.manage_ranks = z9;
        tL_chatAdminRights.manage_welcome_messages = z9;
        tL_chatAdminRights.manage_direct_messages = z9;
        tL_chatAdminRights.delete_stories = z9;
        tL_chatAdminRights.edit_stories = z9;
        tL_chatAdminRights.post_stories = z9;
        tL_chatAdminRights.manage_topics = z9;
        tL_chatAdminRights.manage_call = z9;
        tL_chatAdminRights.add_admins = z9;
        tL_chatAdminRights.pin_messages = z9;
        tL_chatAdminRights.invite_users = z9;
        tL_chatAdminRights.ban_users = z9;
        tL_chatAdminRights.delete_messages = z9;
        tL_chatAdminRights.edit_messages = z9;
        tL_chatAdminRights.post_messages = z9;
        tL_chatAdminRights.change_info = z9;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights x0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        boolean z9;
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
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z25 = true;
        if (!tL_chatAdminRights.change_info && !tL_chatAdminRights2.change_info) {
            z9 = false;
        } else {
            z9 = true;
        }
        tL_chatAdminRights3.change_info = z9;
        if (!tL_chatAdminRights.post_messages && !tL_chatAdminRights2.post_messages) {
            z10 = false;
        } else {
            z10 = true;
        }
        tL_chatAdminRights3.post_messages = z10;
        if (!tL_chatAdminRights.edit_messages && !tL_chatAdminRights2.edit_messages) {
            z11 = false;
        } else {
            z11 = true;
        }
        tL_chatAdminRights3.edit_messages = z11;
        if (!tL_chatAdminRights.delete_messages && !tL_chatAdminRights2.delete_messages) {
            z12 = false;
        } else {
            z12 = true;
        }
        tL_chatAdminRights3.delete_messages = z12;
        if (!tL_chatAdminRights.ban_users && !tL_chatAdminRights2.ban_users) {
            z13 = false;
        } else {
            z13 = true;
        }
        tL_chatAdminRights3.ban_users = z13;
        if (!tL_chatAdminRights.invite_users && !tL_chatAdminRights2.invite_users) {
            z14 = false;
        } else {
            z14 = true;
        }
        tL_chatAdminRights3.invite_users = z14;
        if (!tL_chatAdminRights.pin_messages && !tL_chatAdminRights2.pin_messages) {
            z15 = false;
        } else {
            z15 = true;
        }
        tL_chatAdminRights3.pin_messages = z15;
        if (!tL_chatAdminRights.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
            z16 = false;
        } else {
            z16 = true;
        }
        tL_chatAdminRights3.manage_ranks = z16;
        if (!tL_chatAdminRights.add_admins && !tL_chatAdminRights2.add_admins) {
            z17 = false;
        } else {
            z17 = true;
        }
        tL_chatAdminRights3.add_admins = z17;
        if (!tL_chatAdminRights.manage_call && !tL_chatAdminRights2.manage_call) {
            z18 = false;
        } else {
            z18 = true;
        }
        tL_chatAdminRights3.manage_call = z18;
        if (!tL_chatAdminRights.manage_topics && !tL_chatAdminRights2.manage_topics) {
            z19 = false;
        } else {
            z19 = true;
        }
        tL_chatAdminRights3.manage_topics = z19;
        if (!tL_chatAdminRights.post_stories && !tL_chatAdminRights2.post_stories) {
            z20 = false;
        } else {
            z20 = true;
        }
        tL_chatAdminRights3.post_stories = z20;
        if (!tL_chatAdminRights.edit_stories && !tL_chatAdminRights2.edit_stories) {
            z21 = false;
        } else {
            z21 = true;
        }
        tL_chatAdminRights3.edit_stories = z21;
        if (!tL_chatAdminRights.delete_stories && !tL_chatAdminRights2.delete_stories) {
            z22 = false;
        } else {
            z22 = true;
        }
        tL_chatAdminRights3.delete_stories = z22;
        if (!tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
            z23 = false;
        } else {
            z23 = true;
        }
        tL_chatAdminRights3.manage_direct_messages = z23;
        if (!tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
            z24 = false;
        } else {
            z24 = true;
        }
        tL_chatAdminRights3.manage_welcome_messages = z24;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z25 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z25;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28111p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final View createView(Context context) {
        boolean z9;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.D;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751332, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131754463, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743727, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 8));
        if (this.I || (!this.E && this.f48033x.creator && org.telegram.messenger.t10.B(this.f48031w))) {
            this.h = this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null));
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setFocusableInTouchMode(true);
        bi.q1 q1Var = new bi.q1(11, context, this);
        this.f48003b = q1Var;
        if (i10 != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        q1Var.setClipChildren(z9);
        jg.b0 b0Var = new jg.b0(1, false, 5);
        this.f48006c = b0Var;
        b0Var.E = 100;
        this.f48003b.setLayoutManager(b0Var);
        bi.q1 q1Var2 = this.f48003b;
        lp lpVar = new lp(this, context);
        this.f48000a = lpVar;
        q1Var2.setAdapter(lpVar);
        v4.k kVar = new v4.k();
        if (i10 == 2) {
            this.f48003b.setResetSelectorOnChanged(false);
        }
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.n(350L);
        this.f48003b.setItemAnimator(kVar);
        bi.q1 q1Var3 = this.f48003b;
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 1;
        }
        q1Var3.setVerticalScrollbarPosition(i7);
        w7Var.addView(this.f48003b, c8.ha.c(-1.0f, -1));
        this.f48003b.r1();
        this.f48003b.setOnScrollListener(new g3(this, 7));
        this.f48003b.setSectionsDrawBackground(true);
        this.f48003b.setOnItemClickListener(new di.q4(7, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f48033x;
            if (chat != null && chatFull.f26961id == chat.f26960id) {
                this.f48035y = chatFull;
                s0();
            }
        } else if (i7 == org.telegram.messenger.qs.f25116y1) {
            if ((-this.f48026s) == ((Long) objArr[0]).longValue()) {
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f48003b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48003b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48003b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48003b, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28111p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48003b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28282y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48003b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28072n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28129q5));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        return r0(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25116y1);
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25116y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        lp lpVar = this.f48000a;
        if (lpVar != null) {
            lpVar.f();
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

    public final boolean r0(boolean z9) {
        boolean equals;
        int i7 = this.D;
        if (i7 != 2) {
            if (i7 == 1) {
                equals = this.R.equals(org.telegram.messenger.t3.D(this.O));
            } else {
                equals = this.T.equals(this.S);
            }
            if (!equals) {
                if (z9) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131743726, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("UserRestrictionsApplyChangesText", null, 2131743725, org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.f48026s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new cp(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, null), new cp(this, 4));
                    showDialog(u1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void s0() {
        boolean z9;
        TLRPC.User user;
        long j3;
        int i7 = this.f48017k0;
        if (i7 >= 0) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.f48006c.m(i7);
            if (q8Var != null) {
                TLRPC.ChatFull chatFull = this.f48035y;
                if (chatFull != null && (user = this.f48031w) != null) {
                    if (this.f48024r) {
                        j3 = this.f48019n;
                    } else {
                        j3 = chatFull.guard_bot_id;
                    }
                    if (j3 == user.f27109id) {
                        z9 = true;
                        q8Var.setChecked(z9);
                        return;
                    }
                }
                z9 = false;
                q8Var.setChecked(z9);
                return;
            }
            this.f48000a.g(this.f48017k0);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.f48033x)) {
            org.telegram.messenger.qp.s1(this.currentAccount).T(getParentActivity(), this.f48026s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.t3.T(this.f48033x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f48033x;
            tL_inputChannel.channel_id = chat.f26960id;
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
        tL_channels_editCreator.user_id = getMessagesController().q1(this.f48031w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new bi.g2(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 11));
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
        boolean z9 = tL_chatAdminRights.change_info;
        boolean z10 = this.G;
        if (!z9 || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || ((z10 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous)) {
            if (!z9 && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks) {
                if ((!z10 || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void w0(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mp.w0(boolean):void");
    }

    public final void y0(boolean z9) {
        this.H = z9;
        this.simpleActionBar.getBackButton().setEnabled(!this.H);
        org.telegram.ui.ActionBar.c5 c5Var = this.h;
        if (c5Var != null) {
            c5Var.b(this.H);
        }
    }

    public final void z0(boolean z9) {
        int i7;
        int min = Math.min(this.f48027s0, this.f48028t0);
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f48001a0 = -1;
        this.f48004b0 = -1;
        this.f48007c0 = -1;
        this.f48008d0 = -1;
        this.f48010e0 = -1;
        this.f48012f0 = -1;
        this.f48013g0 = -1;
        this.f48014h0 = -1;
        this.f48015i0 = -1;
        this.f48016j0 = -1;
        this.f48017k0 = -1;
        this.f48018l0 = -1;
        this.f48021o0 = -1;
        this.f48022p0 = -1;
        this.f48023q0 = -1;
        this.f48025r0 = -1;
        this.f48027s0 = -1;
        this.f48028t0 = -1;
        this.f48029u0 = -1;
        this.f48030v0 = -1;
        this.f48032w0 = -1;
        this.f48036y0 = -1;
        this.f48037z0 = -1;
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
        this.f48034x0 = -1;
        this.m0 = -1;
        this.f48020n0 = -1;
        this.V = 3;
        boolean z10 = this.F;
        boolean z11 = this.E;
        boolean z12 = this.G;
        int i10 = this.D;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.f48036y0 = 3;
                this.V = 5;
                this.f48037z0 = 4;
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
                    this.f48016j0 = 14;
                }
                int i11 = this.V;
                this.f48013g0 = i11;
                this.f48014h0 = i11 + 1;
                this.f48015i0 = i11 + 2;
                int i12 = i11 + 4;
                this.V = i12;
                this.X = i11 + 3;
                if (z12) {
                    this.V = i11 + 5;
                    this.m0 = i12;
                }
                int i13 = this.V;
                this.L0 = i13;
                this.V = i13 + 2;
                this.M0 = i13 + 1;
            }
        } else if (z10) {
            this.X = 3;
            this.f48020n0 = 4;
            this.f48008d0 = 5;
            this.V = 7;
            this.f48012f0 = 6;
        } else if (z11) {
            this.X = 3;
            this.V = 5;
            this.N0 = 4;
            if (this.O0) {
                this.P0 = 5;
                this.Q0 = 6;
                this.V = 8;
                this.R0 = 7;
            }
            int i14 = this.V;
            int i15 = i14 + 1;
            this.V = i15;
            this.S0 = i14;
            if (this.T0) {
                this.U0 = i15;
                this.V0 = i14 + 2;
                this.V = i14 + 4;
                this.W0 = i14 + 3;
            }
            int i16 = this.V;
            this.Z = i16;
            this.f48001a0 = i16 + 1;
            this.f48013g0 = i16 + 2;
            this.K0 = i16 + 3;
            this.f48008d0 = i16 + 4;
            this.V = i16 + 6;
            this.f48012f0 = i16 + 5;
        } else {
            if (i10 == 2) {
                this.V = 4;
                this.W = 3;
            }
            int i17 = this.V;
            this.X = i17;
            this.f48007c0 = i17 + 1;
            this.f48012f0 = i17 + 2;
            this.f48013g0 = i17 + 3;
            int i18 = i17 + 5;
            this.V = i18;
            this.f48014h0 = i17 + 4;
            if (i10 != 2) {
                this.V = i17 + 6;
                this.f48015i0 = i18;
            }
            if (org.telegram.messenger.t3.T(this.f48033x)) {
                int i19 = this.V;
                int i20 = i19 + 1;
                this.V = i20;
                this.S0 = i19;
                if (this.T0) {
                    this.U0 = i20;
                    this.V0 = i19 + 2;
                    this.V = i19 + 4;
                    this.W0 = i19 + 3;
                }
            }
            int i21 = this.V;
            this.f48001a0 = i21;
            this.K0 = i21 + 1;
            this.f48008d0 = i21 + 2;
            int i22 = i21 + 4;
            this.V = i22;
            this.f48010e0 = i21 + 3;
            if (z12) {
                this.V = i21 + 5;
                this.m0 = i22;
            }
            if (this.U) {
                int i23 = this.V;
                this.f48017k0 = i23;
                this.V = i23 + 2;
                this.f48018l0 = i23 + 1;
            }
        }
        boolean z13 = this.I;
        TLRPC.User user = this.f48031w;
        if (z13) {
            if (!z11 && (i10 == 0 || ((i10 == 2 && this.K) || i10 == 1))) {
                int i24 = this.V;
                this.f48021o0 = i24;
                this.f48030v0 = i24 + 1;
                this.V = i24 + 3;
                this.f48032w0 = i24 + 2;
            }
            TLRPC.Chat chat = this.f48033x;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
                if (!z11 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z12 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z10) {
                        int i25 = this.f48021o0;
                        if (i25 == -1) {
                            int i26 = this.V;
                            this.V = i26 + 1;
                            this.f48027s0 = i26;
                        }
                        int i27 = this.V;
                        int i28 = i27 + 1;
                        this.V = i28;
                        this.f48028t0 = i27;
                        if (i25 != -1) {
                            this.V = i27 + 2;
                            this.f48027s0 = i28;
                        }
                    }
                }
            }
            if (this.f48002a1) {
                if (this.f48021o0 == -1) {
                    int i29 = this.V;
                    this.V = i29 + 1;
                    this.f48021o0 = i29;
                }
                int i30 = this.V;
                this.f48022p0 = i30;
                this.V = i30 + 2;
                this.f48023q0 = i30 + 1;
            }
        } else if (i10 == 0) {
            if (!z11 && (!this.S.isEmpty() || (this.f48033x.creator && org.telegram.messenger.t10.B(user)))) {
                int i31 = this.V;
                this.f48021o0 = i31;
                this.V = i31 + 2;
                this.f48030v0 = i31 + 1;
                if (this.f48033x.creator && org.telegram.messenger.t10.B(user)) {
                    int i32 = this.V;
                    this.V = i32 + 1;
                    this.f48032w0 = i32;
                } else {
                    int i33 = this.V;
                    this.V = i33 + 1;
                    this.f48025r0 = i33;
                }
            } else {
                int i34 = this.V;
                this.V = i34 + 1;
                this.f48025r0 = i34;
            }
        } else {
            int i35 = this.V;
            this.V = i35 + 1;
            this.f48021o0 = i35;
        }
        if (i10 == 2) {
            int i36 = this.V;
            this.V = i36 + 1;
            this.f48034x0 = i36;
        }
        if (z9) {
            if (min == -1 && (i7 = this.f48027s0) != -1) {
                this.f48000a.o(Math.min(i7, this.f48028t0), 2);
            } else if (min != -1 && this.f48027s0 == -1) {
                this.f48000a.p(min, 2);
            }
        }
    }
}
