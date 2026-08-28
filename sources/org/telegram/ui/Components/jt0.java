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
public final class jt0 implements org.telegram.ui.Cells.k1 {
    public final int f29837a;
    public final org.telegram.ui.ActionBar.b6 f29838b;
    public final lt0 f29839c;

    public jt0(lt0 lt0Var, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f29839c = lt0Var;
        this.f29837a = i9;
        this.f29838b = b6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22401id = message.f22401id;
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
    public final String C(long j10) {
        return null;
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean K0(long j10) {
        return false;
    }

    @Override
    public final void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        if (i9 == 80) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f29839c.f30550s.f28160r1;
            MessageObject messageObject = t1Var.getMessageObject();
            ch.g gVar = ag0.K;
            if (o2Var != null && o2Var.getParentActivity() != null) {
                o2Var.showDialog(new ag0(o2Var.getContext(), o2Var.getCurrentAccount(), messageObject, o2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final org.telegram.ui.nu0 P1() {
        return null;
    }

    @Override
    public final boolean R1(long j10) {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final pg.a d0() {
        return null;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        SendMessagesHelper.getInstance(this.f29837a).sendVote(t1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean n2(int i9) {
        return false;
    }

    @Override
    public final boolean o0() {
        return true;
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10;
        int i11;
        TLRPC.Message message;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        int i12;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        eu0 eu0Var = this.f29839c.f30550s;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.b6 b6Var = this.f29838b;
            int i13 = this.f29837a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(eu0Var.f28160r1)) {
                    org.telegram.ui.pc0 pc0Var = new org.telegram.ui.pc0(3);
                    pc0Var.setResourceProvider(b6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = MessagesController.getInstance(i13).getPeer(eu0Var.f28136f1);
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
                    pc0Var.K0 = false;
                    pc0Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    eu0Var.f28160r1.presentFragment(pc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                org.telegram.ui.ht.q().w(eu0Var.f28160r1.getParentActivity());
                org.telegram.ui.ht.q().v(new et0(this, tL_messageMediaPoll, pollAnswer, t1Var));
                org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                q10.t(document4, null, "", null, null, i12, false, t1Var.getMessageObject(), this.f29838b, 200);
            } else {
                TLRPC.Message message2 = messageObject.messageOwner;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message a2 = a(message2);
                    a2.media = messageMedia3;
                    arrayList2.add(new MessageObject(i13, a2, false, true));
                    arrayList.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList2.size();
                    }
                    TLRPC.TL_message a3 = a(message2);
                    a3.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a3.message = pollResults2.solution;
                    a3.entities = pollResults2.solution_entities;
                    arrayList2.add(new MessageObject(i13, a3, false, true));
                    arrayList.add(-3);
                }
                int i14 = i13;
                gf.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i13).getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i15 = 0;
                while (i15 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i15);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !MessageObject.isVideoDocument(document))) {
                        i11 = i14;
                        message = message2;
                    } else {
                        if (pollAnswer2.unshuffled_index == i9) {
                            i10 = arrayList2.size();
                        }
                        TLRPC.TL_message a10 = a(message2);
                        a10.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        a10.message = tL_textWithEntities2.text;
                        a10.entities = tL_textWithEntities2.entities;
                        i11 = i14;
                        message = message2;
                        arrayList2.add(new MessageObject(i11, a10, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i15++;
                    message2 = message;
                    i14 = i11;
                }
                if (i10 > -1 && !arrayList2.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.t1().K2(null, eu0Var.f28160r1, b6Var);
                    PhotoViewer.t1().a2(arrayList2, i10, eu0Var.f28136f1, 0L, 0L, new it0(this));
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override
    public final boolean r0(t5 t5Var) {
        return false;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C1(MessageObject messageObject) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I1() {
    }

    @Override
    public final void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U(MessageObject messageObject) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i0(int i9) {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q0(String str) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public final void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
