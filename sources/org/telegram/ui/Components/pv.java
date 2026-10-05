package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.wf1;
public final class pv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, i90, hf0, ol0, org.telegram.ui.oy, ai.t9, MessagesStorage.StringCallback, j91, LanguageDetector.StringCallback, pw0, ImageReceiver.ImageReceiverDelegate {
    public final int f29848a;
    public final Object f29849b;

    public pv(Object obj, int i10) {
        this.f29848a = i10;
        this.f29849b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        l70 l70Var = (l70) this.f29849b;
        p70 p70Var = l70Var.f28390n;
        p70Var.H(l70Var.f28389f - 1);
        if (l70Var.h == null && !l70Var.f28388e.e() && l70Var.h() <= 2) {
            p70Var.f29394s.e(false, true);
        }
        l70Var.l();
    }

    @Override
    public void c() {
        ((me0) this.f29849b).p(true);
    }

    @Override
    public boolean d(int i10, View view) {
        bk0 bk0Var;
        switch (this.f29848a) {
            case 15:
                ck0 ck0Var = (ck0) this.f29849b;
                ArrayList arrayList = ck0Var.f25459n;
                if (ck0Var.f25458f.j(i10) == 0 && (bk0Var = ck0Var.F) != null) {
                    bk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                on0 on0Var = (on0) this.f29849b;
                nn0 nn0Var = on0Var.f29514c;
                MessageObject E = nn0Var.E(i10);
                on0 on0Var2 = nn0Var.f29120c;
                if (E == null) {
                    return false;
                }
                if (!on0Var.I.g()) {
                    on0Var.I.a();
                    nn0Var.q(0, on0Var2.f29518r);
                }
                if (on0Var.I.g()) {
                    on0Var.I.e(E, view, 0);
                    if (!on0Var.I.g()) {
                        nn0Var.q(0, on0Var2.f29518r);
                    }
                    org.telegram.ui.p10 p10Var = on0Var.J;
                    int id2 = E.getId();
                    p10Var.f39326a = E.getDialogId();
                    p10Var.f39327b = id2;
                }
                return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        k81 k81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        l81 l81Var = (l81) this.f29849b;
        ImageReceiver imageReceiver2 = l81Var.Q;
        if (z10) {
            if (l81Var.N != null || l81Var.f28405d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.du0 du0Var = l81Var.N;
                if (du0Var != null) {
                    ArrayList arrayList = du0Var.v;
                    int indexOf = arrayList.indexOf(du0Var.c((int) l81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = du0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                ceil2 = Math.ceil(videoDuration);
                            } else if (videoDuration <= 250) {
                                ceil2 = Math.ceil(videoDuration / 2.0f);
                            } else if (videoDuration <= 500) {
                                ceil2 = Math.ceil(videoDuration / 4.0f);
                            } else if (videoDuration <= 1000) {
                                ceil2 = Math.ceil(videoDuration / 5.0f);
                            } else {
                                ceil2 = Math.ceil(videoDuration / 10.0f);
                            }
                            i11 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            i11 = 25;
                        }
                    } else {
                        i11 = 0;
                    }
                    float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                    float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                    org.telegram.ui.du0 du0Var2 = l81Var.N;
                    int i12 = (int) l81Var.O;
                    int videoDuration2 = du0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i12)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i12 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i12 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i12 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i12 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i11 - 1);
                    l81Var.R = (int) ((min % 5) * bitmapWidth);
                    l81Var.S = (int) ((min / 5) * bitmapHeight);
                    l81Var.T = (int) bitmapWidth;
                    l81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < l81Var.f28405d0.size()) {
                            k81Var = (k81) l81Var.f28405d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = k81Var.f28109a;
                            }
                            if (i13 == l81Var.f28405d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((k81) l81Var.f28405d0.get(i13 + 1)).f28109a;
                            }
                            double d11 = l81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            k81Var = null;
                            break;
                        }
                    }
                    if (k81Var != null) {
                        l81Var.R = k81Var.f28110b;
                        l81Var.S = k81Var.f28111c;
                        l81Var.T = l81Var.f28402b0;
                        l81Var.U = l81Var.f28404c0;
                    } else {
                        return;
                    }
                }
                l81Var.P = true;
                float f7 = l81Var.T / l81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = l81Var.getLayoutParams();
                if (l81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    l81Var.setVisibility(0);
                    l81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        mw0 mw0Var = (mw0) this.f29849b;
        mw0Var.f28855w = i10;
        mw0Var.f28856x = i11;
        ci.ab abVar = mw0Var.L;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override
    public void f(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f29849b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29848a) {
            case 2:
                MediaDataController.getInstance(((ez) this.f29849b).v.f29194c1).clearRecentStickers();
                return;
            case 4:
                ((zm) this.f29849b).run();
                return;
            case 5:
                ((r20) this.f29849b).n();
                return;
            case 7:
                p70.O((p70) this.f29849b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f29849b);
                return;
            case 24:
                ty0 ty0Var = (ty0) this.f29849b;
                ty0Var.f31257e.presentFragment(new StickersActivity(ty0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((vy0) this.f29849b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i10) {
        Utilities.Callback callback = ((h61) this.f29849b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void k(int i10, int i11) {
        vf0 vf0Var = ((uf0) this.f29849b).d;
        if (i10 == vf0Var.f31718b) {
            vf0Var.G = i11;
        } else if (i10 == vf0Var.f31738r) {
            vf0Var.P = i11;
        } else if (i10 == vf0Var.d) {
            vf0Var.I = i11;
        } else if (i10 == vf0Var.f31720c) {
            vf0Var.H = i11;
        } else if (i10 == vf0Var.f31725f) {
            vf0Var.J = i11;
        } else if (i10 == vf0Var.f31723e) {
            vf0Var.K = i11;
        } else if (i10 == vf0Var.v) {
            vf0Var.R = i11;
        } else if (i10 == vf0Var.f31740s) {
            vf0Var.Q = i11;
        } else if (i10 == vf0Var.f31745w) {
            vf0Var.S = i11;
        } else if (i10 == vf0Var.f31747x) {
            vf0Var.U = i11;
        } else if (i10 == vf0Var.h) {
            vf0Var.L = i11;
        } else if (i10 == vf0Var.f31733n) {
            vf0Var.M = i11;
        }
        yz yzVar = vf0Var.f31732l0;
        if (yzVar != null) {
            yzVar.e(true, false, false);
        }
        vf0Var.g();
    }

    @Override
    public void m(int i10) {
        wv.N((wv) this.f29849b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        pc0 pc0Var = (pc0) obj;
        return Float.valueOf(((o1.j) this.f29849b).f16992a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f29848a) {
            case 20:
                final qv0 qv0Var = ((ks0) this.f29849b).d;
                qv0.r(qv0Var).r(qv0Var.f30238j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        qv0 qv0Var2 = qv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = qv0.f30210d2;
                                AndroidUtilities.runOnUIThread(new vo0(5, qv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = qv0.f30210d2;
                                AndroidUtilities.runOnUIThread(new vo0(5, qv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final qv0 qv0Var2 = ((ut0) this.f29849b).d;
                qv0.r(qv0Var2).r(qv0Var2.f30238j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        qv0 qv0Var22 = qv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = qv0.f30210d2;
                                AndroidUtilities.runOnUIThread(new vo0(5, qv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = qv0.f30210d2;
                                AndroidUtilities.runOnUIThread(new vo0(5, qv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                f51 f51Var = (f51) this.f29849b;
                f51Var.f26338e0 = str;
                f51Var.f26343j0.N(true);
                return;
        }
    }

    @Override
    public a0.i s() {
        return null;
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        qo0 qo0Var = (qo0) this.f29849b;
        int i12 = qo0Var.J0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = qo0Var.B0;
        for (org.telegram.ui.p10 p10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(p10Var));
        }
        hashMap.clear();
        qo0Var.S(false);
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
            org.telegram.ui.yn ynVar = new org.telegram.ui.yn(i13);
            uyVar.presentFragment(ynVar, true);
            ynVar.zb(arrayList2);
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
    public a0.i x() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void F(ArrayList arrayList) {
    }

    @Override
    public void b() {
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
