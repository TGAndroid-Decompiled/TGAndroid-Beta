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
public final class gv0 implements org.telegram.ui.Cells.j1 {
    public final int f28718a;
    public final org.telegram.ui.ActionBar.u6 f28719b;
    public final iv0 f28720c;

    public gv0(iv0 iv0Var, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f28720c = iv0Var;
        this.f28718a = i10;
        this.f28719b = u6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22048id = message.f22048id;
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
    public final boolean C0(long j10) {
        return false;
    }

    @Override
    public final boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f28720c.f29385s.f26702x1;
            MessageObject messageObject = s1Var.getMessageObject();
            org.telegram.ui.Cells.x8 x8Var = nh0.R;
            if (r2Var != null && r2Var.getParentActivity() != null) {
                r2Var.showDialog(new nh0(r2Var.getContext(), r2Var.getCurrentAccount(), messageObject, r2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final org.telegram.ui.cv0 E1() {
        return null;
    }

    @Override
    public final boolean G1(long j10) {
        return false;
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final boolean S0(MessageObject messageObject) {
        return org.telegram.ui.d3.a(messageObject);
    }

    @Override
    public final jh.a V() {
        return null;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean X1(int i10) {
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.t9 b2() {
        return null;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean h0(c6 c6Var) {
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        SendMessagesHelper.getInstance(this.f28718a).sendVote(s1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        aw0 aw0Var = this.f28720c.f29385s;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.u6 u6Var = this.f28719b;
            int i14 = this.f28718a;
            int i15 = 0;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(aw0Var.f26702x1)) {
                    org.telegram.ui.pc0 pc0Var = new org.telegram.ui.pc0(3);
                    pc0Var.setResourceProvider(u6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = MessagesController.getInstance(i14).getPeer(aw0Var.l1);
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
                    pc0Var.N0 = false;
                    pc0Var.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    aw0Var.f26702x1.presentFragment(pc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                org.telegram.ui.ft.o().u(aw0Var.f26702x1.getParentActivity());
                org.telegram.ui.ft.o().t(new bv0(this, tL_messageMediaPoll, pollAnswer, s1Var));
                org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i15 = 2;
                }
                o10.r(document4, null, "", null, null, i15, false, s1Var.getMessageObject(), this.f28719b, 200);
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
                bg.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i14).getClientUserId());
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
                    PhotoViewer.u1().M2(null, aw0Var.f26702x1, u6Var);
                    PhotoViewer.u1().d2(arrayList2, i11, aw0Var.l1, 0L, 0L, new fv0(this));
                }
            }
        }
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final String u(long j10) {
        return null;
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void Z1() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K(MessageObject messageObject) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z(int i10) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u1(MessageObject messageObject) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override
    public final void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
