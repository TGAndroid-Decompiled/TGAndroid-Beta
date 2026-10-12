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
import org.telegram.ui.hg1;
public final class ew implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.a2, GenericProvider, aa0, ag0, mm0, org.telegram.ui.py, ai.u9, MessagesStorage.StringCallback, w91, LanguageDetector.StringCallback, bx0 {
    public final int f25791a;
    public final Object f25792b;

    public ew(Object obj, int i10) {
        this.f25791a = i10;
        this.f25792b = obj;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.vy vyVar) {
        return false;
    }

    @Override
    public a0.i W() {
        return null;
    }

    @Override
    public void b(boolean z10) {
        ai.e9 e9Var = (ai.e9) this.f25792b;
        if (z10) {
            e9Var.p(30, false);
        }
    }

    @Override
    public boolean b0(int i10) {
        return true;
    }

    @Override
    public void c() {
        ((ff0) this.f25792b).r(true);
    }

    @Override
    public boolean d(int i10, View view) {
        wk0 wk0Var;
        switch (this.f25791a) {
            case 15:
                xk0 xk0Var = (xk0) this.f25792b;
                ArrayList arrayList = xk0Var.f32799n;
                if (xk0Var.f32798f.j(i10) == 0 && (wk0Var = xk0Var.F) != null) {
                    wk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                ho0 ho0Var = (ho0) this.f25792b;
                go0 go0Var = ho0Var.f26855c;
                MessageObject E = go0Var.E(i10);
                ho0 ho0Var2 = go0Var.f26483c;
                if (E == null) {
                    return false;
                }
                if (!ho0Var.I.g()) {
                    ho0Var.I.a();
                    go0Var.q(0, ho0Var2.f26859r);
                }
                if (ho0Var.I.g()) {
                    ho0Var.I.e(E, view, 0);
                    if (!ho0Var.I.g()) {
                        go0Var.q(0, ho0Var2.f26859r);
                    }
                    org.telegram.ui.q10 q10Var = ho0Var.J;
                    int id2 = E.getId();
                    q10Var.f41138a = E.getDialogId();
                    q10Var.f41139b = id2;
                }
                return true;
        }
    }

    @Override
    public void e(int i10, int i11) {
        yw0 yw0Var = (yw0) this.f25792b;
        yw0Var.f33211w = i10;
        yw0Var.f33212x = i11;
        ci.bb bbVar = yw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25791a) {
            case 2:
                MediaDataController.getInstance(((tz) this.f25792b).v.f25080c1).clearRecentStickers();
                return;
            case 4:
                ((bl) this.f25792b).run();
                return;
            case 5:
                ((h30) this.f25792b).p();
                return;
            case 7:
                g80.R((g80) this.f25792b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f25792b);
                return;
            case 24:
                fz0 fz0Var = (fz0) this.f25792b;
                fz0Var.f26197e.presentFragment(new StickersActivity(fz0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((gz0) this.f25792b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((u61) this.f25792b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        c80 c80Var = (c80) this.f25792b;
        g80 g80Var = c80Var.f24852n;
        g80Var.K(c80Var.f24851f - 1);
        if (c80Var.h == null && !c80Var.f24850e.e() && c80Var.h() <= 2) {
            g80Var.f32975s.e(false, true);
        }
        c80Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        og0 og0Var = ((ng0) this.f25792b).d;
        if (i10 == og0Var.f29177b) {
            og0Var.G = i11;
        } else if (i10 == og0Var.f29197r) {
            og0Var.P = i11;
        } else if (i10 == og0Var.d) {
            og0Var.I = i11;
        } else if (i10 == og0Var.f29179c) {
            og0Var.H = i11;
        } else if (i10 == og0Var.f29184f) {
            og0Var.J = i11;
        } else if (i10 == og0Var.f29182e) {
            og0Var.K = i11;
        } else if (i10 == og0Var.v) {
            og0Var.R = i11;
        } else if (i10 == og0Var.f29199s) {
            og0Var.Q = i11;
        } else if (i10 == og0Var.f29204w) {
            og0Var.S = i11;
        } else if (i10 == og0Var.f29206x) {
            og0Var.U = i11;
        } else if (i10 == og0Var.h) {
            og0Var.L = i11;
        } else if (i10 == og0Var.f29192n) {
            og0Var.M = i11;
        }
        o00 o00Var = og0Var.f29191l0;
        if (o00Var != null) {
            o00Var.e(true, false, false);
        }
        og0Var.g();
    }

    @Override
    public void m(int i10) {
        lw.Q((lw) this.f25792b, i10);
    }

    @Override
    public Object provide(Object obj) {
        gd0 gd0Var = (gd0) obj;
        return Float.valueOf(((o1.j) this.f25792b).f16689a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f25791a) {
            case 20:
                final hw0 hw0Var = ((bt0) this.f25792b).d;
                hw0.r(hw0Var).r(hw0Var.f26947j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        hw0 hw0Var2 = hw0Var;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = hw0.f26919d2;
                                AndroidUtilities.runOnUIThread(new sj0(10, hw0Var2, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = hw0.f26919d2;
                                AndroidUtilities.runOnUIThread(new sj0(10, hw0Var2, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final hw0 hw0Var2 = ((lu0) this.f25792b).d;
                hw0.r(hw0Var2).r(hw0Var2.f26947j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        hw0 hw0Var22 = hw0Var2;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = hw0.f26919d2;
                                AndroidUtilities.runOnUIThread(new sj0(10, hw0Var22, f9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = hw0.f26919d2;
                                AndroidUtilities.runOnUIThread(new sj0(10, hw0Var22, f9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                r51 r51Var = (r51) this.f25792b;
                r51Var.f30045e0 = str;
                r51Var.f30050j0.N(true);
                return;
        }
    }

    @Override
    public boolean w(org.telegram.ui.vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
        long j3;
        jp0 jp0Var = (jp0) this.f25792b;
        int i12 = jp0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = jp0Var.f27614z0;
        for (org.telegram.ui.q10 q10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(q10Var));
        }
        hashMap.clear();
        jp0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, vyVar)) {
                    return true;
                }
            }
            org.telegram.ui.eo eoVar = new org.telegram.ui.eo(i13);
            vyVar.presentFragment(eoVar, true);
            eoVar.Eb(arrayList2);
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
        vyVar.finishFragment();
        return true;
    }

    @Override
    public void mo16run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ew.mo16run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void a() {
    }

    @Override
    public void i() {
    }

    @Override
    public void i0(ArrayList arrayList) {
    }

    @Override
    public void j() {
    }

    @Override
    public void l() {
    }
}
