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
public final class ih implements ul, org.telegram.ui.ActionBar.z1, me.k, mm0, dh.d, org.telegram.ui.ActionBar.q0, mo, AndroidUtilities.IntColorCallback, f5, jj {
    public final int f27161a;
    public final aj f27162b;

    public ih(aj ajVar, int i10) {
        this.f27161a = i10;
        this.f27162b = ajVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean J1;
        switch (this.f27161a) {
            case 12:
                aj ajVar = this.f27162b;
                si siVar = ajVar.B0;
                if (siVar != ajVar.f24354j0 && siVar != ajVar.f24374q0) {
                    if (!siVar.K(i10, z10, i11, ajVar.u1(), 0L)) {
                        ajVar.D2 = true;
                        ajVar.dismiss();
                        return;
                    }
                    return;
                }
                ajVar.J1(i10, z10, 0, ajVar.u1(), ajVar.Q0);
                return;
            default:
                aj ajVar2 = this.f27162b;
                rf rfVar = ajVar2.f24348h0;
                if (rfVar != null) {
                    j3 = rfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ki kiVar = ajVar2.L0;
                ajVar2.Q0 = j10;
                kiVar.setEffect(j10);
                si siVar2 = ajVar2.B0;
                if (siVar2 != ajVar2.f24354j0 && siVar2 != ajVar2.f24374q0) {
                    if (!siVar2.K(i10, z10, i11, ajVar2.u1(), j10)) {
                        ajVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = ajVar2.J1(i10, z10, i11, ajVar2.u1(), j10);
                }
                rf rfVar2 = ajVar2.f24348h0;
                if (rfVar2 != null) {
                    rfVar2.h(!J1);
                    ajVar2.f24348h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f27161a) {
            case 0:
                ((org.telegram.ui.eo) this.f27162b.f24342f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.eo) this.f27162b.f24342f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.eo) this.f27162b.f24342f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(me.l lVar) {
        this.f27162b.x1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof ti) {
            ti tiVar = (ti) view;
            aj ajVar = this.f27162b;
            if (!ajVar.V && (user = tiVar.f30882b) != null) {
                ajVar.z1(tiVar.f30883c, user);
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
        int i11 = this.f27161a;
        aj ajVar = this.f27162b;
        switch (i11) {
            case 10:
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) ajVar.f24342f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (eoVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, eoVar.T5, eoVar.f37356n5, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = eoVar.H8();
                    of2.payStars = j3;
                    of2.monoForumPeer = eoVar.S8();
                    of2.suggestionParams = eoVar.f37271g5;
                    eoVar.getSendMessagesHelper().sendMessage(of2);
                    eoVar.B6();
                    return;
                }
                return;
            default:
                org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) ajVar.f24342f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (eoVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = eoVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(eoVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), eoVar2.T5, eoVar2.f37356n5, eoVar2.X3, null, eoVar2.f37330l5, z10, i10, eoVar2.H8(), j3, eoVar2.S8(), eoVar2.f37271g5);
                    eoVar2.B6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        aj ajVar = this.f27162b;
        ajVar.D2 = true;
        ajVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f27161a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.h6.f20503a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f20649i5;
                }
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, c6Var);
                aj ajVar = this.f27162b;
                if (ajVar.f24373p2) {
                    return i0.a.d(0.75f, w03, ajVar.f24376q2);
                }
                return eh.b.m(f7, w02, w03);
            case 5:
                if (this.f27162b.f24373p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f27162b.f24373p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                aj ajVar2 = this.f27162b;
                if (ajVar2.f24373p2) {
                    if (AndroidUtilities.computePerceivedBrightness(ajVar2.f24376q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        aj ajVar = this.f27162b;
        jj jjVar = ajVar.Y;
        if (jjVar != null) {
            jjVar.i(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        if (m2Var != null && (m2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var;
            if (eoVar.i7()) {
                eoVar.o8(charSequence, null);
                AccountInstance accountInstance = eoVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, eoVar.T5, eoVar.f37356n5, eoVar.X3, null, z10, i10, i11, eoVar.p5, eoVar.H8(), j3, z11, j10);
                eoVar.B6();
                return;
            }
            return;
        }
        yi yiVar = ajVar.f24333c2;
        if (yiVar != null) {
            yiVar.c2(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f27162b.f24325a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        aj.u(this.f27162b, i10);
    }

    @Override
    public void a() {
    }
}
