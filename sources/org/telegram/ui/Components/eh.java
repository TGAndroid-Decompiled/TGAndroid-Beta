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
public final class eh implements bl, le.k, org.telegram.ui.ActionBar.a2, bl0, eh.d, org.telegram.ui.ActionBar.r0, sn, AndroidUtilities.IntColorCallback, d5, dj {
    public final int f25727a;
    public final vi f25728b;

    public eh(vi viVar, int i10) {
        this.f25727a = i10;
        this.f25728b = viVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f25727a) {
            case 12:
                vi viVar = this.f25728b;
                ni niVar = viVar.f31368y0;
                if (niVar != viVar.f31319j0 && niVar != viVar.f31339q0) {
                    if (!niVar.I(i10, z10, i11, viVar.s1(), 0L)) {
                        viVar.A2 = true;
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.G1(i10, z10, 0, viVar.s1(), viVar.N0);
                return;
            default:
                vi viVar2 = this.f25728b;
                nf nfVar = viVar2.f31313h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar2 = viVar2.f31368y0;
                if (niVar2 != viVar2.f31319j0 && niVar2 != viVar2.f31339q0) {
                    if (!niVar2.I(i10, z10, i11, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(i10, z10, i11, viVar2.s1(), j10);
                }
                nf nfVar2 = viVar2.f31313h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    viVar2.f31313h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        TLRPC.User user;
        if (view instanceof oi) {
            oi oiVar = (oi) view;
            vi viVar = this.f25728b;
            if (!viVar.V && (user = oiVar.f29102b) != null) {
                viVar.w1(oiVar.f29103c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f25727a) {
            case 0:
                ((org.telegram.ui.co) this.f25728b.f31307f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.co) this.f25728b.f31307f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.co) this.f25728b.f31307f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f25727a;
        vi viVar = this.f25728b;
        switch (i11) {
            case 10:
                org.telegram.ui.co coVar = (org.telegram.ui.co) viVar.f31307f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (coVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, coVar.T5, coVar.f35380n5, coVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = coVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = coVar.N8();
                    of2.suggestionParams = coVar.f35295g5;
                    coVar.getSendMessagesHelper().sendMessage(of2);
                    coVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.co coVar2 = (org.telegram.ui.co) viVar.f31307f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (coVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = coVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(coVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), coVar2.T5, coVar2.f35380n5, coVar2.X3, null, coVar2.f35354l5, z10, i10, coVar2.C8(), j3, coVar2.N8(), coVar2.f35295g5);
                    coVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void e(le.l lVar) {
        this.f25728b.u1();
    }

    @Override
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f25727a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.j6.f20635a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f20780i5;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20691d6, f6Var);
                vi viVar = this.f25728b;
                if (viVar.f31328m2) {
                    return i0.a.d(0.75f, v03, viVar.f31332n2);
                }
                return fh.b.m(f7, v02, v03);
            case 5:
                if (this.f25728b.f31328m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f25728b.f31328m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                vi viVar2 = this.f25728b;
                if (viVar2.f31328m2) {
                    if (AndroidUtilities.computePerceivedBrightness(viVar2.f31332n2) <= 0.72f) {
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
        vi viVar = this.f25728b;
        viVar.A2 = true;
        viVar.dismiss();
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        vi viVar = this.f25728b;
        dj djVar = viVar.Y;
        if (djVar != null) {
            djVar.i(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31307f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.co)) {
            org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var;
            if (coVar.f7()) {
                coVar.l8(charSequence, null);
                AccountInstance accountInstance = coVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, coVar.T5, coVar.f35380n5, coVar.X3, null, z10, i10, i11, coVar.p5, coVar.C8(), j3, z11, j10);
                coVar.y6();
                return;
            }
            return;
        }
        ti tiVar = viVar.Z1;
        if (tiVar != null) {
            tiVar.E0(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f25728b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        vi.o(this.f25728b, i10);
    }

    @Override
    public void c() {
    }
}
