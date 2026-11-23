package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;
public final class ps0 implements org.telegram.ui.Cells.m1 {
    public final int f38571a;
    public final org.telegram.ui.ActionBar.i6 f38572b;
    public final rs0 f38573c;

    public ps0(rs0 rs0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f38573c = rs0Var;
        this.f38571a = i7;
        this.f38572b = i6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28513id = message.f28513id;
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
    public final org.telegram.ui.Cells.j9 B2() {
        return null;
    }

    @Override
    public final String D(long j3) {
        return null;
    }

    @Override
    public final boolean F0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public final boolean R0(long j3) {
        return false;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean b0() {
        return false;
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public final org.telegram.ui.fr0 c2() {
        return null;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e0() {
        return 0;
    }

    @Override
    public final boolean f2(long j3) {
        return false;
    }

    @Override
    public final boolean g1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public final jh.a h0() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean j2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String k(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final boolean k0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.zy.C(this.f38571a).w0(r1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean n0() {
        return false;
    }

    @Override
    public final int p0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        if (i7 == 80) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f38573c.f39403s.f36166y1;
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            org.telegram.ui.Cells.o8 o8Var = ef0.M1;
            if (g2Var != null && g2Var.getParentActivity() != null) {
                g2Var.showDialog(new ef0(g2Var.getContext(), g2Var.getCurrentAccount(), messageObject, g2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Message message;
        int i11;
        int i12;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        it0 it0Var = this.f38573c.f39403s;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.i6 i6Var = this.f38572b;
            int i13 = this.f38571a;
            int i14 = 0;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(it0Var.f36166y1)) {
                    org.telegram.ui.pa0 pa0Var = new org.telegram.ui.pa0(3);
                    pa0Var.setResourceProvider(i6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = org.telegram.messenger.mp.u1(i13).B1(it0Var.f36130m1);
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
                    pa0Var.V0 = false;
                    pa0Var.G0(new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, tL_message, false, false));
                    it0Var.f36166y1.presentFragment(pa0Var);
                }
            } else if (org.telegram.messenger.fj.N2(messageMedia.document)) {
                org.telegram.ui.ns.p().v(it0Var.f36166y1.getParentActivity());
                org.telegram.ui.ns.p().u(new ks0(this, tL_messageMediaPoll, pollAnswer, r1Var));
                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.fj.H2(document4)) {
                    i14 = 2;
                }
                p10.s(document4, null, "", null, null, i14, false, r1Var.getMessageObject(), this.f38572b, 200);
            } else {
                TLRPC.Message message2 = messageObject.f24073k;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.fj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message a10 = a(message2);
                    a10.media = messageMedia3;
                    arrayList2.add(new org.telegram.messenger.fj(i13, a10, false, true));
                    arrayList.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.fj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList2.size();
                    }
                    TLRPC.TL_message a11 = a(message2);
                    a11.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a11.message = pollResults2.solution;
                    a11.entities = pollResults2.solution_entities;
                    arrayList2.add(new org.telegram.messenger.fj(i13, a11, false, true));
                    arrayList.add(-3);
                }
                int i15 = i13;
                cg.d.b(tL_messageMediaPoll.poll, org.telegram.messenger.i10.i(i13).e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i16 = 0;
                while (i16 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i16);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !org.telegram.messenger.fj.K4(document))) {
                        int i17 = i15;
                        message = message2;
                        i11 = i14;
                        i12 = i17;
                    } else {
                        if (pollAnswer2.unshuffled_index == i7) {
                            i10 = arrayList2.size();
                        }
                        TLRPC.TL_message a12 = a(message2);
                        a12.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        a12.message = tL_textWithEntities2.text;
                        a12.entities = tL_textWithEntities2.entities;
                        i12 = i15;
                        message = message2;
                        i11 = 0;
                        arrayList2.add(new org.telegram.messenger.fj(i12, a12, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i16++;
                    int i18 = i12;
                    i14 = i11;
                    message2 = message;
                    i15 = i18;
                }
                if (i10 > -1 && !arrayList2.isEmpty()) {
                    messageObject.f24105s0 = arrayList;
                    PhotoViewer.p1().J2(null, it0Var.f36166y1, i6Var);
                    PhotoViewer.p1().b2(arrayList2, i10, it0Var.f36130m1, 0L, 0L, new os0(this));
                }
            }
        }
    }

    @Override
    public final boolean r0() {
        return true;
    }

    @Override
    public final boolean v0(x5 x5Var) {
        return false;
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final boolean y2(int i7) {
        return false;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void J(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void O(org.telegram.messenger.cj cjVar) {
    }

    @Override
    public final void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public final void R(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void W(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void m0(int i7) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void t0(String str) {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
    }

    @Override
    public final void e2(String str, String str2) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
