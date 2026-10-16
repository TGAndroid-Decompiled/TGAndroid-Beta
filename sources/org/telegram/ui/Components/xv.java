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
import org.telegram.ui.kg1;
public final class xv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, hg.z1, GenericProvider, v90, vf0, cm0, org.telegram.ui.sy, bi.f9, MessagesStorage.StringCallback, n91, LanguageDetector.StringCallback, rw0 {
    public final int f31015a;
    public final Object f31016b;

    public xv(Object obj, int i10) {
        this.f31015a = i10;
        this.f31016b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean E0(int i10) {
        return true;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean L(org.telegram.ui.yy yyVar) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        pk0 pk0Var;
        switch (this.f31015a) {
            case 15:
                qk0 qk0Var = (qk0) this.f31016b;
                ArrayList arrayList = qk0Var.f28314n;
                if (qk0Var.f28313f.j(i10) == 0 && (pk0Var = qk0Var.F) != null) {
                    pk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                xn0 xn0Var = (xn0) this.f31016b;
                wn0 wn0Var = xn0Var.f30967c;
                MessageObject E = wn0Var.E(i10);
                xn0 xn0Var2 = wn0Var.f30606c;
                if (E == null) {
                    return false;
                }
                if (!xn0Var.I.g()) {
                    xn0Var.I.a();
                    wn0Var.q(0, xn0Var2.f30970r);
                }
                if (xn0Var.I.g()) {
                    xn0Var.I.d(E, view, 0);
                    if (!xn0Var.I.g()) {
                        wn0Var.q(0, xn0Var2.f30970r);
                    }
                    org.telegram.ui.t10 t10Var = xn0Var.J;
                    int id2 = E.getId();
                    t10Var.f39980a = E.getDialogId();
                    t10Var.f39981b = id2;
                }
                return true;
        }
    }

    @Override
    public void b(boolean z10) {
        bi.o8 o8Var = (bi.o8) this.f31016b;
        if (z10) {
            o8Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((af0) this.f31016b).r(true);
    }

    @Override
    public void e(int i10, int i11) {
        ow0 ow0Var = (ow0) this.f31016b;
        ow0Var.f27790w = i10;
        ow0Var.f27791x = i11;
        di.ab abVar = ow0Var.L;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        v70 v70Var = (v70) this.f31016b;
        z70 z70Var = v70Var.f29589n;
        z70Var.K(v70Var.f29588f - 1);
        if (v70Var.h == null && !v70Var.e.e() && v70Var.h() <= 2) {
            z70Var.f28463s.e(false, true);
        }
        v70Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31015a) {
            case 2:
                MediaDataController.getInstance(((mz) this.f31016b).v.f30707c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.gm) this.f31016b).run();
                return;
            case 5:
                ((a30) this.f31016b).o();
                return;
            case 7:
                z70.R((z70) this.f31016b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f31016b);
                return;
            case 24:
                wy0 wy0Var = (wy0) this.f31016b;
                wy0Var.e.presentFragment(new StickersActivity(wy0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((xy0) this.f31016b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((m61) this.f31016b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void k(int i10) {
        ew.Q((ew) this.f31016b, i10);
    }

    @Override
    public a0.h k0() {
        return null;
    }

    @Override
    public void l(int i10, int i11) {
        jg0 jg0Var = ((ig0) this.f31016b).d;
        if (i10 == jg0Var.f25996b) {
            jg0Var.G = i11;
        } else if (i10 == jg0Var.f26015r) {
            jg0Var.P = i11;
        } else if (i10 == jg0Var.d) {
            jg0Var.I = i11;
        } else if (i10 == jg0Var.f25998c) {
            jg0Var.H = i11;
        } else if (i10 == jg0Var.f26002f) {
            jg0Var.J = i11;
        } else if (i10 == jg0Var.e) {
            jg0Var.K = i11;
        } else if (i10 == jg0Var.v) {
            jg0Var.R = i11;
        } else if (i10 == jg0Var.f26017s) {
            jg0Var.Q = i11;
        } else if (i10 == jg0Var.f26022w) {
            jg0Var.S = i11;
        } else if (i10 == jg0Var.f26024x) {
            jg0Var.U = i11;
        } else if (i10 == jg0Var.h) {
            jg0Var.L = i11;
        } else if (i10 == jg0Var.f26010n) {
            jg0Var.M = i11;
        }
        h00 h00Var = jg0Var.f26009l0;
        if (h00Var != null) {
            h00Var.d(true, false, false);
        }
        jg0Var.g();
    }

    @Override
    public Object provide(Object obj) {
        cd0 cd0Var = (cd0) obj;
        return Float.valueOf(((o1.j) this.f31016b).f16160a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f31015a) {
            case 20:
                final xv0 xv0Var = ((rs0) this.f31016b).d;
                xv0.r(xv0Var).r(xv0Var.f31044j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xv0 xv0Var2 = xv0Var;
                        bi.p8 p8Var = (bi.p8) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xv0.f31017d2;
                                AndroidUtilities.runOnUIThread(new g90(19, xv0Var2, p8Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xv0.f31017d2;
                                AndroidUtilities.runOnUIThread(new g90(19, xv0Var2, p8Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final xv0 xv0Var2 = ((bu0) this.f31016b).d;
                xv0.r(xv0Var2).r(xv0Var2.f31044j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xv0 xv0Var22 = xv0Var2;
                        bi.p8 p8Var = (bi.p8) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xv0.f31017d2;
                                AndroidUtilities.runOnUIThread(new g90(19, xv0Var22, p8Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xv0.f31017d2;
                                AndroidUtilities.runOnUIThread(new g90(19, xv0Var22, p8Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                i51 i51Var = (i51) this.f31016b;
                i51Var.f25512e0 = str;
                i51Var.f25517j0.N(true);
                return;
        }
    }

    @Override
    public boolean w(org.telegram.ui.yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        long j10;
        zo0 zo0Var = (zo0) this.f31016b;
        int i12 = zo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = zo0Var.f31641z0;
        for (org.telegram.ui.t10 t10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(t10Var));
        }
        hashMap.clear();
        zo0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, yyVar)) {
                    return true;
                }
            }
            org.telegram.ui.fo foVar = new org.telegram.ui.fo(h);
            yyVar.presentFragment(foVar, true);
            foVar.Eb(arrayList2);
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
        yyVar.finishFragment();
        return true;
    }

    @Override
    public void mo16run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv.mo16run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void O0(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void i() {
    }

    @Override
    public void j() {
    }

    @Override
    public void m() {
    }
}
