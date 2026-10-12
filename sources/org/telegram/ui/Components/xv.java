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
import org.telegram.ui.lg1;
public final class xv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, hg.z1, GenericProvider, v90, uf0, cm0, org.telegram.ui.sy, bi.f9, MessagesStorage.StringCallback, m91, LanguageDetector.StringCallback, rw0 {
    public final int f31334a;
    public final Object f31335b;

    public xv(Object obj, int i10) {
        this.f31334a = i10;
        this.f31335b = obj;
    }

    @Override
    public boolean D() {
        return false;
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
        switch (this.f31334a) {
            case 15:
                qk0 qk0Var = (qk0) this.f31335b;
                ArrayList arrayList = qk0Var.f28632n;
                if (qk0Var.f28631f.j(i10) == 0 && (pk0Var = qk0Var.F) != null) {
                    pk0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                yn0 yn0Var = (yn0) this.f31335b;
                xn0 xn0Var = yn0Var.f31655c;
                MessageObject E = xn0Var.E(i10);
                yn0 yn0Var2 = xn0Var.f31288c;
                if (E == null) {
                    return false;
                }
                if (!yn0Var.I.g()) {
                    yn0Var.I.a();
                    xn0Var.q(0, yn0Var2.f31658r);
                }
                if (yn0Var.I.g()) {
                    yn0Var.I.d(E, view, 0);
                    if (!yn0Var.I.g()) {
                        xn0Var.q(0, yn0Var2.f31658r);
                    }
                    org.telegram.ui.u10 u10Var = yn0Var.J;
                    int id2 = E.getId();
                    u10Var.f40516a = E.getDialogId();
                    u10Var.f40517b = id2;
                }
                return true;
        }
    }

    @Override
    public void b(boolean z10) {
        bi.o8 o8Var = (bi.o8) this.f31335b;
        if (z10) {
            o8Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((ze0) this.f31335b).r(true);
    }

    @Override
    public void e(int i10, int i11) {
        ow0 ow0Var = (ow0) this.f31335b;
        ow0Var.f28106w = i10;
        ow0Var.f28107x = i11;
        di.ab abVar = ow0Var.L;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        Utilities.Callback callback = ((l61) this.f31335b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31334a) {
            case 2:
                MediaDataController.getInstance(((mz) this.f31335b).v.f31014c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.gm) this.f31335b).run();
                return;
            case 5:
                ((a30) this.f31335b).o();
                return;
            case 7:
                a80.R((a80) this.f31335b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f31335b);
                return;
            case 24:
                vy0 vy0Var = (vy0) this.f31335b;
                vy0Var.e.presentFragment(new StickersActivity(vy0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((wy0) this.f31335b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i10, int i11) {
        ig0 ig0Var = ((hg0) this.f31335b).d;
        if (i10 == ig0Var.f25945b) {
            ig0Var.G = i11;
        } else if (i10 == ig0Var.f25964r) {
            ig0Var.P = i11;
        } else if (i10 == ig0Var.d) {
            ig0Var.I = i11;
        } else if (i10 == ig0Var.f25947c) {
            ig0Var.H = i11;
        } else if (i10 == ig0Var.f25951f) {
            ig0Var.J = i11;
        } else if (i10 == ig0Var.e) {
            ig0Var.K = i11;
        } else if (i10 == ig0Var.v) {
            ig0Var.R = i11;
        } else if (i10 == ig0Var.f25966s) {
            ig0Var.Q = i11;
        } else if (i10 == ig0Var.f25971w) {
            ig0Var.S = i11;
        } else if (i10 == ig0Var.f25973x) {
            ig0Var.U = i11;
        } else if (i10 == ig0Var.h) {
            ig0Var.L = i11;
        } else if (i10 == ig0Var.f25959n) {
            ig0Var.M = i11;
        }
        h00 h00Var = ig0Var.f25958l0;
        if (h00Var != null) {
            h00Var.d(true, false, false);
        }
        ig0Var.g();
    }

    @Override
    public a0.h j0() {
        return null;
    }

    @Override
    public void k(int i10) {
        w70 w70Var = (w70) this.f31335b;
        a80 a80Var = w70Var.f30813n;
        a80Var.K(w70Var.f30812f - 1);
        if (w70Var.h == null && !w70Var.e.e() && w70Var.h() <= 2) {
            a80Var.f28541s.e(false, true);
        }
        w70Var.l();
    }

    @Override
    public void l(int i10) {
        ew.Q((ew) this.f31335b, i10);
    }

    @Override
    public Object provide(Object obj) {
        cd0 cd0Var = (cd0) obj;
        return Float.valueOf(((o1.j) this.f31335b).f16467a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f31334a) {
            case 20:
                final xv0 xv0Var = ((rs0) this.f31335b).d;
                xv0.r(xv0Var).r(xv0Var.f31363j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xv0 xv0Var2 = xv0Var;
                        bi.p8 p8Var = (bi.p8) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xv0.f31336d2;
                                AndroidUtilities.runOnUIThread(new f60(24, xv0Var2, p8Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xv0.f31336d2;
                                AndroidUtilities.runOnUIThread(new f60(24, xv0Var2, p8Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final xv0 xv0Var2 = ((bu0) this.f31335b).d;
                xv0.r(xv0Var2).r(xv0Var2.f31363j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xv0 xv0Var22 = xv0Var2;
                        bi.p8 p8Var = (bi.p8) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xv0.f31336d2;
                                AndroidUtilities.runOnUIThread(new f60(24, xv0Var22, p8Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xv0.f31336d2;
                                AndroidUtilities.runOnUIThread(new f60(24, xv0Var22, p8Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                i51 i51Var = (i51) this.f31335b;
                i51Var.f25843e0 = str;
                i51Var.f25848j0.N(true);
                return;
        }
    }

    @Override
    public boolean t0(int i10) {
        return true;
    }

    @Override
    public boolean w(org.telegram.ui.yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        long j10;
        zo0 zo0Var = (zo0) this.f31335b;
        int i12 = zo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = zo0Var.f31938z0;
        for (org.telegram.ui.u10 u10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(u10Var));
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
    public void I0(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void h() {
    }

    @Override
    public void i() {
    }

    @Override
    public void m() {
    }
}
