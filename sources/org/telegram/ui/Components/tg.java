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
public final class tg implements wk, xd.i, org.telegram.ui.ActionBar.c2, ll0, rg.c, org.telegram.ui.ActionBar.s0, rn, AndroidUtilities.IntColorCallback, y4, ui {
    public final int f31336a;
    public final mi f31337b;

    public tg(mi miVar, int i10) {
        this.f31336a = i10;
        this.f31337b = miVar;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        long j10;
        boolean G1;
        switch (this.f31336a) {
            case 12:
                mi miVar = this.f31337b;
                ei eiVar = miVar.f29100v0;
                if (eiVar != miVar.f29054g0 && eiVar != miVar.f29074n0) {
                    if (!eiVar.H(i10, z4, i11, miVar.s1(), 0L)) {
                        miVar.f29110x2 = true;
                        miVar.dismiss();
                        return;
                    }
                    return;
                }
                miVar.G1(i10, z4, 0, miVar.s1(), miVar.K0);
                return;
            default:
                mi miVar2 = this.f31337b;
                cf cfVar = miVar2.f29047e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = miVar2.F0;
                miVar2.K0 = j11;
                vhVar.setEffect(j11);
                ei eiVar2 = miVar2.f29100v0;
                if (eiVar2 != miVar2.f29054g0 && eiVar2 != miVar2.f29074n0) {
                    if (!eiVar2.H(i10, z4, i11, miVar2.s1(), j11)) {
                        miVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = miVar2.G1(i10, z4, i11, miVar2.s1(), j11);
                }
                cf cfVar2 = miVar2.f29047e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    miVar2.f29047e0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, Editable editable, eh.i iVar, ArrayList arrayList, boolean z4, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f31336a;
        mi miVar = this.f31337b;
        switch (i11) {
            case 10:
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) miVar.f29040c0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (xnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, xnVar.Q5, xnVar.f43245k5, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = xnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = xnVar.N8();
                    of2.suggestionParams = xnVar.f43157d5;
                    xnVar.getSendMessagesHelper().sendMessage(of2);
                    xnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) miVar.f29040c0;
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
                    SendMessagesHelper.prepareSendingPoll(xnVar2.getAccountInstance(), new eh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), xnVar2.Q5, xnVar2.f43245k5, xnVar2.U3, null, xnVar2.f43221i5, z4, i10, xnVar2.C8(), j10, xnVar2.N8(), xnVar2.f43157d5);
                    xnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.f31336a) {
            case 0:
                ((org.telegram.ui.xn) this.f31337b.f29040c0).d(messageMedia, i10, z4, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.xn) this.f31337b.f29040c0).d(messageMedia, i10, z4, i11, j10);
                return;
            default:
                ((org.telegram.ui.xn) this.f31337b.f29040c0).d(messageMedia, i10, z4, i11, j10);
                return;
        }
    }

    @Override
    public void e(xd.j jVar) {
        this.f31337b.u1();
    }

    @Override
    public boolean f(int i10, View view) {
        TLRPC.User user;
        if (view instanceof fi) {
            fi fiVar = (fi) view;
            mi miVar = this.f31337b;
            if (!miVar.S && (user = fiVar.f26923b) != null) {
                miVar.w1(fiVar.f26924c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int g(org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        float f10;
        int i10;
        switch (this.f31336a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z4) {
                    i10 = org.telegram.ui.ActionBar.k6.f21605a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21749i5;
                }
                int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
                int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var);
                mi miVar = this.f31337b;
                if (miVar.f29065j2) {
                    return i0.a.d(0.75f, v03, miVar.f29068k2);
                }
                return sg.b.l(f10, v02, v03);
            case 5:
                if (this.f31337b.f29065j2) {
                    return 0;
                }
                if (z4) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f31337b.f29065j2) {
                    return 0;
                }
                if (z4) {
                    return 352321535;
                }
                return -1;
            default:
                mi miVar2 = this.f31337b;
                if (miVar2.f29065j2) {
                    if (AndroidUtilities.computePerceivedBrightness(miVar2.f29068k2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z4) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void h(int i10) {
        this.f31337b.U0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        CharSequence charSequence2;
        mi miVar = this.f31337b;
        ui uiVar = miVar.V;
        if (uiVar != null) {
            uiVar.i(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
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
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, xnVar.Q5, xnVar.f43245k5, xnVar.U3, null, z4, i10, i11, xnVar.f43269m5, xnVar.C8(), j10, z10, j11);
                xnVar.y6();
                return;
            }
            return;
        }
        ki kiVar = miVar.W1;
        if (kiVar != null) {
            kiVar.f2(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        mi miVar = this.f31337b;
        miVar.f29110x2 = true;
        miVar.dismiss();
    }

    @Override
    public void run(int i10) {
        mi.o(this.f31337b, i10);
    }

    @Override
    public void a() {
    }
}
