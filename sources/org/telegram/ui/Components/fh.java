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
public final class fh implements el, le.l, org.telegram.ui.ActionBar.z1, pl0, dh.d, org.telegram.ui.ActionBar.q0, wn, AndroidUtilities.IntColorCallback, d5, gj {
    public final int f24295a;
    public final xi f24296b;

    public fh(xi xiVar, int i10) {
        this.f24295a = i10;
        this.f24296b = xiVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f24295a) {
            case 12:
                xi xiVar = this.f24296b;
                pi piVar = xiVar.f30331y0;
                if (piVar != xiVar.f30282j0 && piVar != xiVar.f30302q0) {
                    if (!piVar.I(i10, z10, i11, xiVar.s1(), 0L)) {
                        xiVar.A2 = true;
                        xiVar.dismiss();
                        return;
                    }
                    return;
                }
                xiVar.G1(i10, z10, 0, xiVar.s1(), xiVar.N0);
                return;
            default:
                xi xiVar2 = this.f24296b;
                of ofVar = xiVar2.f30276h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                hi hiVar = xiVar2.I0;
                xiVar2.N0 = j10;
                hiVar.setEffect(j10);
                pi piVar2 = xiVar2.f30331y0;
                if (piVar2 != xiVar2.f30282j0 && piVar2 != xiVar2.f30302q0) {
                    if (!piVar2.I(i10, z10, i11, xiVar2.s1(), j10)) {
                        xiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = xiVar2.G1(i10, z10, i11, xiVar2.s1(), j10);
                }
                of ofVar2 = xiVar2.f30276h0;
                if (ofVar2 != null) {
                    ofVar2.h(!G1);
                    xiVar2.f30276h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f24295a) {
            case 0:
                ((org.telegram.ui.wn) this.f24296b.f30270f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.wn) this.f24296b.f30270f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.wn) this.f24296b.f30270f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(le.m mVar) {
        this.f24296b.u1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof qi) {
            qi qiVar = (qi) view;
            xi xiVar = this.f24296b;
            if (!xiVar.V && (user = qiVar.f27658b) != null) {
                xiVar.w1(qiVar.f27659c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, qh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f24295a;
        xi xiVar = this.f24296b;
        switch (i11) {
            case 10:
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) xiVar.f30270f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (wnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, wnVar.T5, wnVar.f39667n5, wnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = wnVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = wnVar.N8();
                    of2.suggestionParams = wnVar.f39582g5;
                    wnVar.getSendMessagesHelper().sendMessage(of2);
                    wnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.wn wnVar2 = (org.telegram.ui.wn) xiVar.f30270f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (wnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = wnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(wnVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), wnVar2.T5, wnVar2.f39667n5, wnVar2.X3, null, wnVar2.f39641l5, z10, i10, wnVar2.C8(), j3, wnVar2.N8(), wnVar2.f39582g5);
                    wnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        xi xiVar = this.f24296b;
        xiVar.A2 = true;
        xiVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f24295a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.h6.f19020a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f19164i5;
                }
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var);
                xi xiVar = this.f24296b;
                if (xiVar.f30291m2) {
                    return i0.a.d(0.75f, v03, xiVar.f30295n2);
                }
                return eh.b.m(f7, v02, v03);
            case 5:
                if (this.f24296b.f30291m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f24296b.f30291m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                xi xiVar2 = this.f24296b;
                if (xiVar2.f30291m2) {
                    if (AndroidUtilities.computePerceivedBrightness(xiVar2.f30295n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        xi xiVar = this.f24296b;
        gj gjVar = xiVar.Y;
        if (gjVar != null) {
            gjVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
        if (m2Var != null && (m2Var instanceof org.telegram.ui.wn)) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
            if (wnVar.f7()) {
                wnVar.l8(charSequence, null);
                AccountInstance accountInstance = wnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, wnVar.T5, wnVar.f39667n5, wnVar.X3, null, z10, i10, i11, wnVar.p5, wnVar.C8(), j3, z11, j10);
                wnVar.y6();
                return;
            }
            return;
        }
        vi viVar = xiVar.Z1;
        if (viVar != null) {
            viVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f24296b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        xi.o(this.f24296b, i10);
    }

    @Override
    public void a() {
    }
}
