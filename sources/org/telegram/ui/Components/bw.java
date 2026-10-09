package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.fg1;
public final class bw implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.a2, GenericProvider, w90, wf0, gm0, org.telegram.ui.ny, ai.u9, MessagesStorage.StringCallback, q91, LanguageDetector.StringCallback, vw0 {
    public final int f25111a;
    public final Object f25112b;

    public bw(Object obj, int i10) {
        this.f25111a = i10;
        this.f25112b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.ty tyVar) {
        return false;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public void b(boolean z10) {
        ai.e9 e9Var = (ai.e9) this.f25112b;
        if (z10) {
            e9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((bf0) this.f25112b).r(true);
    }

    @Override
    public boolean d(int i10, View view) {
        tk0 tk0Var;
        switch (this.f25111a) {
            case 15:
                uk0 uk0Var = (uk0) this.f25112b;
                ArrayList arrayList = uk0Var.f31526n;
                if (uk0Var.f31525f.j(i10) == 0 && (tk0Var = uk0Var.F) != null) {
                    tk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                bo0 bo0Var = (bo0) this.f25112b;
                ao0 ao0Var = bo0Var.f25068c;
                MessageObject E = ao0Var.E(i10);
                bo0 bo0Var2 = ao0Var.f24724c;
                if (E == null) {
                    return false;
                }
                if (!bo0Var.I.g()) {
                    bo0Var.I.a();
                    ao0Var.q(0, bo0Var2.f25072r);
                }
                if (bo0Var.I.g()) {
                    bo0Var.I.e(E, view, 0);
                    if (!bo0Var.I.g()) {
                        ao0Var.q(0, bo0Var2.f25072r);
                    }
                    org.telegram.ui.o10 o10Var = bo0Var.J;
                    int id2 = E.getId();
                    o10Var.f40397a = E.getDialogId();
                    o10Var.f40398b = id2;
                }
                return true;
        }
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void e(int i10, int i11) {
        sw0 sw0Var = (sw0) this.f25112b;
        sw0Var.f30943w = i10;
        sw0Var.f30944x = i11;
        ci.bb bbVar = sw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25111a) {
            case 2:
                MediaDataController.getInstance(((qz) this.f25112b).v.f24401c1).clearRecentStickers();
                return;
            case 4:
                ((zk) this.f25112b).run();
                return;
            case 5:
                ((e30) this.f25112b).p();
                return;
            case 7:
                d80.R((d80) this.f25112b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f25112b);
                return;
            case 24:
                zy0 zy0Var = (zy0) this.f25112b;
                zy0Var.f33684e.presentFragment(new StickersActivity(zy0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((az0) this.f25112b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((p61) this.f25112b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        z70 z70Var = (z70) this.f25112b;
        d80 d80Var = z70Var.f33489n;
        d80Var.K(z70Var.f33488f - 1);
        if (z70Var.h == null && !z70Var.f33487e.e() && z70Var.h() <= 2) {
            d80Var.f31081s.e(false, true);
        }
        z70Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        kg0 kg0Var = ((jg0) this.f25112b).d;
        if (i10 == kg0Var.f27973b) {
            kg0Var.G = i11;
        } else if (i10 == kg0Var.f27993r) {
            kg0Var.P = i11;
        } else if (i10 == kg0Var.d) {
            kg0Var.I = i11;
        } else if (i10 == kg0Var.f27975c) {
            kg0Var.H = i11;
        } else if (i10 == kg0Var.f27980f) {
            kg0Var.J = i11;
        } else if (i10 == kg0Var.f27978e) {
            kg0Var.K = i11;
        } else if (i10 == kg0Var.v) {
            kg0Var.R = i11;
        } else if (i10 == kg0Var.f27995s) {
            kg0Var.Q = i11;
        } else if (i10 == kg0Var.f28000w) {
            kg0Var.S = i11;
        } else if (i10 == kg0Var.f28002x) {
            kg0Var.U = i11;
        } else if (i10 == kg0Var.h) {
            kg0Var.L = i11;
        } else if (i10 == kg0Var.f27988n) {
            kg0Var.M = i11;
        }
        l00 l00Var = kg0Var.f27987l0;
        if (l00Var != null) {
            l00Var.e(true, false, false);
        }
        kg0Var.g();
    }

    @Override
    public void m(int i10) {
        iw.Q((iw) this.f25112b, i10);
    }

    @Override
    public Object provide(Object obj) {
        cd0 cd0Var = (cd0) obj;
        return Float.valueOf(((o1.j) this.f25112b).f16937a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f25111a) {
            case 20:
                final bw0 bw0Var = ((vs0) this.f25112b).d;
                bw0.r(bw0Var).r(bw0Var.f25141j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        bw0 bw0Var2 = bw0Var;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = bw0.f25113d2;
                                AndroidUtilities.runOnUIThread(new ci0(13, bw0Var2, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = bw0.f25113d2;
                                AndroidUtilities.runOnUIThread(new ci0(13, bw0Var2, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final bw0 bw0Var2 = ((fu0) this.f25112b).d;
                bw0.r(bw0Var2).r(bw0Var2.f25141j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        bw0 bw0Var22 = bw0Var2;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = bw0.f25113d2;
                                AndroidUtilities.runOnUIThread(new ci0(13, bw0Var22, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = bw0.f25113d2;
                                AndroidUtilities.runOnUIThread(new ci0(13, bw0Var22, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                m51 m51Var = (m51) this.f25112b;
                m51Var.f28697e0 = str;
                m51Var.f28702j0.N(true);
                return;
        }
    }

    @Override
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public boolean w(org.telegram.ui.ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        dp0 dp0Var = (dp0) this.f25112b;
        int i12 = dp0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = dp0Var.f25789z0;
        for (org.telegram.ui.o10 o10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(o10Var));
        }
        hashMap.clear();
        dp0Var.Q(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, tyVar)) {
                    return true;
                }
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i13);
            tyVar.presentFragment(znVar, true);
            znVar.Eb(arrayList2);
            return true;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j3, false, false, true, 0, 0L);
        }
        tyVar.finishFragment();
        return true;
    }

    @Override
    public void mo16run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw.mo16run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void a() {
    }

    @Override
    public void i() {
    }

    @Override
    public void j() {
    }

    @Override
    public void l() {
    }

    @Override
    public void x0(ArrayList arrayList) {
    }
}
