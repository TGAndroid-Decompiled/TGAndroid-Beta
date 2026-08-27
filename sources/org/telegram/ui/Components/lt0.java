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

public final class lt0 implements org.telegram.ui.Cells.j1 {

    public final int f30462a;

    public final org.telegram.ui.ActionBar.c6 f30463b;

    public final nt0 f30464c;

    public lt0(nt0 nt0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30464c = nt0Var;
        this.f30462a = i10;
        this.f30463b = c6Var;
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
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final boolean L0(long j10) {
        return false;
    }

    @Override
    public final boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30464c.f31034s.f29145r1;
            MessageObject messageObject = s1Var.getMessageObject();
            dh.g gVar = cg0.K;
            if (n2Var == null || n2Var.getParentActivity() == null) {
                return;
            }
            n2Var.showDialog(new cg0(n2Var.getContext(), n2Var.getCurrentAccount(), messageObject, n2Var.getResourceProvider()));
        }
    }

    @Override
    public final org.telegram.ui.ou0 O1() {
        return null;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean V() {
        return false;
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final qg.a d0() {
        return null;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        SendMessagesHelper.getInstance(this.f30462a).sendVote(s1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final boolean k2(int i10) {
        return false;
    }

    @Override
    public final int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int size;
        int i11;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        hu0 hu0Var = this.f30464c.f31034s;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30463b;
        int i12 = this.f30462a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(hu0Var.f29145r1)) {
                ft0 ft0Var = new ft0(3);
                ft0Var.setResourceProvider(c6Var);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(hu0Var.f29121f1);
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                ft0Var.K0 = false;
                ft0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                hu0Var.f29145r1.presentFragment(ft0Var);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            org.telegram.ui.kt.q().w(hu0Var.f29145r1.getParentActivity());
            org.telegram.ui.kt.q().v(new gt0(this, tL_messageMediaPoll, pollAnswer, s1Var));
            org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
            TLRPC.Document document4 = messageMedia.document;
            ktVarQ.t(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, s1Var.getMessageObject(), this.f30463b, 200);
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            size = messageMedia3 == messageMedia ? arrayList2.size() : -1;
            TLRPC.TL_message tL_messageA = a(message);
            tL_messageA.media = messageMedia3;
            arrayList2.add(new ht0(i12, tL_messageA, false, true));
            arrayList.add(-2);
        } else {
            size = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                size = arrayList2.size();
            }
            TLRPC.TL_message tL_messageA2 = a(message);
            tL_messageA2.media = messageMedia2;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_messageA2.message = pollResults2.solution;
            tL_messageA2.entities = pollResults2.solution_entities;
            arrayList2.add(new it0(i12, tL_messageA2, false, true));
            arrayList.add(-3);
        }
        int i13 = i12;
        hf.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i12).getClientUserId());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
        if (arrayList3 == null) {
            arrayList3 = poll.answers;
        }
        int i14 = 0;
        while (i14 < arrayList3.size()) {
            TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i14);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                if (pollAnswer2.unshuffled_index == i10) {
                    size = arrayList2.size();
                }
                TLRPC.TL_message tL_messageA3 = a(message);
                tL_messageA3.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                tL_messageA3.message = tL_textWithEntities2.text;
                tL_messageA3.entities = tL_textWithEntities2.entities;
                i11 = i13;
                arrayList2.add(new jt0(i11, tL_messageA3, false, true));
                arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            } else {
                i11 = i13;
            }
            i14++;
            message = message;
            i13 = i11;
        }
        if (size <= -1 || arrayList2.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList;
        PhotoViewer.t1().K2(null, hu0Var.f29145r1, c6Var);
        PhotoViewer.t1().a2(arrayList2, size, hu0Var.f29121f1, 0L, 0L, new kt0(this));
    }

    @Override
    public final org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final boolean s0(t5 t5Var) {
        return false;
    }

    @Override
    public final boolean s1() {
        return false;
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final String z(long j10) {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D1(MessageObject messageObject) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void I1() {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void T(MessageObject messageObject) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void i0(int i10) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r0(String str) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public final void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
