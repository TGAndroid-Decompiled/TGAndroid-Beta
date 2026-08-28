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
public class bq extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public yp T0;
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
    public aq f36919a;
    public int f36920a0;
    public gh.f1 f36921b;
    public int f36922b0;
    public of.y f36923c;
    public int f36924c0;
    public FrameLayout d;
    public int f36925d0;
    public FrameLayout f36926e;
    public int f36927e0;
    public org.telegram.ui.Components.j6 f36928f;
    public int f36929f0;
    public int f36930g0;
    public org.telegram.ui.Components.fr h;
    public int f36931h0;
    public int f36932i0;
    public int f36933j0;
    public int f36934k0;
    public int f36935l0;
    public int m0;
    public long f36936n;
    public int f36937n0;
    public int f36938o0;
    public int f36939p0;
    public int f36940q0;
    public boolean f36941r;
    public int f36942r0;
    public long f36943s;
    public int f36944s0;
    public int f36945t0;
    public int f36946u0;
    public final TLRPC.User v;
    public int f36947v0;
    public TLRPC.Chat f36948w;
    public boolean f36949w0;
    public TLRPC.ChatFull f36950x;
    public int f36951x0;
    public final int f36952y;
    public int f36953y0;
    public int f36954z0;

    public bq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i9, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        boolean z14;
        float f10;
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
        this.f36943s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.f36952y = i9;
        this.E = z10;
        boolean z36 = true;
        boolean z37 = !z10;
        this.P0 = z37;
        this.K0 = z37;
        this.U0 = str2;
        this.f36948w = getMessagesController().getChat(Long.valueOf(this.f36943s));
        this.f36950x = getMessagesController().getChatFull(this.f36943s);
        if (user != null && user.bot_guard) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.Q = z12;
        String str3 = str != null ? str : "";
        this.O = str3;
        this.P = str3;
        this.B = ChatObject.isCommunity(this.f36948w);
        TLRPC.Chat chat2 = this.f36948w;
        if (chat2 != null) {
            if (ChatObject.isChannel(chat2) && !this.f36948w.megagroup) {
                z35 = true;
            } else {
                z35 = false;
            }
            this.A = z35;
            this.C = ChatObject.isForum(this.f36948w);
            this.J = this.f36948w.admin_rights;
        }
        if (this.J == null) {
            if (i9 == 2 && ((chat = this.f36948w) == null || !chat.creator)) {
                z34 = false;
            } else {
                z34 = true;
            }
            this.J = n0(z34);
        }
        if (i9 != 0 && i9 != 2) {
            if (i9 == 1) {
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
            if (i9 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
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
                if (i9 == 2) {
                    this.I = n0(false);
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
                if (i9 == 2) {
                    if (!this.A && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    this.G = z14;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.F = f10;
                    this.W0 = false;
                }
            }
            TLRPC.Chat chat3 = this.f36948w;
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
        t0(false);
    }

    public static void T(bq bqVar, long j10) {
        if (j10 != 0) {
            bqVar.f36943s = j10;
            bqVar.f36948w = MessagesController.getInstance(bqVar.currentAccount).getChat(Long.valueOf(j10));
            bqVar.q0(true);
        }
    }

    public static void U(bq bqVar, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        Runnable runnable;
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(bqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i9, int i10, int i11) {
                                        final bq bqVar2 = bq.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i9, i10, i11);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(bqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i12, int i13) {
                                                    bq bqVar3 = bq.this;
                                                    bqVar3.K.until_date = (i13 * 60) + (i12 * 3600) + time;
                                                    bqVar3.f36919a.m(bqVar3.I0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                            bqVar2.showDialog(timePickerDialog);
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
                                datePickerDialog.setOnShowListener(new vp(0, datePicker));
                                bqVar.showDialog(datePickerDialog);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    } else {
                        bqVar.K.until_date = ConnectionsManager.getInstance(bqVar.currentAccount).getCurrentTime() + 2592000;
                        bqVar.f36919a.m(bqVar.I0);
                    }
                } else {
                    bqVar.K.until_date = ConnectionsManager.getInstance(bqVar.currentAccount).getCurrentTime() + 604800;
                    bqVar.f36919a.m(bqVar.I0);
                }
            } else {
                bqVar.K.until_date = ConnectionsManager.getInstance(bqVar.currentAccount).getCurrentTime() + 86400;
                bqVar.f36919a.m(bqVar.I0);
            }
        } else {
            bqVar.K.until_date = 0;
            bqVar.f36919a.m(bqVar.I0);
        }
        runnable = a3Var.f22713a.dismissRunnable;
        runnable.run();
    }

    public static boolean V(bq bqVar, TLRPC.TL_error tL_error) {
        bqVar.s0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!ChatObject.isChannel(bqVar.f36948w)) {
                zf.j0 j0Var = new zf.j0(11, bqVar.currentAccount, bqVar.getParentActivity(), bqVar, bqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(bqVar.v);
                j0Var.I1(bqVar.f36948w, arrayList, null, null, null);
                j0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void W(org.telegram.ui.bq r23, android.content.Context r24, android.view.View r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq.W(org.telegram.ui.bq, android.content.Context, android.view.View, int):void");
    }

    public static void X(bq bqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i9;
        int i10;
        int dp;
        int i11;
        int i12;
        int dp2;
        int i13;
        int i14;
        boolean z10 = bqVar.A;
        TLRPC.User user = bqVar.v;
        if (tL_error != null) {
            if (bqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar.getParentActivity());
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        if (z10) {
                            c2Var.N = LocaleController.getString(R.string.EditAdminChannelTransfer);
                        } else {
                            c2Var.N = LocaleController.getString(R.string.EditAdminGroupTransfer);
                        }
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, bqVar.f36948w.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new pp(bqVar, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        bqVar.showDialog(c2Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(bqVar.currentAccount).sendRequest(new TL_account.getPassword(), new rc(9, bqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (bqVar.getParentActivity() != null && !AccountInstance.getInstance(bqVar.currentAccount).getUserConfig().isPremium()) {
                            bqVar.showDialog(new zf.j0(5, bqVar.currentAccount, bqVar.getParentActivity(), bqVar, null));
                        } else {
                            bqVar.presentFragment(new kd1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.n0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.y4.h0(tL_error, bqVar, z10, bqVar.B, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.n0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bqVar.getParentActivity());
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.N = string;
                    LinearLayout linearLayout = new LinearLayout(bqVar.getParentActivity());
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(bqVar.getParentActivity());
                    int i15 = org.telegram.ui.ActionBar.f6.f23108j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i9 = 5;
                    } else {
                        i9 = 3;
                    }
                    textView.setGravity(i9 | 48);
                    if (z10) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
                    } else {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
                    }
                    linearLayout.addView(textView, g7.e6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(bqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(bqVar.getParentActivity());
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i10 = AndroidUtilities.dp(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i10, dp3, dp, 0);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(bqVar.getParentActivity());
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                        linearLayout2.addView(imageView, g7.e6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, g7.e6.n(-2, -2));
                        linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(bqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(bqVar.getParentActivity());
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i12 = AndroidUtilities.dp(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i12, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i15, false), mode));
                    TextView textView3 = new TextView(bqVar.getParentActivity());
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, g7.e6.n(-1, -2));
                        linearLayout3.addView(imageView2, g7.e6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, g7.e6.n(-2, -2));
                        linearLayout3.addView(textView3, g7.e6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new pp(bqVar, 6));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(bqVar.getParentActivity());
                        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        textView4.setGravity(i14 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    }
                    bqVar.showDialog(c2Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            bqVar.T0.a(user);
            bqVar.removeSelfFromStack();
            twoStepVerificationActivity.n0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Y(bq bqVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = bqVar.f36950x;
        if (chatFull != null) {
            j11 = chatFull.guard_bot_id;
        } else {
            j11 = 0;
        }
        if (j11 != 0) {
            user = bqVar.getMessagesController().getUser(Long.valueOf(j11));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j10 != 0 && user2.f22527id != j10) {
            new org.telegram.ui.Components.g30(bqVar.getParentActivity(), bqVar.resourceProvider, user2, bqVar.v, new qp(bqVar, j10, 0)).show();
            return;
        }
        bqVar.f36936n = j10;
        bqVar.f36941r = true;
        bqVar.m0();
    }

    public static void Z(bq bqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            bqVar.f36943s = j10;
            bqVar.f36948w = MessagesController.getInstance(bqVar.currentAccount).getChat(Long.valueOf(j10));
            bqVar.o0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void e0(bq bqVar, View view) {
        int i9;
        int i10;
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = bqVar.O;
            if (str != null) {
                i9 = str.codePointCount(0, str.length());
            } else {
                i9 = 0;
            }
            int i11 = 16 - i9;
            if (i11 <= 4.8f) {
                m4Var.setText2(String.format("%d", Integer.valueOf(i11)));
                org.telegram.ui.ActionBar.h5 textView2 = m4Var.getTextView2();
                if (i11 < 0) {
                    i10 = org.telegram.ui.ActionBar.f6.f23212p7;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                textView2.setTag(Integer.valueOf(i10));
                return;
            }
            m4Var.setText2("");
        }
    }

    public static boolean k0(bq bqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.L;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public static TLRPC.TL_chatAdminRights n0(boolean z10) {
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

    public static TLRPC.TL_chatAdminRights r0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
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
        int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f36952y;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 29));
        if (this.E || (!this.A && this.f36948w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i11 = org.telegram.ui.ActionBar.f6.f23321v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        t7 t7Var = new t7(this, context, 1);
        this.fragmentView = t7Var;
        t7Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        gh.f1 f1Var = new gh.f1(this, context, 8);
        this.f36921b = f1Var;
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.setClipChildren(z10);
        of.y yVar = new of.y(1, false, 4);
        this.f36923c = yVar;
        yVar.E = 100;
        this.f36921b.setLayoutManager(yVar);
        gh.f1 f1Var2 = this.f36921b;
        aq aqVar = new aq(this, context);
        this.f36919a = aqVar;
        f1Var2.setAdapter(aqVar);
        f2.n nVar = new f2.n();
        if (i10 == 2) {
            this.f36921b.setResetSelectorOnChanged(false);
        }
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.f36921b.setItemAnimator(nVar);
        gh.f1 f1Var3 = this.f36921b;
        if (!LocaleController.isRTL) {
            i9 = 2;
        }
        f1Var3.setVerticalScrollbarPosition(i9);
        frameLayout.addView(this.f36921b, g7.e6.c(-1.0f, -1));
        this.f36921b.p1();
        this.actionBar.setAdaptiveBackground(this.f36921b);
        this.f36921b.setOnScrollListener(new l3(this, 6));
        this.f36921b.setOnItemClickListener(new bg.b1(9, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f36948w;
            if (chat != null && chatFull.f22381id == chat.f22380id) {
                this.f36950x = chatFull;
                m0();
            }
        } else if (i9 == NotificationCenter.dialogDeleted) {
            if ((-this.f36943s) == ((Long) objArr[0]).longValue()) {
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
        e eVar = new e(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 16, new Class[]{org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.c6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36921b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23108j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23228q5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8192, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 16384, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.E5));
        return arrayList;
    }

    public final boolean l0(boolean z10) {
        boolean equals;
        int i9 = this.f36952y;
        if (i9 != 2) {
            if (i9 == 1) {
                equals = this.N.equals(ChatObject.getBannedRightsString(this.K));
            } else {
                equals = this.P.equals(this.O);
            }
            if (!equals) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f36943s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new pp(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new pp(this, 4));
                    showDialog(c2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void m0() {
        boolean z10;
        TLRPC.User user;
        long j10;
        int i9 = this.f36930g0;
        if (i9 >= 0) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.f36923c.m(i9);
            if (s8Var != null) {
                TLRPC.ChatFull chatFull = this.f36950x;
                if (chatFull != null && (user = this.v) != null) {
                    if (this.f36941r) {
                        j10 = this.f36936n;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f22527id) {
                        z10 = true;
                        s8Var.setChecked(z10);
                        return;
                    }
                }
                z10 = false;
                s8Var.setChecked(z10);
                return;
            }
            this.f36919a.m(this.f36930g0);
        }
    }

    public final void o0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f36948w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.f36943s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f36948w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f36948w;
            tL_inputChannel.channel_id = chat.f22380id;
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
        getConnectionsManager().sendRequest(tL_channels_editCreator, new fh.h1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return l0(z10);
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
        aq aqVar = this.f36919a;
        if (aqVar != null) {
            aqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final boolean p0() {
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

    public final void q0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq.q0(boolean):void");
    }

    public final void s0(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = z10;
        this.actionBar.getBackButton().setEnabled(!this.D);
        org.telegram.ui.Components.fr frVar = this.h;
        if (frVar != null) {
            float f11 = frVar.f28558c;
            if (this.D) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.X0 = ofFloat;
            ofFloat.addUpdateListener(new rp(this, 0));
            this.X0.addListener(new xp(this, 0));
            this.X0.setDuration(Math.abs(this.h.f28558c - (this.D ? 1.0f : 0.0f)) * 150.0f);
            this.X0.start();
        }
    }

    public final void t0(boolean z10) {
        int i9;
        int min = Math.min(this.f36938o0, this.f36939p0);
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f36920a0 = -1;
        this.f36922b0 = -1;
        this.f36924c0 = -1;
        this.f36925d0 = -1;
        this.f36927e0 = -1;
        this.f36929f0 = -1;
        this.f36930g0 = -1;
        this.f36931h0 = -1;
        this.f36934k0 = -1;
        this.f36935l0 = -1;
        this.m0 = -1;
        this.f36937n0 = -1;
        this.f36938o0 = -1;
        this.f36939p0 = -1;
        this.f36940q0 = -1;
        this.f36942r0 = -1;
        this.f36944s0 = -1;
        this.f36946u0 = -1;
        this.f36947v0 = -1;
        this.J0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.f36951x0 = -1;
        this.f36953y0 = -1;
        this.f36954z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.f36945t0 = -1;
        this.f36932i0 = -1;
        this.f36933j0 = -1;
        this.R = 3;
        boolean z11 = this.B;
        boolean z12 = this.A;
        boolean z13 = this.C;
        int i10 = this.f36952y;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                this.f36946u0 = 3;
                this.R = 5;
                this.f36947v0 = 4;
                if (this.f36949w0) {
                    this.f36951x0 = 5;
                    this.f36953y0 = 6;
                    this.A0 = 7;
                    this.f36954z0 = 8;
                    this.B0 = 9;
                    this.C0 = 10;
                    this.D0 = 11;
                    this.E0 = 12;
                    this.F0 = 13;
                    this.R = 15;
                    this.f36929f0 = 14;
                }
                int i11 = this.R;
                this.f36924c0 = i11;
                this.f36925d0 = i11 + 1;
                this.f36927e0 = i11 + 2;
                int i12 = i11 + 4;
                this.R = i12;
                this.T = i11 + 3;
                if (z13) {
                    this.R = i11 + 5;
                    this.f36932i0 = i12;
                }
                int i13 = this.R;
                this.H0 = i13;
                this.R = i13 + 2;
                this.I0 = i13 + 1;
            }
        } else if (z11) {
            this.T = 3;
            this.f36933j0 = 4;
            this.Z = 5;
            this.R = 7;
            this.f36922b0 = 6;
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
            int i14 = this.R;
            int i15 = i14 + 1;
            this.R = i15;
            this.O0 = i14;
            if (this.P0) {
                this.Q0 = i15;
                this.R0 = i14 + 2;
                this.R = i14 + 4;
                this.S0 = i14 + 3;
            }
            int i16 = this.R;
            this.V = i16;
            this.W = i16 + 1;
            this.f36924c0 = i16 + 2;
            this.G0 = i16 + 3;
            this.Z = i16 + 4;
            this.R = i16 + 6;
            this.f36922b0 = i16 + 5;
        } else {
            if (i10 == 2) {
                this.R = 4;
                this.S = 3;
            }
            int i17 = this.R;
            this.T = i17;
            this.Y = i17 + 1;
            this.f36922b0 = i17 + 2;
            this.f36924c0 = i17 + 3;
            int i18 = i17 + 5;
            this.R = i18;
            this.f36925d0 = i17 + 4;
            if (i10 != 2) {
                this.R = i17 + 6;
                this.f36927e0 = i18;
            }
            if (ChatObject.isChannel(this.f36948w)) {
                int i19 = this.R;
                int i20 = i19 + 1;
                this.R = i20;
                this.O0 = i19;
                if (this.P0) {
                    this.Q0 = i20;
                    this.R0 = i19 + 2;
                    this.R = i19 + 4;
                    this.S0 = i19 + 3;
                }
            }
            int i21 = this.R;
            this.W = i21;
            this.G0 = i21 + 1;
            this.Z = i21 + 2;
            int i22 = i21 + 4;
            this.R = i22;
            this.f36920a0 = i21 + 3;
            if (z13) {
                this.R = i21 + 5;
                this.f36932i0 = i22;
            }
            if (this.Q) {
                int i23 = this.R;
                this.f36930g0 = i23;
                this.R = i23 + 2;
                this.f36931h0 = i23 + 1;
            }
        }
        boolean z14 = this.E;
        TLRPC.User user = this.v;
        if (z14) {
            if (!z12 && (i10 == 0 || ((i10 == 2 && this.G) || i10 == 1))) {
                int i24 = this.R;
                this.f36934k0 = i24;
                this.f36942r0 = i24 + 1;
                this.R = i24 + 3;
                this.f36944s0 = i24 + 2;
            }
            TLRPC.Chat chat = this.f36948w;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i25 = this.f36934k0;
                        if (i25 == -1) {
                            int i26 = this.R;
                            this.R = i26 + 1;
                            this.f36938o0 = i26;
                        }
                        int i27 = this.R;
                        int i28 = i27 + 1;
                        this.R = i28;
                        this.f36939p0 = i27;
                        if (i25 != -1) {
                            this.R = i27 + 2;
                            this.f36938o0 = i28;
                        }
                    }
                }
            }
            if (this.W0) {
                if (this.f36934k0 == -1) {
                    int i29 = this.R;
                    this.R = i29 + 1;
                    this.f36934k0 = i29;
                }
                int i30 = this.R;
                this.f36935l0 = i30;
                this.R = i30 + 2;
                this.m0 = i30 + 1;
            }
        } else if (i10 == 0) {
            if (!z12 && (!this.O.isEmpty() || (this.f36948w.creator && UserObject.isUserSelf(user)))) {
                int i31 = this.R;
                this.f36934k0 = i31;
                this.R = i31 + 2;
                this.f36942r0 = i31 + 1;
                if (this.f36948w.creator && UserObject.isUserSelf(user)) {
                    int i32 = this.R;
                    this.R = i32 + 1;
                    this.f36944s0 = i32;
                } else {
                    int i33 = this.R;
                    this.R = i33 + 1;
                    this.f36937n0 = i33;
                }
            } else {
                int i34 = this.R;
                this.R = i34 + 1;
                this.f36937n0 = i34;
            }
        } else {
            int i35 = this.R;
            this.R = i35 + 1;
            this.f36934k0 = i35;
        }
        if (i10 == 2) {
            int i36 = this.R;
            this.R = i36 + 1;
            this.f36945t0 = i36;
        }
        if (z10) {
            if (min == -1 && (i9 = this.f36938o0) != -1) {
                this.f36919a.s(Math.min(i9, this.f36939p0), 2);
            } else if (min != -1 && this.f36938o0 == -1) {
                this.f36919a.t(min, 2);
            }
        }
    }
}
