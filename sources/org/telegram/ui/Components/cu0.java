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
public final class cu0 implements org.telegram.ui.Cells.k1 {
    public final int f24049a;
    public final org.telegram.ui.ActionBar.f6 f24050b;
    public final eu0 f24051c;

    public cu0(eu0 eu0Var, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24051c = eu0Var;
        this.f24049a = i10;
        this.f24050b = f6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19205id = message.f19205id;
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
    public final org.telegram.ui.Cells.n9 C2() {
        return null;
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean K1() {
        return false;
    }

    @Override
    public final boolean O0(long j10) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final void P1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void R0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f24051c.f24679s.f31144s1;
            MessageObject messageObject = t1Var.getMessageObject();
            hh.g gVar = vg0.L;
            if (p2Var != null && p2Var.getParentActivity() != null) {
                p2Var.showDialog(new vg0(p2Var.getContext(), p2Var.getCurrentAccount(), messageObject, p2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final boolean Y0(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public final ug.a Z() {
        return null;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.vu0 a2() {
        return null;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean d1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean d2(long j10) {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        SendMessagesHelper.getInstance(this.f24049a).sendVote(t1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        int i12;
        TLRPC.Message message;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        int i13;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        yu0 yu0Var = this.f24051c.f24679s;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.f6 f6Var = this.f24050b;
            int i14 = this.f24049a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(yu0Var.f31144s1)) {
                    org.telegram.ui.ad0 ad0Var = new org.telegram.ui.ad0(3);
                    ad0Var.setResourceProvider(f6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = MessagesController.getInstance(i14).getPeer(yu0Var.f31119g1);
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
                    ad0Var.L0 = false;
                    ad0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    yu0Var.f31144s1.presentFragment(ad0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                org.telegram.ui.pt.q().w(yu0Var.f31144s1.getParentActivity());
                org.telegram.ui.pt.q().v(new xt0(this, tL_messageMediaPoll, pollAnswer, t1Var));
                org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                q10.t(document4, null, "", null, null, i13, false, t1Var.getMessageObject(), this.f24050b, 200);
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
                int i15 = i14;
                mf.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i14).getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i16 = 0;
                while (i16 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i16);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !MessageObject.isVideoDocument(document))) {
                        i12 = i15;
                        message = message2;
                    } else {
                        if (pollAnswer2.unshuffled_index == i10) {
                            i11 = arrayList2.size();
                        }
                        TLRPC.TL_message a11 = a(message2);
                        a11.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        a11.message = tL_textWithEntities2.text;
                        a11.entities = tL_textWithEntities2.entities;
                        i12 = i15;
                        message = message2;
                        arrayList2.add(new MessageObject(i12, a11, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i16++;
                    message2 = message;
                    i15 = i12;
                }
                if (i11 > -1 && !arrayList2.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.t1().K2(null, yu0Var.f31144s1, f6Var);
                    PhotoViewer.t1().a2(arrayList2, i11, yu0Var.f31119g1, 0L, 0L, new bu0(this));
                }
            }
        }
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean y2(int i10) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void E1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void O(MessageObject messageObject) {
    }

    @Override
    public final void O1(MessageObject messageObject) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void a1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void g0(int i10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void p0(String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, jh.f fVar) {
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void v2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public final void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
