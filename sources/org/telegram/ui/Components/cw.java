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
import org.telegram.ui.eg1;
public final class cw implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.a2, GenericProvider, w90, xf0, hm0, org.telegram.ui.my, ai.u9, MessagesStorage.StringCallback, r91, LanguageDetector.StringCallback, ww0 {
    public final int f25481a;
    public final Object f25482b;

    public cw(Object obj, int i10) {
        this.f25481a = i10;
        this.f25482b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.sy syVar) {
        return false;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public void b(boolean z10) {
        ai.e9 e9Var = (ai.e9) this.f25482b;
        if (z10) {
            e9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((cf0) this.f25482b).r(true);
    }

    @Override
    public boolean d(int i10, View view) {
        uk0 uk0Var;
        switch (this.f25481a) {
            case 15:
                vk0 vk0Var = (vk0) this.f25482b;
                ArrayList arrayList = vk0Var.f31909n;
                if (vk0Var.f31908f.j(i10) == 0 && (uk0Var = vk0Var.F) != null) {
                    uk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                co0 co0Var = (co0) this.f25482b;
                bo0 bo0Var = co0Var.f25405c;
                MessageObject E = bo0Var.E(i10);
                co0 co0Var2 = bo0Var.f25052c;
                if (E == null) {
                    return false;
                }
                if (!co0Var.I.g()) {
                    co0Var.I.a();
                    bo0Var.q(0, co0Var2.f25409r);
                }
                if (co0Var.I.g()) {
                    co0Var.I.e(E, view, 0);
                    if (!co0Var.I.g()) {
                        bo0Var.q(0, co0Var2.f25409r);
                    }
                    org.telegram.ui.n10 n10Var = co0Var.J;
                    int id2 = E.getId();
                    n10Var.f40144a = E.getDialogId();
                    n10Var.f40145b = id2;
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
        tw0 tw0Var = (tw0) this.f25482b;
        tw0Var.f31388w = i10;
        tw0Var.f31389x = i11;
        ci.bb bbVar = tw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25481a) {
            case 2:
                MediaDataController.getInstance(((rz) this.f25482b).v.f24731c1).clearRecentStickers();
                return;
            case 4:
                ((zk) this.f25482b).run();
                return;
            case 5:
                ((f30) this.f25482b).p();
                return;
            case 7:
                d80.R((d80) this.f25482b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f25482b);
                return;
            case 24:
                az0 az0Var = (az0) this.f25482b;
                az0Var.f24714e.presentFragment(new StickersActivity(az0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((bz0) this.f25482b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((q61) this.f25482b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        z70 z70Var = (z70) this.f25482b;
        d80 d80Var = z70Var.f33571n;
        d80Var.K(z70Var.f33570f - 1);
        if (z70Var.h == null && !z70Var.f33569e.e() && z70Var.h() <= 2) {
            d80Var.f31472s.e(false, true);
        }
        z70Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        lg0 lg0Var = ((kg0) this.f25482b).d;
        if (i10 == lg0Var.f28381b) {
            lg0Var.G = i11;
        } else if (i10 == lg0Var.f28401r) {
            lg0Var.P = i11;
        } else if (i10 == lg0Var.d) {
            lg0Var.I = i11;
        } else if (i10 == lg0Var.f28383c) {
            lg0Var.H = i11;
        } else if (i10 == lg0Var.f28388f) {
            lg0Var.J = i11;
        } else if (i10 == lg0Var.f28386e) {
            lg0Var.K = i11;
        } else if (i10 == lg0Var.v) {
            lg0Var.R = i11;
        } else if (i10 == lg0Var.f28403s) {
            lg0Var.Q = i11;
        } else if (i10 == lg0Var.f28408w) {
            lg0Var.S = i11;
        } else if (i10 == lg0Var.f28410x) {
            lg0Var.U = i11;
        } else if (i10 == lg0Var.h) {
            lg0Var.L = i11;
        } else if (i10 == lg0Var.f28396n) {
            lg0Var.M = i11;
        }
        m00 m00Var = lg0Var.f28395l0;
        if (m00Var != null) {
            m00Var.e(true, false, false);
        }
        lg0Var.g();
    }

    @Override
    public void m(int i10) {
        jw.Q((jw) this.f25482b, i10);
    }

    @Override
    public Object provide(Object obj) {
        cd0 cd0Var = (cd0) obj;
        return Float.valueOf(((o1.j) this.f25482b).f17023a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f25481a) {
            case 20:
                final cw0 cw0Var = ((ws0) this.f25482b).d;
                cw0.r(cw0Var).r(cw0Var.f25511j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        cw0 cw0Var2 = cw0Var;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = cw0.f25483d2;
                                AndroidUtilities.runOnUIThread(new ei0(12, cw0Var2, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = cw0.f25483d2;
                                AndroidUtilities.runOnUIThread(new ei0(12, cw0Var2, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final cw0 cw0Var2 = ((gu0) this.f25482b).d;
                cw0.r(cw0Var2).r(cw0Var2.f25511j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        cw0 cw0Var22 = cw0Var2;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = cw0.f25483d2;
                                AndroidUtilities.runOnUIThread(new ei0(12, cw0Var22, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = cw0.f25483d2;
                                AndroidUtilities.runOnUIThread(new ei0(12, cw0Var22, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                n51 n51Var = (n51) this.f25482b;
                n51Var.f29039e0 = str;
                n51Var.f29044j0.N(true);
                return;
        }
    }

    @Override
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public boolean w(org.telegram.ui.sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        long j3;
        ep0 ep0Var = (ep0) this.f25482b;
        int i12 = ep0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ep0Var.f26188z0;
        for (org.telegram.ui.n10 n10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(n10Var));
        }
        hashMap.clear();
        ep0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, syVar)) {
                    return true;
                }
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i13);
            syVar.presentFragment(znVar, true);
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
        syVar.finishFragment();
        return true;
    }

    @Override
    public void mo16run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cw.mo16run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
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
