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
public final class gh implements sl, org.telegram.ui.ActionBar.a2, me.k, gm0, dh.d, org.telegram.ui.ActionBar.r0, ko, AndroidUtilities.IntColorCallback, f5, hj {
    public final int f26696a;
    public final yi f26697b;

    public gh(yi yiVar, int i10) {
        this.f26696a = i10;
        this.f26697b = yiVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean J1;
        switch (this.f26696a) {
            case 12:
                yi yiVar = this.f26697b;
                qi qiVar = yiVar.B0;
                if (qiVar != yiVar.f33240j0 && qiVar != yiVar.f33260q0) {
                    if (!qiVar.K(i10, z10, i11, yiVar.u1(), 0L)) {
                        yiVar.D2 = true;
                        yiVar.dismiss();
                        return;
                    }
                    return;
                }
                yiVar.J1(i10, z10, 0, yiVar.u1(), yiVar.Q0);
                return;
            default:
                yi yiVar2 = this.f26697b;
                pf pfVar = yiVar2.f33234h0;
                if (pfVar != null) {
                    j3 = pfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ii iiVar = yiVar2.L0;
                yiVar2.Q0 = j10;
                iiVar.setEffect(j10);
                qi qiVar2 = yiVar2.B0;
                if (qiVar2 != yiVar2.f33240j0 && qiVar2 != yiVar2.f33260q0) {
                    if (!qiVar2.K(i10, z10, i11, yiVar2.u1(), j10)) {
                        yiVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = yiVar2.J1(i10, z10, i11, yiVar2.u1(), j10);
                }
                pf pfVar2 = yiVar2.f33234h0;
                if (pfVar2 != null) {
                    pfVar2.h(!J1);
                    yiVar2.f33234h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f26696a) {
            case 0:
                ((org.telegram.ui.zn) this.f26697b.f33228f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.zn) this.f26697b.f33228f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.zn) this.f26697b.f33228f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(me.l lVar) {
        this.f26697b.x1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof ri) {
            ri riVar = (ri) view;
            yi yiVar = this.f26697b;
            if (!yiVar.V && (user = riVar.f30449b) != null) {
                yiVar.z1(riVar.f30450c, user);
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
        int i11 = this.f26696a;
        yi yiVar = this.f26697b;
        switch (i11) {
            case 10:
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) yiVar.f33228f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (znVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, znVar.T5, znVar.f44866n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = znVar.H8();
                    of2.payStars = j3;
                    of2.monoForumPeer = znVar.S8();
                    of2.suggestionParams = znVar.f44781g5;
                    znVar.getSendMessagesHelper().sendMessage(of2);
                    znVar.B6();
                    return;
                }
                return;
            default:
                org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) yiVar.f33228f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (znVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = znVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(znVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), znVar2.T5, znVar2.f44866n5, znVar2.X3, null, znVar2.f44840l5, z10, i10, znVar2.H8(), j3, znVar2.S8(), znVar2.f44781g5);
                    znVar2.B6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yi yiVar = this.f26697b;
        yiVar.D2 = true;
        yiVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f26696a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.i6.f20741a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.i6.f20887i5;
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
                int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var);
                yi yiVar = this.f26697b;
                if (yiVar.f33259p2) {
                    return i0.a.d(0.75f, w03, yiVar.f33262q2);
                }
                return eh.b.m(f7, w02, w03);
            case 5:
                if (this.f26697b.f33259p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f26697b.f33259p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                yi yiVar2 = this.f26697b;
                if (yiVar2.f33259p2) {
                    if (AndroidUtilities.computePerceivedBrightness(yiVar2.f33262q2) <= 0.72f) {
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
        yi yiVar = this.f26697b;
        hj hjVar = yiVar.Y;
        if (hjVar != null) {
            hjVar.i(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            if (znVar.i7()) {
                znVar.o8(charSequence, null);
                AccountInstance accountInstance = znVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, znVar.T5, znVar.f44866n5, znVar.X3, null, z10, i10, i11, znVar.p5, znVar.H8(), j3, z11, j10);
                znVar.B6();
                return;
            }
            return;
        }
        wi wiVar = yiVar.f33219c2;
        if (wiVar != null) {
            wiVar.c2(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f26697b.f33211a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        yi.u(this.f26697b, i10);
    }

    @Override
    public void a() {
    }
}
