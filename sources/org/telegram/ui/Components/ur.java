package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ur extends qa {
    public static final int C0 = 0;
    public boolean A0;
    public float B0;
    public b51 T;
    public final TLRPC.Chat U;
    public final TLRPC.Chat V;
    public final boolean W;
    public final ArrayList X;
    public final long Y;
    public final int Z;

    public final int f33169a0;

    public final Runnable f33170b0;

    public boolean f33171c0;

    public final boolean f33172d0;

    public final tr f33173e0;

    public final tr f33174f0;

    public final tr f33175g0;

    public final tr f33176h0;

    public final boolean[] f33177i0;

    public final boolean[] f33178j0;

    public final boolean f33179k0;

    public boolean f33180l0;
    public final long m0;

    public TL_communities.ParticipantJoinedChats f33181n0;

    public int[] f33182o0;

    public boolean f33183p0;

    public boolean f33184q0;

    public final TLRPC.TL_chatBannedRights f33185r0;

    public final TLRPC.TL_chatBannedRights f33186s0;

    public final ArrayList f33187t0;

    public boolean f33188u0;

    public final boolean f33189v0;

    public final boolean f33190w0;

    public boolean f33191x0;

    public boolean f33192y0;

    public boolean f33193z0;

    public ur(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j10, int i10, int i11, boolean z10, Runnable runnable) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        super(n2Var.getContext(), n2Var, false, false, false, false, true, 2, n2Var.getResourceProvider());
        this.f33171c0 = false;
        this.f33183p0 = false;
        this.f33184q0 = false;
        this.f33188u0 = true;
        this.f33191x0 = true;
        this.f33192y0 = false;
        this.f33193z0 = false;
        this.B0 = 10.0f;
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        this.f31860y = true;
        fixNavigationBar();
        this.K = true;
        this.f33190w0 = z10;
        zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, this.C, i12, AndroidUtilities.dp(63.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new qr(this, 1));
        this.K = true;
        sr srVar = new sr(this);
        srVar.f5819m = false;
        srVar.C = false;
        srVar.o(er.h);
        srVar.n(350L);
        this.d.setItemAnimator(srVar);
        this.d.p1();
        lh.d dVar = new lh.d(getContext(), this.resourcesProvider, true);
        dVar.e();
        dVar.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        dVar.setOnClickListener(new f0(this, 11));
        this.containerView.addView(dVar, h7.z5.f(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.U = chat;
        this.W = ChatObject.isForum(chat);
        this.X = arrayList;
        this.Y = j10;
        this.Z = i10;
        this.f33169a0 = i11;
        this.f33170b0 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.f33185r0 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.f33186s0 = tL_chatBannedRights4;
        if (tL_chatBannedRights3.view_messages) {
            tL_chatBannedRights4.view_messages = true;
        }
        if (tL_chatBannedRights3.send_messages) {
            tL_chatBannedRights4.send_messages = true;
        }
        if (tL_chatBannedRights3.send_media) {
            tL_chatBannedRights4.send_media = true;
        }
        if (tL_chatBannedRights3.send_stickers) {
            tL_chatBannedRights4.send_stickers = true;
        }
        if (tL_chatBannedRights3.send_gifs) {
            tL_chatBannedRights4.send_gifs = true;
        }
        if (tL_chatBannedRights3.send_games) {
            tL_chatBannedRights4.send_games = true;
        }
        if (tL_chatBannedRights3.send_inline) {
            tL_chatBannedRights4.send_inline = true;
        }
        if (tL_chatBannedRights3.embed_links) {
            tL_chatBannedRights4.embed_links = true;
        }
        if (tL_chatBannedRights3.send_polls) {
            tL_chatBannedRights4.send_polls = true;
        }
        if (tL_chatBannedRights3.invite_users) {
            tL_chatBannedRights4.invite_users = true;
        }
        if (tL_chatBannedRights3.change_info) {
            tL_chatBannedRights4.change_info = true;
        }
        if (tL_chatBannedRights3.pin_messages) {
            tL_chatBannedRights4.pin_messages = true;
        }
        if (tL_chatBannedRights3.manage_topics) {
            tL_chatBannedRights4.manage_topics = true;
        }
        if (tL_chatBannedRights3.send_photos) {
            tL_chatBannedRights4.send_photos = true;
        }
        if (tL_chatBannedRights3.send_videos) {
            tL_chatBannedRights4.send_videos = true;
        }
        if (tL_chatBannedRights3.send_audios) {
            tL_chatBannedRights4.send_audios = true;
        }
        if (tL_chatBannedRights3.send_docs) {
            tL_chatBannedRights4.send_docs = true;
        }
        if (tL_chatBannedRights3.send_voices) {
            tL_chatBannedRights4.send_voices = true;
        }
        if (tL_chatBannedRights3.send_roundvideos) {
            tL_chatBannedRights4.send_roundvideos = true;
        }
        if (tL_chatBannedRights3.send_plain) {
            tL_chatBannedRights4.send_plain = true;
        }
        if (tL_chatBannedRights3.send_reactions) {
            tL_chatBannedRights4.send_reactions = true;
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings();
        this.f33173e0 = new tr(this, 0, arrayList2);
        this.f33174f0 = new tr(this, 1, arrayList2);
        this.f33175g0 = new tr(this, 3, arrayList2);
        boolean z11 = arrayList2.size() == 1;
        this.f33189v0 = z11;
        this.f33172d0 = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.V = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.V, 2) && ChatObject.canUserDoAdminAction(this.V, 27) && z11) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.m0 = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.V.f22380id, dialogId, new mr(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.f33177i0 = new boolean[arrayList2.size()];
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i13 < channelParticipantArr.length ? channelParticipantArr[i13] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.f33177i0[i13] = true;
                }
                i13++;
            }
            this.f33178j0 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.f33185r0;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.W) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i14 < channelParticipantArr.length ? channelParticipantArr[i14] : null;
                    if (!(arrayList2.get(i14) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.f33185r0;
                            if ((!tL_chatBannedRights.send_stickers && !tL_chatBannedRights6.send_stickers) || ((!tL_chatBannedRights.send_gifs && !tL_chatBannedRights6.send_gifs) || ((!tL_chatBannedRights.send_games && !tL_chatBannedRights6.send_games) || ((!tL_chatBannedRights.send_inline && !tL_chatBannedRights6.send_inline) || ((!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights6.embed_links && !tL_chatBannedRights6.send_plain) || ((!tL_chatBannedRights.send_polls && !tL_chatBannedRights6.send_polls) || ((!tL_chatBannedRights.send_reactions && !tL_chatBannedRights6.send_reactions) || ((!tL_chatBannedRights.change_info && !tL_chatBannedRights6.change_info) || ((!tL_chatBannedRights.invite_users && !tL_chatBannedRights6.invite_users) || ((!tL_chatBannedRights.pin_messages && !tL_chatBannedRights6.pin_messages) || ((!tL_chatBannedRights.manage_topics && !tL_chatBannedRights6.manage_topics && this.W) || ((!tL_chatBannedRights.send_photos && !tL_chatBannedRights6.send_photos) || ((!tL_chatBannedRights.send_videos && !tL_chatBannedRights6.send_videos) || ((!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights6.send_roundvideos) || ((!tL_chatBannedRights.send_audios && !tL_chatBannedRights6.send_audios) || ((!tL_chatBannedRights.send_voices && !tL_chatBannedRights6.send_voices) || ((!tL_chatBannedRights.send_docs && !tL_chatBannedRights6.send_docs) || (!tL_chatBannedRights.send_plain && !tL_chatBannedRights6.send_plain)))))))))))))))))) {
                                if (this.f33177i0[i14]) {
                                    this.f33178j0[i14] = true;
                                    this.f33179k0 = true;
                                }
                            }
                        } else if (this.f33177i0[i14]) {
                            this.f33178j0[i14] = true;
                            this.f33179k0 = true;
                        }
                    }
                    i14++;
                }
            }
            this.f33187t0 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new org.telegram.ui.l8(3)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
            tr trVar = new tr(this, 2, arrayList2);
            this.f33176h0 = trVar;
            boolean[] zArr = this.f33177i0;
            if (trVar.f32865g != 0) {
                trVar.f32863e = zArr;
                trVar.f();
                trVar.g();
            }
        } else {
            this.f33176h0 = new tr(this, 2, new ArrayList(0));
        }
        this.T.N(false);
        this.f31853e.setTitle(z());
    }

    public static void P(ur urVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            urVar.f33182o0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(urVar.X).filter(new rr(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            urVar.f33183p0 = false;
            urVar.f33184q0 = true;
            urVar.O();
        }
    }

    public static void Q(ur urVar) {
        boolean z10;
        CharSequence pluralString;
        Context context = urVar.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = urVar.resourcesProvider;
        int i10 = urVar.currentAccount;
        long j10 = urVar.m0;
        ArrayList<Long> arrayList = urVar.f33181n0.joined_chat_ids;
        boolean z11 = false;
        qr qrVar = new qr(urVar, 0 == true ? 1 : 0);
        Pattern pattern = y4.f34802a;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(linearLayoutG);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Long l10 = arrayList.get(i11);
            i11++;
            Long l11 = l10;
            long jLongValue = l11.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(l11);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(jLongValue);
            if (chat != null) {
                hh.h1 h1Var = new hh.h1(context, c6Var, z11);
                int i12 = size;
                ((TextView) h1Var.f9370b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) h1Var.d;
                if (chatFull != null) {
                    z10 = false;
                    pluralString = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    z10 = false;
                    pluralString = null;
                }
                textView.setText(pluralString);
                ((n9) h1Var.f9371c).e(chat, new y8(chat));
                h1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(z10));
                h1Var.setOnClickListener(new hh.s2(b2VarArr, qrVar, jLongValue, 3));
                linearLayoutG.addView(h1Var, h7.z5.n(-1, -2));
                context = context;
                size = i12;
                z11 = false;
            }
        }
        b2VarArr[0] = b2Var;
        b2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f33185r0;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void T(ArrayList arrayList, tr trVar) {
        boolean zC = trVar.c();
        int i10 = trVar.f32865g;
        int i11 = trVar.f32860a;
        if (zC) {
            if (!trVar.b()) {
                n41 n41VarY = n41.y(i11, trVar.f32861b);
                n41VarY.K(trVar.f32866i > 0);
                arrayList.add(n41VarY);
                return;
            }
            String str = trVar.f32861b;
            int i12 = trVar.f32866i;
            if (i12 <= 0) {
                i12 = trVar.f32863e != null ? trVar.h : i10;
            }
            String strValueOf = String.valueOf(i12);
            n41 n41Var = new n41(36);
            n41Var.d = i11;
            n41Var.f30844l = str;
            n41Var.f30847o = strValueOf;
            n41Var.K(trVar.f32866i > 0);
            n41Var.f30839f = trVar.f32864f;
            n41Var.D = new q2(16, this, trVar);
            arrayList.add(n41Var);
            if (trVar.f32864f) {
                return;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                boolean[] zArr = trVar.f32863e;
                if (zArr == null || zArr[i13]) {
                    TLObject tLObject = (TLObject) trVar.f32862c.get(i13);
                    n41 n41Var2 = new n41(37);
                    n41Var2.d = (i11 << 24) | i13;
                    n41Var2.G = tLObject;
                    n41Var2.K(trVar.d[i13]);
                    n41Var2.f30841i = 1;
                    arrayList.add(n41Var2);
                }
            }
        }
    }

    public final void U() {
        if (this.f33184q0) {
            O();
            return;
        }
        if (this.f33183p0) {
            return;
        }
        this.f33183p0 = true;
        tr trVar = this.f33174f0;
        int i10 = trVar.f32865g;
        this.f33182o0 = new int[i10];
        int[] iArr = {i10};
        for (int i11 = 0; i11 < trVar.f32865g; i11++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.U);
            tL_messages_search.f22489q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) trVar.f32862c.get(i11));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new jh.b8(this, inputPeer, i11, iArr, 4));
        }
    }

    public final void V() {
        boolean z10 = this.f33171c0;
        tr trVar = this.f33176h0;
        if (z10 && trVar.c()) {
            this.A0 = trVar.f32866i > 0;
        }
        if (this.f33171c0 && trVar.c() && trVar.f32866i == 0) {
            trVar.d();
        } else if (!this.f33171c0 && trVar.c()) {
            if (this.A0 != (trVar.f32866i > 0)) {
                trVar.d();
            }
        }
        if (this.f33171c0 || !trVar.c()) {
            return;
        }
        this.A0 = trVar.f32866i > 0;
    }

    public final void W(boolean z10) {
        final int i10;
        long j10;
        boolean[] zArr;
        boolean[] zArr2;
        ?? r10;
        boolean[] zArr3;
        boolean[] zArr4;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j12;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        boolean z11;
        CharSequence pluralString;
        final int i11 = 2;
        long j13 = this.m0;
        boolean z12 = true;
        if (z10 && this.f33180l0 && (participantJoinedChats = this.f33181n0) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            int i12 = this.currentAccount;
            ArrayList<Long> arrayList = this.f33181n0.creator_chat_ids;
            qr qrVar = new qr(this, i11);
            nr nrVar = new nr(this, 0);
            Pattern pattern = y4.f34802a;
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
            org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i12, j13)));
            alertDialog$Builder.k(LocaleController.getString(R.string.Ban), new s(nrVar, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.n(linearLayoutG);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Long l10 = arrayList.get(i13);
                i13++;
                long jLongValue = l10.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(l10);
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(jLongValue);
                if (chat != null) {
                    hh.h1 h1Var = new hh.h1(context, c6Var, z12);
                    int i14 = size;
                    ((TextView) h1Var.f9370b).setText(DialogObject.getName(chat));
                    TextView textView = (TextView) h1Var.d;
                    if (chatFull != null) {
                        int i15 = chatFull.participants_count;
                        z11 = false;
                        pluralString = LocaleController.formatPluralString("Members", i15, new Object[0]);
                    } else {
                        z11 = false;
                        pluralString = null;
                    }
                    textView.setText(pluralString);
                    ((n9) h1Var.f9371c).e(chat, new y8(chat));
                    h1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(z11));
                    LinearLayout linearLayout = linearLayoutG;
                    h1Var.setOnClickListener(new hh.s2(b2VarArr, qrVar, jLongValue, 2));
                    linearLayout.addView(h1Var, h7.z5.n(-1, -2));
                    linearLayoutG = linearLayout;
                    size = i14;
                    z12 = true;
                }
            }
            b2VarArr[0] = b2Var;
            b2Var.show();
            TextView textView2 = (TextView) b2Var.d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.f33170b0;
        if (runnable != null) {
            runnable.run();
        }
        tr trVar = this.f33173e0;
        String string2 = trVar.f32866i > 0 ? "" + LocaleController.formatPluralString("UsersReported", trVar.f32866i, new Object[0]) : "";
        tr trVar2 = this.f33176h0;
        if (trVar2.f32866i > 0) {
            if (!TextUtils.isEmpty(string2)) {
                string2 = s3.c.l(string2, "\n");
            }
            if (this.f33171c0) {
                StringBuilder sbO = com.google.android.recaptcha.internal.a.o(string2);
                sbO.append(LocaleController.formatPluralString("UsersRestricted", trVar2.f32866i, new Object[0]));
                string2 = sbO.toString();
            } else {
                StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(string2);
                sbO2.append(LocaleController.formatPluralString("UsersBanned", trVar2.f32866i, new Object[0]));
                string2 = sbO2.toString();
            }
        }
        boolean z13 = this.f33190w0;
        boolean z14 = z13 && !this.f33192y0;
        int i16 = trVar2.f32866i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean zIsEmpty = TextUtils.isEmpty(string2);
        org.telegram.ui.ActionBar.n2 n2Var = this.f31855n;
        if (zIsEmpty) {
            org.telegram.messenger.y1.q(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, mc.a0(n2Var), i16, 36);
        } else {
            mc.a0(n2Var).M(LocaleController.getString(z14 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), string2, i16).j();
        }
        long j14 = 0;
        if (j13 == 0 || !this.f33180l0) {
            i10 = 0;
        } else {
            i10 = 0;
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.V.f22380id, this.m0, true, new or(i10));
        }
        ArrayList arrayList2 = this.X;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {

            public final ur f31655b;

            {
                this.f31655b = this;
            }

            public Predicate and(Predicate predicate) {
                int i17 = i10;
                return Predicate$CC.$default$and(this, predicate);
            }

            public Predicate negate() {
                switch (i10) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                return Predicate$CC.$default$negate(this);
            }

            public Predicate or(Predicate predicate) {
                int i17 = i10;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i10) {
                    case 0:
                        long j15 = this.f31655b.Y;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        return !(peer == null || peer.chat_id == (-j15)) || j15 == 0;
                    case 1:
                        ur urVar = this.f31655b;
                        urVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j16 = peer2.chat_id;
                            long j17 = urVar.Y;
                            if (j16 == (-j17) && j17 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        ur urVar2 = this.f31655b;
                        urVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        return (peer3 == null || peer3.chat_id == (-urVar2.Y)) ? false : true;
                }
            }
        }).map(new org.telegram.ui.l8(i11)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
        final int i17 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {

            public final ur f31655b;

            {
                this.f31655b = this;
            }

            public Predicate and(Predicate predicate) {
                int i18 = i17;
                return Predicate$CC.$default$and(this, predicate);
            }

            public Predicate negate() {
                switch (i17) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                return Predicate$CC.$default$negate(this);
            }

            public Predicate or(Predicate predicate) {
                int i18 = i17;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i17) {
                    case 0:
                        long j15 = this.f31655b.Y;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        return !(peer == null || peer.chat_id == (-j15)) || j15 == 0;
                    case 1:
                        ur urVar = this.f31655b;
                        urVar.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j16 = peer2.chat_id;
                            long j17 = urVar.Y;
                            if (j16 == (-j17) && j17 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        ur urVar2 = this.f31655b;
                        urVar2.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        return (peer3 == null || peer3.chat_id == (-urVar2.Y)) ? false : true;
                }
            }
        }).map(new org.telegram.ui.l8(i11)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
        TLRPC.Chat chat2 = this.U;
        tr trVar3 = this.f33174f0;
        if (z13) {
            if (!this.f33193z0) {
                int i18 = 0;
                while (i18 < trVar3.f32865g) {
                    boolean[] zArr5 = trVar3.f32863e;
                    if (zArr5 == null || zArr5[i18]) {
                        long dialogId = DialogObject.getDialogId((TLObject) trVar3.f32862c.get(i18));
                        int size2 = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            Integer num = arrayList3.get(i19);
                            i19++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-chat2.f22380id, dialogId, num.intValue());
                            j14 = j14;
                        }
                        j12 = j14;
                        int size3 = arrayList4.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            Integer num2 = arrayList4.get(i20);
                            i20++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.Y, dialogId, num2.intValue());
                        }
                    } else {
                        j12 = j14;
                    }
                    i18++;
                    j14 = j12;
                }
            }
            j10 = j14;
        } else {
            j10 = 0;
            if (!arrayList3.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.f22380id, this.Z, false, this.f33169a0);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.Y, this.Z, true, this.f33169a0);
            }
        }
        for (int i21 = 0; i21 < trVar2.f32865g; i21++) {
            if (trVar2.d[i21] && ((zArr4 = trVar2.f32863e) == null || zArr4[i21])) {
                TLObject tLObject = (TLObject) trVar2.f32862c.get(i21);
                long j15 = chat2.f22380id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j16 = chat2.linked_monoforum_id;
                    if (j16 != j10) {
                        j11 = j16;
                    } else {
                        j11 = j15;
                    }
                } else {
                    j11 = j15;
                }
                if (this.f33171c0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.f33187t0.get(i21);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.f33186s0;
                    if (tL_chatBannedRights3 == null) {
                        tL_chatBannedRights = tL_chatBannedRights2;
                    } else if (tL_chatBannedRights2 == null) {
                        tL_chatBannedRights = tL_chatBannedRights3;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                        tL_chatBannedRights4.view_messages = tL_chatBannedRights3.view_messages || tL_chatBannedRights2.view_messages;
                        tL_chatBannedRights4.send_messages = tL_chatBannedRights3.send_messages || tL_chatBannedRights2.send_messages;
                        tL_chatBannedRights4.send_media = tL_chatBannedRights3.send_media || tL_chatBannedRights2.send_media;
                        tL_chatBannedRights4.send_stickers = tL_chatBannedRights3.send_stickers || tL_chatBannedRights2.send_stickers;
                        tL_chatBannedRights4.send_gifs = tL_chatBannedRights3.send_gifs || tL_chatBannedRights2.send_gifs;
                        tL_chatBannedRights4.send_games = tL_chatBannedRights3.send_games || tL_chatBannedRights2.send_games;
                        tL_chatBannedRights4.send_inline = tL_chatBannedRights3.send_inline || tL_chatBannedRights2.send_inline;
                        tL_chatBannedRights4.embed_links = tL_chatBannedRights3.embed_links || tL_chatBannedRights2.embed_links;
                        tL_chatBannedRights4.send_polls = tL_chatBannedRights3.send_polls || tL_chatBannedRights2.send_polls;
                        tL_chatBannedRights4.send_reactions = tL_chatBannedRights3.send_reactions || tL_chatBannedRights2.send_reactions;
                        tL_chatBannedRights4.change_info = tL_chatBannedRights3.change_info || tL_chatBannedRights2.change_info;
                        tL_chatBannedRights4.invite_users = tL_chatBannedRights3.invite_users || tL_chatBannedRights2.invite_users;
                        tL_chatBannedRights4.pin_messages = tL_chatBannedRights3.pin_messages || tL_chatBannedRights2.pin_messages;
                        tL_chatBannedRights4.manage_topics = tL_chatBannedRights3.manage_topics || tL_chatBannedRights2.manage_topics;
                        tL_chatBannedRights4.send_photos = tL_chatBannedRights3.send_photos || tL_chatBannedRights2.send_photos;
                        tL_chatBannedRights4.send_videos = tL_chatBannedRights3.send_videos || tL_chatBannedRights2.send_videos;
                        tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights3.send_roundvideos || tL_chatBannedRights2.send_roundvideos;
                        tL_chatBannedRights4.send_audios = tL_chatBannedRights3.send_audios || tL_chatBannedRights2.send_audios;
                        tL_chatBannedRights4.send_voices = tL_chatBannedRights3.send_voices || tL_chatBannedRights2.send_voices;
                        tL_chatBannedRights4.send_docs = tL_chatBannedRights3.send_docs || tL_chatBannedRights2.send_docs;
                        tL_chatBannedRights4.send_plain = tL_chatBannedRights3.send_plain || tL_chatBannedRights2.send_plain;
                        tL_chatBannedRights = tL_chatBannedRights4;
                    }
                    if (tLObject instanceof TLRPC.User) {
                        MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j11, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, this.f31855n);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j11, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, this.f31855n);
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j11, (TLRPC.User) tLObject, (TLRPC.Chat) null, false, false);
                } else if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j11, (TLRPC.User) null, (TLRPC.Chat) tLObject, false, false);
                }
            }
        }
        for (int i22 = 0; i22 < trVar.f32865g; i22++) {
            if (trVar.d[i22] && ((zArr3 = trVar.f32863e) == null || zArr3[i22])) {
                TLObject tLObject2 = (TLObject) trVar.f32862c.get(i22);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {

                    public final ur f31655b;

                    {
                        this.f31655b = this;
                    }

                    public Predicate and(Predicate predicate) {
                        int i110 = i11;
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public Predicate negate() {
                        switch (i11) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return Predicate$CC.$default$negate(this);
                    }

                    public Predicate or(Predicate predicate) {
                        int i110 = i11;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        MessageObject messageObject = (MessageObject) obj;
                        switch (i11) {
                            case 0:
                                long j17 = this.f31655b.Y;
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                return !(peer == null || peer.chat_id == (-j17)) || j17 == 0;
                            case 1:
                                ur urVar = this.f31655b;
                                urVar.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j18 = peer2.chat_id;
                                    long j19 = urVar.Y;
                                    if (j18 == (-j19) && j19 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                ur urVar2 = this.f31655b;
                                urVar2.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                return (peer3 == null || peer3.chat_id == (-urVar2.Y)) ? false : true;
                        }
                    }
                }).filter(new rr(1, tLObject2)).map(new org.telegram.ui.l8(i11)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
                if (z13 && (tLObject2 instanceof TLRPC.User)) {
                    if (arrayList5.size() == 1) {
                        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                        tL_messages_reportReaction.peer = MessagesController.getInputPeer(chat2);
                        tL_messages_reportReaction.user_id = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) tLObject2);
                        tL_messages_reportReaction.f22486id = arrayList5.get(0).intValue();
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, null);
                    }
                }
                TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                tL_channels_reportSpam.channel = MessagesController.getInputChannel(chat2);
                if (tLObject2 instanceof TLRPC.User) {
                    tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.User) tLObject2);
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.Chat) tLObject2);
                }
                tL_channels_reportSpam.f22420id = arrayList5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_reportSpam, null);
            }
        }
        if (this.f33189v0) {
            for (int i23 = 0; i23 < trVar3.f32865g; i23++) {
                boolean[] zArr6 = trVar3.f32863e;
                if (zArr6 == null || zArr6[i23]) {
                    TLObject tLObject3 = (TLObject) trVar3.f32862c.get(i23);
                    if (!this.f33192y0) {
                        r10 = 0;
                    } else if (tLObject3 instanceof TLRPC.User) {
                        r10 = 0;
                        MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject3, null, 0);
                    } else {
                        r10 = 0;
                        r10 = 0;
                        if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject3, 0);
                        }
                    }
                    if (this.f33193z0) {
                        if (tLObject3 instanceof TLRPC.User) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject3, r10);
                        } else if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, r10, (TLRPC.Chat) tLObject3);
                        }
                    }
                }
            }
            return;
        }
        for (int i24 = 0; i24 < trVar3.f32865g; i24++) {
            if (trVar3.d[i24] && ((zArr2 = trVar3.f32863e) == null || zArr2[i24])) {
                TLObject tLObject4 = (TLObject) trVar3.f32862c.get(i24);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i25 = 0;
        while (true) {
            tr trVar4 = this.f33175g0;
            if (i25 >= trVar4.f32865g) {
                return;
            }
            if (trVar4.d[i25] && ((zArr = trVar4.f32863e) == null || zArr[i25])) {
                TLObject tLObject5 = (TLObject) trVar4.f32862c.get(i25);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i25++;
        }
    }

    @Override
    public final void dismiss() {
        SharedPreferences.Editor editorEdit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        editorEdit.putBoolean("delete_report", this.f33173e0.a());
        editorEdit.putBoolean("delete_deleteAll", this.f33174f0.a());
        editorEdit.putBoolean("delete_ban", !this.f33171c0 && this.f33176h0.a());
        editorEdit.apply();
        super.dismiss();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        zk0 zk0Var = this.d;
        rect.set(0, 0, zk0Var.getMeasuredWidth(), zk0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        zk0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        ec.e();
    }

    @Override
    public final boolean u(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.z1);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, this.f31855n.getClassGuid(), true, new mr(this, 0), this.resourcesProvider);
        this.T = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        boolean[] zArr;
        if (this.f33190w0) {
            if (this.f33192y0) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            return this.f33193z0 ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.X;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.f33182o0 != null && this.f33184q0) {
            int i10 = 0;
            while (true) {
                tr trVar = this.f33174f0;
                if (i10 >= trVar.f32865g) {
                    break;
                }
                if (trVar.d[i10] && ((zArr = trVar.f32863e) == null || zArr[i10])) {
                    iArr[0] = iArr[0] + this.f33182o0[i10];
                }
                i10++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
