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
public final class ut0 implements org.telegram.ui.Cells.j1 {
    public final int f33315a;
    public final org.telegram.ui.ActionBar.c6 f33316b;
    public final wt0 f33317c;

    public ut0(wt0 wt0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f33317c = wt0Var;
        this.f33315a = i10;
        this.f33316b = c6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22413id = message.f22413id;
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
    public final boolean A1() {
        return false;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final boolean M0(long j10) {
        return false;
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f33317c.f34493s.f32093r1;
            MessageObject messageObject = s1Var.getMessageObject();
            fh.g gVar = lg0.K;
            if (o2Var != null && o2Var.getParentActivity() != null) {
                o2Var.showDialog(new lg0(o2Var.getContext(), o2Var.getCurrentAccount(), messageObject, o2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final sg.a X() {
        return null;
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final org.telegram.ui.lu0 Y1() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean a2(long j10) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        SendMessagesHelper.getInstance(this.f33315a).sendVote(s1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean j0() {
        return true;
    }

    @Override
    public final boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        qu0 qu0Var = this.f33317c.f34493s;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.c6 c6Var = this.f33316b;
            int i14 = this.f33315a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(qu0Var.f32093r1)) {
                    org.telegram.ui.rc0 rc0Var = new org.telegram.ui.rc0(3);
                    rc0Var.setResourceProvider(c6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = MessagesController.getInstance(i14).getPeer(qu0Var.f32069f1);
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
                    rc0Var.K0 = false;
                    rc0Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    qu0Var.f32093r1.presentFragment(rc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                org.telegram.ui.ht.q().w(qu0Var.f32093r1.getParentActivity());
                org.telegram.ui.ht.q().v(new pt0(this, tL_messageMediaPoll, pollAnswer, s1Var));
                org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                q6.t(document4, null, "", null, null, i13, false, s1Var.getMessageObject(), this.f33316b, 200);
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
                kf.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i14).getClientUserId());
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
                    PhotoViewer.t1().K2(null, qu0Var.f32093r1, c6Var);
                    PhotoViewer.t1().a2(arrayList2, i11, qu0Var.f32069f1, 0L, 0L, new tt0(this));
                }
            }
        }
    }

    @Override
    public final boolean n0(y5 y5Var) {
        return false;
    }

    @Override
    public final boolean u2(int i10) {
        return false;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final String y(long j10) {
        return null;
    }

    @Override
    public final org.telegram.ui.Cells.l9 y2() {
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N1(MessageObject messageObject) {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public final void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
