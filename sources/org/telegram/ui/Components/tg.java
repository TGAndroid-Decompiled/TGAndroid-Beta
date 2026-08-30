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
public final class tg implements uk, xd.i, org.telegram.ui.ActionBar.c2, kl0, qg.c, org.telegram.ui.ActionBar.s0, pn, AndroidUtilities.IntColorCallback, y4, ti {
    public final int f28974a;
    public final li f28975b;

    public tg(li liVar, int i10) {
        this.f28974a = i10;
        this.f28975b = liVar;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        long j10;
        boolean G1;
        switch (this.f28974a) {
            case 12:
                li liVar = this.f28975b;
                di diVar = liVar.f26748v0;
                if (diVar != liVar.f26702g0 && diVar != liVar.f26722n0) {
                    if (!diVar.H(i10, z4, i11, liVar.s1(), 0L)) {
                        liVar.f26758x2 = true;
                        liVar.dismiss();
                        return;
                    }
                    return;
                }
                liVar.G1(i10, z4, 0, liVar.s1(), liVar.K0);
                return;
            default:
                li liVar2 = this.f28975b;
                cf cfVar = liVar2.f26695e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = liVar2.F0;
                liVar2.K0 = j11;
                vhVar.setEffect(j11);
                di diVar2 = liVar2.f26748v0;
                if (diVar2 != liVar2.f26702g0 && diVar2 != liVar2.f26722n0) {
                    if (!diVar2.H(i10, z4, i11, liVar2.s1(), j11)) {
                        liVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = liVar2.G1(i10, z4, i11, liVar2.s1(), j11);
                }
                cf cfVar2 = liVar2.f26695e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    liVar2.f26695e0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, Editable editable, dh.i iVar, ArrayList arrayList, boolean z4, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f28974a;
        li liVar = this.f28975b;
        switch (i11) {
            case 10:
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) liVar.f26689c0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (xnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, xnVar.Q5, xnVar.f40076k5, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = xnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = xnVar.N8();
                    of2.suggestionParams = xnVar.f39989d5;
                    xnVar.getSendMessagesHelper().sendMessage(of2);
                    xnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) liVar.f26689c0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (xnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = xnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(xnVar2.getAccountInstance(), new dh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), xnVar2.Q5, xnVar2.f40076k5, xnVar2.U3, null, xnVar2.f40052i5, z4, i10, xnVar2.C8(), j10, xnVar2.N8(), xnVar2.f39989d5);
                    xnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.f28974a) {
            case 0:
                ((org.telegram.ui.xn) this.f28975b.f26689c0).d(messageMedia, i10, z4, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.xn) this.f28975b.f26689c0).d(messageMedia, i10, z4, i11, j10);
                return;
            default:
                ((org.telegram.ui.xn) this.f28975b.f26689c0).d(messageMedia, i10, z4, i11, j10);
                return;
        }
    }

    @Override
    public void e(xd.j jVar) {
        this.f28975b.u1();
    }

    @Override
    public boolean f(int i10, View view) {
        TLRPC.User user;
        if (view instanceof ei) {
            ei eiVar = (ei) view;
            li liVar = this.f28975b;
            if (!liVar.S && (user = eiVar.f24586b) != null) {
                liVar.w1(eiVar.f24587c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int g(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        float f10;
        int i10;
        switch (this.f28974a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z4) {
                    i10 = org.telegram.ui.ActionBar.j6.f19852a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19995i5;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var);
                li liVar = this.f28975b;
                if (liVar.f26713j2) {
                    return i0.a.d(0.75f, v03, liVar.f26716k2);
                }
                return rg.b.l(f10, v02, v03);
            case 5:
                if (this.f28975b.f26713j2) {
                    return 0;
                }
                if (z4) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f28975b.f26713j2) {
                    return 0;
                }
                if (z4) {
                    return 352321535;
                }
                return -1;
            default:
                li liVar2 = this.f28975b;
                if (liVar2.f26713j2) {
                    if (AndroidUtilities.computePerceivedBrightness(liVar2.f26716k2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z4) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        li liVar = this.f28975b;
        liVar.f26758x2 = true;
        liVar.dismiss();
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        CharSequence charSequence2;
        li liVar = this.f28975b;
        ti tiVar = liVar.V;
        if (tiVar != null) {
            tiVar.j(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        if (p2Var != null && (p2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            if (xnVar.f7()) {
                xnVar.l8(charSequence, null);
                AccountInstance accountInstance = xnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, xnVar.Q5, xnVar.f40076k5, xnVar.U3, null, z4, i10, i11, xnVar.f40100m5, xnVar.C8(), j10, z10, j11);
                xnVar.y6();
                return;
            }
            return;
        }
        ji jiVar = liVar.W1;
        if (jiVar != null) {
            jiVar.X(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
        }
    }

    @Override
    public void l(int i10) {
        this.f28975b.U0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        li.o(this.f28975b, i10);
    }

    @Override
    public void a() {
    }
}
