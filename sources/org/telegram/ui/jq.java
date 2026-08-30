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
public class jq extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public gq U0;
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
    public iq f35430a;
    public int f35431a0;
    public lh.e1 f35432b;
    public int f35433b0;
    public k f35434c;
    public int f35435c0;
    public FrameLayout d;
    public int f35436d0;
    public FrameLayout e;
    public int f35437e0;
    public org.telegram.ui.Components.k6 f35438f;
    public int f35439f0;
    public int f35440g0;
    public org.telegram.ui.Components.mr h;
    public int f35441h0;
    public int f35442i0;
    public int f35443j0;
    public int f35444k0;
    public int f35445l0;
    public int m0;
    public long f35446n;
    public int f35447n0;
    public int f35448o0;
    public int f35449p0;
    public int f35450q0;
    public boolean f35451r;
    public int f35452r0;
    public long f35453s;
    public int f35454s0;
    public int f35455t0;
    public int f35456u0;
    public final TLRPC.User v;
    public int f35457v0;
    public TLRPC.Chat f35458w;
    public int f35459w0;
    public TLRPC.ChatFull f35460x;
    public boolean f35461x0;
    public final int f35462y;
    public int f35463y0;
    public int f35464z0;

    public jq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z4, boolean z10, String str2) {
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
        this.f35453s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.f35462y = i10;
        this.F = z4;
        boolean z35 = true;
        boolean z36 = !z4;
        this.Q0 = z36;
        this.L0 = z36;
        this.V0 = str2;
        this.f35458w = getMessagesController().getChat(Long.valueOf(this.f35453s));
        this.f35460x = getMessagesController().getChatFull(this.f35453s);
        if (user != null && user.bot_guard) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.R = z11;
        String str3 = str != null ? str : "";
        this.P = str3;
        this.Q = str3;
        this.C = ChatObject.isCommunity(this.f35458w);
        TLRPC.Chat chat2 = this.f35458w;
        if (chat2 != null) {
            if (ChatObject.isChannel(chat2) && !this.f35458w.megagroup) {
                z34 = true;
            } else {
                z34 = false;
            }
            this.B = z34;
            this.D = ChatObject.isForum(this.f35458w);
            this.K = this.f35458w.admin_rights;
        }
        if (this.K == null) {
            if (i10 == 2 && ((chat = this.f35458w) == null || !chat.creator)) {
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
            TLRPC.Chat chat3 = this.f35458w;
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

    public static void U(jq jqVar, long j10) {
        if (j10 != 0) {
            jqVar.f35453s = j10;
            jqVar.f35458w = MessagesController.getInstance(jqVar.currentAccount).getChat(Long.valueOf(j10));
            jqVar.r0(true);
        }
    }

    public static void V(jq jqVar, org.telegram.ui.ActionBar.b3 b3Var, View view) {
        Runnable runnable;
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(jqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                                        final jq jqVar2 = jq.this;
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i10, i11, i12);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(jqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                                    jq jqVar3 = jq.this;
                                                    jqVar3.L.until_date = (i14 * 60) + (i13 * 3600) + time;
                                                    jqVar3.f35430a.m(jqVar3.J0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), (DialogInterface.OnClickListener) new Object());
                                            jqVar2.showDialog(timePickerDialog);
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
                                datePickerDialog.setOnShowListener(new eq(0, datePicker));
                                jqVar.showDialog(datePickerDialog);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    } else {
                        jqVar.L.until_date = ConnectionsManager.getInstance(jqVar.currentAccount).getCurrentTime() + 2592000;
                        jqVar.f35430a.m(jqVar.J0);
                    }
                } else {
                    jqVar.L.until_date = ConnectionsManager.getInstance(jqVar.currentAccount).getCurrentTime() + 604800;
                    jqVar.f35430a.m(jqVar.J0);
                }
            } else {
                jqVar.L.until_date = ConnectionsManager.getInstance(jqVar.currentAccount).getCurrentTime() + 86400;
                jqVar.f35430a.m(jqVar.J0);
            }
        } else {
            jqVar.L.until_date = 0;
            jqVar.f35430a.m(jqVar.J0);
        }
        runnable = b3Var.f19525a.dismissRunnable;
        runnable.run();
    }

    public static boolean W(jq jqVar, TLRPC.TL_error tL_error) {
        jqVar.t0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!ChatObject.isChannel(jqVar.f35458w)) {
                eg.v0 v0Var = new eg.v0(11, jqVar.currentAccount, jqVar.getParentActivity(), jqVar, jqVar.getResourceProvider());
                ArrayList arrayList = new ArrayList();
                arrayList.add(jqVar.v);
                v0Var.I1(jqVar.f35458w, arrayList, null, null, null);
                v0Var.show();
            }
            return false;
        }
        return true;
    }

    public static void X(org.telegram.ui.jq r23, android.content.Context r24, android.view.View r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq.X(org.telegram.ui.jq, android.content.Context, android.view.View, int):void");
    }

    public static void Y(jq jqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        boolean z4 = jqVar.B;
        TLRPC.User user = jqVar.v;
        if (tL_error != null) {
            if (jqVar.getParentActivity() != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jqVar.getParentActivity());
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        if (z4) {
                            d2Var.O = LocaleController.getString(R.string.EditAdminChannelTransfer);
                        } else {
                            d2Var.O = LocaleController.getString(R.string.EditAdminGroupTransfer);
                        }
                        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, jqVar.f35458w.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new yp(jqVar, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        jqVar.showDialog(d2Var);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(jqVar.currentAccount).sendRequest(new TL_account.getPassword(), new lo(2, jqVar, twoStepVerificationActivity), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (jqVar.getParentActivity() != null && !AccountInstance.getInstance(jqVar.currentAccount).getUserConfig().isPremium()) {
                            jqVar.showDialog(new eg.v0(5, jqVar.currentAccount, jqVar.getParentActivity(), jqVar, null));
                        } else {
                            jqVar.presentFragment(new yd1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.z4.h0(tL_error, jqVar, z4, jqVar.C, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(jqVar.getParentActivity());
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                    d2Var2.O = string;
                    LinearLayout linearLayout = new LinearLayout(jqVar.getParentActivity());
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(jqVar.getParentActivity());
                    int i16 = org.telegram.ui.ActionBar.j6.f20012j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
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
                    linearLayout.addView(textView, k7.b6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(jqVar.getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(jqVar.getParentActivity());
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
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(jqVar.getParentActivity());
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, k7.b6.n(-1, -2));
                        linearLayout2.addView(imageView, k7.b6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, k7.b6.n(-2, -2));
                        linearLayout2.addView(textView2, k7.b6.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(jqVar.getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(jqVar.getParentActivity());
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(jqVar.getParentActivity());
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, k7.b6.n(-1, -2));
                        linearLayout3.addView(imageView2, k7.b6.q(-2, -2, 5));
                    } else {
                        linearLayout3.addView(imageView2, k7.b6.n(-2, -2));
                        linearLayout3.addView(textView3, k7.b6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new yp(jqVar, 6));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(jqVar.getParentActivity());
                        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    }
                    jqVar.showDialog(d2Var2);
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            jqVar.U0.a(user);
            jqVar.removeSelfFromStack();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void Z(jq jqVar, long j10) {
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = jqVar.f35460x;
        if (chatFull != null) {
            j11 = chatFull.guard_bot_id;
        } else {
            j11 = 0;
        }
        if (j11 != 0) {
            user = jqVar.getMessagesController().getUser(Long.valueOf(j11));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j10 != 0 && user2.f19331id != j10) {
            new org.telegram.ui.Components.y30(jqVar.getParentActivity(), jqVar.resourceProvider, user2, jqVar.v, new zp(jqVar, j10, 0)).show();
            return;
        }
        jqVar.f35446n = j10;
        jqVar.f35451r = true;
        jqVar.n0();
    }

    public static void a0(jq jqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            jqVar.f35453s = j10;
            jqVar.f35458w = MessagesController.getInstance(jqVar.currentAccount).getChat(Long.valueOf(j10));
            jqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(jq jqVar, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = jqVar.P;
            if (str != null) {
                i10 = str.codePointCount(0, str.length());
            } else {
                i10 = 0;
            }
            int i12 = 16 - i10;
            if (i12 <= 4.8f) {
                m4Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.k5 textView2 = m4Var.getTextView2();
                if (i12 < 0) {
                    i11 = org.telegram.ui.ActionBar.j6.f20122p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.A6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            m4Var.setText2("");
        }
    }

    public static boolean l0(jq jqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = jqVar.M;
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
        int i11 = this.f35462y;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 21));
        if (this.F || (!this.B && this.f35458w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i12 = org.telegram.ui.ActionBar.j6.f20227v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.mr(mutate, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        lh.e1 e1Var = new lh.e1(this, context, 6);
        this.f35432b = e1Var;
        if (i11 != 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        e1Var.setClipChildren(z4);
        k kVar = new k(1, false, 3);
        this.f35434c = kVar;
        kVar.E = 100;
        this.f35432b.setLayoutManager(kVar);
        lh.e1 e1Var2 = this.f35432b;
        iq iqVar = new iq(this, context);
        this.f35430a = iqVar;
        e1Var2.setAdapter(iqVar);
        f2.l lVar = new f2.l();
        if (i11 == 2) {
            this.f35432b.setResetSelectorOnChanged(false);
        }
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.n(350L);
        this.f35432b.setItemAnimator(lVar);
        lh.e1 e1Var3 = this.f35432b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        e1Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f35432b, k7.b6.c(-1.0f, -1));
        this.f35432b.p1();
        this.actionBar.setAdaptiveBackground(this.f35432b);
        this.f35432b.setOnScrollListener(new l3(this, 6));
        this.f35432b.setOnItemClickListener(new gg.v0(8, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.f35458w;
            if (chat != null && chatFull.f19185id == chat.f19184id) {
                this.f35460x = chatFull;
                n0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.f35453s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var != null && e5Var.getLastFragment() == this) {
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 16, new Class[]{org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.c6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.f20122p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f20298z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 8388608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35432b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20012j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20139q5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8192, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 16384, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z4) {
        boolean equals;
        int i10 = this.f35462y;
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
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = string;
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f35453s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new yp(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new yp(this, 4));
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
        int i10 = this.f35441h0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.f35434c.m(i10);
            if (r8Var != null) {
                TLRPC.ChatFull chatFull = this.f35460x;
                if (chatFull != null && (user = this.v) != null) {
                    if (this.f35451r) {
                        j10 = this.f35446n;
                    } else {
                        j10 = chatFull.guard_bot_id;
                    }
                    if (j10 == user.f19331id) {
                        z4 = true;
                        r8Var.setChecked(z4);
                        return;
                    }
                }
                z4 = false;
                r8Var.setChecked(z4);
                return;
            }
            this.f35430a.m(this.f35441h0);
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
        iq iqVar = this.f35430a;
        if (iqVar != null) {
            iqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.f35458w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.f35453s, this, new d7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.f35458w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.f35458w;
            tL_inputChannel.channel_id = chat.f19184id;
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
        getConnectionsManager().sendRequest(tL_channels_editCreator, new kh.b1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 9));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq.r0(boolean):void");
    }

    public final void t0(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.E = z4;
        this.actionBar.getBackButton().setEnabled(!this.E);
        org.telegram.ui.Components.mr mrVar = this.h;
        if (mrVar != null) {
            float f11 = mrVar.f27111c;
            if (this.E) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.Y0 = ofFloat;
            ofFloat.addUpdateListener(new aq(this, 0));
            this.Y0.addListener(new s5(this, 23));
            this.Y0.setDuration(Math.abs(this.h.f27111c - (this.E ? 1.0f : 0.0f)) * 150.0f);
            this.Y0.start();
        }
    }

    public final void u0(boolean z4) {
        int i10;
        int min = Math.min(this.f35449p0, this.f35450q0);
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f35431a0 = -1;
        this.f35433b0 = -1;
        this.f35435c0 = -1;
        this.f35436d0 = -1;
        this.f35437e0 = -1;
        this.f35439f0 = -1;
        this.f35440g0 = -1;
        this.f35441h0 = -1;
        this.f35442i0 = -1;
        this.f35445l0 = -1;
        this.m0 = -1;
        this.f35447n0 = -1;
        this.f35448o0 = -1;
        this.f35449p0 = -1;
        this.f35450q0 = -1;
        this.f35452r0 = -1;
        this.f35454s0 = -1;
        this.f35455t0 = -1;
        this.f35457v0 = -1;
        this.f35459w0 = -1;
        this.K0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.f35463y0 = -1;
        this.f35464z0 = -1;
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
        this.f35456u0 = -1;
        this.f35443j0 = -1;
        this.f35444k0 = -1;
        this.S = 3;
        boolean z10 = this.C;
        boolean z11 = this.B;
        boolean z12 = this.D;
        int i11 = this.f35462y;
        if (i11 != 0 && i11 != 2) {
            if (i11 == 1) {
                this.f35457v0 = 3;
                this.S = 5;
                this.f35459w0 = 4;
                if (this.f35461x0) {
                    this.f35463y0 = 5;
                    this.f35464z0 = 6;
                    this.B0 = 7;
                    this.A0 = 8;
                    this.C0 = 9;
                    this.D0 = 10;
                    this.E0 = 11;
                    this.F0 = 12;
                    this.G0 = 13;
                    this.S = 15;
                    this.f35440g0 = 14;
                }
                int i12 = this.S;
                this.f35436d0 = i12;
                this.f35437e0 = i12 + 1;
                this.f35439f0 = i12 + 2;
                int i13 = i12 + 4;
                this.S = i13;
                this.U = i12 + 3;
                if (z12) {
                    this.S = i12 + 5;
                    this.f35443j0 = i13;
                }
                int i14 = this.S;
                this.I0 = i14;
                this.S = i14 + 2;
                this.J0 = i14 + 1;
            }
        } else if (z10) {
            this.U = 3;
            this.f35444k0 = 4;
            this.f35431a0 = 5;
            this.S = 7;
            this.f35435c0 = 6;
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
            this.f35436d0 = i17 + 2;
            this.H0 = i17 + 3;
            this.f35431a0 = i17 + 4;
            this.S = i17 + 6;
            this.f35435c0 = i17 + 5;
        } else {
            if (i11 == 2) {
                this.S = 4;
                this.T = 3;
            }
            int i18 = this.S;
            this.U = i18;
            this.Z = i18 + 1;
            this.f35435c0 = i18 + 2;
            this.f35436d0 = i18 + 3;
            int i19 = i18 + 5;
            this.S = i19;
            this.f35437e0 = i18 + 4;
            if (i11 != 2) {
                this.S = i18 + 6;
                this.f35439f0 = i19;
            }
            if (ChatObject.isChannel(this.f35458w)) {
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
            this.f35431a0 = i22 + 2;
            int i23 = i22 + 4;
            this.S = i23;
            this.f35433b0 = i22 + 3;
            if (z12) {
                this.S = i22 + 5;
                this.f35443j0 = i23;
            }
            if (this.R) {
                int i24 = this.S;
                this.f35441h0 = i24;
                this.S = i24 + 2;
                this.f35442i0 = i24 + 1;
            }
        }
        boolean z13 = this.F;
        TLRPC.User user = this.v;
        if (z13) {
            if (!z11 && (i11 == 0 || ((i11 == 2 && this.H) || i11 == 1))) {
                int i25 = this.S;
                this.f35445l0 = i25;
                this.f35454s0 = i25 + 1;
                this.S = i25 + 3;
                this.f35455t0 = i25 + 2;
            }
            TLRPC.Chat chat = this.f35458w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.J;
                if (!z11 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z12 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z10) {
                        int i26 = this.f35445l0;
                        if (i26 == -1) {
                            int i27 = this.S;
                            this.S = i27 + 1;
                            this.f35449p0 = i27;
                        }
                        int i28 = this.S;
                        int i29 = i28 + 1;
                        this.S = i29;
                        this.f35450q0 = i28;
                        if (i26 != -1) {
                            this.S = i28 + 2;
                            this.f35449p0 = i29;
                        }
                    }
                }
            }
            if (this.X0) {
                if (this.f35445l0 == -1) {
                    int i30 = this.S;
                    this.S = i30 + 1;
                    this.f35445l0 = i30;
                }
                int i31 = this.S;
                this.m0 = i31;
                this.S = i31 + 2;
                this.f35447n0 = i31 + 1;
            }
        } else if (i11 == 0) {
            if (!z11 && (!this.P.isEmpty() || (this.f35458w.creator && UserObject.isUserSelf(user)))) {
                int i32 = this.S;
                this.f35445l0 = i32;
                this.S = i32 + 2;
                this.f35454s0 = i32 + 1;
                if (this.f35458w.creator && UserObject.isUserSelf(user)) {
                    int i33 = this.S;
                    this.S = i33 + 1;
                    this.f35455t0 = i33;
                } else {
                    int i34 = this.S;
                    this.S = i34 + 1;
                    this.f35448o0 = i34;
                }
            } else {
                int i35 = this.S;
                this.S = i35 + 1;
                this.f35448o0 = i35;
            }
        } else {
            int i36 = this.S;
            this.S = i36 + 1;
            this.f35445l0 = i36;
        }
        if (i11 == 2) {
            int i37 = this.S;
            this.S = i37 + 1;
            this.f35456u0 = i37;
        }
        if (z4) {
            if (min == -1 && (i10 = this.f35449p0) != -1) {
                this.f35430a.s(Math.min(i10, this.f35450q0), 2);
            } else if (min != -1 && this.f35449p0 == -1) {
                this.f35430a.t(min, 2);
            }
        }
    }
}
