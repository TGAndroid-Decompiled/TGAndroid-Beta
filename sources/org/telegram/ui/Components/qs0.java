package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;
public final class qs0 implements org.telegram.ui.Cells.m1 {
    public final int f38989a;
    public final org.telegram.ui.ActionBar.h6 f38990b;
    public final ss0 f38991c;

    public qs0(ss0 ss0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f38991c = ss0Var;
        this.f38989a = i7;
        this.f38990b = h6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28455id = message.f28455id;
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
    public final boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final boolean L0(long j3) {
        return false;
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final int Z() {
        return 0;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final jh.a c0() {
        return null;
    }

    @Override
    public final org.telegram.ui.fr0 c2() {
        return null;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.c0.a(gjVar);
    }

    @Override
    public final boolean f2(long j3) {
        return false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String i(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final int k0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public final void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.az.C(this.f38989a).w0(r1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
        jt0 jt0Var = this.f38991c.f39686s;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.h6 h6Var = this.f38990b;
            int i13 = this.f38989a;
            int i14 = 0;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(jt0Var.f36684y1)) {
                    org.telegram.ui.qa0 qa0Var = new org.telegram.ui.qa0(3);
                    qa0Var.setResourceProvider(h6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = org.telegram.messenger.np.u1(i13).B1(jt0Var.f36648m1);
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
                    qa0Var.V0 = false;
                    qa0Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.k10.f24968t0, tL_message, false, false));
                    jt0Var.f36684y1.presentFragment(qa0Var);
                }
            } else if (org.telegram.messenger.gj.N2(messageMedia.document)) {
                org.telegram.ui.ns.p().v(jt0Var.f36684y1.getParentActivity());
                org.telegram.ui.ns.p().u(new ls0(this, tL_messageMediaPoll, pollAnswer, r1Var));
                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.gj.H2(document4)) {
                    i14 = 2;
                }
                p10.s(document4, null, "", null, null, i14, false, r1Var.getMessageObject(), this.f38990b, 200);
            } else {
                TLRPC.Message message2 = messageObject.f24213k;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.gj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message a10 = a(message2);
                    a10.media = messageMedia3;
                    arrayList2.add(new org.telegram.messenger.gj(i13, a10, false, true));
                    arrayList.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.gj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList2.size();
                    }
                    TLRPC.TL_message a11 = a(message2);
                    a11.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a11.message = pollResults2.solution;
                    a11.entities = pollResults2.solution_entities;
                    arrayList2.add(new org.telegram.messenger.gj(i13, a11, false, true));
                    arrayList.add(-3);
                }
                int i15 = i13;
                cg.d.b(tL_messageMediaPoll.poll, org.telegram.messenger.k10.i(i13).e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i16 = 0;
                while (i16 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i16);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !org.telegram.messenger.gj.K4(document))) {
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
                        arrayList2.add(new org.telegram.messenger.gj(i12, a12, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i16++;
                    int i18 = i12;
                    i14 = i11;
                    message2 = message;
                    i15 = i18;
                }
                if (i10 > -1 && !arrayList2.isEmpty()) {
                    messageObject.f24245s0 = arrayList;
                    PhotoViewer.p1().I2(null, jt0Var.f36684y1, h6Var);
                    PhotoViewer.p1().a2(arrayList2, i10, jt0Var.f36648m1, 0L, 0L, new ps0(this));
                }
            }
        }
    }

    @Override
    public final boolean p0(y5 y5Var) {
        return false;
    }

    @Override
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        if (i7 == 80) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f38991c.f39686s.f36684y1;
            org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
            org.telegram.ui.Cells.p8 p8Var = ff0.M1;
            if (g2Var != null && g2Var.getParentActivity() != null) {
                g2Var.showDialog(new ff0(g2Var.getContext(), g2Var.getCurrentAccount(), messageObject, g2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean v2(int i7) {
        return false;
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    @Override
    public final String z(long j3) {
        return null;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.k9 z2() {
        return null;
    }

    @Override
    public final void B(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void L(org.telegram.messenger.dj djVar) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void P(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void R(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void Y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void h0(int i7) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void o0(String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.j10 j10Var) {
    }

    @Override
    public final void e2(String str, String str2) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
