package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;
public final class fs0 implements org.telegram.ui.Cells.l1 {
    public final int f33641a;
    public final org.telegram.ui.ActionBar.h6 f33642b;
    public final hs0 f33643c;

    public fs0(hs0 hs0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33643c = hs0Var;
        this.f33641a = i7;
        this.f33642b = h6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26981id = message.f26981id;
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
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        return false;
    }

    @Override
    public final boolean J0(long j3) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final org.telegram.ui.ir0 N1() {
        return null;
    }

    @Override
    public final boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public final boolean Q1(long j3) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean W0(org.telegram.messenger.ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final jh.a Z() {
        return null;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        if (i7 == 80) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f33643c.f34458s.f40719x1;
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            org.telegram.ui.Cells.o8 o8Var = qe0.L1;
            if (f2Var != null && f2Var.getParentActivity() != null) {
                f2Var.showDialog(new qe0(f2Var.getContext(), f2Var.getCurrentAccount(), messageObject, f2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean g2(int i7) {
        return false;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.gz.C(this.f33641a).w0(q1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean k0() {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.j9 k2() {
        return null;
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
        ys0 ys0Var = this.f33643c.f34458s;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.h6 h6Var = this.f33642b;
            int i13 = this.f33641a;
            int i14 = 0;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(ys0Var.f40719x1)) {
                    org.telegram.ui.sa0 sa0Var = new org.telegram.ui.sa0(3);
                    sa0Var.setResourceProvider(h6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = org.telegram.messenger.qp.s1(i13).z1(ys0Var.l1);
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
                    sa0Var.P0 = false;
                    sa0Var.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.f24474s0, tL_message, false, false));
                    ys0Var.f40719x1.presentFragment(sa0Var);
                }
            } else if (org.telegram.messenger.ij.N2(messageMedia.document)) {
                org.telegram.ui.ns.p().v(ys0Var.f40719x1.getParentActivity());
                org.telegram.ui.ns.p().u(new as0(this, tL_messageMediaPoll, pollAnswer, q1Var));
                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.ij.H2(document4)) {
                    i14 = 2;
                }
                p10.s(document4, null, "", null, null, i14, false, q1Var.getMessageObject(), this.f33642b, 200);
            } else {
                TLRPC.Message message2 = messageObject.f23266k;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.ij.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message a10 = a(message2);
                    a10.media = messageMedia3;
                    arrayList2.add(new org.telegram.messenger.ij(i13, a10, false, true));
                    arrayList.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.ij.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList2.size();
                    }
                    TLRPC.TL_message a11 = a(message2);
                    a11.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a11.message = pollResults2.solution;
                    a11.entities = pollResults2.solution_entities;
                    arrayList2.add(new org.telegram.messenger.ij(i13, a11, false, true));
                    arrayList.add(-3);
                }
                int i15 = i13;
                cg.d.b(tL_messageMediaPoll.poll, org.telegram.messenger.p10.i(i13).e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i16 = 0;
                while (i16 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i16);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !org.telegram.messenger.ij.K4(document))) {
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
                        arrayList2.add(new org.telegram.messenger.ij(i12, a12, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i16++;
                    int i18 = i12;
                    i14 = i11;
                    message2 = message;
                    i15 = i18;
                }
                if (i10 > -1 && !arrayList2.isEmpty()) {
                    messageObject.f23288q0 = arrayList;
                    PhotoViewer.p1().H2(null, ys0Var.f40719x1, h6Var);
                    PhotoViewer.p1().Z1(arrayList2, i10, ys0Var.l1, 0L, 0L, new es0(this));
                }
            }
        }
    }

    @Override
    public final boolean n0(q5 q5Var) {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override
    public final boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final boolean x0(org.telegram.messenger.ij ijVar) {
        return true;
    }

    @Override
    public final String y(long j3) {
        return null;
    }

    @Override
    public final void A1(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void d0(int i7) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F1() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void P1(String str, String str2) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public final void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public final void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
