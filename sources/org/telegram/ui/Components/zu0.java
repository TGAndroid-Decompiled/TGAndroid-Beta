package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;
public final class zu0 implements org.telegram.ui.Cells.l1 {
    public final int f33048a;
    public final org.telegram.ui.ActionBar.d6 f33049b;
    public final bv0 f33050c;

    public zu0(bv0 bv0Var, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33050c = bv0Var;
        this.f33048a = i10;
        this.f33049b = d6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20301id = message.f20301id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final boolean J0(long j10) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f33050c.f25049s.f31075v1;
            MessageObject messageObject = u1Var.getMessageObject();
            org.telegram.ui.Cells.s8 s8Var = lh0.O;
            if (n2Var != null && n2Var.getParentActivity() != null) {
                n2Var.showDialog(new lh0(n2Var.getContext(), n2Var.getCurrentAccount(), messageObject, n2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final org.telegram.ui.vu0 P1() {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final ih.a W() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        SendMessagesHelper.getInstance(this.f33048a).sendVote(u1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        uv0 uv0Var = this.f33050c.f25049s;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.d6 d6Var = this.f33049b;
            int i14 = this.f33048a;
            int i15 = 0;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(uv0Var.f31075v1)) {
                    org.telegram.ui.nc0 nc0Var = new org.telegram.ui.nc0(3);
                    nc0Var.setResourceProvider(d6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = MessagesController.getInstance(i14).getPeer(uv0Var.f31050j1);
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    nc0Var.O0 = false;
                    nc0Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    uv0Var.f31075v1.presentFragment(nc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                org.telegram.ui.et.q().w(uv0Var.f31075v1.getParentActivity());
                org.telegram.ui.et.q().v(new uu0(this, tL_messageMediaPoll, pollAnswer, u1Var));
                org.telegram.ui.et q6 = org.telegram.ui.et.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i15 = 2;
                }
                q6.t(document4, null, "", null, null, i15, false, u1Var.getMessageObject(), this.f33049b, 200);
            } else {
                TLRPC.Message message2 = messageObject.messageOwner;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i11 = arrayList2.size();
                    } else {
                        i11 = -1;
                    }
                    TLRPC.TL_message a2 = a(message2);
                    a2.media = messageMedia3;
                    arrayList2.add(new MessageObject(i14, a2, false, true));
                    arrayList.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList2.size();
                    }
                    TLRPC.TL_message a10 = a(message2);
                    a10.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a10.message = pollResults2.solution;
                    a10.entities = pollResults2.solution_entities;
                    arrayList2.add(new MessageObject(i14, a10, false, true));
                    arrayList.add(-3);
                }
                int i16 = i14;
                ag.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i14).getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i17);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !MessageObject.isVideoDocument(document))) {
                        int i18 = i16;
                        message = message2;
                        i12 = i15;
                        i13 = i18;
                    } else {
                        if (pollAnswer2.unshuffled_index == i10) {
                            i11 = arrayList2.size();
                        }
                        TLRPC.TL_message a11 = a(message2);
                        a11.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        a11.message = tL_textWithEntities2.text;
                        a11.entities = tL_textWithEntities2.entities;
                        i13 = i16;
                        message = message2;
                        i12 = 0;
                        arrayList2.add(new MessageObject(i13, a11, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i17++;
                    int i19 = i13;
                    i15 = i12;
                    message2 = message;
                    i16 = i19;
                }
                if (i11 > -1 && !arrayList2.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.u1().M2(null, uv0Var.f31075v1, d6Var);
                    PhotoViewer.u1().d2(arrayList2, i11, uv0Var.f31050j1, 0L, 0L, new yu0(this));
                }
            }
        }
    }

    @Override
    public final boolean l0() {
        return true;
    }

    @Override
    public final boolean l2(int i10) {
        return false;
    }

    @Override
    public final boolean o0(a6 a6Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.o9 p2() {
        return null;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void d0(int i10) {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void p(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
