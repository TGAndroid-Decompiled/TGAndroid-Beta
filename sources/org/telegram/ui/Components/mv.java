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
public final class mv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, f90, gf0, ol0, org.telegram.ui.oy, ai.t9, MessagesStorage.StringCallback, b91, LanguageDetector.StringCallback, fw0 {
    public final int f26548a;
    public final Object f26549b;

    public mv(Object obj, int i10) {
        this.f26548a = i10;
        this.f26549b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public boolean L(int i10) {
        return true;
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26549b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((le0) this.f26549b).p(true);
    }

    @Override
    public boolean d(int i10, View view) {
        bk0 bk0Var;
        switch (this.f26548a) {
            case 15:
                ck0 ck0Var = (ck0) this.f26549b;
                ArrayList arrayList = ck0Var.f23390n;
                if (ck0Var.f23389f.j(i10) == 0 && (bk0Var = ck0Var.F) != null) {
                    bk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                kn0 kn0Var = (kn0) this.f26549b;
                jn0 jn0Var = kn0Var.f25767c;
                MessageObject E = jn0Var.E(i10);
                kn0 kn0Var2 = jn0Var.f25416c;
                if (E == null) {
                    return false;
                }
                if (!kn0Var.I.g()) {
                    kn0Var.I.a();
                    jn0Var.q(0, kn0Var2.f25770r);
                }
                if (kn0Var.I.g()) {
                    kn0Var.I.e(E, view, 0);
                    if (!kn0Var.I.g()) {
                        jn0Var.q(0, kn0Var2.f25770r);
                    }
                    org.telegram.ui.p10 p10Var = kn0Var.J;
                    int id2 = E.getId();
                    p10Var.f36450a = E.getDialogId();
                    p10Var.f36451b = id2;
                }
                return true;
        }
    }

    @Override
    public void e(int i10, int i11) {
        cw0 cw0Var = (cw0) this.f26549b;
        cw0Var.f23483w = i10;
        cw0Var.f23484x = i11;
        ci.eb ebVar = cw0Var.L;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        i70 i70Var = (i70) this.f26549b;
        m70 m70Var = i70Var.f24991n;
        m70Var.J(i70Var.f24990f - 1);
        if (i70Var.h == null && !i70Var.e.e() && i70Var.h() <= 2) {
            m70Var.f23879s.e(false, true);
        }
        i70Var.l();
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((y51) this.f26549b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void j(int i10, int i11) {
        uf0 uf0Var = ((tf0) this.f26549b).d;
        if (i10 == uf0Var.f28725b) {
            uf0Var.G = i11;
        } else if (i10 == uf0Var.f28744r) {
            uf0Var.P = i11;
        } else if (i10 == uf0Var.d) {
            uf0Var.I = i11;
        } else if (i10 == uf0Var.f28727c) {
            uf0Var.H = i11;
        } else if (i10 == uf0Var.f28731f) {
            uf0Var.J = i11;
        } else if (i10 == uf0Var.e) {
            uf0Var.K = i11;
        } else if (i10 == uf0Var.v) {
            uf0Var.R = i11;
        } else if (i10 == uf0Var.f28746s) {
            uf0Var.Q = i11;
        } else if (i10 == uf0Var.f28751w) {
            uf0Var.S = i11;
        } else if (i10 == uf0Var.f28753x) {
            uf0Var.U = i11;
        } else if (i10 == uf0Var.h) {
            uf0Var.L = i11;
        } else if (i10 == uf0Var.f28739n) {
            uf0Var.M = i11;
        }
        vz vzVar = uf0Var.f28738l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        uf0Var.g();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26548a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f26549b).v.f25858c1).clearRecentStickers();
                return;
            case 4:
                ((wm) this.f26549b).run();
                return;
            case 5:
                ((n20) this.f26549b).n();
                return;
            case 7:
                m70.Q((m70) this.f26549b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26549b);
                return;
            case 24:
                ky0 ky0Var = (ky0) this.f26549b;
                ky0Var.e.presentFragment(new StickersActivity(ky0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((my0) this.f26549b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void m(int i10) {
        tv.P((tv) this.f26549b, i10);
    }

    @Override
    public Object provide(Object obj) {
        nc0 nc0Var = (nc0) obj;
        return Float.valueOf(((o1.j) this.f26549b).f15536a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26548a) {
            case 20:
                final lv0 lv0Var = ((fs0) this.f26549b).d;
                lv0.r(lv0Var).r(lv0Var.f26209j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        lv0 lv0Var2 = lv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = lv0.f26182d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = lv0.f26182d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final lv0 lv0Var2 = ((pt0) this.f26549b).d;
                lv0.r(lv0Var2).r(lv0Var2.f26209j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        lv0 lv0Var22 = lv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = lv0.f26182d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = lv0.f26182d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                w41 w41Var = (w41) this.f26549b;
                w41Var.f29921e0 = str;
                w41Var.f29926j0.N(true);
                return;
        }
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        no0 no0Var = (no0) this.f26549b;
        int i12 = no0Var.I0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = no0Var.A0;
        for (org.telegram.ui.p10 p10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(p10Var));
        }
        hashMap.clear();
        no0Var.R(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = a4.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, uyVar)) {
                    return true;
                }
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i13);
            uyVar.presentFragment(znVar, true);
            znVar.Ab(arrayList2);
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
        uyVar.finishFragment();
        return true;
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void O(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void h() {
    }

    @Override
    public void i() {
    }

    @Override
    public void l() {
    }
}
