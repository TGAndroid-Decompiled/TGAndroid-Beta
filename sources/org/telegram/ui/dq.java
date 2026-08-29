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
    public cq f37573a;
    public int f37574a0;
    public jh.e1 f37575b;
    public int f37576b0;
    public k f37577c;
    public int f37578c0;
    public FrameLayout d;
    public int f37579d0;
    public FrameLayout f37580e;
    public int f37581e0;
    public org.telegram.ui.Components.o6 f37582f;
    public int f37583f0;
    public int f37584g0;
    public org.telegram.ui.Components.ir h;
    public int f37585h0;
    public int f37586i0;
    public int f37587j0;
    public int f37588k0;
    public int f37589l0;
    public int m0;
    public long f37590n;
    public int f37591n0;
    public int f37592o0;
    public int f37593p0;
    public int f37594q0;
    public boolean f37595r;
    public int f37596r0;
    public long f37597s;
    public int f37598s0;
    public int f37599t0;
    public int f37600u0;
    public final TLRPC.User v;
    public int f37601v0;
    public TLRPC.Chat f37602w;
    public boolean f37603w0;
    public TLRPC.ChatFull f37604x;
    public int f37605x0;
    public final int f37606y;
    public int f37607y0;
    public int f37608z0;

    public dq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f9;
        boolean z15;
        TLRPC.UserFull userFull;
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
        this.D = false;
        this.F = 0.0f;
        this.G = false;
        this.H = false;
        this.N = "";
        this.V0 = z11;
        this.f37597s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.f37606y = i10;
        this.E = z10;
        boolean z36 = true;
        boolean z37 = !z10;
        this.P0 = z37;
        this.K0 = z37;
        this.U0 = str2;
        this.f37602w = getMessagesController().getChat(Long.valueOf(this.f37597s));
        this.f37604x = getMessagesController().getChatFull(this.f37597s);
        if (user != null && user.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.Q = z12;
        String str3 = str != null ? str : "";
        this.O = str3;
        this.P = str3;
        this.B = ChatObject.isCommunity(this.f37602w);
        TLRPC.Chat chat2 = this.f37602w;
        if (chat2 != null) {
            if (ChatObject.isChannel(chat2) && !this.f37602w.megagroup) {
                z35 = true;
            } else {
                z35 = false;
            }
            this.A = z35;
            this.C = ChatObject.isForum(this.f37602w);
            this.J = this.f37602w.admin_rights;
        }
        if (this.J == null) {
            if (i10 == 2 && ((chat = this.f37602w) == null || !chat.creator)) {
                z34 = false;
            } else {
                z34 = true;
            }
            this.J = o0(z34);
        }
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.L = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
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
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                this.K = tL_chatBannedRights4;
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
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.K;
                    tL_chatBannedRights5.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights5.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights5.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.L;
                if (tL_chatBannedRights6.view_messages) {
                    this.K.view_messages = true;
                }
                if (tL_chatBannedRights6.send_messages) {
                    this.K.send_messages = true;
                }
                if (tL_chatBannedRights6.send_media) {
                    this.K.send_media = true;
                }
                if (tL_chatBannedRights6.send_stickers) {
                    this.K.send_stickers = true;
                }
                if (tL_chatBannedRights6.send_gifs) {
                    this.K.send_gifs = true;
                }
                if (tL_chatBannedRights6.send_games) {
                    this.K.send_games = true;
                }
                if (tL_chatBannedRights6.send_inline) {
                    this.K.send_inline = true;
                }
                if (tL_chatBannedRights6.embed_links) {
                    this.K.embed_links = true;
                }
                if (tL_chatBannedRights6.send_polls) {
                    this.K.send_polls = true;
                }
                if (tL_chatBannedRights6.invite_users) {
                    this.K.invite_users = true;
                }
                if (tL_chatBannedRights6.change_info) {
                    this.K.change_info = true;
                }
                if (tL_chatBannedRights6.pin_messages) {
                    this.K.pin_messages = true;
                }
                if (tL_chatBannedRights6.edit_rank) {
                    this.K.edit_rank = true;
                }
                if (tL_chatBannedRights6.send_reactions) {
                    this.K.send_reactions = true;
                }
                if (tL_chatBannedRights6.manage_topics) {
                    this.K.manage_topics = true;
                }
                if (tL_chatBannedRights6.send_photos) {
                    this.K.send_photos = true;
                }
                if (tL_chatBannedRights6.send_videos) {
                    this.K.send_videos = true;
                }
                if (tL_chatBannedRights6.send_audios) {
                    this.K.send_audios = true;
                }
                if (tL_chatBannedRights6.send_docs) {
                    this.K.send_docs = true;
                }
                if (tL_chatBannedRights6.send_voices) {
                    this.K.send_voices = true;
                }
                if (tL_chatBannedRights6.send_roundvideos) {
                    this.K.send_roundvideos = true;
                }
                if (tL_chatBannedRights6.send_plain) {
                    this.K.send_plain = true;
                }
                this.N = ChatObject.getBannedRightsString(this.K);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z36 = false;
                }
                this.W0 = z36;
            }
        } else {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
                if (this.A) {
                    tL_chatAdminRights2 = userFull.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = userFull.bot_group_admin_rights;
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
                this.H = false;
                if (i10 == 2) {
                    this.I = o0(false);
                    boolean z38 = this.A;
                    this.G = z38;
                    this.F = z38 ? 1.0f : 0.0f;
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
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.W0 = z13;
                if (i10 == 2) {
                    if (!this.A && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.G = z14;
                    if (z14) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    this.F = f9;
                    this.W0 = false;
                }
            }
            TLRPC.Chat chat3 = this.f37602w;
            if (chat3 != null) {
                this.L = chat3.default_banned_rights;
            }
            if (this.L == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = new TLRPC.TL_chatBannedRights();
                this.L = tL_chatBannedRights7;
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
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.L;
            if (!tL_chatBannedRights8.change_info && !this.A) {
                z15 = true;
                this.I.change_info = true;
            } else {
                z15 = true;
            }
            if (!tL_chatBannedRights8.pin_messages) {
                this.I.pin_messages = z15;
            }
        }
        u0(false);
    }

    public static void U(dq dqVar, long j10) {
        if (j10 != 0) {
            dqVar.f37597s = j10;
            dqVar.f37602w = MessagesController.getInstance(dqVar.currentAccount).getChat(Long.valueOf(j10));
            dqVar.r0(true);
        }
    }

    public static void V(dq dqVar, org.telegram.ui.ActionBar.a3 a3Var, View view) {
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
                                                    dqVar3.K.until_date = (i14 * 60) + (i13 * 3600) + time;
                                                    dqVar3.f37573a.m(dqVar3.I0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                            dqVar2.showDialog(timePickerDialog);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
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
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    } else {
                        dqVar.K.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 2592000;
                        dqVar.f37573a.m(dqVar.I0);
                    }
                } else {
                    dqVar.K.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 604800;
                    dqVar.f37573a.m(dqVar.I0);
                }
            } else {
                dqVar.K.until_date = ConnectionsManager.getInstance(dqVar.currentAccount).getCurrentTime() + 86400;
                dqVar.f37573a.m(dqVar.I0);
            }
        } else {
            dqVar.K.until_date = 0;
            dqVar.f37573a.m(dqVar.I0);
        }
        runnable = a3Var.f22729a.dismissRunnable;
        runnable.run();
    }

    public static boolean W(dq dqVar, TLRPC.TL_error tL_error) {
        dqVar.t0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!ChatObject.isChannel(dqVar.f37602w)) {
                cg.v0 v0Var = new cg.v0(11, dqVar.currentAccount, dqVar.getParentActivity(), dqVar, dqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(dqVar.v);
                v0Var.I1(dqVar.f37602w, arrayList, null, null, null);
                v0Var.show();
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
        boolean z10 = dqVar.A;
        TLRPC.User user = dqVar.v;
        if (tL_error != null) {
            if (dqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar.getParentActivity());
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        if (z10) {
                            c2Var.N = LocaleController.getString(R.string.EditAdminChannelTransfer);
                        } else {
                            c2Var.N = LocaleController.getString(R.string.EditAdminGroupTransfer);
                        }
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, dqVar.f37602w.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new sp(dqVar, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        dqVar.showDialog(c2Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(dqVar.currentAccount).sendRequest(new TL_account.getPassword(), new zg(5, dqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (dqVar.getParentActivity() != null && !AccountInstance.getInstance(dqVar.currentAccount).getUserConfig().isPremium()) {
                            dqVar.showDialog(new cg.v0(5, dqVar.currentAccount, dqVar.getParentActivity(), dqVar, null));
                        } else {
                            dqVar.presentFragment(new md1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.c5.h0(tL_error, dqVar, z10, dqVar.B, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dqVar.getParentActivity());
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.N = string;
                    LinearLayout linearLayout = new LinearLayout(dqVar.getParentActivity());
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(dqVar.getParentActivity());
                    int i16 = org.telegram.ui.ActionBar.g6.f23169j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
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
                    linearLayout.addView(textView, i7.f6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(dqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(dqVar.getParentActivity());
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, i7.f6.n(-1, -2));
                        linearLayout2.addView(imageView, i7.f6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, i7.f6.n(-2, -2));
                        linearLayout2.addView(textView2, i7.f6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(dqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(dqVar.getParentActivity());
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, i7.f6.n(-1, -2));
                        linearLayout3.addView(imageView2, i7.f6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, i7.f6.n(-2, -2));
                        linearLayout3.addView(textView3, i7.f6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new sp(dqVar, 6));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(dqVar.getParentActivity());
                        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    }
                    dqVar.showDialog(c2Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            dqVar.T0.a(user);
            dqVar.removeSelfFromStack();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Z(dq dqVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = dqVar.f37604x;
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
        if (user2 != null && j10 != 0 && user2.f22539id != j10) {
            new org.telegram.ui.Components.u30(dqVar.getParentActivity(), dqVar.resourceProvider, user2, dqVar.v, new tp(dqVar, j10, 0)).show();
            return;
        }
        dqVar.f37590n = j10;
        dqVar.f37595r = true;
        dqVar.n0();
    }

    public static void a0(dq dqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            dqVar.f37597s = j10;
            dqVar.f37602w = MessagesController.getInstance(dqVar.currentAccount).getChat(Long.valueOf(j10));
            dqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(dq dqVar, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.k4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            String str = dqVar.O;
            if (str != null) {
                i10 = str.codePointCount(0, str.length());
            } else {
                i10 = 0;
            }
            int i12 = 16 - i10;
            if (i12 <= 4.8f) {
                k4Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.h5 textView2 = k4Var.getTextView2();
                if (i12 < 0) {
                    i11 = org.telegram.ui.ActionBar.g6.f23279p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.g6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            k4Var.setText2("");
        }
    }

    public static boolean l0(dq dqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.L;
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
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37606y;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 21));
        if (this.E || (!this.A && this.f37602w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i12 = org.telegram.ui.ActionBar.g6.f23385v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        s7 s7Var = new s7(this, context, 1);
        this.fragmentView = s7Var;
        s7Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        jh.e1 e1Var = new jh.e1(this, context, 7);
        this.f37575b = e1Var;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e1Var.setClipChildren(z10);
        k kVar = new k(1, false, 3);
        this.f37577c = kVar;
        kVar.E = 100;
        this.f37575b.setLayoutManager(kVar);
        jh.e1 e1Var2 = this.f37575b;
        cq cqVar = new cq(this, context);
        this.f37573a = cqVar;
        e1Var2.setAdapter(cqVar);
        f2.l lVar = new f2.l();
        if (i11 == 2) {
            this.f37575b.setResetSelectorOnChanged(false);
        }
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.n(350L);
        this.f37575b.setItemAnimator(lVar);
        jh.e1 e1Var3 = this.f37575b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        e1Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f37575b, i7.f6.c(-1.0f, -1));
        this.f37575b.p1();
        this.actionBar.setAdaptiveBackground(this.f37575b);
        this.f37575b.setOnScrollListener(new m3(this, 6));
        this.f37575b.setOnItemClickListener(new eg.w0(8, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f37602w;
            if (chat != null && chatFull.f22393id == chat.f22392id) {
                this.f37604x = chatFull;
                n0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.f37597s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
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
        f fVar = new f(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 16, new Class[]{org.telegram.ui.Cells.ra.class, org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.a6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 4, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37575b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23169j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23294q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z10) {
        boolean equals;
        int i10 = this.f37606y;
        if (i10 != 2) {
            if (i10 == 1) {
                equals = this.N.equals(ChatObject.getBannedRightsString(this.K));
            } else {
                equals = this.P.equals(this.O);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f37597s)).title));
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
        int i10 = this.f37584g0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) this.f37577c.m(i10);
            if (p8Var != null) {
                TLRPC.ChatFull chatFull = this.f37604x;
                if (chatFull != null && (user = this.v) != null) {
                    if (this.f37595r) {
                        j10 = this.f37590n;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f22539id) {
                        z10 = true;
                        p8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                p8Var.setChecked(z10);
                return;
            }
            this.f37573a.m(this.f37584g0);
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
        cq cqVar = this.f37573a;
        if (cqVar != null) {
            cqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f37602w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.f37597s, this, new z6(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f37602w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f37602w;
            tL_inputChannel.channel_id = chat.f22392id;
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
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.v);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new ih.c1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 10));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.C;
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
        float f9;
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = z10;
        this.actionBar.getBackButton().setEnabled(!this.D);
        org.telegram.ui.Components.ir irVar = this.h;
        if (irVar != null) {
            float f10 = irVar.f29455c;
            if (this.D) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.X0 = ofFloat;
            ofFloat.addUpdateListener(new up(this, 0));
            this.X0.addListener(new bm(this, 2));
            this.X0.setDuration(Math.abs(this.h.f29455c - (this.D ? 1.0f : 0.0f)) * 150.0f);
            this.X0.start();
        }
    }

    public final void u0(boolean z10) {
        int i10;
        int min = Math.min(this.f37592o0, this.f37593p0);
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f37574a0 = -1;
        this.f37576b0 = -1;
        this.f37578c0 = -1;
        this.f37579d0 = -1;
        this.f37581e0 = -1;
        this.f37583f0 = -1;
        this.f37584g0 = -1;
        this.f37585h0 = -1;
        this.f37588k0 = -1;
        this.f37589l0 = -1;
        this.m0 = -1;
        this.f37591n0 = -1;
        this.f37592o0 = -1;
        this.f37593p0 = -1;
        this.f37594q0 = -1;
        this.f37596r0 = -1;
        this.f37598s0 = -1;
        this.f37600u0 = -1;
        this.f37601v0 = -1;
        this.J0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.f37605x0 = -1;
        this.f37607y0 = -1;
        this.f37608z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.f37599t0 = -1;
        this.f37586i0 = -1;
        this.f37587j0 = -1;
        this.R = 3;
        boolean z11 = this.B;
        boolean z12 = this.A;
        boolean z13 = this.C;
        int i11 = this.f37606y;
        if (i11 != 0 && i11 != 2) {
            if (i11 == 1) {
                this.f37600u0 = 3;
                this.R = 5;
                this.f37601v0 = 4;
                if (this.f37603w0) {
                    this.f37605x0 = 5;
                    this.f37607y0 = 6;
                    this.A0 = 7;
                    this.f37608z0 = 8;
                    this.B0 = 9;
                    this.C0 = 10;
                    this.D0 = 11;
                    this.E0 = 12;
                    this.F0 = 13;
                    this.R = 15;
                    this.f37583f0 = 14;
                }
                int i12 = this.R;
                this.f37578c0 = i12;
                this.f37579d0 = i12 + 1;
                this.f37581e0 = i12 + 2;
                int i13 = i12 + 4;
                this.R = i13;
                this.T = i12 + 3;
                if (z13) {
                    this.R = i12 + 5;
                    this.f37586i0 = i13;
                }
                int i14 = this.R;
                this.H0 = i14;
                this.R = i14 + 2;
                this.I0 = i14 + 1;
            }
        } else if (z11) {
            this.T = 3;
            this.f37587j0 = 4;
            this.Z = 5;
            this.R = 7;
            this.f37576b0 = 6;
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
            int i15 = this.R;
            int i16 = i15 + 1;
            this.R = i16;
            this.O0 = i15;
            if (this.P0) {
                this.Q0 = i16;
                this.R0 = i15 + 2;
                this.R = i15 + 4;
                this.S0 = i15 + 3;
            }
            int i17 = this.R;
            this.V = i17;
            this.W = i17 + 1;
            this.f37578c0 = i17 + 2;
            this.G0 = i17 + 3;
            this.Z = i17 + 4;
            this.R = i17 + 6;
            this.f37576b0 = i17 + 5;
        } else {
            if (i11 == 2) {
                this.R = 4;
                this.S = 3;
            }
            int i18 = this.R;
            this.T = i18;
            this.Y = i18 + 1;
            this.f37576b0 = i18 + 2;
            this.f37578c0 = i18 + 3;
            int i19 = i18 + 5;
            this.R = i19;
            this.f37579d0 = i18 + 4;
            if (i11 != 2) {
                this.R = i18 + 6;
                this.f37581e0 = i19;
            }
            if (ChatObject.isChannel(this.f37602w)) {
                int i20 = this.R;
                int i21 = i20 + 1;
                this.R = i21;
                this.O0 = i20;
                if (this.P0) {
                    this.Q0 = i21;
                    this.R0 = i20 + 2;
                    this.R = i20 + 4;
                    this.S0 = i20 + 3;
                }
            }
            int i22 = this.R;
            this.W = i22;
            this.G0 = i22 + 1;
            this.Z = i22 + 2;
            int i23 = i22 + 4;
            this.R = i23;
            this.f37574a0 = i22 + 3;
            if (z13) {
                this.R = i22 + 5;
                this.f37586i0 = i23;
            }
            if (this.Q) {
                int i24 = this.R;
                this.f37584g0 = i24;
                this.R = i24 + 2;
                this.f37585h0 = i24 + 1;
            }
        }
        boolean z14 = this.E;
        TLRPC.User user = this.v;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.G) || i11 == 1))) {
                int i25 = this.R;
                this.f37588k0 = i25;
                this.f37596r0 = i25 + 1;
                this.R = i25 + 3;
                this.f37598s0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f37602w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.f37588k0;
                        if (i26 == -1) {
                            int i27 = this.R;
                            this.R = i27 + 1;
                            this.f37592o0 = i27;
                        }
                        int i28 = this.R;
                        int i29 = i28 + 1;
                        this.R = i29;
                        this.f37593p0 = i28;
                        if (i26 != -1) {
                            this.R = i28 + 2;
                            this.f37592o0 = i29;
                        }
                    }
                }
            }
            if (this.W0) {
                if (this.f37588k0 == -1) {
                    int i30 = this.R;
                    this.R = i30 + 1;
                    this.f37588k0 = i30;
                }
                int i31 = this.R;
                this.f37589l0 = i31;
                this.R = i31 + 2;
                this.m0 = i31 + 1;
            }
        } else if (i11 == 0) {
            if (!z12 && (!this.O.isEmpty() || (this.f37602w.creator && UserObject.isUserSelf(user)))) {
                int i32 = this.R;
                this.f37588k0 = i32;
                this.R = i32 + 2;
                this.f37596r0 = i32 + 1;
                if (this.f37602w.creator && UserObject.isUserSelf(user)) {
                    int i33 = this.R;
                    this.R = i33 + 1;
                    this.f37598s0 = i33;
                } else {
                    int i34 = this.R;
                    this.R = i34 + 1;
                    this.f37591n0 = i34;
                }
            } else {
                int i35 = this.R;
                this.R = i35 + 1;
                this.f37591n0 = i35;
            }
        } else {
            int i36 = this.R;
            this.R = i36 + 1;
            this.f37588k0 = i36;
        }
        if (i11 == 2) {
            int i37 = this.R;
            this.R = i37 + 1;
            this.f37599t0 = i37;
        }
        if (z10) {
            if (min == -1 && (i10 = this.f37592o0) != -1) {
                this.f37573a.s(Math.min(i10, this.f37593p0), 2);
            } else if (min != -1 && this.f37592o0 == -1) {
                this.f37573a.t(min, 2);
            }
        }
    }
}
