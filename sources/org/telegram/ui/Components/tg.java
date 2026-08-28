package org.telegram.ui.Components;

import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tg implements sk, td.i, org.telegram.ui.ActionBar.b2, ok0, lg.c, org.telegram.ui.ActionBar.s0, in, AndroidUtilities.IntColorCallback, x4, si {
    public final int f32695a;
    public final ki f32696b;

    public tg(ki kiVar, int i9) {
        this.f32695a = i9;
        this.f32696b = kiVar;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        long j10;
        boolean G1;
        switch (this.f32695a) {
            case 12:
                ki kiVar = this.f32696b;
                ci ciVar = kiVar.f30160u0;
                if (ciVar != kiVar.f30114f0 && ciVar != kiVar.m0) {
                    if (!ciVar.H(i9, z10, i10, kiVar.s1(), 0L)) {
                        kiVar.f30169w2 = true;
                        kiVar.dismiss();
                        return;
                    }
                    return;
                }
                kiVar.G1(i9, z10, 0, kiVar.s1(), kiVar.J0);
                return;
            default:
                ki kiVar2 = this.f32696b;
                cf cfVar = kiVar2.f30106d0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = kiVar2.E0;
                kiVar2.J0 = j11;
                vhVar.setEffect(j11);
                ci ciVar2 = kiVar2.f30160u0;
                if (ciVar2 != kiVar2.f30114f0 && ciVar2 != kiVar2.m0) {
                    if (!ciVar2.H(i9, z10, i10, kiVar2.s1(), j11)) {
                        kiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = kiVar2.G1(i9, z10, i10, kiVar2.s1(), j11);
                }
                cf cfVar2 = kiVar2.f30106d0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    kiVar2.f30106d0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        TLRPC.User user;
        if (view instanceof di) {
            di diVar = (di) view;
            ki kiVar = this.f32696b;
            if (!kiVar.R && (user = diVar.f27739b) != null) {
                kiVar.w1(diVar.f27740c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void c(td.j jVar) {
        this.f32696b.u1();
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        switch (this.f32695a) {
            case 0:
                ((org.telegram.ui.qn) this.f32696b.f30099b0).d(messageMedia, i9, z10, i10, 0L);
                return;
            case 9:
                ((org.telegram.ui.qn) this.f32696b.f30099b0).d(messageMedia, i9, z10, i10, j10);
                return;
            default:
                ((org.telegram.ui.qn) this.f32696b.f30099b0).d(messageMedia, i9, z10, i10, j10);
                return;
        }
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, yg.f fVar, ArrayList arrayList, boolean z10, int i9, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i10 = this.f32695a;
        ki kiVar = this.f32696b;
        switch (i10) {
            case 10:
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) kiVar.f30099b0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (qnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, qnVar.P5, qnVar.f41959j5, qnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i9, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = qnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = qnVar.N8();
                    of2.suggestionParams = qnVar.f41870c5;
                    qnVar.getSendMessagesHelper().sendMessage(of2);
                    qnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) kiVar.f30099b0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (qnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = qnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(qnVar2.getAccountInstance(), new yg.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), qnVar2.P5, qnVar2.f41959j5, qnVar2.T3, null, qnVar2.f41934h5, z10, i9, qnVar2.C8(), j10, qnVar2.N8(), qnVar2.f41870c5);
                    qnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ki kiVar = this.f32696b;
        kiVar.f30169w2 = true;
        kiVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        float f10;
        int i9;
        switch (this.f32695a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z10) {
                    i9 = org.telegram.ui.ActionBar.f6.f22947a7;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.f23091i5;
                }
                int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var);
                ki kiVar = this.f32696b;
                if (kiVar.f30125i2) {
                    return i0.a.d(0.75f, v03, kiVar.f30128j2);
                }
                return mg.c.l(f10, v02, v03);
            case 5:
                if (this.f32696b.f30125i2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f32696b.f30125i2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ki kiVar2 = this.f32696b;
                if (kiVar2.f30125i2) {
                    if (AndroidUtilities.computePerceivedBrightness(kiVar2.f30128j2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ki kiVar = this.f32696b;
        si siVar = kiVar.U;
        if (siVar != null) {
            siVar.h(arrayList, charSequence, z10, i9, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        if (o2Var != null && (o2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            if (qnVar.f7()) {
                qnVar.l8(charSequence, null);
                AccountInstance accountInstance = qnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, qnVar.P5, qnVar.f41959j5, qnVar.T3, null, z10, i9, i10, qnVar.f41982l5, qnVar.C8(), j10, z11, j11);
                qnVar.y6();
                return;
            }
            return;
        }
        ii iiVar = kiVar.V1;
        if (iiVar != null) {
            iiVar.v0(arrayList, charSequence, z10, i9, i10, j10, z11, j11);
        }
    }

    @Override
    public void i(int i9) {
        this.f32696b.T0.getActionBarMenuOnItemClick().b(i9);
    }

    @Override
    public void run(int i9) {
        ki.o(this.f32696b, i9);
    }

    @Override
    public void b() {
    }
}
