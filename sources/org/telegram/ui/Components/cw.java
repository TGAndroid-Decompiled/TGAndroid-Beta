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
public final class cw implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.a2, GenericProvider, x90, yf0, hm0, org.telegram.ui.ny, ai.u9, MessagesStorage.StringCallback, r91, LanguageDetector.StringCallback, ww0 {
    public final int f25419a;
    public final Object f25420b;

    public cw(Object obj, int i10) {
        this.f25419a = i10;
        this.f25420b = obj;
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
        ai.e9 e9Var = (ai.e9) this.f25420b;
        if (z10) {
            e9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((df0) this.f25420b).r(true);
    }

    @Override
    public boolean d(int i10, View view) {
        uk0 uk0Var;
        switch (this.f25419a) {
            case 15:
                vk0 vk0Var = (vk0) this.f25420b;
                ArrayList arrayList = vk0Var.f31875n;
                if (vk0Var.f31874f.j(i10) == 0 && (uk0Var = vk0Var.F) != null) {
                    uk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                co0 co0Var = (co0) this.f25420b;
                bo0 bo0Var = co0Var.f25343c;
                MessageObject E = bo0Var.E(i10);
                co0 co0Var2 = bo0Var.f25013c;
                if (E == null) {
                    return false;
                }
                if (!co0Var.I.g()) {
                    co0Var.I.a();
                    bo0Var.q(0, co0Var2.f25347r);
                }
                if (co0Var.I.g()) {
                    co0Var.I.e(E, view, 0);
                    if (!co0Var.I.g()) {
                        bo0Var.q(0, co0Var2.f25347r);
                    }
                    org.telegram.ui.o10 o10Var = co0Var.J;
                    int id2 = E.getId();
                    o10Var.f40443a = E.getDialogId();
                    o10Var.f40444b = id2;
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
        tw0 tw0Var = (tw0) this.f25420b;
        tw0Var.f31269w = i10;
        tw0Var.f31270x = i11;
        ci.bb bbVar = tw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25419a) {
            case 2:
                MediaDataController.getInstance(((rz) this.f25420b).v.f24689c1).clearRecentStickers();
                return;
            case 4:
                ((zk) this.f25420b).run();
                return;
            case 5:
                ((f30) this.f25420b).p();
                return;
            case 7:
                e80.R((e80) this.f25420b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f25420b);
                return;
            case 24:
                az0 az0Var = (az0) this.f25420b;
                az0Var.f24672e.presentFragment(new StickersActivity(az0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((bz0) this.f25420b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((q61) this.f25420b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        a80 a80Var = (a80) this.f25420b;
        e80 e80Var = a80Var.f24507n;
        e80Var.K(a80Var.f24506f - 1);
        if (a80Var.h == null && !a80Var.f24505e.e() && a80Var.h() <= 2) {
            e80Var.f31415s.e(false, true);
        }
        a80Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        mg0 mg0Var = ((lg0) this.f25420b).d;
        if (i10 == mg0Var.f28782b) {
            mg0Var.G = i11;
        } else if (i10 == mg0Var.f28802r) {
            mg0Var.P = i11;
        } else if (i10 == mg0Var.d) {
            mg0Var.I = i11;
        } else if (i10 == mg0Var.f28784c) {
            mg0Var.H = i11;
        } else if (i10 == mg0Var.f28789f) {
            mg0Var.J = i11;
        } else if (i10 == mg0Var.f28787e) {
            mg0Var.K = i11;
        } else if (i10 == mg0Var.v) {
            mg0Var.R = i11;
        } else if (i10 == mg0Var.f28804s) {
            mg0Var.Q = i11;
        } else if (i10 == mg0Var.f28809w) {
            mg0Var.S = i11;
        } else if (i10 == mg0Var.f28811x) {
            mg0Var.U = i11;
        } else if (i10 == mg0Var.h) {
            mg0Var.L = i11;
        } else if (i10 == mg0Var.f28797n) {
            mg0Var.M = i11;
        }
        m00 m00Var = mg0Var.f28796l0;
        if (m00Var != null) {
            m00Var.e(true, false, false);
        }
        mg0Var.g();
    }

    @Override
    public void m(int i10) {
        jw.Q((jw) this.f25420b, i10);
    }

    @Override
    public Object provide(Object obj) {
        dd0 dd0Var = (dd0) obj;
        return Float.valueOf(((o1.j) this.f25420b).f16941a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f25419a) {
            case 20:
                final cw0 cw0Var = ((ws0) this.f25420b).d;
                cw0.r(cw0Var).r(cw0Var.f25449j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        cw0 cw0Var2 = cw0Var;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = cw0.f25421d2;
                                AndroidUtilities.runOnUIThread(new di0(13, cw0Var2, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = cw0.f25421d2;
                                AndroidUtilities.runOnUIThread(new di0(13, cw0Var2, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final cw0 cw0Var2 = ((gu0) this.f25420b).d;
                cw0.r(cw0Var2).r(cw0Var2.f25449j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        cw0 cw0Var22 = cw0Var2;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = cw0.f25421d2;
                                AndroidUtilities.runOnUIThread(new di0(13, cw0Var22, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = cw0.f25421d2;
                                AndroidUtilities.runOnUIThread(new di0(13, cw0Var22, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                n51 n51Var = (n51) this.f25420b;
                n51Var.f28999e0 = str;
                n51Var.f29004j0.N(true);
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
        ep0 ep0Var = (ep0) this.f25420b;
        int i12 = ep0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ep0Var.f26150z0;
        for (org.telegram.ui.o10 o10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(o10Var));
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
