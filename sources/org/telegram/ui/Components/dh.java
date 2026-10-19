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
public final class dh implements ml, org.telegram.ui.ActionBar.a2, ne.k, yl0, eh.d, org.telegram.ui.ActionBar.q0, eo, AndroidUtilities.IntColorCallback, e5, cj {
    public final int f25560a;
    public final ti f25561b;

    public dh(ti tiVar, int i10) {
        this.f25560a = i10;
        this.f25561b = tiVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        long j10;
        boolean J1;
        switch (this.f25560a) {
            case 12:
                ti tiVar = this.f25561b;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f30546j0 && liVar != tiVar.f30566q0) {
                    if (!liVar.K(i10, z10, i11, tiVar.u1(), 0L)) {
                        tiVar.D2 = true;
                        tiVar.dismiss();
                        return;
                    }
                    return;
                }
                tiVar.J1(i10, z10, 0, tiVar.u1(), tiVar.Q0);
                return;
            default:
                ti tiVar2 = this.f25561b;
                mf mfVar = tiVar2.f30540h0;
                if (mfVar != null) {
                    j10 = mfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = j11;
                eiVar.setEffect(j11);
                li liVar2 = tiVar2.B0;
                if (liVar2 != tiVar2.f30546j0 && liVar2 != tiVar2.f30566q0) {
                    if (!liVar2.K(i10, z10, i11, tiVar2.u1(), j11)) {
                        tiVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = tiVar2.J1(i10, z10, i11, tiVar2.u1(), j11);
                }
                mf mfVar2 = tiVar2.f30540h0;
                if (mfVar2 != null) {
                    mfVar2.h(!J1);
                    tiVar2.f30540h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        TLRPC.User user;
        if (view instanceof mi) {
            mi miVar = (mi) view;
            ti tiVar = this.f25561b;
            if (!tiVar.V && (user = miVar.f28530b) != null) {
                tiVar.z1(miVar.f28531c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f25560a) {
            case 0:
                ((org.telegram.ui.qn) this.f25561b.f30534f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.qn) this.f25561b.f30534f0).b(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.qn) this.f25561b.f30534f0).b(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f25560a;
        ti tiVar = this.f25561b;
        switch (i11) {
            case 10:
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) tiVar.f30534f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (qnVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, qnVar.T5, qnVar.f40773n5, qnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = qnVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = qnVar.S8();
                    of2.suggestionParams = qnVar.f40687g5;
                    qnVar.getSendMessagesHelper().sendMessage(of2);
                    qnVar.B6();
                    return;
                }
                return;
            default:
                org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) tiVar.f30534f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (qnVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = qnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(qnVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), qnVar2.T5, qnVar2.f40773n5, qnVar2.X3, null, qnVar2.f40747l5, z10, i10, qnVar2.H8(), j10, qnVar2.S8(), qnVar2.f40687g5);
                    qnVar2.B6();
                    return;
                }
                return;
        }
    }

    @Override
    public void e(ne.l lVar) {
        this.f25561b.x1();
    }

    @Override
    public int f(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f25560a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.h6.f20929a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f21075i5;
                }
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, d6Var);
                ti tiVar = this.f25561b;
                if (tiVar.f30565p2) {
                    return i0.a.f(0.75f, w03, tiVar.f30568q2);
                }
                return fh.c.m(f7, w02, w03);
            case 5:
                if (this.f25561b.f30565p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f25561b.f30565p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ti tiVar2 = this.f25561b;
                if (tiVar2.f30565p2) {
                    if (AndroidUtilities.computePerceivedBrightness(tiVar2.f30568q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ti tiVar = this.f25561b;
        tiVar.D2 = true;
        tiVar.dismiss();
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ti tiVar = this.f25561b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.i(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30534f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var;
            if (qnVar.i7()) {
                qnVar.o8(charSequence, null);
                AccountInstance accountInstance = qnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, qnVar.T5, qnVar.f40773n5, qnVar.X3, null, z10, i10, i11, qnVar.p5, qnVar.H8(), j10, z11, j11);
                qnVar.B6();
                return;
            }
            return;
        }
        ri riVar = tiVar.f30526c2;
        if (riVar != null) {
            riVar.r0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void j(int i10) {
        this.f25561b.f30518a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        ti.u(this.f25561b, i10);
    }

    @Override
    public void c() {
    }
}
