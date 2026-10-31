package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;
public final class et0 implements org.telegram.ui.Cells.l1 {
    public final int f25858a;
    public final org.telegram.ui.ActionBar.p6 f25859b;
    public final gt0 f25860c;

    public et0(gt0 gt0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f25860c = gt0Var;
        this.f25858a = i10;
        this.f25859b = p6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19814id = message.f19814id;
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
    public final boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        return false;
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final org.telegram.ui.qs0 H1() {
        return null;
    }

    @Override
    public final boolean I0(long j10) {
        return false;
    }

    @Override
    public final boolean K1(long j10) {
        return false;
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final zg.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f25860c.f26522s.f33240x1;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            mh.g gVar = tf0.I1;
            if (k2Var != null && k2Var.getParentActivity() != null) {
                k2Var.showDialog(new tf0(k2Var.getContext(), k2Var.getCurrentAccount(), messageObject, k2Var.getResourceProvider()));
            }
        }
    }

    @Override
    public final boolean c2(int i10) {
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
    public final int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public final org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        org.telegram.messenger.qz.C(this.f25858a).w0(q1Var.getMessageObject(), arrayList, null);
    }

    @Override
    public final boolean i0() {
        return true;
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override
    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        zt0 zt0Var = this.f25860c.f26522s;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(messageObject);
        if (messageMedia != null && messageObject != null && (n12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            org.telegram.ui.ActionBar.p6 p6Var = this.f25859b;
            int i14 = this.f25858a;
            int i15 = 0;
            if (geoPoint != null) {
                if (org.telegram.messenger.i0.J1(zt0Var.f33240x1)) {
                    org.telegram.ui.yb0 yb0Var = new org.telegram.ui.yb0(3);
                    yb0Var.setResourceProvider(p6Var);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = org.telegram.messenger.vp.r1(i14).y1(zt0Var.l1);
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
                    yb0Var.W0 = false;
                    yb0Var.H0(new org.telegram.messenger.jj(org.telegram.messenger.d20.f15147s0, tL_message, false, false));
                    zt0Var.f33240x1.presentFragment(yb0Var);
                }
            } else if (org.telegram.messenger.jj.N2(messageMedia.document)) {
                org.telegram.ui.lt.p().v(zt0Var.f33240x1.getParentActivity());
                org.telegram.ui.lt.p().u(new zs0(this, tL_messageMediaPoll, pollAnswer, q1Var));
                org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.jj.H2(document4)) {
                    i15 = 2;
                }
                p5.s(document4, null, "", null, null, i15, false, q1Var.getMessageObject(), this.f25859b, 200);
            } else {
                TLRPC.Message message2 = messageObject.f16337k;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.jj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i11 = arrayList2.size();
                    } else {
                        i11 = -1;
                    }
                    TLRPC.TL_message a2 = a(message2);
                    a2.media = messageMedia3;
                    arrayList2.add(new org.telegram.messenger.jj(i14, a2, false, true));
                    arrayList.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.jj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList2.size();
                    }
                    TLRPC.TL_message a10 = a(message2);
                    a10.media = messageMedia2;
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    a10.message = pollResults2.solution;
                    a10.entities = pollResults2.solution_entities;
                    arrayList2.add(new org.telegram.messenger.jj(i14, a10, false, true));
                    arrayList.add(-3);
                }
                int i16 = i14;
                sf.d.b(tL_messageMediaPoll.poll, org.telegram.messenger.d20.i(i14).e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                if (arrayList3 == null) {
                    arrayList3 = poll.answers;
                }
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i17);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 == null || messageMedia4.geo != null || ((document = messageMedia4.document) != null && !org.telegram.messenger.jj.K4(document))) {
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
                        arrayList2.add(new org.telegram.messenger.jj(i13, a11, false, true));
                        arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                    i17++;
                    int i19 = i13;
                    i15 = i12;
                    message2 = message;
                    i16 = i19;
                }
                if (i11 > -1 && !arrayList2.isEmpty()) {
                    messageObject.f16360q0 = arrayList;
                    PhotoViewer.v1().N2(null, zt0Var.f33240x1, p6Var);
                    PhotoViewer.v1().e2(arrayList2, i11, zt0Var.l1, 0L, 0L, new dt0(this));
                }
            }
        }
    }

    @Override
    public final boolean m0(o5 o5Var) {
        return false;
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final boolean w0(org.telegram.messenger.jj jjVar) {
        return true;
    }

    @Override
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public final String x(long j10) {
        return null;
    }

    @Override
    public final CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void J(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void O(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void Z1() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override
    public final void J1(String str, String str2) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public final void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public final void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
