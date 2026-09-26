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
public final class eh implements cl, le.l, org.telegram.ui.ActionBar.z1, ml0, dh.d, org.telegram.ui.ActionBar.q0, un, AndroidUtilities.IntColorCallback, d5, ej {
    public final int f23958a;
    public final wi f23959b;

    public eh(wi wiVar, int i10) {
        this.f23958a = i10;
        this.f23959b = wiVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f23958a) {
            case 12:
                wi wiVar = this.f23959b;
                oi oiVar = wiVar.f30066y0;
                if (oiVar != wiVar.f30017j0 && oiVar != wiVar.f30037q0) {
                    if (!oiVar.I(i10, z10, i11, wiVar.s1(), 0L)) {
                        wiVar.A2 = true;
                        wiVar.dismiss();
                        return;
                    }
                    return;
                }
                wiVar.G1(i10, z10, 0, wiVar.s1(), wiVar.N0);
                return;
            default:
                wi wiVar2 = this.f23959b;
                nf nfVar = wiVar2.f30011h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = j10;
                giVar.setEffect(j10);
                oi oiVar2 = wiVar2.f30066y0;
                if (oiVar2 != wiVar2.f30017j0 && oiVar2 != wiVar2.f30037q0) {
                    if (!oiVar2.I(i10, z10, i11, wiVar2.s1(), j10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = wiVar2.G1(i10, z10, i11, wiVar2.s1(), j10);
                }
                nf nfVar2 = wiVar2.f30011h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    wiVar2.f30011h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f23958a) {
            case 0:
                ((org.telegram.ui.wn) this.f23959b.f30005f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.wn) this.f23959b.f30005f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.wn) this.f23959b.f30005f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(le.m mVar) {
        this.f23959b.u1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof pi) {
            pi piVar = (pi) view;
            wi wiVar = this.f23959b;
            if (!wiVar.V && (user = piVar.f27348b) != null) {
                wiVar.w1(piVar.f27349c, user);
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
        int i11 = this.f23958a;
        wi wiVar = this.f23959b;
        switch (i11) {
            case 10:
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) wiVar.f30005f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (wnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, wnVar.T5, wnVar.f39574n5, wnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = wnVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = wnVar.N8();
                    of2.suggestionParams = wnVar.f39489g5;
                    wnVar.getSendMessagesHelper().sendMessage(of2);
                    wnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.wn wnVar2 = (org.telegram.ui.wn) wiVar.f30005f0;
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
                    SendMessagesHelper.prepareSendingPoll(wnVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), wnVar2.T5, wnVar2.f39574n5, wnVar2.X3, null, wnVar2.f39548l5, z10, i10, wnVar2.C8(), j3, wnVar2.N8(), wnVar2.f39489g5);
                    wnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wi wiVar = this.f23959b;
        wiVar.A2 = true;
        wiVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f23958a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.h6.f19003a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f19147i5;
                }
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var);
                wi wiVar = this.f23959b;
                if (wiVar.f30026m2) {
                    return i0.a.d(0.75f, v03, wiVar.f30030n2);
                }
                return eh.b.m(f7, v02, v03);
            case 5:
                if (this.f23959b.f30026m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f23959b.f30026m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                wi wiVar2 = this.f23959b;
                if (wiVar2.f30026m2) {
                    if (AndroidUtilities.computePerceivedBrightness(wiVar2.f30030n2) <= 0.72f) {
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
        wi wiVar = this.f23959b;
        ej ejVar = wiVar.Y;
        if (ejVar != null) {
            ejVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
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
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, wnVar.T5, wnVar.f39574n5, wnVar.X3, null, z10, i10, i11, wnVar.p5, wnVar.C8(), j3, z11, j10);
                wnVar.y6();
                return;
            }
            return;
        }
        ui uiVar = wiVar.Z1;
        if (uiVar != null) {
            uiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f23959b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        wi.o(this.f23959b, i10);
    }

    @Override
    public void a() {
    }
}
