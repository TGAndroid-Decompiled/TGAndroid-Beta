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
import org.telegram.ui.ye1;
public final class tv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, hg.z1, GenericProvider, q90, sf0, cm0, org.telegram.ui.xx, ci.p7, MessagesStorage.StringCallback, n91, LanguageDetector.StringCallback, rw0 {
    public final int f30914a;
    public final Object f30915b;

    public tv(Object obj, int i10) {
        this.f30914a = i10;
        this.f30915b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean J(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void b(boolean z10) {
        ci.z6 z6Var = (ci.z6) this.f30915b;
        if (z10) {
            z6Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((xe0) this.f30915b).q(true);
    }

    @Override
    public boolean d(int i10, View view) {
        pk0 pk0Var;
        switch (this.f30914a) {
            case 15:
                qk0 qk0Var = (qk0) this.f30915b;
                ArrayList arrayList = qk0Var.f29930n;
                if (qk0Var.f29929f.j(i10) == 0 && (pk0Var = qk0Var.F) != null) {
                    pk0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                xn0 xn0Var = (xn0) this.f30915b;
                wn0 wn0Var = xn0Var.f32608c;
                MessageObject E = wn0Var.E(i10);
                xn0 xn0Var2 = wn0Var.f32277c;
                if (E == null) {
                    return false;
                }
                if (!xn0Var.I.g()) {
                    xn0Var.I.a();
                    wn0Var.q(0, xn0Var2.f32611r);
                }
                if (xn0Var.I.g()) {
                    xn0Var.I.d(E, view, 0);
                    if (!xn0Var.I.g()) {
                        wn0Var.q(0, xn0Var2.f32611r);
                    }
                    org.telegram.ui.a10 a10Var = xn0Var.J;
                    int id2 = E.getId();
                    a10Var.f35546a = E.getDialogId();
                    a10Var.f35547b = id2;
                }
                return true;
        }
    }

    @Override
    public void e(int i10, int i11) {
        ow0 ow0Var = (ow0) this.f30915b;
        ow0Var.f29353w = i10;
        ow0Var.f29354x = i11;
        ai.jc jcVar = ow0Var.L;
        if (jcVar != null) {
            jcVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        t70 t70Var = (t70) this.f30915b;
        x70 x70Var = t70Var.f30662n;
        x70Var.J(t70Var.f30661f - 1);
        if (t70Var.h == null && !t70Var.e.e() && t70Var.h() <= 2) {
            x70Var.f30407s.e(false, true);
        }
        t70Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30914a) {
            case 2:
                MediaDataController.getInstance(((kz) this.f30915b).v.f30966c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.h4) this.f30915b).run();
                return;
            case 5:
                ((w20) this.f30915b).n();
                return;
            case 7:
                x70.Q((x70) this.f30915b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f30915b);
                return;
            case 24:
                vy0 vy0Var = (vy0) this.f30915b;
                vy0Var.e.presentFragment(new StickersActivity(vy0Var.d, null));
                c2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((wy0) this.f30915b);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        aw.Z((aw) this.f30915b, i10);
    }

    @Override
    public void i(int i10) {
        Utilities.Callback callback = ((m61) this.f30915b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void l(int i10, int i11) {
        hg0 hg0Var = ((gg0) this.f30915b).d;
        if (i10 == hg0Var.f26919b) {
            hg0Var.G = i11;
        } else if (i10 == hg0Var.f26938r) {
            hg0Var.P = i11;
        } else if (i10 == hg0Var.d) {
            hg0Var.I = i11;
        } else if (i10 == hg0Var.f26921c) {
            hg0Var.H = i11;
        } else if (i10 == hg0Var.f26925f) {
            hg0Var.J = i11;
        } else if (i10 == hg0Var.e) {
            hg0Var.K = i11;
        } else if (i10 == hg0Var.v) {
            hg0Var.R = i11;
        } else if (i10 == hg0Var.f26940s) {
            hg0Var.Q = i11;
        } else if (i10 == hg0Var.f26945w) {
            hg0Var.S = i11;
        } else if (i10 == hg0Var.f26947x) {
            hg0Var.U = i11;
        } else if (i10 == hg0Var.h) {
            hg0Var.L = i11;
        } else if (i10 == hg0Var.f26933n) {
            hg0Var.M = i11;
        }
        e00 e00Var = hg0Var.f26932l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        hg0Var.g();
    }

    @Override
    public Object provide(Object obj) {
        yc0 yc0Var = (yc0) obj;
        return Float.valueOf(((o1.j) this.f30915b).f17621a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f30914a) {
            case 20:
                final xv0 xv0Var = ((rs0) this.f30915b).d;
                xv0.s(xv0Var).r(xv0Var.f32686j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xv0 xv0Var2 = xv0Var;
                        ci.a7 a7Var = (ci.a7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xv0.f32656g2;
                                AndroidUtilities.runOnUIThread(new ko0(7, xv0Var2, a7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xv0.f32656g2;
                                AndroidUtilities.runOnUIThread(new ko0(7, xv0Var2, a7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final xv0 xv0Var2 = ((bu0) this.f30915b).d;
                xv0.s(xv0Var2).r(xv0Var2.f32686j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xv0 xv0Var22 = xv0Var2;
                        ci.a7 a7Var = (ci.a7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xv0.f32656g2;
                                AndroidUtilities.runOnUIThread(new ko0(7, xv0Var22, a7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xv0.f32656g2;
                                AndroidUtilities.runOnUIThread(new ko0(7, xv0Var22, a7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                k51 k51Var = (k51) this.f30915b;
                k51Var.f27877e0 = str;
                k51Var.f27882j0.N(true);
                return;
        }
    }

    @Override
    public boolean w(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        long j10;
        ap0 ap0Var = (ap0) this.f30915b;
        int i12 = ap0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ap0Var.f24822z0;
        for (org.telegram.ui.a10 a10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(a10Var));
        }
        hashMap.clear();
        ap0Var.P(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle h = a1.g.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                h.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else {
                if (DialogObject.isUserDialog(j11)) {
                    h.putLong("user_id", j11);
                } else {
                    h.putLong("chat_id", -j11);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, eyVar)) {
                    return true;
                }
            }
            org.telegram.ui.sn snVar = new org.telegram.ui.sn(h);
            eyVar.presentFragment(snVar, true);
            snVar.Gb(arrayList2);
            return true;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        eyVar.finishFragment();
        return true;
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public void mo0run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv.mo0run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void S(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }
}
