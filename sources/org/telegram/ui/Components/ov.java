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
public final class ov implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.b2, GenericProvider, i90, if0, pl0, org.telegram.ui.ky, ai.t9, MessagesStorage.StringCallback, a91, LanguageDetector.StringCallback, gw0, ImageReceiver.ImageReceiverDelegate {
    public final int f27179a;
    public final Object f27180b;

    public ov(Object obj, int i10) {
        this.f27179a = i10;
        this.f27180b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        l70 l70Var = (l70) this.f27180b;
        p70 p70Var = l70Var.f25929n;
        p70Var.J(l70Var.f25928f - 1);
        if (l70Var.h == null && !l70Var.e.e() && l70Var.h() <= 2) {
            p70Var.f23901s.e(false, true);
        }
        l70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f27180b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ck0 ck0Var;
        switch (this.f27179a) {
            case 15:
                dk0 dk0Var = (dk0) this.f27180b;
                ArrayList arrayList = dk0Var.f23669n;
                if (dk0Var.f23668f.j(i10) == 0 && (ck0Var = dk0Var.F) != null) {
                    ck0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                ln0 ln0Var = (ln0) this.f27180b;
                kn0 kn0Var = ln0Var.f26061c;
                MessageObject E = kn0Var.E(i10);
                ln0 ln0Var2 = kn0Var.f25800c;
                if (E == null) {
                    return false;
                }
                if (!ln0Var.I.g()) {
                    ln0Var.I.a();
                    kn0Var.q(0, ln0Var2.f26064r);
                }
                if (ln0Var.I.g()) {
                    ln0Var.I.e(E, view, 0);
                    if (!ln0Var.I.g()) {
                        kn0Var.q(0, ln0Var2.f26064r);
                    }
                    org.telegram.ui.l10 l10Var = ln0Var.J;
                    int id2 = E.getId();
                    l10Var.f35294a = E.getDialogId();
                    l10Var.f35295b = id2;
                }
                return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        b81 b81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        c81 c81Var = (c81) this.f27180b;
        ImageReceiver imageReceiver2 = c81Var.Q;
        if (z10) {
            if (c81Var.N != null || c81Var.f23198d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.au0 au0Var = c81Var.N;
                if (au0Var != null) {
                    ArrayList arrayList = au0Var.v;
                    int indexOf = arrayList.indexOf(au0Var.c((int) c81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = au0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.au0 au0Var2 = c81Var.N;
                    int i12 = (int) c81Var.O;
                    int videoDuration2 = au0Var2.getVideoDuration() / 1000;
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
                    c81Var.R = (int) ((min % 5) * bitmapWidth);
                    c81Var.S = (int) ((min / 5) * bitmapHeight);
                    c81Var.T = (int) bitmapWidth;
                    c81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < c81Var.f23198d0.size()) {
                            b81Var = (b81) c81Var.f23198d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = b81Var.f22879a;
                            }
                            if (i13 == c81Var.f23198d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((b81) c81Var.f23198d0.get(i13 + 1)).f22879a;
                            }
                            double d11 = c81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            b81Var = null;
                            break;
                        }
                    }
                    if (b81Var != null) {
                        c81Var.R = b81Var.f22880b;
                        c81Var.S = b81Var.f22881c;
                        c81Var.T = c81Var.f23195b0;
                        c81Var.U = c81Var.f23197c0;
                    } else {
                        return;
                    }
                }
                c81Var.P = true;
                float f7 = c81Var.T / c81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = c81Var.getLayoutParams();
                if (c81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    c81Var.setVisibility(0);
                    c81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        ((ne0) this.f27180b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27179a) {
            case 2:
                MediaDataController.getInstance(((ez) this.f27180b).v.f26818c1).clearRecentStickers();
                return;
            case 4:
                ((zm) this.f27180b).run();
                return;
            case 5:
                ((r20) this.f27180b).n();
                return;
            case 7:
                p70.Q((p70) this.f27180b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f27180b);
                return;
            case 24:
                ky0 ky0Var = (ky0) this.f27180b;
                ky0Var.e.presentFragment(new StickersActivity(ky0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((my0) this.f27180b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        dw0 dw0Var = (dw0) this.f27180b;
        dw0Var.f23772w = i10;
        dw0Var.f23773x = i11;
        ci.bb bbVar = dw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((y51) this.f27180b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public void l(int i10, int i11) {
        wf0 wf0Var = ((vf0) this.f27180b).d;
        if (i10 == wf0Var.f29904b) {
            wf0Var.G = i11;
        } else if (i10 == wf0Var.f29923r) {
            wf0Var.P = i11;
        } else if (i10 == wf0Var.d) {
            wf0Var.I = i11;
        } else if (i10 == wf0Var.f29906c) {
            wf0Var.H = i11;
        } else if (i10 == wf0Var.f29910f) {
            wf0Var.J = i11;
        } else if (i10 == wf0Var.e) {
            wf0Var.K = i11;
        } else if (i10 == wf0Var.v) {
            wf0Var.R = i11;
        } else if (i10 == wf0Var.f29925s) {
            wf0Var.Q = i11;
        } else if (i10 == wf0Var.f29930w) {
            wf0Var.S = i11;
        } else if (i10 == wf0Var.f29932x) {
            wf0Var.U = i11;
        } else if (i10 == wf0Var.h) {
            wf0Var.L = i11;
        } else if (i10 == wf0Var.f29918n) {
            wf0Var.M = i11;
        }
        yz yzVar = wf0Var.f29917l0;
        if (yzVar != null) {
            yzVar.e(true, false, false);
        }
        wf0Var.g();
    }

    @Override
    public void m(int i10) {
        vv.P((vv) this.f27180b, i10);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        pc0 pc0Var = (pc0) obj;
        return Float.valueOf(((o1.j) this.f27180b).f15548a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f27179a) {
            case 20:
                final mv0 mv0Var = ((gs0) this.f27180b).d;
                mv0.r(mv0Var).r(mv0Var.f26424j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        mv0 mv0Var2 = mv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = mv0.f26397d2;
                                AndroidUtilities.runOnUIThread(new zn0(6, mv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = mv0.f26397d2;
                                AndroidUtilities.runOnUIThread(new zn0(6, mv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final mv0 mv0Var2 = ((qt0) this.f27180b).d;
                mv0.r(mv0Var2).r(mv0Var2.f26424j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        mv0 mv0Var22 = mv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = mv0.f26397d2;
                                AndroidUtilities.runOnUIThread(new zn0(6, mv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = mv0.f26397d2;
                                AndroidUtilities.runOnUIThread(new zn0(6, mv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                w41 w41Var = (w41) this.f27180b;
                w41Var.f29822e0 = str;
                w41Var.f29827j0.N(true);
                return;
        }
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        oo0 oo0Var = (oo0) this.f27180b;
        int i12 = oo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = oo0Var.f27159z0;
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(l10Var));
        }
        hashMap.clear();
        oo0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, qyVar)) {
                    return true;
                }
            }
            org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i13);
            qyVar.presentFragment(wnVar, true);
            wnVar.Ab(arrayList2);
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
        qyVar.finishFragment();
        return true;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void F(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n() {
    }
}
