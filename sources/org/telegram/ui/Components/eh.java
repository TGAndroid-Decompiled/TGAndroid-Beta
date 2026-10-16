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
public final class eh implements ol, org.telegram.ui.ActionBar.z1, ne.k, cm0, eh.d, org.telegram.ui.ActionBar.q0, ho, AndroidUtilities.IntColorCallback, f5, ej {
    public final int f24387a;
    public final vi f24388b;

    public eh(vi viVar, int i10) {
        this.f24387a = i10;
        this.f24388b = viVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j10;
        boolean J1;
        switch (this.f24387a) {
            case 12:
                vi viVar = this.f24388b;
                ni niVar = viVar.B0;
                if (niVar != viVar.f29684j0 && niVar != viVar.f29704q0) {
                    if (!niVar.K(i10, z10, i11, viVar.u1(), 0L)) {
                        viVar.D2 = true;
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.J1(i10, z10, 0, viVar.u1(), viVar.Q0);
                return;
            default:
                vi viVar2 = this.f24388b;
                of ofVar = viVar2.f29678h0;
                if (ofVar != null) {
                    j10 = ofVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                fi fiVar = viVar2.L0;
                viVar2.Q0 = j11;
                fiVar.setEffect(j11);
                ni niVar2 = viVar2.B0;
                if (niVar2 != viVar2.f29684j0 && niVar2 != viVar2.f29704q0) {
                    if (!niVar2.K(i10, z10, i11, viVar2.u1(), j11)) {
                        viVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = viVar2.J1(i10, z10, i11, viVar2.u1(), j11);
                }
                of ofVar2 = viVar2.f29678h0;
                if (ofVar2 != null) {
                    ofVar2.h(!J1);
                    viVar2.f29678h0 = null;
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
            vi viVar = this.f24388b;
            if (!viVar.V && (user = oiVar.f27651b) != null) {
                viVar.z1(oiVar.f27652c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f24387a) {
            case 0:
                ((org.telegram.ui.fo) this.f24388b.f29672f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.fo) this.f24388b.f29672f0).b(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.fo) this.f24388b.f29672f0).b(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f24387a;
        vi viVar = this.f24388b;
        switch (i11) {
            case 10:
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) viVar.f29672f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (foVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, foVar.T5, foVar.f35739n5, foVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = foVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = foVar.S8();
                    of2.suggestionParams = foVar.f35653g5;
                    foVar.getSendMessagesHelper().sendMessage(of2);
                    foVar.B6();
                    return;
                }
                return;
            default:
                org.telegram.ui.fo foVar2 = (org.telegram.ui.fo) viVar.f29672f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (foVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = foVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(foVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), foVar2.T5, foVar2.f35739n5, foVar2.X3, null, foVar2.f35713l5, z10, i10, foVar2.H8(), j10, foVar2.S8(), foVar2.f35653g5);
                    foVar2.B6();
                    return;
                }
                return;
        }
    }

    @Override
    public void e(ne.l lVar) {
        this.f24388b.x1();
    }

    @Override
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f24387a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.g6.f19543a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f19689i5;
                }
                int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var);
                vi viVar = this.f24388b;
                if (viVar.f29703p2) {
                    return i0.a.d(0.75f, w03, viVar.f29706q2);
                }
                return fh.b.m(f7, w02, w03);
            case 5:
                if (this.f24388b.f29703p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f24388b.f29703p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                vi viVar2 = this.f24388b;
                if (viVar2.f29703p2) {
                    if (AndroidUtilities.computePerceivedBrightness(viVar2.f29706q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        vi viVar = this.f24388b;
        viVar.D2 = true;
        viVar.dismiss();
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        vi viVar = this.f24388b;
        ej ejVar = viVar.Y;
        if (ejVar != null) {
            ejVar.i(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        if (m2Var != null && (m2Var instanceof org.telegram.ui.fo)) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            if (foVar.i7()) {
                foVar.o8(charSequence, null);
                AccountInstance accountInstance = foVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, foVar.T5, foVar.f35739n5, foVar.X3, null, z10, i10, i11, foVar.p5, foVar.H8(), j10, z11, j11);
                foVar.B6();
                return;
            }
            return;
        }
        ti tiVar = viVar.f29664c2;
        if (tiVar != null) {
            tiVar.s0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void k(int i10) {
        this.f24388b.f29656a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        vi.u(this.f24388b, i10);
    }

    @Override
    public void c() {
    }
}
