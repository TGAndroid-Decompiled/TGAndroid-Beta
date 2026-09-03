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
public class kq extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final boolean B;
    public int B0;
    public final boolean C;
    public int C0;
    public final boolean D;
    public int D0;
    public boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public float G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public final TLRPC.TL_chatAdminRights J;
    public int J0;
    public final TLRPC.TL_chatAdminRights K;
    public int K0;
    public TLRPC.TL_chatBannedRights L;
    public boolean L0;
    public final TLRPC.TL_chatBannedRights M;
    public int M0;
    public boolean N;
    public int N0;
    public final String O;
    public int O0;
    public String P;
    public int P0;
    public final String Q;
    public boolean Q0;
    public final boolean R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public hq U0;
    public int V;
    public final String V0;
    public int W;
    public final boolean W0;
    public int X;
    public final boolean X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public ValueAnimator Z0;
    public jq f38365a;
    public int f38366a0;
    public mh.d1 f38367b;
    public int f38368b0;
    public k f38369c;
    public int f38370c0;
    public FrameLayout d;
    public int f38371d0;
    public FrameLayout f38372e;
    public int f38373e0;
    public org.telegram.ui.Components.k6 f38374f;
    public int f38375f0;
    public int f38376g0;
    public org.telegram.ui.Components.or h;
    public int f38377h0;
    public int f38378i0;
    public int f38379j0;
    public int f38380k0;
    public int f38381l0;
    public int m0;
    public long f38382n;
    public int f38383n0;
    public int f38384o0;
    public int f38385p0;
    public int f38386q0;
    public boolean f38387r;
    public int f38388r0;
    public long f38389s;
    public int f38390s0;
    public int f38391t0;
    public int f38392u0;
    public final TLRPC.User v;
    public int f38393v0;
    public TLRPC.Chat f38394w;
    public int f38395w0;
    public TLRPC.ChatFull f38396x;
    public boolean f38397x0;
    public final int f38398y;
    public int f38399y0;
    public int f38400z0;

    public kq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z4, boolean z10, String str2) {
        super(null);
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        boolean z14;
        TLRPC.UserFull userFull;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
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
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        TLRPC.Chat chat;
        boolean z34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        this.E = false;
        this.G = 0.0f;
        this.H = false;
        this.I = false;
        this.O = "";
        this.W0 = z10;
        this.f38389s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.f38398y = i10;
        this.F = z4;
        boolean z35 = true;
        boolean z36 = !z4;
        this.Q0 = z36;
        this.L0 = z36;
        this.V0 = str2;
        this.f38394w = getMessagesController().getChat(Long.valueOf(this.f38389s));
        this.f38396x = getMessagesController().getChatFull(this.f38389s);
        if (user != null && user.bot_guard) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.R = z11;
        String str3 = str != null ? str : "";
        this.P = str3;
        this.Q = str3;
        this.C = ChatObject.isCommunity(this.f38394w);
        TLRPC.Chat chat2 = this.f38394w;
        if (chat2 != null) {
            if (ChatObject.isChannel(chat2) && !this.f38394w.megagroup) {
                z34 = true;
            } else {
                z34 = false;
            }
            this.B = z34;
            this.D = ChatObject.isForum(this.f38394w);
            this.K = this.f38394w.admin_rights;
        }
        if (this.K == null) {
            if (i10 == 2 && ((chat = this.f38394w) == null || !chat.creator)) {
                z33 = false;
            } else {
                z33 = true;
            }
            this.K = o0(z33);
        }
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.M = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    this.M = tL_chatBannedRights3;
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
                this.L = tL_chatBannedRights4;
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
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.L;
                    tL_chatBannedRights5.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights5.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights5.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.M;
                if (tL_chatBannedRights6.view_messages) {
                    this.L.view_messages = true;
                }
                if (tL_chatBannedRights6.send_messages) {
                    this.L.send_messages = true;
                }
                if (tL_chatBannedRights6.send_media) {
                    this.L.send_media = true;
                }
                if (tL_chatBannedRights6.send_stickers) {
                    this.L.send_stickers = true;
                }
                if (tL_chatBannedRights6.send_gifs) {
                    this.L.send_gifs = true;
                }
                if (tL_chatBannedRights6.send_games) {
                    this.L.send_games = true;
                }
                if (tL_chatBannedRights6.send_inline) {
                    this.L.send_inline = true;
                }
                if (tL_chatBannedRights6.embed_links) {
                    this.L.embed_links = true;
                }
                if (tL_chatBannedRights6.send_polls) {
                    this.L.send_polls = true;
                }
                if (tL_chatBannedRights6.invite_users) {
                    this.L.invite_users = true;
                }
                if (tL_chatBannedRights6.change_info) {
                    this.L.change_info = true;
                }
                if (tL_chatBannedRights6.pin_messages) {
                    this.L.pin_messages = true;
                }
                if (tL_chatBannedRights6.edit_rank) {
                    this.L.edit_rank = true;
                }
                if (tL_chatBannedRights6.send_reactions) {
                    this.L.send_reactions = true;
                }
                if (tL_chatBannedRights6.manage_topics) {
                    this.L.manage_topics = true;
                }
                if (tL_chatBannedRights6.send_photos) {
                    this.L.send_photos = true;
                }
                if (tL_chatBannedRights6.send_videos) {
                    this.L.send_videos = true;
                }
                if (tL_chatBannedRights6.send_audios) {
                    this.L.send_audios = true;
                }
                if (tL_chatBannedRights6.send_docs) {
                    this.L.send_docs = true;
                }
                if (tL_chatBannedRights6.send_voices) {
                    this.L.send_voices = true;
                }
                if (tL_chatBannedRights6.send_roundvideos) {
                    this.L.send_roundvideos = true;
                }
                if (tL_chatBannedRights6.send_plain) {
                    this.L.send_plain = true;
                }
                this.O = ChatObject.getBannedRightsString(this.L);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z35 = false;
                }
                this.X0 = z35;
            }
        } else {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
                if (this.B) {
                    tL_chatAdminRights2 = userFull.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights2 = userFull.bot_group_admin_rights;
                }
                if (tL_chatAdminRights2 != null) {
                    if (tL_chatAdminRights3 == null) {
                        tL_chatAdminRights3 = tL_chatAdminRights2;
                    } else {
                        if (!tL_chatAdminRights3.ban_users && !tL_chatAdminRights2.ban_users) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        tL_chatAdminRights3.ban_users = z15;
                        if (!tL_chatAdminRights3.add_admins && !tL_chatAdminRights2.add_admins) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        tL_chatAdminRights3.add_admins = z16;
                        if (!tL_chatAdminRights3.post_messages && !tL_chatAdminRights2.post_messages) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights3.post_messages = z17;
                        if (!tL_chatAdminRights3.pin_messages && !tL_chatAdminRights2.pin_messages) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights3.pin_messages = z18;
                        if (!tL_chatAdminRights3.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights3.manage_ranks = z19;
                        if (!tL_chatAdminRights3.delete_messages && !tL_chatAdminRights2.delete_messages) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        tL_chatAdminRights3.delete_messages = z20;
                        if (!tL_chatAdminRights3.change_info && !tL_chatAdminRights2.change_info) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        tL_chatAdminRights3.change_info = z21;
                        if (!tL_chatAdminRights3.anonymous && !tL_chatAdminRights2.anonymous) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        tL_chatAdminRights3.anonymous = z22;
                        if (!tL_chatAdminRights3.edit_messages && !tL_chatAdminRights2.edit_messages) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        tL_chatAdminRights3.edit_messages = z23;
                        if (!tL_chatAdminRights3.manage_call && !tL_chatAdminRights2.manage_call) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        tL_chatAdminRights3.manage_call = z24;
                        if (!tL_chatAdminRights3.manage_topics && !tL_chatAdminRights2.manage_topics) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        tL_chatAdminRights3.manage_topics = z25;
                        if (!tL_chatAdminRights3.post_stories && !tL_chatAdminRights2.post_stories) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        tL_chatAdminRights3.post_stories = z26;
                        if (!tL_chatAdminRights3.edit_stories && !tL_chatAdminRights2.edit_stories) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        tL_chatAdminRights3.edit_stories = z27;
                        if (!tL_chatAdminRights3.delete_stories && !tL_chatAdminRights2.delete_stories) {
                            z28 = false;
                        } else {
                            z28 = true;
                        }
                        tL_chatAdminRights3.delete_stories = z28;
                        if (!tL_chatAdminRights3.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        tL_chatAdminRights3.manage_direct_messages = z29;
                        if (!tL_chatAdminRights3.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
                            z30 = false;
                        } else {
                            z30 = true;
                        }
                        tL_chatAdminRights3.manage_welcome_messages = z30;
                        if (!tL_chatAdminRights3.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
                            z31 = false;
                        } else {
                            z31 = true;
                        }
                        tL_chatAdminRights3.manage_linked_peers = z31;
                        if (!tL_chatAdminRights3.other && !tL_chatAdminRights2.other) {
                            z32 = false;
                        } else {
                            z32 = true;
                        }
                        tL_chatAdminRights3.other = z32;
                    }
                }
            }
            if (tL_chatAdminRights3 == null) {
                this.I = false;
                if (i10 == 2) {
                    this.J = o0(false);
                    boolean z37 = this.B;
                    this.H = z37;
                    this.G = z37 ? 1.0f : 0.0f;
                    this.X0 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.J = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.K;
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
                    this.X0 = false;
                }
            } else {
                this.I = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.J = tL_chatAdminRights6;
                boolean z38 = tL_chatAdminRights3.change_info;
                tL_chatAdminRights6.change_info = z38;
                boolean z39 = tL_chatAdminRights3.post_messages;
                tL_chatAdminRights6.post_messages = z39;
                boolean z40 = tL_chatAdminRights3.edit_messages;
                tL_chatAdminRights6.edit_messages = z40;
                boolean z41 = tL_chatAdminRights3.delete_messages;
                tL_chatAdminRights6.delete_messages = z41;
                boolean z42 = tL_chatAdminRights3.manage_call;
                tL_chatAdminRights6.manage_call = z42;
                boolean z43 = tL_chatAdminRights3.ban_users;
                tL_chatAdminRights6.ban_users = z43;
                boolean z44 = tL_chatAdminRights3.invite_users;
                tL_chatAdminRights6.invite_users = z44;
                boolean z45 = tL_chatAdminRights3.pin_messages;
                tL_chatAdminRights6.pin_messages = z45;
                boolean z46 = tL_chatAdminRights3.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z46;
                boolean z47 = tL_chatAdminRights3.manage_topics;
                tL_chatAdminRights6.manage_topics = z47;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights3.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights3.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights3.delete_stories;
                boolean z48 = tL_chatAdminRights3.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z48;
                boolean z49 = tL_chatAdminRights3.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z49;
                boolean z50 = tL_chatAdminRights3.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z50;
                boolean z51 = tL_chatAdminRights3.add_admins;
                tL_chatAdminRights6.add_admins = z51;
                boolean z52 = tL_chatAdminRights3.anonymous;
                tL_chatAdminRights6.anonymous = z52;
                boolean z53 = tL_chatAdminRights3.other;
                tL_chatAdminRights6.other = z53;
                if (!z38 && !z39 && !z48 && !z49 && !z40 && !z41 && !z43 && !z44 && !z50 && !z45 && !z46 && !z51 && !z42 && !z52 && !z47 && !z53) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.X0 = z12;
                if (i10 == 2) {
                    if (!this.B && !z12) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    this.H = z13;
                    if (z13) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.G = f10;
                    this.X0 = false;
                }
            }
            TLRPC.Chat chat3 = this.f38394w;
            if (chat3 != null) {
                this.M = chat3.default_banned_rights;
            }
            if (this.M == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = new TLRPC.TL_chatBannedRights();
                this.M = tL_chatBannedRights7;
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
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.M;
            if (!tL_chatBannedRights8.change_info && !this.B) {
                z14 = true;
                this.J.change_info = true;
            } else {
                z14 = true;
            }
            if (!tL_chatBannedRights8.pin_messages) {
                this.J.pin_messages = z14;
            }
        }
        u0(false);
    }

    public static void U(kq kqVar, long j10) {
        if (j10 != 0) {
            kqVar.f38389s = j10;
            kqVar.f38394w = MessagesController.getInstance(kqVar.currentAccount).getChat(Long.valueOf(j10));
            kqVar.r0(true);
        }
    }

    public static void V(kq kqVar, org.telegram.ui.ActionBar.c3 c3Var, View view) {
        Runnable runnable;
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(kqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                                        final kq kqVar2 = kq.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i10, i11, i12);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(kqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                                    kq kqVar3 = kq.this;
                                                    kqVar3.L.until_date = (i14 * 60) + (i13 * 3600) + time;
                                                    kqVar3.f38365a.m(kqVar3.J0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                            kqVar2.showDialog(timePickerDialog);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
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
                                datePickerDialog.setOnShowListener(new fq(0, datePicker));
                                kqVar.showDialog(datePickerDialog);
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                        }
                    } else {
                        kqVar.L.until_date = ConnectionsManager.getInstance(kqVar.currentAccount).getCurrentTime() + 2592000;
                        kqVar.f38365a.m(kqVar.J0);
                    }
                } else {
                    kqVar.L.until_date = ConnectionsManager.getInstance(kqVar.currentAccount).getCurrentTime() + 604800;
                    kqVar.f38365a.m(kqVar.J0);
                }
            } else {
                kqVar.L.until_date = ConnectionsManager.getInstance(kqVar.currentAccount).getCurrentTime() + 86400;
                kqVar.f38365a.m(kqVar.J0);
            }
        } else {
            kqVar.L.until_date = 0;
            kqVar.f38365a.m(kqVar.J0);
        }
        runnable = c3Var.f21209a.dismissRunnable;
        runnable.run();
    }

    public static boolean W(kq kqVar, TLRPC.TL_error tL_error) {
        kqVar.t0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!ChatObject.isChannel(kqVar.f38394w)) {
                fg.v0 v0Var = new fg.v0(11, kqVar.currentAccount, kqVar.getParentActivity(), kqVar, kqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(kqVar.v);
                v0Var.I1(kqVar.f38394w, arrayList, null, null, null);
                v0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void X(org.telegram.ui.kq r23, android.content.Context r24, android.view.View r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq.X(org.telegram.ui.kq, android.content.Context, android.view.View, int):void");
    }

    public static void Y(kq kqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        boolean z4 = kqVar.B;
        TLRPC.User user = kqVar.v;
        if (tL_error != null) {
            if (kqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar.getParentActivity());
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        if (z4) {
                            d2Var.O = LocaleController.getString(R.string.EditAdminChannelTransfer);
                        } else {
                            d2Var.O = LocaleController.getString(R.string.EditAdminGroupTransfer);
                        }
                        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, kqVar.f38394w.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new zp(kqVar, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        kqVar.showDialog(d2Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(kqVar.currentAccount).sendRequest(new TL_account.getPassword(), new lo(2, kqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (kqVar.getParentActivity() != null && !AccountInstance.getInstance(kqVar.currentAccount).getUserConfig().isPremium()) {
                            kqVar.showDialog(new fg.v0(5, kqVar.currentAccount, kqVar.getParentActivity(), kqVar, null));
                        } else {
                            kqVar.presentFragment(new he1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.z4.h0(tL_error, kqVar, z4, kqVar.C, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kqVar.getParentActivity());
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                    d2Var2.O = string;
                    LinearLayout linearLayout = new LinearLayout(kqVar.getParentActivity());
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(kqVar.getParentActivity());
                    int i16 = org.telegram.ui.ActionBar.k6.f21768j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (z4) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
                    } else {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
                    }
                    linearLayout.addView(textView, k7.c6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(kqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(kqVar.getParentActivity());
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
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(kqVar.getParentActivity());
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                        linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, k7.c6.n(-2, -2));
                        linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(kqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(kqVar.getParentActivity());
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(kqVar.getParentActivity());
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, k7.c6.n(-1, -2));
                        linearLayout3.addView(imageView2, k7.c6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, k7.c6.n(-2, -2));
                        linearLayout3.addView(textView3, k7.c6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new zp(kqVar, 6));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(kqVar.getParentActivity());
                        textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    }
                    kqVar.showDialog(d2Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            kqVar.U0.a(user);
            kqVar.removeSelfFromStack();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Z(kq kqVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = kqVar.f38396x;
        if (chatFull != null) {
            j11 = chatFull.guard_bot_id;
        } else {
            j11 = 0;
        }
        if (j11 != 0) {
            user = kqVar.getMessagesController().getUser(Long.valueOf(j11));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j10 != 0 && user2.f20992id != j10) {
            new org.telegram.ui.Components.a40(kqVar.getParentActivity(), kqVar.resourceProvider, user2, kqVar.v, new aq(kqVar, j10, 0)).show();
            return;
        }
        kqVar.f38382n = j10;
        kqVar.f38387r = true;
        kqVar.n0();
    }

    public static void a0(kq kqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            kqVar.f38389s = j10;
            kqVar.f38394w = MessagesController.getInstance(kqVar.currentAccount).getChat(Long.valueOf(j10));
            kqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(kq kqVar, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = kqVar.P;
            if (str != null) {
                i10 = str.codePointCount(0, str.length());
            } else {
                i10 = 0;
            }
            int i12 = 16 - i10;
            if (i12 <= 4.8f) {
                m4Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.l5 textView2 = m4Var.getTextView2();
                if (i12 < 0) {
                    i11 = org.telegram.ui.ActionBar.k6.f21878p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            m4Var.setText2("");
        }
    }

    public static boolean l0(kq kqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kqVar.M;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_chatAdminRights o0(boolean z4) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z4;
        tL_chatAdminRights.manage_ranks = z4;
        tL_chatAdminRights.manage_welcome_messages = z4;
        tL_chatAdminRights.manage_direct_messages = z4;
        tL_chatAdminRights.delete_stories = z4;
        tL_chatAdminRights.edit_stories = z4;
        tL_chatAdminRights.post_stories = z4;
        tL_chatAdminRights.manage_topics = z4;
        tL_chatAdminRights.manage_call = z4;
        tL_chatAdminRights.add_admins = z4;
        tL_chatAdminRights.pin_messages = z4;
        tL_chatAdminRights.invite_users = z4;
        tL_chatAdminRights.ban_users = z4;
        tL_chatAdminRights.delete_messages = z4;
        tL_chatAdminRights.edit_messages = z4;
        tL_chatAdminRights.post_messages = z4;
        tL_chatAdminRights.change_info = z4;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights s0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        boolean z4;
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
            z4 = false;
        } else {
            z4 = true;
        }
        tL_chatAdminRights3.change_info = z4;
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
    public final View createView(Context context) {
        boolean z4;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f38398y;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 21));
        if (this.F || (!this.B && this.f38394w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.f21983v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i12, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        mh.d1 d1Var = new mh.d1(this, context, 6);
        this.f38367b = d1Var;
        if (i11 != 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        d1Var.setClipChildren(z4);
        k kVar = new k(1, false, 3);
        this.f38369c = kVar;
        kVar.E = 100;
        this.f38367b.setLayoutManager(kVar);
        mh.d1 d1Var2 = this.f38367b;
        jq jqVar = new jq(this, context);
        this.f38365a = jqVar;
        d1Var2.setAdapter(jqVar);
        f2.l lVar = new f2.l();
        if (i11 == 2) {
            this.f38367b.setResetSelectorOnChanged(false);
        }
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        this.f38367b.setItemAnimator(lVar);
        mh.d1 d1Var3 = this.f38367b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        d1Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38367b, k7.c6.c(-1.0f, -1));
        this.f38367b.o1();
        this.actionBar.setAdaptiveBackground(this.f38367b);
        this.f38367b.setOnScrollListener(new l3(this, 6));
        this.f38367b.setOnItemClickListener(new hg.v0(7, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f38394w;
            if (chat != null && chatFull.f20846id == chat.f20845id) {
                this.f38396x = chatFull;
                n0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.f38389s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getLastFragment() == this) {
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
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 16, new Class[]{org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.c6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.f21878p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21823m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f22055z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22038y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38367b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21768j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21895q5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8192, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 16384, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z4) {
        boolean equals;
        int i10 = this.f38398y;
        if (i10 != 2) {
            if (i10 == 1) {
                equals = this.O.equals(ChatObject.getBannedRightsString(this.L));
            } else {
                equals = this.Q.equals(this.P);
            }
            if (!equals) {
                if (z4) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string;
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f38389s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new zp(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new zp(this, 4));
                    showDialog(d2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        boolean z4;
        TLRPC.User user;
        long j10;
        int i10 = this.f38377h0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.f38369c.m(i10);
            if (r8Var != null) {
                TLRPC.ChatFull chatFull = this.f38396x;
                if (chatFull != null && (user = this.v) != null) {
                    if (this.f38387r) {
                        j10 = this.f38382n;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f20992id) {
                        z4 = true;
                        r8Var.setChecked(z4);
                        return;
                    }
                }
                z4 = false;
                r8Var.setChecked(z4);
                return;
            }
            this.f38365a.m(this.f38377h0);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        return m0(z4);
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
        jq jqVar = this.f38365a;
        if (jqVar != null) {
            jqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f38394w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.f38389s, this, new d7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f38394w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f38394w;
            tL_inputChannel.channel_id = chat.f20845id;
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
        getConnectionsManager().sendRequest(tL_channels_editCreator, new lh.b1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 9));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.J;
        boolean z4 = tL_chatAdminRights.change_info;
        boolean z10 = this.D;
        if (!z4 || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || ((z10 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous)) {
            if (!z4 && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks) {
                if ((!z10 || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void r0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq.r0(boolean):void");
    }

    public final void t0(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.E = z4;
        this.actionBar.getBackButton().setEnabled(!this.E);
        org.telegram.ui.Components.or orVar = this.h;
        if (orVar != null) {
            float f11 = orVar.f29874c;
            if (this.E) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.Y0 = ofFloat;
            ofFloat.addUpdateListener(new bq(this, 0));
            this.Y0.addListener(new s5(this, 23));
            this.Y0.setDuration(Math.abs(this.h.f29874c - (this.E ? 1.0f : 0.0f)) * 150.0f);
            this.Y0.start();
        }
    }

    public final void u0(boolean z4) {
        int i10;
        int min = Math.min(this.f38385p0, this.f38386q0);
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f38366a0 = -1;
        this.f38368b0 = -1;
        this.f38370c0 = -1;
        this.f38371d0 = -1;
        this.f38373e0 = -1;
        this.f38375f0 = -1;
        this.f38376g0 = -1;
        this.f38377h0 = -1;
        this.f38378i0 = -1;
        this.f38381l0 = -1;
        this.m0 = -1;
        this.f38383n0 = -1;
        this.f38384o0 = -1;
        this.f38385p0 = -1;
        this.f38386q0 = -1;
        this.f38388r0 = -1;
        this.f38390s0 = -1;
        this.f38391t0 = -1;
        this.f38393v0 = -1;
        this.f38395w0 = -1;
        this.K0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.f38399y0 = -1;
        this.f38400z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.f38392u0 = -1;
        this.f38379j0 = -1;
        this.f38380k0 = -1;
        this.S = 3;
        boolean z10 = this.C;
        boolean z11 = this.B;
        boolean z12 = this.D;
        int i11 = this.f38398y;
        if (i11 != 0 && i11 != 2) {
            if (i11 == 1) {
                this.f38393v0 = 3;
                this.S = 5;
                this.f38395w0 = 4;
                if (this.f38397x0) {
                    this.f38399y0 = 5;
                    this.f38400z0 = 6;
                    this.B0 = 7;
                    this.A0 = 8;
                    this.C0 = 9;
                    this.D0 = 10;
                    this.E0 = 11;
                    this.F0 = 12;
                    this.G0 = 13;
                    this.S = 15;
                    this.f38376g0 = 14;
                }
                int i12 = this.S;
                this.f38371d0 = i12;
                this.f38373e0 = i12 + 1;
                this.f38375f0 = i12 + 2;
                int i13 = i12 + 4;
                this.S = i13;
                this.U = i12 + 3;
                if (z12) {
                    this.S = i12 + 5;
                    this.f38379j0 = i13;
                }
                int i14 = this.S;
                this.I0 = i14;
                this.S = i14 + 2;
                this.J0 = i14 + 1;
            }
        } else if (z10) {
            this.U = 3;
            this.f38380k0 = 4;
            this.f38366a0 = 5;
            this.S = 7;
            this.f38370c0 = 6;
        } else if (z11) {
            this.U = 3;
            this.S = 5;
            this.K0 = 4;
            if (this.L0) {
                this.M0 = 5;
                this.N0 = 6;
                this.S = 8;
                this.O0 = 7;
            }
            int i15 = this.S;
            int i16 = i15 + 1;
            this.S = i16;
            this.P0 = i15;
            if (this.Q0) {
                this.R0 = i16;
                this.S0 = i15 + 2;
                this.S = i15 + 4;
                this.T0 = i15 + 3;
            }
            int i17 = this.S;
            this.W = i17;
            this.X = i17 + 1;
            this.f38371d0 = i17 + 2;
            this.H0 = i17 + 3;
            this.f38366a0 = i17 + 4;
            this.S = i17 + 6;
            this.f38370c0 = i17 + 5;
        } else {
            if (i11 == 2) {
                this.S = 4;
                this.T = 3;
            }
            int i18 = this.S;
            this.U = i18;
            this.Z = i18 + 1;
            this.f38370c0 = i18 + 2;
            this.f38371d0 = i18 + 3;
            int i19 = i18 + 5;
            this.S = i19;
            this.f38373e0 = i18 + 4;
            if (i11 != 2) {
                this.S = i18 + 6;
                this.f38375f0 = i19;
            }
            if (ChatObject.isChannel(this.f38394w)) {
                int i20 = this.S;
                int i21 = i20 + 1;
                this.S = i21;
                this.P0 = i20;
                if (this.Q0) {
                    this.R0 = i21;
                    this.S0 = i20 + 2;
                    this.S = i20 + 4;
                    this.T0 = i20 + 3;
                }
            }
            int i22 = this.S;
            this.X = i22;
            this.H0 = i22 + 1;
            this.f38366a0 = i22 + 2;
            int i23 = i22 + 4;
            this.S = i23;
            this.f38368b0 = i22 + 3;
            if (z12) {
                this.S = i22 + 5;
                this.f38379j0 = i23;
            }
            if (this.R) {
                int i24 = this.S;
                this.f38377h0 = i24;
                this.S = i24 + 2;
                this.f38378i0 = i24 + 1;
            }
        }
        boolean z13 = this.F;
        TLRPC.User user = this.v;
        if (z13) {
            if (!z11 && (i11 == 0 || ((i11 == 2 && this.H) || i11 == 1))) {
                int i25 = this.S;
                this.f38381l0 = i25;
                this.f38390s0 = i25 + 1;
                this.S = i25 + 3;
                this.f38391t0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f38394w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.J;
                if (!z11 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z12 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z10) {
                        int i26 = this.f38381l0;
                        if (i26 == -1) {
                            int i27 = this.S;
                            this.S = i27 + 1;
                            this.f38385p0 = i27;
                        }
                        int i28 = this.S;
                        int i29 = i28 + 1;
                        this.S = i29;
                        this.f38386q0 = i28;
                        if (i26 != -1) {
                            this.S = i28 + 2;
                            this.f38385p0 = i29;
                        }
                    }
                }
            }
            if (this.X0) {
                if (this.f38381l0 == -1) {
                    int i30 = this.S;
                    this.S = i30 + 1;
                    this.f38381l0 = i30;
                }
                int i31 = this.S;
                this.m0 = i31;
                this.S = i31 + 2;
                this.f38383n0 = i31 + 1;
            }
        } else if (i11 == 0) {
            if (!z11 && (!this.P.isEmpty() || (this.f38394w.creator && UserObject.isUserSelf(user)))) {
                int i32 = this.S;
                this.f38381l0 = i32;
                this.S = i32 + 2;
                this.f38390s0 = i32 + 1;
                if (this.f38394w.creator && UserObject.isUserSelf(user)) {
                    int i33 = this.S;
                    this.S = i33 + 1;
                    this.f38391t0 = i33;
                } else {
                    int i34 = this.S;
                    this.S = i34 + 1;
                    this.f38384o0 = i34;
                }
            } else {
                int i35 = this.S;
                this.S = i35 + 1;
                this.f38384o0 = i35;
            }
        } else {
            int i36 = this.S;
            this.S = i36 + 1;
            this.f38381l0 = i36;
        }
        if (i11 == 2) {
            int i37 = this.S;
            this.S = i37 + 1;
            this.f38392u0 = i37;
        }
        if (z4) {
            if (min == -1 && (i10 = this.f38385p0) != -1) {
                this.f38365a.s(Math.min(i10, this.f38386q0), 2);
            } else if (min != -1 && this.f38385p0 == -1) {
                this.f38365a.t(min, 2);
            }
        }
    }
}
