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
public final class ch implements bl, le.k, org.telegram.ui.ActionBar.a2, bl0, dh.d, org.telegram.ui.ActionBar.r0, tn, AndroidUtilities.IntColorCallback, b5, dj {
    public final int f23084a;
    public final vi f23085b;

    public ch(vi viVar, int i10) {
        this.f23084a = i10;
        this.f23085b = viVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f23084a) {
            case 12:
                vi viVar = this.f23085b;
                ni niVar = viVar.f28808y0;
                if (niVar != viVar.f28759j0 && niVar != viVar.f28779q0) {
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
                vi viVar2 = this.f23085b;
                kf kfVar = viVar2.f28753h0;
                if (kfVar != null) {
                    j3 = kfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar2 = viVar2.f28808y0;
                if (niVar2 != viVar2.f28759j0 && niVar2 != viVar2.f28779q0) {
                    if (!niVar2.I(i10, z10, i11, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(i10, z10, i11, viVar2.s1(), j10);
                }
                kf kfVar2 = viVar2.f28753h0;
                if (kfVar2 != null) {
                    kfVar2.h(!G1);
                    viVar2.f28753h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f23084a) {
            case 0:
                ((org.telegram.ui.bo) this.f23085b.f28747f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.bo) this.f23085b.f28747f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.bo) this.f23085b.f28747f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(le.l lVar) {
        this.f23085b.u1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof oi) {
            oi oiVar = (oi) view;
            vi viVar = this.f23085b;
            if (!viVar.V && (user = oiVar.f26804b) != null) {
                viVar.w1(oiVar.f26805c, user);
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
        int i11 = this.f23084a;
        vi viVar = this.f23085b;
        switch (i11) {
            case 10:
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) viVar.f28747f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (boVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, boVar.T5, boVar.f32398n5, boVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = boVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = boVar.N8();
                    of2.suggestionParams = boVar.f32313g5;
                    boVar.getSendMessagesHelper().sendMessage(of2);
                    boVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.bo boVar2 = (org.telegram.ui.bo) viVar.f28747f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (boVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = boVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(boVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), boVar2.T5, boVar2.f32398n5, boVar2.X3, null, boVar2.f32372l5, z10, i10, boVar2.C8(), j3, boVar2.N8(), boVar2.f32313g5);
                    boVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        vi viVar = this.f23085b;
        viVar.A2 = true;
        viVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f23084a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.i6.f18778a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.i6.f18922i5;
                }
                int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var);
                vi viVar = this.f23085b;
                if (viVar.f28768m2) {
                    return i0.a.d(0.75f, v03, viVar.f28772n2);
                }
                return eh.b.m(f7, v02, v03);
            case 5:
                if (this.f23085b.f28768m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f23085b.f28768m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                vi viVar2 = this.f23085b;
                if (viVar2.f28768m2) {
                    if (AndroidUtilities.computePerceivedBrightness(viVar2.f28772n2) <= 0.72f) {
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
        vi viVar = this.f23085b;
        dj djVar = viVar.Y;
        if (djVar != null) {
            djVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f28747f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.bo)) {
            org.telegram.ui.bo boVar = (org.telegram.ui.bo) n2Var;
            if (boVar.f7()) {
                boVar.l8(charSequence, null);
                AccountInstance accountInstance = boVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, boVar.T5, boVar.f32398n5, boVar.X3, null, z10, i10, i11, boVar.p5, boVar.C8(), j3, z11, j10);
                boVar.y6();
                return;
            }
            return;
        }
        ti tiVar = viVar.Z1;
        if (tiVar != null) {
            tiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f23085b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        vi.o(this.f23085b, i10);
    }

    @Override
    public void a() {
    }
}
