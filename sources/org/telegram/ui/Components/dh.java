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
public final class dh implements cl, le.l, org.telegram.ui.ActionBar.a2, cl0, dh.d, org.telegram.ui.ActionBar.r0, un, AndroidUtilities.IntColorCallback, d5, ej {
    public final int f23404a;
    public final wi f23405b;

    public dh(wi wiVar, int i10) {
        this.f23404a = i10;
        this.f23405b = wiVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f23404a) {
            case 12:
                wi wiVar = this.f23405b;
                oi oiVar = wiVar.f29726y0;
                if (oiVar != wiVar.f29677j0 && oiVar != wiVar.f29697q0) {
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
                wi wiVar2 = this.f23405b;
                mf mfVar = wiVar2.f29671h0;
                if (mfVar != null) {
                    j3 = mfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = j10;
                giVar.setEffect(j10);
                oi oiVar2 = wiVar2.f29726y0;
                if (oiVar2 != wiVar2.f29677j0 && oiVar2 != wiVar2.f29697q0) {
                    if (!oiVar2.I(i10, z10, i11, wiVar2.s1(), j10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = wiVar2.G1(i10, z10, i11, wiVar2.s1(), j10);
                }
                mf mfVar2 = wiVar2.f29671h0;
                if (mfVar2 != null) {
                    mfVar2.h(!G1);
                    wiVar2.f29671h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f23404a) {
            case 0:
                ((org.telegram.ui.xn) this.f23405b.f29665f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.xn) this.f23405b.f29665f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.xn) this.f23405b.f29665f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(le.m mVar) {
        this.f23405b.u1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof pi) {
            pi piVar = (pi) view;
            wi wiVar = this.f23405b;
            if (!wiVar.V && (user = piVar.f27051b) != null) {
                wiVar.w1(piVar.f27052c, user);
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
        int i11 = this.f23404a;
        wi wiVar = this.f23405b;
        switch (i11) {
            case 10:
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) wiVar.f29665f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (xnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, xnVar.T5, xnVar.f39475n5, xnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = xnVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = xnVar.N8();
                    of2.suggestionParams = xnVar.f39390g5;
                    xnVar.getSendMessagesHelper().sendMessage(of2);
                    xnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) wiVar.f29665f0;
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
                    SendMessagesHelper.prepareSendingPoll(xnVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), xnVar2.T5, xnVar2.f39475n5, xnVar2.X3, null, xnVar2.f39449l5, z10, i10, xnVar2.C8(), j3, xnVar2.N8(), xnVar2.f39390g5);
                    xnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        wi wiVar = this.f23405b;
        wiVar.A2 = true;
        wiVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f23404a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.h6.f18733a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f18877i5;
                }
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, d6Var);
                wi wiVar = this.f23405b;
                if (wiVar.f29686m2) {
                    return i0.a.d(0.75f, v03, wiVar.f29690n2);
                }
                return eh.b.m(f7, v02, v03);
            case 5:
                if (this.f23405b.f29686m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f23405b.f29686m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                wi wiVar2 = this.f23405b;
                if (wiVar2.f29686m2) {
                    if (AndroidUtilities.computePerceivedBrightness(wiVar2.f29690n2) <= 0.72f) {
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
        wi wiVar = this.f23405b;
        ej ejVar = wiVar.Y;
        if (ejVar != null) {
            ejVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var;
            if (xnVar.f7()) {
                xnVar.l8(charSequence, null);
                AccountInstance accountInstance = xnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, xnVar.T5, xnVar.f39475n5, xnVar.X3, null, z10, i10, i11, xnVar.p5, xnVar.C8(), j3, z11, j10);
                xnVar.y6();
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
        this.f23405b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        wi.o(this.f23405b, i10);
    }

    @Override
    public void a() {
    }
}
