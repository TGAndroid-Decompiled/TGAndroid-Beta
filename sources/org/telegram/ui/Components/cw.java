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
public final class cw implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.a2, GenericProvider, x90, yf0, im0, org.telegram.ui.my, ai.u9, MessagesStorage.StringCallback, s91, LanguageDetector.StringCallback, xw0 {
    public final int f25330a;
    public final Object f25331b;

    public cw(Object obj, int i10) {
        this.f25330a = i10;
        this.f25331b = obj;
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
        ai.e9 e9Var = (ai.e9) this.f25331b;
        if (z10) {
            e9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((df0) this.f25331b).r(true);
    }

    @Override
    public boolean d(int i10, View view) {
        vk0 vk0Var;
        switch (this.f25330a) {
            case 15:
                wk0 wk0Var = (wk0) this.f25331b;
                ArrayList arrayList = wk0Var.f32668n;
                if (wk0Var.f32667f.j(i10) == 0 && (vk0Var = wk0Var.F) != null) {
                    vk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                do0 do0Var = (do0) this.f25331b;
                co0 co0Var = do0Var.f25645c;
                MessageObject E = co0Var.E(i10);
                do0 do0Var2 = co0Var.f25252c;
                if (E == null) {
                    return false;
                }
                if (!do0Var.I.g()) {
                    do0Var.I.a();
                    co0Var.q(0, do0Var2.f25649r);
                }
                if (do0Var.I.g()) {
                    do0Var.I.e(E, view, 0);
                    if (!do0Var.I.g()) {
                        co0Var.q(0, do0Var2.f25649r);
                    }
                    org.telegram.ui.n10 n10Var = do0Var.J;
                    int id2 = E.getId();
                    n10Var.f40110a = E.getDialogId();
                    n10Var.f40111b = id2;
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
        uw0 uw0Var = (uw0) this.f25331b;
        uw0Var.f31604w = i10;
        uw0Var.f31605x = i11;
        ci.bb bbVar = uw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25330a) {
            case 2:
                MediaDataController.getInstance(((rz) this.f25331b).v.f24662c1).clearRecentStickers();
                return;
            case 4:
                ((zk) this.f25331b).run();
                return;
            case 5:
                ((f30) this.f25331b).p();
                return;
            case 7:
                e80.R((e80) this.f25331b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f25331b);
                return;
            case 24:
                bz0 bz0Var = (bz0) this.f25331b;
                bz0Var.f25042e.presentFragment(new StickersActivity(bz0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((cz0) this.f25331b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((r61) this.f25331b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        a80 a80Var = (a80) this.f25331b;
        e80 e80Var = a80Var.f24464n;
        e80Var.K(a80Var.f24463f - 1);
        if (a80Var.h == null && !a80Var.f24462e.e() && a80Var.h() <= 2) {
            e80Var.f31699s.e(false, true);
        }
        a80Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        mg0 mg0Var = ((lg0) this.f25331b).d;
        if (i10 == mg0Var.f28671b) {
            mg0Var.G = i11;
        } else if (i10 == mg0Var.f28691r) {
            mg0Var.P = i11;
        } else if (i10 == mg0Var.d) {
            mg0Var.I = i11;
        } else if (i10 == mg0Var.f28673c) {
            mg0Var.H = i11;
        } else if (i10 == mg0Var.f28678f) {
            mg0Var.J = i11;
        } else if (i10 == mg0Var.f28676e) {
            mg0Var.K = i11;
        } else if (i10 == mg0Var.v) {
            mg0Var.R = i11;
        } else if (i10 == mg0Var.f28693s) {
            mg0Var.Q = i11;
        } else if (i10 == mg0Var.f28698w) {
            mg0Var.S = i11;
        } else if (i10 == mg0Var.f28700x) {
            mg0Var.U = i11;
        } else if (i10 == mg0Var.h) {
            mg0Var.L = i11;
        } else if (i10 == mg0Var.f28686n) {
            mg0Var.M = i11;
        }
        m00 m00Var = mg0Var.f28685l0;
        if (m00Var != null) {
            m00Var.e(true, false, false);
        }
        mg0Var.g();
    }

    @Override
    public void m(int i10) {
        jw.Q((jw) this.f25331b, i10);
    }

    @Override
    public Object provide(Object obj) {
        dd0 dd0Var = (dd0) obj;
        return Float.valueOf(((o1.j) this.f25331b).f16987a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f25330a) {
            case 20:
                final dw0 dw0Var = ((xs0) this.f25331b).d;
                dw0.r(dw0Var).r(dw0Var.f25710j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        dw0 dw0Var2 = dw0Var;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = dw0.f25682d2;
                                AndroidUtilities.runOnUIThread(new fi0(12, dw0Var2, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = dw0.f25682d2;
                                AndroidUtilities.runOnUIThread(new fi0(12, dw0Var2, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final dw0 dw0Var2 = ((hu0) this.f25331b).d;
                dw0.r(dw0Var2).r(dw0Var2.f25710j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        dw0 dw0Var22 = dw0Var2;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = dw0.f25682d2;
                                AndroidUtilities.runOnUIThread(new fi0(12, dw0Var22, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = dw0.f25682d2;
                                AndroidUtilities.runOnUIThread(new fi0(12, dw0Var22, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                o51 o51Var = (o51) this.f25331b;
                o51Var.f29265e0 = str;
                o51Var.f29270j0.N(true);
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
        fp0 fp0Var = (fp0) this.f25331b;
        int i12 = fp0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = fp0Var.f26460z0;
        for (org.telegram.ui.n10 n10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(n10Var));
        }
        hashMap.clear();
        fp0Var.Q(false);
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
